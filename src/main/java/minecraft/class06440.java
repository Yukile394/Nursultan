package minecraft;

import org.jspecify.annotations.Nullable;

public class class06440 extends class06456 {
   private static final int N = 5;
   private static final int y = 14;
   private static final int L = 10;

   public class06440(int var1, class05163 var2, class07211 var3) {
      super(class04878.B, var1, var2);
      this.N(var3);
   }

   public class06440(class07001 var1) {
      super(class04878.B, var1);
   }

   @Nullable
   public static class06440 N(class03860 var0, int var1, int var2, int var3, class07211 var4, int var5) {
      class05163 class05163 = class05163.N(var1, var2, var3, -1, -7, 0, 5, 14, 10, var4);
      return N(class05163) && var0.N(class05163) == null ? new class06440(var5, class05163, var4) : null;
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      class00500 class00500x = class00869.Mi.W().y(class07746.y, class07211.field_11035);
      class00500 class00500x = class00869.Mu.W().y(class00730.y, true).y(class00730.u, true);

      for (int i = 0; i <= 9; i++) {
         int j = Math.max(1, 7 - i);
         int k = Math.min(Math.max(j + 5, 14 - i), 13);
         int l = i;
         this.N(var1, var5, 0, 0, i, 4, j, i, class00869.ML.W(), class00869.ML.W(), false);
         this.N(var1, var5, 1, j + 1, i, 3, k - 1, i, class00869.N.W(), class00869.N.W(), false);
         if (i <= 6) {
            this.L(var1, class00500x, 1, j + 1, i, var5);
            this.L(var1, class00500x, 2, j + 1, i, var5);
            this.L(var1, class00500x, 3, j + 1, i, var5);
         }

         this.N(var1, var5, 0, k, i, 4, k, i, class00869.ML.W(), class00869.ML.W(), false);
         this.N(var1, var5, 0, j + 1, i, 0, k - 1, i, class00869.ML.W(), class00869.ML.W(), false);
         this.N(var1, var5, 4, j + 1, i, 4, k - 1, i, class00869.ML.W(), class00869.ML.W(), false);
         if ((i & 1) == 0) {
            this.N(var1, var5, 0, j + 2, i, 0, j + 3, i, class00500x, class00500x, false);
            this.N(var1, var5, 4, j + 2, i, 4, j + 3, i, class00500x, class00500x, false);
         }

         for (int i1 = 0; i1 <= 4; i1++) {
            this.N(var1, class00869.ML.W(), i1, -1, l, var5);
         }
      }
   }

   @Override
   public void N(class04890 var1, class03860 var2, class06069 var3) {
      this.N((class06461)var1, var2, var3, 1, 0, true);
   }
}
