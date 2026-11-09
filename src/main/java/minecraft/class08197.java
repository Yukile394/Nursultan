package minecraft;

import Nursultan.class10882;
import com.mojang.serialization.Codec;

public record class08197(class06584 convertInto) {
   public static final Codec<class08197> N = class06584.y.xmap(class08197::new, class08197::N);
   public static final class02362<class04247, class08197> y = class02362.N(class06584.z, class08197::N, class08197::new);

   public class08197(class06584 convertInto) {
      this.convertInto = convertInto;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         class08197 class08197 = (class08197)var1;
         return class06584.N(this.convertInto, class08197.convertInto);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return class06584.y(this.convertInto);
   }

   public class06584 N() {
      return this.convertInto;
   }

   public class06584 N(class06584 var1, int var2, boolean var3, class10882 var4) {
      if (var3) {
         return var1;
      } else if (var1.c() >= var2) {
         return var1;
      } else {
         class06584 class06584 = this.convertInto.t();
         if (var1.R()) {
            return class06584;
         } else {
            var4.apply(class06584);
            return var1;
         }
      }
   }
}
