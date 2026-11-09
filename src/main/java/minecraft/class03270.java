package minecraft;

import java.util.Optional;

public class class03270 {
   public static final class05946<class03252> N = N("quartz");
   public static final class05946<class03252> y = N("iron");
   public static final class05946<class03252> L = N("netherite");
   public static final class05946<class03252> u = N("redstone");
   public static final class05946<class03252> i = N("copper");
   public static final class05946<class03252> R = N("gold");
   public static final class05946<class03252> M = N("emerald");
   public static final class05946<class03252> B = N("diamond");
   public static final class05946<class03252> Z = N("lapis");
   public static final class05946<class03252> z = N("amethyst");
   public static final class05946<class03252> U = N("resin");

   public class03270() {
      super();
   }

   private static void N(class04116<class03252> var0, class05946<class03252> var1, class00405 var2, class08548 var3) {
      class05216 class05216 = class00392.L(class07536.N("trim_material", var1.N())).L(var2);
      var0.N(var1, new class03252(var3, class05216));
   }

   private static class05946<class03252> N(String var0) {
      return class05946.N(class04227.yw, class01894.y(var0));
   }

   public static void N(class04116<class03252> var0) {
      N(var0, N, class00405.N.N(14931140), class08548.u);
      N(var0, y, class00405.N.N(15527148), class08548.i);
      N(var0, L, class00405.N.N(6445145), class08548.R);
      N(var0, u, class00405.N.N(9901575), class08548.M);
      N(var0, i, class00405.N.N(11823181), class08548.B);
      N(var0, R, class00405.N.N(14594349), class08548.Z);
      N(var0, M, class00405.N.N(1155126), class08548.z);
      N(var0, B, class00405.N.N(7269586), class08548.U);
      N(var0, Z, class00405.N.N(4288151), class08548.E);
      N(var0, z, class00405.N.N(10116294), class08548.W);
      N(var0, U, class00405.N.N(16545810), class08548.m);
   }

   public static Optional<class03556<class03252>> N(class01929 var0, class06584 var1) {
      class08551 class08551 = var1.method_58694(class02484.Nz);
      return class08551 != null ? class08551.N(var0) : Optional.empty();
   }
}
