package minecraft;

import org.jspecify.annotations.Nullable;

public class class06436 extends class06456 {
   private static final int N = 7;
   private static final int y = 9;
   private static final int L = 7;

   public class06436(int var1, class05163 var2, class07211 var3) {
      super(class04878.T, var1, var2);
      this.N(var3);
   }

   public class06436(class07001 var1) {
      super(class04878.T, var1);
   }

   @Nullable
   public static class06436 N(class03860 var0, int var1, int var2, int var3, class07211 var4, int var5) {
      class05163 class05163 = class05163.N(var1, var2, var3, -2, 0, 0, 7, 9, 7, var4);
      return N(class05163) && var0.N(class05163) == null ? new class06436(var5, class05163, var4) : null;
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      this.N(var1, var5, 0, 0, 0, 6, 1, 6, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 0, 2, 0, 6, 7, 6, class00869.N.W(), class00869.N.W(), false);
      this.N(var1, var5, 0, 2, 0, 1, 6, 0, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 0, 2, 6, 1, 6, 6, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 5, 2, 0, 6, 6, 0, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 5, 2, 6, 6, 6, 6, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 0, 2, 0, 0, 6, 1, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 0, 2, 5, 0, 6, 6, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 6, 2, 0, 6, 6, 1, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 6, 2, 5, 6, 6, 6, class00869.ML.W(), class00869.ML.W(), false);
      class00500 class00500x = class00869.Mu.W().y(class00730.i, true).y(class00730.L, true);
      class00500 class00500x = class00869.Mu.W().y(class00730.y, true).y(class00730.u, true);
      this.N(var1, var5, 2, 6, 0, 4, 6, 0, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 2, 5, 0, 4, 5, 0, class00500x, class00500x, false);
      this.N(var1, var5, 2, 6, 6, 4, 6, 6, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 2, 5, 6, 4, 5, 6, class00500x, class00500x, false);
      this.N(var1, var5, 0, 6, 2, 0, 6, 4, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 0, 5, 2, 0, 5, 4, class00500x, class00500x, false);
      this.N(var1, var5, 6, 6, 2, 6, 6, 4, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 6, 5, 2, 6, 5, 4, class00500x, class00500x, false);

      for (int i = 0; i <= 6; i++) {
         for (int j = 0; j <= 6; j++) {
            this.N(var1, class00869.ML.W(), i, -1, j, var5);
         }
      }
   }

   @Override
   public void N(class04890 var1, class03860 var2, class06069 var3) {
      this.N((class06461)var1, var2, var3, 2, 0, false);
      this.y((class06461)var1, var2, var3, 0, 2, false);
      this.L((class06461)var1, var2, var3, 0, 2, false);
   }
}
