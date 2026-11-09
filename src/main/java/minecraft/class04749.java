package minecraft;

import java.util.Iterator;
import java.util.List;

public record class04749(List<class04779> levels) implements Iterable<class04779> {

   public class04749(List<class04779> levels) {
      super();
      this.levels = levels;
   }

   @Override
   public Iterator<class04779> iterator() {
      return this.levels.iterator();
   }

   public List<class04779> y() {
      return this.levels;
   }

   public boolean N() {
      return this.levels.isEmpty();
   }
}
