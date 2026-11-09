package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class class05898 extends class06249<class08479, class01174> {
   private static final Map<class02842, class01894> N = ImmutableMap.of(
      class02842.field_21082,
      class01894.y("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      class02842.field_21083,
      class01894.y("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      class02842.field_21084,
      class01894.y("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public class05898(class06252<class08479, class01174> var1) {
      super(var1);
   }

   public void N(class01421 var1, class01237 var2, int var3, class08479 var4, float var5, float var6) {
      if (!var4.v) {
         class02842 class02842 = var4.L;
         if (class02842 != class02842.field_21081) {
            class01894 class01894 = N.get(class02842);
            y(this.u(), class01894, var1, var2, var3, var4, -1, 1);
         }
      }
   }
}
