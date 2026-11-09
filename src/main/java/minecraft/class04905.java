package minecraft;

import org.jspecify.annotations.Nullable;

public class class04905 extends class04931 {
   protected static final int N = 11;
   protected static final int y = 7;
   protected static final int L = 11;
   protected final int u;

   public class04905(int var1, class06069 var2, class05163 var3, class07211 var4) {
      super(class04878.Y, var1, var3);
      this.N(var4);
      this.i = this.N(var2);
      this.u = var2.y(5);
   }

   public class04905(class07001 var1) {
      super(class04878.Y, var1);
      this.u = var1.y("Type", 0);
   }

   @Nullable
   public static class04905 N(class03860 var0, class06069 var1, int var2, int var3, int var4, class07211 var5, int var6) {
      class05163 class05163 = class05163.N(var2, var3, var4, -4, -1, 0, 11, 7, 11, var5);
      return N(class05163) && var0.N(class05163) == null ? new class04905(var6, var1, class05163, var5) : null;
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      this.N(var1, var5, 0, 0, 0, 10, 6, 10, true, var4, class04933.L);
      this.N(var1, var4, var5, this.i, 4, 1, 0);
      this.N(var1, var5, 4, 1, 10, 6, 3, 10, w, w, false);
      this.N(var1, var5, 0, 1, 4, 0, 3, 6, w, w, false);
      this.N(var1, var5, 10, 1, 4, 10, 3, 6, w, w, false);
      switch (this.u) {
         case 0:
            this.L(var1, class00869.Rm.W(), 5, 1, 5, var5);
            this.L(var1, class00869.Rm.W(), 5, 2, 5, var5);
            this.L(var1, class00869.Rm.W(), 5, 3, 5, var5);
            this.L(var1, class00869.LH.W().y(class00651.i, class07211.field_11039), 4, 3, 5, var5);
            this.L(var1, class00869.LH.W().y(class00651.i, class07211.field_11034), 6, 3, 5, var5);
            this.L(var1, class00869.LH.W().y(class00651.i, class07211.field_11035), 5, 3, 4, var5);
            this.L(var1, class00869.LH.W().y(class00651.i, class07211.field_11043), 5, 3, 6, var5);
            this.L(var1, class00869.Ul.W(), 4, 1, 4, var5);
            this.L(var1, class00869.Ul.W(), 4, 1, 5, var5);
            this.L(var1, class00869.Ul.W(), 4, 1, 6, var5);
            this.L(var1, class00869.Ul.W(), 6, 1, 4, var5);
            this.L(var1, class00869.Ul.W(), 6, 1, 5, var5);
            this.L(var1, class00869.Ul.W(), 6, 1, 6, var5);
            this.L(var1, class00869.Ul.W(), 5, 1, 4, var5);
            this.L(var1, class00869.Ul.W(), 5, 1, 6, var5);
            break;
         case 1:
            for (int i1 = 0; i1 < 5; i1++) {
               this.L(var1, class00869.Rm.W(), 3, 1, 3 + i1, var5);
               this.L(var1, class00869.Rm.W(), 7, 1, 3 + i1, var5);
               this.L(var1, class00869.Rm.W(), 3 + i1, 1, 3, var5);
               this.L(var1, class00869.Rm.W(), 3 + i1, 1, 7, var5);
            }

            this.L(var1, class00869.Rm.W(), 5, 1, 5, var5);
            this.L(var1, class00869.Rm.W(), 5, 2, 5, var5);
            this.L(var1, class00869.Rm.W(), 5, 3, 5, var5);
            this.L(var1, class00869.K.W(), 5, 4, 5, var5);
            break;
         case 2:
            for (int i = 1; i <= 9; i++) {
               this.L(var1, class00869.W.W(), 1, 3, i, var5);
               this.L(var1, class00869.W.W(), 9, 3, i, var5);
            }

            for (int j = 1; j <= 9; j++) {
               this.L(var1, class00869.W.W(), j, 3, 1, var5);
               this.L(var1, class00869.W.W(), j, 3, 9, var5);
            }

            this.L(var1, class00869.W.W(), 5, 1, 4, var5);
            this.L(var1, class00869.W.W(), 5, 1, 6, var5);
            this.L(var1, class00869.W.W(), 5, 3, 4, var5);
            this.L(var1, class00869.W.W(), 5, 3, 6, var5);
            this.L(var1, class00869.W.W(), 4, 1, 5, var5);
            this.L(var1, class00869.W.W(), 6, 1, 5, var5);
            this.L(var1, class00869.W.W(), 4, 3, 5, var5);
            this.L(var1, class00869.W.W(), 6, 3, 5, var5);

            for (int k = 1; k <= 3; k++) {
               this.L(var1, class00869.W.W(), 4, k, 4, var5);
               this.L(var1, class00869.W.W(), 6, k, 4, var5);
               this.L(var1, class00869.W.W(), 4, k, 6, var5);
               this.L(var1, class00869.W.W(), 6, k, 6, var5);
            }

            this.L(var1, class00869.LH.W(), 5, 3, 5, var5);

            for (int l = 2; l <= 8; l++) {
               this.L(var1, class00869.m.W(), 2, 3, l, var5);
               this.L(var1, class00869.m.W(), 3, 3, l, var5);
               if (l <= 3 || l >= 7) {
                  this.L(var1, class00869.m.W(), 4, 3, l, var5);
                  this.L(var1, class00869.m.W(), 5, 3, l, var5);
                  this.L(var1, class00869.m.W(), 6, 3, l, var5);
               }

               this.L(var1, class00869.m.W(), 7, 3, l, var5);
               this.L(var1, class00869.m.W(), 8, 3, l, var5);
            }

            class00500 class00500 = class00869.uW.W().y(class07123.y, class07211.field_11039);
            this.L(var1, class00500, 9, 1, 3, var5);
            this.L(var1, class00500, 9, 2, 3, var5);
            this.L(var1, class00500, 9, 3, 3, var5);
            this.N(var1, var5, var4, 3, 4, 8, class06273.G);
      }
   }

   @Override
   public void N(class04890 var1, class03860 var2, class06069 var3) {
      this.N((class04898)var1, var2, var3, 4, 1);
      this.y((class04898)var1, var2, var3, 1, 4);
      this.L((class04898)var1, var2, var3, 1, 4);
   }

   @Override
   protected void N(class03298 var1, class07001 var2) {
      super.N(var1, var2);
      var2.N("Type", this.u);
   }
}
