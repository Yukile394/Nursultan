package minecraft;

import org.jspecify.annotations.Nullable;

public class class06458 extends class06456 {
   private static final int N = 13;
   private static final int y = 14;
   private static final int L = 13;

   public class06458(int var1, class05163 var2, class07211 var3) {
      super(class04878.P, var1, var2);
      this.N(var3);
   }

   public class06458(class07001 var1) {
      super(class04878.P, var1);
   }

   @Nullable
   public static class06458 N(class03860 var0, int var1, int var2, int var3, class07211 var4, int var5) {
      class05163 class05163 = class05163.N(var1, var2, var3, -5, -3, 0, 13, 14, 13, var4);
      return N(class05163) && var0.N(class05163) == null ? new class06458(var5, class05163, var4) : null;
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      this.N(var1, var5, 0, 3, 0, 12, 4, 12, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 0, 5, 0, 12, 13, 12, class00869.N.W(), class00869.N.W(), false);
      this.N(var1, var5, 0, 5, 0, 1, 12, 12, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 11, 5, 0, 12, 12, 12, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 2, 5, 11, 4, 12, 12, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 8, 5, 11, 10, 12, 12, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 5, 9, 11, 7, 12, 12, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 2, 5, 0, 4, 12, 1, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 8, 5, 0, 10, 12, 1, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 5, 9, 0, 7, 12, 1, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 2, 11, 2, 10, 12, 10, class00869.ML.W(), class00869.ML.W(), false);
      class00500 class00500xxxxxx = class00869.Mu.W().y(class00730.i, true).y(class00730.L, true);
      class00500 class00500x = class00869.Mu.W().y(class00730.y, true).y(class00730.u, true);
      class00500 class00500xx = class00500x.y(class00730.i, true);
      class00500 class00500xxx = class00500x.y(class00730.L, true);

      for (byte b0 = 1; b0 <= 11; b0 += 2) {
         this.N(var1, var5, b0, 10, 0, b0, 11, 0, class00500xxxxxx, class00500xxxxxx, false);
         this.N(var1, var5, b0, 10, 12, b0, 11, 12, class00500xxxxxx, class00500xxxxxx, false);
         this.N(var1, var5, 0, 10, b0, 0, 11, b0, class00500x, class00500x, false);
         this.N(var1, var5, 12, 10, b0, 12, 11, b0, class00500x, class00500x, false);
         this.L(var1, class00869.ML.W(), b0, 13, 0, var5);
         this.L(var1, class00869.ML.W(), b0, 13, 12, var5);
         this.L(var1, class00869.ML.W(), 0, 13, b0, var5);
         this.L(var1, class00869.ML.W(), 12, 13, b0, var5);
         if (b0 != 11) {
            this.L(var1, class00500xxxxxx, b0 + 1, 13, 0, var5);
            this.L(var1, class00500xxxxxx, b0 + 1, 13, 12, var5);
            this.L(var1, class00500x, 0, 13, b0 + 1, var5);
            this.L(var1, class00500x, 12, 13, b0 + 1, var5);
         }
      }

      this.L(var1, class00869.Mu.W().y(class00730.y, true).y(class00730.L, true), 0, 13, 0, var5);
      this.L(var1, class00869.Mu.W().y(class00730.u, true).y(class00730.L, true), 0, 13, 12, var5);
      this.L(var1, class00869.Mu.W().y(class00730.u, true).y(class00730.i, true), 12, 13, 12, var5);
      this.L(var1, class00869.Mu.W().y(class00730.y, true).y(class00730.i, true), 12, 13, 0, var5);

      for (byte b1 = 3; b1 <= 9; b1 += 2) {
         this.N(var1, var5, 1, 7, b1, 1, 8, b1, class00500xx, class00500xx, false);
         this.N(var1, var5, 11, 7, b1, 11, 8, b1, class00500xxx, class00500xxx, false);
      }

      class00500 class00500xxxx = class00869.Mi.W().y(class07746.y, class07211.field_11043);

      for (int i = 0; i <= 6; i++) {
         int j = i + 4;

         for (int k = 5; k <= 7; k++) {
            this.L(var1, class00500xxxx, k, 5 + i, j, var5);
         }

         if (j >= 5 && j <= 8) {
            this.N(var1, var5, 5, 5, j, 7, i + 4, j, class00869.ML.W(), class00869.ML.W(), false);
         } else if (j >= 9 && j <= 10) {
            this.N(var1, var5, 5, 8, j, 7, i + 4, j, class00869.ML.W(), class00869.ML.W(), false);
         }

         if (i >= 1) {
            this.N(var1, var5, 5, 6 + i, j, 7, 9 + i, j, class00869.N.W(), class00869.N.W(), false);
         }
      }

      for (int i1 = 5; i1 <= 7; i1++) {
         this.L(var1, class00500xxxx, i1, 12, 11, var5);
      }

      this.N(var1, var5, 5, 6, 7, 5, 7, 7, class00500xxx, class00500xxx, false);
      this.N(var1, var5, 7, 6, 7, 7, 7, 7, class00500xx, class00500xx, false);
      this.N(var1, var5, 5, 13, 12, 7, 13, 12, class00869.N.W(), class00869.N.W(), false);
      this.N(var1, var5, 2, 5, 2, 3, 5, 3, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 2, 5, 9, 3, 5, 10, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 2, 5, 4, 2, 5, 8, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 9, 5, 2, 10, 5, 3, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 9, 5, 9, 10, 5, 10, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 10, 5, 4, 10, 5, 8, class00869.ML.W(), class00869.ML.W(), false);
      class00500 class00500xxxxx = class00500xxxx.y(class07746.y, class07211.field_11034);
      class00500 class00500xxxxxx = class00500xxxx.y(class07746.y, class07211.field_11039);
      this.L(var1, class00500xxxxxx, 4, 5, 2, var5);
      this.L(var1, class00500xxxxxx, 4, 5, 3, var5);
      this.L(var1, class00500xxxxxx, 4, 5, 9, var5);
      this.L(var1, class00500xxxxxx, 4, 5, 10, var5);
      this.L(var1, class00500xxxxx, 8, 5, 2, var5);
      this.L(var1, class00500xxxxx, 8, 5, 3, var5);
      this.L(var1, class00500xxxxx, 8, 5, 9, var5);
      this.L(var1, class00500xxxxx, 8, 5, 10, var5);
      this.N(var1, var5, 3, 4, 4, 4, 4, 8, class00869.iw.W(), class00869.iw.W(), false);
      this.N(var1, var5, 8, 4, 4, 9, 4, 8, class00869.iw.W(), class00869.iw.W(), false);
      this.N(var1, var5, 3, 5, 4, 4, 5, 8, class00869.MR.W(), class00869.MR.W(), false);
      this.N(var1, var5, 8, 5, 4, 9, 5, 8, class00869.MR.W(), class00869.MR.W(), false);
      this.N(var1, var5, 4, 2, 0, 8, 2, 12, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 0, 2, 4, 12, 2, 8, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 4, 0, 0, 8, 1, 3, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 4, 0, 9, 8, 1, 12, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 0, 0, 4, 3, 1, 8, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 9, 0, 4, 12, 1, 8, class00869.ML.W(), class00869.ML.W(), false);

      for (int j1 = 4; j1 <= 8; j1++) {
         for (int l = 0; l <= 2; l++) {
            this.N(var1, class00869.ML.W(), j1, -1, l, var5);
            this.N(var1, class00869.ML.W(), j1, -1, 12 - l, var5);
         }
      }

      for (int k1 = 0; k1 <= 2; k1++) {
         for (int l1 = 4; l1 <= 8; l1++) {
            this.N(var1, class00869.ML.W(), k1, -1, l1, var5);
            this.N(var1, class00869.ML.W(), 12 - k1, -1, l1, var5);
         }
      }
   }

   @Override
   public void N(class04890 var1, class03860 var2, class06069 var3) {
      this.N((class06461)var1, var2, var3, 5, 3, true);
      this.N((class06461)var1, var2, var3, 5, 11, true);
   }
}
