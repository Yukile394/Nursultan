package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class class01030 {
   private static final int N = 600;
   private static final int y = 20;
   private static final double L = 0.0125;
   private static final int u = 8;
   private static final int i = 8;
   private static final float R = 0.6F;
   private static final int M = 2;
   private static final int B = 100;
   private static final int Z = 5;

   private static void L(class01266 var0, class01289<class01266> var1) {
      var1.N(class05359.y, 10, ImmutableList.of(class01507.N(class01030::N), N(), y(), class05778.N(class07078.Ly, 4)));
   }

   public static void L(class01266 var0) {
      if (var0.method_73183().field_9229.z() < 0.0125) {
         u(var0);
      }
   }

   public class01030() {
      super();
   }

   private static void u(class01266 var0, class01289<class01266> var1) {
      var1.N(
         class05359.U,
         10,
         ImmutableList.of(class01523.N((var1x, var2) -> !N(var1x, (class01238)var0, var2)), class01531.N(1.0F), class01528.N(20)),
         class05378.s
      );
   }

   private static void u(class01266 var0) {
      var0.method_18868().R().ifPresent(var1 -> {
         if (var1 == class05359.U) {
            var0.W();
         }
      });
   }

   public static void y(class01266 var0) {
      class01289<class01266> class01289 = var0.method_18868();
      class05359 class05359x = class01289.R().orElse(null);
      class01289.N(ImmutableList.of(class05359.U, class05359.y));
      class05359 class05359x = class01289.R().orElse(null);
      if (class05359x != class05359x) {
         u(var0);
      }

      var0.R(class01289.N(class05378.s));
   }

   private static class05747<class01266> y() {
      return new class05747<>(
         ImmutableList.of(
            Pair.of(class01520.N(0.6F), 2),
            Pair.of(class05750.N(class07078.Nr, 8, class05378.b, 0.6F, 2), 2),
            Pair.of(class05750.N(class07078.yN, 8, class05378.b, 0.6F, 2), 2),
            Pair.of(class06300.N(class05378.y, 0.6F, 2, 100), 2),
            Pair.of(class05767.N(class05378.y, 0.6F, 5), 2),
            Pair.of(new class05782(30, 60), 1)
         )
      );
   }

   private static void y(class01266 var0, class01289<class01266> var1) {
      var1.N(class05359.N, 0, ImmutableList.of(new class05770(45, 90), new class05738(), class05758.N(), class01505.N()));
   }

   protected static void N(class01266 var0, class07438 var1) {
      var0.method_18868().y(class05378.I);
      var0.method_18868().N(class05378.NW, var1.method_5667(), 600L);
   }

   public static class01289<?> N(class01266 var0, class01289<class01266> var1) {
      y(var0, var1);
      L(var0, var1);
      u(var0, var1);
      var1.N(ImmutableSet.of(class05359.N));
      var1.y(class05359.y);
      var1.i();
      return var1;
   }

   public static void N(class01266 var0) {
      class06289 class06289 = class06289.N(var0.method_73183().method_27983(), var0.method_24515());
      var0.method_18868().N(class05378.y, class06289);
   }

   private static class05747<class01266> N() {
      return new class05747<>(
         ImmutableList.of(
            Pair.of(class05745.N(class07078.Ly, 8.0F), 1),
            Pair.of(class05745.N(class07078.Nr, 8.0F), 1),
            Pair.of(class05745.N(class07078.yN, 8.0F), 1),
            Pair.of(class05745.N(8.0F), 1),
            Pair.of(new class05782(30, 60), 1)
         )
      );
   }

   private static boolean N(class04782 var0, class01238 var1, class07438 var2) {
      return N(var0, var1).filter(var1x -> var1x == var2).isPresent();
   }

   private static Optional<? extends class07438> N(class04782 var0, class01238 var1) {
      Optional<class07438> optional = class06293.N(var1, class05378.NW);
      if (optional.isPresent() && class05355.L(var0, var1, optional.get())) {
         return optional;
      } else {
         Optional<class08036> optional1 = var1.method_18868().L(class05378.E);
         return optional1.isPresent() ? optional1 : var1.method_18868().L(class05378.c);
      }
   }

   public static void N(class04782 var0, class01266 var1, class07438 var2) {
      if (!(var2 instanceof class01238)) {
         class01514.N(var0, var1, var2);
      }
   }
}
