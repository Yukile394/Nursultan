package minecraft;

import org.jspecify.annotations.Nullable;

public class class03840 extends class02840<class07549, class08455, class06346> {
   private static final class01894 N = class01894.y("textures/entity/guardian.png");
   private static final class01894 i = class01894.y("textures/entity/guardian_beam.png");
   private static final class07311 R = class06851.M(i);

   public class03840(class04832 var1) {
      this(var1, 0.5F, class04802.ym);
   }

   public class03840(class04832 var1, float var2, class01134 var3) {
      super(var1, new class06346(var1.N(var3)), var2);
   }

   public class08455 method_55269() {
      return new class08455();
   }

   public boolean method_3933(class07549 var1, class01383 var2, double var3, double var5, double var7) {
      if (super.method_3933(var1, var2, var3, var5, var7)) {
         return true;
      } else {
         if (var1.v()) {
            class07438 class07438 = var1.n();
            if (class07438 != null) {
               class06889 class06889x = this.N(class07438, class07438.method_17682() * 0.5, 1.0F);
               class06889 class06889x = this.N(var1, var1.method_5751(), 1.0F);
               return var2.method_23093(new class00734(class06889x.M, class06889x.B, class06889x.Z, class06889x.M, class06889x.B, class06889x.Z));
            }
         }

         return false;
      }
   }

   @Nullable
   private static class07049 N(class07549 var0) {
      class07049 class07049 = class06202.Nq().F();
      return (class07049)(var0.v() ? var0.n() : class07049);
   }

   public void method_3936(class08455 var1, class01421 var2, class01237 var3, class06959 var4) {
      super.method_3936(var1, var2, var3, var4);
      class06889 class06889 = var1.R;
      if (class06889 != null) {
         float f = var1.M * 0.5F % 1.0F;
         var2.N();
         var2.N(0.0F, var1.b, 0.0F);
         N(var2, var3, class06889.u(var1.L), var1.M, var1.B, f);
         var2.y();
      }
   }

   private class06889 N(class07438 var1, double var2, float var4) {
      double d0 = class04995.u((double)var4, var1.field_6038, var1.method_23317());
      double d1 = class04995.u((double)var4, var1.field_5971, var1.method_23318()) + var2;
      double d2 = class04995.u((double)var4, var1.field_5989, var1.method_23321());
      return new class06889(d0, d1, d2);
   }

   private static void N(class01421 var0, class01237 var1, class06889 var2, float var3, float var4, float var5) {
      float f = (float)(var2.M() + 1.0);
      var2 = var2.u();
      float f1 = (float)Math.acos(var2.B);
      float f2 = (float) (Math.PI / 2) - (float)Math.atan2(var2.Z, var2.M);
      var0.N(class02058.u.N(f2 * (180.0F / (float)Math.PI)));
      var0.N(class02058.y.N(f1 * (180.0F / (float)Math.PI)));
      float f3 = var3 * 0.05F * -1.5F;
      float f4 = var4 * var4;
      int ix = 64 + (int)(f4 * 191.0F);
      int j = 32 + (int)(f4 * 191.0F);
      int k = 128 - (int)(f4 * 64.0F);
      float f5 = 0.2F;
      float f6 = 0.282F;
      float f7 = class04995.P(f3 + (float) (Math.PI * 3.0 / 4.0)) * 0.282F;
      float f8 = class04995.m(f3 + (float) (Math.PI * 3.0 / 4.0)) * 0.282F;
      float f9 = class04995.P(f3 + (float) (Math.PI / 4)) * 0.282F;
      float f10 = class04995.m(f3 + (float) (Math.PI / 4)) * 0.282F;
      float f11 = class04995.P(f3 + ((float) Math.PI * 5.0F / 4.0F)) * 0.282F;
      float f12 = class04995.m(f3 + ((float) Math.PI * 5.0F / 4.0F)) * 0.282F;
      float f13 = class04995.P(f3 + ((float) Math.PI * 7.0F / 4.0F)) * 0.282F;
      float f14 = class04995.m(f3 + ((float) Math.PI * 7.0F / 4.0F)) * 0.282F;
      float f15 = class04995.P(f3 + (float) Math.PI) * 0.2F;
      float f16 = class04995.m(f3 + (float) Math.PI) * 0.2F;
      float f17 = class04995.P(f3 + 0.0F) * 0.2F;
      float f18 = class04995.m(f3 + 0.0F) * 0.2F;
      float f19 = class04995.P(f3 + (float) (Math.PI / 2)) * 0.2F;
      float f20 = class04995.m(f3 + (float) (Math.PI / 2)) * 0.2F;
      float f21 = class04995.P(f3 + (float) (Math.PI * 3.0 / 2.0)) * 0.2F;
      float f22 = class04995.m(f3 + (float) (Math.PI * 3.0 / 2.0)) * 0.2F;
      float f23 = 0.0F;
      float f24 = 0.4999F;
      float f25 = -1.0F + var5;
      float f26 = f25 + f * 2.5F;
      var1.N(var0, R, (var23x, var24x) -> {
         N(var24x, var23x, f15, f, f16, ix, j, k, 0.4999F, f26);
         N(var24x, var23x, f15, 0.0F, f16, ix, j, k, 0.4999F, f25);
         N(var24x, var23x, f17, 0.0F, f18, ix, j, k, 0.0F, f25);
         N(var24x, var23x, f17, f, f18, ix, j, k, 0.0F, f26);
         N(var24x, var23x, f19, f, f20, ix, j, k, 0.4999F, f26);
         N(var24x, var23x, f19, 0.0F, f20, ix, j, k, 0.4999F, f25);
         N(var24x, var23x, f21, 0.0F, f22, ix, j, k, 0.0F, f25);
         N(var24x, var23x, f21, f, f22, ix, j, k, 0.0F, f26);
         float fx = class04995.y(var3) % 2 == 0 ? 0.5F : 0.0F;
         N(var24x, var23x, f7, f, f8, ix, j, k, 0.5F, fx + 0.5F);
         N(var24x, var23x, f9, f, f10, ix, j, k, 1.0F, fx + 0.5F);
         N(var24x, var23x, f13, f, f14, ix, j, k, 1.0F, fx);
         N(var24x, var23x, f11, f, f12, ix, j, k, 0.5F, fx);
      });
   }

   public void method_62354(class07549 var1, class08455 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = var1.i(var3);
      var2.y = var1.u(var3);
      var2.L = var1.method_5836(var3);
      class07049 class07049 = N(var1);
      if (class07049 != null) {
         var2.u = var1.method_5828(var3);
         var2.i = class07049.method_5836(var3);
      } else {
         var2.u = null;
         var2.i = null;
      }

      class07438 class07438 = var1.n();
      if (class07438 != null) {
         var2.B = var1.R(var3);
         var2.M = var1.t() + var3;
         var2.R = this.N(class07438, class07438.method_17682() * 0.5, var3);
      } else {
         var2.R = null;
      }
   }

   public class01894 N(class08455 var1) {
      return N;
   }

   private static void N(class01391 var0, class01423 var1, float var2, float var3, float var4, int var5, int var6, int var7, float var8, float var9) {
      var0.N(var1, var2, var3, var4)
         .method_1336(var5, var6, var7, 255)
         .method_22913(var8, var9)
         .method_22922(class01384.u)
         .method_60803(15728880)
         .y(var1, 0.0F, 1.0F, 0.0F);
   }
}
