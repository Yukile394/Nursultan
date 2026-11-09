package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;

public class class06714 extends Schema {
   protected static final Map<String, String> N = (Map<String, String>)DataFixUtils.make(() -> {
      HashMap hashmap = Maps.newHashMap();
      hashmap.put("minecraft:furnace", "minecraft:furnace");
      hashmap.put("minecraft:lit_furnace", "minecraft:furnace");
      hashmap.put("minecraft:chest", "minecraft:chest");
      hashmap.put("minecraft:trapped_chest", "minecraft:chest");
      hashmap.put("minecraft:ender_chest", "minecraft:ender_chest");
      hashmap.put("minecraft:jukebox", "minecraft:jukebox");
      hashmap.put("minecraft:dispenser", "minecraft:dispenser");
      hashmap.put("minecraft:dropper", "minecraft:dropper");
      hashmap.put("minecraft:sign", "minecraft:sign");
      hashmap.put("minecraft:mob_spawner", "minecraft:mob_spawner");
      hashmap.put("minecraft:spawner", "minecraft:mob_spawner");
      hashmap.put("minecraft:noteblock", "minecraft:noteblock");
      hashmap.put("minecraft:brewing_stand", "minecraft:brewing_stand");
      hashmap.put("minecraft:enhanting_table", "minecraft:enchanting_table");
      hashmap.put("minecraft:command_block", "minecraft:command_block");
      hashmap.put("minecraft:beacon", "minecraft:beacon");
      hashmap.put("minecraft:skull", "minecraft:skull");
      hashmap.put("minecraft:daylight_detector", "minecraft:daylight_detector");
      hashmap.put("minecraft:hopper", "minecraft:hopper");
      hashmap.put("minecraft:banner", "minecraft:banner");
      hashmap.put("minecraft:flower_pot", "minecraft:flower_pot");
      hashmap.put("minecraft:repeating_command_block", "minecraft:command_block");
      hashmap.put("minecraft:chain_command_block", "minecraft:command_block");
      hashmap.put("minecraft:shulker_box", "minecraft:shulker_box");
      hashmap.put("minecraft:white_shulker_box", "minecraft:shulker_box");
      hashmap.put("minecraft:orange_shulker_box", "minecraft:shulker_box");
      hashmap.put("minecraft:magenta_shulker_box", "minecraft:shulker_box");
      hashmap.put("minecraft:light_blue_shulker_box", "minecraft:shulker_box");
      hashmap.put("minecraft:yellow_shulker_box", "minecraft:shulker_box");
      hashmap.put("minecraft:lime_shulker_box", "minecraft:shulker_box");
      hashmap.put("minecraft:pink_shulker_box", "minecraft:shulker_box");
      hashmap.put("minecraft:gray_shulker_box", "minecraft:shulker_box");
      hashmap.put("minecraft:silver_shulker_box", "minecraft:shulker_box");
      hashmap.put("minecraft:cyan_shulker_box", "minecraft:shulker_box");
      hashmap.put("minecraft:purple_shulker_box", "minecraft:shulker_box");
      hashmap.put("minecraft:blue_shulker_box", "minecraft:shulker_box");
      hashmap.put("minecraft:brown_shulker_box", "minecraft:shulker_box");
      hashmap.put("minecraft:green_shulker_box", "minecraft:shulker_box");
      hashmap.put("minecraft:red_shulker_box", "minecraft:shulker_box");
      hashmap.put("minecraft:black_shulker_box", "minecraft:shulker_box");
      hashmap.put("minecraft:bed", "minecraft:bed");
      hashmap.put("minecraft:light_gray_shulker_box", "minecraft:shulker_box");
      hashmap.put("minecraft:banner", "minecraft:banner");
      hashmap.put("minecraft:white_banner", "minecraft:banner");
      hashmap.put("minecraft:orange_banner", "minecraft:banner");
      hashmap.put("minecraft:magenta_banner", "minecraft:banner");
      hashmap.put("minecraft:light_blue_banner", "minecraft:banner");
      hashmap.put("minecraft:yellow_banner", "minecraft:banner");
      hashmap.put("minecraft:lime_banner", "minecraft:banner");
      hashmap.put("minecraft:pink_banner", "minecraft:banner");
      hashmap.put("minecraft:gray_banner", "minecraft:banner");
      hashmap.put("minecraft:silver_banner", "minecraft:banner");
      hashmap.put("minecraft:light_gray_banner", "minecraft:banner");
      hashmap.put("minecraft:cyan_banner", "minecraft:banner");
      hashmap.put("minecraft:purple_banner", "minecraft:banner");
      hashmap.put("minecraft:blue_banner", "minecraft:banner");
      hashmap.put("minecraft:brown_banner", "minecraft:banner");
      hashmap.put("minecraft:green_banner", "minecraft:banner");
      hashmap.put("minecraft:red_banner", "minecraft:banner");
      hashmap.put("minecraft:black_banner", "minecraft:banner");
      hashmap.put("minecraft:standing_sign", "minecraft:sign");
      hashmap.put("minecraft:wall_sign", "minecraft:sign");
      hashmap.put("minecraft:piston_head", "minecraft:piston");
      hashmap.put("minecraft:daylight_detector_inverted", "minecraft:daylight_detector");
      hashmap.put("minecraft:unpowered_comparator", "minecraft:comparator");
      hashmap.put("minecraft:powered_comparator", "minecraft:comparator");
      hashmap.put("minecraft:wall_banner", "minecraft:banner");
      hashmap.put("minecraft:standing_banner", "minecraft:banner");
      hashmap.put("minecraft:structure_block", "minecraft:structure_block");
      hashmap.put("minecraft:end_portal", "minecraft:end_portal");
      hashmap.put("minecraft:end_gateway", "minecraft:end_gateway");
      hashmap.put("minecraft:sign", "minecraft:sign");
      hashmap.put("minecraft:shield", "minecraft:banner");
      hashmap.put("minecraft:white_bed", "minecraft:bed");
      hashmap.put("minecraft:orange_bed", "minecraft:bed");
      hashmap.put("minecraft:magenta_bed", "minecraft:bed");
      hashmap.put("minecraft:light_blue_bed", "minecraft:bed");
      hashmap.put("minecraft:yellow_bed", "minecraft:bed");
      hashmap.put("minecraft:lime_bed", "minecraft:bed");
      hashmap.put("minecraft:pink_bed", "minecraft:bed");
      hashmap.put("minecraft:gray_bed", "minecraft:bed");
      hashmap.put("minecraft:silver_bed", "minecraft:bed");
      hashmap.put("minecraft:light_gray_bed", "minecraft:bed");
      hashmap.put("minecraft:cyan_bed", "minecraft:bed");
      hashmap.put("minecraft:purple_bed", "minecraft:bed");
      hashmap.put("minecraft:blue_bed", "minecraft:bed");
      hashmap.put("minecraft:brown_bed", "minecraft:bed");
      hashmap.put("minecraft:green_bed", "minecraft:bed");
      hashmap.put("minecraft:red_bed", "minecraft:bed");
      hashmap.put("minecraft:black_bed", "minecraft:bed");
      hashmap.put("minecraft:oak_sign", "minecraft:sign");
      hashmap.put("minecraft:spruce_sign", "minecraft:sign");
      hashmap.put("minecraft:birch_sign", "minecraft:sign");
      hashmap.put("minecraft:jungle_sign", "minecraft:sign");
      hashmap.put("minecraft:acacia_sign", "minecraft:sign");
      hashmap.put("minecraft:dark_oak_sign", "minecraft:sign");
      hashmap.put("minecraft:crimson_sign", "minecraft:sign");
      hashmap.put("minecraft:warped_sign", "minecraft:sign");
      hashmap.put("minecraft:skeleton_skull", "minecraft:skull");
      hashmap.put("minecraft:wither_skeleton_skull", "minecraft:skull");
      hashmap.put("minecraft:zombie_head", "minecraft:skull");
      hashmap.put("minecraft:player_head", "minecraft:skull");
      hashmap.put("minecraft:creeper_head", "minecraft:skull");
      hashmap.put("minecraft:dragon_head", "minecraft:skull");
      hashmap.put("minecraft:barrel", "minecraft:barrel");
      hashmap.put("minecraft:conduit", "minecraft:conduit");
      hashmap.put("minecraft:smoker", "minecraft:smoker");
      hashmap.put("minecraft:blast_furnace", "minecraft:blast_furnace");
      hashmap.put("minecraft:lectern", "minecraft:lectern");
      hashmap.put("minecraft:bell", "minecraft:bell");
      hashmap.put("minecraft:jigsaw", "minecraft:jigsaw");
      hashmap.put("minecraft:campfire", "minecraft:campfire");
      hashmap.put("minecraft:bee_nest", "minecraft:beehive");
      hashmap.put("minecraft:beehive", "minecraft:beehive");
      hashmap.put("minecraft:sculk_sensor", "minecraft:sculk_sensor");
      hashmap.put("minecraft:decorated_pot", "minecraft:decorated_pot");
      hashmap.put("minecraft:crafter", "minecraft:crafter");
      return ImmutableMap.copyOf(hashmap);
   });
   protected static final HookFunction y = new class06705();

   public class06714(int var1, Schema var2) {
      super(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      Map map = super.registerBlockEntities(var1);
      class05796.N
         .forEach((var1x, var2x) -> map.put(var2x, (Supplier)Objects.requireNonNull((Supplier)map.remove(var1x), () -> "Didn't find " + var1x + " in schema")));
      return map;
   }

   public Type<?> getChoiceType(TypeReference var1, String var2) {
      return Objects.equals(var1.typeName(), class06962.G.typeName()) ? super.getChoiceType(var1, class00622.N(var2)) : super.getChoiceType(var1, var2);
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      var1.registerType(true, class06962.G, () -> DSL.optionalFields("components", class06962.k.in(var1), DSL.taggedChoiceLazy("id", class00622.N(), var3)));
      var1.registerType(
         true, class06962.l, () -> DSL.hook(DSL.optionalFields("id", class06962.K.in(var1), "tag", class06689.y(var1)), y, HookFunction.IDENTITY)
      );
   }
}
