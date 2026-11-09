package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class class05060 {
   public class05060() {
      super();
   }

   public static void N(class04116<class05281> var0) {
      class03529 class03529 = var0.N(class04227.yv).y(class01019.N);
      class01019.N(
         var0,
         "bastion/mobs/piglin",
         new class05281(
            class03529,
            ImmutableList.of(
               Pair.of(class05248.y("bastion/mobs/melee_piglin"), 1),
               Pair.of(class05248.y("bastion/mobs/sword_piglin"), 4),
               Pair.of(class05248.y("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(class05248.y("bastion/mobs/empty"), 1)
            ),
            class05246.field_16687
         )
      );
      class01019.N(
         var0,
         "bastion/mobs/hoglin",
         new class05281(
            class03529,
            ImmutableList.of(Pair.of(class05248.y("bastion/mobs/hoglin"), 2), Pair.of(class05248.y("bastion/mobs/empty"), 1)),
            class05246.field_16687
         )
      );
      class01019.N(
         var0,
         "bastion/blocks/gold",
         new class05281(
            class03529,
            ImmutableList.of(Pair.of(class05248.y("bastion/blocks/air"), 3), Pair.of(class05248.y("bastion/blocks/gold"), 1)),
            class05246.field_16687
         )
      );
      class01019.N(
         var0,
         "bastion/mobs/piglin_melee",
         new class05281(
            class03529,
            ImmutableList.of(
               Pair.of(class05248.y("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(class05248.y("bastion/mobs/melee_piglin"), 5),
               Pair.of(class05248.y("bastion/mobs/sword_piglin"), 1)
            ),
            class05246.field_16687
         )
      );
   }
}
