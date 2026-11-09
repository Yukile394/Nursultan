package minecraft;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class class04724 extends class05129 {
   private static final Logger y = LogUtils.getLogger();
   private static final class00392 L = class00392.L("mco.minigame.world.slot.screen.title");
   private final long u;
   private final int i;
   private final Runnable R;

   public class04724(long var1, int var3, Runnable var4) {
      super();
      this.u = var1;
      this.i = var3;
      this.R = var4;
   }

   @Override
   public void run() {
      class05111 class05111 = class05111.N();

      for (int ix = 0; ix < 25; ix++) {
         try {
            if (this.y()) {
               return;
            }

            if (class05111.N(this.u, this.i)) {
               this.R.run();
               break;
            }
         } catch (class05098 class05098) {
            if (this.y()) {
               return;
            }

            N(class05098.L);
         } catch (Exception exception) {
            if (this.y()) {
               return;
            }

            y.error("Couldn't switch world!");
            this.N(exception);
         }
      }
   }

   @Override
   public class00392 N() {
      return L;
   }
}
