package minecraft;

final class class01153 {
   private class07209 N;
   private final boolean y;
   private int L;
   private final double u;
   private final double i;

   private int L() {
      return !this.y ? this.N.method_10264() : this.N.method_10264() + this.N();
   }

   class01153(class07209 var1, boolean var2, int var3, double var4, double var6) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var6;
   }

   private int y() {
      return this.y ? this.N.method_10264() : this.N.method_10264() - this.N();
   }

   private int N(float var1) {
      return (int)class01175.N(var1, this.L, this.i, this.u);
   }

   void N(class05974 var1, class06069 var2, class01183 var3) {
      for (int ix = -this.L; ix <= this.L; ix++) {
         for (int j = -this.L; j <= this.L; j++) {
            float f = class04995.N((float)(ix * ix + j * j));
            if (!(f > this.L)) {
               int k = this.N(f);
               if (k > 0) {
                  if (var2.z() < 0.2) {
                     k = (int)(k * class04995.y(var2, 0.8F, 1.0F));
                  }

                  class07218 class07218 = this.N.method_10069(ix, 0, j).method_25503();
                  boolean flag = false;
                  int l = this.y ? var1.method_8624(class07830.field_13194, class07218.method_10263(), class07218.method_10260()) : Integer.MAX_VALUE;

                  for (int i1 = 0; i1 < k && class07218.method_10264() < l; i1++) {
                     class07209 class07209 = var3.N(class07218);
                     if (class01175.y(var1, class07209)) {
                        flag = true;
                        class00891 class00891 = class07529.h ? class00869.ND : class00869.vF;
                        var1.method_8652(class07209, class00891.W(), 2);
                     } else if (flag && var1.method_8320(class07209).N(class01210.yb)) {
                        break;
                     }

                     class07218.N(this.y ? class07211.field_11036 : class07211.field_11033);
                  }
               }
            }
         }
      }
   }

   boolean N(class01165 var1) {
      return this.L >= var1.z && this.u >= var1.U;
   }

   boolean N(class05974 var1, class01183 var2) {
      while (this.L > 1) {
         class07218 class07218 = this.N.method_25503();
         int ix = Math.min(10, this.N());

         for (int j = 0; j < ix; j++) {
            if (var1.method_8320(class07218).N(class00869.V)) {
               return false;
            }

            if (class01175.N(var1, var2.N(class07218), this.L)) {
               this.N = class07218;
               return true;
            }

            class07218.N(this.y ? class07211.field_11033 : class07211.field_11036);
         }

         this.L /= 2;
      }

      return false;
   }

   private int N() {
      return this.N(0.0F);
   }
}
