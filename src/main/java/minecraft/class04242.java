package minecraft;

import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Stream;
import java.util.zip.GZIPOutputStream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class04242 {
   static final Logger N = LogUtils.getLogger();
   private static final int y = 4096;
   private static final String L = ".gz";
   private final Path u;
   private final String i;

   private class04242(Path var1, String var2) {
      super();
      this.u = var1;
      this.i = var2;
   }

   private static void N(ReadableByteChannel var0, Path var1) throws IOException {
      try (GZIPOutputStream gzipoutputstream = new GZIPOutputStream(Files.newOutputStream(var1))) {
         byte[] abyte = new byte[4096];
         ByteBuffer bytebuffer = ByteBuffer.wrap(abyte);

         while (var0.read(bytebuffer) >= 0) {
            bytebuffer.flip();
            gzipoutputstream.write(abyte, 0, bytebuffer.limit());
            bytebuffer.clear();
         }
      }
   }

   public class04209 N(LocalDate var1) throws IOException {
      int ix = 1;
      Set set = this.N().L();

      class04215 class04215;
      do {
         class04215 = new class04215(var1, ix++);
      } while (set.contains(class04215));

      class04209 class04209 = new class04209(this.u.resolve(class04215.y(this.i)), class04215);
      Files.createFile(class04209.L());
      return class04209;
   }

   static void N(Path var0, Path var1) throws IOException {
      if (Files.exists(var1)) {
         throw new IOException("Compressed target file already exists: " + var1);
      } else {
         try (FileChannel filechannel = FileChannel.open(var0, StandardOpenOption.WRITE, StandardOpenOption.READ)) {
            FileLock filelock = filechannel.tryLock();
            if (filelock == null) {
               throw new IOException("Raw log file is already locked, cannot compress: " + var0);
            }

            N(filechannel, var1);
            filechannel.truncate(0L);
         }

         Files.delete(var0);
      }
   }

   public static class04242 N(Path var0, String var1) throws IOException {
      Files.createDirectories(var0);
      return new class04242(var0, var1);
   }

   @Nullable
   private class04200 N(Path var1) {
      String s = var1.getFileName().toString();
      int ix = s.indexOf(46);
      if (ix == -1) {
         return null;
      } else {
         class04215 class04215 = class04215.N(s.substring(0, ix));
         if (class04215 != null) {
            String s1 = s.substring(ix);
            if (s1.equals(this.i)) {
               return new class04209(var1, class04215);
            }

            if (s1.equals(this.i + ".gz")) {
               return new class04213(var1, class04215);
            }
         }

         return null;
      }
   }

   public class04231 N() throws IOException {
      class04231 class04231;
      try (Stream stream = Files.list(this.u)) {
         class04231 = new class04231(stream.filter(var0 -> Files.isRegularFile(var0)).map(this::N).filter(Objects::nonNull).toList());
      }

      return class04231;
   }
}
