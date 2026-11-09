package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class class08185 {
   private static final float u = 1.0F;
   private static final float i = 1.3F;
   private static final float R = 0.4F;
   private static final float M = 1.6F;
   private static final class02135 B = class02135.y(2400, 3600);
   private static final float Z = 0.6F;
   private static final float z = 2.0F;
   private static final int U = 400;
   private static final int E = 80;
   private static final double W = 12.0;
   private static final double m = 11.0;
   protected static final class01328 N = class01328.N()
      .N((var0, var1) -> (var1.method_64395().N(class07305.I) || !var0.method_5864().equals(class07078.B)) && var1.method_8621().N(var0.method_5829()));
   protected static final ImmutableList<class05340<? extends class05355<? super class08157>>> y = ImmutableList.of(
      class05340.L, class05340.P, class05340.u, class05340.R, class05340.v
   );
   protected static final ImmutableList<class05378<?>> L = ImmutableList.of(
      class05378.P,
      class05378.B,
      class05378.m,
      class05378.I,
      class05378.n,
      class05378.e,
      class05378.p,
      class05378.A,
      class05378.a,
      class05378.j,
      class05378.NN,
      class05378.s,
      new class05378[]{class05378.NR, class05378.d, class05378.NW, class05378.NM}
   );

   private static void L(class01289<class08157> var0) {
      var0.N(
         class05359.y,
         ImmutableList.of(
            Pair.of(1, new class01485(class07078.NH, 0.4F, 2)),
            Pair.of(2, new class05585(var0x -> 1.3F, var0x -> var0x.method_6109() ? 2.5 : 3.5)),
            Pair.of(3, class01507.N(class08185::N)),
            Pair.of(
               4,
               new class05736(
                  ImmutableMap.of(class05378.m, class05367.field_18457),
                  ImmutableSet.of(),
                  class05753.field_18348,
                  class05769.field_18856,
                  ImmutableList.of(Pair.of(class01520.L(1.0F), 2), Pair.of(class05771.N(1.0F, 3), 3))
               )
            )
         )
      );
   }

   public class08185() {
      super();
   }

   private static void u(class01289<class08157> var0) {
      var0.N(
         class05359.U,
         ImmutableList.of(Pair.of(0, new class08163(80, N, 0.6F, 2.0F, 12.0, 11.0, class04909.jC))),
         ImmutableSet.of(
            Pair.of(class05378.s, class05367.field_18456),
            Pair.of(class05378.a, class05367.field_18457),
            Pair.of(class05378.j, class05367.field_18457),
            Pair.of(class05378.NR, class05367.field_18457)
         )
      );
   }

   public static Predicate<class06584> y() {
      return var0 -> var0.N(class01226.yz);
   }

   private static void y(class01289<class08157> var0) {
      var0.N(
         class05359.N,
         0,
         ImmutableList.of(
            new class02140(1.6F),
            new class05770(45, 90),
            new class05738(),
            new class05550(class05378.p),
            new class05550(class05378.NR),
            new class05550(class05378.NM)
         )
      );
   }

   protected static class01289<?> N(class01289<class08157> var0) {
      y(var0);
      L(var0);
      u(var0);
      var0.N(ImmutableSet.of(class05359.N));
      var0.y(class05359.y);
      var0.i();
      return var0;
   }

   public static void N(class08156 var0, class06069 var1) {
      var0.method_18868().N(class05378.NM, B.N(var1));
   }

   private static boolean N(class07438 var0) {
      return var0.method_5799() && var0.method_5864().N(class01217.A);
   }

   public static void N(class04782 var0, class08156 var1, class07438 var2) {
      if (class05355.L(var0, var1, var2)) {
         var1.method_18868().y(class05378.I);
         var1.method_18868().N(class05378.NW, var2.method_5667(), 400L);
      }
   }

   protected static class05781<class08157> N() {
      return class01289.N(L, y);
   }

   public static void N(class08157 var0) {
      var0.method_18868().N(ImmutableList.of(class05359.U, class05359.y));
   }

   protected static Optional<? extends class07438> N(class04782 var0, class08156 var1) {
      if (!class06293.N(var1) && var1.method_5799() && !var1.method_6109() && !var1.NQ()) {
         Optional optional = class06293.N(var1, class05378.NW).filter(var2x -> var2x.method_5799() && class05355.L(var0, var1, var2x));
         if (optional.isPresent()) {
            return optional;
         } else if (var1.method_18868().N(class05378.NM)) {
            return Optional.empty();
         } else {
            var1.method_18868().N(class05378.NM, B.N(var0.field_9229));
            return var0.field_9229.z() < 0.5F ? Optional.empty() : var1.method_18868().L(class05378.B).orElse(class04051.N()).N(class08185::N);
         }
      } else {
         return Optional.empty();
      }
   }
}
