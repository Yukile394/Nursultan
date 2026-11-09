package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBuffer.MappedView;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import org.jspecify.annotations.Nullable;

public class class00438 implements AutoCloseable {
   @Nullable
   private class00084 N;

   public class00438() {
      super();
   }

   @Override
   public void close() {
      if (this.N != null) {
         this.N.close();
      }
   }

   void y() {
      if (this.N != null) {
         this.N.L();
      }
   }

   public void N(ByteBuffer var1) {
      if (this.N == null || this.N.N() < var1.remaining()) {
         if (this.N != null) {
            this.N.close();
         }

         this.N = new class00084(() -> "Particle Vertices", 34, var1.remaining());
      }

      MappedView mappedview = RenderSystem.getDevice().createCommandEncoder().mapBuffer(this.N.y().slice(), false, true);

      try {
         mappedview.data().put(var1);
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
   }

   public GpuBuffer N() {
      if (this.N == null) {
         throw new IllegalStateException("Can't get buffer before it's made");
      } else {
         return this.N.y();
      }
   }
}
