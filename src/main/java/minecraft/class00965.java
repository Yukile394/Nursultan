package minecraft;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.RenderSystem.ShapeIndexBuffer;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.caffeinemc.mods.sodium.api.util.ColorARGB;
import net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter;
import net.caffeinemc.mods.sodium.api.vertex.format.common.ParticleVertex;
import net.caffeinemc.mods.sodium.client.render.vertex.VertexConsumerUtils;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.MemoryStack;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class00965 implements class00972, class05436 {
   private static final int N = 1024;
   private static final int y = 12;
   private static final int L = 2;
   private final Map<class05846, class00969> u = new HashMap<>();
   private int i;
   private static final Quaternionf R = new Quaternionf();
   private static final Vector3f M = new Vector3f();

   @Override
   public void submit(class01237 var1, class06959 var2) {
      if (this.i > 0) {
         var1.N(this);
      }
   }

   public class00965() {
      super();
   }

   @Override
   public void y() {
      this.u.values().forEach(class00969::N);
      this.i = 0;
   }

   private void N(
      class01391 var1, Quaternionf var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, int var11, int var12
   ) {
      Vector3f vector3f = new Vector3f(var6, var7, 0.0F).rotate(var2).mul(var8).add(var3, var4, var5);
      var1.method_22912(vector3f.x(), vector3f.y(), vector3f.z()).method_22913(var9, var10).method_39415(var11).method_60803(var12);
   }

   protected void N(
      class01391 var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      int var14,
      int var15,
      CallbackInfo var16
   ) {
      VertexBufferWriter vertexbufferwriter = VertexConsumerUtils.convertOrLog(var1);
      if (vertexbufferwriter != null) {
         var16.cancel();
         R.set(var5, var6, var7, var8);
         this.N(vertexbufferwriter, var2, var3, var4, var9, var10, var11, var12, var13, ColorARGB.toABGR(var14), var15, R);
      }
   }

   private void N(
      VertexBufferWriter var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      int var10,
      int var11,
      Quaternionf var12
   ) {
      MemoryStack memorystack = MemoryStack.stackPush();

      try {
         long ix = memorystack.nmalloc(112);
         M.set(1.0F, -1.0F, 0.0F).rotate(var12).mul(var5).add(var2, var3, var4);
         ParticleVertex.put(ix, M.x, M.y, M.z, var7, var9, var10, var11);
         long j = ix + 28L;
         M.set(1.0F, 1.0F, 0.0F).rotate(var12).mul(var5).add(var2, var3, var4);
         ParticleVertex.put(j, M.x, M.y, M.z, var7, var8, var10, var11);
         j += 28L;
         M.set(-1.0F, 1.0F, 0.0F).rotate(var12).mul(var5).add(var2, var3, var4);
         ParticleVertex.put(j, M.x, M.y, M.z, var6, var8, var10, var11);
         j += 28L;
         M.set(-1.0F, -1.0F, 0.0F).rotate(var12).mul(var5).add(var2, var3, var4);
         ParticleVertex.put(j, M.x, M.y, M.z, var6, var9, var10, var11);
         j += 28L;
         var1.push(memorystack, ix, 4, ParticleVertex.FORMAT);
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

   @Nullable
   @Override
   public class00977 N(class00438 var1) {
      Object object;
      try (class02579 class02579 = class02579.N(this.i * 4 * class07835.u.getVertexSize())) {
         class07331 class07331 = new class07331(class02579, DrawMode.QUADS, class07835.u);
         HashMap hashmap = new HashMap();
         int ix = 0;

         for (Entry entry : this.u.entrySet()) {
            ((class00969)entry.getValue())
               .N(
                  (var2, var3x, var4x, var5x, var6x, var7, var8x, var9, var10, var11x, var12x, var13x, var14x, var15) -> this.N(
                     (class01391)class07331, var2, var3x, var4x, var5x, var6x, var7, var8x, var9, var10, var11x, var12x, var13x, var14x, var15
                  )
               );
            if (((class00969)entry.getValue()).y() > 0) {
               hashmap.put((class05846)entry.getKey(), new class00984(ix, ((class00969)entry.getValue()).y() * 6));
            }

            ix += ((class00969)entry.getValue()).y() * 4;
         }

         class02609 class02609 = class07331.N();
         if (class02609 != null) {
            var1.N(class02609.N());
            RenderSystem.getSequentialBuffer(DrawMode.QUADS).getIndexBuffer(class02609.L().L());
            GpuBufferSlice gpubufferslice = RenderSystem.getDynamicUniforms()
               .N(RenderSystem.getModelViewMatrix(), new Vector4f(1.0F, 1.0F, 1.0F, 1.0F), new Vector3f(), new Matrix4f());
            return new class00977(class02609.L().L(), gpubufferslice, hashmap);
         }

         object = null;
      }

      return (class00977)object;
   }

   @Override
   public void N(class00977 var1, class00438 var2, RenderPass var3, class08627 var4, boolean var5) {
      ShapeIndexBuffer shapeindexbuffer = RenderSystem.getSequentialBuffer(DrawMode.QUADS);
      var3.setVertexBuffer(0, var2.N());
      var3.setIndexBuffer(shapeindexbuffer.getIndexBuffer(var1.N()), shapeindexbuffer.getIndexType());
      var3.setUniform("DynamicTransforms", var1.y());

      for (Entry entry : var1.L().entrySet()) {
         if (var5 == ((class05846)entry.getKey()).N()) {
            var3.setPipeline(((class05846)entry.getKey()).L());
            class08918 class08918 = var4.y(((class05846)entry.getKey()).y());
            var3.bindTexture("Sampler0", class08918.method_71659(), class08918.method_75484());
            var3.drawIndexed(((class00984)entry.getValue()).N(), 0, ((class00984)entry.getValue()).y(), 1);
         }
      }
   }

   protected void N(
      class01391 var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      int var14,
      int var15
   ) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         Quaternionf quaternionf = new Quaternionf(var5, var6, var7, var8);
         this.N(var1, quaternionf, var2, var3, var4, 1.0F, -1.0F, var9, var11, var13, var14, var15);
         this.N(var1, quaternionf, var2, var3, var4, 1.0F, 1.0F, var9, var11, var12, var14, var15);
         this.N(var1, quaternionf, var2, var3, var4, -1.0F, 1.0F, var9, var10, var12, var14, var15);
         this.N(var1, quaternionf, var2, var3, var4, -1.0F, -1.0F, var9, var10, var13, var14, var15);
      }
   }

   public void N(
      class05846 var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      int var14,
      int var15
   ) {
      this.u.computeIfAbsent(var1, var0 -> new class00969()).N(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
      this.i++;
   }
}
