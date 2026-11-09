package minecraft;

import java.nio.file.Path;

public record class04168(Path link, Path target) {
   public class04168(Path link, Path target) {
      this.link = link;
      this.target = target;
   }

   public Path y() {
      return this.target;
   }

   public Path N() {
      return this.link;
   }
}
