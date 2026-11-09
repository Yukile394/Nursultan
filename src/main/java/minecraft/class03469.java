package minecraft;

import org.jspecify.annotations.Nullable;

public class class03469 {
   private static final int L = 33;
   private static final int u = 32;
   private static final int i = 31;
   private static final class02237 R = class02238.N.N(class00549.m);
   public static final int N = R.L().L();
   public static final int y = 33 + N;

   public static class04763 L(int var0) {
      if (var0 <= 31) {
         return class04763.field_13877;
      } else if (var0 <= 32) {
         return class04763.field_44856;
      } else {
         return var0 <= 33 ? class04763.field_44855 : class04763.field_19334;
      }
   }

   public class03469() {
      super();
   }

   public static boolean i(int var0) {
      return var0 <= 32;
   }

   public static boolean u(int var0) {
      return var0 <= 31;
   }

   public static class00549 y(int var0) {
      return N(var0, class00549.L);
   }

   @Nullable
   public static class00549 N(int var0, @Nullable class00549 var1) {
      if (var0 > N) {
         return var1;
      } else {
         return var0 <= 0 ? class00549.m : R.L().N(var0);
      }
   }

   public static int N(class00549 var0) {
      return 33 + R.N(var0);
   }

   @Nullable
   public static class00549 N(int var0) {
      return N(var0 - 33, null);
   }

   public static int N(class04763 var0) {
      return switch (var0) {
         case field_19334 -> y;
         case field_44855 -> 33;
         case field_44856 -> 32;
         case field_13877 -> 31;
      };
   }

   public static boolean R(int var0) {
      return var0 <= y;
   }
}
