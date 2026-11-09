package minecraft;

import com.mojang.blaze3d.textures.GpuTextureView;
import net.caffeinemc.mods.sodium.api.math.MatrixHelper;
import net.caffeinemc.mods.sodium.api.util.ColorARGB;
import net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter;
import net.caffeinemc.mods.sodium.api.vertex.format.common.GlyphVertex;
import net.caffeinemc.mods.sodium.client.render.vertex.VertexConsumerUtils;
import org.joml.Matrix4f;
import org.lwjgl.system.MemoryStack;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class05272 implements class07913, class07948 {
   public static final float N = 0.001F;
   final class05247 y;
   final class03504 L;
   public final GpuTextureView u;
   public final float i;
   public final float R;
   public final float M;
   public final float B;
   public final float Z;
   public final float z;
   public final float U;
   public final float E;

   private float L() {
      return 1.0F - 0.25F * this.U;
   }

   float L(class05274 var1) {
      return var1.u() + this.z + (var1.L() ? var1.j() : 0.0F) + (var1.z().u() ? Math.max(this.L(), this.y()) : 0.0F) + N(var1.z().L());
   }

   public class05272(
      class05247 var1, class03504 var2, GpuTextureView var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11
   ) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
      this.i = var4;
      this.R = var5;
      this.M = var6;
      this.B = var7;
      this.Z = var8;
      this.z = var9;
      this.U = var10;
      this.E = var11;
   }

   float u(class05274 var1) {
      return var1.i() + this.E + (var1.L() ? var1.j() : 0.0F) + N(var1.z().L());
   }

   private float y() {
      return 1.0F - 0.25F * this.E;
   }

   float y(class05274 var1) {
      return var1.i() + this.U - N(var1.z().L());
   }

   @Override
   public class07915 N(float var1, float var2, int var3, int var4, class00405 var5, float var6, float var7) {
      return new class05274(var1, var2, var3, var4, this, var5, var6, var7);
   }

   @Override
   public class00941 N(float var1, float var2, float var3, float var4, float var5, int var6, int var7, float var8) {
      return new class05245(this, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   public class05247 N() {
      return this.y;
   }

   private void N(boolean var1, float var2, float var3, float var4, Matrix4f var5, class01391 var6, int var7, boolean var8, int var9, CallbackInfo var10) {
      VertexBufferWriter vertexbufferwriter = VertexConsumerUtils.convertOrLog(var6);
      if (vertexbufferwriter != null) {
         var10.cancel();
         float f = var2 + this.Z;
         float f1 = var2 + this.z;
         float f2 = var3 + this.U;
         float f3 = var3 + this.E;
         float f4 = var1 ? 1.0F - 0.25F * this.U : 0.0F;
         float f5 = var1 ? 1.0F - 0.25F * this.E : 0.0F;
         float f6 = var8 ? 0.1F : 0.0F;
         int ix = ColorARGB.toABGR(var7);
         MemoryStack memorystack = MemoryStack.stackPush();

         try {
            long j = memorystack.nmalloc(112);
            N(j, var5, f + f4 - f6, f2 - f6, var4, ix, this.i, this.M, var9);
            long k = j + 28L;
            N(k, var5, f + f5 - f6, f3 + f6, var4, ix, this.i, this.B, var9);
            k += 28L;
            N(k, var5, f1 + f5 + f6, f3 + f6, var4, ix, this.R, this.B, var9);
            k += 28L;
            N(k, var5, f1 + f4 + f6, f2 - f6, var4, ix, this.R, this.M, var9);
            k += 28L;
            vertexbufferwriter.push(memorystack, j, 4, GlyphVertex.FORMAT);
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
      }
   }

   private void N(class05245 var1, float var2, float var3, int var4, class01391 var5, int var6, Matrix4f var7, CallbackInfo var8) {
      VertexBufferWriter vertexbufferwriter = VertexConsumerUtils.convertOrLog(var5);
      if (vertexbufferwriter != null) {
         var8.cancel();
         float f = var1.i();
         float f1 = var1.M();
         float f2 = var1.B();
         float f3 = var1.R();
         float f4 = var3;
         int ix = ColorARGB.toABGR(var4);
         MemoryStack memorystack = MemoryStack.stackPush();

         try {
            long j = memorystack.nmalloc(112);
            N(j, var7, f + var2, f2 + var2, f4, ix, this.i, this.M, var6);
            long k = j + 28L;
            N(k, var7, f1 + var2, f2 + var2, f4, ix, this.i, this.B, var6);
            k += 28L;
            N(k, var7, f1 + var2, f3 + var2, f4, ix, this.R, this.B, var6);
            k += 28L;
            N(k, var7, f + var2, f3 + var2, f4, ix, this.R, this.M, var6);
            k += 28L;
            vertexbufferwriter.push(memorystack, j, 4, GlyphVertex.FORMAT);
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
      }
   }

   private static void N(long var0, Matrix4f var2, float var3, float var4, float var5, int var6, float var7, float var8, int var9) {
      float f = MatrixHelper.transformPositionX(var2, var3, var4, var5);
      float f1 = MatrixHelper.transformPositionY(var2, var3, var4, var5);
      float f2 = MatrixHelper.transformPositionZ(var2, var3, var4, var5);
      GlyphVertex.put(var0, f, f1, f2, var6, var7, var8, var9);
   }

   void N(class05274 var1, Matrix4f var2, class01391 var3, int var4, boolean var5) {
      class00405 class00405 = var1.z();
      boolean flag = class00405.u();
      float f = var1.u();
      float f1 = var1.i();
      int ix = var1.R();
      boolean flag1 = class00405.L();
      float f3 = var5 ? 0.0F : 0.001F;
      float f2;
      if (var1.L()) {
         int j = var1.M();
         this.N(flag, f + var1.j(), f1 + var1.j(), 0.0F, var2, var3, j, flag1, var4);
         if (flag1) {
            this.N(flag, f + var1.Z() + var1.j(), f1 + var1.j(), f3, var2, var3, j, true, var4);
         }

         f2 = var5 ? 0.0F : 0.03F;
      } else {
         f2 = 0.0F;
      }

      this.N(flag, f, f1, f2, var2, var3, ix, flag1, var4);
      if (flag1) {
         this.N(flag, f + var1.Z(), f1, f2 + f3, var2, var3, ix, true, var4);
      }
   }

   private void N(boolean var1, float var2, float var3, float var4, Matrix4f var5, class01391 var6, int var7, boolean var8, int var9) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, var3, var4, var5, var6, var7, var8, var9, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         float f = var2 + this.Z;
         float f1 = var2 + this.z;
         float f2 = var3 + this.U;
         float f3 = var3 + this.E;
         float f4 = var1 ? this.L() : 0.0F;
         float f5 = var1 ? this.y() : 0.0F;
         float f6 = N(var8);
         var6.N(var5, f + f4 - f6, f2 - f6, var4).method_39415(var7).method_22913(this.i, this.M).method_60803(var9);
         var6.N(var5, f + f5 - f6, f3 + f6, var4).method_39415(var7).method_22913(this.i, this.B).method_60803(var9);
         var6.N(var5, f1 + f5 + f6, f3 + f6, var4).method_39415(var7).method_22913(this.R, this.B).method_60803(var9);
         var6.N(var5, f1 + f4 + f6, f2 - f6, var4).method_39415(var7).method_22913(this.R, this.M).method_60803(var9);
      }
   }

   private static float N(boolean var0) {
      return var0 ? 0.1F : 0.0F;
   }

   float N(class05274 var1) {
      return var1.u() + this.Z + (var1.z().u() ? Math.min(this.L(), this.y()) : 0.0F) - N(var1.z().L());
   }

   void N(class05245 var1, Matrix4f var2, class01391 var3, int var4, boolean var5) {
      float f = var5 ? 0.0F : var1.Z();
      if (var1.L()) {
         this.N(var1, var1.s(), f, var1.P(), var3, var4, var2);
         f += var5 ? 0.0F : 0.03F;
      }

      this.N(var1, 0.0F, f, var1.z(), var3, var4, var2);
   }

   private void N(class05245 var1, float var2, float var3, int var4, class01391 var5, int var6, Matrix4f var7) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, var3, var4, var5, var6, var7, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         var5.N(var7, var1.i() + var2, var1.B() + var2, var3).method_39415(var4).method_22913(this.i, this.M).method_60803(var6);
         var5.N(var7, var1.M() + var2, var1.B() + var2, var3).method_39415(var4).method_22913(this.i, this.B).method_60803(var6);
         var5.N(var7, var1.M() + var2, var1.E() + var2, var3).method_39415(var4).method_22913(this.R, this.B).method_60803(var6);
         var5.N(var7, var1.i() + var2, var1.E() + var2, var3).method_39415(var4).method_22913(this.R, this.M).method_60803(var6);
      }
   }
}
