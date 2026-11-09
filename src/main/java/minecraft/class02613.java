package minecraft;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;

public class class02613 implements AutoCloseable {
   private final long y;
   private final int L;
   private final int u;
   private boolean i;

   class02613(class02579 var1, long var2, int var4, int var5) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var4;
      this.u = var5;
   }

   @Override
   public void close() {
      if (!this.i) {
         this.i = true;
         if (this.N.L(this.u)) {
            this.N.u();
         }
      }
   }

   public ByteBuffer N() {
      if (!this.N.L(this.u)) {
         throw new IllegalStateException("Buffer is no longer valid");
      } else {
         return MemoryUtil.memByteBuffer(this.N.N + this.y, this.L);
      }
   }
}
