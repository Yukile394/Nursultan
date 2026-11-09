package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer.MappedView;
import java.nio.ByteBuffer;

public class class08494 implements MappedView {
   private final Runnable N;
   private final class08523 y;
   private final ByteBuffer L;
   private boolean u;

   protected class08494(Runnable var1, class08523 var2, ByteBuffer var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   public ByteBuffer data() {
      return this.L;
   }

   public void close() {
      if (!this.u) {
         this.u = true;
         this.N.run();
      }
   }
}
