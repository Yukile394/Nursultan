package minecraft;

import java.nio.file.Path;
import java.util.Comparator;

record class03835(Path path, int removalPriority) {
   public static final Comparator<class03835> L = Comparator.comparing(class03835::y).reversed();

   class03835(Path path, int removalPriority) {
      this.path = path;
      this.removalPriority = removalPriority;
   }

   public int y() {
      return this.removalPriority;
   }

   public Path N() {
      return this.path;
   }
}
