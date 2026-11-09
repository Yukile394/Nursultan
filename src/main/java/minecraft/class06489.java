package minecraft;

public class class06489 extends class06520 {
   public class06489(class03762 var1) {
      super(var1);
   }

   public class06584 method_8116(class02903 var1, class01929 var2) {
      int i = 0;
      class06584 class06584x = class06584.E;

      for (int j = 0; j < var1.N(); j++) {
         class06584 class06584x = var1.N(j);
         if (!class06584x.R()) {
            if (class06584x.L(class02484.f)) {
               if (!class06584x.R()) {
                  return class06584.E;
               }

               class06584x = class06584x;
            } else {
               if (!class06584x.N(class06570.Gt)) {
                  return class06584.E;
               }

               i++;
            }
         }
      }

      return !class06584x.R() && i >= 1 ? class06584x.L(i + 1) : class06584.E;
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
               if (class06584.L(class02484.f)) {
                  if (flag1) {
                     return false;
                  }

                  flag1 = true;
               } else {
                  if (!class06584.N(class06570.Gt)) {
                     return false;
                  }

                  flag = true;
               }
            }
         }

         return flag1 && flag;
      }
   }

   @Override
   public class06514<class06489> method_8119() {
      return class06514.R;
   }
}
