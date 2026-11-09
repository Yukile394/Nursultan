package minecraft;

import org.joml.Vector2i;

public class class02408 implements class02457 {
   private final class06202 N;
   private final class02419 y;

   public class02408(class06202 var1) {
      super();
      this.N = var1;
      this.y = new class02419();
   }

   @Override
   public void y(class06937 var1) {
      this.N(var1.i(), var1.u);
   }

   public void N(class06584 var1, int var2) {
      this.N(var1, var2, -1);
   }

   private void N(class06584 var1, int var2, int var3) {
      if (this.N.NE() != null && var3 < class05462.W(var1)) {
         class01683 class01683 = this.N.NE();
         class05462.N(var1, var3);
         class01683.N(new class02575(var2, var3));
      }
   }

   @Override
   public void N(class06937 var1, class07510 var2) {
      if (var2 == class07510.field_7794 || var2 == class07510.field_7791) {
         this.N(var1.i(), var1.u);
      }
   }

   @Override
   public boolean N(class06937 var1) {
      return var1.i().N(class01226.LE);
   }

   @Override
   public boolean N(double var1, double var3, int var5, class06584 var6) {
      int i = class05462.W(var6);
      if (i == 0) {
         return false;
      } else {
         Vector2i vector2i = this.y.N(var1, var3);
         int j = vector2i.y == 0 ? -vector2i.x : vector2i.y;
         if (j != 0) {
            int k = class05462.R(var6);
            int l = class02419.N(j, k, i);
            if (k != l) {
               this.N(var6, var5, l);
            }
         }

         return true;
      }
   }
}
