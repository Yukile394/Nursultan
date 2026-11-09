package minecraft;

public abstract class class04894 extends class04890 {
   protected final int L;
   protected final int u;
   protected final int i;
   protected int R = -1;

   protected class04894(class04878 var1, int var2, int var3, int var4, int var5, int var6, int var7, class07211 var8) {
      super(var1, 0, class04890.N(var2, var3, var4, var8, var5, var6, var7));
      this.L = var5;
      this.u = var6;
      this.i = var7;
      this.N(var8);
   }

   protected class04894(class04878 var1, class07001 var2) {
      super(var1, var2);
      this.L = var2.y("Width", 0);
      this.u = var2.y("Height", 0);
      this.i = var2.y("Depth", 0);
      this.R = var2.y("HPos", 0);
   }

   protected boolean N(class07284 var1, class05163 var2, int var3) {
      if (this.R >= 0) {
         return true;
      } else {
         int ix = 0;
         int j = 0;
         class07218 class07218 = new class07218();

         for (int k = this.k.z(); k <= this.k.W(); k++) {
            for (int l = this.k.B(); l <= this.k.U(); l++) {
               class07218.N(l, 64, k);
               if (var2.y(class07218)) {
                  ix += var1.N(class07830.field_13203, class07218).method_10264();
                  j++;
               }
            }
         }

         if (j == 0) {
            return false;
         } else {
            this.R = ix / j;
            this.k.N(0, this.R - this.k.Z() + var3, 0);
            return true;
         }
      }
   }

   protected boolean N(class07284 var1, int var2) {
      if (this.R >= 0) {
         return true;
      } else {
         int ix = var1.method_31600() + 1;
         boolean flag = false;
         class07218 class07218 = new class07218();

         for (int j = this.k.z(); j <= this.k.W(); j++) {
            for (int k = this.k.B(); k <= this.k.U(); k++) {
               class07218.N(k, 0, j);
               ix = Math.min(ix, var1.N(class07830.field_13203, class07218).method_10264());
               flag = true;
            }
         }

         if (!flag) {
            return false;
         } else {
            this.R = ix;
            this.k.N(0, this.R - this.k.Z() + var2, 0);
            return true;
         }
      }
   }

   @Override
   protected void N(class03298 var1, class07001 var2) {
      var2.N("Width", this.L);
      var2.N("Height", this.u);
      var2.N("Depth", this.i);
      var2.N("HPos", this.R);
   }
}
