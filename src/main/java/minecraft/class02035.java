package minecraft;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class class02035 extends class01989 {
   private static final Logger N = LogUtils.getLogger();

   public class02035() {
      super();
   }

   @Override
   protected class06584 N(class07210 var1, class06584 var2) {
      this.N(false);
      class06581 class06581 = var2.B();
      if (class06581 instanceof class06918) {
         class07211 class07211x = var1.u().L(class06758.y);
         class07209 class07209 = var1.L().method_10093(class07211x);
         class07211 class07211x = var1.y().R(class07209.method_10074()) ? class07211x : class07211.field_11036;

         try {
            this.N(((class06918)class06581).y(new class02953(var1.y(), class07209, class07211x, var2, class07211x)).N());
         } catch (Exception exception) {
            N.error("Error trying to place shulker box at {}", class07209, exception);
         }
      }

      return var2;
   }
}
