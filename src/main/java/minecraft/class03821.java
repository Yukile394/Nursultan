package minecraft;

import java.nio.file.Path;
import java.util.UUID;

public record class03821(UUID id, Path path) {
   public class03821(UUID id, Path path) {
      super();
      this.id = id;
      this.path = path;
   }

   public Path y() {
      return this.path;
   }

   public UUID N() {
      return this.id;
   }
}
