package minecraft;

public enum class01064 {
   field_33944(
      class01894.y("hud/heart/container"),
      class01894.y("hud/heart/container_blinking"),
      class01894.y("hud/heart/container"),
      class01894.y("hud/heart/container_blinking"),
      class01894.y("hud/heart/container_hardcore"),
      class01894.y("hud/heart/container_hardcore_blinking"),
      class01894.y("hud/heart/container_hardcore"),
      class01894.y("hud/heart/container_hardcore_blinking")
   ),
   field_33945(
      class01894.y("hud/heart/full"),
      class01894.y("hud/heart/full_blinking"),
      class01894.y("hud/heart/half"),
      class01894.y("hud/heart/half_blinking"),
      class01894.y("hud/heart/hardcore_full"),
      class01894.y("hud/heart/hardcore_full_blinking"),
      class01894.y("hud/heart/hardcore_half"),
      class01894.y("hud/heart/hardcore_half_blinking")
   ),
   field_33946(
      class01894.y("hud/heart/poisoned_full"),
      class01894.y("hud/heart/poisoned_full_blinking"),
      class01894.y("hud/heart/poisoned_half"),
      class01894.y("hud/heart/poisoned_half_blinking"),
      class01894.y("hud/heart/poisoned_hardcore_full"),
      class01894.y("hud/heart/poisoned_hardcore_full_blinking"),
      class01894.y("hud/heart/poisoned_hardcore_half"),
      class01894.y("hud/heart/poisoned_hardcore_half_blinking")
   ),
   field_33947(
      class01894.y("hud/heart/withered_full"),
      class01894.y("hud/heart/withered_full_blinking"),
      class01894.y("hud/heart/withered_half"),
      class01894.y("hud/heart/withered_half_blinking"),
      class01894.y("hud/heart/withered_hardcore_full"),
      class01894.y("hud/heart/withered_hardcore_full_blinking"),
      class01894.y("hud/heart/withered_hardcore_half"),
      class01894.y("hud/heart/withered_hardcore_half_blinking")
   ),
   field_33948(
      class01894.y("hud/heart/absorbing_full"),
      class01894.y("hud/heart/absorbing_full_blinking"),
      class01894.y("hud/heart/absorbing_half"),
      class01894.y("hud/heart/absorbing_half_blinking"),
      class01894.y("hud/heart/absorbing_hardcore_full"),
      class01894.y("hud/heart/absorbing_hardcore_full_blinking"),
      class01894.y("hud/heart/absorbing_hardcore_half"),
      class01894.y("hud/heart/absorbing_hardcore_half_blinking")
   ),
   field_33949(
      class01894.y("hud/heart/frozen_full"),
      class01894.y("hud/heart/frozen_full_blinking"),
      class01894.y("hud/heart/frozen_half"),
      class01894.y("hud/heart/frozen_half_blinking"),
      class01894.y("hud/heart/frozen_hardcore_full"),
      class01894.y("hud/heart/frozen_hardcore_full_blinking"),
      class01894.y("hud/heart/frozen_hardcore_half"),
      class01894.y("hud/heart/frozen_hardcore_half_blinking")
   );

   private final class01894 field_45329;
   private final class01894 field_45330;
   private final class01894 field_45331;
   private final class01894 field_45332;
   private final class01894 field_45333;
   private final class01894 field_45334;
   private final class01894 field_45335;
   private final class01894 field_45336;

   private class01064(class01894 var3, class01894 var4, class01894 var5, class01894 var6, class01894 var7, class01894 var8, class01894 var9, class01894 var10) {
      this.field_45329 = var3;
      this.field_45330 = var4;
      this.field_45331 = var5;
      this.field_45332 = var6;
      this.field_45333 = var7;
      this.field_45334 = var8;
      this.field_45335 = var9;
      this.field_45336 = var10;
   }

   public class01894 N(boolean var1, boolean var2, boolean var3) {
      if (!var1) {
         if (var2) {
            return var3 ? this.field_45332 : this.field_45331;
         } else {
            return var3 ? this.field_45330 : this.field_45329;
         }
      } else if (var2) {
         return var3 ? this.field_45336 : this.field_45335;
      } else {
         return var3 ? this.field_45334 : this.field_45333;
      }
   }

   static class01064 N(class08036 var0) {
      class01064 class01064;
      if (var0.method_6059(class07047.j)) {
         class01064 = field_33946;
      } else if (var0.method_6059(class07047.v)) {
         class01064 = field_33947;
      } else if (var0.method_32314()) {
         class01064 = field_33949;
      } else {
         class01064 = field_33945;
      }

      return class01064;
   }
}
