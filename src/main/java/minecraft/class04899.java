package minecraft;

import org.jspecify.annotations.Nullable;

public class class04899 extends class04931 {
   private static final int N = 5;
   private static final int y = 5;
   private static final int L = 7;
   private final boolean u;
   private final boolean R;

   public class04899(int var1, class06069 var2, class05163 var3, class07211 var4) {
      super(class04878.g, var1, var3);
      this.N(var4);
      this.i = this.N(var2);
      this.u = var2.y(2) == 0;
      this.R = var2.y(2) == 0;
   }

   public class04899(class07001 var1) {
      super(class04878.g, var1);
      this.u = var1.y("Left", false);
      this.R = var1.y("Right", false);
   }

   @Nullable
   public static class04899 N(class03860 var0, class06069 var1, int var2, int var3, int var4, class07211 var5, int var6) {
      class05163 class05163 = class05163.N(var2, var3, var4, -1, -1, 0, 5, 5, 7, var5);
      return N(class05163) && var0.N(class05163) == null ? new class04899(var6, var1, class05163, var5) : null;
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      this.N(var1, var5, 0, 0, 0, 4, 4, 6, true, var4, class04933.L);
      this.N(var1, var4, var5, this.i, 1, 1, 0);
      this.N(var1, var4, var5, class04900.field_15288, 1, 1, 6);
      class00500 class00500x = class00869.LH.W().y(class00651.i, class07211.field_11034);
      class00500 class00500x = class00869.LH.W().y(class00651.i, class07211.field_11039);
      this.N(var1, var5, var4, 0.1F, 1, 2, 1, class00500x);
      this.N(var1, var5, var4, 0.1F, 3, 2, 1, class00500x);
      this.N(var1, var5, var4, 0.1F, 1, 2, 5, class00500x);
      this.N(var1, var5, var4, 0.1F, 3, 2, 5, class00500x);
      if (this.u) {
         this.N(var1, var5, 0, 1, 2, 0, 3, 4, w, w, false);
      }

      if (this.R) {
         this.N(var1, var5, 4, 1, 2, 4, 3, 4, w, w, false);
      }
   }

   @Override
   public void N(class04890 var1, class03860 var2, class06069 var3) {
      this.N((class04898)var1, var2, var3, 1, 1);
      if (this.u) {
         this.y((class04898)var1, var2, var3, 1, 2);
      }

      if (this.R) {
         this.L((class04898)var1, var2, var3, 1, 2);
      }
   }

   @Override
   protected void N(class03298 var1, class07001 var2) {
      super.N(var1, var2);
      var2.N("Left", this.u);
      var2.N("Right", this.R);
   }
}
