package minecraft;

import java.util.Map;

public class class04255 extends class06249<class08285, class03091> {
   private final class03091 N;
   private final class03091 y;
   private final class08720 L;
   private static final Map<class02842, class01894> u = Map.of(
      class02842.field_21082,
      class01894.y("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      class02842.field_21083,
      class01894.y("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      class02842.field_21084,
      class01894.y("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public class04255(class06252<class08285, class03091> var1, class01140 var2, class08720 var3) {
      super(var1);
      this.N = new class03091(var2.N(class04802.ib));
      this.y = new class03091(var2.N(class04802.iv));
      this.L = var3;
   }

   public void N(class01421 var1, class01237 var2, int var3, class08285 var4, float var5, float var6) {
      class06584 class06584 = var4.Z;
      class08725 class08725 = class06584.method_58694(class02484.o);
      if (class08725 != null && !class08725.u().isEmpty()) {
         class03091 class03091 = var4.NB ? this.y : this.N;
         this.L.N(class08719.field_54128, class08725.u().get(), class03091, var4, class06584, var1, var2, var3, var4.l);
         this.N(var1, var2, var3, class06584, class03091, var4);
      }
   }

   private void N(class01421 var1, class01237 var2, int var3, class06584 var4, class06271<class08285> var5, class08285 var6) {
      class02842 class02842 = class02812.y.N(var4);
      if (class02842 != class02842.field_21081) {
         class01894 class01894 = u.get(class02842);
         var2.N(var5, var6, var1, class06851.L(class01894), var3, class01384.u, var6.l, null);
      }
   }
}
