package minecraft;

import org.jspecify.annotations.Nullable;

public class class06470 extends class06456 {
   private static final int N = 9;
   private static final int y = 7;
   private static final int L = 9;

   public class06470(int var1, class05163 var2, class07211 var3) {
      super(class04878.Z, var1, var2);
      this.N(var3);
   }

   public class06470(class07001 var1) {
      super(class04878.Z, var1);
   }

   @Nullable
   public static class06470 N(class03860 var0, int var1, int var2, int var3, class07211 var4, int var5) {
      class05163 class05163 = class05163.N(var1, var2, var3, -3, 0, 0, 9, 7, 9, var4);
      return N(class05163) && var0.N(class05163) == null ? new class06470(var5, class05163, var4) : null;
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      class00500 class00500x = class00869.Mu.W().y(class00730.y, true).y(class00730.u, true);
      class00500 class00500x = class00869.Mu.W().y(class00730.i, true).y(class00730.L, true);
      this.N(var1, var5, 0, 0, 0, 8, 1, 8, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 0, 2, 0, 8, 5, 8, class00869.N.W(), class00869.N.W(), false);
      this.N(var1, var5, 0, 6, 0, 8, 6, 5, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 0, 2, 0, 2, 5, 0, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 6, 2, 0, 8, 5, 0, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 1, 3, 0, 1, 4, 0, class00500x, class00500x, false);
      this.N(var1, var5, 7, 3, 0, 7, 4, 0, class00500x, class00500x, false);
      this.N(var1, var5, 0, 2, 4, 8, 2, 8, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 1, 1, 4, 2, 2, 4, class00869.N.W(), class00869.N.W(), false);
      this.N(var1, var5, 6, 1, 4, 7, 2, 4, class00869.N.W(), class00869.N.W(), false);
      this.N(var1, var5, 1, 3, 8, 7, 3, 8, class00500x, class00500x, false);
      this.L(var1, class00869.Mu.W().y(class00730.L, true).y(class00730.u, true), 0, 3, 8, var5);
      this.L(var1, class00869.Mu.W().y(class00730.i, true).y(class00730.u, true), 8, 3, 8, var5);
      this.N(var1, var5, 0, 3, 6, 0, 3, 7, class00500x, class00500x, false);
      this.N(var1, var5, 8, 3, 6, 8, 3, 7, class00500x, class00500x, false);
      this.N(var1, var5, 0, 3, 4, 0, 5, 5, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 8, 3, 4, 8, 5, 5, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 1, 3, 5, 2, 5, 5, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 6, 3, 5, 7, 5, 5, class00869.ML.W(), class00869.ML.W(), false);
      this.N(var1, var5, 1, 4, 5, 1, 5, 5, class00500x, class00500x, false);
      this.N(var1, var5, 7, 4, 5, 7, 5, 5, class00500x, class00500x, false);

      for (int i = 0; i <= 5; i++) {
         for (int j = 0; j <= 8; j++) {
            this.N(var1, class00869.ML.W(), j, -1, i, var5);
         }
      }
   }

   @Override
   public void N(class04890 var1, class03860 var2, class06069 var3) {
      byte b0 = 1;
      class07211 class07211 = this.i();
      if (class07211 == class07211.field_11039 || class07211 == class07211.field_11043) {
         b0 = 5;
      }

      this.y((class06461)var1, var2, var3, 0, b0, var3.y(8) > 0);
      this.L((class06461)var1, var2, var3, 0, b0, var3.y(8) > 0);
   }
}
