package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class class05552 {
   private static final class02135 N = class02135.y(5, 16);
   private static final float y = 0.2F;
   private static final float L = 0.15F;
   private static final float u = 0.5F;
   private static final float i = 0.6F;
   private static final float R = 0.6F;

   private static void L(class01289<class05538> var0) {
      var0.N(
         class05359.U,
         0,
         ImmutableList.of(class01523.N_28(class05538::N), class01531.N(class05552::y), class01528.N(20), class01518.N(class06293::N, class05378.s)),
         class05378.s
      );
   }

   private static float L(class07438 var0) {
      return var0.method_5799() ? 0.6F : 0.15F;
   }

   public class05552() {
      super();
   }

   private static void i(class01289<class05538> var0) {
      var0.N(
         class05359.y,
         ImmutableList.of(
            Pair.of(0, class04126.N(class07078.Ly, 6.0F, class02135.y(30, 60))),
            Pair.of(1, new class01485(class07078.z, 0.2F, 2)),
            Pair.of(
               2, new class05747(ImmutableList.of(Pair.of(new class05585(class05552::u), 1), Pair.of(class01269.N(N, class05552::L, class05378.e, false), 1)))
            ),
            Pair.of(3, class01507.N(class05552::N)),
            Pair.of(3, class05548.N(6, 0.15F)),
            Pair.of(
               4,
               new class05736(
                  ImmutableMap.of(class05378.m, class05367.field_18457),
                  ImmutableSet.of(),
                  class05753.field_18348,
                  class05769.field_18856,
                  ImmutableList.of(
                     Pair.of(class01520.L(0.5F), 2),
                     Pair.of(class01520.N(0.15F, false), 2),
                     Pair.of(class05771.N(class05552::N, class05552::u, 3), 3),
                     Pair.of(class04137.N_43(class07049::method_5799), 5),
                     Pair.of(class04137.N_43(class07049::method_24828), 5)
                  )
               )
            )
         )
      );
   }

   private static float u(class07438 var0) {
      return var0.method_5799() ? 0.5F : 0.15F;
   }

   private static void u(class01289<class05538> var0) {
      var0.N(class05359.N, 0, ImmutableList.of(new class05770(45, 90), new class05738(), class05556.N(), new class05550(class05378.p)));
   }

   private static float y(class07438 var0) {
      return var0.method_5799() ? 0.6F : 0.15F;
   }

   private static void y(class01289<class05538> var0) {
      var0.N(
         class05359.s,
         ImmutableList.of(Pair.of(0, new class05579()), Pair.of(1, class01518.N(class06293::N, class05378.X))),
         ImmutableSet.of(Pair.of(class05378.X, class05367.field_18456)),
         ImmutableSet.of(class05378.X)
      );
   }

   private static boolean N(class07438 var0) {
      class07299 class07299 = var0.method_73183();
      Optional<class05779> optional = var0.method_18868().L(class05378.P);
      if (optional.isPresent()) {
         class07209 class07209 = optional.get().y();
         return class07299.z(class07209) == var0.method_5799();
      } else {
         return false;
      }
   }

   private static Optional<? extends class07438> N(class04782 var0, class05538 var1) {
      return class06293.N(var1) ? Optional.empty() : var1.method_18868().L(class05378.Q);
   }

   public static void N(class05538 var0) {
      class01289<class05538> class01289 = var0.method_18868();
      class05359 class05359 = class01289.R().orElse(null);
      if (class05359 != class05359.s) {
         class01289.N(ImmutableList.of(class05359.s, class05359.U, class05359.y));
         if (class05359 == class05359.U && class01289.R().orElse(null) != class05359.U) {
            class01289.N(class05378.S, true, 2400L);
         }
      }
   }

   public static class01289<?> N(class01289<class05538> var0) {
      u(var0);
      i(var0);
      L(var0);
      y(var0);
      var0.N(ImmutableSet.of(class05359.N));
      var0.y(class05359.y);
      var0.i();
      return var0;
   }
}
