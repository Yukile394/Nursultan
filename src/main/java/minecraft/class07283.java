package minecraft;

public class class07283 extends class06520 {
   public class07283(class03762 var1) {
      super(var1);
   }

   public class06584 method_8116(class02903 var1, class01929 var2) {
      class06584 class06584x = var1.N(1, 1);
      if (!class06584x.N(class06570.lJ)) {
         return class06584.E;
      } else {
         class06584 class06584x = new class06584(class06570.lI, 8);
         class06584x.N(class02484.h, class06584x.method_58694(class02484.h));
         return class06584x;
      }
   }

   public boolean method_8115(class02903 var1, class07299 var2) {
      if (var1.R() == 3 && var1.M() == 3 && var1.i() == 9) {
         for (int i = 0; i < var1.M(); i++) {
            for (int j = 0; j < var1.R(); j++) {
               class06584 class06584 = var1.N(j, i);
               if (class06584.R()) {
                  return false;
               }

               if (j == 1 && i == 1) {
                  if (!class06584.N(class06570.lJ)) {
                     return false;
                  }
               } else if (!class06584.N(class06570.sD)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public class06514<class07283> method_8119() {
      return class06514.U;
   }
}
