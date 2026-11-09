package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Set;

public class class03806 {
   private static final float N = 2.0F;
   private static final float y = 1.0F;
   private static final float L = 1.25F;
   private static final float u = 1.25F;
   private static final float i = 1.0F;
   private static final double R = 2.0;
   private static final double M = 1.0;
   private static final class02135 B = class02135.y(5, 16);
   private static final ImmutableList<class05340<? extends class05355<? super class03811>>> Z = ImmutableList.of(
      class05340.L, class05340.R, class05340.b, class05340.P, class05340.U
   );
   private static final ImmutableList<class05378<?>> z = ImmutableList.of(
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
      new class05378[]{class05378.j, class05378.e, class05378.o}
   );
   private static final class04119<class03811> U = class04137.N_42(var0 -> var0.group(var0.L(class05378.o)).apply(var0, var0x -> (var0xx, var1, var2) -> {
      if (var1.W()) {
         var1.G();
         return true;
      } else {
         return false;
      }
   }));

   private static void L(class01289<class03811> var0) {
      var0.N(
         class05359.y,
         ImmutableList.of(
            Pair.of(0, class04126.N(class07078.Ly, 6.0F, class02135.y(30, 60))),
            Pair.of(1, new class01485(class07078.M, 1.0F, 1)),
            Pair.of(
               2,
               new class05747(
                  ImmutableList.of(Pair.of(new class05585(var0x -> 1.25F, var0x -> var0x.method_6109() ? 1.0 : 2.0), 1), Pair.of(class01269.N(B, 1.25F), 1))
               )
            ),
            Pair.of(3, new class02978(class02135.y(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new class05747(
                  ImmutableMap.of(class05378.m, class05367.field_18457),
                  ImmutableList.of(Pair.of(class01520.N(1.0F), 1), Pair.of(class05771.N(1.0F, 3), 1), Pair.of(new class05782(30, 60), 1))
               )
            )
         )
      );
   }

   public class03806() {
      super();
   }

   private static void u(class01289<class03811> var0) {
      var0.N(
         class05359.M,
         ImmutableList.of(Pair.of(0, new class03830())),
         Set.of(Pair.of(class05378.o, class05367.field_18456), Pair.of(class05378.NN, class05367.field_18457))
      );
   }

   private static void y(class01289<class03811> var0) {
      var0.N(
         class05359.N,
         0,
         ImmutableList.of(
            new class05739(0.8F), new class03803(2.0F), new class05770(45, 90), new class03801(), new class05550(class05378.p), new class05550(class05378.F), U
         )
      );
   }

   public static void N(class03811 var0) {
      var0.method_18868().N(ImmutableList.of(class05359.M, class05359.y));
   }

   public static class05781<class03811> N() {
      return class01289.N(z, Z);
   }

   public static class01289<?> N(class01289<class03811> var0) {
      y(var0);
      L(var0);
      u(var0);
      var0.N(Set.of(class05359.N));
      var0.y(class05359.y);
      var0.i();
      return var0;
   }
}
