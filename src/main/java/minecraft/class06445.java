package minecraft;

import org.jspecify.annotations.Nullable;

public class class06445 extends class06456 {
   private static final int N = 19;
   private static final int y = 10;
   private static final int L = 19;

   public class06445(class07001 var1) {
      this(class04878.i, var1);
   }

   protected class06445(class04878 var1, class07001 var2) {
      super(var1, var2);
   }

   protected class06445(int var1, int var2, class07211 var3) {
      super(class04878.i, 0, class04890.N(var1, 64, var2, var3, 19, 10, 19));
      this.N(var3);
   }

   public class06445(int var1, class05163 var2, class07211 var3) {
      super(class04878.i, var1, var2);
      this.N(var3);
   }

   @Nullable
   public static class06445 N(class03860 var0, int var1, int var2, int var3, class07211 var4, int var5) {
      class05163 class05163 = class05163.N(var1, var2, var3, -8, -3, 0, 19, 10, 19, var4);
      return N(class05163) && var0.N(class05163) == null ? new class06445(var5, class05163, var4) : null;
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      this.N(var1, var5, 7, 3, 0, 11, 4, 18, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 0, 3, 7, 18, 4, 11, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 8, 5, 0, 10, 7, 18, class00869.N.W(), class00869.N.W(), false);
      this.N(var1, var5, 0, 5, 8, 18, 7, 10, class00869.N.W(), class00869.N.W(), false);
      this.N(var1, var5, 7, 5, 0, 7, 5, 7, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 7, 5, 11, 7, 5, 18, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 11, 5, 0, 11, 5, 7, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 11, 5, 11, 11, 5, 18, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 0, 5, 7, 7, 5, 7, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 11, 5, 7, 18, 5, 7, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 0, 5, 11, 7, 5, 11, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 11, 5, 11, 18, 5, 11, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 7, 2, 0, 11, 2, 5, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 7, 2, 13, 11, 2, 18, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 7, 0, 0, 11, 1, 3, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 7, 0, 15, 11, 1, 18, class00869.ML.W(), class00869.ML.W(), false);

      for (int i = 7; i <= 11; i++) {
         for (int j = 0; j <= 2; j++) {
            this.N(var1, class00869.ML.W(), i, -1, j, var5);
            this.N(var1, class00869.ML.W(), i, -1, 18 - j, var5);
         }
      }

      this.N(var1, var5, 0, 2, 7, 5, 2, 11, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 13, 2, 7, 18, 2, 11, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 0, 0, 7, 3, 1, 11, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 15, 0, 7, 18, 1, 11, class00869.ML.W(), class00869.ML.W(), false);

      for (int k = 0; k <= 2; k++) {
         for (int l = 7; l <= 11; l++) {
            this.N(var1, class00869.ML.W(), k, -1, l, var5);
            this.N(var1, class00869.ML.W(), 18 - k, -1, l, var5);
         }
      }
   }

   @Override
   public void N(class04890 var1, class03860 var2, class06069 var3) {
      this.N((class06461)var1, var2, var3, 8, 3, false);
      this.y((class06461)var1, var2, var3, 3, 8, false);
      this.L((class06461)var1, var2, var3, 3, 8, false);
   }
}
