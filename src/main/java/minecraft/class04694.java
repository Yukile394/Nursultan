package minecraft;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class class04694 extends class05129 {
   private static final Logger y = LogUtils.getLogger();
   private static final class00392 L = class00392.L("mco.minigame.world.starting.screen.title");
   private final long u;
   private final class04982 i;
   private final class05092 R;

   public class04694(long var1, class04982 var3, class05092 var4) {
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

            if (class05111.L(this.u, this.i.N())) {
               N(this.R);
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

            y.error("Couldn't start mini game!");
            this.N(exception);
         }
      }
   }

   @Override
   public class00392 N() {
      return L;
   }
}
