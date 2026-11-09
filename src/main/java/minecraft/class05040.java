package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class class05040 {
   public class05040() {
      super();
   }

   public static void N(class04116<class05281> var0) {
      class02055 class02055 = var0.N(class04227.yT);
      class03529 class03529xxxx = class02055.y(class01027.w);
      class03529 class03529x = class02055.y(class01027.l);
      class03529 class03529xx = class02055.y(class01027.k);
      class03529 class03529xxx = class02055.y(class01027.d);
      class03529 class03529xxxx = var0.N(class04227.yv).y(class01019.N);
      class01019.N(
         var0,
         "bastion/bridge/starting_pieces",
         new class05281(
            class03529xxxx,
            ImmutableList.of(
               Pair.of(class05248.y("bastion/bridge/starting_pieces/entrance", class03529xxxx), 1),
               Pair.of(class05248.y("bastion/bridge/starting_pieces/entrance_face", class03529x), 1)
            ),
            class05246.field_16687
         )
      );
      class01019.N(
         var0,
         "bastion/bridge/bridge_pieces",
         new class05281(class03529xxxx, ImmutableList.of(Pair.of(class05248.y("bastion/bridge/bridge_pieces/bridge", class03529xx), 1)), class05246.field_16687)
      );
      class01019.N(
         var0,
         "bastion/bridge/legs",
         new class05281(
            class03529xxxx,
            ImmutableList.of(
               Pair.of(class05248.y("bastion/bridge/legs/leg_0", class03529x), 1), Pair.of(class05248.y("bastion/bridge/legs/leg_1", class03529x), 1)
            ),
            class05246.field_16687
         )
      );
      class01019.N(
         var0,
         "bastion/bridge/walls",
         new class05281(
            class03529xxxx,
            ImmutableList.of(
               Pair.of(class05248.y("bastion/bridge/walls/wall_base_0", class03529xxx), 1),
               Pair.of(class05248.y("bastion/bridge/walls/wall_base_1", class03529xxx), 1)
            ),
            class05246.field_16687
         )
      );
      class01019.N(
         var0,
         "bastion/bridge/ramparts",
         new class05281(
            class03529xxxx,
            ImmutableList.of(
               Pair.of(class05248.y("bastion/bridge/ramparts/rampart_0", class03529xxx), 1),
               Pair.of(class05248.y("bastion/bridge/ramparts/rampart_1", class03529xxx), 1)
            ),
            class05246.field_16687
         )
      );
      class01019.N(
         var0,
         "bastion/bridge/rampart_plates",
         new class05281(
            class03529xxxx, ImmutableList.of(Pair.of(class05248.y("bastion/bridge/rampart_plates/plate_0", class03529xxx), 1)), class05246.field_16687
         )
      );
      class01019.N(
         var0,
         "bastion/bridge/connectors",
         new class05281(
            class03529xxxx,
            ImmutableList.of(
               Pair.of(class05248.y("bastion/bridge/connectors/back_bridge_top", class03529x), 1),
               Pair.of(class05248.y("bastion/bridge/connectors/back_bridge_bottom", class03529x), 1)
            ),
            class05246.field_16687
         )
      );
   }
}
