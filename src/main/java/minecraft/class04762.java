package minecraft;

public abstract class class04762 extends class05010 {
   protected class04762(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public void y(long var1, int var3, boolean var4) {
      this.N(class07321.L, var1, var3, var4);
   }

   @Override
   protected int y(long var1, long var3, int var5) {
      return var1 == class07321.L ? this.y(var3) : var5 + 1;
   }

   protected abstract int y(long var1);

   @Override
   protected void N(long var1, int var3, boolean var4) {
      if (!var4 || var3 < this.R - 2) {
         class07321 class07321 = new class07321(var1);
         int i = class07321.B;
         int j = class07321.Z;

         for (int k = -1; k <= 1; k++) {
            for (int l = -1; l <= 1; l++) {
               long i1 = class07321.u(i + k, j + l);
               if (i1 != var1) {
                  this.y(var1, i1, var3, var4);
               }
            }
         }
      }
   }

   @Override
   protected boolean N(long var1) {
      return var1 == class07321.L;
   }

   @Override
   protected int N(long var1, long var3, int var5) {
      int i = var5;
      class07321 class07321 = new class07321(var1);
      int j = class07321.B;
      int k = class07321.Z;

      for (int l = -1; l <= 1; l++) {
         for (int i1 = -1; i1 <= 1; i1++) {
            long j1 = class07321.u(j + l, k + i1);
            if (j1 == var1) {
               j1 = class07321.L;
            }

            if (j1 != var3) {
               int k1 = this.y(j1, var1, this.L(j1));
               if (i > k1) {
                  i = k1;
               }

               if (i == 0) {
                  return i;
               }
            }
         }
      }

      return i;
   }
}
