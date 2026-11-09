package minecraft;

import org.jspecify.annotations.Nullable;

public class class04921 extends class04931 {
   private static final int N = 5;
   private static final int y = 11;
   private static final int L = 5;
   private final boolean u;

   public class04921(class07001 var1) {
      this(class04878.Q, var1);
   }

   public class04921(class04878 var1, class07001 var2) {
      super(var1, var2);
      this.u = var2.y("Source", false);
   }

   public class04921(int var1, class06069 var2, class05163 var3, class07211 var4) {
      super(class04878.Q, var1, var3);
      this.u = false;
      this.N(var4);
      this.i = this.N(var2);
   }

   public class04921(class04878 var1, int var2, int var3, int var4, class07211 var5) {
      super(var1, var2, N(var3, 64, var4, var5, 5, 11, 5));
      this.u = true;
      this.N(var5);
      this.i = class04900.field_15288;
   }

   @Nullable
   public static class04921 N(class03860 var0, class06069 var1, int var2, int var3, int var4, class07211 var5, int var6) {
      class05163 class05163 = class05163.N(var2, var3, var4, -1, -7, 0, 5, 11, 5, var5);
      return N(class05163) && var0.N(class05163) == null ? new class04921(var6, var1, class05163, var5) : null;
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      this.N(var1, var5, 0, 0, 0, 4, 10, 4, true, var4, class04933.L);
      this.N(var1, var4, var5, this.i, 1, 7, 0);
      this.N(var1, var4, var5, class04900.field_15288, 1, 1, 4);
      this.L(var1, class00869.Rm.W(), 2, 6, 1, var5);
      this.L(var1, class00869.Rm.W(), 1, 5, 1, var5);
      this.L(var1, class00869.Ul.W(), 1, 6, 1, var5);
      this.L(var1, class00869.Rm.W(), 1, 5, 2, var5);
      this.L(var1, class00869.Rm.W(), 1, 4, 3, var5);
      this.L(var1, class00869.Ul.W(), 1, 5, 3, var5);
      this.L(var1, class00869.Rm.W(), 2, 4, 3, var5);
      this.L(var1, class00869.Rm.W(), 3, 3, 3, var5);
      this.L(var1, class00869.Ul.W(), 3, 4, 3, var5);
      this.L(var1, class00869.Rm.W(), 3, 3, 2, var5);
      this.L(var1, class00869.Rm.W(), 3, 2, 1, var5);
      this.L(var1, class00869.Ul.W(), 3, 3, 1, var5);
      this.L(var1, class00869.Rm.W(), 2, 2, 1, var5);
      this.L(var1, class00869.Rm.W(), 1, 1, 1, var5);
      this.L(var1, class00869.Ul.W(), 1, 2, 1, var5);
      this.L(var1, class00869.Rm.W(), 1, 1, 2, var5);
      this.L(var1, class00869.Ul.W(), 1, 1, 3, var5);
   }

   @Override
   public void N(class04890 var1, class03860 var2, class06069 var3) {
      if (this.u) {
         class04933.y = class04934.class;
      }

      this.N((class04898)var1, var2, var3, 1, 1);
   }

   @Override
   protected void N(class03298 var1, class07001 var2) {
      super.N(var1, var2);
      var2.N("Source", this.u);
   }
}
