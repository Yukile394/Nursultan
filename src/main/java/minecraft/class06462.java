package minecraft;

import org.jspecify.annotations.Nullable;

public class class06462 extends class06456 {
   private static final int N = 5;
   private static final int y = 10;
   private static final int L = 8;
   private final int u;

   public class06462(int var1, class06069 var2, class05163 var3, class07211 var4) {
      super(class04878.R, var1, var3);
      this.N(var4);
      this.u = var2.M();
   }

   public class06462(class07001 var1) {
      super(class04878.R, var1);
      this.u = var1.y("Seed", 0);
   }

   @Override
   protected void N(class03298 var1, class07001 var2) {
      super.N(var1, var2);
      var2.N("Seed", this.u);
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      class06069 class06069 = class06069.y((long)this.u);

      for (int i = 0; i <= 4; i++) {
         for (int j = 3; j <= 4; j++) {
            int k = class06069.y(8);
            this.N(var1, var5, i, j, 0, i, j, k, class00869.ML.W(), class00869.ML.W(), false);
         }
      }

      int l = class06069.y(8);
      this.N(var1, var5, 0, 5, 0, 0, 5, l, class00869.ML.W(), class00869.ML.W(), false);
      l = class06069.y(8);
      this.N(var1, var5, 4, 5, 0, 4, 5, l, class00869.ML.W(), class00869.ML.W(), false);

      for (int i1 = 0; i1 <= 4; i1++) {
         int k1 = class06069.y(5);
         this.N(var1, var5, i1, 2, 0, i1, 2, k1, class00869.ML.W(), class00869.ML.W(), false);
      }

      for (int j1 = 0; j1 <= 4; j1++) {
         for (int l1 = 0; l1 <= 1; l1++) {
            int i2 = class06069.y(3);
            this.N(var1, var5, j1, l1, 0, j1, l1, i2, class00869.ML.W(), class00869.ML.W(), false);
         }
      }
   }

   @Nullable
   public static class06462 N(class03860 var0, class06069 var1, int var2, int var3, int var4, class07211 var5, int var6) {
      class05163 class05163 = class05163.N(var2, var3, var4, -1, -3, 0, 5, 10, 8, var5);
      return N(class05163) && var0.N(class05163) == null ? new class06462(var6, var1, class05163, var5) : null;
   }
}
