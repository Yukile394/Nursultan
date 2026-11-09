package minecraft;

public class class08402 {
   private static final int N = 2100;
   private static final int y = 200;
   private static final int L = 130;
   private static final int u = 3;
   private static final int i = 3;
   private static final int R = 8;
   private static final int M = 5;
   private static final int B = 4;

   public static void L(class07299 var0, class07209 var1, class06069 var2) {
      if (var2.y(130) == 0) {
         class00500 class00500 = var0.method_8320(var1.method_10074());
         if ((class00500.N(class00869.c) || class00500.N(class01210.NR)) && var2.y(3) != 0) {
            return;
         }

         if (N(var0, var1.method_10074())) {
            var0.method_8486(var1.method_10263(), var1.method_10264(), var1.method_10260(), class04909.Bf, class04911.field_15256, 1.0F, 1.0F, false);
         }
      }
   }

   public class08402() {
      super();
   }

   private static boolean y(class07299 var0, class07209 var1) {
      int ix = 0;
      int j = 0;
      class07218 class07218 = var1.method_25503();

      for (class07211 class07211 : class07221.field_11062) {
         class07218.N(var1).N(class07211, 8);
         if (N(var0, class07218) && ix++ >= 3) {
            return true;
         }

         if (4 - ++j + ix < 3) {
            return false;
         }
      }

      return false;
   }

   public static void y(class07299 var0, class07209 var1, class06069 var2) {
      if (var2.y(200) == 0 && N(var0, var1.method_10074())) {
         var0.method_67392(class04909.Zh, class04911.field_15256, 1.0F, 1.0F);
      }
   }

   private static boolean N(class00500 var0) {
      return var0.N(class01210.LA);
   }

   private static boolean N(class07299 var0, class07218 var1) {
      int ix = var0.y(class07830.field_13202, var1) - 1;
      if (Math.abs(ix - var1.method_10264()) > 5) {
         var1.N(class07211.field_11036, 6);
         class00500 class00500 = var0.method_8320(var1);
         var1.N(class07211.field_11033);

         for (int j = 0; j < 10; j++) {
            class00500 class00500x = var0.method_8320(var1);
            if (class00500.P() && N(class00500x)) {
               return true;
            }

            class00500 = class00500x;
            var1.N(class07211.field_11033);
         }

         return false;
      } else {
         boolean flag = var0.method_8320(var1.method_10099(ix + 1)).P();
         return flag && N(var0.method_8320(var1.method_10099(ix)));
      }
   }

   public static boolean N(class07299 var0, class07209 var1) {
      return var0.method_8320(var1).N(class01210.Lf) && var0.method_8320(var1.method_10074()).N(class01210.Lf);
   }

   public static void N(class07299 var0, class07209 var1, class06069 var2) {
      if (var0.method_8320(var1.method_10084()).N(class00869.N)) {
         if (var2.y(2100) == 0 && y(var0, var1)) {
            var0.method_8486(var1.method_10263(), var1.method_10264(), var1.method_10260(), class04909.dq, class04911.field_15256, 1.0F, 1.0F, false);
         }
      }
   }
}
