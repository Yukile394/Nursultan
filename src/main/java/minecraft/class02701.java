package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Optional;

public class class02701 {
   private final Builder<class02717> N = ImmutableList.builder();

   public class02701() {
      super();
   }

   public class02701 N(class02717 var1) {
      this.N.add(var1);
      return this;
   }

   public class02701 N(class02708 var1) {
      this.N.addAll(var1.y());
      return this;
   }

   public class02708 N() {
      return new class02708(this.N.build());
   }

   public class02701 N(class03556<class00412> var1, class06563 var2) {
      return this.N(new class02717(var1, var2));
   }

   @Deprecated
   public class02701 N(class02055<class00412> var1, class05946<class00412> var2, class06563 var3) {
      Optional optional = var1.N(var2);
      if (optional.isEmpty()) {
         class02708.y.warn("Unable to find banner pattern with id: '{}'", var2.N());
         return this;
      } else {
         return this.N((class03556<class00412>)optional.get(), var3);
      }
   }
}
