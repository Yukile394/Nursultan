package minecraft;

import java.util.EnumSet;
import org.jspecify.annotations.Nullable;

public class class06135 extends class07473 {
   private static final int N = 10;
   private final class07475 y;
   private final int L;
   @Nullable
   private class07209 u;

   private void M() {
      class06069 class06069 = this.y.method_59922();
      class07209 class07209 = this.y
         .method_73183()
         .N(class07830.field_13203, this.y.method_24515().method_10069(-8 + class06069.y(16), 0, -8 + class06069.y(16)));
      this.y.f().N((double)class07209.method_10263(), (double)class07209.method_10264(), (double)class07209.method_10260(), 1.0);
   }

   public class06135(class07475 var1, int var2) {
      super();
      this.y = var1;
      this.L = y(var2);
      this.N_71(EnumSet.of(class07430.field_18405));
   }

   @Override
   public void i() {
      if (this.u != null) {
         class07623 class07623 = this.y.f();
         if (class07623.U() && !this.u.method_19769(this.y.method_73189(), 10.0)) {
            class06889 class06889x = class06889.L(this.u);
            class06889 class06889x = this.y.method_73189();
            class06889x = class06889x.u(class06889x).L(0.4).i(class06889x);
            class07209 class07209 = class07209.method_49638(class06889x.u(class06889x).u().L(10.0).i(class06889x));
            class07209 = this.y.method_73183().N(class07830.field_13203, class07209);
            if (!class07623.N((double)class07209.method_10263(), (double)class07209.method_10264(), (double)class07209.method_10260(), 1.0)) {
               this.M();
            }
         }
      }
   }

   @Override
   public boolean y() {
      return this.u != null && !this.y.f().U() && this.y.f().M().equals(this.u);
   }

   @Override
   public boolean N() {
      if (this.y.method_42148()) {
         return false;
      } else if (this.y.method_73183().method_8530()) {
         return false;
      } else if (this.y.method_59922().y(this.L) != 0) {
         return false;
      } else {
         class04782 class04782 = (class04782)this.y.method_73183();
         class07209 class07209 = this.y.method_24515();
         if (!class04782.method_19497(class07209, 6)) {
            return false;
         } else {
            class06889 class06889 = class05456.N(this.y, 15, 7, var1x -> -class04782.method_19498(class01296.N(var1x)));
            this.u = class06889 == null ? null : class07209.method_49638(class06889);
            return this.u != null;
         }
      }
   }
}
