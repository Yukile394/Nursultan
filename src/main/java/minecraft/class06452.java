package minecraft;

import org.jspecify.annotations.Nullable;

public class class06452 extends class06456 {
   private static final int N = 5;
   private static final int y = 7;
   private static final int L = 5;
   private boolean u;

   public class06452(int var1, class06069 var2, class05163 var3, class07211 var4) {
      super(class04878.E, var1, var3);
      this.N(var4);
      this.u = var2.y(3) == 0;
   }

   public class06452(class07001 var1) {
      super(class04878.E, var1);
      this.u = var1.y("Chest", false);
   }

   @Nullable
   public static class06452 N(class03860 var0, class06069 var1, int var2, int var3, int var4, class07211 var5, int var6) {
      class05163 class05163 = class05163.N(var2, var3, var4, -1, 0, 0, 5, 7, 5, var5);
      return N(class05163) && var0.N(class05163) == null ? new class06452(var6, var1, class05163, var5) : null;
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      this.N(var1, var5, 0, 0, 0, 4, 1, 4, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 0, 2, 0, 4, 5, 4, class00869.N.W(), class00869.N.W(), false);
      class00500 class00500x = class00869.Mu.W().y(class00730.i, true).y(class00730.L, true);
      class00500 class00500x = class00869.Mu.W().y(class00730.y, true).y(class00730.u, true);
      this.N(var1, var5, 4, 2, 0, 4, 5, 4, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 4, 3, 1, 4, 4, 1, class00500x, class00500x, false);
      this.N(var1, var5, 4, 3, 3, 4, 4, 3, class00500x, class00500x, false);
      this.N(var1, var5, 0, 2, 0, 0, 5, 0, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 0, 2, 4, 3, 5, 4, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 1, 3, 4, 1, 4, 4, class00500x, class00500x, false);
      this.N(var1, var5, 3, 3, 4, 3, 4, 4, class00500x, class00500x, false);
      if (this.u && var5.y(this.L(3, 2, 3))) {
         this.u = false;
         this.N(var1, var5, var4, 3, 2, 3, class06273.n);
      }

      this.N(var1, var5, 0, 6, 0, 4, 6, 4, class00869.ML.W(), class00869.ML.W(), false);

      for (int i = 0; i <= 4; i++) {
         for (int j = 0; j <= 4; j++) {
            this.N(var1, class00869.ML.W(), i, -1, j, var5);
         }
      }
   }

   @Override
   public void N(class04890 var1, class03860 var2, class06069 var3) {
      this.y((class06461)var1, var2, var3, 0, 1, true);
   }

   @Override
   protected void N(class03298 var1, class07001 var2) {
      super.N(var1, var2);
      var2.N("Chest", this.u);
   }
}
