package minecraft;

import com.mojang.blaze3d.systems.GpuQuery;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.OptionalLong;
import org.lwjgl.opengl.ARBTimerQuery;
import org.lwjgl.opengl.GL32C;

public class class00613 implements GpuQuery {
   private final int N;
   private boolean y;
   private OptionalLong L = OptionalLong.empty();

   class00613(int var1) {
      super();
      this.N = var1;
   }

   public OptionalLong getValue() {
      RenderSystem.assertOnRenderThread();
      if (this.y) {
         throw new IllegalStateException("GlTimerQuery is closed");
      } else if (this.L.isPresent()) {
         return this.L;
      } else if (GL32C.glGetQueryObjecti(this.N, 34919) == 1) {
         this.L = OptionalLong.of(ARBTimerQuery.glGetQueryObjecti64(this.N, 34918));
         return this.L;
      } else {
         return OptionalLong.empty();
      }
   }

   public void close() {
      RenderSystem.assertOnRenderThread();
      if (!this.y) {
         this.y = true;
         GL32C.glDeleteQueries(this.N);
      }
   }
}
