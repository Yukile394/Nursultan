package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class class08167 {
   private static final float L = 1.0F;
   private static final float u = 0.9F;
   private static final float i = 0.5F;
   private static final float R = 2.0F;
   private static final int M = 80;
   private static final double B = 12.0;
   private static final double Z = 11.0;
   protected static final ImmutableList<class05340<? extends class05355<? super class08187>>> N = ImmutableList.of(
      class05340.L, class05340.P, class05340.u, class05340.R, class05340.v
   );
   protected static final ImmutableList<class05378<?>> y = ImmutableList.of(
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

   private static void L(class01289<class08187> var0) {
      var0.N(
         class05359.y,
         ImmutableList.of(
            Pair.of(1, new class05585(var0x -> 0.9F, var0x -> var0x.method_6109() ? 2.5 : 3.5)),
            Pair.of(2, class01507.N(class08185::N)),
            Pair.of(
               3,
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

   public class08167() {
      super();
   }

   private static void u(class01289<class08187> var0) {
      var0.N(
         class05359.U,
         ImmutableList.of(Pair.of(0, new class08163(80, class08185.N, 0.5F, 2.0F, 12.0, 11.0, class04909.JD))),
         ImmutableSet.of(
            Pair.of(class05378.s, class05367.field_18456),
            Pair.of(class05378.a, class05367.field_18457),
            Pair.of(class05378.j, class05367.field_18457),
            Pair.of(class05378.NR, class05367.field_18457)
         )
      );
   }

   private static void y(class01289<class08187> var0) {
      var0.N(
         class05359.N,
         0,
         ImmutableList.of(new class05770(45, 90), new class05738(), new class05550(class05378.p), new class05550(class05378.NR), new class05550(class05378.NM))
      );
   }

   public static void N(class08187 var0) {
      var0.method_18868().N(ImmutableList.of(class05359.U, class05359.y));
   }

   public static class01289<?> N(class01289<class08187> var0) {
      y(var0);
      L(var0);
      u(var0);
      var0.N(ImmutableSet.of(class05359.N));
      var0.y(class05359.y);
      var0.i();
      return var0;
   }

   public static class05781<class08187> N() {
      return class01289.N(y, N);
   }
}
