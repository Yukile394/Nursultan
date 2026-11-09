package minecraft;

import org.jspecify.annotations.Nullable;

public class class00694 extends class00692 {
   private boolean y;
   @Nullable
   private class00143 L;
   @Nullable
   private class06889 u;

   @Override
   public void L() {
      this.y = true;
      this.L = null;
      this.u = null;
   }

   public class00694(class00690 var1) {
      super(var1);
   }

   @Override
   public class00702<class00694> B() {
      return class00702.i;
   }

   private void Z() {
      int i = this.N.Z();
      class06889 class06889 = this.N.u(1.0F);
      int j = this.N.N(-class06889.M * 40.0, 105.0, -class06889.Z * 40.0);
      if (this.N.m() != null && this.N.m().i() > 0) {
         j %= 12;
         if (j < 0) {
            j += 12;
         }
      } else {
         j -= 12;
         j &= 7;
         j += 12;
      }

      this.L = this.N.N(i, j, null);
      this.z();
   }

   private void z() {
      if (this.L != null) {
         this.L.N();
         if (!this.L.L()) {
            class07209 class07209 = this.L.M();
            this.L.N();

            double d0;
            do {
               d0 = class07209.method_10264() + this.N.method_59922().z() * 20.0F;
            } while (d0 < class07209.method_10264());

            this.u = new class06889(class07209.method_10263(), d0, class07209.method_10260());
         }
      }
   }

   @Override
   public void N(class04782 var1) {
      if (!this.y && this.L != null) {
         if (!var1.N(class07830.field_13203, class06403.N(this.N.M())).method_19769(this.N.method_73189(), 10.0)) {
            this.N.W().N(class00702.N);
         }
      } else {
         this.y = false;
         this.Z();
      }
   }

   @Nullable
   @Override
   public class06889 R() {
      return this.u;
   }
}
