package minecraft;

import java.util.List;

public class class08711 extends class07206 {
   public static final class08711 N = new class08711();

   public class08711() {
      super();
   }

   public static boolean y(class07210 var0, class06584 var1) {
      class07209 class07209 = var0.L().method_10093(var0.u().L(class06758.y));
      List<class07438> list = var0.y().N(class07438.class, new class00734(class07209), var1x -> var1x.method_63625(var1));
      if (list.isEmpty()) {
         return false;
      } else {
         class07438 class07438 = list.getFirst();
         class07085 class07085 = class07438.method_32326(var1);
         class06584 class06584 = var1.N(1);
         class07438.method_5673(class07085, class06584);
         if (class07438 instanceof class07079 class07079) {
            class07079.N(class07085);
            class07079.NW();
         }

         return true;
      }
   }

   @Override
   protected class06584 N(class07210 var1, class06584 var2) {
      return y(var1, var2) ? var2 : super.N(var1, var2);
   }
}
