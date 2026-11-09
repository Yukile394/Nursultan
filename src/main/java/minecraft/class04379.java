package minecraft;

import com.mojang.blaze3d.systems.GpuQuery;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.OptionalLong;

public class class04379 {
   private static final long N = 0L;
   private static final long y = -1L;
   private final GpuQuery L;
   private long u = 0L;

   public long L() {
      RenderSystem.assertOnRenderThread();
      if (this.u == 0L) {
         OptionalLong optionallong = this.L.getValue();
         if (optionallong.isPresent()) {
            this.u = optionallong.getAsLong();
            this.L.close();
         }
      }

      return this.u;
   }

   class04379(GpuQuery var1) {
      super();
      this.L = var1;
   }

   public boolean y() {
      RenderSystem.assertOnRenderThread();
      if (this.u != 0L) {
         return true;
      } else {
         OptionalLong optionallong = this.L.getValue();
         if (optionallong.isPresent()) {
            this.u = optionallong.getAsLong();
            this.L.close();
            return true;
         } else {
            return false;
         }
      }
   }

   public void N() {
      RenderSystem.assertOnRenderThread();
      if (this.u == 0L) {
         this.u = -1L;
         this.L.close();
      }
   }
}
