package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class class04516 {
   public static final float N = 0.6F;
   public static final float y = 4.0F;
   public static final float L = 8.0F;
   public static final float u = 24.0F;
   static final List<class05340<? extends class05355<? super class04508>>> i = ImmutableList.of(class05340.L, class05340.R, class05340.u, class05340.l);
   static final List<class05378<?>> R = ImmutableList.of(
      class05378.P,
      class05378.B,
      class05378.Q,
      class05378.I,
      class05378.s,
      class05378.m,
      class05378.yR,
      class05378.yU,
      class05378.yM,
      class05378.yB,
      class05378.yZ,
      class05378.yz,
      new class05378[]{class05378.yE, class05378.yW, class05378.d, class05378.w, class05378.n}
   );
   private static final int M = 100;

   public class04516() {
      super();
   }

   private static void y(class01289<class04508> var0) {
      var0.N(
         class05359.y,
         ImmutableList.of(
            Pair.of(0, class01507.N((var0x, var1) -> var1.method_18868().L(class05378.Q))),
            Pair.of(1, class01507.N((var0x, var1) -> var1.m())),
            Pair.of(2, new class04484(20, 40)),
            Pair.of(3, new class05747(ImmutableList.of(Pair.of(new class05782(20, 100), 1), Pair.of(class01520.N(0.6F), 2))))
         )
      );
   }

   private static void y(class04508 var0, class01289<class04508> var1) {
      var1.N(
         class05359.U,
         ImmutableList.of(
            Pair.of(0, class01523.N(class05355.N(var0, 100).negate()::test)),
            Pair.of(1, new class04503()),
            Pair.of(2, new class04509()),
            Pair.of(3, new class03818()),
            Pair.of(4, new class04518())
         ),
         ImmutableSet.of(Pair.of(class05378.s, class05367.field_18456), Pair.of(class05378.m, class05367.field_18457))
      );
   }

   private static void N(class01289<class04508> var0) {
      var0.N(class05359.N, 0, ImmutableList.of(new class05739(0.8F), new class05770(45, 90)));
   }

   static void N(class04508 var0) {
      var0.method_18868().N(ImmutableList.of(class05359.U, class05359.y));
   }

   public static class01289<?> N(class04508 var0, class01289<class04508> var1) {
      N(var1);
      y(var1);
      y(var0, var1);
      var1.N(Set.of(class05359.N));
      var1.y(class05359.U);
      var1.i();
      return var1;
   }
}
