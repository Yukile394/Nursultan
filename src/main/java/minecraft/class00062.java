package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import org.joml.Matrix4f;
import org.lwjgl.system.MemoryStack;

public class class00062 implements AutoCloseable {
   private final GpuBuffer N;
   private final GpuBufferSlice y;

   public class00062(String var1) {
      super();
      GpuDevice gpudevice = RenderSystem.getDevice();
      this.N = gpudevice.createBuffer(() -> "Projection matrix UBO " + var1, 136, RenderSystem.PROJECTION_MATRIX_UBO_SIZE);
      this.y = this.N.slice(0L, RenderSystem.PROJECTION_MATRIX_UBO_SIZE);
   }

   @Override
   public void close() {
      this.N.close();
   }

   public GpuBufferSlice N(Matrix4f var1) {
      MemoryStack memorystack = MemoryStack.stackPush();

      try {
         ByteBuffer bytebuffer = Std140Builder.onStack(memorystack, RenderSystem.PROJECTION_MATRIX_UBO_SIZE).putMat4f(var1).get();
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

      return this.y;
   }
}
