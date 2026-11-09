package minecraft;

public class class07961 extends class06139 {
   private static final int[] N = new int[]{0, 1, 4, 5, 6, 7};
   private final class07618 y;
   private final int L;
   private boolean u;

   @Override
   public void L() {
      class07211 class07211 = this.y.method_5755();
      this.y.method_18799(this.y.method_18798().y(class07211.P() * 0.6, 0.7, class07211.T() * 0.6));
      this.y.f().W();
   }

   public class07961(class07618 var1, int var2) {
      super();
      this.y = var1;
      this.L = y(var2);
   }

   @Override
   public void i() {
      boolean flag = this.u;
      if (!flag) {
         class04688 class04688 = this.y.method_73183().method_8316(this.y.method_24515());
         this.u = class04688.N(class01231.N);
      }

      if (this.u && !flag) {
         this.y.method_5783(class04909.Zk, 1.0F, 1.0F);
      }

      class06889 class06889 = this.y.method_18798();
      if (class06889.B * class06889.B < 0.03F && this.y.method_36455() != 0.0F) {
         this.y.method_36457(class04995.Z(0.2F, this.y.method_36455(), 0.0F));
      } else if (class06889.M() > 1.0E-5F) {
         double d0 = class06889.Z();
         double d1 = Math.atan2(-class06889.B, d0) * 180.0F / (float)Math.PI;
         this.y.method_36457((float)d1);
      }
   }

   @Override
   public void u() {
      this.y.method_36457(0.0F);
   }

   @Override
   public boolean y() {
      double d0 = this.y.method_18798().B;
      return (!(d0 * d0 < 0.03F) || this.y.method_36455() == 0.0F || !(Math.abs(this.y.method_36455()) < 10.0F) || !this.y.method_5799())
         && !this.y.method_24828();
   }

   private boolean y(class07209 var1, int var2, int var3, int var4) {
      return this.y.method_73183().method_8320(var1.method_10069(var2 * var4, 1, var3 * var4)).P()
         && this.y.method_73183().method_8320(var1.method_10069(var2 * var4, 2, var3 * var4)).P();
   }

   @Override
   public boolean N() {
      if (this.y.method_59922().y(this.L) != 0) {
         return false;
      } else {
         class07211 class07211 = this.y.method_5755();
         int i = class07211.P();
         int j = class07211.T();
         class07209 class07209 = this.y.method_24515();

         for (int k : N) {
            if (!this.N(class07209, i, j, k) || !this.y(class07209, i, j, k)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean N(class07209 var1, int var2, int var3, int var4) {
      class07209 class07209 = var1.method_10069(var2 * var4, 0, var3 * var4);
      return this.y.method_73183().method_8316(class07209).N(class01231.N) && !this.y.method_73183().method_8320(class07209).M();
   }

   @Override
   public boolean O_() {
      return false;
   }
}
