package minecraft;

import Nursultan.class10544;

public class class05856 extends class07482 {
   private static final int i = 1;
   private static final int R = 1;
   public static final int N = 1;
   public static final int y = 2;
   public static final int L = 3;
   public static final int u = 100;
   private final class06695 j;
   private final class05845 v;

   public class05856(int var1) {
      this(var1, new class07075(1), new class05853(1));
   }

   public class05856(int var1, class06695 var2, class05845 var3) {
      super(class05851.field_17338, var1);
      N(var2, 1);
      N(var3, 1);
      this.j = var2;
      this.v = var3;
      this.N(new class10544(this, var2, 0, 0, 0));
      this.N(var3);
   }

   @Override
   public void y(int var1, int var2) {
      super.y(var1, var2);
      this.u();
   }

   @Override
   public boolean y(class08036 var1, int var2) {
      if (var2 >= 100) {
         int k = var2 - 100;
         this.y(0, k);
         return true;
      } else {
         switch (var2) {
            case 1:
               int jx = this.v.N(0);
               this.y(0, jx - 1);
               return true;
            case 2:
               int ix = this.v.N(0);
               this.y(0, ix + 1);
               return true;
            case 3:
               if (!var1.method_7294()) {
                  return false;
               }

               class06584 class06584 = this.j.method_5441(0);
               this.j.method_5431();
               if (!var1.method_31548().M(class06584)) {
                  var1.method_7328(class06584, false);
               }

               return true;
            default:
               return false;
         }
      }
   }

   public class06584 E() {
      return this.j.method_5438(0);
   }

   @Override
   public boolean N(class08036 var1) {
      return this.j.method_5443(var1);
   }

   @Override
   public class06584 N(class08036 var1, int var2) {
      return class06584.E;
   }

   public int W() {
      return this.v.N(0);
   }
}
