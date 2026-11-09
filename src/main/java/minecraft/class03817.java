package minecraft;

import Nursultan.class10987;
import Nursultan.class11938;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class03817 extends class04507<class00696, class08491> {
   private static final class01894 N = class01894.y("textures/entity/fishing_hook.png");
   private static final class07311 y = class06851.R(N);
   private static final double L = 960.0;

   public class03817(class04832 var1) {
      super(var1);
   }

   public class08491 method_55269() {
      return new class08491();
   }

   public void method_62354(class00696 var1, class08491 var2, float var3) {
      super.method_62354(var1, var2, var3);
      class08036 class08036 = var1.L();
      if (class08036 == null) {
         var2.N = class06889.L;
      } else {
         float f = class04995.m(class04995.N(class08036.method_6055(var3)) * (float) Math.PI);
         class06889 class06889x = this.N(class08036, f, var3);
         class06889 class06889x = var1.method_30950(var3).y(0.0, 0.25, 0.0);
         var2.N = class06889x.u(class06889x);
      }
   }

   protected boolean method_62406(class00696 var1) {
      return false;
   }

   private void N(class00696 var1, class01383 var2, double var3, double var5, double var7, CallbackInfoReturnable var9) {
      class10987 class10987 = class10987.N(var1);
      class11938.L().L(class10987);
      if (class10987.y()) {
         var9.setReturnValue(false);
      }
   }

   public boolean method_3933(class00696 var1, class01383 var2, double var3, double var5, double var7) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var5, var7, callbackinforeturnable);
      return callbackinforeturnable.isCancelled()
         ? callbackinforeturnable.getReturnValueZ()
         : super.method_3933(var1, var2, var3, var5, var7) && var1.L() != null;
   }

   private class06889 N(class08036 var1, float var2, float var3) {
      int i = N(var1) == class07070.field_6183 ? 1 : -1;
      if (this.field_4676.u.NS().N() && var1 == (class04453)class06202.Nq().T_4) {
         double d4 = 960.0 / this.field_4676.u.Nw().method_41753().intValue();
         class06889 class06889 = this.field_4676.y.E().N(i * 0.525F, -0.1F).L(d4).y(var2 * 0.5F).N(-var2 * 0.7F);
         return var1.method_5836(var3).i(class06889);
      } else {
         float f = class04995.B(var3, var1.fields_4212a028292fd3c078969e3ee4c71d9e8_1, var1.fields_4212a028292fd3c078969e3ee4c71d9e8_0)
            * (float) (Math.PI / 180.0);
         double d0 = class04995.m(f);
         double d1 = class04995.P(f);
         float f1 = var1.method_55693();
         double d2 = i * 0.35 * f1;
         double d3 = 0.8 * f1;
         float f2 = var1.method_18276() ? -0.1875F : 0.0F;
         return var1.method_5836(var3).y(-d1 * d2 - d0 * d3, f2 - 0.45 * f1, -d0 * d2 + d1 * d3);
      }
   }

   public static class07070 N(class08036 var0) {
      return var0.method_6047().B() instanceof class06579 ? var0.method_6068() : var0.method_6068().N();
   }

   public void method_3936(class08491 var1, class01421 var2, class01237 var3, class06959 var4) {
      var2.N();
      var2.N();
      var2.y(0.5F, 0.5F, 0.5F);
      var2.N(var4.i);
      var3.N(var2, y, (var1x, var2x) -> {
         N(var2x, var1x, var1.G, 0.0F, 0, 0, 1);
         N(var2x, var1x, var1.G, 1.0F, 0, 1, 1);
         N(var2x, var1x, var1.G, 1.0F, 1, 1, 0);
         N(var2x, var1x, var1.G, 0.0F, 1, 0, 0);
      });
      var2.y();
      float f = (float)var1.N.M;
      float f1 = (float)var1.N.B;
      float f2 = (float)var1.N.Z;
      float f3 = class06202.Nq().Nt().t();
      var3.N(var2, class06851.b(), (var4x, var5x) -> {
         byte b0 = 16;

         for (int i = 0; i < 16; i++) {
            float fx = N(i, 16);
            float f1x = N(i + 1, 16);
            N(f, f1, f2, var5x, var4x, fx, f1x, f3);
            N(f, f1, f2, var5x, var4x, f1x, fx, f3);
         }
      });
      var2.y();
      super.method_3936(var1, var2, var3, var4);
   }

   private static void N(float var0, float var1, float var2, class01391 var3, class01423 var4, float var5, float var6, float var7) {
      float f = var0 * var5;
      float f1 = var1 * (var5 * var5 + var5) * 0.5F + 0.25F;
      float f2 = var2 * var5;
      float f3 = var0 * var6 - f;
      float f4 = var1 * (var6 * var6 + var6) * 0.5F + 0.25F - f1;
      float f5 = var2 * var6 - f2;
      float f6 = class04995.N(f3 * f3 + f4 * f4 + f5 * f5);
      f3 /= f6;
      f4 /= f6;
      f5 /= f6;
      var3.N(var4, f, f1, f2).method_39415(-16777216).y(var4, f3, f4, f5).method_75298(var7);
   }

   private static void N(class01391 var0, class01423 var1, int var2, float var3, int var4, int var5, int var6) {
      var0.N(var1, var3 - 0.5F, var4 - 0.5F, 0.0F)
         .method_39415(-1)
         .method_22913(var5, var6)
         .method_22922(class01384.u)
         .method_60803(var2)
         .y(var1, 0.0F, 1.0F, 0.0F);
   }

   private static float N(int var0, int var1) {
      return (float)var0 / var1;
   }
}
