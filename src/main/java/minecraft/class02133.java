package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class class02133 {
   public static final int N = 20;
   public static final int y = 7;
   private static final class02135 Z = class02135.y(5, 16);
   private static final float z = 1.0F;
   private static final float U = 1.25F;
   private static final float E = 1.25F;
   private static final float W = 2.0F;
   private static final float m = 1.25F;
   private static final class02135 P = class02135.y(600, 1200);
   public static final int L = 5;
   public static final int u = 5;
   public static final float i = 3.5714288F;
   private static final class02135 s = class02135.y(600, 6000);
   private static final class02135 T = class02135.y(100, 300);
   private static final class01328 b = class01328.N()
      .N(
         (var0, var1) -> !var0.method_5864().equals(class07078.NW)
            && (var1.method_64395().N(class07305.I) || !var0.method_5864().equals(class07078.B))
            && var1.method_8621().N(var0.method_5829())
      );
   private static final float j = 3.0F;
   public static final int R = 4;
   public static final float M = 2.5F;
   public static final float B = 1.0F;

   private static void L(class01289<class02148> var0) {
      var0.N(
         class05359.y,
         ImmutableList.of(
            Pair.of(0, class04126.N(class07078.Ly, 6.0F, class02135.y(30, 60))),
            Pair.of(0, new class01485(class07078.NW)),
            Pair.of(1, new class05585(var0x -> 1.25F)),
            Pair.of(2, class01269.N(Z, 1.25F)),
            Pair.of(3, new class05747(ImmutableList.of(Pair.of(class01520.N(1.0F), 2), Pair.of(class05771.N(1.0F, 3), 2), Pair.of(new class05782(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(class05378.D, class05367.field_18457), Pair.of(class05378.C, class05367.field_18457))
      );
   }

   public class02133() {
      super();
   }

   private static void i(class01289<class02148> var0) {
      var0.N(
         class05359.b,
         ImmutableList.of(
            Pair.of(
               0,
               new class01702(
                  var0x -> var0x.d() ? T : s,
                  b,
                  3.0F,
                  var0x -> var0x.method_6109() ? 1.0 : 2.5,
                  var0x -> var0x.d() ? class04909.WA : class04909.WK,
                  var0x -> class04909.WV
               )
            ),
            Pair.of(1, new class01694<>(var0x -> var0x.d() ? T.y() : s.y(), 4, 7, 1.25F, b, 20, var0x -> var0x.d() ? class04909.WF : class04909.Wq))
         ),
         ImmutableSet.of(
            Pair.of(class05378.a, class05367.field_18457), Pair.of(class05378.j, class05367.field_18457), Pair.of(class05378.x, class05367.field_18457)
         )
      );
   }

   private static void u(class01289<class02148> var0) {
      var0.N(
         class05359.T,
         ImmutableList.of(
            Pair.of(0, new class02141(P, class04909.Wf)), Pair.of(1, new class02152<>(P, 5, 5, 3.5714288F, var0x -> var0x.d() ? class04909.Wa : class04909.WJ))
         ),
         ImmutableSet.of(
            Pair.of(class05378.a, class05367.field_18457),
            Pair.of(class05378.j, class05367.field_18457),
            Pair.of(class05378.m, class05367.field_18457),
            Pair.of(class05378.f, class05367.field_18457)
         )
      );
   }

   private static void y(class01289<class02148> var0) {
      var0.N(
         class05359.N,
         0,
         ImmutableList.of(
            new class05739(0.8F),
            new class02140(2.0F),
            new class05770(45, 90),
            new class05738(),
            new class05550(class05378.p),
            new class05550(class05378.f),
            new class05550(class05378.x)
         )
      );
   }

   public static class01289<?> N(class01289<class02148> var0) {
      y(var0);
      L(var0);
      u(var0);
      i(var0);
      var0.N(ImmutableSet.of(class05359.N));
      var0.y(class05359.y);
      var0.i();
      return var0;
   }

   public static void N(class02148 var0) {
      var0.method_18868().N(ImmutableList.of(class05359.b, class05359.T, class05359.y));
   }

   public static void N(class02148 var0, class06069 var1) {
      var0.method_18868().N(class05378.f, P.N(var1));
      var0.method_18868().N(class05378.x, s.N(var1));
   }
}
