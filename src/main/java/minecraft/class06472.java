package minecraft;

import org.jspecify.annotations.Nullable;

public class class06472 extends class06456 {
   private static final int N = 13;
   private static final int y = 14;
   private static final int L = 13;

   public class06472(int var1, class06069 var2, class05163 var3, class07211 var4) {
      super(class04878.z, var1, var3);
      this.N(var4);
   }

   public class06472(class07001 var1) {
      super(class04878.z, var1);
   }

   @Nullable
   public static class06472 N(class03860 var0, class06069 var1, int var2, int var3, int var4, class07211 var5, int var6) {
      class05163 class05163 = class05163.N(var2, var3, var4, -5, -3, 0, 13, 14, 13, var5);
      return N(class05163) && var0.N(class05163) == null ? new class06472(var6, var1, class05163, var5) : null;
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
      this.N(var1, var5, 5, 8, 0, 7, 8, 0, class00869.Mu.W(), class00869.Mu.W(), false);
      class00500 class00500x = class00869.Mu.W().y(class00730.i, true).y(class00730.L, true);
      class00500 class00500x = class00869.Mu.W().y(class00730.y, true).y(class00730.u, true);

      for (byte b0 = 1; b0 <= 11; b0 += 2) {
         this.N(var1, var5, b0, 10, 0, b0, 11, 0, class00500x, class00500x, false);
         this.N(var1, var5, b0, 10, 12, b0, 11, 12, class00500x, class00500x, false);
         this.N(var1, var5, 0, 10, b0, 0, 11, b0, class00500x, class00500x, false);
         this.N(var1, var5, 12, 10, b0, 12, 11, b0, class00500x, class00500x, false);
         this.L(var1, class00869.ML.W(), b0, 13, 0, var5);
         this.L(var1, class00869.ML.W(), b0, 13, 12, var5);
         this.L(var1, class00869.ML.W(), 0, 13, b0, var5);
         this.L(var1, class00869.ML.W(), 12, 13, b0, var5);
         if (b0 != 11) {
            this.L(var1, class00500x, b0 + 1, 13, 0, var5);
            this.L(var1, class00500x, b0 + 1, 13, 12, var5);
            this.L(var1, class00500x, 0, 13, b0 + 1, var5);
            this.L(var1, class00500x, 12, 13, b0 + 1, var5);
         }
      }

      this.L(var1, class00869.Mu.W().y(class00730.y, true).y(class00730.L, true), 0, 13, 0, var5);
      this.L(var1, class00869.Mu.W().y(class00730.u, true).y(class00730.L, true), 0, 13, 12, var5);
      this.L(var1, class00869.Mu.W().y(class00730.u, true).y(class00730.i, true), 12, 13, 12, var5);
      this.L(var1, class00869.Mu.W().y(class00730.y, true).y(class00730.i, true), 12, 13, 0, var5);

      for (byte b1 = 3; b1 <= 9; b1 += 2) {
         this.N(var1, var5, 1, 7, b1, 1, 8, b1, class00500x.y(class00730.i, true), class00500x.y(class00730.i, true), false);
         this.N(var1, var5, 11, 7, b1, 11, 8, b1, class00500x.y(class00730.L, true), class00500x.y(class00730.L, true), false);
      }

      this.N(var1, var5, 4, 2, 0, 8, 2, 12, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 0, 2, 4, 12, 2, 8, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 4, 0, 0, 8, 1, 3, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 4, 0, 9, 8, 1, 12, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 0, 0, 4, 3, 1, 8, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 9, 0, 4, 12, 1, 8, class00869.ML.W(), class00869.ML.W(), false);

      for (int j = 4; j <= 8; j++) {
         for (int i = 0; i <= 2; i++) {
            this.N(var1, class00869.ML.W(), j, -1, i, var5);
            this.N(var1, class00869.ML.W(), j, -1, 12 - i, var5);
         }
      }

      for (int k = 0; k <= 2; k++) {
         for (int l = 4; l <= 8; l++) {
            this.N(var1, class00869.ML.W(), k, -1, l, var5);
            this.N(var1, class00869.ML.W(), 12 - k, -1, l, var5);
         }
      }

      this.N(var1, var5, 5, 5, 5, 7, 5, 7, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 6, 1, 6, 6, 4, 6, class00869.N.W(), class00869.N.W(), false);
      this.L(var1, class00869.ML.W(), 6, 0, 6, var5);
      this.L(var1, class00869.V.W(), 6, 5, 6, var5);
      class07218 class07218 = this.L(6, 5, 6);
      if (var5.y(class07218)) {
         var1.N(class07218, class04684.i, 0);
      }
   }

   @Override
   public void N(class04890 var1, class03860 var2, class06069 var3) {
      this.N((class06461)var1, var2, var3, 5, 3, true);
   }
}
