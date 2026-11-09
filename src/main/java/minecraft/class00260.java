package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class class00260 {
   protected static final ImmutableList<? extends class05340<? extends class05355<? super class00245>>> N = ImmutableList.of(class05340.L, class05340.u);
   protected static final ImmutableList<? extends class05378<?>> y = ImmutableList.of(
      class05378.M, class05378.B, class05378.U, class05378.E, class05378.W, class05378.P, class05378.m, class05378.I, class05378.n, class05378.s, class05378.T
   );

   public class00260() {
      super();
   }

   public static class01289<class00245> y(class00245 var0, class01289<class00245> var1) {
      N(var1);
      y(var1);
      N(var0, var1);
      var1.N(ImmutableSet.of(class05359.N));
      var1.y(class05359.y);
      var1.i();
      return var1;
   }

   static void y(class01289<class00245> var0) {
      var0.N(
         class05359.y,
         10,
         ImmutableList.of(
            class01507.N((var0x, var1) -> var1.v(), (var0x, var1) -> var1.method_18868().L(class05378.E)),
            class04126.N(8.0F, class02135.y(30, 60)),
            new class05747(ImmutableList.of(Pair.of(class01520.N(0.3F), 2), Pair.of(class05771.N(0.3F, 3), 2), Pair.of(new class05782(30, 60), 1)))
         )
      );
   }

   public static void N(class00245 var0) {
      if (!var0.B()) {
         var0.method_18868().i();
      } else {
         var0.method_18868().N(ImmutableList.of(class05359.U, class05359.y));
      }
   }

   private static boolean N(class00245 var0, class07438 var1) {
      return var0.method_18868().L(class05378.W).map(var1x -> var1 instanceof class08036 class08036 && var1x.contains(class08036)).orElse(false);
   }

   public static class05781<class00245> N() {
      return class01289.N(y, N);
   }

   static void N(class01289<class00245> var0) {
      var0.N(class05359.N, 0, ImmutableList.of(new class00256(0.8F), new class05770(45, 90), new class05738()));
   }

   static void N(class00245 var0, class01289<class00245> var1) {
      var1.N(
         class05359.U,
         10,
         ImmutableList.of(class01531.N(1.0F), class01528.N(class00245::B, 40), class01523.N((var1x, var2) -> !N(var0, var2))),
         ImmutableSet.of(Pair.of(class05378.s, class05367.field_18456))
      );
   }
}
