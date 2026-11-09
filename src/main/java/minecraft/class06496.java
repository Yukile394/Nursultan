package minecraft;

import java.util.ArrayList;

public class class06496 extends class06520 {
   public class06496(class03762 var1) {
      super(var1);
   }

   public class06584 method_8116(class02903 var1, class01929 var2) {
      ArrayList arraylist = new ArrayList();
      class06584 class06584x = class06584.E;

      for (int i = 0; i < var1.N(); i++) {
         class06584 class06584x = var1.N(i);
         if (!class06584x.R()) {
            if (class06584x.N(class01226.Lz)) {
               if (!class06584x.R()) {
                  return class06584.E;
               }

               class06584x = class06584x.t();
            } else {
               if (!(class06584x.B() instanceof class06559 class06559)) {
                  return class06584.E;
               }

               arraylist.add(class06559);
            }
         }
      }

      return !class06584x.R() && !arraylist.isEmpty() ? class02816.N(class06584x, arraylist) : class06584.E;
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
               if (class06584.N(class01226.Lz)) {
                  if (flag) {
                     return false;
                  }

                  flag = true;
               } else {
                  if (!(class06584.B() instanceof class06559)) {
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
   public class06514<class06496> method_8119() {
      return class06514.u;
   }
}
