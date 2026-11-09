package minecraft;

public class class06442 extends class06476 {
   public class06442(class07211 var1, class05163 var2) {
      super(class04878.C, var1, 1, var2);
   }

   public class06442(class07001 var1) {
      super(class04878.C, var1);
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      this.N(var1, var5, 2, -1, 2, 11, -1, 11, L, L, false);
      this.N(var1, var5, 0, -1, 0, 1, -1, 11, y, y, false);
      this.N(var1, var5, 12, -1, 0, 13, -1, 11, y, y, false);
      this.N(var1, var5, 2, -1, 0, 11, -1, 1, y, y, false);
      this.N(var1, var5, 2, -1, 12, 11, -1, 13, y, y, false);
      this.N(var1, var5, 0, 0, 0, 0, 0, 13, L, L, false);
      this.N(var1, var5, 13, 0, 0, 13, 0, 13, L, L, false);
      this.N(var1, var5, 1, 0, 0, 12, 0, 0, L, L, false);
      this.N(var1, var5, 1, 0, 13, 12, 0, 13, L, L, false);

      for (byte b0 = 2; b0 <= 11; b0 += 3) {
         this.L(var1, R, 0, 0, b0, var5);
         this.L(var1, R, 13, 0, b0, var5);
         this.L(var1, R, b0, 0, 0, var5);
      }

      this.N(var1, var5, 2, 0, 3, 4, 0, 9, L, L, false);
      this.N(var1, var5, 9, 0, 3, 11, 0, 9, L, L, false);
      this.N(var1, var5, 4, 0, 9, 9, 0, 11, L, L, false);
      this.L(var1, L, 5, 0, 8, var5);
      this.L(var1, L, 8, 0, 8, var5);
      this.L(var1, L, 10, 0, 10, var5);
      this.L(var1, L, 3, 0, 10, var5);
      this.N(var1, var5, 3, 0, 3, 3, 0, 7, u, u, false);
      this.N(var1, var5, 10, 0, 3, 10, 0, 7, u, u, false);
      this.N(var1, var5, 6, 0, 10, 7, 0, 10, u, u, false);
      byte b2 = 3;

      for (int i = 0; i < 2; i++) {
         for (byte b1 = 2; b1 <= 8; b1 += 3) {
            this.N(var1, var5, b2, 0, b1, b2, 2, b1, L, L, false);
         }

         b2 = 10;
      }

      this.N(var1, var5, 5, 0, 10, 5, 2, 10, L, L, false);
      this.N(var1, var5, 8, 0, 10, 8, 2, 10, L, L, false);
      this.N(var1, var5, 6, -1, 7, 7, -1, 8, u, u, false);
      this.N(var1, var5, 6, -1, 3, 7, -1, 4);
      this.N(var1, var5, 6, 1, 6);
   }
}
