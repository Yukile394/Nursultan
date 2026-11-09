package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.viaversion.viafabricplus.features.classic.cpe_extension.CPEAdditions;
import java.util.List;
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class02425 {
   private static final float N = 0.225F;
   private static final int y = 10;
   private static final class01894 L = class01894.y("textures/environment/rain.png");
   private static final class01894 u = class01894.y("textures/environment/snow.png");
   private static final int i = 32;
   private static final int R = 16;
   private int M;
   private final float[] B = new float[1024];
   private final float[] Z = new float[1024];

   public class02425() {
      super();

      for (int ix = 0; ix < 32; ix++) {
         for (int j = 0; j < 32; j++) {
            float f = j - 16;
            float f1 = ix - 16;
            float f2 = class04995.M(f, f1);
            this.B[ix * 32 + j] = -f1 / f2;
            this.Z[ix * 32 + j] = f / f2;
         }
      }
   }

   private void y(class03448 var1, class05363 var2, int var3, class01315 var4, int var5) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, var3, var4, var5, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         float f = var1.method_8430(1.0F);
         if (!(f <= 0.0F)) {
            class06069 class06069 = class06069.y(var3 * 312987231L);
            class07209 class07209xx = class07209.method_49638(var2.y());
            class07209 class07209x = null;
            int ix = 2 * var5 + 1;
            int j = ix * ix;
            int k = (int)(0.225F * j * f * f) / (var4 == class01315.field_18198 ? 2 : 1);

            for (int l = 0; l < k; l++) {
               int i1 = class06069.y(ix) - var5;
               int j1 = class06069.y(ix) - var5;
               class07209 class07209xx = var1.N(class07830.field_13197, class07209xx.method_10069(i1, 0, j1));
               if (class07209xx.method_10264() > var1.method_31607()
                  && class07209xx.method_10264() <= class07209xx.method_10264() + 10
                  && class07209xx.method_10264() >= class07209xx.method_10264() - 10
                  && this.N(var1, class07209xx) == class00801.field_9382) {
                  class07209x = class07209xx.method_10074();
                  if (var4 == class01315.field_18199) {
                     break;
                  }

                  double d0 = class06069.U();
                  double d1 = class06069.U();
                  class00500 class00500 = var1.method_8320(class07209x);
                  class04688 class04688 = var1.method_8316(class07209x);
                  double d2 = class00500.M(var1, class07209x).method_1102(class07185.field_11052, d0, d1);
                  double d3 = class04688.N(var1, class07209x);
                  double d4 = Math.max(d2, d3);
                  class07134 class07134 = !class04688.N(class01231.y) && !class00500.N(class00869.EI) && !class05847.U(class00500)
                     ? class07107.NB
                     : class07107.NZ;
                  var1.method_8406(class07134, class07209x.method_10263() + d0, class07209x.method_10264() + d4, class07209x.method_10260() + d1, 0.0, 0.0, 0.0);
               }
            }

            if (class07209x != null && class06069.y(3) < this.M++) {
               this.M = 0;
               if (class07209x.method_10264() > class07209xx.method_10264() + 1
                  && var1.N(class07830.field_13197, class07209xx).method_10264() > class04995.y((float)class07209xx.method_10264())) {
                  var1.method_45446(class07209x, class04909.Id, class04911.field_15252, 0.1F, 0.5F, false);
               } else {
                  var1.method_45446(class07209x, class04909.Il, class04911.field_15252, 0.2F, 1.0F, false);
               }
            }
         }
      }
   }

   private void y(class01407 var1, class06889 var2, class06966 var3) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(callbackinfo);
      if (!callbackinfo.isCancelled()) {
         List<class02455> list = var3.N;
         if (!this.N(list)) {
            class07311 class07311x = class06851.R(L, class06202.C());
            this.N(var1.method_73477(class07311x), var3.N, var2, 1.0F, var3.u, var3.L);
         }

         list = var3.y;
         if (!this.N(list)) {
            class07311 class07311 = class06851.R(u, class06202.C());
            this.N(var1.method_73477(class07311), var3.y, var2, 0.8F, var3.u, var3.L);
         }
      }
   }

   private class02455 y(class06069 var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8) {
      float f = var2 + var8;
      float f1 = (float)(var1.U() + f * 0.01F * (float)var1.E());
      float f2 = (float)(var1.U() + f * (float)var1.E() * 0.001F);
      float f3 = -((var2 & 511) + var8) / 512.0F;
      int ix = class03042.N((class03042.N(var7) * 3 + 15) / 4, (class03042.y(var7) * 3 + 15) / 4);
      return new class02455(var3, var6, var4, var5, f1, f3 + f2, ix);
   }

   public void N(class01407 var1, class06889 var2, class06966 var3) {
      this.N(var1, var2, var3, var1x -> {
         WrapOperationRuntime.checkArgumentCount(var1x, 3, "[net.minecraft.class_4597, net.minecraft.class_243, net.minecraft.class_12077]");
         this.y((class01407)var1x[0], (class06889)var1x[1], (class06966)var1x[2]);
         return (Void)null;
      });
   }

   private void N(class07299 var1, class07209 var2, CallbackInfoReturnable var3) {
      if (CPEAdditions.isSnowing()) {
         var3.setReturnValue(class00801.field_9383);
      }
   }

   private boolean N(List var1) {
      return CPEAdditions.isSnowing() ? false : var1.isEmpty();
   }

   private void N(CallbackInfo var1) {
      if (!SodiumExtraClientMod.options().detailSettings.rainSnow) {
         var1.cancel();
      }
   }

   public void N(class07299 var1, int var2, float var3, class06889 var4, class06966 var5) {
      var5.L = var1.method_8430(var3);
      if (!(var5.L <= 0.0F)) {
         var5.u = ((class05630)class06202.Nq().i_7).W().method_41753();
         int ix = class04995.N(var4.M);
         int j = class04995.N(var4.B);
         int k = class04995.N(var4.Z);
         class07218 class07218 = new class07218();
         class06069 class06069 = class06069.u();

         for (int l = k - var5.u; l <= k + var5.u; l++) {
            for (int i1 = ix - var5.u; i1 <= ix + var5.u; i1++) {
               int j1 = var1.method_8624(class07830.field_13197, i1, l);
               int k1 = Math.max(j - var5.u, j1);
               int l1 = Math.max(j + var5.u, j1);
               if (l1 - k1 != 0) {
                  class00801 class00801 = this.N(var1, class07218.N(i1, j, l));
                  if (class00801 != class00801.field_9384) {
                     int i2 = i1 * i1 * 3121 + i1 * 45238971 ^ l * l * 418711 + l * 13761;
                     class06069.N(i2);
                     int j2 = Math.max(j, j1);
                     int k2 = class03063.N(var1, class07218.N(i1, j2, l));
                     if (class00801 == class00801.field_9382) {
                        var5.N.add(this.N(class06069, var2, i1, k1, l1, l, k2, var3));
                     } else if (class00801 == class00801.field_9383) {
                        var5.y.add(this.y(class06069, var2, i1, k1, l1, l, k2, var3));
                     }
                  }
               }
            }
         }
      }
   }

   private void N(class01407 var1, class06889 var2, class06966 var3, Operation var4) {
      if (Iris.getPipelineManager().getPipeline().<Boolean>map(WorldRenderingPipeline::shouldRenderWeather).orElse(true)) {
         var4.call(new Object[]{var1, var2, var3});
      }
   }

   private void N(class01391 var1, List<class02455> var2, class06889 var3, float var4, int var5, float var6) {
      float f = var5 * var5;

      for (class02455 class02455 : var2) {
         float f1 = (float)(class02455.N() + 0.5 - var3.M);
         float f2 = (float)(class02455.y() + 0.5 - var3.Z);
         int ix = class02566.y(class04995.B(Math.min((float)class04995.i((double)f1, (double)f2) / f, 1.0F), var4, 0.5F) * var6);
         int j = (class02455.y() - class04995.N(var3.Z) + 16) * 32 + class02455.N() - class04995.N(var3.M) + 16;
         float f3 = this.B[j] / 2.0F;
         float f4 = this.Z[j] / 2.0F;
         float f5 = f1 - f3;
         float f6 = f1 + f3;
         float f7 = (float)(class02455.u() - var3.B);
         float f8 = (float)(class02455.L() - var3.B);
         float f9 = f2 - f4;
         float f10 = f2 + f4;
         float f11 = class02455.i() + 0.0F;
         float f12 = class02455.i() + 1.0F;
         float f13 = class02455.L() * 0.25F + class02455.R();
         float f14 = class02455.u() * 0.25F + class02455.R();
         var1.method_22912(f5, f7, f9).method_22913(f11, f13).method_39415(ix).method_60803(class02455.M());
         var1.method_22912(f6, f7, f10).method_22913(f12, f13).method_39415(ix).method_60803(class02455.M());
         var1.method_22912(f6, f8, f10).method_22913(f12, f14).method_39415(ix).method_60803(class02455.M());
         var1.method_22912(f5, f8, f9).method_22913(f11, f14).method_39415(ix).method_60803(class02455.M());
      }
   }

   public void N(class03448 var1, class05363 var2, int var3, class01315 var4, int var5) {
      this.N(var1, var2, var3, var4, var5, (Operation)(var1x -> {
         WrapOperationRuntime.checkArgumentCount(var1x, 5, "[net.minecraft.class_638, net.minecraft.class_4184, int, net.minecraft.class_4066, int]");
         this.y((class03448)var1x[0], (class05363)var1x[1], (Integer)var1x[2], (class01315)var1x[3], (Integer)var1x[4]);
         return (Void)null;
      }));
   }

   private class00801 N(class07299 var1, class07209 var2) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class00801)callbackinforeturnable.getReturnValue();
      } else {
         return !var1.method_8398().L(class01296.N(var2.method_10263()), class01296.N(var2.method_10260()))
            ? class00801.field_9384
            : var1.i(var2).N().N(var2, var1.method_8615());
      }
   }

   private class02455 N(class06069 var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8) {
      int ix = var2 & 131071;
      int j = var3 * var3 * 3121 + var3 * 45238971 + var6 * var6 * 418711 + var6 * 13761 & 0xFF;
      float f = 3.0F + var1.z();
      float f1 = -(ix + j + var8) / 32.0F * f % 32.0F;
      return new class02455(var3, var6, var4, var5, 0.0F, f1, var7);
   }

   private void N(class03448 var1, class05363 var2, int var3, class01315 var4, int var5, Operation var6) {
      if (!Iris.getPipelineManager().getPipeline().<Boolean>map(WorldRenderingPipeline::shouldRenderWeatherParticles).orElse(true)) {
         var6.call(new Object[]{var1, var2, var3, class01315.field_18199, var5});
      } else {
         var6.call(new Object[]{var1, var2, var3, var4, var5});
      }
   }

   public void N(class03448 var1, class05363 var2, int var3, class01315 var4, int var5, CallbackInfo var6) {
      if (!SodiumExtraClientMod.options().particleSettings.particles || !SodiumExtraClientMod.options().particleSettings.rainSplash) {
         var6.cancel();
      }
   }
}
