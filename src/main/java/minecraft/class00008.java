package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import java.util.Set;

public class class00008 {
   private static final float N = 1.0F;
   private static final float y = 1.25F;
   private static final float L = 1.1F;
   private static final double u = 3.0;
   private static final class02135 i = class02135.y(3, 16);
   private static final ImmutableList<class05340<? extends class05355<? super class00032>>> R = ImmutableList.of(
      class05340.L, class05340.R, class05340.b, class05340.s, class05340.u
   );
   private static final ImmutableList<class05378<?>> M = ImmutableList.of(
      class05378.m,
      class05378.P,
      class05378.I,
      class05378.n,
      class05378.B,
      class05378.a,
      class05378.p,
      class05378.A,
      class05378.j,
      class05378.NN,
      class05378.d,
      class05378.e,
      new class05378[]{class05378.z, class05378.U, class05378.E, class05378.W}
   );

   private static void L(class01289<class00032> var0) {
      var0.N(
         class05359.y,
         ImmutableList.of(
            Pair.of(1, new class05585(var0x -> 1.25F, var0x -> 3.0, true)),
            Pair.of(2, class01269.N(i, var0x -> 1.1F, class05378.U, true)),
            Pair.of(3, class01269.N(i, var0x -> 1.1F, class05378.e, true)),
            Pair.of(4, new class05747(ImmutableList.of(Pair.of(class01520.y(1.0F), 1), Pair.of(class05771.N(1.0F, 3), 1))))
         )
      );
   }

   public class00008() {
      super();
   }

   private static void u(class01289<class00032> var0) {
      var0.N(class05359.M, ImmutableList.of(), Set.of(Pair.of(class05378.NN, class05367.field_18456)));
   }

   private static void y(class01289<class00032> var0) {
      var0.N(
         class05359.N,
         0,
         ImmutableList.of(new class05739(0.8F), new class02140(2.0F, 0), new class05770(45, 90), new class05738(), new class05550(class05378.p))
      );
   }

   public static void N(class00032 var0) {
      var0.method_18868().N(ImmutableList.of(class05359.M, class05359.y));
   }

   public static class05781<class00032> N() {
      return class01289.N(M, R);
   }

   public static class01289<?> N(class01289<class00032> var0) {
      y(var0);
      L(var0);
      u(var0);
      var0.N(Set.of(class05359.N));
      var0.y(class05359.y);
      var0.i();
      return var0;
   }
}
