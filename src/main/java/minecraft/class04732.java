package minecraft;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class class04732 extends class05129 {
   private static final Logger y = LogUtils.getLogger();
   private static final class00392 L = class00392.L("mco.configure.world.closing");
   private final class04981 u;
   private final class05092 i;

   public class04732(class04981 var1, class05092 var2) {
      super();
      this.u = var1;
      this.i = var2;
   }

   @Override
   public void run() {
      class05111 class05111 = class05111.N();

      for (int ix = 0; ix < 25; ix++) {
         if (this.y()) {
            return;
         }

         try {
            boolean flag = class05111.R(this.u.y);
            if (flag) {
               this.i.R();
               this.u.R = class04961.field_19433;
               N(this.i);
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

            y.error("Failed to close server", exception);
            this.N(exception);
         }
      }
   }

   @Override
   public class00392 N() {
      return L;
   }
}
