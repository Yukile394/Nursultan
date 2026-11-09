package minecraft;

import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.util.Comparator;

record class03823(Path path, FileTime modifiedTime) {
   public static final Comparator<class03823> y = Comparator.comparing(class03823::y).reversed();

   class03823(Path path, FileTime modifiedTime) {
      this.path = path;
      this.modifiedTime = modifiedTime;
   }

   public FileTime y() {
      return this.modifiedTime;
   }

   public Path N() {
      return this.path;
   }
}
