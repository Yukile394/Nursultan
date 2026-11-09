package minecraft;

public interface class08553 {
   class05946<class04068> N = N(class08558.N);
   class05946<class04068> y = N(class08558.y);
   class05946<class04068> L = N(class08558.L);

   private static class05946<class04068> N(class01894 var0) {
      return class05946.N(class04227.yB, var0);
   }

   private static void N(class04116<class04068> var0, class05946<class04068> var1, String var2, class08585 var3) {
      var0.N(var1, new class04068(new class06953(class01894.y(var2)), var3));
   }

   private static void N(class04116<class04068> var0, class05946<class04068> var1, String var2, class03530<class00780> var3) {
      class03552 class03552 = var0.N(class04227.NA).y(var3);
      N(var0, var1, var2, class08585.N(new class08561(class03552), 1));
   }

   static void N(class04116<class04068> var0) {
      N(var0, N, "entity/frog/temperate_frog", class08585.N(0));
      N(var0, y, "entity/frog/warm_frog", class03557.Ni);
      N(var0, L, "entity/frog/cold_frog", class03557.Nu);
   }
}
