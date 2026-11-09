package minecraft;

import com.google.common.collect.Maps;
import java.util.Map;

public class class05088 extends class06249<class08459, class02442> {
   private static final class01894 N = class01894.y("invisible");
   private static final Map<class05325, class01894> y = Maps.newEnumMap(
      Map.of(
         class05325.field_23808,
         N,
         class05325.field_23809,
         class01894.y("textures/entity/horse/horse_markings_white.png"),
         class05325.field_23810,
         class01894.y("textures/entity/horse/horse_markings_whitefield.png"),
         class05325.field_23811,
         class01894.y("textures/entity/horse/horse_markings_whitedots.png"),
         class05325.field_23812,
         class01894.y("textures/entity/horse/horse_markings_blackdots.png")
      )
   );

   public class05088(class06252<class08459, class02442> var1) {
      super(var1);
   }

   public void N(class01421 var1, class01237 var2, int var3, class08459 var4, float var5, float var6) {
      class01894 class01894 = y.get(var4.Z);
      if (class01894 != N && !var4.v) {
         var2.N(1).N(this.u(), var4, var1, class06851.z(class01894), var3, class02294.N(var4, 0.0F), -1, null, var4.l, null);
      }
   }
}
