package minecraft;

import com.google.common.base.Joiner;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult.Error;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.NotDirectoryException;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Stream;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class01592 extends class01598 {
   private static final Logger N = LogUtils.getLogger();
   private static final Joiner u = Joiner.on("/");
   private final Path i;

   public class01592(class02267 var1, Path var2) {
      super(var1);
      this.i = var2;
   }

   @Override
   public void close() {
   }

   @Nullable
   private static class03652<InputStream> y(Path var0) {
      return Files.exists(var0) && N(var0) ? class03652.N(var0) : null;
   }

   private static boolean N(Path var0, BasicFileAttributes var1) {
      return !class07529.ND ? var1.isRegularFile() : var1.isRegularFile() && !StringUtils.equalsIgnoreCase(var0.getFileName().toString(), ".ds_store");
   }

   public static boolean N(Path var0) {
      if (!class07529.Ni) {
         return true;
      } else if (var0.getFileSystem() != FileSystems.getDefault()) {
         return true;
      } else {
         try {
            return var0.toRealPath().endsWith(var0);
         } catch (IOException ioexception) {
            N.warn("Failed to resolve real path for {}", var0, ioexception);
            return false;
         }
      }
   }

   public static void N(String var0, Path var1, List<String> var2, class01593 var3) {
      Path path = class06290.N(var1, var2);

      try (Stream<Path> stream = Files.find(path, Integer.MAX_VALUE, class01592::N)) {
         stream.forEach(var3x -> {
            String s = u.join(var1.relativize(var3x));
            class01894 class01894 = class01894.y(var0, s);
            if (class01894 == null) {
               class07536.y(String.format(Locale.ROOT, "Invalid path in pack: %s:%s, ignoring", var0, s));
            } else {
               var3.accept(class01894, class03652.N(var3x));
            }
         });
      } catch (NotDirectoryException | NoSuchFileException nosuchfileexception) {
      } catch (IOException ioexception) {
         N.error("Failed to list path {}", path, ioexception);
      }
   }

   @Nullable
   public static class03652<InputStream> N(class01894 var0, Path var1) {
      return (class03652<InputStream>)class06290.i(var0.N()).mapOrElse(var1x -> y(class06290.N(var1, var1x)), var1x -> {
         N.error("Invalid path {}: {}", var0, var1x.message());
         return null;
      });
   }

   @Nullable
   @Override
   public class03652<InputStream> method_14410(String... var1) {
      class06290.N(var1);
      Path path = class06290.N(this.i, List.of(var1));
      return Files.exists(path) ? class03652.N(path) : null;
   }

   @Override
   public Set<String> method_14406(class01603 var1) {
      HashSet hashset = Sets.newHashSet();
      Path path = this.i.resolve(var1.N());

      try (DirectoryStream<Path> directorystream = Files.newDirectoryStream(path)) {
         for (Path path1 : directorystream) {
            String s = path1.getFileName().toString();
            if (class01894.z(s)) {
               hashset.add(s);
            } else {
               N.warn("Non [a-z0-9_.-] character in namespace {} in pack {}, ignoring", s, this.i);
            }
         }
      } catch (NotDirectoryException | NoSuchFileException nosuchfileexception) {
      } catch (IOException ioexception) {
         N.error("Failed to list path {}", path, ioexception);
      }

      return hashset;
   }

   @Nullable
   @Override
   public class03652<InputStream> method_14405(class01603 var1, class01894 var2) {
      Path path = this.i.resolve(var1.N()).resolve(var2.y());
      return N(var2, path);
   }

   @Override
   public void method_14408(class01603 var1, String var2, String var3, class01593 var4) {
      class06290.i(var3).ifSuccess(var4x -> {
         Path path = this.i.resolve(var1.N()).resolve(var2);
         N(var2, path, var4x, var4);
      }).ifError(var1x -> N.error("Invalid path {}: {}", var3, var1x.message()));
   }
}
