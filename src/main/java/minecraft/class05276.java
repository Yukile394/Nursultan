package minecraft;

import org.jspecify.annotations.Nullable;

class class05276 {
   final int N;
   final int y;
   private final int L;
   private final int u;
   @Nullable
   private class05276 i;
   @Nullable
   private class05276 R;
   private boolean M;

   class05276(int var1, int var2, int var3, int var4) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
   }

   @Nullable
   class05276 N(class05237 var1) {
      if (this.i != null && this.R != null) {
         class05276 class05276 = this.i.N(var1);
         if (class05276 == null) {
            class05276 = this.R.N(var1);
         }

         return class05276;
      } else if (this.M) {
         return null;
      } else {
         int ix = var1.method_2031();
         int j = var1.method_2032();
         if (ix > this.L || j > this.u) {
            return null;
         } else if (ix == this.L && j == this.u) {
            this.M = true;
            return this;
         } else {
            int k = this.L - ix;
            int l = this.u - j;
            if (k > l) {
               this.i = new class05276(this.N, this.y, ix, this.u);
               this.R = new class05276(this.N + ix + 1, this.y, this.L - ix - 1, this.u);
            } else {
               this.i = new class05276(this.N, this.y, this.L, j);
               this.R = new class05276(this.N, this.y + j + 1, this.L, this.u - j - 1);
            }

            return this.i.N(var1);
         }
      }
   }
}
