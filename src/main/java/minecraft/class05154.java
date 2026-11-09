package minecraft;

abstract class class05154 extends class04890 {
   protected class06187 N;

   public class05154(class04878 var1, int var2, class06187 var3, class05163 var4) {
      super(var1, var2, var4);
      this.N = var3;
   }

   public class05154(class04878 var1, class07001 var2) {
      super(var1, var2);
      this.N = class06187.N(var2.y("MST", 0));
   }

   protected boolean N(class07284 var1, class05163 var2) {
      int i = Math.max(this.k.B() - 1, var2.B());
      int j = Math.max(this.k.Z() - 1, var2.Z());
      int k = Math.max(this.k.z() - 1, var2.z());
      int l = Math.min(this.k.U() + 1, var2.U());
      int i1 = Math.min(this.k.E() + 1, var2.E());
      int j1 = Math.min(this.k.W() + 1, var2.W());
      class07218 class07218 = new class07218((i + l) / 2, (j + i1) / 2, (k + j1) / 2);
      if (var1.i(class07218).N(class03557.h)) {
         return true;
      } else {
         for (int k1 = i; k1 <= l; k1++) {
            for (int l1 = k; l1 <= j1; l1++) {
               if (var1.method_8320(class07218.N(k1, j, l1)).T()) {
                  return true;
               }

               if (var1.method_8320(class07218.N(k1, i1, l1)).T()) {
                  return true;
               }
            }
         }

         for (int i2 = i; i2 <= l; i2++) {
            for (int k2 = j; k2 <= i1; k2++) {
               if (var1.method_8320(class07218.N(i2, k2, k)).T()) {
                  return true;
               }

               if (var1.method_8320(class07218.N(i2, k2, j1)).T()) {
                  return true;
               }
            }
         }

         for (int j2 = k; j2 <= j1; j2++) {
            for (int l2 = j; l2 <= i1; l2++) {
               if (var1.method_8320(class07218.N(i, l2, j2)).T()) {
                  return true;
               }

               if (var1.method_8320(class07218.N(l, l2, j2)).T()) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   protected boolean N(class07290 var1, class05163 var2, int var3, int var4, int var5, int var6) {
      for (int i = var3; i <= var4; i++) {
         if (this.N(var1, i, var5 + 1, var6, var2).P()) {
            return false;
         }
      }

      return true;
   }

   protected void N(class05974 var1, class05163 var2, class00500 var3, int var4, int var5, int var6) {
      if (this.y(var1, var4, var5, var6, var2)) {
         class07218 class07218 = this.L(var4, var5, var6);
         if (!var1.method_8320(class07218).L(var1, class07218, class07211.field_11036)) {
            var1.method_8652(class07218, var3, 2);
         }
      }
   }

   @Override
   protected void N(class03298 var1, class07001 var2) {
      var2.N("MST", this.N.ordinal());
   }

   @Override
   protected boolean N(class05487 var1, int var2, int var3, int var4, class05163 var5) {
      class00500 class00500 = this.N(var1, var2, var3, var4, var5);
      return !class00500.N(this.N.L().i()) && !class00500.N(this.N.y().i()) && !class00500.N(this.N.u().i()) && !class00500.N(class00869.Rg);
   }
}
