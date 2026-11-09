package minecraft;

public class class05158 extends class06476 {
   public class05158(class07211 var1, class06433 var2) {
      super(class04878.c, 1, var1, var2, 2, 2, 2);
   }

   public class05158(class07001 var1) {
      super(class04878.c, var1);
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      this.N(var1, var5, 1, 8, 0, 14, 8, 14, y);
      byte b0 = 7;
      class00500 class00500 = L;
      this.N(var1, var5, 0, 7, 0, 0, 7, 15, class00500, class00500, false);
      this.N(var1, var5, 15, 7, 0, 15, 7, 15, class00500, class00500, false);
      this.N(var1, var5, 1, 7, 0, 15, 7, 0, class00500, class00500, false);
      this.N(var1, var5, 1, 7, 15, 14, 7, 15, class00500, class00500, false);

      for (int i = 1; i <= 6; i++) {
         class00500 = L;
         if (i == 2 || i == 6) {
            class00500 = y;
         }

         for (byte b1 = 0; b1 <= 15; b1 += 15) {
            this.N(var1, var5, b1, i, 0, b1, i, 1, class00500, class00500, false);
            this.N(var1, var5, b1, i, 6, b1, i, 9, class00500, class00500, false);
            this.N(var1, var5, b1, i, 14, b1, i, 15, class00500, class00500, false);
         }

         this.N(var1, var5, 1, i, 0, 1, i, 0, class00500, class00500, false);
         this.N(var1, var5, 6, i, 0, 9, i, 0, class00500, class00500, false);
         this.N(var1, var5, 14, i, 0, 14, i, 0, class00500, class00500, false);
         this.N(var1, var5, 1, i, 15, 14, i, 15, class00500, class00500, false);
      }

      this.N(var1, var5, 6, 3, 6, 9, 6, 9, u, u, false);
      this.N(var1, var5, 7, 4, 7, 8, 5, 8, class00869.Lb.W(), class00869.Lb.W(), false);

      for (byte b2 = 3; b2 <= 6; b2 += 3) {
         for (byte b3 = 6; b3 <= 9; b3 += 3) {
            this.L(var1, R, b3, b2, 6, var5);
            this.L(var1, R, b3, b2, 9, var5);
         }
      }

      this.N(var1, var5, 5, 1, 6, 5, 2, 6, L, L, false);
      this.N(var1, var5, 5, 1, 9, 5, 2, 9, L, L, false);
      this.N(var1, var5, 10, 1, 6, 10, 2, 6, L, L, false);
      this.N(var1, var5, 10, 1, 9, 10, 2, 9, L, L, false);
      this.N(var1, var5, 6, 1, 5, 6, 2, 5, L, L, false);
      this.N(var1, var5, 9, 1, 5, 9, 2, 5, L, L, false);
      this.N(var1, var5, 6, 1, 10, 6, 2, 10, L, L, false);
      this.N(var1, var5, 9, 1, 10, 9, 2, 10, L, L, false);
      this.N(var1, var5, 5, 2, 5, 5, 6, 5, L, L, false);
      this.N(var1, var5, 5, 2, 10, 5, 6, 10, L, L, false);
      this.N(var1, var5, 10, 2, 5, 10, 6, 5, L, L, false);
      this.N(var1, var5, 10, 2, 10, 10, 6, 10, L, L, false);
      this.N(var1, var5, 5, 7, 1, 5, 7, 6, L, L, false);
      this.N(var1, var5, 10, 7, 1, 10, 7, 6, L, L, false);
      this.N(var1, var5, 5, 7, 9, 5, 7, 14, L, L, false);
      this.N(var1, var5, 10, 7, 9, 10, 7, 14, L, L, false);
      this.N(var1, var5, 1, 7, 5, 6, 7, 5, L, L, false);
      this.N(var1, var5, 1, 7, 10, 6, 7, 10, L, L, false);
      this.N(var1, var5, 9, 7, 5, 14, 7, 5, L, L, false);
      this.N(var1, var5, 9, 7, 10, 14, 7, 10, L, L, false);
      this.N(var1, var5, 2, 1, 2, 2, 1, 3, L, L, false);
      this.N(var1, var5, 3, 1, 2, 3, 1, 2, L, L, false);
      this.N(var1, var5, 13, 1, 2, 13, 1, 3, L, L, false);
      this.N(var1, var5, 12, 1, 2, 12, 1, 2, L, L, false);
      this.N(var1, var5, 2, 1, 12, 2, 1, 13, L, L, false);
      this.N(var1, var5, 3, 1, 13, 3, 1, 13, L, L, false);
      this.N(var1, var5, 13, 1, 12, 13, 1, 13, L, L, false);
      this.N(var1, var5, 12, 1, 13, 12, 1, 13, L, L, false);
   }
}
