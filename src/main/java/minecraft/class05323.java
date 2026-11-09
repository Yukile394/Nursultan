package minecraft;

import Nursultan.class10507;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.nio.file.AccessDeniedException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class class05323 implements AutoCloseable {
   public static final String N = "session.lock";
   private final FileChannel y;
   private final FileLock L;
   private static final ByteBuffer u;

   private class05323(FileChannel var1, FileLock var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   static {
      byte[] abyte = "☃".getBytes(StandardCharsets.UTF_8);
      u = ByteBuffer.allocateDirect(abyte.length);
      u.put(abyte);
      u.flip();
   }

   @Override
   public void close() throws IOException {
      try {
         if (this.L.isValid()) {
            this.L.release();
         }
      } finally {
         if (this.y.isOpen()) {
            this.y.close();
         }
      }
   }

   public static boolean y(Path var0) throws IOException {
      Path path = var0.resolve("session.lock");

      try {
         boolean flag;
         try (
            FileChannel filechannel = FileChannel.open(path, StandardOpenOption.WRITE);
            FileLock filelock = filechannel.tryLock();
         ) {
            flag = filelock == null;
         }

         return flag;
      } catch (AccessDeniedException accessdeniedexception) {
         return true;
      } catch (NoSuchFileException nosuchfileexception) {
         return false;
      }
   }

   public static class05323 N(Path var0) throws IOException {
      Path path = var0.resolve("session.lock");
      class06290.L(var0);
      FileChannel filechannel = FileChannel.open(path, StandardOpenOption.CREATE, StandardOpenOption.WRITE);

      try {
         filechannel.write(u.duplicate());
         filechannel.force(true);
         FileLock filelock = filechannel.tryLock();
         if (filelock == null) {
            throw class10507.N(path);
         } else {
            return new class05323(filechannel, filelock);
         }
      } catch (IOException ioexception1) {
         try {
            filechannel.close();
         } catch (IOException ioexception) {
            ioexception1.addSuppressed(ioexception);
         }

         throw ioexception1;
      }
   }

   public boolean N() {
      return this.L.isValid();
   }
}
