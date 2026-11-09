package minecraft;

import java.util.function.Consumer;

class class00740 extends class07206 {
   class00740() {
      super();
   }

   @Override
   public class06584 N(class07210 var1, class06584 var2) {
      class07211 class07211 = var1.u().L(class06758.y);
      class07209 class07209 = var1.L().method_10093(class07211);
      class04782 class04782 = var1.y();
      Consumer consumer = class07078.N(var1x -> var1x.method_36456(class07211.U()), class04782, var2, null);
      if (class07078.B.N(class04782, consumer, class07209, class06113.field_16470, false, false) != null) {
         var2.B(1);
      }

      return var2;
   }
}
