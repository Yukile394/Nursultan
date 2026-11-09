package minecraft;

public class class06443 extends class06476 {
   private int N;

   public class06443(class07211 var1, class05163 var2, int var3) {
      super(class04878.D, var1, 1, var2);
      this.N = var3 & 1;
   }

   public class06443(class07001 var1) {
      super(class04878.D, var1);
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      if (this.N == 0) {
         for (int i = 0; i < 4; i++) {
            this.N(var1, var5, 10 - i, 3 - i, 20 - i, 12 + i, 3 - i, 20, L, L, false);
         }

         this.N(var1, var5, 7, 0, 6, 15, 0, 16, L, L, false);
         this.N(var1, var5, 6, 0, 6, 6, 3, 20, L, L, false);
         this.N(var1, var5, 16, 0, 6, 16, 3, 20, L, L, false);
         this.N(var1, var5, 7, 1, 7, 7, 1, 20, L, L, false);
         this.N(var1, var5, 15, 1, 7, 15, 1, 20, L, L, false);
         this.N(var1, var5, 7, 1, 6, 9, 3, 6, L, L, false);
         this.N(var1, var5, 13, 1, 6, 15, 3, 6, L, L, false);
         this.N(var1, var5, 8, 1, 7, 9, 1, 7, L, L, false);
         this.N(var1, var5, 13, 1, 7, 14, 1, 7, L, L, false);
         this.N(var1, var5, 9, 0, 5, 13, 0, 5, L, L, false);
         this.N(var1, var5, 10, 0, 7, 12, 0, 7, u, u, false);
         this.N(var1, var5, 8, 0, 10, 8, 0, 12, u, u, false);
         this.N(var1, var5, 14, 0, 10, 14, 0, 12, u, u, false);

         for (byte b2 = 18; b2 >= 7; b2 -= 3) {
            this.L(var1, R, 6, 3, b2, var5);
            this.L(var1, R, 16, 3, b2, var5);
         }

         this.L(var1, R, 10, 0, 10, var5);
         this.L(var1, R, 12, 0, 10, var5);
         this.L(var1, R, 10, 0, 12, var5);
         this.L(var1, R, 12, 0, 12, var5);
         this.L(var1, R, 8, 3, 6, var5);
         this.L(var1, R, 14, 3, 6, var5);
         this.L(var1, L, 4, 2, 4, var5);
         this.L(var1, R, 4, 1, 4, var5);
         this.L(var1, L, 4, 0, 4, var5);
         this.L(var1, L, 18, 2, 4, var5);
         this.L(var1, R, 18, 1, 4, var5);
         this.L(var1, L, 18, 0, 4, var5);
         this.L(var1, L, 4, 2, 18, var5);
         this.L(var1, R, 4, 1, 18, var5);
         this.L(var1, L, 4, 0, 18, var5);
         this.L(var1, L, 18, 2, 18, var5);
         this.L(var1, R, 18, 1, 18, var5);
         this.L(var1, L, 18, 0, 18, var5);
         this.L(var1, L, 9, 7, 20, var5);
         this.L(var1, L, 13, 7, 20, var5);
         this.N(var1, var5, 6, 0, 21, 7, 4, 21, L, L, false);
         this.N(var1, var5, 15, 0, 21, 16, 4, 21, L, L, false);
         this.N(var1, var5, 11, 2, 16);
      } else if (this.N == 1) {
         this.N(var1, var5, 9, 3, 18, 13, 3, 20, L, L, false);
         this.N(var1, var5, 9, 0, 18, 9, 2, 18, L, L, false);
         this.N(var1, var5, 13, 0, 18, 13, 2, 18, L, L, false);
         byte b3 = 9;
         byte b0 = 20;
         byte b1 = 5;

         for (int j = 0; j < 2; j++) {
            this.L(var1, L, b3, 6, 20, var5);
            this.L(var1, R, b3, 5, 20, var5);
            this.L(var1, L, b3, 4, 20, var5);
            b3 = 13;
         }

         this.N(var1, var5, 7, 3, 7, 15, 3, 14, L, L, false);
         b3 = 10;

         for (int k = 0; k < 2; k++) {
            this.N(var1, var5, b3, 0, 10, b3, 6, 10, L, L, false);
            this.N(var1, var5, b3, 0, 12, b3, 6, 12, L, L, false);
            this.L(var1, R, b3, 0, 10, var5);
            this.L(var1, R, b3, 0, 12, var5);
            this.L(var1, R, b3, 4, 10, var5);
            this.L(var1, R, b3, 4, 12, var5);
            b3 = 12;
         }

         b3 = 8;

         for (int l = 0; l < 2; l++) {
            this.N(var1, var5, b3, 0, 7, b3, 2, 7, L, L, false);
            this.N(var1, var5, b3, 0, 14, b3, 2, 14, L, L, false);
            b3 = 14;
         }

         this.N(var1, var5, 8, 3, 8, 8, 3, 13, u, u, false);
         this.N(var1, var5, 14, 3, 8, 14, 3, 13, u, u, false);
         this.N(var1, var5, 11, 5, 13);
      }
   }
}
