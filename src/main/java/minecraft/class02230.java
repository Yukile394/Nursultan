package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class class02230 {
   private final List<class02237> N = new ArrayList<>();

   public class02230() {
      super();
   }

   public class02238 N() {
      return new class02238(ImmutableList.copyOf(this.N));
   }

   public class02230 N(class00549 var1, UnaryOperator<class02225> var2) {
      class02225 class02225;
      if (this.N.isEmpty()) {
         class02225 = new class02225(var1);
      } else {
         class02225 = new class02225(var1, this.N.getLast());
      }

      this.N.add(var2.apply(class02225).N());
      return this;
   }
}
