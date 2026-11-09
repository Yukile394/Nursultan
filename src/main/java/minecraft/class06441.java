package minecraft;

import org.jspecify.annotations.Nullable;

public class class06441 extends class06456 {
   private static final int N = 5;
   private static final int y = 7;
   private static final int L = 5;

   public class06441(int var1, class05163 var2, class07211 var3) {
      super(class04878.U, var1, var2);
      this.N(var3);
   }

   public class06441(class07001 var1) {
      super(class04878.U, var1);
   }

   @Nullable
   public static class06441 N(class03860 var0, int var1, int var2, int var3, class07211 var4, int var5) {
      class05163 class05163 = class05163.N(var1, var2, var3, -1, 0, 0, 5, 7, 5, var4);
      return N(class05163) && var0.N(class05163) == null ? new class06441(var5, class05163, var4) : null;
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      this.N(var1, var5, 0, 0, 0, 4, 1, 4, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 0, 2, 0, 4, 5, 4, class00869.N.W(), class00869.N.W(), false);
      this.N(var1, var5, 0, 2, 0, 0, 5, 0, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 4, 2, 0, 4, 5, 0, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 0, 2, 4, 0, 5, 4, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 4, 2, 4, 4, 5, 4, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 0, 6, 0, 4, 6, 4, class00869.ML.W(), class00869.ML.W(), false);

      for (int i = 0; i <= 4; i++) {
         for (int j = 0; j <= 4; j++) {
            this.N(var1, class00869.ML.W(), i, -1, j, var5);
         }
      }
   }

   @Override
   public void N(class04890 var1, class03860 var2, class06069 var3) {
      this.N((class06461)var1, var2, var3, 1, 0, true);
      this.y((class06461)var1, var2, var3, 0, 1, true);
      this.L((class06461)var1, var2, var3, 0, 1, true);
   }
}
