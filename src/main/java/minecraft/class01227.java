package minecraft;

class class01227 {
   private final int[][] L;
   final int N;
   final int y;
   private final int u;

   public class01227(int var1, int var2, int var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.u = var3;
      this.L = new int[var1][var2];
   }

   public boolean y(int var1, int var2, int var3) {
      return this.N(var1 - 1, var2) == var3 || this.N(var1 + 1, var2) == var3 || this.N(var1, var2 + 1) == var3 || this.N(var1, var2 - 1) == var3;
   }

   public int N(int var1, int var2) {
      return var1 >= 0 && var1 < this.N && var2 >= 0 && var2 < this.y ? this.L[var1][var2] : this.u;
   }

   public void N(int var1, int var2, int var3, int var4) {
      if (this.N(var1, var2) == var3) {
         this.N(var1, var2, var4);
      }
   }

   public void N(int var1, int var2, int var3) {
      if (var1 >= 0 && var1 < this.N && var2 >= 0 && var2 < this.y) {
         this.L[var1][var2] = var3;
      }
   }

   public void N(int var1, int var2, int var3, int var4, int var5) {
      for (int i = var2; i <= var4; i++) {
         for (int j = var1; j <= var3; j++) {
            this.N(j, i, var5);
         }
      }
   }
}
