package minecraft;

import org.jspecify.annotations.Nullable;

public class class04929 extends class04931 {
   private static final int N = 5;
   private static final int y = 11;
   private static final int L = 8;

   public class04929(int var1, class06069 var2, class05163 var3, class07211 var4) {
      super(class04878.I, var1, var3);
      this.N(var4);
      this.i = this.N(var2);
   }

   public class04929(class07001 var1) {
      super(class04878.I, var1);
   }

   @Nullable
   public static class04929 N(class03860 var0, class06069 var1, int var2, int var3, int var4, class07211 var5, int var6) {
      class05163 class05163 = class05163.N(var2, var3, var4, -1, -7, 0, 5, 11, 8, var5);
      return N(class05163) && var0.N(class05163) == null ? new class04929(var6, var1, class05163, var5) : null;
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      this.N(var1, var5, 0, 0, 0, 4, 10, 7, true, var4, class04933.L);
      this.N(var1, var4, var5, this.i, 1, 7, 0);
      this.N(var1, var4, var5, class04900.field_15288, 1, 1, 7);
      class00500 class00500 = class00869.uP.W().y(class07746.y, class07211.field_11035);

      for (int i = 0; i < 6; i++) {
         this.L(var1, class00500, 1, 6 - i, 1 + i, var5);
         this.L(var1, class00500, 2, 6 - i, 1 + i, var5);
         this.L(var1, class00500, 3, 6 - i, 1 + i, var5);
         if (i < 5) {
            this.L(var1, class00869.Rm.W(), 1, 5 - i, 1 + i, var5);
            this.L(var1, class00869.Rm.W(), 2, 5 - i, 1 + i, var5);
            this.L(var1, class00869.Rm.W(), 3, 5 - i, 1 + i, var5);
         }
      }
   }

   @Override
   public void N(class04890 var1, class03860 var2, class06069 var3) {
      this.N((class04898)var1, var2, var3, 1, 1);
   }
}
