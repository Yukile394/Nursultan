package minecraft;

import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalBooleanRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalBooleanRef;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.impl.client.rendering.fluid.FluidRenderHandlerInfo;
import net.fabricmc.fabric.impl.client.rendering.fluid.FluidRenderHandlerRegistryImpl;
import net.fabricmc.fabric.impl.client.rendering.fluid.FluidRenderingImpl;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
public class class03760 {
   private static final float N = 0.8888889F;
   private final class08388 y;
   private final class08388 L;
   private final class08388 u;
   private final class08388 i;
   private final class08388 R;

   public class03760(class08097 var1) {
      super();
      this.y = var1.N(class08874.L);
      this.L = var1.N(class08874.u);
      this.u = var1.N(class08874.i);
      this.i = var1.N(class08874.R);
      this.R = var1.N(class08874.M);
      this.N(null);
   }

   private static boolean y(class07211 var0, float var1, class00500 var2) {
      return N(var0, var1, var2);
   }

   public class08388 y(class08388 var1) {
      return this.N(1, var1);
   }

   private class08388 N(int var1, class08388 var2) {
      FluidRenderHandlerInfo fluidrenderhandlerinfo = FluidRenderingImpl.getCurrentInfo();
      if (fluidrenderhandlerinfo.handler == null) {
         return var2;
      } else {
         return fluidrenderhandlerinfo.sprites.length == var1 - 1 ? var2 : fluidrenderhandlerinfo.sprites[var1];
      }
   }

   public void N(class07295 var1, class07209 var2, class01391 var3, class00500 var4, class04688 var5, CallbackInfo var6) {
      if (FluidRenderingImpl.getCurrentInfo().handler == null) {
         FluidRenderHandler fluidrenderhandler = FluidRenderHandlerRegistry.INSTANCE.get(var5.N());
         if (fluidrenderhandler != null) {
            fluidrenderhandler.renderFluid(var2, var1, var3, var4, var5);
            var6.cancel();
         }
      }
   }

   public void N(CallbackInfo var1) {
      ((FluidRenderHandlerRegistryImpl)FluidRenderHandlerRegistry.INSTANCE)
         .onFluidRendererReload(this, new class08388[]{this.u, this.i, this.R}, new class08388[]{this.y, this.L}, this.R);
   }

   private int N(class07295 var1, class07209 var2) {
      int ix = class03063.N(var1, var2);
      int j = class03063.N(var1, var2.method_10084());
      int k = ix & 0xFF;
      int l = j & 0xFF;
      int i1 = ix >> 16 & 0xFF;
      int j1 = j >> 16 & 0xFF;
      return (k > l ? k : l) | (i1 > j1 ? i1 : j1) << 16;
   }

   private void N(class01391 var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
      var1.method_22912(var2, var3, var4).method_22915(var5, var6, var7, 1.0F).method_22913(var8, var9).method_60803(var10).method_22914(0.0F, 1.0F, 0.0F);
   }

   private boolean N(boolean var1, LocalBooleanRef var2) {
      return !var2.get();
   }

   private class08388 N(class08388 var1, class07295 var2, class07209 var3, boolean var4, class08388 var5, LocalBooleanRef var6) {
      FluidRenderHandlerInfo fluidrenderhandlerinfo = FluidRenderingImpl.getCurrentInfo();
      boolean flag = fluidrenderhandlerinfo.handler != null ? fluidrenderhandlerinfo.hasOverlay : !var4;
      class00891 class00891 = var2.method_8320(var3).i();
      var6.set(flag && FluidRenderHandlerRegistry.INSTANCE.isBlockTransparent(class00891));
      if (var6.get()) {
         return fluidrenderhandlerinfo.handler != null ? fluidrenderhandlerinfo.overlaySprite : this.R;
      } else {
         return var5;
      }
   }

   public int N(int var1, class07295 var2, class07209 var3, class01391 var4, class00500 var5, class04688 var6) {
      FluidRenderHandlerInfo fluidrenderhandlerinfo = FluidRenderingImpl.getCurrentInfo();
      return fluidrenderhandlerinfo.handler != null ? fluidrenderhandlerinfo.handler.getFluidColor(var2, var3, var6) : var1;
   }

   public class08388 N(class08388 var1) {
      return this.N(0, var1);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void N(class07295 var1, class07209 var2, class01391 var3, class00500 var4, class04688 var5) {
      LocalBooleanRefImpl localbooleanrefimpl = new LocalBooleanRefImpl();
      localbooleanrefimpl.init(false);
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, var3, var4, var5, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         boolean flag = var5.N(class01231.y);
         class08388 class08388x = flag ? this.y : this.u;
         class08388x = this.N(class08388x);
         class08388 class08388x = flag ? this.L : this.i;
         class08388x = this.y(class08388x);
         int ix = flag ? this.N(16777215, var1, var2, var3, var4, var5) : this.N(class06229.u(var1, var2), var1, var2, var3, var4, var5);
         float f = (ix >> 16 & 0xFF) / 255.0F;
         float f1 = (ix >> 8 & 0xFF) / 255.0F;
         float f2 = (ix & 0xFF) / 255.0F;
         class00500 class00500xxx = var1.method_8320(var2.method_10093(class07211.field_11033));
         class04688 class04688xxx = class00500xxx.Y();
         class00500 class00500x = var1.method_8320(var2.method_10093(class07211.field_11036));
         class04688 class04688x = class00500x.Y();
         class00500 class00500xx = var1.method_8320(var2.method_10093(class07211.field_11043));
         class04688 class04688xx = class00500xx.Y();
         class00500 class00500xxx = var1.method_8320(var2.method_10093(class07211.field_11035));
         class04688 class04688xxx = class00500xxx.Y();
         class00500 class00500xxxx = var1.method_8320(var2.method_10093(class07211.field_11039));
         class04688 class04688xxxx = class00500xxxx.Y();
         class00500 class00500xxxxx = var1.method_8320(var2.method_10093(class07211.field_11034));
         class04688 class04688xxxxx = class00500xxxxx.Y();
         boolean flag1 = !N(var5, class04688x);
         boolean flag2 = N(var5, var4, class07211.field_11033, class04688xxx) && !y(class07211.field_11033, 0.8888889F, class00500xxx);
         boolean flag3 = N(var5, var4, class07211.field_11043, class04688xx);
         boolean flag4 = N(var5, var4, class07211.field_11035, class04688xxx);
         boolean flag5 = N(var5, var4, class07211.field_11039, class04688xxxx);
         boolean flag6 = N(var5, var4, class07211.field_11034, class04688xxxxx);
         if (flag1 || flag2 || flag6 || flag5 || flag3 || flag4) {
            float f3 = var1.method_24852(class07211.field_11033, true);
            float f4 = var1.method_24852(class07211.field_11036, true);
            float f5 = var1.method_24852(class07211.field_11043, true);
            float f6 = var1.method_24852(class07211.field_11039, true);
            class04651 class04651 = var5.N();
            float f11 = this.N(var1, class04651, var2, var4, var5);
            float f7;
            float f8;
            float f9;
            float f10;
            if (f11 >= 1.0F) {
               f7 = 1.0F;
               f8 = 1.0F;
               f9 = 1.0F;
               f10 = 1.0F;
            } else {
               float f12 = this.N(var1, class04651, var2.method_10095(), class00500xx, class04688xx);
               float f13 = this.N(var1, class04651, var2.method_10072(), class00500xxx, class04688xxx);
               float f14 = this.N(var1, class04651, var2.method_10078(), class00500xxxxx, class04688xxxxx);
               float f15 = this.N(var1, class04651, var2.method_10067(), class00500xxxx, class04688xxxx);
               f7 = this.N(var1, class04651, f11, f12, f14, var2.method_10093(class07211.field_11043).method_10093(class07211.field_11034));
               f8 = this.N(var1, class04651, f11, f12, f15, var2.method_10093(class07211.field_11043).method_10093(class07211.field_11039));
               f9 = this.N(var1, class04651, f11, f13, f14, var2.method_10093(class07211.field_11035).method_10093(class07211.field_11034));
               f10 = this.N(var1, class04651, f11, f13, f15, var2.method_10093(class07211.field_11035).method_10093(class07211.field_11039));
            }

            float f37 = var2.method_10263() & 15;
            float f38 = var2.method_10264() & 15;
            float f39 = var2.method_10260() & 15;
            float f40 = 0.001F;
            float f16 = flag2 ? 0.001F : 0.0F;
            if (flag1 && !y(class07211.field_11036, Math.min(Math.min(f8, f10), Math.min(f9, f7)), class00500x)) {
               f8 -= 0.001F;
               f10 -= 0.001F;
               f9 -= 0.001F;
               f7 -= 0.001F;
               class06889 class06889 = var5.L(var1, var2);
               float f17;
               float var47;
               float f19;
               float f20;
               float f21;
               float f22;
               float f23;
               float f24;
               if (class06889.M == 0.0 && class06889.Z == 0.0) {
                  f17 = class08388x.method_4580(0.0F);
                  f21 = class08388x.method_4570(0.0F);
                  var47 = f17;
                  f22 = class08388x.method_4570(1.0F);
                  f19 = class08388x.method_4580(1.0F);
                  f23 = f22;
                  f20 = f19;
                  f24 = f21;
               } else {
                  float f25 = (float)class04995.u(class06889.Z, class06889.M) - (float) (Math.PI / 2);
                  float f26 = class04995.m(f25) * 0.25F;
                  float f27 = class04995.P(f25) * 0.25F;
                  float f28 = 0.5F;
                  f17 = class08388x.method_4580(0.5F + (-f27 - f26));
                  f21 = class08388x.method_4570(0.5F + (-f27 + f26));
                  var47 = class08388x.method_4580(0.5F + (-f27 + f26));
                  f22 = class08388x.method_4570(0.5F + (f27 + f26));
                  f19 = class08388x.method_4580(0.5F + (f27 + f26));
                  f23 = class08388x.method_4570(0.5F + (f27 - f26));
                  f20 = class08388x.method_4580(0.5F + (f27 - f26));
                  f24 = class08388x.method_4570(0.5F + (-f27 - f26));
               }

               int l = this.N(var1, var2);
               float f54 = f4 * f;
               float f55 = f4 * f1;
               float f56 = f4 * f2;
               this.N(var3, f37 + 0.0F, f38 + f8, f39 + 0.0F, f54, f55, f56, f17, f21, l);
               this.N(var3, f37 + 0.0F, f38 + f10, f39 + 1.0F, f54, f55, f56, var47, f22, l);
               this.N(var3, f37 + 1.0F, f38 + f9, f39 + 1.0F, f54, f55, f56, f19, f23, l);
               this.N(var3, f37 + 1.0F, f38 + f7, f39 + 0.0F, f54, f55, f56, f20, f24, l);
               if (var5.y(var1, var2.method_10084())) {
                  this.N(var3, f37 + 0.0F, f38 + f8, f39 + 0.0F, f54, f55, f56, f17, f21, l);
                  this.N(var3, f37 + 1.0F, f38 + f7, f39 + 0.0F, f54, f55, f56, f20, f24, l);
                  this.N(var3, f37 + 1.0F, f38 + f9, f39 + 1.0F, f54, f55, f56, f19, f23, l);
                  this.N(var3, f37 + 0.0F, f38 + f10, f39 + 1.0F, f54, f55, f56, var47, f22, l);
               }
            }

            if (flag2) {
               float f41 = class08388x.method_4594();
               float f42 = class08388x.method_4577();
               float f43 = class08388x.method_4593();
               float f44 = class08388x.method_4575();
               int k = this.N(var1, var2.method_10074());
               float f47 = f3 * f;
               float f49 = f3 * f1;
               float f51 = f3 * f2;
               this.N(var3, f37, f38 + f16, f39 + 1.0F, f47, f49, f51, f41, f44, k);
               this.N(var3, f37, f38 + f16, f39, f47, f49, f51, f41, f43, k);
               this.N(var3, f37 + 1.0F, f38 + f16, f39, f47, f49, f51, f42, f43, k);
               this.N(var3, f37 + 1.0F, f38 + f16, f39 + 1.0F, f47, f49, f51, f42, f44, k);
            }

            int j = this.N(var1, var2);

            for (class07211 class07211 : class07221.field_11062) {
               float f45;
               float f46;
               float f48;
               float f50;
               float f52;
               float f53;
               boolean flag7;
               switch (class07211) {
                  case field_11043:
                     f45 = f8;
                     f46 = f7;
                     f48 = f37;
                     f52 = f37 + 1.0F;
                     f50 = f39 + 0.001F;
                     f53 = f39 + 0.001F;
                     flag7 = flag3;
                     break;
                  case field_11035:
                     f45 = f9;
                     f46 = f10;
                     f48 = f37 + 1.0F;
                     f52 = f37;
                     f50 = f39 + 1.0F - 0.001F;
                     f53 = f39 + 1.0F - 0.001F;
                     flag7 = flag4;
                     break;
                  case field_11039:
                     f45 = f10;
                     f46 = f8;
                     f48 = f37 + 0.001F;
                     f52 = f37 + 0.001F;
                     f50 = f39 + 1.0F;
                     f53 = f39;
                     flag7 = flag5;
                     break;
                  default:
                     f45 = f7;
                     f46 = f9;
                     f48 = f37 + 1.0F - 0.001F;
                     f52 = f37 + 1.0F - 0.001F;
                     f50 = f39;
                     f53 = f39 + 1.0F;
                     flag7 = flag6;
               }

               if (flag7 && !y(class07211, Math.max(f45, f46), var1.method_8320(var2.method_10093(class07211)))) {
                  class07209 class07209 = var2.method_10093(class07211);
                  class08388 class08388xx = class08388x;
                  if (!flag) {
                     class00891 class00891 = var1.method_8320(class07209).i();
                     if (class00891 instanceof class00741 || class00891 instanceof class07131) {
                        class08388xx = this.R;
                     }
                  }

                  class08388xx = this.N(class08388xx, var1, class07209, flag, class08388x, localbooleanrefimpl);
                  float f57 = class08388xx.method_4580(0.0F);
                  float f29 = class08388xx.method_4580(0.5F);
                  float f30 = class08388xx.method_4570((1.0F - f45) * 0.5F);
                  float f31 = class08388xx.method_4570((1.0F - f46) * 0.5F);
                  float f32 = class08388xx.method_4570(0.5F);
                  float f33 = class07211.z() == class07185.field_11051 ? f5 : f6;
                  float f34 = f4 * f33 * f;
                  float f35 = f4 * f33 * f1;
                  float f36 = f4 * f33 * f2;
                  this.N(var3, f48, f38 + f45, f50, f34, f35, f36, f57, f30, j);
                  this.N(var3, f52, f38 + f46, f53, f34, f35, f36, f29, f31, j);
                  this.N(var3, f52, f38 + f16, f53, f34, f35, f36, f29, f32, j);
                  this.N(var3, f48, f38 + f16, f50, f34, f35, f36, f57, f32, j);
                  if (this.N(class08388xx != this.R, localbooleanrefimpl)) {
                     this.N(var3, f48, f38 + f16, f50, f34, f35, f36, f57, f32, j);
                     this.N(var3, f52, f38 + f16, f53, f34, f35, f36, f29, f32, j);
                     this.N(var3, f52, f38 + f46, f53, f34, f35, f36, f29, f31, j);
                     this.N(var3, f48, f38 + f45, f50, f34, f35, f36, f57, f30, j);
                  }
               }
            }
         }
      }
   }

   public static boolean N(class04688 var0, class00500 var1, class07211 var2, class04688 var3) {
      return !N(var1, var2) && !N(var0, var3);
   }

   private static boolean N(class00500 var0, class07211 var1) {
      return N(var1.b(), 1.0F, var0);
   }

   private static boolean N(class07211 var0, float var1, class00500 var2) {
      class00494 class00494x = var2.N(var0.b());
      if (class00494x == class00389.N()) {
         return false;
      } else if (class00494x == class00389.y()) {
         boolean flag = var1 == 1.0F;
         return var0 != class07211.field_11036 || flag;
      } else {
         class00494 class00494x = class00389.N(0.0, 0.0, 0.0, 1.0, var1, 1.0);
         return class00389.N(class00494x, class00494x, var0);
      }
   }

   private static boolean N(class04688 var0, class04688 var1) {
      return var1.N().N(var0.N());
   }

   private float N(class07295 var1, class04651 var2, class07209 var3, class00500 var4, class04688 var5) {
      if (var2.N(var5.N())) {
         class00500 class00500 = var1.method_8320(var3.method_10084());
         return var2.N(class00500.Y().N()) ? 1.0F : var5.i();
      } else {
         return !var4.B() ? 0.0F : -1.0F;
      }
   }

   private float N(class07295 var1, class04651 var2, class07209 var3) {
      class00500 class00500 = var1.method_8320(var3);
      return this.N(var1, var2, var3, class00500, class00500.Y());
   }

   private void N(float[] var1, float var2) {
      if (var2 >= 0.8F) {
         var1[0] += var2 * 10.0F;
         var1[1] += 10.0F;
      } else if (var2 >= 0.0F) {
         var1[0] += var2;
         var1[1]++;
      }
   }

   private float N(class07295 var1, class04651 var2, float var3, float var4, float var5, class07209 var6) {
      if (!(var5 >= 1.0F) && !(var4 >= 1.0F)) {
         float[] afloat = new float[2];
         if (var5 > 0.0F || var4 > 0.0F) {
            float f = this.N(var1, var2, var6);
            if (f >= 1.0F) {
               return 1.0F;
            }

            this.N(afloat, f);
         }

         this.N(afloat, var3);
         this.N(afloat, var5);
         this.N(afloat, var4);
         return afloat[0] / afloat[1];
      } else {
         return 1.0F;
      }
   }
}
