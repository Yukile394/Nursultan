package minecraft;

import com.google.common.collect.Maps;
import java.util.Map;

public final class class04287 extends class01660<class07901, class08459, class02442> {
   private static final Map<class05289, class01894> N = Maps.newEnumMap(
      Map.of(
         class05289.field_23816,
         class01894.y("textures/entity/horse/horse_white.png"),
         class05289.field_23817,
         class01894.y("textures/entity/horse/horse_creamy.png"),
         class05289.field_23818,
         class01894.y("textures/entity/horse/horse_chestnut.png"),
         class05289.field_23819,
         class01894.y("textures/entity/horse/horse_brown.png"),
         class05289.field_23820,
         class01894.y("textures/entity/horse/horse_black.png"),
         class05289.field_23821,
         class01894.y("textures/entity/horse/horse_gray.png"),
         class05289.field_23822,
         class01894.y("textures/entity/horse/horse_darkbrown.png")
      )
   );

   public class04287(class04832 var1) {
      super(var1, new class02442(var1.N(class04802.yl)), new class02442(var1.N(class04802.yk)));
      this.N(new class05088(this));
      this.N(
         new class00207<>(
            this, var1.B(), class08719.field_54129, var0 -> var0.L, new class02442(var1.N(class04802.yd)), new class02442(var1.N(class04802.yY)), 2
         )
      );
      this.N(
         new class00207<>(
            this, var1.B(), class08719.field_56126, var0 -> var0.y, new class00236(var1.N(class04802.yw)), new class00236(var1.N(class04802.yQ)), 2
         )
      );
   }

   public class08459 method_55269() {
      return new class08459();
   }

   public class01894 N(class08459 var1) {
      return N.get(var1.N);
   }

   public void method_62354(class07901 var1, class08459 var2, float var3) {
      super.method_62354((class07901)var1, (class08459)var2, var3);
      var2.N = var1.W();
      var2.Z = var1.v();
      var2.L = var1.NZ().t();
   }
}
