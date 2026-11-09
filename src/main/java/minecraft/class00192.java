package minecraft;

import java.util.OptionalLong;
import org.jspecify.annotations.Nullable;

class class00192 implements class05007 {
   private final class06095 L;
   private class00392 u;
   @Nullable
   private class00392 i;
   private int R;
   private int M;
   private OptionalLong B;

   class00192(class00232 var1, int var2) {
      super();
      this.y = var1;
      this.N = var2;
      this.L = new class06095();
      this.u = class00392.i();
      this.i = null;
      this.B = OptionalLong.empty();
   }

   private void y() {
      this.y.y.execute(() -> class06132.y(this.y.y.m(), this.L, this.u, this.i));
   }

   private void y(long var1) {
      if (this.B.isPresent()) {
         this.i = class00392.N("download.pack.progress.percent", var1 * 100L / this.B.getAsLong());
      } else {
         this.i = class00392.N("download.pack.progress.bytes", class04701.y(var1));
      }

      this.y();
   }

   @Override
   public void N(OptionalLong var1) {
      class00232.N.debug("File size = {} bytes", var1);
      this.B = var1;
      this.y(0L);
   }

   @Override
   public void N(boolean var1) {
      if (!var1) {
         class00232.N.info("Pack {} failed to download", this.R);
         this.M++;
      } else {
         class00232.N.debug("Download ended for pack {}", this.R);
      }

      if (this.R == this.N) {
         if (this.M > 0) {
            this.u = class00392.N("download.pack.failed", this.M, this.N);
            this.i = null;
            this.y();
         } else {
            class06132.N(this.y.y.m(), this.L);
         }
      }
   }

   @Override
   public void N(long var1) {
      class00232.N.debug("Progress for pack {}: {} bytes", this.R, var1);
      this.y(var1);
   }

   @Override
   public void N() {
      this.R++;
      this.u = class00392.N("download.pack.title", this.R, this.N);
      this.y();
      class00232.N.debug("Starting pack {}/{} download", this.R, this.N);
   }
}
