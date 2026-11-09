package minecraft;

import org.jspecify.annotations.Nullable;

public class class06432 extends class06456 {
   private static final int N = 7;
   private static final int y = 11;
   private static final int L = 7;

   public class06432(int var1, class05163 var2, class07211 var3) {
      super(class04878.b, var1, var2);
      this.N(var3);
   }

   public class06432(class07001 var1) {
      super(class04878.b, var1);
   }

   @Nullable
   public static class06432 N(class03860 var0, int var1, int var2, int var3, int var4, class07211 var5) {
      class05163 class05163 = class05163.N(var1, var2, var3, -2, 0, 0, 7, 11, 7, var5);
      return N(class05163) && var0.N(class05163) == null ? new class06432(var4, class05163, var5) : null;
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      this.N(var1, var5, 0, 0, 0, 6, 1, 6, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 0, 2, 0, 6, 10, 6, class00869.N.W(), class00869.N.W(), false);
      this.N(var1, var5, 0, 2, 0, 1, 8, 0, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 5, 2, 0, 6, 8, 0, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 0, 2, 1, 0, 8, 6, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 6, 2, 1, 6, 8, 6, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 1, 2, 6, 5, 8, 6, class00869.ML.W(), class00869.ML.W(), false);
      class00500 class00500x = class00869.Mu.W().y(class00730.i, true).y(class00730.L, true);
      class00500 class00500x = class00869.Mu.W().y(class00730.y, true).y(class00730.u, true);
      this.N(var1, var5, 0, 3, 2, 0, 5, 4, class00500x, class00500x, false);
      this.N(var1, var5, 6, 3, 2, 6, 5, 2, class00500x, class00500x, false);
      this.N(var1, var5, 6, 3, 4, 6, 5, 4, class00500x, class00500x, false);
      this.L(var1, class00869.ML.W(), 5, 2, 5, var5);
      this.N(var1, var5, 4, 2, 5, 4, 3, 5, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 3, 2, 5, 3, 4, 5, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 2, 2, 5, 2, 5, 5, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 1, 2, 5, 1, 6, 5, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 1, 7, 1, 5, 7, 4, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 6, 8, 2, 6, 8, 4, class00869.N.W(), class00869.N.W(), false);
      this.N(var1, var5, 2, 6, 0, 4, 8, 0, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 2, 5, 0, 4, 5, 0, class00500x, class00500x, false);

      for (int i = 0; i <= 6; i++) {
         for (int j = 0; j <= 6; j++) {
            this.N(var1, class00869.ML.W(), i, -1, j, var5);
         }
      }
   }

   @Override
   public void N(class04890 var1, class03860 var2, class06069 var3) {
      this.L((class06461)var1, var2, var3, 6, 2, false);
   }
}
