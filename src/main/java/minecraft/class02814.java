package minecraft;

import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class02814 extends class04507<class00698, class08449> {
   private static final class01894 N = class01894.y("back");
   private final class08626 y;

   public class02814(class04832 var1) {
      super(var1);
      this.y = var1.N(class08589.z);
   }

   public void N(class08449 var1, class01421 var2, class01237 var3, class06959 var4, CallbackInfo var5) {
      if (!SodiumExtraClientMod.options().renderSettings.painting) {
         var5.cancel();
      }
   }

   private void N(class01423 var1, class01391 var2, float var3, float var4, float var5, float var6, float var7, int var8, int var9, int var10, int var11) {
      var2.N(var1, var3, var4, var7).method_39415(-1).method_22913(var5, var6).method_22922(class01384.u).method_60803(var11).y(var1, var8, var9, var10);
   }

   public class08449 method_55269() {
      return new class08449();
   }

   public void method_3936(class08449 var1, class01421 var2, class01237 var3, class06959 var4) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, var3, var4, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         class00693 class00693 = var1.y;
         if (class00693 != null) {
            var2.N();
            var2.N(class02058.u.N(180 - var1.N.u() * 90));
            class08388 class08388x = this.y.N(class00693.u());
            class08388 class08388x = this.y.N(N);
            this.N(var2, var3, class06851.i(class08388x.method_45852()), var1.L, class00693.y(), class00693.L(), class08388x, class08388x);
            var2.y();
            super.method_3936(var1, var2, var3, var4);
         }
      }
   }

   public void method_62354(class00698 var1, class08449 var2, float var3) {
      super.method_62354(var1, var2, var3);
      class07211 class07211 = var1.method_5735();
      class00693 class00693 = var1.R().N();
      var2.N = class07211;
      var2.y = class00693;
      int i = class00693.y();
      int j = class00693.L();
      if (var2.L.length != i * j) {
         var2.L = new int[i * j];
      }

      float f = -i / 2.0F;
      float f1 = -j / 2.0F;
      class07299 class07299 = var1.method_73183();

      for (int k = 0; k < j; k++) {
         for (int l = 0; l < i; l++) {
            float f2 = l + f + 0.5F;
            float f3 = k + f1 + 0.5F;
            int i1 = var1.method_31477();
            int j1 = class04995.N(var1.method_23318() + f3);
            int k1 = var1.method_31479();
            switch (class07211) {
               case field_11043:
                  i1 = class04995.N(var1.method_23317() + f2);
                  break;
               case field_11039:
                  k1 = class04995.N(var1.method_23321() - f2);
                  break;
               case field_11035:
                  i1 = class04995.N(var1.method_23317() - f2);
                  break;
               case field_11034:
                  k1 = class04995.N(var1.method_23321() + f2);
            }

            var2.L[l + k * i] = class03063.N(class07299, new class07209(i1, j1, k1));
         }
      }
   }

   private void N(class01421 var1, class01237 var2, class07311 var3, int[] var4, int var5, int var6, class08388 var7, class08388 var8) {
      var2.N(var1, var3, (var6x, var7x) -> {
         float f = -var5 / 2.0F;
         float f1 = -var6 / 2.0F;
         float f2 = 0.03125F;
         float f3 = var8.method_4594();
         float f4 = var8.method_4577();
         float f5 = var8.method_4593();
         float f6 = var8.method_4575();
         float f7 = var8.method_4594();
         float f8 = var8.method_4577();
         float f9 = var8.method_4593();
         float f10 = var8.method_4570(0.0625F);
         float f11 = var8.method_4594();
         float f12 = var8.method_4580(0.0625F);
         float f13 = var8.method_4593();
         float f14 = var8.method_4575();
         double d0 = 1.0 / var5;
         double d1 = 1.0 / var6;

         for (int i = 0; i < var5; i++) {
            for (int j = 0; j < var6; j++) {
               float f15 = f + (i + 1);
               float f16 = f + i;
               float f17 = f1 + (j + 1);
               float f18 = f1 + j;
               int k = var4[i + j * var5];
               float f19 = var7.method_4580((float)(d0 * (var5 - i)));
               float f20 = var7.method_4580((float)(d0 * (var5 - (i + 1))));
               float f21 = var7.method_4570((float)(d1 * (var6 - j)));
               float f22 = var7.method_4570((float)(d1 * (var6 - (j + 1))));
               this.N(var6x, var7x, f15, f18, f20, f21, -0.03125F, 0, 0, -1, k);
               this.N(var6x, var7x, f16, f18, f19, f21, -0.03125F, 0, 0, -1, k);
               this.N(var6x, var7x, f16, f17, f19, f22, -0.03125F, 0, 0, -1, k);
               this.N(var6x, var7x, f15, f17, f20, f22, -0.03125F, 0, 0, -1, k);
               this.N(var6x, var7x, f15, f17, f4, f5, 0.03125F, 0, 0, 1, k);
               this.N(var6x, var7x, f16, f17, f3, f5, 0.03125F, 0, 0, 1, k);
               this.N(var6x, var7x, f16, f18, f3, f6, 0.03125F, 0, 0, 1, k);
               this.N(var6x, var7x, f15, f18, f4, f6, 0.03125F, 0, 0, 1, k);
               this.N(var6x, var7x, f15, f17, f7, f9, -0.03125F, 0, 1, 0, k);
               this.N(var6x, var7x, f16, f17, f8, f9, -0.03125F, 0, 1, 0, k);
               this.N(var6x, var7x, f16, f17, f8, f10, 0.03125F, 0, 1, 0, k);
               this.N(var6x, var7x, f15, f17, f7, f10, 0.03125F, 0, 1, 0, k);
               this.N(var6x, var7x, f15, f18, f7, f9, 0.03125F, 0, -1, 0, k);
               this.N(var6x, var7x, f16, f18, f8, f9, 0.03125F, 0, -1, 0, k);
               this.N(var6x, var7x, f16, f18, f8, f10, -0.03125F, 0, -1, 0, k);
               this.N(var6x, var7x, f15, f18, f7, f10, -0.03125F, 0, -1, 0, k);
               this.N(var6x, var7x, f15, f17, f12, f13, 0.03125F, -1, 0, 0, k);
               this.N(var6x, var7x, f15, f18, f12, f14, 0.03125F, -1, 0, 0, k);
               this.N(var6x, var7x, f15, f18, f11, f14, -0.03125F, -1, 0, 0, k);
               this.N(var6x, var7x, f15, f17, f11, f13, -0.03125F, -1, 0, 0, k);
               this.N(var6x, var7x, f16, f17, f12, f13, -0.03125F, 1, 0, 0, k);
               this.N(var6x, var7x, f16, f18, f12, f14, -0.03125F, 1, 0, 0, k);
               this.N(var6x, var7x, f16, f18, f11, f14, 0.03125F, 1, 0, 0, k);
               this.N(var6x, var7x, f16, f17, f11, f13, 0.03125F, 1, 0, 0, k);
            }
         }
      });
   }
}
