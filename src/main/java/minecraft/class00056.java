package minecraft;

import Nursultan.class12035;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import org.joml.Matrix4f;
import org.lwjgl.system.MemoryStack;

public class class00056 implements class12035, AutoCloseable {
   private final GpuBuffer N;
   private final GpuBufferSlice y;
   private final float L;
   private final float u;
   private final boolean i;
   private float R;
   private float M;

   private Matrix4f L(float var1, float var2) {
      return new Matrix4f().setOrtho(0.0F, var1, this.i ? var2 : 0.0F, this.i ? 0.0F : var2, this.L, this.u);
   }

   public class00056(String var1, float var2, float var3, boolean var4) {
      super();
      this.L = var2;
      this.u = var3;
      this.i = var4;
      GpuDevice gpudevice = RenderSystem.getDevice();
      this.N = gpudevice.createBuffer(() -> "Projection matrix UBO " + var1, 136, RenderSystem.PROJECTION_MATRIX_UBO_SIZE);
      this.y = this.N.slice(0L, RenderSystem.PROJECTION_MATRIX_UBO_SIZE);
   }

   @Override
   public void close() {
      this.N.close();
   }

   public GpuBufferSlice y(float var1, float var2) {
      if (this.R != var1 || this.M != var2) {
         Matrix4f matrix4f = this.L(var1, var2);
         MemoryStack memorystack = MemoryStack.stackPush();

         try {
            ByteBuffer bytebuffer = Std140Builder.onStack(memorystack, RenderSystem.PROJECTION_MATRIX_UBO_SIZE).putMat4f(matrix4f).get();
            RenderSystem.getDevice().createCommandEncoder().writeToBuffer(this.N.slice(), bytebuffer);
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

         this.R = var1;
         this.M = var2;
      }

      return this.y;
   }
}
