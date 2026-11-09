package minecraft;

public interface class03493 {
   private static void y(class04782 var0, class03508 var1, class03481 var2) {
      if (var1.i()) {
         if (var1.L == null) {
            var1.N(false);
         } else {
            class06889 class06889x = var1.L.L();
            class01190 class01190 = var2.y();
            class06889 class06889x = class01190.N(var0).orElse(class06889x);
            int i = var1.L();
            int j = var2.N(var1.L.y());
            double d0 = 1.0 - (double)i / j;
            double d1 = class04995.u(d0, class06889x.M, class06889x.M);
            double d2 = class04995.u(d0, class06889x.B, class06889x.B);
            double d3 = class04995.u(d0, class06889x.Z, class06889x.Z);
            if (var0.method_65096(new class01192(class01190, i), d1, d2, d3, 1, 0.0, 0.0, 0.0, 0.0) > 0) {
               var1.N(false);
            }
         }
      }
   }

   private static boolean N(class04782 var0, class03508 var1, class03481 var2, class03978 var3) {
      class07209 class07209x = class07209.method_49638(var3.L());
      class07209 class07209x = var2.y().N(var0).map(class07209::method_49638).orElse(class07209x);
      if (var2.i() && !N(var0, class07209x)) {
         return false;
      } else {
         var2.N(var0, class07209x, var3.N(), var3.N(var0).orElse(null), var3.y(var0).orElse(null), class03485.N(class07209x, class07209x));
         var1.N(null);
         return true;
      }
   }

   private static boolean N(class07299 var0, class07209 var1) {
      class07321 class07321 = new class07321(var1);

      for (int i = class07321.B - 1; i <= class07321.B + 1; i++) {
         for (int j = class07321.Z - 1; j <= class07321.Z + 1; j++) {
            if (!var0.method_39425(class07321.u(i, j)) || var0.method_8398().N(i, j) == null) {
               return false;
            }
         }
      }

      return true;
   }

   private static void N(class04782 var0, class03508 var1, class03481 var2) {
      var1.N().N(var0.N()).ifPresent(var3 -> {
         var1.N(var3);
         class06889 class06889 = var3.L();
         var1.N(var2.N(var3.y()));
         var0.method_65096(new class01192(var2.y(), var1.L()), class06889.M, class06889.B, class06889.Z, 1, 0.0, 0.0, 0.0, 0.0);
         var2.u();
         var1.N().N();
      });
   }

   static void N(class07299 var0, class03508 var1, class03481 var2) {
      if (var0 instanceof class04782 class04782) {
         if (var1.L == null) {
            N(class04782, var1, var2);
         }

         if (var1.L != null) {
            boolean flag = var1.L() > 0;
            y(class04782, var1, var2);
            var1.u();
            if (var1.L() <= 0) {
               flag = N(class04782, var1, var2, var1.L);
            }

            if (flag) {
               var2.u();
            }
         }
      }
   }
}
