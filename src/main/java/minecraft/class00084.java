package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuFence;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.function.Supplier;

public class class00084 implements AutoCloseable {
   private static final int N = 3;
   private final GpuBuffer[] y = new GpuBuffer[3];
   private final GpuFence[] L = new GpuFence[3];
   private final int u;
   private int i = 0;

   public void L() {
      if (this.L[this.i] != null) {
         this.L[this.i].close();
      }

      this.L[this.i] = RenderSystem.getDevice().createCommandEncoder().createFence();
      this.i = (this.i + 1) % 3;
   }

   public class00084(Supplier<String> var1, int var2, int var3) {
      super();
      GpuDevice gpudevice = RenderSystem.getDevice();
      if ((var2 & 1) == 0 && (var2 & 2) == 0) {
         throw new IllegalArgumentException("MappableRingBuffer requires at least one of USAGE_MAP_READ or USAGE_MAP_WRITE");
      } else {
         for (int ix = 0; ix < 3; ix++) {
            int j = ix;
            this.y[ix] = gpudevice.createBuffer(() -> (String)var1.get() + " #" + j, var2, var3);
            this.L[ix] = null;
         }

         this.u = var3;
      }
   }

   @Override
   public void close() {
      for (int ix = 0; ix < 3; ix++) {
         this.y[ix].close();
         if (this.L[ix] != null) {
            this.L[ix].close();
         }
      }
   }

   public GpuBuffer y() {
      GpuFence gpufence = this.L[this.i];
      if (gpufence != null) {
         gpufence.awaitCompletion(Long.MAX_VALUE);
         gpufence.close();
         this.L[this.i] = null;
      }

      return this.y[this.i];
   }

   public int N() {
      return this.u;
   }
}
