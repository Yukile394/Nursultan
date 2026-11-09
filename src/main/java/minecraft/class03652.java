package minecraft;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

@FunctionalInterface
public interface class03652<T> {
   T get() throws IOException;

   static class03652<InputStream> N(ZipFile var0, ZipEntry var1) {
      return () -> var0.getInputStream(var1);
   }

   static class03652<InputStream> N(Path var0) {
      return () -> Files.newInputStream(var0);
   }
}
