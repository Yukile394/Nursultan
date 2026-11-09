package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;

public class class01984 {
   private static final Logger L = LogUtils.getLogger();
   private static final int u = 6;
   static final List<class05340<? extends class05355<? super class01964>>> N = ImmutableList.of(class05340.L, class05340.R, class05340.u, class05340.b);
   static final List<class05378<?>> y = ImmutableList.of(
      class05378.P,
      class05378.m,
      class05378.I,
      class05378.n,
      class05378.NN,
      class05378.yL,
      class05378.yu,
      class05378.yi,
      class05378.NF,
      class05378.yy,
      class05378.B,
      class05378.j,
      new class05378[]{class05378.a, class05378.p, class05378.A}
   );
   private static final int i = 9600;
   private static final float R = 1.0F;
   private static final float M = 2.0F;
   private static final float B = 1.25F;
   private static final float Z = 1.25F;

   private static void L(class01289<class01964> var0) {
      var0.N(
         class05359.t,
         ImmutableList.of(Pair.of(0, new class01961())),
         Set.of(Pair.of(class05378.NN, class05367.field_18457), Pair.of(class05378.yL, class05367.field_18456), Pair.of(class05378.m, class05367.field_18456))
      );
   }

   public class01984() {
      super();
   }

   private static void i(class01289<class01964> var0) {
      var0.N(
         class05359.y,
         ImmutableList.of(
            Pair.of(0, new class01982(class07078.yb)),
            Pair.of(1, new class01943(var0x -> 1.25F, var0x -> var0x.method_6109() ? 2.5 : 3.5)),
            Pair.of(2, new class05770(45, 90)),
            Pair.of(3, new class01966(40, 100)),
            Pair.of(
               4,
               new class05747(
                  ImmutableList.of(
                     Pair.of(class05771.N(1.0F, 3), 2),
                     Pair.of(new class01973(40, 80), 1),
                     Pair.of(new class01953(40, 80), 1),
                     Pair.of(class05745.N(class07078.Ly, 6.0F), 1),
                     Pair.of(class01520.N(1.0F), 1),
                     Pair.of(new class05782(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(class05378.yu, class05367.field_18457))
      );
   }

   private static void u(class01289<class01964> var0) {
      var0.N(
         class05359.w,
         ImmutableList.of(Pair.of(0, new class01974(160, 180)), Pair.of(0, new class01985(40))),
         Set.of(Pair.of(class05378.NN, class05367.field_18457), Pair.of(class05378.m, class05367.field_18457), Pair.of(class05378.yu, class05367.field_18456))
      );
   }

   static void y(class01964 var0) {
      var0.method_18868().N(ImmutableList.of(class05359.w, class05359.t, class05359.y));
   }

   private static void y(class01289<class01964> var0) {
      var0.N(class05359.N, 0, ImmutableList.of(new class05739(0.8F), new class01976(2.0F), new class05738(500, 700), new class05550(class05378.p)));
   }

   public static class01289<?> N(class01289<class01964> var0) {
      y(var0);
      i(var0);
      L(var0);
      u(var0);
      var0.N(Set.of(class05359.N));
      var0.y(class05359.y);
      var0.i();
      return var0;
   }

   static class01964 N(class01964 var0) {
      var0.method_18868().y(class05378.yu);
      var0.method_18868().y(class05378.yL);
      return var0.N(class01972.field_42665);
   }
}
