package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class class08988 {
   private static final float N = 1.5F;
   private static final float y = 1.0F;
   private static final int L = 32;
   private static final int u = 8;
   private static final int i = 1;
   private static final int R = 9;
   private static final Predicate<class00500> M = var0 -> var0.N(class01210.NZ);
   private static final Predicate<class00500> B = var0 -> var0.N(class00869.LA) || var0.N(class00869.BH);
   private static final ImmutableList<class05340<? extends class05355<? super class08982>>> Z = ImmutableList.of(class05340.L, class05340.R);
   private static final ImmutableList<class05378<?>> z = ImmutableList.of(
      class05378.NN,
      class05378.d,
      class05378.w,
      class05378.M,
      class05378.B,
      class05378.m,
      class05378.P,
      class05378.I,
      class05378.n,
      class05378.F,
      class05378.Ni,
      class05378.NL,
      new class05378[]{class05378.Nu, class05378.G}
   );

   private static Consumer<class07475> L() {
      return var0 -> {
         if (var0 instanceof class08982 class08982) {
            class08982.W();
            class08982.N(class08979.field_61292);
         }
      };
   }

   private static void L(class01289<class08982> var0) {
      var0.N(
         class05359.y,
         ImmutableList.of(
            Pair.of(0, new class08945(1.0F, M, B, 32, 8, y(), L(), u())),
            Pair.of(1, class04126.N(class07078.Ly, 6.0F, class02135.y(40, 80))),
            Pair.of(
               2,
               new class05747(
                  ImmutableMap.of(class05378.m, class05367.field_18457, class05378.Ni, class05367.field_18456),
                  ImmutableList.of(Pair.of(class01520.N(1.0F, 2, 2), 1), Pair.of(new class05782(30, 60), 1))
               )
            )
         )
      );
   }

   public class08988() {
      super();
   }

   private static Predicate<class08948> u() {
      return var0 -> {
         class00394 class00394 = var0.L();
         return class00394 instanceof class00379 ? !((class00379)class00394).j_().isEmpty() : false;
      };
   }

   private static void y(class01289<class08982> var0) {
      var0.N(
         class05359.N,
         0,
         ImmutableList.of(
            new class02140(1.5F), new class05770(45, 90), new class05738(), class05758.N(), new class05550(class05378.F), new class05550(class05378.Ni)
         )
      );
   }

   private static Map<class08969, class08993> y() {
      return Map.of(
         class08969.field_61245,
         N(class08979.field_61293, class04909.Mq),
         class08969.field_61246,
         N(class08979.field_61294, class04909.MK),
         class08969.field_61247,
         N(class08979.field_61295, class04909.MV),
         class08969.field_61248,
         N(class08979.field_61296, class04909.Me)
      );
   }

   public static void N(class08982 var0) {
      var0.method_18868().N(ImmutableList.of(class05359.y));
   }

   public static class01289<?> N(class01289<class08982> var0) {
      y(var0);
      L(var0);
      var0.N(Set.of(class05359.N));
      var0.y(class05359.y);
      var0.i();
      return var0;
   }

   private static class08993 N(class08979 var0, @Nullable class04891 var1) {
      return (var2, var3, var4) -> {
         if (var2 instanceof class08982 class08982) {
            class06695 class06695 = var3.y();
            if (var4 == 1) {
               class06695.method_5435(class08982);
               class08982.N(var3.N());
               class08982.N(var0);
            }

            if (var4 == 9 && var1 != null) {
               class08982.method_43077(var1);
            }

            if (var4 == 60) {
               if (class06695.j_().contains(var2)) {
                  class06695.method_5432(class08982);
               }

               class08982.W();
            }
         }
      };
   }

   public static class05781<class08982> N() {
      return class01289.N(z, Z);
   }
}
