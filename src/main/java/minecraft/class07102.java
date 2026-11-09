package minecraft;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Set;
import org.apache.commons.lang3.mutable.MutableInt;

class class07102 extends SimpleFileVisitor<Path> {
   class07102(class07104 var1, MutableInt var2, Set var3, MutableInt var4) {
      super();
      this.u = var1;
      this.N = var2;
      this.y = var3;
      this.L = var4;
   }

   public FileVisitResult visitFile(Path var1, BasicFileAttributes var2) {
      if (this.u.y.contains(var1)) {
         return FileVisitResult.CONTINUE;
      } else {
         this.N.increment();
         if (this.y.contains(var1)) {
            return FileVisitResult.CONTINUE;
         } else {
            try {
               Files.delete(var1);
            } catch (IOException ioexception) {
               class07104.N.warn("Failed to delete file {}", var1, ioexception);
            }

            this.L.increment();
            return FileVisitResult.CONTINUE;
         }
      }
   }
}
