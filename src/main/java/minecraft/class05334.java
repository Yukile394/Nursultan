package minecraft;

import java.util.Arrays;

public class class05334 {
   private class01763[] N = new class01763[128];
   private int y;

   public class01763 L() {
      class01763 class01763 = this.N[0];
      this.N[0] = this.N[--this.y];
      this.N[this.y] = null;
      if (this.y > 0) {
         this.y(0);
      }

      class01763.u = -1;
      return class01763;
   }

   public class05334() {
      super();
   }

   public boolean i() {
      return this.y == 0;
   }

   public int u() {
      return this.y;
   }

   private void y(int var1) {
      class01763 class01763xx = this.N[var1];
      float f = class01763xx.M;

      while (true) {
         int i = 1 + (var1 << 1);
         int j = i + 1;
         if (i >= this.y) {
            break;
         }

         class01763 class01763x = this.N[i];
         float f1 = class01763x.M;
         class01763 class01763xx;
         float f2;
         if (j >= this.y) {
            class01763xx = null;
            f2 = Float.POSITIVE_INFINITY;
         } else {
            class01763xx = this.N[j];
            f2 = class01763xx.M;
         }

         if (f1 < f2) {
            if (!(f1 < f)) {
               break;
            }

            this.N[var1] = class01763x;
            class01763x.u = var1;
            var1 = i;
         } else {
            if (!(f2 < f)) {
               break;
            }

            this.N[var1] = class01763xx;
            class01763xx.u = var1;
            var1 = j;
         }
      }

      this.N[var1] = class01763xx;
      class01763xx.u = var1;
   }

   public void y(class01763 var1) {
      this.N[var1.u] = this.N[--this.y];
      this.N[this.y] = null;
      if (this.y > var1.u) {
         if (this.N[var1.u].M < var1.M) {
            this.N(var1.u);
         } else {
            this.y(var1.u);
         }
      }

      var1.u = -1;
   }

   public class01763 y() {
      return this.N[0];
   }

   private void N(int var1) {
      class01763 class01763x = this.N[var1];
      float f = class01763x.M;

      while (var1 > 0) {
         int i = var1 - 1 >> 1;
         class01763 class01763x = this.N[i];
         if (!(f < class01763x.M)) {
            break;
         }

         this.N[var1] = class01763x;
         class01763x.u = var1;
         var1 = i;
      }

      this.N[var1] = class01763x;
      class01763x.u = var1;
   }

   public class01763 N(class01763 var1) {
      if (var1.u >= 0) {
         throw new IllegalStateException("OW KNOWS!");
      } else {
         if (this.y == this.N.length) {
            class01763[] aclass01763 = new class01763[this.y << 1];
            System.arraycopy(this.N, 0, aclass01763, 0, this.y);
            this.N = aclass01763;
         }

         this.N[this.y] = var1;
         var1.u = this.y;
         this.N(this.y++);
         return var1;
      }
   }

   public void N() {
      this.y = 0;
   }

   public void N(class01763 var1, float var2) {
      float f = var1.M;
      var1.M = var2;
      if (var2 < f) {
         this.N(var1.u);
      } else {
         this.y(var1.u);
      }
   }

   public class01763[] R() {
      return Arrays.copyOf(this.N, this.y);
   }
}
