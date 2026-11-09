package minecraft;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class class04709 extends class05129 {
   private static final Logger y = LogUtils.getLogger();
   private final long L;
   private final class00392 u;
   private final Runnable i;

   public class04709(long var1, class00392 var3, Runnable var4) {
      super();
      this.L = var1;
      this.u = var3;
      this.i = var4;
   }

   @Override
   public void run() {
      class05111 class05111 = class05111.N();
      int ix = 0;

      while (ix < 25) {
         try {
            if (this.y()) {
               return;
            }

            this.N(class05111, this.L);
            if (this.y()) {
               return;
            }

            this.i.run();
            return;
         } catch (class05098 class05098) {
            if (this.y()) {
               return;
            }

            N(class05098.L);
            ix++;
         } catch (Exception exception) {
            if (this.y()) {
               return;
            }

            y.error("Couldn't reset world");
            this.N(exception);
            return;
         }
      }
   }

   @Override
   public class00392 N() {
      return this.u;
   }

   protected abstract void N(class05111 var1, long var2) throws class05097;
}
