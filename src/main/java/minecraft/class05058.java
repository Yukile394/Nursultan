package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class class05058 {
   public static final class05946<class05281> N = class01019.N("bastion/starts");

   public class05058() {
      super();
   }

   public static void N(class04116<class05281> var0) {
      class03529 class03529x = var0.N(class04227.yT).y(class01027.l);
      class03529 class03529x = var0.N(class04227.yv).y(class01019.N);
      var0.N(
         N,
         new class05281(
            class03529x,
            ImmutableList.of(
               Pair.of(class05248.y("bastion/units/air_base", class03529x), 1),
               Pair.of(class05248.y("bastion/hoglin_stable/air_base", class03529x), 1),
               Pair.of(class05248.y("bastion/treasure/big_air_full", class03529x), 1),
               Pair.of(class05248.y("bastion/bridge/starting_pieces/entrance_base", class03529x), 1)
            ),
            class05246.field_16687
         )
      );
      class05089.N(var0);
      class05063.N(var0);
      class05076.N(var0);
      class05040.N(var0);
      class05060.N(var0);
   }
}
