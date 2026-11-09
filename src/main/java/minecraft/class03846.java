package minecraft;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.List;

class class03846 extends SimpleFileVisitor<Path> {
   class03846(Path var1, List var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public FileVisitResult visitFile(Path var1, BasicFileAttributes var2) {
      if (var2.isRegularFile() && !var1.getParent().equals(this.N)) {
         FileTime filetime = var2.lastModifiedTime();
         this.y.add(new class03823(var1, filetime));
      }

      return FileVisitResult.CONTINUE;
   }
}
