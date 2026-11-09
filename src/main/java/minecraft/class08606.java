package minecraft;

import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import org.slf4j.Logger;

public class class08606 {
   private static final Logger N = LogUtils.getLogger();

   public class08606() {
      super();
   }

   public static Path N(URI var0) throws IOException {
      try {
         return Paths.get(var0);
      } catch (FileSystemNotFoundException filesystemnotfoundexception) {
      } catch (Throwable throwable) {
         N.warn("Unable to get path for: {}", var0, throwable);
      }

      try {
         FileSystems.newFileSystem(var0, Collections.emptyMap());
      } catch (FileSystemAlreadyExistsException filesystemalreadyexistsexception) {
      }

      return Paths.get(var0);
   }
}
