package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class class01514 {
   public static final int N = 8;
   public static final int y = 4;
   public static final class06581 L = class06570.TU;
   private static final int i = 16;
   private static final int R = 600;
   private static final int M = 119;
   private static final int B = 9;
   private static final int Z = 200;
   private static final int z = 200;
   private static final int U = 300;
   protected static final class02135 u = class01517.N(30, 120);
   private static final int E = 100;
   private static final int W = 400;
   private static final int m = 8;
   private static final class02135 P = class01517.N(10, 40);
   private static final class02135 s = class01517.N(10, 30);
   private static final class02135 T = class01517.N(5, 20);
   private static final int b = 20;
   private static final int j = 200;
   private static final int v = 12;
   private static final int n = 8;
   private static final int t = 14;
   private static final int G = 8;
   private static final int l = 5;
   private static final float d = 0.75F;
   private static final int w = 6;
   private static final class02135 k = class01517.N(5, 7);
   private static final class02135 Y = class01517.N(5, 7);
   private static final float Q = 0.1F;
   private static final float O = 1.0F;
   private static final float g = 1.0F;
   private static final float I = 0.8F;
   private static final float J = 1.0F;
   private static final float o = 1.0F;
   private static final float q = 0.6F;
   private static final float K = 0.6F;

   private static void L(class01289<class01489> var0) {
      var0.N(
         class05359.E,
         10,
         ImmutableList.of(
            u(),
            class05745.N(class01514::y, 14.0F),
            class01507.N((var0x, var1) -> var1.l(), class01514::y),
            class04137.N_44(var0x -> !var0x.W(), class01530.N(class05378.Nv, 2, 1.0F)),
            class04137.N_44(class01489::W, class01530.N(class05378.Nv, 4, 0.6F)),
            new class05747(
               ImmutableList.of(Pair.of(class05745.N(class07078.Nr, 8.0F), 1), Pair.of(class01520.N(0.6F, 2, 1), 1), Pair.of(new class05782(10, 20), 1))
            )
         ),
         class05378.Nv
      );
   }

   public static boolean L(class01238 var0) {
      return var0.method_18868().L(class05359.y);
   }

   protected static List<class01238> L(class01489 var0) {
      return var0.method_18868().L(class05378.Nw).orElse(ImmutableList.of());
   }

   private static void L(class01489 var0, class07438 var1) {
      var0.method_18868().y(class05378.NW);
      var0.method_18868().y(class05378.s);
      var0.method_18868().y(class05378.m);
      var0.method_18868().N(class05378.k, var1, T.N(var0.method_73183().field_9229));
      y((class01238)var0);
   }

   protected static void L(class04782 var0, class01238 var1, class07438 var2) {
      if (class05355.L(var0, var1, var2)) {
         var1.method_18868().y(class05378.I);
         var1.method_18868().N(class05378.NW, var2.method_5667(), 600L);
         if (var2.method_5864() == class07078.NP && var1.B()) {
            y(var1);
         }

         if (var2.method_5864() == class07078.Ly && var0.method_64395().N(class07305.NR)) {
            var1.method_18868().N(class05378.Nm, true, 600L);
         }
      }
   }

   private static class05747<class01489> L() {
      return new class05747<>(
         ImmutableList.of(
            Pair.of(class01520.N(0.6F), 2),
            Pair.of(class05750.N(class07078.Nr, 8, class05378.b, 0.6F, 2), 2),
            Pair.of(class04137.N_44(class01514::R, class05771.N(0.6F, 3)), 2),
            Pair.of(new class05782(30, 60), 1)
         )
      );
   }

   private static void L(class01489 var0, class06584 var1) {
      class06584 class06584 = var0.N(var1);
      y(var0, Collections.singletonList(class06584));
   }

   private static boolean L(class07438 var0) {
      return var0.method_24518(class06570.dw);
   }

   private static boolean L(class06584 var0) {
      return var0.N(class01226.NQ);
   }

   private static class04142<class07438> M() {
      return class01504.N(var1 -> var1.method_6109() && var0.N(var1.method_73183().field_9229), class05378.NG, class05378.v, s);
   }

   private static boolean M(class07438 var0) {
      return var0.method_18868().N(class05378.d);
   }

   private static boolean M(class01489 var0) {
      class01289<class01489> class01289 = var0.method_18868();
      if (class01289.N(class05378.NQ)) {
         class07438 class07438 = class01289.L(class05378.NQ).get();
         return var0.method_24516(class07438, 6.0);
      } else {
         return false;
      }
   }

   private static boolean P(class01489 var0) {
      return var0.method_18868().N(class05378.NJ);
   }

   private static boolean T(class01489 var0) {
      return var0.method_18868().N(class05378.No);
   }

   public class01514() {
      super();
   }

   private static boolean B(class01489 var0) {
      class01289<class01489> class01289 = var0.method_18868();
      return !class01289.N(class05378.k) ? false : class01289.L(class05378.k).get().method_24516(var0, 12.0);
   }

   private static void Z(class01489 var0) {
      var0.method_18868().y(class05378.m);
      var0.f().W();
   }

   private static void i(class01289<class01489> var0) {
      var0.N(class05359.m, 10, ImmutableList.of(class05773.y(class05378.k, 1.0F, 12, true), y(), L(), class01518.N(class01514::z, class05378.k)), class05378.k);
   }

   private static Optional<class07438> i(class01238 var0) {
      return class06293.N(var0, class05378.NW);
   }

   private static boolean i(class07438 var0) {
      return var0.method_18868().N(class05378.NI);
   }

   private static class04142<class01489> i() {
      return class01504.N(class01489::method_6109, class05378.c, class05378.k, Y);
   }

   private static boolean i(class01489 var0) {
      if (!var0.method_6109()) {
         return false;
      } else {
         class07049 class07049 = var0.method_5854();
         return class07049 instanceof class01489 && ((class01489)class07049).method_6109()
            || class07049 instanceof class06018 && ((class06018)class07049).method_6109();
      }
   }

   private static void i(class04782 var0, class01238 var1, class07438 var2) {
      Optional<class07438> optional = i(var1);
      class07438 class07438 = class06293.N(var1, optional, var2);
      if (!optional.isPresent() || optional.get() != class07438) {
         L(var0, var1, class07438);
      }
   }

   private static boolean b(class01489 var0) {
      return var0.method_18868().N(class05378.Nb);
   }

   private static boolean s(class01489 var0) {
      return var0.method_18868().N(class05378.NP);
   }

   private static class06889 m(class01489 var0) {
      class06889 class06889 = class05456.N(var0, 4, 2);
      return class06889 == null ? var0.method_73189() : class06889;
   }

   private static boolean v(class01489 var0) {
      return var0.method_6079().R() || !N(var0.method_6079());
   }

   private static boolean j(class01489 var0) {
      return !var0.method_6079().R();
   }

   private static boolean U(class01489 var0) {
      return !E(var0);
   }

   private static boolean z(class01489 var0) {
      class01289<class01489> class01289 = var0.method_18868();
      if (!class01289.N(class05378.k)) {
         return true;
      } else {
         class07438 class07438 = class01289.L(class05378.k).get();
         class07078<?> class07078 = class07438.method_5864();
         if (class07078 == class07078.NP) {
            return U(var0);
         } else {
            return N(class07078) ? !class01289.y(class05378.NQ, class07438) : false;
         }
      }
   }

   private static class04142<class07475> u() {
      return class05773.N(class05378.No, 1.0F, 8, false);
   }

   public static Optional<class07438> u(class01489 var0) {
      return var0.method_18868().N(class05378.k) ? var0.method_18868().L(class05378.k) : Optional.empty();
   }

   private static List<class01238> u(class01238 var0) {
      return var0.method_18868().L(class05378.Nd).orElse(ImmutableList.of());
   }

   private static void u(class07438 var0) {
      var0.method_18868().N(class05378.NP, true, 119L);
   }

   private static void u(class04782 var0, class01238 var1, class07438 var2) {
      Optional<class08036> optional = N(var1);
      if (optional.isPresent()) {
         L(var0, var1, optional.get());
      } else {
         L(var0, var1, var2);
      }
   }

   private static void u(class01289<class01489> var0) {
      var0.N(class05359.W, 10, ImmutableList.of(class01522.N(class01514::v, 1.0F, true, 9), class01493.N(9), class01004.N(200, 200)), class05378.NP);
   }

   protected static void y(class04782 var0, class01238 var1, class07438 var2) {
      u(var1).forEach(var2x -> {
         if (var2.method_5864() != class07078.NP || var2x.B() && ((class06018)var2).n()) {
            i(var0, var2x, var2);
         }
      });
   }

   private static void y(class01489 var0, class01289<class01489> var1) {
      var1.N(
         class05359.U,
         10,
         ImmutableList.of(
            class01523.N((var1x, var2) -> !y(var1x, var0, var2)),
            class04137.N_44(class01514::L, class01508.N(5, 0.75F)),
            class01531.N(1.0F),
            new class06545(1.0, 10.0F),
            new class06542(1.0, 1.0, 10.0F, 2.0F),
            new class06547(1.0),
            class01528.N(20),
            new class01527(),
            class01512.N(),
            class01518.N(class01514::M, class05378.s)
         ),
         class05378.s
      );
   }

   protected static void y(class01238 var0) {
      var0.method_18868().N(class05378.Nj, true, u.N(var0.method_73183().field_9229));
   }

   private static void y(class01489 var0, class07438 var1) {
      class01289<class01489> class01289 = var0.method_18868();
      class07438 class07438 = class06293.N(var0, class01289.L(class05378.k), var1);
      class07438 = class06293.N(var0, class01289.L(class05378.s), class07438);
      L(var0, class07438);
   }

   private static boolean y(class06584 var0) {
      return var0.N(L);
   }

   private static void y(class01289<class01489> var0) {
      var0.N(
         class05359.y,
         10,
         ImmutableList.of(
            class05745.N(class01514::y, 14.0F),
            class01507.N((var0x, var1) -> var1.l(), class01514::y),
            class04137.N_44(class01489::B, class01492.N()),
            u(),
            M(),
            y(),
            L(),
            class05778.N(class07078.Ly, 4)
         )
      );
   }

   public static boolean y(class07438 var0) {
      return var0.method_5864() == class07078.Ly && var0.method_24520(class01514::N);
   }

   private static Optional<? extends class07438> y(class04782 var0, class01489 var1) {
      class01289<class01489> class01289 = var1.method_18868();
      if (M(var1)) {
         return Optional.empty();
      } else {
         Optional<class07438> optional = class06293.N(var1, class05378.NW);
         if (optional.isPresent() && class05355.L(var0, var1, optional.get())) {
            return optional;
         } else {
            if (class01289.N(class05378.Nm)) {
               Optional optional1 = class01289.L(class05378.E);
               if (optional1.isPresent()) {
                  return optional1;
               }
            }

            Optional optional3 = class01289.L(class05378.c);
            if (optional3.isPresent()) {
               return optional3;
            } else {
               Optional<class08036> optional2 = class01289.L(class05378.Nl);
               return optional2.isPresent() && class05355.y(var0, var1, optional2.get()) ? optional2 : Optional.empty();
            }
         }
      }
   }

   private static void y(class01489 var0, List<class06584> var1) {
      N(var0, var1, m(var0));
   }

   public static boolean y(class01489 var0, class06584 var1) {
      return !b(var0) && !s(var0) && var0.l() && y(var1);
   }

   private static boolean y(class04782 var0, class01489 var1, class07438 var2) {
      return y(var0, var1).filter(var1x -> var1x == var2).isPresent();
   }

   public static Optional<class04891> y(class01489 var0) {
      return var0.method_18868().R().map(var1 -> N(var0, var1));
   }

   private static class05747<class07438> y() {
      return new class05747<>(ImmutableList.builder().addAll(N()).add(Pair.of(new class05782(30, 60), 1)).build());
   }

   private static boolean E(class01489 var0) {
      int ix = var0.method_18868().L(class05378.NO).orElse(0) + 1;
      return var0.method_18868().L(class05378.Ng).orElse(0) > ix;
   }

   public static void N(class01489 var0, class06069 var1) {
      int ix = u.N(var1);
      var0.method_18868().N(class05378.Nj, true, ix);
   }

   private static void N(class01489 var0, class08036 var1, List<class06584> var2) {
      N(var0, var2, var1.method_73189());
   }

   public static boolean N(class07078<?> var0) {
      return var0 == class07078.LN || var0 == class07078.yS;
   }

   private static void N(class01489 var0, List<class06584> var1, class06889 var2) {
      if (!var1.isEmpty()) {
         var0.method_6104(class07050.field_5810);

         for (class06584 class06584 : var1) {
            class06293.N(var0, class06584, var2.y(0.0, 1.0, 0.0));
         }
      }
   }

   private static void N(class01489 var0, List<class06584> var1) {
      Optional<class08036> optional = var0.method_18868().L(class05378.U);
      if (optional.isPresent()) {
         N(var0, optional.get(), var1);
      } else {
         y(var0, var1);
      }
   }

   public static void N(class04782 var0, class01489 var1) {
      if (s(var1) && !var1.method_6079().R()) {
         var1.method_5775(var0, var1.method_6079());
         var1.method_6122(class07050.field_5810, class06584.E);
      }
   }

   protected static void N(class04782 var0, class01489 var1, boolean var2) {
      class06584 class06584x = var1.method_5998(class07050.field_5810);
      var1.method_6122(class07050.field_5810, class06584.E);
      if (var1.l()) {
         boolean flag = y(class06584x);
         if (var2 && flag) {
            N(var1, R(var1));
         } else if (!flag) {
            boolean flag1 = !var1.N_16(var0, class06584x).R();
            if (!flag1) {
               L(var1, class06584x);
            }
         }
      } else {
         boolean flag2 = !var1.N_16(var0, class06584x).R();
         if (!flag2) {
            class06584 class06584x = var1.method_6047();
            if (N(class06584x)) {
               L(var1, class06584x);
            } else {
               N(var1, Collections.singletonList(class06584x));
            }

            var1.R(class06584x);
         }
      }
   }

   private static class06584 N(class00717 var0) {
      class06584 class06584x = var0.N();
      class06584 class06584x = class06584x.N(1);
      if (class06584x.R()) {
         var0.method_31472();
      } else {
         var0.N(class06584x);
      }

      return class06584x;
   }

   public static class01289<?> N(class01489 var0, class01289<class01489> var1) {
      N(var1);
      y(var1);
      u(var1);
      y(var0, var1);
      L(var1);
      i(var1);
      R(var1);
      var1.N(ImmutableSet.of(class05359.N));
      var1.y(class05359.y);
      var1.i();
      return var1;
   }

   private static void N(class04782 var0, class01489 var1, class06584 var2) {
      if (j(var1)) {
         var1.method_5775(var0, var1.method_5998(class07050.field_5810));
      }

      var1.M(var2);
   }

   public static void N(class01489 var0) {
      class01289<class01489> class01289 = var0.method_18868();
      class05359 class05359x = class01289.R().orElse(null);
      class01289.N(ImmutableList.of(class05359.W, class05359.U, class05359.m, class05359.E, class05359.P, class05359.y));
      class05359 class05359x = class01289.R().orElse(null);
      if (class05359x != class05359x) {
         y(var0).ifPresent(var0::method_56078);
      }

      var0.R(class01289.N(class05378.s));
      if (!class01289.N(class05378.v) && i(var0)) {
         var0.method_5848();
      }

      if (!class01289.N(class05378.Nv)) {
         class01289.y(class05378.Nn);
      }

      var0.M(class01289.N(class05378.Nn));
   }

   public static boolean N(class07438 var0) {
      for (class07085 class07085 : class02834.field_49224) {
         if (var0.method_6118(class07085).N(class01226.NG)) {
            return true;
         }
      }

      return false;
   }

   protected static void N(class04782 var0, class01238 var1) {
      u(var1).forEach(var1x -> N(var1x).ifPresent(var2 -> L(var0, var1x, var2)));
   }

   public static class07082 N(class04782 var0, class01489 var1, class08036 var2, class07050 var3) {
      class06584 class06584x = var2.method_5998(var3);
      if (y(var1, class06584x)) {
         class06584 class06584x = class06584x.y(1, var2);
         N(var0, var1, class06584x);
         u((class07438)var1);
         Z(var1);
         return class07082.N;
      } else {
         return class07082.i;
      }
   }

   private static class04891 N(class01489 var0, class05359 var1) {
      if (var1 == class05359.U) {
         return class04909.Gv;
      } else if (var0.G()) {
         return class04909.Gd;
      } else if (var1 == class05359.m && B(var0)) {
         return class04909.Gd;
      } else if (var1 == class05359.W) {
         return class04909.Gb;
      } else if (var1 == class05359.E) {
         return class04909.Gn;
      } else if (i((class07438)var0)) {
         return class04909.GG;
      } else {
         return T(var0) ? class04909.Gd : class04909.Gj;
      }
   }

   private static ImmutableList<Pair<class04119<class07438>, Integer>> N() {
      return ImmutableList.of(Pair.of(class05745.N(class07078.Ly, 8.0F), 1), Pair.of(class05745.N(class07078.Nr, 8.0F), 1), Pair.of(class05745.N(8.0F), 1));
   }

   public static Optional<class08036> N(class01238 var0) {
      return var0.method_18868().N(class05378.E) ? var0.method_18868().L(class05378.E) : Optional.empty();
   }

   private static void N(class01489 var0, class07438 var1) {
      L(var0).stream().filter(var0x -> var0x instanceof class01489).forEach(var1x -> y((class01489)var1x, var1));
   }

   protected static void N(class04782 var0, class01238 var1, class07438 var2) {
      if (!var1.method_18868().L(class05359.m)) {
         if (class05355.L(var0, var1, var2)) {
            if (!class06293.N(var1, var2, 4.0)) {
               if (var2.method_5864() == class07078.Ly && var0.method_64395().N(class07305.NR)) {
                  u(var0, var1, var2);
                  N(var0, var1);
               } else {
                  L(var0, var1, var2);
                  y(var0, var1, var2);
               }
            }
         }
      }
   }

   public static void N(class04782 var0, class01489 var1, class07438 var2) {
      if (!(var2 instanceof class01489)) {
         if (j(var1)) {
            N(var0, var1, false);
         }

         class01289<class01489> class01289 = var1.method_18868();
         class01289.y(class05378.Nv);
         class01289.y(class05378.Nn);
         class01289.y(class05378.NP);
         if (var2 instanceof class08036) {
            class01289.N(class05378.Nb, true, 400L);
         }

         u(var1).ifPresent(var2x -> {
            if (var2x.method_5864() != var2.method_5864()) {
               class01289.y(class05378.k);
            }
         });
         if (var1.method_6109()) {
            class01289.N(class05378.k, var2, 100L);
            if (class05355.L(var0, var1, var2)) {
               y(var0, (class01238)var1, var2);
            }
         } else if (var2.method_5864() == class07078.NP && E(var1)) {
            L(var1, var2);
            N(var1, var2);
         } else {
            N(var0, (class01238)var1, var2);
         }
      }
   }

   private static void N(class01289<class01489> var0) {
      var0.N(
         class05359.N,
         0,
         ImmutableList.of(
            new class05770(45, 90),
            new class05738(),
            class05758.N(),
            i(),
            R(),
            class01513.N(),
            class01519.N(119),
            class01515.N(300, class01514::N),
            class01505.N()
         )
      );
   }

   private static boolean N(class07438 var0, class07438 var1) {
      return var1.method_5864() != class07078.NP ? false : class06069.y(var0.method_73183().N()).z() < 0.1F;
   }

   public static void N(class04782 var0, class01489 var1, class00717 var2) {
      Z(var1);
      class06584 class06584;
      if (var2.N().N(class06570.nW)) {
         var1.method_6103(var2, var2.N().c());
         class06584 = var2.N();
         var2.method_31472();
      } else {
         var1.method_6103(var2, 1);
         class06584 = N(var2);
      }

      if (N(class06584)) {
         var1.method_18868().y(class05378.Ns);
         N(var0, var1, class06584);
         u((class07438)var1);
      } else if (L(class06584) && !P(var1)) {
         W(var1);
      } else if (var1.N_16(var0, class06584).equals(class06584.E)) {
         L(var1, class06584);
      }
   }

   public static void N(class04782 var0, class08036 var1, boolean var2) {
      var1.method_73183()
         .N(class01489.class, var1.method_5829().M(16.0))
         .stream()
         .filter(class01514::L)
         .filter(var2x -> !var2 || class06293.y(var2x, var1))
         .forEach(var2x -> {
            if (var0.method_64395().N(class07305.NR)) {
               u(var0, var2x, var1);
            } else {
               L(var0, var2x, var1);
            }
         });
   }

   public static boolean N(class01489 var0, class06584 var1) {
      if (var0.method_6109() && var1.N(class01226.Nt)) {
         return false;
      } else if (var1.N(class01226.Nv)) {
         return false;
      } else if (b(var0) && var0.method_18868().N(class05378.s)) {
         return false;
      } else if (y(var1)) {
         return v(var0);
      } else {
         boolean flag = var0.i(var1);
         if (var1.N(class06570.nW)) {
            return flag;
         } else if (L(var1)) {
            return !P(var0) && flag;
         } else {
            return !N(var1) ? var0.B(var1) : v(var0) && flag;
         }
      }
   }

   public static boolean N(class06584 var0) {
      return var0.N(class01226.Nn);
   }

   private static boolean N(class01489 var0, class07049 var1) {
      return !(var1 instanceof class07079 class07079)
         ? false
         : !class07079.method_6109()
            || !class07079.method_5805()
            || M((class07438)var0)
            || M(class07079)
            || class07079 instanceof class01489 && class07079.method_5854() == null;
   }

   private static void W(class01489 var0) {
      var0.method_18868().N(class05378.NJ, true, 200L);
   }

   private static boolean R(class07438 var0) {
      return !i(var0);
   }

   private static class04142<class01489> R() {
      return class01504.N(class01514::M, class05378.NQ, class05378.k, k);
   }

   private static List<class06584> R(class01489 var0) {
      return var0.method_73183().method_8503().yd().N(class06273.Na).N(new class04160((class04782)var0.method_73183()).N(class06551.N, var0).N(class06925.E));
   }

   private static void R(class01289<class01489> var0) {
      var0.N(
         class05359.P,
         10,
         ImmutableList.of(
            class01490.N(0.8F),
            class05745.N(class01514::y, 8.0F),
            class04137.N(
               class04137.N_43(class07049::method_5765),
               class04145.N(ImmutableList.builder().addAll(N()).add(Pair.of(class04137.N_43(var0x -> true), 1)).build())
            ),
            class01510.N(8, class01514::N)
         ),
         class05378.v
      );
   }
}
