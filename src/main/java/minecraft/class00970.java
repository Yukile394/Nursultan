package minecraft;

import java.util.List;
import java.util.Optional;

record class00970(class01894 id, Optional<List<class01894>> sprites) {
   class00970(class01894 id, Optional<List<class01894>> sprites) {
      super();
      this.id = id;
      this.sprites = sprites;
   }

   public Optional<List<class01894>> y() {
      return this.sprites;
   }

   public class01894 N() {
      return this.id;
   }
}
