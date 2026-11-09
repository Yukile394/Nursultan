package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class class03423 implements Closeable {
   private static final Logger N = LogUtils.getLogger();
   private final Path y;
   private final Path L;
   private final FileSystem u;

   public class03423(Path var1) {
      super();
      this.y = var1;
      this.L = var1.resolveSibling(var1.getFileName().toString() + "_tmp");

      try {
         this.u = class07536.M.newFileSystem(this.L, ImmutableMap.of("create", "true"));
      } catch (IOException ioexception) {
         throw new UncheckedIOException(ioexception);
      }
   }

   @Override
   public void close() {
      try {
         this.u.close();
         Files.move(this.L, this.y);
         N.info("Compressed to {}", this.y);
      } catch (IOException ioexception) {
         throw new UncheckedIOException(ioexception);
      }
   }

   public void N(Path var1) {
      try {
         Path path = this.u.getPath(File.separator);
         if (Files.isRegularFile(var1)) {
            Path path3 = path.resolve(var1.getParent().relativize(var1).toString());
            Files.copy(path3, var1);
         } else {
            try (Stream<Path> stream = Files.find(var1, Integer.MAX_VALUE, (var0, var1x) -> var1x.isRegularFile())) {
               for (Path path1 : stream.collect(Collectors.toList())) {
                  Path path2 = path.resolve(var1.relativize(path1).toString());
                  Files.createDirectories(path2.getParent());
                  Files.copy(path1, path2);
               }
            }
         }
      } catch (IOException ioexception) {
         throw new UncheckedIOException(ioexception);
      }
   }

   public void N(Path var1, File var2) {
      try {
         Path path = this.u.getPath(File.separator);
         Path path1 = path.resolve(var1.toString());
         Files.createDirectories(path1.getParent());
         Files.copy(var2.toPath(), path1);
      } catch (IOException ioexception) {
         throw new UncheckedIOException(ioexception);
      }
   }

   public void N(Path var1, String var2) {
      try {
         Path path = this.u.getPath(File.separator);
         Path path1 = path.resolve(var1.toString());
         Files.createDirectories(path1.getParent());
         Files.write(path1, var2.getBytes(StandardCharsets.UTF_8));
      } catch (IOException ioexception) {
         throw new UncheckedIOException(ioexception);
      }
   }
}
