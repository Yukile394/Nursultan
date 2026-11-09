package minecraft;

import java.util.EnumSet;
import org.jspecify.annotations.Nullable;

public class class07436 extends class07473 {
   private final class07894 N;
   @Nullable
   private class08036 y;
   private final class04782 L;
   private final float u;
   private int i;
   private final class01328 R;

   @Override
   public void L() {
      this.N.N(true);
      this.i = this.N(40 + this.N.method_59922().y(40));
   }

   public class07436(class07894 var1, float var2) {
      super();
      this.N = var1;
      this.L = N(var1);
      this.u = var2;
      this.R = class01328.y().N(var2);
      this.N_71(EnumSet.of(class07430.field_18406));
   }

   @Override
   public void i() {
      this.N.p().N(this.y.method_23317(), this.y.method_23320(), this.y.method_23321(), 10.0F, this.N.Ni());
      this.i--;
   }

   @Override
   public void u() {
      this.N.N(false);
      this.y = null;
   }

   @Override
   public boolean y() {
      if (!this.y.method_5805()) {
         return false;
      } else {
         return this.N.method_5858(this.y) > this.u * this.u ? false : this.i > 0 && this.N(this.y);
      }
   }

   @Override
   public boolean N() {
      this.y = this.L.N(this.R, this.N);
      return this.y == null ? false : this.N(this.y);
   }

   private boolean N(class08036 var1) {
      for (class07050 class07050 : class07050.values()) {
         class06584 class06584 = var1.method_5998(class07050);
         if (class06584.N(class06570.vO) || this.N.N(class06584)) {
            return true;
         }
      }

      return false;
   }
}
