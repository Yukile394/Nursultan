package minecraft;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import org.jspecify.annotations.Nullable;

class class01273 implements AutoCloseable {
   private final WatchService N;
   private final Path y;

   public class01273(Path var1) throws IOException {
      super();
      this.y = var1;
      this.N = var1.getFileSystem().newWatchService();

      try {
         this.y(var1);

         try (DirectoryStream<Path> directorystream = Files.newDirectoryStream(var1)) {
            for (Path path : directorystream) {
               if (Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS)) {
                  this.y(path);
               }
            }
         }
      } catch (Exception exception) {
         this.N.close();
         throw exception;
      }
   }

   @Override
   public void close() throws IOException {
      this.N.close();
   }

   private void y(Path var1) throws IOException {
      var1.register(this.N, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY);
   }

   public boolean N() throws IOException {
      boolean flag = false;

      WatchKey watchkey;
      while ((watchkey = this.N.poll()) != null) {
         for (WatchEvent<?> watchevent : watchkey.pollEvents()) {
            flag = true;
            if (watchkey.watchable() == this.y && watchevent.kind() == StandardWatchEventKinds.ENTRY_CREATE) {
               Path path = this.y.resolve((Path)watchevent.context());
               if (Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS)) {
                  this.y(path);
               }
            }
         }

         watchkey.reset();
      }

      return flag;
   }

   @Nullable
   public static class01273 N(Path var0) {
      try {
         return new class01273(var0);
      } catch (IOException ioexception) {
         class01270.N.warn("Failed to initialize pack directory {} monitoring", var0, ioexception);
         return null;
      }
   }
}
