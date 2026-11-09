package minecraft;

import java.util.Set;

public record class02508(class02695 added, Set<class02477<?>> removed) {
   public static final class02508 N = new class02508(class02695.N, Set.of());

   public class02508(class02695 added, Set<class02477<?>> removed) {
      super();
      this.added = added;
      this.removed = removed;
   }

   public Set<class02477<?>> y() {
      return this.removed;
   }

   public class02695 N() {
      return this.added;
   }
}
