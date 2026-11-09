package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;

public class class03984 {
   private static final float u = 0.5F;
   private static final float i = 0.7F;
   private static final float R = 1.2F;
   private static final int M = 18;
   private static final int B = class04995.u(100.0F);
   public static final int N = class04995.u(133.59999F);
   public static final int y = class04995.u(84.0F);
   private static final int Z = class04995.u(83.2F);
   public static final int L = 1200;
   private static final int z = 100;
   private static final List<class05340<? extends class05355<? super class04003>>> U = List.of(class05340.u, class05340.G);
   private static final List<class05378<?>> E = List.of(
      class05378.M,
      class05378.B,
      class05378.U,
      class05378.E,
      class05378.c,
      class05378.P,
      class05378.m,
      class05378.I,
      class05378.n,
      class05378.s,
      class05378.T,
      class05378.Q,
      class05378.NK,
      class05378.NV,
      class05378.Ne,
      class05378.NH,
      class05378.Nc,
      class05378.NX,
      class05378.Na,
      class05378.Np,
      class05378.NF,
      class05378.NA,
      class05378.Nf,
      class05378.NC,
      class05378.NS,
      class05378.Nx
   );
   private static final class04142<class04003> W = class04137.N_42(var0 -> var0.group(var0.N(class05378.Na)).apply(var0, var1 -> (var2, var3, var4) -> {
      if (var0.N(var1).isPresent()) {
         var1.N(class06244.field_17274, 1200L);
      }

      return true;
   }));

   private static void L(class01289<class04003> var0) {
      var0.N(
         class05359.w,
         ImmutableList.of(Pair.of(0, new class03957()), Pair.of(1, new class03993(B))),
         ImmutableSet.of(Pair.of(class05378.NK, class05367.field_18457), Pair.of(class05378.Na, class05367.field_18457))
      );
   }

   private static void M(class01289<class04003> var0) {
      var0.N(class05359.l, 10, ImmutableList.of(new class04012()), class05378.NK);
   }

   public class03984() {
      super();
   }

   private static void i(class01289<class04003> var0) {
      var0.N(class05359.G, 5, ImmutableList.of(class04005.N(class04003::m), class01530.N(class05378.NV, 2, 0.7F)), class05378.NV);
   }

   private static void u(class01289<class04003> var0) {
      var0.N(
         class05359.y,
         10,
         ImmutableList.of(
            class04005.N(class04003::m),
            class03974.N(),
            new class05747(
               ImmutableMap.of(class05378.NH, class05367.field_18457), ImmutableList.of(Pair.of(class01520.N(0.5F), 2), Pair.of(new class05782(30, 60), 1))
            )
         )
      );
   }

   private static void y(class01289<class04003> var0) {
      var0.N(class05359.d, 5, ImmutableList.of(new class03990(N)), class05378.Nc);
   }

   public static void N(class04003 var0, class07209 var1) {
      if (var0.method_73183().method_8621().N(var1) && !var0.m().isPresent() && !var0.method_18868().L(class05378.s).isPresent()) {
         N((class07438)var0);
         var0.method_18868().N(class05378.NF, class06244.field_17274, 100L);
         var0.method_18868().N(class05378.P, new class05744(var1), 100L);
         var0.method_18868().N(class05378.NV, var1, 100L);
         var0.method_18868().y(class05378.m);
      }
   }

   private static boolean N(class04003 var0, class07438 var1) {
      return var0.method_18868().L(class05378.s).filter(var1x -> var1x == var1).isPresent();
   }

   private static void N(class01289<class04003> var0) {
      var0.N(class05359.N, 0, ImmutableList.of(new class05739(0.8F), class04010.N(), new class05770(45, 90), new class05738()));
   }

   public static class01289<?> N(class04003 var0, Dynamic<?> var1) {
      class01289 class01289 = class01289.N(E, U).N(var1);
      N(class01289);
      y(class01289);
      L(class01289);
      u(class01289);
      M(class01289);
      N(var0, class01289);
      i(class01289);
      R(class01289);
      class01289.N(ImmutableSet.of(class05359.N));
      class01289.y(class05359.y);
      class01289.i();
      return class01289;
   }

   private static void N(class04003 var0, class01289<class04003> var1) {
      var1.N(
         class05359.U,
         10,
         ImmutableList.of(
            W,
            class01523.N((var1x, var2) -> !var0.W().u() || !var0.L(var2), class03984::N, false),
            class05745.N(var1x -> N(var0, var1x), (float)var0.method_45325(class05298.P)),
            class01531.N(1.2F),
            new class03616(),
            class01528.N(18)
         ),
         class05378.s
      );
   }

   public static void N(class07438 var0) {
      if (var0.method_18868().N(class05378.Na)) {
         var0.method_18868().N(class05378.Na, class06244.field_17274, 1200L);
      }
   }

   private static void N(class04782 var0, class04003 var1, class07438 var2) {
      if (!var1.L(var2)) {
         var1.u(var2);
      }

      N((class07438)var1);
   }

   public static void N(class04003 var0) {
      var0.method_18868().N(ImmutableList.of(class05359.d, class05359.w, class05359.l, class05359.U, class05359.G, class05359.t, class05359.y));
   }

   private static void R(class01289<class04003> var0) {
      var0.N(class05359.t, 5, ImmutableList.of(class04005.N(class04003::m), new class04004(Z)), class05378.NH);
   }
}
