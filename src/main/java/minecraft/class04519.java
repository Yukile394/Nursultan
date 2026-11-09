package minecraft;

interface class04519 {
   class04519 N = (var0, var1, var2, var3) -> {};
   class04519 y = (var0, var1, var2, var3) -> {
      if (var1.y(2) == 0) {
         class06889 class06889 = var2.method_46558().N(var1, 0.9F);
         N(var3 ? class07107.X : class07107.Nc, class06889, var0);
      }
   };
   class04519 L = (var0, var1, var2, var3) -> {
      class06889 class06889 = var2.method_46558().N(var1, 1.0F);
      N(class07107.NZ, class06889, var0);
      N(var3 ? class07107.X : class07107.J, class06889, var0);
   };
   class04519 u = (var0, var1, var2, var3) -> {
      class06889 class06889x = var2.method_46558().N(var1, 0.9F);
      if (var1.y(3) == 0) {
         N(class07107.NZ, class06889x, var0);
      }

      if (var0.N() % 20L == 0L) {
         class06889 class06889x = var2.method_46558().y(0.0, 0.5, 0.0);
         int i = var0.method_8409().y(4) + 20;

         for (int j = 0; j < i; j++) {
            N(class07107.NZ, class06889x, var0);
         }
      }
   };

   private static void N(class07134 var0, class06889 var1, class07299 var2) {
      var2.method_8406(var0, var1.N(), var1.y(), var1.L(), 0.0, 0.0, 0.0);
   }

   void emit(class07299 var1, class06069 var2, class07209 var3, boolean var4);
}
