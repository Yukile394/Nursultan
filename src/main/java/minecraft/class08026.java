package minecraft;

import org.jspecify.annotations.Nullable;

public class class08026 extends class07049 implements class05640 {
   private static final float N = 12.25F;
   private static final float y = 8.0F;
   private static final float L = 12.0F;
   private static final class02131<class06584> u = class03289.N(class08026.class, class02154.B);
   @Nullable
   private class06889 i;
   private int R;
   private boolean M;

   @Override
   public class06584 L() {
      return this.method_5841().N(u);
   }

   @Override
   protected void method_5693(class04293 var1) {
      var1.N(u, this.N());
   }

   @Override
   public void method_5773() {
      super.method_5773();
      class06889 class06889x = this.method_73189().i(this.method_18798());
      if (!this.method_73183().method_8608() && this.i != null) {
         this.method_18799(N(this.method_18798(), class06889x, this.i));
      }

      if (this.method_73183().method_8608()) {
         class06889 class06889x = class06889x.u(this.method_18798().L(0.25));
         this.N(class06889x, this.method_18798());
      }

      this.method_33574(class06889x);
      if (!this.method_73183().method_8608()) {
         this.R++;
         if (this.R > 80 && !this.method_73183().method_8608()) {
            this.method_5783(class04909.za, 1.0F, 1.0F);
            this.method_31472();
            if (this.M) {
               this.method_73183().method_8649(new class00717(this.method_73183(), this.method_23317(), this.method_23318(), this.method_23321(), this.L()));
            } else {
               this.method_73183().N(2003, this.method_24515(), 0);
            }
         }
      }
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      return false;
   }

   @Override
   public float method_5718() {
      return 1.0F;
   }

   @Override
   protected void method_5652(class08329 var1) {
      var1.N("Item", class06584.y, this.L());
   }

   @Override
   public boolean method_5640(double var1) {
      if (this.field_6012 < 2 && var1 < 12.25) {
         return false;
      } else {
         double d0 = this.method_5829().N() * 4.0;
         if (Double.isNaN(d0)) {
            d0 = 4.0;
         }

         d0 *= 64.0;
         return var1 < d0 * d0;
      }
   }

   @Override
   protected void method_5749(class08299 var1) {
      this.N(var1.<class06584>N("Item", class06584.y).orElse(this.N()));
   }

   @Override
   public boolean method_5732() {
      return false;
   }

   public class08026(class07078<? extends class08026> var1, class07299 var2) {
      super(var1, var2);
   }

   public class08026(class07299 var1, double var2, double var4, double var6) {
      this(class07078.NN, var1);
      this.method_5814(var2, var4, var6);
   }

   public void N(class06889 var1) {
      class06889 class06889 = var1.u(this.method_73189());
      double d0 = class06889.Z();
      if (d0 > 12.0) {
         this.i = this.method_73189().y(class06889.M / d0 * 12.0, 8.0, class06889.Z / d0 * 12.0);
      } else {
         this.i = var1;
      }

      this.R = 0;
      this.M = this.field_5974.y(5) > 0;
   }

   private void N(class06889 var1, class06889 var2) {
      if (this.method_5799()) {
         for (int ix = 0; ix < 4; ix++) {
            this.method_73183().method_8406(class07107.u, var1.M, var1.B, var1.Z, var2.M, var2.B, var2.Z);
         }
      } else {
         this.method_73183()
            .method_8406(
               class07107.NM, var1.M + this.field_5974.U() * 0.6 - 0.3, var1.B - 0.5, var1.Z + this.field_5974.U() * 0.6 - 0.3, var2.M, var2.B, var2.Z
            );
      }
   }

   public void N(class06584 var1) {
      if (var1.R()) {
         this.method_5841().N(u, this.N());
      } else {
         this.method_5841().N(u, var1.L(1));
      }
   }

   private class06584 N() {
      return new class06584(class06570.nG);
   }

   private static class06889 N(class06889 var0, class06889 var1, class06889 var2) {
      class06889 class06889 = new class06889(var2.M - var1.M, 0.0, var2.Z - var1.Z);
      double d0 = class06889.M();
      double d1 = class04995.u(0.0025, var0.Z(), d0);
      double d2 = var0.B;
      if (d0 < 1.0) {
         d1 *= 0.8;
         d2 *= 0.8;
      }

      double d3 = var1.B - var0.B < var2.B ? 1.0 : -1.0;
      return class06889.L(d1 / d0).y(0.0, d2 + (d3 - d2) * 0.015, 0.0);
   }
}
