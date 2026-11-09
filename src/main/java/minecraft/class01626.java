package minecraft;

import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class class01626 implements class01057 {
   static final Logger N = LogUtils.getLogger();
   private static final class02268 L = new class02268(false, class01090.field_14280, false);
   private final Path u;
   private final class01603 i;
   public final class01283 y;
   private final class04173 R;

   public class01626(Path var1, class01603 var2, class01283 var3, class04173 var4) {
      super();
      this.u = var1;
      this.i = var2;
      this.y = var3;
      this.R = var4;
   }

   private class02267 y(Path var1) {
      String s = N(var1);
      return new class02267("file/" + s, class00392.y(s), this.y, Optional.empty());
   }

   public static void N(Path var0, class04173 var1, BiConsumer<Path, class01061> var2) throws IOException {
      class01586 class01586 = new class01586(var1);

      try (DirectoryStream<Path> directorystream = Files.newDirectoryStream(var0)) {
         for (Path path : directorystream) {
            try {
               ArrayList arraylist = new ArrayList();
               class01061 class01061 = class01586.N(path, arraylist);
               if (!arraylist.isEmpty()) {
                  N.warn("Ignoring potential pack entry: {}", class04151.N(path, arraylist));
               } else if (class01061 != null) {
                  var2.accept(path, class01061);
               } else {
                  N.info("Found non-pack entry '{}', ignoring", path);
               }
            } catch (IOException ioexception) {
               N.warn("Failed to read properties of '{}', ignoring", path, ioexception);
            }
         }
      }
   }

   private static String N(Path var0) {
      return var0.getFileName().toString();
   }

   @Override
   public void method_14453(Consumer<class01055> var1) {
      try {
         class06290.L(this.u);
         N(this.u, this.R, (var2, var3x) -> {
            class01055 class01055 = class01055.N(this.y(var2), var3x, this.i, L);
            if (class01055 != null) {
               var1.accept(class01055);
            }
         });
      } catch (IOException ioexception) {
         N.warn("Failed to list packs in {}", this.u, ioexception);
      }
   }
}
