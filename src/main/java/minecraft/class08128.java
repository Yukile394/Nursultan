package minecraft;

import net.caffeinemc.mods.sodium.api.math.MatrixHelper;
import net.caffeinemc.mods.sodium.api.util.ColorABGR;
import net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter;
import net.caffeinemc.mods.sodium.api.vertex.format.common.EntityVertex;
import net.caffeinemc.mods.sodium.client.render.vertex.VertexConsumerUtils;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.lwjgl.system.MemoryStack;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class08128 {
   private static final class07311 N = class06851.P(class01894.y("textures/misc/shadow.png"));
   private static final int y;
   private static final int L;

   public class08128() {
      super();
   }

   private static void N(long var0, Matrix4f var2, float var3, float var4, float var5, float var6, float var7, int var8, int var9) {
      float f = MatrixHelper.transformPositionX(var2, var3, var4, var5);
      float f1 = MatrixHelper.transformPositionY(var2, var3, var4, var5);
      float f2 = MatrixHelper.transformPositionZ(var2, var3, var4, var5);
      EntityVertex.write(var0, f, f1, f2, var8, var6, var7, 15728880, class01384.u, var9);
   }

   private static void N(Matrix4f var0, VertexBufferWriter var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float f = 0.5F * (1.0F / var2);
      float f1 = -var4 * f + 0.5F;
      float f2 = -var5 * f + 0.5F;
      float f3 = -var7 * f + 0.5F;
      float f4 = -var8 * f + 0.5F;
      int i = ColorABGR.withAlpha(L, var3);
      int j = y;
      MemoryStack memorystack = MemoryStack.stackPush();

      try {
         long k = memorystack.nmalloc(144);
         N(k, var0, var4, var6, var7, f1, f3, i, j);
         long l = k + 36L;
         N(l, var0, var4, var6, var8, f1, f4, i, j);
         l += 36L;
         N(l, var0, var5, var6, var8, f2, f4, i, j);
         l += 36L;
         N(l, var0, var5, var6, var7, f2, f3, i, j);
         l += 36L;
         var1.push(memorystack, k, 4, EntityVertex.FORMAT);
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

   private static void N(class07937 var0, class01422 var1, CallbackInfo var2) {
      VertexBufferWriter vertexbufferwriter = VertexConsumerUtils.convertOrLog(var1.method_73477(N));
      if (vertexbufferwriter != null) {
         var2.cancel();

         for (class08130 class08130 : var0.N()) {
            Matrix4f matrix4f = class08130.N();

            for (int i = 0; i < class08130.L().size(); i++) {
               class08453 class08453 = class08130.L().get(i);
               float f = class08453.i();
               if (f >= 0.0F) {
                  if (f > 1.0F) {
                     f = 1.0F;
                  }

                  class00734 class00734 = class08453.u().method_1107();
                  float f1 = (float)(class08453.N() + class00734.N);
                  float f2 = (float)(class08453.N() + class00734.u);
                  float f3 = (float)(class08453.y() + class00734.y);
                  float f4 = (float)(class08453.L() + class00734.L);
                  float f5 = (float)(class08453.L() + class00734.R);
                  N(matrix4f, vertexbufferwriter, class08130.y(), f, f1, f2, f3, f4, f5);
               }
            }
         }
      }
   }

   public void N(class07937 var1, class01422 var2) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      N(var1, var2, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         class01391 class01391 = var2.method_73477(N);

         for (class08130 class08130 : var1.N()) {
            for (class08453 class08453 : class08130.L()) {
               class00734 class00734 = class08453.u().method_1107();
               float f = class08453.N() + (float)class00734.N;
               float f1 = class08453.N() + (float)class00734.u;
               float f2 = class08453.y() + (float)class00734.y;
               float f3 = class08453.L() + (float)class00734.L;
               float f4 = class08453.L() + (float)class00734.R;
               float f5 = class08130.y();
               float f6 = -f / 2.0F / f5 + 0.5F;
               float f7 = -f1 / 2.0F / f5 + 0.5F;
               float f8 = -f3 / 2.0F / f5 + 0.5F;
               float f9 = -f4 / 2.0F / f5 + 0.5F;
               int i = class02566.y(class08453.i());
               N(class08130.N(), class01391, i, f, f2, f3, f6, f8);
               N(class08130.N(), class01391, i, f, f2, f4, f6, f9);
               N(class08130.N(), class01391, i, f1, f2, f4, f7, f9);
               N(class08130.N(), class01391, i, f1, f2, f3, f7, f8);
            }
         }
      }
   }

   private static void N(Matrix4f var0, class01391 var1, int var2, float var3, float var4, float var5, float var6, float var7) {
      Vector3f vector3f = var0.transformPosition(var3, var4, var5, new Vector3f());
      var1.N(vector3f.x(), vector3f.y(), vector3f.z(), var2, var6, var7, class01384.u, 15728880, 0.0F, 1.0F, 0.0F);
   }
}
