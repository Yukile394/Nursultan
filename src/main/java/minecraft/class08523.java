package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.jtracy.MemoryPool;
import com.mojang.jtracy.TracyClient;
import java.nio.ByteBuffer;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class class08523 extends GpuBuffer {
   protected static final MemoryPool N = TracyClient.createMemoryPool("GPU Buffers");
   protected boolean y;
   @Nullable
   public final Supplier<String> L;
   private final class08882 R;
   public final int u;
   @Nullable
   protected ByteBuffer i;

   protected class08523(@Nullable Supplier<String> var1, class08882 var2, int var3, long var4, int var6, @Nullable ByteBuffer var7) {
      super(var3, var4);
      this.L = var1;
      this.R = var2;
      this.u = var6;
      this.i = var7;
      int ix = (int)Math.min(var4, 2147483647L);
      N.malloc(var6, ix);
   }

   public void close() {
      if (!this.y) {
         this.y = true;
         if (this.i != null) {
            this.R.N(this.u, this.usage());
            this.i = null;
         }

         GlStateManager._glDeleteBuffers(this.u);
         N.free(this.u);
      }
   }

   public boolean isClosed() {
      return this.y;
   }
}
