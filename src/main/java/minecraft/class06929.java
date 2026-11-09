package minecraft;

import com.google.common.base.Joiner;
import com.google.common.collect.Sets;
import java.util.Set;

public class class06929 {
   private final Set<class07491<?>> N;
   private final Set<class07491<?>> y;

   class06929(Set<class07491<?>> var1, Set<class07491<?>> var2) {
      super();
      this.N = Set.copyOf(var1);
      this.y = Set.copyOf(Sets.union(var1, var2));
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.y.stream().map(var1 -> (this.N.contains(var1) ? "!" : "") + var1.N()).iterator()) + "]";
   }

   public Set<class07491<?>> y() {
      return this.y;
   }

   public Set<class07491<?>> N() {
      return this.N;
   }
}
