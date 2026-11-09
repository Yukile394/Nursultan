package minecraft;

import org.jspecify.annotations.Nullable;

public class class04934 extends class04931 {
   protected static final int N = 10;
   protected static final int y = 9;
   protected static final int L = 11;
   private final boolean u;
   private final boolean R;
   private final boolean M;
   private final boolean B;

   public class04934(int var1, class06069 var2, class05163 var3, class07211 var4) {
      super(class04878.t, var1, var3);
      this.N(var4);
      this.i = this.N(var2);
      this.u = var2.Z();
      this.R = var2.Z();
      this.M = var2.Z();
      this.B = var2.y(3) > 0;
   }

   public class04934(class07001 var1) {
      super(class04878.t, var1);
      this.u = var1.y("leftLow", false);
      this.R = var1.y("leftHigh", false);
      this.M = var1.y("rightLow", false);
      this.B = var1.y("rightHigh", false);
   }

   @Nullable
   public static class04934 N(class03860 var0, class06069 var1, int var2, int var3, int var4, class07211 var5, int var6) {
      class05163 class05163 = class05163.N(var2, var3, var4, -4, -3, 0, 10, 9, 11, var5);
      return N(class05163) && var0.N(class05163) == null ? new class04934(var6, var1, class05163, var5) : null;
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      this.N(var1, var5, 0, 0, 0, 9, 8, 10, true, var4, class04933.L);
      this.N(var1, var4, var5, this.i, 4, 3, 0);
      if (this.u) {
         this.N(var1, var5, 0, 3, 1, 0, 5, 3, w, w, false);
      }

      if (this.M) {
         this.N(var1, var5, 9, 3, 1, 9, 5, 3, w, w, false);
      }

      if (this.R) {
         this.N(var1, var5, 0, 5, 7, 0, 7, 9, w, w, false);
      }

      if (this.B) {
         this.N(var1, var5, 9, 5, 7, 9, 7, 9, w, w, false);
      }

      this.N(var1, var5, 5, 1, 10, 7, 3, 10, w, w, false);
      this.N(var1, var5, 1, 2, 1, 8, 2, 6, false, var4, class04933.L);
      this.N(var1, var5, 4, 1, 5, 4, 4, 9, false, var4, class04933.L);
      this.N(var1, var5, 8, 1, 5, 8, 4, 9, false, var4, class04933.L);
      this.N(var1, var5, 1, 4, 7, 3, 4, 9, false, var4, class04933.L);
      this.N(var1, var5, 1, 3, 5, 3, 3, 6, false, var4, class04933.L);
      this.N(var1, var5, 1, 3, 4, 3, 3, 4, class00869.Ul.W(), class00869.Ul.W(), false);
      this.N(var1, var5, 1, 4, 6, 3, 4, 6, class00869.Ul.W(), class00869.Ul.W(), false);
      this.N(var1, var5, 5, 1, 7, 7, 1, 8, false, var4, class04933.L);
      this.N(var1, var5, 5, 1, 9, 7, 1, 9, class00869.Ul.W(), class00869.Ul.W(), false);
      this.N(var1, var5, 5, 2, 7, 7, 2, 7, class00869.Ul.W(), class00869.Ul.W(), false);
      this.N(var1, var5, 4, 5, 7, 4, 5, 9, class00869.Ul.W(), class00869.Ul.W(), false);
      this.N(var1, var5, 8, 5, 7, 8, 5, 9, class00869.Ul.W(), class00869.Ul.W(), false);
      this.N(
         var1,
         var5,
         5,
         5,
         7,
         7,
         5,
         9,
         class00869.Ul.W().y(class07007.y, class08054.field_12682),
         class00869.Ul.W().y(class07007.y, class08054.field_12682),
         false
      );
      this.L(var1, class00869.LH.W().y(class00651.i, class07211.field_11035), 6, 5, 6, var5);
   }

   @Override
   public void N(class04890 var1, class03860 var2, class06069 var3) {
      int i = 3;
      int j = 5;
      class07211 class07211 = this.i();
      if (class07211 == class07211.field_11039 || class07211 == class07211.field_11043) {
         i = 8 - i;
         j = 8 - j;
      }

      this.N((class04898)var1, var2, var3, 5, 1);
      if (this.u) {
         this.y((class04898)var1, var2, var3, i, 1);
      }

      if (this.R) {
         this.y((class04898)var1, var2, var3, j, 7);
      }

      if (this.M) {
         this.L((class04898)var1, var2, var3, i, 1);
      }

      if (this.B) {
         this.L((class04898)var1, var2, var3, j, 7);
      }
   }

   @Override
   protected void N(class03298 var1, class07001 var2) {
      super.N(var1, var2);
      var2.N("leftLow", this.u);
      var2.N("leftHigh", this.R);
      var2.N("rightLow", this.M);
      var2.N("rightHigh", this.B);
   }
}
