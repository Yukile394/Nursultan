package minecraft;

import org.jspecify.annotations.Nullable;

public class class05184 {
   private static final int y = 3;
   private static final int L = 3;
   private static final int u = 5;
   private static final int i = 20;
   private static final int R = 50;
   private static final int M = 8;
   public static final int N = 50;

   public class05184() {
      super();
   }

   @Nullable
   private static class05154 N(class03860 var0, class06069 var1, int var2, int var3, int var4, class07211 var5, int var6, class06187 var7) {
      int ix = var1.y(100);
      if (ix >= 80) {
         class05163 class05163xx = class05156.N(var0, var1, var2, var3, var4, var5);
         if (class05163xx != null) {
            return new class05156(var6, class05163xx, var5, var7);
         }
      } else if (ix >= 70) {
         class05163 class05163x = class05148.N(var0, var1, var2, var3, var4, var5);
         if (class05163x != null) {
            return new class05148(var6, class05163x, var5, var7);
         }
      } else {
         class05163 class05163 = class05162.N(var0, var1, var2, var3, var4, var5);
         if (class05163 != null) {
            return new class05162(var6, var1, class05163, var5, var7);
         }
      }

      return null;
   }

   @Nullable
   static class05154 N(class04890 var0, class03860 var1, class06069 var2, int var3, int var4, int var5, class07211 var6, int var7) {
      if (var7 > 8) {
         return null;
      } else if (Math.abs(var3 - var0.L().B()) <= 80 && Math.abs(var5 - var0.L().z()) <= 80) {
         class06187 class06187 = ((class05154)var0).N;
         class05154 class05154 = N(var1, var2, var3, var4, var5, var6, var7 + 1, class06187);
         if (class05154 != null) {
            var1.N(class05154);
            class05154.N(var0, var1, var2);
         }

         return class05154;
      } else {
         return null;
      }
   }
}
