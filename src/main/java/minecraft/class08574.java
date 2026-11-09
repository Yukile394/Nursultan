package minecraft;

import java.util.List;

public interface class08574 {
   class05946<class03648> N = N("tabby");
   class05946<class03648> y = N("black");
   class05946<class03648> L = N("red");
   class05946<class03648> u = N("siamese");
   class05946<class03648> i = N("british_shorthair");
   class05946<class03648> R = N("calico");
   class05946<class03648> M = N("persian");
   class05946<class03648> B = N("ragdoll");
   class05946<class03648> Z = N("white");
   class05946<class03648> z = N("jellie");
   class05946<class03648> U = N("all_black");

   private static class05946<class03648> N(String var0) {
      return class05946.N(class04227.Nf, class01894.y(var0));
   }

   private static void N(class04116<class03648> var0, class05946<class03648> var1, String var2, class08585 var3) {
      var0.N(var1, new class03648(new class06953(class01894.y(var2)), var3));
   }

   private static void N(class04116<class03648> var0, class05946<class03648> var1, String var2) {
      N(var0, var1, var2, class08585.N(0));
   }

   static void N(class04116<class03648> var0) {
      class02055 class02055 = var0.N(class04227.yj);
      N(var0, N, "entity/cat/tabby");
      N(var0, y, "entity/cat/black");
      N(var0, L, "entity/cat/red");
      N(var0, u, "entity/cat/siamese");
      N(var0, i, "entity/cat/british_shorthair");
      N(var0, R, "entity/cat/calico");
      N(var0, M, "entity/cat/persian");
      N(var0, B, "entity/cat/ragdoll");
      N(var0, Z, "entity/cat/white");
      N(var0, z, "entity/cat/jellie");
      N(
         var0,
         U,
         "entity/cat/all_black",
         new class08585(List.of(new class08556<>(new class08547(class02055.y(class04398.P)), 1), new class08556<>(new class08563(class00816.y(0.9)), 0)))
      );
   }
}
