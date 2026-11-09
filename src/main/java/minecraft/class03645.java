package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class class03645 {
   private static final float N = 1.0F;
   private static final float y = 2.25F;
   private static final float L = 1.75F;
   private static final float u = 2.5F;
   private static final int i = 4;
   private static final int R = 16;
   private static final int M = 6;
   private static final int B = 30;
   private static final int Z = 60;
   private static final int z = 600;
   private static final int U = 32;
   private static final int E = 20;

   private static void L(class01289<class03630> var0) {
      var0.N(
         class05359.y,
         ImmutableList.of(
            Pair.of(0, class01522.N(var0x -> true, 1.75F, true, 32)),
            Pair.of(1, new class03635(class03645::y, 2.25F, 20)),
            Pair.of(2, class03655.N(class03645::y, Predicate.not(class03645::L), 4, 16, 2.25F)),
            Pair.of(3, class04126.N(6.0F, class02135.y(30, 60))),
            Pair.of(4, new class05747(ImmutableList.of(Pair.of(class01520.y(1.0F), 2), Pair.of(class05771.N(1.0F, 3), 2), Pair.of(new class05782(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   private static boolean L(class07438 var0) {
      return var0.method_18868().N(class05378.H);
   }

   public class03645() {
      super();
   }

   private static Optional<class05779> u(class07438 var0) {
      return N(var0).map(var0x -> new class05751(var0x, true));
   }

   private static Optional<class05779> y(class07438 var0) {
      class01289<?> class01289 = var0.method_18868();
      Optional<class06289> optional = class01289.L(class05378.Nh);
      if (optional.isPresent()) {
         class06289 class06289 = optional.get();
         if (N(var0, class01289, class06289)) {
            return Optional.of(new class05744(class06289.y().method_10084()));
         }

         class01289.y(class05378.Nh);
      }

      return u(var0);
   }

   private static void y(class01289<class03630> var0) {
      var0.N(
         class05359.N,
         0,
         ImmutableList.of(
            new class05739(0.8F), new class02140(2.5F), new class05770(45, 90), new class05738(), new class05550(class05378.Nr), new class05550(class05378.yN)
         )
      );
   }

   public static Optional<class04770> N(class07438 var0) {
      class07299 class07299 = var0.method_73183();
      if (!class07299.method_8608() && class07299 instanceof class04782 class04782) {
         Optional<UUID> optional = var0.method_18868().L(class05378.ND);
         if (optional.isPresent()) {
            if (class04782.method_66347(optional.get()) instanceof class04770 class04770
               && (class04770.field_13974.u() || class04770.field_13974.i())
               && class04770.method_24516(var0, 64.0)) {
               return Optional.of(class04770);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   public static class01289<?> N(class01289<class03630> var0) {
      y(var0);
      L(var0);
      var0.N(ImmutableSet.of(class05359.N));
      var0.y(class05359.y);
      var0.i();
      return var0;
   }

   public static void N(class07438 var0, class07209 var1) {
      class01289<?> class01289 = var0.method_18868();
      class06289 class06289 = class06289.N(var0.method_73183().method_27983(), var1);
      Optional<class06289> optional = class01289.L(class05378.Nh);
      if (optional.isEmpty()) {
         class01289.N(class05378.Nh, class06289);
         class01289.N(class05378.Nr, 600);
      } else if (optional.get().equals(class06289)) {
         class01289.N(class05378.Nr, 600);
      }
   }

   private static boolean N(class07438 var0, class01289<?> var1, class06289 var2) {
      Optional<Integer> optional = var1.L(class05378.Nr);
      class07299 class07299 = var0.method_73183();
      return var2.N(class07299.method_27983(), var0.method_24515(), 1024) && class07299.method_8320(var2.y()).N(class00869.yR) && optional.isPresent();
   }

   public static void N(class03630 var0) {
      var0.method_18868().N(ImmutableList.of(class05359.y));
   }
}
