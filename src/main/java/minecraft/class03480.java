package minecraft;

public class class03480 {
   private static final int y = 16;
   public static final int N = Integer.MIN_VALUE;
   private final int L;
   private final class04552 u;
   private final class07218 i = new class07218();
   private final class07218 R = new class07218();

   private static int L(int var0, int var1) {
      return var0 + var1 * 16;
   }

   private int L(int var1) {
      return var1 == this.L ? Integer.MIN_VALUE : var1;
   }

   public class03480(class05474 var1) {
      super();
      this.L = var1.method_31607() - 1;
      int ix = class04995.R(var1.method_31600() + 1 - this.L + 1);
      this.u = new class01198(ix, 256);
   }

   private int y(int var1) {
      return this.u.N(var1) + this.L;
   }

   private void y(int var1, int var2) {
      this.u.y(var1, var2 - this.L);
   }

   public int N() {
      int ix = Integer.MIN_VALUE;

      for (int j = 0; j < this.u.y(); j++) {
         int k = this.u.N(j);
         if (k > ix) {
            ix = k;
         }
      }

      return this.L(ix + this.L);
   }

   private void N(int var1) {
      int ix = var1 - this.L;

      for (int j = 0; j < this.u.y(); j++) {
         this.u.y(j, ix);
      }
   }

   public int N(int var1, int var2) {
      int ix = this.y(L(var1, var2));
      return this.L(ix);
   }

   public void N(class08050 var1) {
      int ix = var1.N();
      if (ix == -1) {
         this.N(this.L);
      } else {
         for (int j = 0; j < 16; j++) {
            for (int k = 0; k < 16; k++) {
               int l = Math.max(this.N(var1, ix, k, j), this.L);
               this.y(L(k, j), l);
            }
         }
      }
   }

   public boolean N(class07290 var1, int var2, int var3, int var4) {
      int ix = var3 + 1;
      int j = L(var2, var4);
      int k = this.y(j);
      if (ix < k) {
         return false;
      } else {
         class07218 class07218xx = this.i.N(var2, var3 + 1, var4);
         class00500 class00500xx = var1.method_8320(class07218xx);
         class07218 class07218x = this.R.N(var2, var3, var4);
         class00500 class00500x = var1.method_8320(class07218x);
         if (this.N(var1, j, k, class07218xx, class00500xx, class07218x, class00500x)) {
            return true;
         } else {
            class07218 class07218xx = this.i.N(var2, var3 - 1, var4);
            class00500 class00500xx = var1.method_8320(class07218xx);
            return this.N(var1, j, k, class07218x, class00500x, class07218xx, class00500xx);
         }
      }
   }

   private boolean N(class07290 var1, int var2, int var3, class07209 var4, class00500 var5, class07209 var6, class00500 var7) {
      int ix = var4.method_10264();
      if (N(var5, var7)) {
         if (ix > var3) {
            this.y(var2, ix);
            return true;
         }
      } else if (ix == var3) {
         this.y(var2, this.N(var1, var6, var7));
         return true;
      }

      return false;
   }

   private int N(class07290 var1, class07209 var2, class00500 var3) {
      class07218 class07218x = this.i.N(var2);
      class07218 class07218x = this.R.N(var2, class07211.field_11033);
      class00500 class00500x = var3;

      while (class07218x.method_10264() >= this.L) {
         class00500 class00500x = var1.method_8320(class07218x);
         if (N(class00500x, class00500x)) {
            return class07218x.method_10264();
         }

         class00500x = class00500x;
         class07218x.N(class07218x);
         class07218x.N(class07211.field_11033);
      }

      return this.L;
   }

   private static boolean N(class00500 var0, class00500 var1) {
      if (var1.z() != 0) {
         return true;
      } else {
         class00494 class00494x = class05015.N(var0, class07211.field_11033);
         class00494 class00494x = class05015.N(var1, class07211.field_11036);
         return class00389.y(class00494x, class00494x);
      }
   }

   private int N(class08050 var1, int var2, int var3, int var4) {
      int ix = class01296.L(var1.method_31604(var2) + 1);
      class07218 class07218x = this.i.N(var3, ix, var4);
      class07218 class07218x = this.R.N(class07218x, class07211.field_11033);
      class00500 class00500x = class00869.N.W();

      for (int j = var2; j >= 0; j--) {
         class00554 class00554 = var1.y(j);
         if (class00554.L()) {
            class00500x = class00869.N.W();
            int l = var1.method_31604(j);
            class07218x.method_10099(class01296.L(l));
            class07218x.method_10099(class07218x.method_10264() - 1);
         } else {
            for (int k = 15; k >= 0; k--) {
               class00500 class00500x = class00554.N(var3, k, var4);
               if (N(class00500x, class00500x)) {
                  return class07218x.method_10264();
               }

               class00500x = class00500x;
               class07218x.N(class07218x);
               class07218x.N(class07211.field_11033);
            }
         }
      }

      return this.L;
   }
}
