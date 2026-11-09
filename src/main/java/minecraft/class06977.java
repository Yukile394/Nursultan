package minecraft;

import org.jspecify.annotations.Nullable;

public final class class06977 {
   @Nullable
   private static class00044 N;
   @Nullable
   private static class04911 y;

   public class06977() {
      super();
   }

   private static boolean N(class09033 var0) {
      return N == null || !var0.L(N);
   }

   private static void N(class09033 var0, class04911 var1) {
      if (y != var1) {
         y = var1;
         if (N != null) {
            var0.y(N);
         }
      }
   }

   public static void N(class09033 var0, class04911 var1, float var2) {
      N(var0, var1);
      if (N(var0)) {
         class04891 class04891 = switch (var1) {
            case field_15247 -> (class04891)class04909.nw.N();
            case field_15252 -> class04909.TM;
            case field_15245 -> class04909.WD;
            case field_15251 -> class04909.Jo;
            case field_15254 -> class04909.BM;
            case field_15248 -> (class04891)class04909.EF.N();
            case field_15256 -> (class04891)class04909.B.N();
            case field_61058 -> (class04891)class04909.OK.N();
            default -> class04909.vk;
         };
         if (class04891 != class04909.vk) {
            N = class00040.N(class04891, 1.0F, var2);
            var0.N(N);
         }
      }
   }
}
