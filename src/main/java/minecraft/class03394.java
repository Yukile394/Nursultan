package minecraft;

import Nursultan.class09324;
import Nursultan.class11938;
import com.google.common.collect.Lists;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.buffers.GpuBuffer.MappedView;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import java.util.List;
import me.flashyreese.mods.sodiumextra.client.fog.FogEnvironmentExtended;
import net.caffeinemc.mods.sodium.client.util.FogParameters;
import net.caffeinemc.mods.sodium.client.util.FogStorage;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import org.joml.Vector4f;
import org.lwjgl.system.MemoryStack;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class03394 implements AutoCloseable, FogStorage {
   public static final int N = new Std140SizeCalculator().putVec4().putFloat().putFloat().putFloat().putFloat().putFloat().putFloat().get();
   private static final List<class09005> y = Lists.newArrayList(
      new class09005[]{new class08995(), new class09017(), new class03968(), new class03998(), new class09043(), new class09042()}
   );
   private static boolean L = true;
   private final GpuBuffer u;
   private final class00084 i;
   private FogParameters R = FogParameters.NONE;

   public class03394() {
      super();
      GpuDevice gpudevice = RenderSystem.getDevice();
      this.i = new class00084(() -> "Fog UBO", 130, N);
      MemoryStack memorystack = MemoryStack.stackPush();

      try {
         ByteBuffer bytebuffer = memorystack.malloc(N);
         this.N(bytebuffer, 0, new Vector4f(0.0F), Float.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE);
         this.u = gpudevice.createBuffer(() -> "Empty fog", 128, bytebuffer.flip());
      } catch (Throwable throwable1) {
         if (memorystack != null) {
            try {
               memorystack.close();
            } catch (Throwable throwable) {
               throwable1.addSuppressed(throwable);
            }
         }

         throw throwable1;
      }

      if (memorystack != null) {
         memorystack.close();
      }

      RenderSystem.setShaderFog(this.N(class03396.field_60101));
   }

   @Override
   public void close() {
      this.u.close();
      this.i.close();
   }

   private void y(class05363 var1, int var2, class02233 var3, float var4, class03448 var5, CallbackInfoReturnable var6) {
      CapturedRenderingState.INSTANCE
         .setFogColor(((Vector4f)var6.getReturnValue()).x, ((Vector4f)var6.getReturnValue()).y, ((Vector4f)var6.getReturnValue()).z);
   }

   public static boolean y() {
      return L = !L;
   }

   private Vector4f N(Vector4f var1) {
      class09324 class09324 = class09324.N(var1.x, var1.y, var1.z, var1.w);
      class11938.L().L(class09324);
      return new Vector4f(class09324.L(), class09324.u(), class09324.N(), class09324.y());
   }

   public void N(
      class05363 var1,
      int var2,
      class02233 var3,
      float var4,
      class03448 var5,
      CallbackInfoReturnable var6,
      float var7,
      Vector4f var8,
      float var9,
      class04798 var10,
      class07049 var11,
      class03970 var12
   ) {
      for (class09005 class09005 : y) {
         if (class09005.N(var10, var11) && class09005 instanceof FogEnvironmentExtended) {
            class09005.sodium_extra$applyFogSettings(var10, var12, var11, var1.u(), var5, var9);
            break;
         }
      }
   }

   private void N(class05363 var1, int var2, class02233 var3, float var4, class03448 var5, CallbackInfoReturnable var6) {
      if (var1.W() == class04798.field_27886) {
         class07049 class07049 = var1.B();
         float f = 0.05F;
         if (class07049 instanceof class04453 class04453) {
            f -= class04453.j() * class04453.j() * 0.03F;
            class03556<class00780> class03556 = class04453.method_73183().i(class04453.method_24515());
         }

         CapturedRenderingState.INSTANCE.setFogDensity(f);
      } else {
         CapturedRenderingState.INSTANCE.setFogDensity(-1.0F);
      }
   }

   private void N(class05363 var1, int var2, class02233 var3, float var4, class03448 var5, CallbackInfoReturnable var6, class03970 var7, Vector4f var8) {
      this.R = new FogParameters(var8.x, var8.y, var8.z, var8.w, var7.N, var7.L, var7.y, var7.u);
   }

   public GpuBufferSlice N(class03396 var1) {
      if (!L) {
         return this.u.slice(0L, N);
      } else {
         return switch (var1) {
            case field_60101 -> this.u.slice(0L, N);
            case field_60102 -> this.i.y().slice(0L, N);
         };
      }
   }

   private Vector4f N(class05363 var1, float var2, class03448 var3, int var4, float var5) {
      class04798 class04798 = this.N(var1);
      class07049 class07049 = var1.B();
      class09005 class09005xx = null;
      class09005 class09005x = null;

      for (class09005 class09005xx : y) {
         if (class09005xx.N(class04798, class07049)) {
            if (class09005xx == null && class09005xx.N()) {
               class09005xx = class09005xx;
            }

            if (class09005x == null && class09005xx.y()) {
               class09005x = class09005xx;
            }
         }
      }

      if (class09005xx == null) {
         throw new IllegalStateException("No color source environment found");
      } else {
         int ix = class09005xx.N(var3, var1, var4, var2);
         float f4 = var3.method_8401().u();
         float f = class04995.N((f4 + var3.method_31607() - (float)var1.y().B) / f4, 0.0F, 1.0F);
         if (class09005x != null) {
            class07438 class07438x = (class07438)class07049;
            f = class09005x.N(class07438x, f, var2);
         }

         float f5 = class02566.m(ix);
         float f1 = class02566.P(ix);
         float f2 = class02566.s(ix);
         if (f > 0.0F && class04798 != class04798.field_27885 && class04798 != class04798.field_27887) {
            float f3 = class04995.z(1.0F - f);
            f5 *= f3;
            f1 *= f3;
            f2 *= f3;
         }

         if (var5 > 0.0F) {
            f5 = class04995.B(var5, f5, f5 * 0.7F);
            f1 = class04995.B(var5, f1, f1 * 0.6F);
            f2 = class04995.B(var5, f2, f2 * 0.6F);
         }

         float f6;
         if (class04798 == class04798.field_27886) {
            if (class07049 instanceof class04453) {
               f6 = ((class04453)class07049).j();
            } else {
               f6 = 1.0F;
            }
         } else if (class07049 instanceof class07438 class07438 && class07438.method_6059(class07047.s) && !class07438.method_6059(class07047.J)) {
            f6 = class03386.N(class07438, var2);
         } else {
            f6 = 0.0F;
         }

         if (f5 != 0.0F && f1 != 0.0F && f2 != 0.0F) {
            float f7 = 1.0F / Math.max(f5, Math.max(f1, f2));
            f5 = class04995.B(f6, f5, f5 * f7);
            f1 = class04995.B(f6, f1, f1 * f7);
            f2 = class04995.B(f6, f2, f2 * f7);
         }

         return new Vector4f(f5, f1, f2, 1.0F);
      }
   }

   public Vector4f N(class05363 var1, int var2, class02233 var3, float var4, class03448 var5) {
      this.N(var1, var2, var3, var4, var5, null);
      float f = var3.N(false);
      Vector4f vector4f = this.N(this.N(var1, f, var5, var2, var4));
      float f1 = var2 * 16;
      class04798 class04798 = this.N(var1);
      class07049 class07049 = var1.B();
      class03970 class03970 = new class03970();

      for (class09005 class09005 : y) {
         if (class09005.N(class04798, class07049)) {
            class09005.N(class03970, var1, var5, f1, var3);
            break;
         }
      }

      float f2 = class04995.N(f1 / 10.0F, 4.0F, 64.0F);
      class03970.y = f1 - f2;
      class03970.u = f1;
      this.N(var1, var2, var3, var4, var5, null, f, vector4f, f1, class04798, class07049, class03970);
      MappedView mappedview = RenderSystem.getDevice().createCommandEncoder().mapBuffer(this.i.y(), false, true);

      try {
         ByteBuffer bytebuffer = mappedview.data();
         float f3 = class03970.N;
         float f4 = class03970.L;
         float f5 = class03970.y;
         float f6 = class03970.u;
         float f7 = class03970.i;
         float f8 = class03970.R;
         this.N(var1, var2, var3, var4, var5, null, class03970, vector4f);
         this.N(bytebuffer, 0, vector4f, f3, f4, f5, f6, f7, f8);
      } catch (Throwable throwable1) {
         if (mappedview != null) {
            try {
               mappedview.close();
            } catch (Throwable throwable) {
               throwable1.addSuppressed(throwable);
            }
         }

         throw throwable1;
      }

      if (mappedview != null) {
         mappedview.close();
      }

      this.y(var1, var2, var3, var4, var5, new CallbackInfoReturnable("", false, vector4f));
      return vector4f;
   }

   public void N() {
      this.i.L();
   }

   private void N(ByteBuffer var1, int var2, Vector4f var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      var1.position(var2);
      Std140Builder.intoBuffer(var1).putVec4(var3).putFloat(var4).putFloat(var5).putFloat(var6).putFloat(var7).putFloat(var8).putFloat(var9);
   }

   private class04798 N(class05363 var1) {
      class04798 class04798 = var1.W();
      return class04798 == class04798.field_27888 ? class04798.field_60563 : class04798;
   }

   public FogParameters sodium$getFogParameters() {
      return this.R;
   }
}
