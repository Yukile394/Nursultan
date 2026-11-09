package minecraft;

import org.jspecify.annotations.Nullable;

public class class04925 extends class04931 {
   protected static final int N = 9;
   protected static final int y = 5;
   protected static final int L = 11;

   public class04925(int var1, class06069 var2, class05163 var3, class07211 var4) {
      super(class04878.w, var1, var3);
      this.N(var4);
      this.i = this.N(var2);
   }

   public class04925(class07001 var1) {
      super(class04878.w, var1);
   }

   @Nullable
   public static class04925 N(class03860 var0, class06069 var1, int var2, int var3, int var4, class07211 var5, int var6) {
      class05163 class05163 = class05163.N(var2, var3, var4, -1, -1, 0, 9, 5, 11, var5);
      return N(class05163) && var0.N(class05163) == null ? new class04925(var6, var1, class05163, var5) : null;
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      this.N(var1, var5, 0, 0, 0, 8, 4, 10, true, var4, class04933.L);
      this.N(var1, var4, var5, this.i, 1, 1, 0);
      this.N(var1, var5, 1, 1, 10, 3, 3, 10, w, w, false);
      this.N(var1, var5, 4, 1, 1, 4, 3, 1, false, var4, class04933.L);
      this.N(var1, var5, 4, 1, 3, 4, 3, 3, false, var4, class04933.L);
      this.N(var1, var5, 4, 1, 7, 4, 3, 7, false, var4, class04933.L);
      this.N(var1, var5, 4, 1, 9, 4, 3, 9, false, var4, class04933.L);

      for (int i = 1; i <= 3; i++) {
         this.L(var1, class00869.RQ.W().y(class07100.y, true).y(class07100.u, true), 4, i, 4, var5);
         this.L(var1, class00869.RQ.W().y(class07100.y, true).y(class07100.u, true).y(class07100.L, true), 4, i, 5, var5);
         this.L(var1, class00869.RQ.W().y(class07100.y, true).y(class07100.u, true), 4, i, 6, var5);
         this.L(var1, class00869.RQ.W().y(class07100.i, true).y(class07100.L, true), 5, i, 5, var5);
         this.L(var1, class00869.RQ.W().y(class07100.i, true).y(class07100.L, true), 6, i, 5, var5);
         this.L(var1, class00869.RQ.W().y(class07100.i, true).y(class07100.L, true), 7, i, 5, var5);
      }

      this.L(var1, class00869.RQ.W().y(class07100.y, true).y(class07100.u, true), 4, 3, 2, var5);
      this.L(var1, class00869.RQ.W().y(class07100.y, true).y(class07100.u, true), 4, 3, 8, var5);
      class00500 class00500 = class00869.ur.W().y(class07196.y, class07211.field_11039);
      class00500 class00500x = class00869.ur.W().y(class07196.y, class07211.field_11039).y(class07196.L, class08059.field_12609);
      this.L(var1, class00500, 4, 1, 2, var5);
      this.L(var1, class00500x, 4, 2, 2, var5);
      this.L(var1, class00500, 4, 1, 8, var5);
      this.L(var1, class00500x, 4, 2, 8, var5);
   }

   @Override
   public void N(class04890 var1, class03860 var2, class06069 var3) {
      this.N((class04898)var1, var2, var3, 1, 1);
   }
}
