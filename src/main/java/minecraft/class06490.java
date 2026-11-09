package minecraft;

public class class06490 extends class06520 {
   public class06490(class03762 var1) {
      super(var1);
   }

   @Override
   public class00743<class06584> N(class02903 var1) {
      class00743 class00743 = class00743.method_10213(var1.N(), class06584.E);

      for (int i = 0; i < class00743.size(); i++) {
         class06584 class06584x = var1.N(i);
         class06584 class06584x = class06584x.B().Z();
         if (!class06584x.R()) {
            class00743.set(i, class06584x);
         } else if (class06584x.L(class02484.NL)) {
            class00743.set(i, class06584x.L(1));
            break;
         }
      }

      return class00743;
   }

   public class06584 method_8116(class02903 var1, class01929 var2) {
      int i = 0;
      class06584 class06584xx = class06584.E;

      for (int j = 0; j < var1.N(); j++) {
         class06584 class06584x = var1.N(j);
         if (!class06584x.R()) {
            if (class06584x.L(class02484.NL)) {
               if (!class06584xx.R()) {
                  return class06584.E;
               }

               class06584xx = class06584x;
            } else {
               if (!class06584x.N(class01226.LW)) {
                  return class06584.E;
               }

               i++;
            }
         }
      }

      class02706 class02706x = class06584xx.method_58694(class02484.NL);
      if (!class06584xx.R() && i >= 1 && class02706x != null) {
         class02706 class02706x = class02706x.y();
         if (class02706x == null) {
            return class06584.E;
         } else {
            class06584 class06584x = class06584xx.L(i);
            class06584x.N(class02484.NL, class02706x);
            return class06584x;
         }
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
               if (class06584.L(class02484.NL)) {
                  if (flag1) {
                     return false;
                  }

                  flag1 = true;
               } else {
                  if (!class06584.N(class01226.LW)) {
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
   public class06514<class06490> method_8119() {
      return class06514.i;
   }
}
