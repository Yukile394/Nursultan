package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class class05260 {
   public static final class05946<class05281> N = class01019.N("pillager_outpost/base_plates");

   public class05260() {
      super();
   }

   public static void N(class04116<class05281> var0) {
      class03529 class03529x = var0.N(class04227.yT).y(class01027.b);
      class03529 class03529x = var0.N(class04227.yv).y(class01019.N);
      var0.N(N, new class05281(class03529x, ImmutableList.of(Pair.of(class05248.N("pillager_outpost/base_plate"), 1)), class05246.field_16687));
      class01019.N(
         var0,
         "pillager_outpost/towers",
         new class05281(
            class03529x,
            ImmutableList.of(
               Pair.of(
                  class05248.y(
                     ImmutableList.of(class05248.N("pillager_outpost/watchtower"), class05248.N("pillager_outpost/watchtower_overgrown", class03529x))
                  ),
                  1
               )
            ),
            class05246.field_16687
         )
      );
      class01019.N(
         var0,
         "pillager_outpost/feature_plates",
         new class05281(class03529x, ImmutableList.of(Pair.of(class05248.N("pillager_outpost/feature_plate"), 1)), class05246.field_16686)
      );
      class01019.N(
         var0,
         "pillager_outpost/features",
         new class05281(
            class03529x,
            ImmutableList.of(
               Pair.of(class05248.N("pillager_outpost/feature_cage1"), 1),
               Pair.of(class05248.N("pillager_outpost/feature_cage2"), 1),
               Pair.of(class05248.N("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(class05248.N("pillager_outpost/feature_logs"), 1),
               Pair.of(class05248.N("pillager_outpost/feature_tent1"), 1),
               Pair.of(class05248.N("pillager_outpost/feature_tent2"), 1),
               Pair.of(class05248.N("pillager_outpost/feature_targets"), 1),
               Pair.of(class05248.Z(), 6)
            ),
            class05246.field_16687
         )
      );
   }
}
