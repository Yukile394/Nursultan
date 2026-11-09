package minecraft;

public class class02503 {
   public static final class05946<class02505> N = N("pale");
   public static final class05946<class02505> y = N("spotted");
   public static final class05946<class02505> L = N("snowy");
   public static final class05946<class02505> u = N("black");
   public static final class05946<class02505> i = N("ashen");
   public static final class05946<class02505> R = N("rusty");
   public static final class05946<class02505> M = N("woods");
   public static final class05946<class02505> B = N("chestnut");
   public static final class05946<class02505> Z = N("striped");
   public static final class05946<class02505> z = N;

   public class02503() {
      super();
   }

   private static class08585 N(class03543<class00780> var0) {
      return class08585.N(new class08561(var0), 1);
   }

   public static void N(class04116<class02505> var0) {
      N(var0, N, "wolf", class08585.N(0));
      N(var0, y, "wolf_spotted", class03557.U);
      N(var0, L, "wolf_snowy", class00795.J);
      N(var0, u, "wolf_black", class00795.P);
      N(var0, i, "wolf_ashen", class00795.b);
      N(var0, R, "wolf_rusty", class03557.Z);
      N(var0, M, "wolf_woods", class00795.Z);
      N(var0, B, "wolf_chestnut", class00795.s);
      N(var0, Z, "wolf_striped", class03557.R);
   }

   private static void N(class04116<class02505> var0, class05946<class02505> var1, String var2, class08585 var3) {
      class01894 class01894xx = class01894.y("entity/wolf/" + var2);
      class01894 class01894x = class01894.y("entity/wolf/" + var2 + "_tame");
      class01894 class01894xx = class01894.y("entity/wolf/" + var2 + "_angry");
      var0.N(var1, new class02505(new class02497(new class06953(class01894xx), new class06953(class01894x), new class06953(class01894xx)), var3));
   }

   private static class05946<class02505> N(String var0) {
      return class05946.N(class04227.yY, class01894.y(var0));
   }

   private static void N(class04116<class02505> var0, class05946<class02505> var1, String var2, class03530<class00780> var3) {
      N(var0, var1, var2, N(var0.N(class04227.NA).y(var3)));
   }

   private static void N(class04116<class02505> var0, class05946<class02505> var1, String var2, class05946<class00780> var3) {
      N(var0, var1, var2, N(class03543.N(var0.N(class04227.NA).y(var3))));
   }
}
