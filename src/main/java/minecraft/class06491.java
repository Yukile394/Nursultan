package minecraft;

import java.util.ArrayList;

public class class06491 extends class06520 {
   private static final class06510 N = class06510.method_8101(class06570.jk);
   private static final class06510 y = class06510.method_8101(class06570.bN);
   private static final class06510 L = class06510.method_8101(class06570.Go);

   public class06491(class03762 var1) {
      super(var1);
   }

   public class06584 method_8116(class02903 var1, class01929 var2) {
      ArrayList arraylist = new ArrayList();
      int i = 0;

      for (int j = 0; j < var1.N(); j++) {
         class06584 class06584x = var1.N(j);
         if (!class06584x.R()) {
            if (y.method_8093(class06584x)) {
               i++;
            } else if (L.method_8093(class06584x)) {
               class02827 class02827 = class06584x.method_58694(class02484.Ns);
               if (class02827 != null) {
                  arraylist.add(class02827);
               }
            }
         }
      }

      class06584 class06584 = new class06584(class06570.GJ, 3);
      class06584.N(class02484.NT, new class02813(i, arraylist));
      return class06584;
   }

   public boolean method_8115(class02903 var1, class07299 var2) {
      if (var1.i() < 2) {
         return false;
      } else {
         boolean flag = false;
         int i = 0;

         for (int j = 0; j < var1.N(); j++) {
            class06584 class06584 = var1.N(j);
            if (!class06584.R()) {
               if (N.method_8093(class06584)) {
                  if (flag) {
                     return false;
                  }

                  flag = true;
               } else if (y.method_8093(class06584)) {
                  if (++i > 3) {
                     return false;
                  }
               } else if (!L.method_8093(class06584)) {
                  return false;
               }
            }
         }

         return flag && i >= 1;
      }
   }

   @Override
   public class06514<class06491> method_8119() {
      return class06514.B;
   }
}
