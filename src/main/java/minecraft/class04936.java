package minecraft;

import org.jspecify.annotations.Nullable;

public class class04936 extends class04931 {
   private static final int N = 5;
   private static final int y = 5;
   private static final int L = 7;
   private boolean u;

   public class04936(int var1, class06069 var2, class05163 var3, class07211 var4) {
      super(class04878.v, var1, var3);
      this.N(var4);
      this.i = this.N(var2);
   }

   public class04936(class07001 var1) {
      super(class04878.v, var1);
      this.u = var1.y("Chest", false);
   }

   @Nullable
   public static class04936 N(class03860 var0, class06069 var1, int var2, int var3, int var4, class07211 var5, int var6) {
      class05163 class05163 = class05163.N(var2, var3, var4, -1, -1, 0, 5, 5, 7, var5);
      return N(class05163) && var0.N(class05163) == null ? new class04936(var6, var1, class05163, var5) : null;
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      this.N(var1, var5, 0, 0, 0, 4, 4, 6, true, var4, class04933.L);
      this.N(var1, var4, var5, this.i, 1, 1, 0);
      this.N(var1, var4, var5, class04900.field_15288, 1, 1, 6);
      this.N(var1, var5, 3, 1, 2, 3, 1, 4, class00869.Rm.W(), class00869.Rm.W(), false);
      this.L(var1, class00869.UO.W(), 3, 1, 1, var5);
      this.L(var1, class00869.UO.W(), 3, 1, 5, var5);
      this.L(var1, class00869.UO.W(), 3, 2, 2, var5);
      this.L(var1, class00869.UO.W(), 3, 2, 4, var5);

      for (int i = 2; i <= 4; i++) {
         this.L(var1, class00869.UO.W(), 2, 1, i, var5);
      }

      if (!this.u && var5.y(this.L(3, 2, 3))) {
         this.u = true;
         this.N(var1, var5, var4, 3, 2, 3, class06273.l);
      }
   }

   @Override
   public void N(class04890 var1, class03860 var2, class06069 var3) {
      this.N((class04898)var1, var2, var3, 1, 1);
   }

   @Override
   protected void N(class03298 var1, class07001 var2) {
      super.N(var1, var2);
      var2.N("Chest", this.u);
   }
}
