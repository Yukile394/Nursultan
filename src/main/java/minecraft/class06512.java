package minecraft;

import it.unimi.dsi.fastutil.ints.IntArrayList;

public class class06512 extends class06520 {
   private static final class06510 N = class06510.method_8101(class06570.Go);

   public class06512(class03762 var1) {
      super(var1);
   }

   public class06584 method_8116(class02903 var1, class01929 var2) {
      IntArrayList intarraylist = new IntArrayList();
      class06584 class06584x = null;

      for (int i = 0; i < var1.N(); i++) {
         class06584 class06584x = var1.N(i);
         if (class06584x.B() instanceof class06559 class06559) {
            intarraylist.add(class06559.N().i());
         } else if (N.method_8093(class06584x)) {
            class06584x = class06584x.L(1);
         }
      }

      if (class06584x != null && !intarraylist.isEmpty()) {
         class06584x.N(class02484.Ns, class02827.N, intarraylist, class02827::N);
         return class06584x;
      } else {
         return class06584.E;
      }
   }

   public boolean method_8115(class02903 var1, class07299 var2) {
      if (var1.i() < 2) {
         return false;
      } else {
         boolean flag = false;
         boolean flag1 = false;

         for (int i = 0; i < var1.N(); i++) {
            class06584 class06584 = var1.N(i);
            if (!class06584.R()) {
               if (class06584.B() instanceof class06559) {
                  flag = true;
               } else {
                  if (!N.method_8093(class06584)) {
                     return false;
                  }

                  if (flag1) {
                     return false;
                  }

                  flag1 = true;
               }
            }
         }

         return flag1 && flag;
      }
   }

   @Override
   public class06514<class06512> method_8119() {
      return class06514.z;
   }
}
