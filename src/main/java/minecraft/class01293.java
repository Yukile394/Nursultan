package minecraft;

public abstract class class01293 extends class05010 {
   protected class01293(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   protected int y(long var1, long var3, int var5) {
      return this.N(var1) ? this.y(var3) : var5 + 1;
   }

   protected abstract int y(long var1);

   public void y(long var1, int var3, boolean var4) {
      this.N(Long.MAX_VALUE, var1, var3, var4);
   }

   @Override
   protected int N(long var1, long var3, int var5) {
      int i = var5;

      for (int j = -1; j <= 1; j++) {
         for (int k = -1; k <= 1; k++) {
            for (int l = -1; l <= 1; l++) {
               long i1 = class01296.N(var1, j, k, l);
               if (i1 == var1) {
                  i1 = Long.MAX_VALUE;
               }

               if (i1 != var3) {
                  int j1 = this.y(i1, var1, this.L(i1));
                  if (i > j1) {
                     i = j1;
                  }

                  if (i == 0) {
                     return i;
                  }
               }
            }
         }
      }

      return i;
   }

   @Override
   protected void N(long var1, int var3, boolean var4) {
      if (!var4 || var3 < this.R - 2) {
         for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
               for (int k = -1; k <= 1; k++) {
                  long l = class01296.N(var1, i, j, k);
                  if (l != var1) {
                     this.y(var1, l, var3, var4);
                  }
               }
            }
         }
      }
   }
}
