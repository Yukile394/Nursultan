package minecraft;

import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuQuery;
import com.mojang.blaze3d.systems.RenderSystem;
import org.jspecify.annotations.Nullable;

public class class04368 {
   @Nullable
   private CommandEncoder N;
   @Nullable
   private GpuQuery y;

   public void L() {
      RenderSystem.assertOnRenderThread();
      if (this.y != null) {
         throw new IllegalStateException("Current profile not ended");
      } else {
         this.N = RenderSystem.getDevice().createCommandEncoder();
         this.y = this.N.timerQueryBegin();
      }
   }

   public class04368() {
      super();
   }

   public class04379 u() {
      RenderSystem.assertOnRenderThread();
      if (this.y != null && this.N != null) {
         this.N.timerQueryEnd(this.y);
         class04379 class04379 = new class04379(this.y);
         this.y = null;
         this.N = null;
         return class04379;
      } else {
         throw new IllegalStateException("endProfile called before beginProfile");
      }
   }

   public boolean y() {
      return this.y != null;
   }

   public static class04368 N() {
      return class04371.N;
   }
}
