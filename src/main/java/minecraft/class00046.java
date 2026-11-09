package minecraft;

import Nursultan.class11068;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import org.joml.Matrix4f;
import org.lwjgl.system.MemoryStack;

public class class00046 implements class11068, AutoCloseable {
   private final GpuBuffer N;
   private final GpuBufferSlice y;
   private final float L;
   private final float u;
   private int i;
   private int R;
   private float M;

   private Matrix4f L(int var1, int var2, float var3) {
      return new Matrix4f().perspective(var3 * (float) (Math.PI / 180.0), (float)var1 / var2, this.L, this.u);
   }

   public class00046(String var1, float var2, float var3) {
      super();
      this.L = var2;
      this.u = var3;
      GpuDevice gpudevice = RenderSystem.getDevice();
      this.N = gpudevice.createBuffer(() -> "Projection matrix UBO " + var1, 136, RenderSystem.PROJECTION_MATRIX_UBO_SIZE);
      this.y = this.N.slice(0L, RenderSystem.PROJECTION_MATRIX_UBO_SIZE);
   }

   @Override
   public void close() {
      this.N.close();
   }

   public GpuBufferSlice y(int var1, int var2, float var3) {
      if (this.i != var1 || this.R != var2 || this.M != var3) {
         Matrix4f matrix4f = this.L(var1, var2, var3);
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

         this.i = var1;
         this.R = var2;
         this.M = var3;
      }

      return this.y;
   }
}
