package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class class04058 {
   private static final float N = 2.0F;
   private static final float y = 1.0F;
   private static final float L = 1.0F;
   private static final float u = 0.75F;
   private static final class02135 i = class02135.y(100, 140);
   private static final int R = 2;
   private static final int M = 4;
   private static final float B = 3.5714288F;
   private static final float Z = 1.25F;

   private static void L(class01289<class04067> var0) {
      var0.N(
         class05359.y,
         ImmutableList.of(
            Pair.of(0, class04126.N(class07078.Ly, 6.0F, class02135.y(30, 60))),
            Pair.of(0, new class01485(class07078.NR)),
            Pair.of(1, new class05585(var0x -> 1.25F)),
            Pair.of(2, class01507.N((var0x, var1) -> y(var1), (var0x, var1) -> var1.method_18868().L(class05378.Q))),
            Pair.of(3, class04397.N(6, 1.0F)),
            Pair.of(
               4,
               new class05747(
                  ImmutableMap.of(class05378.m, class05367.field_18457),
                  ImmutableList.of(
                     Pair.of(class01520.N(1.0F), 1),
                     Pair.of(class05771.N(1.0F, 3), 1),
                     Pair.of(new class04411(), 3),
                     Pair.of(class04137.N_43(class07049::method_24828), 2)
                  )
               )
            )
         ),
         ImmutableSet.of(Pair.of(class05378.C, class05367.field_18457), Pair.of(class05378.h, class05367.field_18457))
      );
   }

   private static void M(class01289<class04067> var0) {
      var0.N(class05359.j, 0, ImmutableList.of(class01523.N(), new class04079(class04909.EJ, class04909.EY)), class05378.s);
   }

   public class04058() {
      super();
   }

   private static void i(class01289<class04067> var0) {
      var0.N(
         class05359.n,
         ImmutableList.of(
            Pair.of(0, class04126.N(class07078.Ly, 6.0F, class02135.y(30, 60))),
            Pair.of(1, class01507.N((var0x, var1) -> y(var1), (var0x, var1) -> var1.method_18868().L(class05378.Q))),
            Pair.of(2, class04424.N(8, 1.0F)),
            Pair.of(3, class04432.N(class00869.nH)),
            Pair.of(
               4,
               new class05747(
                  ImmutableList.of(
                     Pair.of(class01520.N(1.0F), 2),
                     Pair.of(class05771.N(1.0F, 3), 1),
                     Pair.of(new class04411(), 2),
                     Pair.of(class04137.N_43(class07049::method_24828), 1)
                  )
               )
            )
         ),
         ImmutableSet.of(Pair.of(class05378.C, class05367.field_18457), Pair.of(class05378.r, class05367.field_18456))
      );
   }

   private static void u(class01289<class04067> var0) {
      var0.N(
         class05359.v,
         ImmutableList.of(
            Pair.of(0, class04126.N(class07078.Ly, 6.0F, class02135.y(30, 60))),
            Pair.of(1, new class05585(var0x -> 1.25F)),
            Pair.of(2, class01507.N((var0x, var1) -> y(var1), (var0x, var1) -> var1.method_18868().L(class05378.Q))),
            Pair.of(3, class04397.N(8, 1.5F)),
            Pair.of(
               5,
               new class05736(
                  ImmutableMap.of(class05378.m, class05367.field_18457),
                  ImmutableSet.of(),
                  class05753.field_18348,
                  class05769.field_18856,
                  ImmutableList.of(
                     Pair.of(class01520.L(0.75F), 1),
                     Pair.of(class01520.N(1.0F, true), 1),
                     Pair.of(class05771.N(1.0F, 3), 1),
                     Pair.of(class04137.N_43(class07049::method_5799), 5)
                  )
               )
            )
         ),
         ImmutableSet.of(Pair.of(class05378.C, class05367.field_18457), Pair.of(class05378.h, class05367.field_18456))
      );
   }

   private static void y(class01289<class04067> var0) {
      var0.N(
         class05359.N,
         0,
         ImmutableList.of(new class02140(2.0F), new class05770(45, 90), new class05738(), new class05550(class05378.p), new class05550(class05378.f))
      );
   }

   private static boolean y(class04067 var0) {
      return !class06293.N(var0);
   }

   public static Predicate<class06584> N() {
      return var0 -> var0.N(class01226.Nf);
   }

   public static void N(class04067 var0, class06069 var1) {
      var0.method_18868().N(class05378.f, i.N(var1));
   }

   private static <E extends class07079> boolean N(E var0, class07209 var1) {
      class07299 class07299 = var0.method_73183();
      class07209 class07209 = var1.method_10074();
      if (class07299.method_8316(var1).W() && class07299.method_8316(class07209).W() && class07299.method_8316(var1.method_10084()).W()) {
         class00500 class00500x = class07299.method_8320(var1);
         class00500 class00500x = class07299.method_8320(class07209);
         if (!class00500x.N(class01210.LM) && !class00500x.N(class01210.LM)) {
            class02682 class02682 = new class02682(var0.method_73183(), var0);
            class04425 class04425x = class07955.N(class02682, var1.method_25503());
            class04425 class04425x = class07955.N(class02682, class07209.method_25503());
            return class04425x != class04425.field_19 && (!class00500x.P() || class04425x != class04425.field_19) ? class02152.N(var0, var1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   public static void N(class04067 var0) {
      var0.method_18868().N(ImmutableList.of(class05359.j, class05359.n, class05359.T, class05359.v, class05359.y));
   }

   public static class01289<?> N(class01289<class04067> var0) {
      y(var0);
      L(var0);
      u(var0);
      i(var0);
      M(var0);
      R(var0);
      var0.N(ImmutableSet.of(class05359.N));
      var0.y(class05359.y);
      var0.i();
      return var0;
   }

   private static void R(class01289<class04067> var0) {
      var0.N(
         class05359.T,
         ImmutableList.of(
            Pair.of(0, new class02141(i, class04909.EI)),
            Pair.of(1, new class04437<>(i, 2, 4, 3.5714288F, var0x -> class04909.Eg, class01210.LM, 0.5F, class04058::N))
         ),
         ImmutableSet.of(
            Pair.of(class05378.a, class05367.field_18457),
            Pair.of(class05378.j, class05367.field_18457),
            Pair.of(class05378.f, class05367.field_18457),
            Pair.of(class05378.h, class05367.field_18457)
         )
      );
   }
}
