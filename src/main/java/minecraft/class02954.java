package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class class02954 {
   private static final float N = 4.0F;
   private static final float y = 2.0F;
   private static final float L = 2.5F;
   private static final float u = 2.5F;
   private static final float i = 1.0F;
   private static final class02135 R = class02135.y(5, 16);
   private static final ImmutableList<class05340<? extends class05355<? super class02976>>> M = ImmutableList.of(
      class05340.L, class05340.R, class05340.b, class05340.P
   );
   private static final ImmutableList<class05378<?>> B = ImmutableList.of(
      class05378.NN,
      class05378.d,
      class05378.w,
      class05378.m,
      class05378.P,
      class05378.I,
      class05378.n,
      class05378.B,
      class05378.a,
      class05378.p,
      class05378.F,
      class05378.A,
      new class05378[]{class05378.j, class05378.e}
   );

   private static void L(class01289<class02976> var0) {
      var0.N(
         class05359.y,
         ImmutableList.of(
            Pair.of(0, class04126.N(class07078.Ly, 6.0F, class02135.y(30, 60))),
            Pair.of(1, new class01485(class07078.t)),
            Pair.of(
               2,
               new class05747(
                  ImmutableList.of(
                     Pair.of(new class05585(var0x -> 2.5F, var0x -> var0x.method_6109() ? 2.5 : 3.5), 1),
                     Pair.of(class04137.N_44(Predicate.not(class02976::Nh), class01269.N(R, 2.5F)), 1)
                  )
               )
            ),
            Pair.of(3, new class02978(class02135.y(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new class05747(
                  ImmutableMap.of(class05378.m, class05367.field_18457),
                  ImmutableList.of(
                     Pair.of(class04137.N_44(Predicate.not(class02976::Nh), class01520.N(2.0F)), 1),
                     Pair.of(class04137.N_44(Predicate.not(class02976::Nh), class05771.N(2.0F, 3)), 1),
                     Pair.of(new class02956(20), 1),
                     Pair.of(new class05782(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public class02954() {
      super();
   }

   private static void y(class01289<class02976> var0) {
      var0.N(
         class05359.N,
         0,
         ImmutableList.of(
            new class05739(0.8F), new class02979(4.0F), new class05770(45, 90), new class05738(), new class05550(class05378.p), new class05550(class05378.F)
         )
      );
   }

   public static class05781<class02976> N() {
      return class01289.N(B, M);
   }

   public static void N(class02976 var0) {
      var0.method_18868().N(ImmutableList.of(class05359.y));
   }

   public static void N(class02976 var0, class06069 var1) {
   }

   public static class01289<?> N(class01289<class02976> var0) {
      y(var0);
      L(var0);
      var0.N(ImmutableSet.of(class05359.N));
      var0.y(class05359.y);
      var0.i();
      return var0;
   }
}
