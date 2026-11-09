package minecraft;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class class04691 extends class05129 {
   private static final Logger y = LogUtils.getLogger();
   private static final class00392 L = class00392.L("mco.configure.world.opening");
   private final class04981 u;
   private final class05096 i;
   private final boolean R;
   private final class06202 M;

   public class04691(class04981 var1, class05096 var2, boolean var3, class06202 var4) {
      super();
      this.u = var1;
      this.i = var2;
      this.R = var3;
      this.M = var4;
   }

   @Override
   public void run() {
      class05111 class05111 = class05111.N();

      for (int ix = 0; ix < 25; ix++) {
         if (this.y()) {
            return;
         }

         try {
            boolean flag = class05111.i(this.u.y);
            if (flag) {
               this.M.execute(() -> {
                  class05096 class05096 = this.i;
                  if (class05096 instanceof class05092) {
                     ((class05092)class05096).R();
                  }

                  this.u.R = class04961.field_19434;
                  if (this.R) {
                     class05685.N(this.u, this.i);
                  } else {
                     this.M.N(this.i);
                  }
               });
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

            y.error("Failed to open server", exception);
            this.N(exception);
         }
      }
   }

   @Override
   public class00392 N() {
      return L;
   }
}
