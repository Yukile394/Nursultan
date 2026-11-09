package minecraft;

import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.ZonedDateTime;
import java.util.Optional;
import org.slf4j.Logger;

public class class07842 {
   private static final Logger y = LogUtils.getLogger();
   private final File L;
   protected final DataFixer N;

   public class07842(class04785 var1, DataFixer var2) {
      super();
      this.N = var2;
      this.L = var1.N(class05071.L).toFile();
      this.L.mkdirs();
   }

   private Optional<class07001> y(class08774 var1, String var2) {
      File file1 = new File(this.L, var1.N() + var2);
      if (file1.exists() && file1.isFile()) {
         try {
            return Optional.of(class07742.N(file1.toPath(), class07726.L()));
         } catch (Exception exception) {
            y.warn("Failed to load player data for {}", var1.y());
         }
      }

      return Optional.empty();
   }

   public Optional<class07001> N(class08774 var1) {
      Optional<class07001> optional = this.y(var1, ".dat");
      if (optional.isEmpty()) {
         this.N(var1, ".dat");
      }

      return optional.or(() -> this.y(var1, ".dat_old")).map(var1x -> {
         int i = class07717.R(var1x);
         return class05715.field_19213.N(this.N, var1x, i);
      });
   }

   public void N(class08036 var1) {
      try (class04495 class04495 = new class04495(var1.method_71370(), y)) {
         class08303 class08303 = class08303.N(class04495, var1.method_56673());
         var1.method_5647(class08303);
         Path path = this.L.toPath();
         Path path1 = Files.createTempFile(path, var1.method_5845() + "-", ".dat");
         class07742.N(class08303.y(), path1);
         Path path2 = path.resolve(var1.method_5845() + ".dat");
         Path path3 = path.resolve(var1.method_5845() + ".dat_old");
         class07536.N(path2, path1, path3);
      } catch (Exception exception) {
         y.warn("Failed to save player data for {}", var1.method_74861());
      }
   }

   private void N(class08774 var1, String var2) {
      Path path = this.L.toPath();
      String s = var1.N().toString();
      Path path1 = path.resolve(s + var2);
      Path path2 = path.resolve(s + "_corrupted_" + ZonedDateTime.now().format(class03804.N) + var2);
      if (Files.isRegularFile(path1)) {
         try {
            Files.copy(path1, path2, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);
         } catch (Exception exception) {
            y.warn("Failed to copy the player.dat file for {}", var1.y(), exception);
         }
      }
   }
}
