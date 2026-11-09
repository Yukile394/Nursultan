package minecraft;

import Nursultan.class10960;
import Nursultan.class10962;
import Nursultan.class10978;
import Nursultan.class11938;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import org.joml.Matrix4f;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
public class class01412 {
   private static final class01894 y = class01894.y("textures/misc/underwater.png");
   private final class06202 L;
   private final class08097 u;
   private final class01407 i;
   public static final int N = 40;
   @Nullable
   private class06584 R;
   private int M;
   private float B;
   private float Z;
   @Nullable
   private static class07209 z;

   public class01412(class06202 var1, class08097 var2, class01407 var3) {
      super();
      this.L = var1;
      this.u = var2;
      this.i = var3;
   }

   public void y() {
      this.R = null;
   }

   private static void y(class06202 var0, class01421 var1, class01407 var2, CallbackInfo var3) {
      class10960 class10960 = class10960.L();
      class11938.L().L(class10960);
      if (class10960.y()) {
         var3.cancel();
      }
   }

   private static class08388 N(class03770 var0, class00500 var1, class08036 var2) {
      if (z != null) {
         class08388 class08388 = var0.getModelParticleSprite(var1, var2.method_73183(), z);
         z = null;
         return class08388;
      } else {
         return var0.N(var1);
      }
   }

   private static void N(CallbackInfoReturnable var0, class07218 var1) {
      if (var0.getReturnValue() != null) {
         z = var1.method_10062();
      } else {
         z = null;
      }
   }

   private static void N(class08388 var0, class01421 var1, class01407 var2, CallbackInfo var3) {
      class10978 class10978 = class10978.L();
      class11938.L().L(class10978);
      if (class10978.y()) {
         var3.cancel();
      }
   }

   private static void N(class06202 var0, class01421 var1, class01407 var2, CallbackInfo var3) {
      WorldRenderingPipeline worldrenderingpipeline = Iris.getPipelineManager().getPipelineNullable();
      if (worldrenderingpipeline != null && !worldrenderingpipeline.shouldRenderUnderwaterOverlay()) {
         var3.cancel();
      }
   }

   private static class08388 N(class03770 var0, class00500 var1, LocalRef var2) {
      return N(var0, var1, (class08036)var2.get());
   }

   private static void N(class01421 var0, class01407 var1, class08388 var2, CallbackInfo var3) {
      class10962 class10962 = class10962.L();
      class11938.L().L(class10962);
      if (class10962.y()) {
         var3.cancel();
      }
   }

   public void N(class06584 var1, class06069 var2) {
      this.R = var1;
      this.M = 40;
      this.B = var2.z() * 2.0F - 1.0F;
      this.Z = var2.z() * 2.0F - 1.0F;
   }

   private void N(class01421 var1, float var2, class01237 var3) {
      if (this.R != null && this.M > 0) {
         float f = (40 - this.M + var2) / 40.0F;
         float f1 = f * f;
         float f2 = f * f1;
         float f3 = (10.25F * f2 * f1 - 24.95F * f1 * f1 + 25.5F * f2 - 13.8F * f1 + 4.0F * f) * (float) Math.PI;
         float f4 = (float)this.L.Nt().U() / this.L.Nt().E();
         float f5 = this.B * 0.3F * f4;
         float f6 = this.Z * 0.3F;
         var1.N();
         var1.N(f5 * class04995.L(class04995.m(f3 * 2.0F)), f6 * class04995.L(class04995.m(f3 * 2.0F)), -10.0F + 9.0F * class04995.m(f3));
         float f7 = 0.8F;
         var1.y(0.8F, 0.8F, 0.8F);
         var1.N(class02058.u.N(900.0F * class04995.L(class04995.m(f3))));
         var1.N(class02058.y.N(6.0F * class04995.P(f * 8.0F)));
         var1.N(class02058.R.N(6.0F * class04995.P(f * 8.0F)));
         ((class03386)this.L.i_5).v().N(class01540.field_60027);
         class08898 class08898 = new class08898();
         this.L.NM().N(class08898, this.R, class03662.field_4319, (class03448)this.L.T_3, null, 0);
         class08898.N(var1, var3, 15728880, class01384.u, 0);
         var1.y();
      }
   }

   public void N(boolean var1, float var2, class01237 var3) {
      class01421 class01421 = new class01421();
      class04453 class04453 = (class04453)this.L.T_4;
      if (((class05630)this.L.i_7).NS().N() && !var1) {
         if (!class04453.field_5960) {
            class00500 class00500 = N(class04453);
            if (class00500 != null) {
               class03770 class03770 = this.L.yU().N();
               LocalRefImpl localrefimpl = new LocalRefImpl();
               localrefimpl.init(class04453);
               class08388 class08388 = N(class03770, class00500, localrefimpl);
               class08036 class08036 = (class08036)localrefimpl.dispose();
               N(class08388, class01421, this.i);
            }
         }

         if (!((class04453)this.L.T_4).method_7325()) {
            if (((class04453)this.L.T_4).method_5777(class01231.N)) {
               N(this.L, class01421, this.i);
            }

            if (((class04453)this.L.T_4).method_5809()) {
               class08388 class08388x = this.u.N(class08874.y);
               N(class01421, this.i, class08388x);
            }
         }
      }

      if (!((class05630)this.L.i_7).NG) {
         this.N(class01421, var2, var3);
      }
   }

   public void N() {
      if (this.M > 0) {
         this.M--;
         if (this.M == 0) {
            this.R = null;
         }
      }
   }

   private static void N(class01421 var0, class01407 var1, class08388 var2) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      N(var0, var1, var2, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         class01391 class01391 = var1.method_73477(class06851.Y(var2.method_45852()));
         float f = var2.method_4594();
         float f1 = var2.method_4577();
         float f2 = var2.method_4593();
         float f3 = var2.method_4575();
         float f4 = 1.0F;

         for (int ix = 0; ix < 2; ix++) {
            var0.N();
            float f5 = -0.5F;
            float f6 = 0.5F;
            float f7 = -0.5F;
            float f8 = 0.5F;
            float f9 = -0.5F;
            var0.N(-(ix * 2 - 1) * 0.24F, -0.3F, 0.0F);
            var0.N(class02058.u.N((ix * 2 - 1) * 10.0F));
            Matrix4f matrix4f = var0.L().N();
            class01391.N(matrix4f, -0.5F, -0.5F, -0.5F).method_22913(f1, f3).method_22915(1.0F, 1.0F, 1.0F, 0.9F);
            class01391.N(matrix4f, 0.5F, -0.5F, -0.5F).method_22913(f, f3).method_22915(1.0F, 1.0F, 1.0F, 0.9F);
            class01391.N(matrix4f, 0.5F, 0.5F, -0.5F).method_22913(f, f2).method_22915(1.0F, 1.0F, 1.0F, 0.9F);
            class01391.N(matrix4f, -0.5F, 0.5F, -0.5F).method_22913(f1, f2).method_22915(1.0F, 1.0F, 1.0F, 0.9F);
            var0.y();
         }
      }
   }

   private static void N(class06202 var0, class01421 var1, class01407 var2) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      N(var0, var1, var2, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         CallbackInfo callbackinfo1 = new CallbackInfo("", true);
         y(var0, var1, var2, callbackinfo1);
         if (!callbackinfo1.isCancelled()) {
            class07209 class07209 = class07209.method_49637(
               ((class04453)var0.T_4).method_23317(), ((class04453)var0.T_4).method_23320(), ((class04453)var0.T_4).method_23321()
            );
            float f = class03042.N(((class04453)var0.T_4).method_73183().method_8597(), ((class04453)var0.T_4).method_73183().U(class07209));
            int ix = class02566.N(0.1F, f, f, f);
            float f1 = 4.0F;
            float f2 = -1.0F;
            float f3 = 1.0F;
            float f4 = -1.0F;
            float f5 = 1.0F;
            float f6 = -0.5F;
            float f7 = -((class04453)var0.T_4).method_36454() / 64.0F;
            float f8 = ((class04453)var0.T_4).method_36455() / 64.0F;
            Matrix4f matrix4f = var1.L().N();
            class01391 class01391 = var2.method_73477(class06851.k(y));
            class01391.N(matrix4f, -1.0F, -1.0F, -0.5F).method_22913(4.0F + f7, 4.0F + f8).method_39415(ix);
            class01391.N(matrix4f, 1.0F, -1.0F, -0.5F).method_22913(0.0F + f7, 4.0F + f8).method_39415(ix);
            class01391.N(matrix4f, 1.0F, 1.0F, -0.5F).method_22913(0.0F + f7, 0.0F + f8).method_39415(ix);
            class01391.N(matrix4f, -1.0F, 1.0F, -0.5F).method_22913(4.0F + f7, 0.0F + f8).method_39415(ix);
         }
      }
   }

   private static void N(class08388 var0, class01421 var1, class01407 var2) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      N(var0, var1, var2, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         float f = 0.1F;
         int ix = class02566.N(1.0F, 0.1F, 0.1F, 0.1F);
         float f1 = -1.0F;
         float f2 = 1.0F;
         float f3 = -1.0F;
         float f4 = 1.0F;
         float f5 = -0.5F;
         float f6 = var0.method_4594();
         float f7 = var0.method_4577();
         float f8 = var0.method_4593();
         float f9 = var0.method_4575();
         Matrix4f matrix4f = var1.L().N();
         class01391 class01391 = var2.method_73477(class06851.k(var0.method_45852()));
         class01391.N(matrix4f, -1.0F, -1.0F, -0.5F).method_22913(f7, f9).method_39415(ix);
         class01391.N(matrix4f, 1.0F, -1.0F, -0.5F).method_22913(f6, f9).method_39415(ix);
         class01391.N(matrix4f, 1.0F, 1.0F, -0.5F).method_22913(f6, f8).method_39415(ix);
         class01391.N(matrix4f, -1.0F, 1.0F, -0.5F).method_22913(f7, f8).method_39415(ix);
      }
   }

   @Nullable
   private static class00500 N(class08036 var0) {
      class07218 class07218 = new class07218();

      for (int ix = 0; ix < 8; ix++) {
         double d0 = var0.method_23317() + ((ix >> 0) % 2 - 0.5F) * var0.method_17681() * 0.8F;
         double d1 = var0.method_23320() + ((ix >> 1) % 2 - 0.5F) * 0.1F * var0.method_55693();
         double d2 = var0.method_23321() + ((ix >> 2) % 2 - 0.5F) * var0.method_17681() * 0.8F;
         class07218.N(d0, d1, d2);
         class00500 class00500 = var0.method_73183().method_8320(class07218);
         if (class00500.b() != class06898.field_11455 && class00500.U(var0.method_73183(), class07218)) {
            CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", false, class00500);
            N(callbackinforeturnable, class07218);
            return class00500;
         }
      }

      return null;
   }
}
