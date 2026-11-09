package minecraft;

import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DynamicOps;
import java.util.HashMap;
import java.util.Map;

public class class05796 extends DataFix {
   public static final Map<String, String> N = (Map<String, String>)DataFixUtils.make(Maps.newHashMap(), var0 -> {
      var0.put("Airportal", "minecraft:end_portal");
      var0.put("Banner", "minecraft:banner");
      var0.put("Beacon", "minecraft:beacon");
      var0.put("Cauldron", "minecraft:brewing_stand");
      var0.put("Chest", "minecraft:chest");
      var0.put("Comparator", "minecraft:comparator");
      var0.put("Control", "minecraft:command_block");
      var0.put("DLDetector", "minecraft:daylight_detector");
      var0.put("Dropper", "minecraft:dropper");
      var0.put("EnchantTable", "minecraft:enchanting_table");
      var0.put("EndGateway", "minecraft:end_gateway");
      var0.put("EnderChest", "minecraft:ender_chest");
      var0.put("FlowerPot", "minecraft:flower_pot");
      var0.put("Furnace", "minecraft:furnace");
      var0.put("Hopper", "minecraft:hopper");
      var0.put("MobSpawner", "minecraft:mob_spawner");
      var0.put("Music", "minecraft:noteblock");
      var0.put("Piston", "minecraft:piston");
      var0.put("RecordPlayer", "minecraft:jukebox");
      var0.put("Sign", "minecraft:sign");
      var0.put("Skull", "minecraft:skull");
      var0.put("Structure", "minecraft:structure_block");
      var0.put("Trap", "minecraft:dispenser");
   });

   public class05796(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type type = this.getInputSchema().getType(class06962.l);
      Type type1 = this.getOutputSchema().getType(class06962.l);
      TaggedChoiceType taggedchoicetype = this.getInputSchema().findChoiceType(class06962.G);
      TaggedChoiceType taggedchoicetype1 = this.getOutputSchema().findChoiceType(class06962.G);
      return TypeRewriteRule.seq(
         this.convertUnchecked("item stack block entity name hook converter", type, type1),
         this.fixTypeEverywhere(
            "BlockEntityIdFix", taggedchoicetype, taggedchoicetype1, var0 -> var0x -> var0x.mapFirst(var0xx -> N.getOrDefault(var0xx, var0xx))
         )
      );
   }
}
