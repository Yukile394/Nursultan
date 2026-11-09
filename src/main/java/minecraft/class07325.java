package minecraft;

public class class07325 extends class06520 {
   public class07325(class03762 var1) {
      super(var1);
   }

   public class06584 method_8116(class02903 var1, class01929 var2) {
      class06584 class06584xx = class06584.E;
      class06584 class06584x = class06584.E;

      for (int i = 0; i < var1.N(); i++) {
         class06584 class06584xx = var1.N(i);
         if (!class06584xx.R()) {
            if (class06584xx.B() instanceof class06920) {
               class06584xx = class06584xx;
            } else if (class06584xx.N(class06570.lo)) {
               class06584x = class06584xx.t();
            }
         }
      }

      if (class06584x.R()) {
         return class06584x;
      } else {
         class06584x.N(class02484.Nv, class06584xx.method_58694(class02484.Nv));
         class06584x.N(class02484.Nn, ((class06920)class06584xx.B()).N());
         return class06584x;
      }
   }

   public boolean method_8115(class02903 var1, class07299 var2) {
      if (var1.i() != 2) {
         return false;
      } else {
         boolean flag = false;
         boolean flag1 = false;

         for (int i = 0; i < var1.N(); i++) {
            class06584 class06584 = var1.N(i);
            if (!class06584.R()) {
               if (class06584.B() instanceof class06920) {
                  if (flag1) {
                     return false;
                  }

                  flag1 = true;
               } else {
                  if (!class06584.N(class06570.lo)) {
                     return false;
                  }

                  if (flag) {
                     return false;
                  }

                  if (!class06584.a_(class02484.Nv, class02708.L).y().isEmpty()) {
                     return false;
                  }

                  flag = true;
               }
            }
         }

         return flag && flag1;
      }
   }

   @Override
   public class06514<class07325> method_8119() {
      return class06514.W;
   }
}
