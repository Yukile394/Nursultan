package minecraft;

import com.google.common.collect.Sets;
import java.util.Set;

public class class06943 {
   private final Set<class07491<?>> N = Sets.newIdentityHashSet();
   private final Set<class07491<?>> y = Sets.newIdentityHashSet();

   public class06943() {
      super();
   }

   public class06943 y(class07491<?> var1) {
      if (this.N.contains(var1)) {
         throw new IllegalArgumentException("Parameter " + var1.N() + " is already required");
      } else {
         this.y.add(var1);
         return this;
      }
   }

   public class06943 N(class07491<?> var1) {
      if (this.y.contains(var1)) {
         throw new IllegalArgumentException("Parameter " + var1.N() + " is already optional");
      } else {
         this.N.add(var1);
         return this;
      }
   }

   public class06929 N() {
      return new class06929(this.N, this.y);
   }
}
