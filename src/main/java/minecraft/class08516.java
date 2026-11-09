package minecraft;

import org.jspecify.annotations.Nullable;

class class08516 {
   public static final int N = 2;
   private static final int y = -1;
   private Object[] L = new Object[16];
   private int u;

   class08516() {
      super();
   }

   public int y(class02353<?> var1) {
      int i = this.u;
      this.u += 2;
      int j = i + 1;
      int k = this.L.length;
      if (j >= k) {
         Object[] aobject = new Object[class07536.N(k, j + 1)];
         System.arraycopy(this.L, 0, aobject, 0, k);
         this.L = aobject;
      }

      this.L[i] = var1;
      return i;
   }

   public int N(class02353<?> var1) {
      for (byte b0 = 0; b0 < this.u; b0 += 2) {
         if (this.L[b0] == var1) {
            return b0;
         }
      }

      return -1;
   }

   @Nullable
   public <T> class08527<T> N(int var1) {
      return (class08527<T>)this.L[var1 + 1];
   }

   public void N(int var1, class08527<?> var2) {
      this.L[var1 + 1] = var2;
   }
}
