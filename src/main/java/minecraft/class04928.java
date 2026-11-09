package minecraft;

import org.jspecify.annotations.Nullable;

public class class04928 extends class04931 {
   private final int N;

   public class04928(int var1, class05163 var2, class07211 var3) {
      super(class04878.n, var1, var2);
      this.N(var3);
      this.N = var3 != class07211.field_11043 && var3 != class07211.field_11035 ? var2.u() : var2.R();
   }

   public class04928(class07001 var1) {
      super(class04878.n, var1);
      this.N = var1.y("Steps", 0);
   }

   @Nullable
   public static class05163 N(class03860 var0, class06069 var1, int var2, int var3, int var4, class07211 var5) {
      byte b0 = 3;
      class05163 class05163 = class05163.N(var2, var3, var4, -1, -1, 0, 5, 5, 4, var5);
      class04890 class04890 = var0.N(class05163);
      if (class04890 == null) {
         return null;
      } else {
         if (class04890.L().Z() == class05163.Z()) {
            for (int i = 2; i >= 1; i--) {
               class05163 = class05163.N(var2, var3, var4, -1, -1, 0, 5, 5, i, var5);
               if (!class04890.L().N(class05163)) {
                  return class05163.N(var2, var3, var4, -1, -1, 0, 5, 5, i + 1, var5);
               }
            }
         }

         return null;
      }
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      for (int i = 0; i < this.N; i++) {
         this.L(var1, class00869.Rm.W(), 0, 0, i, var5);
         this.L(var1, class00869.Rm.W(), 1, 0, i, var5);
         this.L(var1, class00869.Rm.W(), 2, 0, i, var5);
         this.L(var1, class00869.Rm.W(), 3, 0, i, var5);
         this.L(var1, class00869.Rm.W(), 4, 0, i, var5);

         for (int j = 1; j <= 3; j++) {
            this.L(var1, class00869.Rm.W(), 0, j, i, var5);
            this.L(var1, class00869.mr.W(), 1, j, i, var5);
            this.L(var1, class00869.mr.W(), 2, j, i, var5);
            this.L(var1, class00869.mr.W(), 3, j, i, var5);
            this.L(var1, class00869.Rm.W(), 4, j, i, var5);
         }

         this.L(var1, class00869.Rm.W(), 0, 4, i, var5);
         this.L(var1, class00869.Rm.W(), 1, 4, i, var5);
         this.L(var1, class00869.Rm.W(), 2, 4, i, var5);
         this.L(var1, class00869.Rm.W(), 3, 4, i, var5);
         this.L(var1, class00869.Rm.W(), 4, 4, i, var5);
      }
   }

   @Override
   protected void N(class03298 var1, class07001 var2) {
      super.N(var1, var2);
      var2.N("Steps", this.N);
   }
}
