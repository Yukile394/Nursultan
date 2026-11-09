package minecraft;

import com.mojang.blaze3d.buffers.GpuFence;
import com.mojang.blaze3d.opengl.GlStateManager;

public class class00060 implements GpuFence {
   private long N = GlStateManager._glFenceSync(37143, 0);

   public class00060() {
      super();
   }

   public void close() {
      if (this.N != 0L) {
         GlStateManager._glDeleteSync(this.N);
         this.N = 0L;
      }
   }

   public boolean awaitCompletion(long var1) {
      if (this.N == 0L) {
         return true;
      } else {
         int i = GlStateManager._glClientWaitSync(this.N, 0, var1);
         if (i == 37147) {
            return false;
         } else if (i == 37149) {
            throw new IllegalStateException("Failed to complete GPU fence: " + GlStateManager._getError());
         } else {
            return true;
         }
      }
   }
}
