package minecraft;

import java.util.Map;

public class class06487 extends class07329 {
   private static class06584 L(class02903 var0) {
      for (int i = 0; i < var0.N(); i++) {
         class06584 class06584 = var0.N(i);
         if (class06584.L(class02484.f)) {
            return class06584;
         }
      }

      return class06584.E;
   }

   public class06487(class03762 var1) {
      super(
         "",
         var1,
         class04493.N(Map.of('#', class06510.method_8101(class06570.jk), 'x', class06510.method_8101(class06570.vh)), "###", "#x#", "###"),
         new class06584(class06570.Gt)
      );
   }

   @Override
   public class06584 method_8116(class02903 var1, class01929 var2) {
      class06584 class06584 = L(var1).L(1);
      class06584.N(class02484.S, class02705.field_49354);
      return class06584;
   }

   @Override
   public boolean method_8115(class02903 var1, class07299 var2) {
      if (!super.method_8115(var1, var2)) {
         return false;
      } else {
         class06584 class06584 = L(var1);
         if (class06584.R()) {
            return false;
         } else {
            class07769 class07769 = class06548.y(class06584, var2);
            if (class07769 == null) {
               return false;
            } else {
               return class07769.u() ? false : class07769.M < 4;
            }
         }
      }
   }

   @Override
   public class06514<class06487> method_8119() {
      return class06514.M;
   }

   @Override
   public boolean method_8118() {
      return true;
   }
}
