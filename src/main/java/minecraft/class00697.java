package minecraft;

import org.jspecify.annotations.Nullable;

public class class00697 extends class00692 {
   private static final class01328 y = class01328.N().u();
   @Nullable
   private class00143 L;
   @Nullable
   private class06889 u;
   private boolean i;

   @Override
   public void L() {
      this.L = null;
      this.u = null;
   }

   public class00697(class00690 var1) {
      super(var1);
   }

   @Override
   public class00702<class00697> B() {
      return class00702.N;
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
      if (this.L != null && this.L.L()) {
         class07209 class07209 = var1.N(class07830.field_13203, class06403.N(this.N.M()));
         int ix = this.N.m() == null ? 0 : this.N.m().i();
         if (this.N.method_59922().y(ix + 3) == 0) {
            this.N.W().N(class00702.L);
            return;
         }

         class08036 class08036 = var1.N(y, this.N, class07209.method_10263(), class07209.method_10264(), class07209.method_10260());
         double d0;
         if (class08036 != null) {
            d0 = class07209.method_19770(class08036.method_73189()) / 512.0;
         } else {
            d0 = 64.0;
         }

         if (class08036 != null && (this.N.method_59922().y((int)(d0 + 2.0)) == 0 || this.N.method_59922().y(ix + 2) == 0)) {
            this.N(class08036);
            return;
         }
      }

      if (this.L == null || this.L.L()) {
         int j = this.N.Z();
         int k = j;
         if (this.N.method_59922().y(8) == 0) {
            this.i = !this.i;
            k = j + 6;
         }

         if (this.i) {
            k++;
         } else {
            k--;
         }

         if (this.N.m() != null && this.N.m().i() >= 0) {
            k %= 12;
            if (k < 0) {
               k += 12;
            }
         } else {
            k -= 12;
            k &= 7;
            k += 12;
         }

         this.L = this.N.N(j, k, null);
         if (this.L != null) {
            this.L.N();
         }
      }

      this.Z();
   }

   @Override
   public void N(class00676 var1, class07209 var2, class07072 var3, @Nullable class08036 var4) {
      if (var4 != null && this.N.method_18395(var4)) {
         this.N(var4);
      }
   }

   @Override
   public void N(class04782 var1) {
      double d0 = this.u == null ? 0.0 : this.u.L(this.N.method_23317(), this.N.method_23318(), this.N.method_23321());
      if (d0 < 100.0 || d0 > 22500.0 || this.N.field_5976 || this.N.field_5992) {
         this.y(var1);
      }
   }

   private void N(class08036 var1) {
      this.N.W().N(class00702.y);
      this.N.W().y(class00702.y).N(var1);
   }

   @Nullable
   @Override
   public class06889 R() {
      return this.u;
   }
}
