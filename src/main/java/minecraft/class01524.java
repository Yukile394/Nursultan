package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class class01524 {
   public static final int N = 8;
   public static final int y = 4;
   private static final class02135 L = class01517.N(5, 20);
   private static final int u = 200;
   private static final int i = 8;
   private static final int R = 15;
   private static final int M = 40;
   private static final int B = 15;
   private static final int Z = 200;
   private static final class02135 z = class02135.y(5, 16);
   private static final float U = 1.0F;
   private static final float E = 1.3F;
   private static final float W = 0.6F;
   private static final float m = 0.4F;
   private static final float P = 0.6F;

   private static void L(class06018 var0, class07438 var1) {
      class01289<class06018> class01289 = var0.method_18868();
      class07438 class07438 = class06293.N(var0, class01289.L(class05378.k), var1);
      class07438 = class06293.N(var0, class01289.L(class05378.s), class07438);
      u(var0, class07438);
   }

   public static boolean L(class06018 var0) {
      return var0.method_18868().N(class05378.Nq);
   }

   private static void L(class01289<class06018> var0) {
      var0.N(
         class05359.y,
         10,
         ImmutableList.of(
            class01534.N(class05378.No, 200),
            new class01485(class07078.NP, 0.6F, 2),
            class05773.N(class05378.No, 1.0F, 8, true),
            class01507.N(class01524::N),
            class04137.N_44(class06018::m, class05773.y(class05378.NY, 0.4F, 8, false)),
            class04126.N(8.0F, class02135.y(30, 60)),
            class01269.N(z, 0.6F),
            N()
         )
      );
   }

   private static void M(class06018 var0, class07438 var1) {
      if (!L(var0)) {
         Optional<class07438> optional = var0.method_18868().L(class05378.s);
         class07438 class07438 = class06293.N(var0, optional, var1);
         i(var0, class07438);
      }
   }

   private static boolean M(class06018 var0) {
      return var0.method_18868().N(class05378.No);
   }

   public class01524() {
      super();
   }

   private static boolean B(class06018 var0) {
      return var0.method_18868().N(class05378.j);
   }

   private static void i(class06018 var0, class07438 var1) {
      class01289<class06018> class01289 = var0.method_18868();
      class01289.y(class05378.I);
      class01289.y(class05378.j);
      class01289.N(class05378.s, var1, 200L);
   }

   private static void i(class01289<class06018> var0) {
      var0.N(
         class05359.m,
         10,
         ImmutableList.of(class05773.y(class05378.k, 1.3F, 15, false), N(), class04126.N(8.0F, class02135.y(30, 60)), class01518.N(class01524::u, class05378.k)),
         class05378.k
      );
   }

   private static boolean i(class06018 var0) {
      if (var0.method_6109()) {
         return false;
      } else {
         int ix = var0.method_18868().L(class05378.NO).orElse(0);
         int j = var0.method_18868().L(class05378.Ng).orElse(0) + 1;
         return ix > j;
      }
   }

   private static boolean u(class06018 var0) {
      return var0.m() && !i(var0);
   }

   private static void u(class06018 var0, class07438 var1) {
      var0.method_18868().y(class05378.s);
      var0.method_18868().y(class05378.m);
      var0.method_18868().N(class05378.k, var1, L.N(var0.method_73183().field_9229));
   }

   private static void u(class01289<class06018> var0) {
      var0.N(
         class05359.U,
         10,
         ImmutableList.of(
            class01534.N(class05378.No, 200),
            new class01485(class07078.NP, 0.6F, 2),
            class01531.N(1.0F),
            class04137.N_44(class06018::m, class01528.N(40)),
            class04137.N_44(class07077::method_6109, class01528.N(15)),
            class01523.N(),
            class01518.N(class01524::B, class05378.s)
         ),
         class05378.s
      );
   }

   private static void y(class04782 var0, class06018 var1, class07438 var2) {
      if (!var1.method_18868().L(class05359.m) || var2.method_5864() != class07078.Nr) {
         if (var2.method_5864() != class07078.NP) {
            if (!class06293.N(var1, var2, 4.0)) {
               if (class05355.y(var0, var1, var2)) {
                  i(var1, var2);
                  R(var1, var2);
               }
            }
         }
      }
   }

   private static void y(class01289<class06018> var0) {
      var0.N(class05359.N, 0, ImmutableList.of(new class05770(45, 90), new class05738()));
   }

   private static void y(class06018 var0, class07438 var1) {
      R(var0).forEach(var1x -> L(var1x, var1));
   }

   public static Optional<class04891> y(class06018 var0) {
      return var0.method_18868().R().map(var1 -> N(var0, var1));
   }

   private static class04891 N(class06018 var0, class05359 var1) {
      if (var1 == class05359.m || var0.v()) {
         return class04909.Pj;
      } else if (var1 == class05359.U) {
         return class04909.Pm;
      } else {
         return M(var0) ? class04909.Pj : class04909.PW;
      }
   }

   public static class01289<?> N(class01289<class06018> var0) {
      y(var0);
      L(var0);
      u(var0);
      i(var0);
      var0.N(ImmutableSet.of(class05359.N));
      var0.y(class05359.y);
      var0.i();
      return var0;
   }

   public static void N(class06018 var0, class07438 var1) {
      if (!var0.method_6109()) {
         if (var1.method_5864() == class07078.Nr && i(var0)) {
            u(var0, var1);
            y(var0, var1);
         } else {
            R(var0, var1);
         }
      }
   }

   private static class05747<class06018> N() {
      return new class05747<>(ImmutableList.of(Pair.of(class01520.N(0.4F), 2), Pair.of(class05771.N(0.4F, 3), 2), Pair.of(new class05782(30, 60), 1)));
   }

   static boolean N(class06018 var0, class07209 var1) {
      Optional<class07209> optional = var0.method_18868().L(class05378.No);
      return optional.isPresent() && optional.get().method_19771(var1, 8.0);
   }

   private static Optional<? extends class07438> N(class04782 var0, class06018 var1) {
      return !L(var1) && !B(var1) ? var1.method_18868().L(class05378.E) : Optional.empty();
   }

   public static void N(class06018 var0) {
      class01289<class06018> class01289 = var0.method_18868();
      class05359 class05359x = class01289.R().orElse(null);
      class01289.N(ImmutableList.of(class05359.U, class05359.m, class05359.y));
      class05359 class05359x = class01289.R().orElse(null);
      if (class05359x != class05359x) {
         y(var0).ifPresent(var0::method_56078);
      }

      var0.R(class01289.N(class05378.s));
   }

   public static void N(class04782 var0, class06018 var1, class07438 var2) {
      class01289<class06018> class01289 = var1.method_18868();
      class01289.y(class05378.Nq);
      class01289.y(class05378.j);
      if (var1.method_6109()) {
         L(var1, var2);
      } else {
         y(var0, var1, var2);
      }
   }

   private static void R(class06018 var0, class07438 var1) {
      R(var0).forEach(var1x -> M(var1x, var1));
   }

   private static List<class06018> R(class06018 var0) {
      return var0.method_18868().L(class05378.Nk).orElse(ImmutableList.of());
   }
}
