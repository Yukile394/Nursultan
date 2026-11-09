package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class class03642 {
   public static final class05946<class05281> N = class01019.N("ancient_city/city_center");

   public class03642() {
      super();
   }

   public static void N(class04116<class05281> var0) {
      class03529 class03529x = var0.N(class04227.yT).y(class01027.o);
      class03529 class03529x = var0.N(class04227.yv).y(class01019.N);
      var0.N(
         N,
         new class05281(
            class03529x,
            ImmutableList.of(
               Pair.of(class05248.y("ancient_city/city_center/city_center_1", class03529x), 1),
               Pair.of(class05248.y("ancient_city/city_center/city_center_2", class03529x), 1),
               Pair.of(class05248.y("ancient_city/city_center/city_center_3", class03529x), 1)
            ),
            class05246.field_16687
         )
      );
      class03651.N(var0);
   }
}
