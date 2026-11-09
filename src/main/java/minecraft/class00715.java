package minecraft;

import org.jspecify.annotations.Nullable;

public class class00715 extends class00692 {
   private static final class01328 y = class01328.N().u();
   @Nullable
   private class00143 L;
   @Nullable
   private class06889 u;

   @Override
   public void L() {
      this.L = null;
      this.u = null;
   }

   public class00715(class00690 var1) {
      super(var1);
   }

   @Override
   public class00702<class00715> B() {
      return class00702.L;
   }

   private void Z() {
      if (this.L != null && !this.L.L()) {
         class07209 class07209 = this.L.M();
         this.L.N();
         double d0 = class07209.method_10263();
         double d1 = class07209.method_10260();

         double d2;
         do {
            d2 = class07209.method_10264() + this.N.method_59922().z() * 20.0F;
         } while (d2 < class07209.method_10264());

         this.u = new class06889(d0, d2, d1);
      }
   }

   private void y(class04782 var1) {
      if (this.L == null || this.L.L()) {
         int i = this.N.Z();
         class07209 class07209 = var1.N(class07830.field_13203, class06403.N(this.N.M()));
         class08036 class08036 = var1.N(y, this.N, class07209.method_10263(), class07209.method_10264(), class07209.method_10260());
         int j;
         if (class08036 != null) {
            class06889 class06889 = new class06889(class08036.method_23317(), 0.0, class08036.method_23321()).u();
            j = this.N.N(-class06889.M * 40.0, 105.0, -class06889.Z * 40.0);
         } else {
            j = this.N.N(40.0, class07209.method_10264(), 0.0);
         }

         class01763 class01763 = new class01763(class07209.method_10263(), class07209.method_10264(), class07209.method_10260());
         this.L = this.N.N(i, j, class01763);
         if (this.L != null) {
            this.L.N();
         }
      }

      this.Z();
      if (this.L != null && this.L.L()) {
         this.N.W().N(class00702.u);
      }
   }

   @Override
   public void N(class04782 var1) {
      double d0 = this.u == null ? 0.0 : this.u.L(this.N.method_23317(), this.N.method_23318(), this.N.method_23321());
      if (d0 < 100.0 || d0 > 22500.0 || this.N.field_5976 || this.N.field_5992) {
         this.y(var1);
      }
   }

   @Nullable
   @Override
   public class06889 R() {
      return this.u;
   }
}
