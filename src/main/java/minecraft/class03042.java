package minecraft;

import Nursultan.class09308;
import Nursultan.class10993;
import Nursultan.class11938;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalFloatRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalFloatRef;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.buffers.GpuBuffer.MappedView;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import java.util.OptionalInt;
import net.irisshaders.iris.mixin.LightTextureAccessor;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import org.joml.Vector3f;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class03042 implements AutoCloseable, LightTextureAccessor {
   public static final int N = 15728880;
   public static final int y = 15728640;
   public static final int L = 240;
   private static final int u = 16;
   private static final int i = new Std140SizeCalculator()
      .putFloat()
      .putFloat()
      .putFloat()
      .putFloat()
      .putFloat()
      .putFloat()
      .putFloat()
      .putVec3()
      .putVec3()
      .get();
   private final GpuTexture R;
   private final GpuTextureView M;
   private boolean B;
   private float Z;
   private final class03386 z;
   private final class06202 U;
   private final class00084 E;
   private final class06069 W = class06069.u();

   public class03042(class03386 var1, class06202 var2) {
      super();
      this.z = var1;
      this.U = var2;
      GpuDevice gpudevice = RenderSystem.getDevice();
      this.R = gpudevice.createTexture("Light Texture", 12, TextureFormat.RGBA8, 16, 16, 1, 1);
      this.M = gpudevice.createTextureView(this.R);
      gpudevice.createCommandEncoder().clearColorTexture(this.R, -1);
      this.E = new class00084(() -> "Lightmap UBO", 130, i);
   }

   @Override
   public void close() {
      this.R.close();
      this.M.close();
      this.E.close();
   }

   private void y(CallbackInfoReturnable var1) {
      class10993 class10993 = class10993.L();
      class11938.L().L(class10993);
      if (class10993.y()) {
         var1.setReturnValue(0.0F);
      }
   }

   public static int y(int var0, int var1) {
      if (var1 == 0) {
         return var0;
      } else {
         int ix = Math.max(y(var0), var1);
         return N(Math.max(N(var0), var1), ix);
      }
   }

   public static int y(int var0) {
      return var0 >>> 20 & 15;
   }

   public void y() {
      this.Z = this.Z + (this.W.z() - this.W.z()) * this.W.z() * this.W.z() * 0.1F;
      this.Z *= 0.9F;
      this.B = true;
   }

   private void N(class07438 var1, float var2, float var3, CallbackInfoReturnable var4) {
      CapturedRenderingState.INSTANCE
         .setDarknessLightFactor((float)(((Float)var4.getReturnValue()).floatValue() * ((class05630)this.U.i_7).NO().method_41753()));
   }

   private void N(float var1, CallbackInfo var2) {
      CapturedRenderingState.INSTANCE.setDarknessLightFactor(0.0F);
   }

   public static int N(int var0, int var1) {
      return var0 << 4 | var1 << 20;
   }

   private class04643 N(class04643 var1, LocalFloatRef var2) {
      class09308 class09308 = class09308.N(var2.get());
      class11938.L().L(class09308);
      var2.set(class09308.N());
      return var1;
   }

   private void N(CallbackInfoReturnable var1) {
      class10993 class10993 = class10993.L();
      class11938.L().L(class10993);
      if (class10993.y()) {
         var1.setReturnValue(0.0F);
      }
   }

   public GpuTextureView N() {
      return this.M;
   }

   public static int N(int var0) {
      return var0 >>> 4 & 15;
   }

   public static float N(float var0, int var1) {
      float f = var1 / 15.0F;
      float f1 = f / (4.0F - 3.0F * f);
      return class04995.B(var0, f1, 1.0F);
   }

   public static float N(class07376 var0, int var1) {
      return N(var0.E(), var1);
   }

   public void N(float var1) {
      if (this.B) {
         this.B = false;
         class04643 class04643x = class08700.N();
         class04643x.N("lightTex");
         class03448 class03448 = (class03448)this.U.T_3;
         if (class03448 != null) {
            class05363 class05363 = ((class03386)this.U.i_5).s();
            class00579 class00579 = class05363.U();
            class00607 class00607 = class00608.b;
            this.N(var1, null);
            int ix = class00579.<Integer>N(class00607, var1);
            float f = class03448.method_8597().E();
            float f1 = class05363.U().N(class00608.j, var1);
            class00917 class00917 = class03448.R();
            Vector3f vector3f;
            if (class00917 != null) {
               vector3f = new Vector3f(0.99F, 1.12F, 1.0F);
               if (!((class05630)this.U.i_7).y().method_41753()) {
                  float f2 = class00917.N(var1);
                  if (((class01056)this.U.i_6).U().u()) {
                     f1 += f2 / 3.0F;
                  } else {
                     f1 += f2;
                  }
               }
            } else {
               vector3f = new Vector3f(1.0F, 1.0F, 1.0F);
            }

            float f9 = ((class05630)this.U.i_7).NO().method_41753().floatValue();
            float f3 = ((class04453)this.U.T_4).method_66279(class07047.J, var1) * f9;
            float f4 = this.N((class04453)this.U.T_4, f3, var1) * f9;
            float f6 = ((class04453)this.U.T_4).j();
            float f5;
            if (((class04453)this.U.T_4).method_6059(class07047.s)) {
               f5 = class03386.N((class04453)this.U.T_4, var1);
            } else if (f6 > 0.0F && ((class04453)this.U.T_4).method_6059(class07047.Q)) {
               f5 = f6;
            } else {
               f5 = 0.0F;
            }

            float f7 = this.Z + 1.5F;
            float f8 = ((class05630)this.U.i_7).No().method_41753().floatValue();
            CommandEncoder commandencoder1 = RenderSystem.getDevice().createCommandEncoder();
            LocalFloatRefImpl localfloatrefimpl = new LocalFloatRefImpl();
            localfloatrefimpl.init(f5);
            class04643 class04643x = this.N(class04643x, localfloatrefimpl);
            f5 = localfloatrefimpl.dispose();
            class04643x = class04643x;
            CommandEncoder commandencoder = commandencoder1;
            MappedView mappedview = commandencoder.mapBuffer(this.E.y(), false, true);

            try {
               Std140Builder.intoBuffer(mappedview.data())
                  .putFloat(f)
                  .putFloat(f1)
                  .putFloat(f7)
                  .putFloat(f5)
                  .putFloat(f4)
                  .putFloat(this.z.L(var1))
                  .putFloat(Math.max(0.0F, f8 - f3))
                  .putVec3(class02566.U(ix))
                  .putVec3(vector3f);
            } catch (Throwable throwable3) {
               if (mappedview != null) {
                  try {
                     mappedview.close();
                  } catch (Throwable throwable1) {
                     throwable3.addSuppressed(throwable1);
                  }
               }

               throw throwable3;
            }

            if (mappedview != null) {
               mappedview.close();
            }

            RenderPass renderpass = commandencoder.createRenderPass(() -> "Update light", this.M, OptionalInt.empty());

            try {
               renderpass.setPipeline(class08394.yu);
               RenderSystem.bindDefaultUniforms(renderpass);
               renderpass.setUniform("LightmapInfo", this.E.y());
               renderpass.draw(0, 3);
            } catch (Throwable throwable2) {
               if (renderpass != null) {
                  try {
                     renderpass.close();
                  } catch (Throwable throwable) {
                     throwable2.addSuppressed(throwable);
                  }
               }

               throw throwable2;
            }

            if (renderpass != null) {
               renderpass.close();
            }

            this.E.L();
            class04643x.L();
         }
      }
   }

   private float N(class07438 var1, float var2, float var3) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueF();
      } else {
         CallbackInfoReturnable callbackinforeturnable1 = new CallbackInfoReturnable("", true);
         this.y(callbackinforeturnable1);
         if (callbackinforeturnable1.isCancelled()) {
            return callbackinforeturnable1.getReturnValueF();
         } else {
            float f = 0.45F * var2;
            float f1;
            float f2 = f1 = Math.max(0.0F, class04995.P((var1.field_6012 - var3) * (float) Math.PI * 0.025F) * f);
            this.N(var1, var2, var3, new CallbackInfoReturnable("", false, f1));
            return f2;
         }
      }
   }
}
