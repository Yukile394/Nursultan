package minecraft;

public class class05179 extends class06476 {
   public class05179(class07211 var1, class06433 var2) {
      super(class04878.F, 1, var1, var2, 1, 2, 2);
   }

   public class05179(class07001 var1) {
      super(class04878.F, var1);
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      class06433 class06433xxx = this.d.y[class07211.field_11043.L()];
      class06433 class06433x = this.d;
      class06433 class06433xx = class06433xxx.y[class07211.field_11036.L()];
      class06433 class06433xxx = class06433x.y[class07211.field_11036.L()];
      if (this.d.N / 25 > 0) {
         this.N(var1, var5, 0, 8, class06433xxx.L[class07211.field_11033.L()]);
         this.N(var1, var5, 0, 0, class06433x.L[class07211.field_11033.L()]);
      }

      if (class06433xxx.y[class07211.field_11036.L()] == null) {
         this.N(var1, var5, 1, 8, 1, 6, 8, 7, y);
      }

      if (class06433xx.y[class07211.field_11036.L()] == null) {
         this.N(var1, var5, 1, 8, 8, 6, 8, 14, y);
      }

      for (int i = 1; i <= 7; i++) {
         class00500 class00500x = L;
         if (i == 2 || i == 6) {
            class00500x = y;
         }

         this.N(var1, var5, 0, i, 0, 0, i, 15, class00500x, class00500x, false);
         this.N(var1, var5, 7, i, 0, 7, i, 15, class00500x, class00500x, false);
         this.N(var1, var5, 1, i, 0, 6, i, 0, class00500x, class00500x, false);
         this.N(var1, var5, 1, i, 15, 6, i, 15, class00500x, class00500x, false);
      }

      for (int j = 1; j <= 7; j++) {
         class00500 class00500 = u;
         if (j == 2 || j == 6) {
            class00500 = R;
         }

         this.N(var1, var5, 3, j, 7, 4, j, 8, class00500, class00500, false);
      }

      if (class06433x.L[class07211.field_11035.L()]) {
         this.N(var1, var5, 3, 1, 0, 4, 2, 0);
      }

      if (class06433x.L[class07211.field_11034.L()]) {
         this.N(var1, var5, 7, 1, 3, 7, 2, 4);
      }

      if (class06433x.L[class07211.field_11039.L()]) {
         this.N(var1, var5, 0, 1, 3, 0, 2, 4);
      }

      if (class06433xxx.L[class07211.field_11043.L()]) {
         this.N(var1, var5, 3, 1, 15, 4, 2, 15);
      }

      if (class06433xxx.L[class07211.field_11039.L()]) {
         this.N(var1, var5, 0, 1, 11, 0, 2, 12);
      }

      if (class06433xxx.L[class07211.field_11034.L()]) {
         this.N(var1, var5, 7, 1, 11, 7, 2, 12);
      }

      if (class06433xxx.L[class07211.field_11035.L()]) {
         this.N(var1, var5, 3, 5, 0, 4, 6, 0);
      }

      if (class06433xxx.L[class07211.field_11034.L()]) {
         this.N(var1, var5, 7, 5, 3, 7, 6, 4);
         this.N(var1, var5, 5, 4, 2, 6, 4, 5, L, L, false);
         this.N(var1, var5, 6, 1, 2, 6, 3, 2, L, L, false);
         this.N(var1, var5, 6, 1, 5, 6, 3, 5, L, L, false);
      }

      if (class06433xxx.L[class07211.field_11039.L()]) {
         this.N(var1, var5, 0, 5, 3, 0, 6, 4);
         this.N(var1, var5, 1, 4, 2, 2, 4, 5, L, L, false);
         this.N(var1, var5, 1, 1, 2, 1, 3, 2, L, L, false);
         this.N(var1, var5, 1, 1, 5, 1, 3, 5, L, L, false);
      }

      if (class06433xx.L[class07211.field_11043.L()]) {
         this.N(var1, var5, 3, 5, 15, 4, 6, 15);
      }

      if (class06433xx.L[class07211.field_11039.L()]) {
         this.N(var1, var5, 0, 5, 11, 0, 6, 12);
         this.N(var1, var5, 1, 4, 10, 2, 4, 13, L, L, false);
         this.N(var1, var5, 1, 1, 10, 1, 3, 10, L, L, false);
         this.N(var1, var5, 1, 1, 13, 1, 3, 13, L, L, false);
      }

      if (class06433xx.L[class07211.field_11034.L()]) {
         this.N(var1, var5, 7, 5, 11, 7, 6, 12);
         this.N(var1, var5, 5, 4, 10, 6, 4, 13, L, L, false);
         this.N(var1, var5, 6, 1, 10, 6, 3, 10, L, L, false);
         this.N(var1, var5, 6, 1, 13, 6, 3, 13, L, L, false);
      }
   }
}
