package minecraft;

import com.mojang.logging.LogUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class00686 extends class00692 {
   private static final Logger y = LogUtils.getLogger();
   private static final int L = 5;
   private int u;
   @Nullable
   private class00143 i;
   @Nullable
   private class06889 R;
   @Nullable
   private class07438 M;
   private boolean B;

   @Override
   public void L() {
      this.u = 0;
      this.R = null;
      this.i = null;
      this.M = null;
   }

   public class00686(class00690 var1) {
      super(var1);
   }

   @Override
   public class00702<class00686> B() {
      return class00702.y;
   }

   private void Z() {
      if (this.i == null || this.i.L()) {
         int ix = this.N.Z();
         int j = ix;
         if (this.N.method_59922().y(8) == 0) {
            this.B = !this.B;
            j = ix + 6;
         }

         if (this.B) {
            j++;
         } else {
            j--;
         }

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

         this.i = this.N.N(ix, j, null);
         if (this.i != null) {
            this.i.N();
         }
      }

      this.z();
   }

   private void z() {
      if (this.i != null && !this.i.L()) {
         class07209 class07209 = this.i.M();
         this.i.N();
         double d0 = class07209.method_10263();
         double d2 = class07209.method_10260();

         double d1;
         do {
            d1 = class07209.method_10264() + this.N.method_59922().z() * 20.0F;
         } while (d1 < class07209.method_10264());

         this.R = new class06889(d0, d1, d2);
      }
   }

   public void N(class07438 var1) {
      this.M = var1;
      int ix = this.N.Z();
      int j = this.N.N(this.M.method_23317(), this.M.method_23318(), this.M.method_23321());
      int k = this.M.method_31477();
      int l = this.M.method_31479();
      double d0 = k - this.N.method_23317();
      double d1 = l - this.N.method_23321();
      double d2 = Math.sqrt(d0 * d0 + d1 * d1);
      double d3 = Math.min(0.4F + d2 / 80.0 - 1.0, 10.0);
      int i1 = class04995.N(this.M.method_23318() + d3);
      class01763 class01763 = new class01763(k, i1, l);
      this.i = this.N.N(ix, j, class01763);
      if (this.i != null) {
         this.i.N();
         this.z();
      }
   }

   @Override
   public void N(class04782 var1) {
      if (this.M == null) {
         y.warn("Skipping player strafe phase because no player was found");
         this.N.W().N(class00702.N);
      } else {
         if (this.i != null && this.i.L()) {
            double d0 = this.M.method_23317();
            double d1 = this.M.method_23321();
            double d2 = d0 - this.N.method_23317();
            double d3 = d1 - this.N.method_23321();
            double d4 = Math.sqrt(d2 * d2 + d3 * d3);
            double d5 = Math.min(0.4F + d4 / 80.0 - 1.0, 10.0);
            this.R = new class06889(d0, this.M.method_23318() + d5, d1);
         }

         double d12 = this.R == null ? 0.0 : this.R.L(this.N.method_23317(), this.N.method_23318(), this.N.method_23321());
         if (d12 < 100.0 || d12 > 22500.0) {
            this.Z();
         }

         double d13 = 64.0;
         if (this.M.method_5858(this.N) < 4096.0) {
            if (this.N.method_6057(this.M)) {
               this.u++;
               class06889 class06889 = new class06889(this.M.method_23317() - this.N.method_23317(), 0.0, this.M.method_23321() - this.N.method_23321()).u();
               float f1 = (float)new class06889(
                     class04995.m(this.N.method_36454() * (float) (Math.PI / 180.0)), 0.0, -class04995.P(this.N.method_36454() * (float) (Math.PI / 180.0))
                  )
                  .u()
                  .y(class06889);
               float f = (float)(Math.acos(f1) * 180.0F / (float)Math.PI);
               f += 0.5F;
               if (this.u >= 5 && f >= 0.0F && f < 10.0F) {
                  double d14 = 1.0;
                  class06889 class06889x = this.N.method_5828(1.0F);
                  double d6 = this.N.L.method_23317() - class06889x.M * 1.0;
                  double d7 = this.N.L.method_23323(0.5) + 0.5;
                  double d8 = this.N.L.method_23321() - class06889x.Z * 1.0;
                  double d9 = this.M.method_23317() - d6;
                  double d10 = this.M.method_23323(0.5) - d7;
                  double d11 = this.M.method_23321() - d8;
                  class06889 class06889xx = new class06889(d9, d10, d11);
                  if (!this.N.method_5701()) {
                     var1.method_8444(null, 1017, this.N.method_24515(), 0);
                  }

                  class08028 class08028 = new class08028(var1, this.N, class06889xx.u());
                  class08028.method_5808(d6, d7, d8, 0.0F, 0.0F);
                  var1.method_8649(class08028);
                  this.u = 0;
                  if (this.i != null) {
                     while (!this.i.L()) {
                        this.i.N();
                     }
                  }

                  this.N.W().N(class00702.N);
               }
            } else if (this.u > 0) {
               this.u--;
            }
         } else if (this.u > 0) {
            this.u--;
         }
      }
   }

   @Nullable
   @Override
   public class06889 R() {
      return this.R;
   }
}
