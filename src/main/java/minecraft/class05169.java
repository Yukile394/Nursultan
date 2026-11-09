package minecraft;

public class class05169 extends class06476 {
   public class05169(class07211 var1, class06433 var2) {
      super(class04878.p, 1, var1, var2, 1, 2, 1);
   }

   public class05169(class07001 var1) {
      super(class04878.p, var1);
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      if (this.d.N / 25 > 0) {
         this.N(var1, var5, 0, 0, this.d.L[class07211.field_11033.L()]);
      }

      class06433 class06433x = this.d.y[class07211.field_11036.L()];
      if (class06433x.y[class07211.field_11036.L()] == null) {
         this.N(var1, var5, 1, 8, 1, 6, 8, 6, y);
      }

      this.N(var1, var5, 0, 4, 0, 0, 4, 7, L, L, false);
      this.N(var1, var5, 7, 4, 0, 7, 4, 7, L, L, false);
      this.N(var1, var5, 1, 4, 0, 6, 4, 0, L, L, false);
      this.N(var1, var5, 1, 4, 7, 6, 4, 7, L, L, false);
      this.N(var1, var5, 2, 4, 1, 2, 4, 2, L, L, false);
      this.N(var1, var5, 1, 4, 2, 1, 4, 2, L, L, false);
      this.N(var1, var5, 5, 4, 1, 5, 4, 2, L, L, false);
      this.N(var1, var5, 6, 4, 2, 6, 4, 2, L, L, false);
      this.N(var1, var5, 2, 4, 5, 2, 4, 6, L, L, false);
      this.N(var1, var5, 1, 4, 5, 1, 4, 5, L, L, false);
      this.N(var1, var5, 5, 4, 5, 5, 4, 6, L, L, false);
      this.N(var1, var5, 6, 4, 5, 6, 4, 5, L, L, false);
      class06433 class06433x = this.d;

      for (byte b0 = 1; b0 <= 5; b0 += 4) {
         byte b1 = 0;
         if (class06433x.L[class07211.field_11035.L()]) {
            this.N(var1, var5, 2, b0, b1, 2, b0 + 2, b1, L, L, false);
            this.N(var1, var5, 5, b0, b1, 5, b0 + 2, b1, L, L, false);
            this.N(var1, var5, 3, b0 + 2, b1, 4, b0 + 2, b1, L, L, false);
         } else {
            this.N(var1, var5, 0, b0, b1, 7, b0 + 2, b1, L, L, false);
            this.N(var1, var5, 0, b0 + 1, b1, 7, b0 + 1, b1, y, y, false);
         }

         b1 = 7;
         if (class06433x.L[class07211.field_11043.L()]) {
            this.N(var1, var5, 2, b0, b1, 2, b0 + 2, b1, L, L, false);
            this.N(var1, var5, 5, b0, b1, 5, b0 + 2, b1, L, L, false);
            this.N(var1, var5, 3, b0 + 2, b1, 4, b0 + 2, b1, L, L, false);
         } else {
            this.N(var1, var5, 0, b0, b1, 7, b0 + 2, b1, L, L, false);
            this.N(var1, var5, 0, b0 + 1, b1, 7, b0 + 1, b1, y, y, false);
         }

         byte b2 = 0;
         if (class06433x.L[class07211.field_11039.L()]) {
            this.N(var1, var5, b2, b0, 2, b2, b0 + 2, 2, L, L, false);
            this.N(var1, var5, b2, b0, 5, b2, b0 + 2, 5, L, L, false);
            this.N(var1, var5, b2, b0 + 2, 3, b2, b0 + 2, 4, L, L, false);
         } else {
            this.N(var1, var5, b2, b0, 0, b2, b0 + 2, 7, L, L, false);
            this.N(var1, var5, b2, b0 + 1, 0, b2, b0 + 1, 7, y, y, false);
         }

         b2 = 7;
         if (class06433x.L[class07211.field_11034.L()]) {
            this.N(var1, var5, b2, b0, 2, b2, b0 + 2, 2, L, L, false);
            this.N(var1, var5, b2, b0, 5, b2, b0 + 2, 5, L, L, false);
            this.N(var1, var5, b2, b0 + 2, 3, b2, b0 + 2, 4, L, L, false);
         } else {
            this.N(var1, var5, b2, b0, 0, b2, b0 + 2, 7, L, L, false);
            this.N(var1, var5, b2, b0 + 1, 0, b2, b0 + 1, 7, y, y, false);
         }

         class06433x = class06433x;
      }
   }
}
