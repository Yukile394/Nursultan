package minecraft;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import org.jspecify.annotations.Nullable;

public class class01586 extends class04181<class01061> {
   public class01586(class04173 var1) {
      super(var1);
   }

   protected class01061 L(Path var1) {
      return new class01620(var1);
   }

   @Nullable
   protected class01061 u(Path var1) {
      FileSystem filesystem = var1.getFileSystem();
      if (filesystem != FileSystems.getDefault() && !(filesystem instanceof class02993)) {
         class01626.N.info("Can't open pack archive at {}", var1);
         return null;
      } else {
         return new class01613(var1);
      }
   }
}
