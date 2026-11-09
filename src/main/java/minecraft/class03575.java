package minecraft;

import java.util.Objects;
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import net.irisshaders.iris.shadows.ShadowRenderingState;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class03575<T extends class00394 & class08618> implements class03358<T, class00956> {
   public static final class01894 N = class01894.y("textures/entity/beacon_beam.png");
   public static final int y = 2048;
   private static final float i = 96.0F;
   public static final float L = 0.2F;
   public static final float u = 0.25F;
   private class00956 R;

   public class03575() {
      super();
   }

   private void y(class01421 var1, class01237 var2, float var3, float var4, int var5, int var6, int var7) {
      if (var6 == 2048 && SodiumExtraClientMod.options().renderSettings.limitBeaconBeamHeight) {
         int ix = this.R.R.method_10264() + var5;
         var6 = ((class03448)Objects.requireNonNull((class03448)class06202.Nq().T_3)).method_31600() - ix;
      }

      N(var1, var2, var3, var4, var5, var6, var7);
   }

   @Override
   public boolean N(T var1, class06889 var2) {
      return class06889.y(var1.d()).u(1.0, 0.0, 1.0).N((class00737)var2.u(1.0, 0.0, 1.0), (double)this.u_());
   }

   private static void N(
      class01421 var0, class01237 var1, class01894 var2, float var3, float var4, int var5, int var6, int var7, float var8, float var9, CallbackInfo var10
   ) {
      if (ShadowRenderingState.areShadowsCurrentlyBeingRendered()) {
         var10.cancel();
      }
   }

   public void N(class00956 var1, class01421 var2, class01237 var3, class06959 var4, CallbackInfo var5) {
      this.R = var1;
      if (!SodiumExtraClientMod.options().renderSettings.beaconBeam) {
         var5.cancel();
      }
   }

   public static void N(class01421 var0, class01237 var1, class01894 var2, float var3, float var4, int var5, int var6, int var7, float var8, float var9) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      N(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         int ix = var5 + var6;
         var0.N();
         var0.N(0.5, 0.0, 0.5);
         float f = var6 < 0 ? var4 : -var4;
         float f1 = class04995.M(f * 0.2F - class04995.y(f * 0.1F));
         var0.N();
         var0.N(class02058.u.N(var4 * 2.25F - 45.0F));
         float f2 = 0.0F;
         float f4 = 0.0F;
         float f5 = -var8;
         float f6 = 0.0F;
         float f7 = 0.0F;
         float f8 = -var8;
         float f9 = 0.0F;
         float f10 = 1.0F;
         float f11 = -1.0F + f1;
         float f12 = var6 * var3 * (0.5F / var8) + f11;
         var1.N(
            var0,
            class06851.i(var2, false),
            (var9x, var10x) -> N(var9x, var10x, var7, var5, ix, 0.0F, var8, var8, 0.0F, f5, 0.0F, 0.0F, f8, 0.0F, 1.0F, f12, f11)
         );
         var0.y();
         f2 = -var9;
         float f3 = -var9;
         f4 = -var9;
         f5 = -var9;
         f9 = 0.0F;
         f10 = 1.0F;
         f11 = -1.0F + f1;
         f12 = var6 * var3 + f11;
         var1.N(
            var0,
            class06851.i(var2, true),
            (var13x, var14x) -> N(var13x, var14x, class02566.R(32, var7), var5, ix, f2, f3, var9, f4, f5, var9, var9, var9, 0.0F, 1.0F, f12, f11)
         );
         var0.y();
      }
   }

   public class00956 i() {
      return new class00956();
   }

   public void N(class00956 var1, class01421 var2, class01237 var3, class06959 var4) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, var3, var4, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         int ix = 0;

         for (int j = 0; j < var1.L.size(); j++) {
            class00986 class00986 = var1.L.get(j);
            float f2 = var1.y;
            float f3 = var1.N;
            int i1 = j == var1.L.size() - 1 ? 2048 : class00986.y();
            int l = class00986.N();
            int k = i1;
            float f1 = f3;
            float f = f2;
            this.y(var2, var3, f, f1, ix, k, l);
            ix += class00986.y();
         }
      }
   }

   public static <T extends class00394 & class08618> void N(T var0, class00956 var1, float var2, class06889 var3) {
      var1.N = var0.G() != null ? Math.floorMod(var0.G().N(), 40) + var2 : 0.0F;
      var1.L = ((class08618)var0).N().stream().map(var0x -> new class00986(var0x.y(), var0x.L())).toList();
      float f = (float)var3.u(var1.R.method_46558()).Z();
      class04453 class04453 = (class04453)class06202.Nq().T_4;
      var1.y = class04453 != null && class04453.method_31550() ? 1.0F : Math.max(1.0F, f / 96.0F);
   }

   public void N(T var1, class00956 var2, float var3, class06889 var4, @Nullable class08141 var5) {
      class03358.super.N((T)var1, var2, var3, var4, var5);
      N((T)var1, var2, var3, var4);
   }

   private static void N(class01421 var0, class01237 var1, float var2, float var3, int var4, int var5, int var6) {
      N(var0, var1, N, 1.0F, var3, var4, var5, var6, 0.2F * var2, 0.25F * var2);
   }

   private static void N(class01423 var0, class01391 var1, int var2, int var3, float var4, float var5, float var6, float var7) {
      var1.N(var0, var4, (float)var3, var5)
         .method_39415(var2)
         .method_22913(var6, var7)
         .method_22922(class01384.u)
         .method_60803(15728880)
         .y(var0, 0.0F, 1.0F, 0.0F);
   }

   private static void N(
      class01423 var0,
      class01391 var1,
      int var2,
      int var3,
      int var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12
   ) {
      N(var0, var1, var2, var4, var5, var6, var10, var11);
      N(var0, var1, var2, var3, var5, var6, var10, var12);
      N(var0, var1, var2, var3, var7, var8, var9, var12);
      N(var0, var1, var2, var4, var7, var8, var9, var11);
   }

   private static void N(
      class01423 var0,
      class01391 var1,
      int var2,
      int var3,
      int var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16
   ) {
      N(var0, var1, var2, var3, var4, var5, var6, var7, var8, var13, var14, var15, var16);
      N(var0, var1, var2, var3, var4, var11, var12, var9, var10, var13, var14, var15, var16);
      N(var0, var1, var2, var3, var4, var7, var8, var11, var12, var13, var14, var15, var16);
      N(var0, var1, var2, var3, var4, var9, var10, var5, var6, var13, var14, var15, var16);
   }

   @Override
   public int u_() {
      return ((class05630)class06202.Nq().i_7).Nh() * 16;
   }

   @Override
   public boolean t_() {
      return true;
   }
}
