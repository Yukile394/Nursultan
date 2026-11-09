package minecraft;

public class class06498 extends class06520 {
   public class06498(class03762 var1) {
      super(var1);
   }

   @Override
   public class00743<class06584> N(class02903 var1) {
      class00743 class00743 = class00743.method_10213(var1.N(), class06584.E);

      for (int i = 0; i < class00743.size(); i++) {
         class06584 class06584x = var1.N(i);
         if (!class06584x.R()) {
            class06584 class06584x = class06584x.B().Z();
            if (!class06584x.R()) {
               class00743.set(i, class06584x);
            } else if (!class06584x.a_(class02484.Nv, class02708.L).y().isEmpty()) {
               class00743.set(i, class06584x.L(1));
            }
         }
      }

      return class00743;
   }

   public class06584 method_8116(class02903 var1, class01929 var2) {
      for (int i = 0; i < var1.N(); i++) {
         class06584 class06584 = var1.N(i);
         if (!class06584.R()) {
            int j = class06584.a_(class02484.Nv, class02708.L).y().size();
            if (j > 0 && j <= 6) {
               return class06584.L(1);
            }
         }
      }

      return class06584.E;
   }

   public boolean method_8115(class02903 var1, class07299 var2) {
      if (var1.i() != 2) {
         return false;
      } else {
         class06563 class06563 = null;
         boolean flag = false;
         boolean flag1 = false;

         for (int i = 0; i < var1.N(); i++) {
            class06584 class06584 = var1.N(i);
            if (!class06584.R()) {
               if (!(class06584.B() instanceof class06920 class06920)) {
                  return false;
               }

               if (class06563 == null) {
                  class06563 = class06920.N();
               } else if (class06563 != class06920.N()) {
                  return false;
               }

               int j = class06584.a_(class02484.Nv, class02708.L).y().size();
               if (j > 6) {
                  return false;
               }

               if (j > 0) {
                  if (flag1) {
                     return false;
                  }

                  flag1 = true;
               } else {
                  if (flag) {
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
   public class06514<class06498> method_8119() {
      return class06514.E;
   }
}
