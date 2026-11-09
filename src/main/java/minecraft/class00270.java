package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class00270 extends class00622 {
   public class00270(int var1, Schema var2) {
      super(var1, var2);
   }

   private void N(Map<String, Supplier<TypeTemplate>> var1, String var2) {
      this.register(var1, var2, var1x -> DSL.optionalFields("Items", DSL.list(class06962.l.in(this))));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map map = super.registerEntities(var1);
      map.remove("minecraft:boat");
      map.remove("minecraft:chest_boat");
      this.registerSimple(map, "minecraft:oak_boat");
      this.registerSimple(map, "minecraft:spruce_boat");
      this.registerSimple(map, "minecraft:birch_boat");
      this.registerSimple(map, "minecraft:jungle_boat");
      this.registerSimple(map, "minecraft:acacia_boat");
      this.registerSimple(map, "minecraft:cherry_boat");
      this.registerSimple(map, "minecraft:dark_oak_boat");
      this.registerSimple(map, "minecraft:mangrove_boat");
      this.registerSimple(map, "minecraft:bamboo_raft");
      this.N(map, "minecraft:oak_chest_boat");
      this.N(map, "minecraft:spruce_chest_boat");
      this.N(map, "minecraft:birch_chest_boat");
      this.N(map, "minecraft:jungle_chest_boat");
      this.N(map, "minecraft:acacia_chest_boat");
      this.N(map, "minecraft:cherry_chest_boat");
      this.N(map, "minecraft:dark_oak_chest_boat");
      this.N(map, "minecraft:mangrove_chest_boat");
      this.N(map, "minecraft:bamboo_chest_raft");
      return map;
   }
}
