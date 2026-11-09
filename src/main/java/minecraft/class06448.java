package minecraft;

public class class06448 extends class06476 {
   public class06448(class07211 var1, class06433 var2) {
      super(class04878.x, 1, var1, var2, 1, 1, 1);
   }

   public class06448(class07001 var1) {
      super(class04878.x, var1);
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      if (this.d.N / 25 > 0) {
         this.N(var1, var5, 0, 0, this.d.L[class07211.field_11033.L()]);
      }

      if (this.d.y[class07211.field_11036.L()] == null) {
         this.N(var1, var5, 1, 4, 1, 6, 4, 6, y);
      }

      for (int i = 1; i <= 6; i++) {
         for (int j = 1; j <= 6; j++) {
            if (var4.y(3) != 0) {
               int k = 2 + (var4.y(4) == 0 ? 0 : 1);
               class00500 class00500 = class00869.Nx.W();
               this.N(var1, var5, i, k, j, i, 3, j, class00500, class00500, false);
            }
         }
      }

      this.N(var1, var5, 0, 1, 0, 0, 1, 7, L, L, false);
      this.N(var1, var5, 7, 1, 0, 7, 1, 7, L, L, false);
      this.N(var1, var5, 1, 1, 0, 6, 1, 0, L, L, false);
      this.N(var1, var5, 1, 1, 7, 6, 1, 7, L, L, false);
      this.N(var1, var5, 0, 2, 0, 0, 2, 7, u, u, false);
      this.N(var1, var5, 7, 2, 0, 7, 2, 7, u, u, false);
      this.N(var1, var5, 1, 2, 0, 6, 2, 0, u, u, false);
      this.N(var1, var5, 1, 2, 7, 6, 2, 7, u, u, false);
      this.N(var1, var5, 0, 3, 0, 0, 3, 7, L, L, false);
      this.N(var1, var5, 7, 3, 0, 7, 3, 7, L, L, false);
      this.N(var1, var5, 1, 3, 0, 6, 3, 0, L, L, false);
      this.N(var1, var5, 1, 3, 7, 6, 3, 7, L, L, false);
      this.N(var1, var5, 0, 1, 3, 0, 2, 4, u, u, false);
      this.N(var1, var5, 7, 1, 3, 7, 2, 4, u, u, false);
      this.N(var1, var5, 3, 1, 0, 4, 2, 0, u, u, false);
      this.N(var1, var5, 3, 1, 7, 4, 2, 7, u, u, false);
      if (this.d.L[class07211.field_11035.L()]) {
         this.N(var1, var5, 3, 1, 0, 4, 2, 0);
      }
   }
}
