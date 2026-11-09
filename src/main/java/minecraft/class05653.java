package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class05653 extends class00955 {
   public class05653(Schema var1, String var2) {
      super(var1, false, "Villager profession data fix (" + var2 + ")", class06962.o, var2);
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      Dynamic<?> dynamic = (Dynamic<?>)var1.get(DSL.remainderFinder());
      return var1.set(
         DSL.remainderFinder(),
         dynamic.remove("Profession")
            .remove("Career")
            .remove("CareerLevel")
            .set(
               "VillagerData",
               dynamic.createMap(
                  ImmutableMap.of(
                     dynamic.createString("type"),
                     dynamic.createString("minecraft:plains"),
                     dynamic.createString("profession"),
                     dynamic.createString(N(dynamic.get("Profession").asInt(0), dynamic.get("Career").asInt(0))),
                     dynamic.createString("level"),
                     (Dynamic)DataFixUtils.orElse(dynamic.get("CareerLevel").result(), dynamic.createInt(1))
                  )
               )
            )
      );
   }

   private static String N(int var0, int var1) {
      if (var0 == 0) {
         if (var1 == 2) {
            return "minecraft:fisherman";
         } else if (var1 == 3) {
            return "minecraft:shepherd";
         } else {
            return var1 == 4 ? "minecraft:fletcher" : "minecraft:farmer";
         }
      } else if (var0 == 1) {
         return var1 == 2 ? "minecraft:cartographer" : "minecraft:librarian";
      } else if (var0 == 2) {
         return "minecraft:cleric";
      } else if (var0 == 3) {
         if (var1 == 2) {
            return "minecraft:weaponsmith";
         } else {
            return var1 == 3 ? "minecraft:toolsmith" : "minecraft:armorer";
         }
      } else if (var0 == 4) {
         return var1 == 2 ? "minecraft:leatherworker" : "minecraft:butcher";
      } else {
         return var0 == 5 ? "minecraft:nitwit" : "minecraft:none";
      }
   }
}
