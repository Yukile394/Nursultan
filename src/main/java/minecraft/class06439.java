package minecraft;

import org.jspecify.annotations.Nullable;

public class class06439 extends class06456 {
   private static final int N = 5;
   private static final int y = 10;
   private static final int L = 19;

   public class06439(int var1, class06069 var2, class05163 var3, class07211 var4) {
      super(class04878.M, var1, var3);
      this.N(var4);
   }

   public class06439(class07001 var1) {
      super(class04878.M, var1);
   }

   @Nullable
   public static class06439 N(class03860 var0, class06069 var1, int var2, int var3, int var4, class07211 var5, int var6) {
      class05163 class05163 = class05163.N(var2, var3, var4, -1, -3, 0, 5, 10, 19, var5);
      return N(class05163) && var0.N(class05163) == null ? new class06439(var6, var1, class05163, var5) : null;
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      this.N(var1, var5, 0, 3, 0, 4, 4, 18, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 1, 5, 0, 3, 7, 18, class00869.N.W(), class00869.N.W(), false);
      this.N(var1, var5, 0, 5, 0, 0, 5, 18, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 4, 5, 0, 4, 5, 18, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 0, 2, 0, 4, 2, 5, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 0, 2, 13, 4, 2, 18, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 0, 0, 0, 4, 1, 3, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 0, 0, 15, 4, 1, 18, class00869.ML.W(), class00869.ML.W(), false);

      for (int i = 0; i <= 4; i++) {
         for (int j = 0; j <= 2; j++) {
            this.N(var1, class00869.ML.W(), i, -1, j, var5);
            this.N(var1, class00869.ML.W(), i, -1, 18 - j, var5);
         }
      }

      class00500 class00500x = class00869.Mu.W().y(class00730.y, true).y(class00730.u, true);
      class00500 class00500x = class00500x.y(class00730.L, true);
      class00500 class00500xx = class00500x.y(class00730.i, true);
      this.N(var1, var5, 0, 1, 1, 0, 4, 1, class00500x, class00500x, false);
      this.N(var1, var5, 0, 3, 4, 0, 4, 4, class00500x, class00500x, false);
      this.N(var1, var5, 0, 3, 14, 0, 4, 14, class00500x, class00500x, false);
      this.N(var1, var5, 0, 1, 17, 0, 4, 17, class00500x, class00500x, false);
      this.N(var1, var5, 4, 1, 1, 4, 4, 1, class00500xx, class00500xx, false);
      this.N(var1, var5, 4, 3, 4, 4, 4, 4, class00500xx, class00500xx, false);
      this.N(var1, var5, 4, 3, 14, 4, 4, 14, class00500xx, class00500xx, false);
      this.N(var1, var5, 4, 1, 17, 4, 4, 17, class00500xx, class00500xx, false);
   }

   @Override
   public void N(class04890 var1, class03860 var2, class06069 var3) {
      this.N((class06461)var1, var2, var3, 1, 3, false);
   }
}
