package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class class04074 {
   private static final float N = 2.0F;
   private static final float y = 0.5F;
   private static final float L = 1.25F;

   private static void L(class01289<class04096> var0) {
      var0.N(
         class05359.y,
         ImmutableList.of(
            Pair.of(0, class04126.N(class07078.Ly, 6.0F, class02135.y(30, 60))),
            Pair.of(1, new class05585(var0x -> 1.25F)),
            Pair.of(
               2,
               new class05736(
                  ImmutableMap.of(class05378.m, class05367.field_18457),
                  ImmutableSet.of(),
                  class05753.field_18348,
                  class05769.field_18856,
                  ImmutableList.of(Pair.of(class01520.L(0.5F), 2), Pair.of(class05771.N(0.5F, 3), 3), Pair.of(class04137.N_43(class07049::method_5799), 5))
               )
            )
         )
      );
   }

   public class04074() {
      super();
   }

   private static void y(class01289<class04096> var0) {
      var0.N(class05359.N, 0, ImmutableList.of(new class02140(2.0F), new class05770(45, 90), new class05738(), new class05550(class05378.p)));
   }

   public static void N(class04096 var0) {
      var0.method_18868().N(ImmutableList.of(class05359.y));
   }

   public static class01289<?> N(class01289<class04096> var0) {
      y(var0);
      L(var0);
      var0.N(ImmutableSet.of(class05359.N));
      var0.y(class05359.y);
      var0.i();
      return var0;
   }
}
