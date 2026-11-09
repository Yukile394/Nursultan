package minecraft;

import com.google.common.base.Splitter;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class class02849 extends DataFix {
   private static final int N = 1;
   private static final int y = 2;
   private static final int L = 4;
   private static final int u = 8;
   private static final int i = 16;
   private static final int R = 32;
   private static final int M = 64;
   private static final int B = 128;
   private static final Set<String> Z = Set.of("minecraft:potion", "minecraft:splash_potion", "minecraft:lingering_potion", "minecraft:tipped_arrow");
   private static final Set<String> z = Set.of(
      "minecraft:pufferfish_bucket",
      "minecraft:salmon_bucket",
      "minecraft:cod_bucket",
      "minecraft:tropical_fish_bucket",
      "minecraft:axolotl_bucket",
      "minecraft:tadpole_bucket"
   );
   private static final List<String> U = List.of(
      "NoAI", "Silent", "NoGravity", "Glowing", "Invulnerable", "Health", "Age", "Variant", "HuntingCooldown", "BucketVariantTag"
   );
   private static final Set<String> E = Set.of(
      "attached",
      "bottom",
      "conditional",
      "disarmed",
      "drag",
      "enabled",
      "extended",
      "eye",
      "falling",
      "hanging",
      "has_bottle_0",
      "has_bottle_1",
      "has_bottle_2",
      "has_record",
      "has_book",
      "inverted",
      "in_wall",
      "lit",
      "locked",
      "occupied",
      "open",
      "persistent",
      "powered",
      "short",
      "signal_fire",
      "snowy",
      "triggered",
      "unstable",
      "waterlogged",
      "berries",
      "bloom",
      "shrieking",
      "can_summon",
      "up",
      "down",
      "north",
      "east",
      "south",
      "west",
      "slot_0_occupied",
      "slot_1_occupied",
      "slot_2_occupied",
      "slot_3_occupied",
      "slot_4_occupied",
      "slot_5_occupied",
      "cracked",
      "crafting"
   );
   private static final Splitter W = Splitter.on(',');

   private static void L(class02825 var0, Dynamic<?> var1) {
      Dynamic<?> dynamic = i(var0, var1);
      if (dynamic != null) {
         var0.N("minecraft:writable_book_content", var1.emptyMap().set("pages", dynamic));
      }
   }

   private static Optional<Pair<String, Integer>> L(Dynamic<?> var0) {
      return var0.get("id")
         .asString()
         .apply2stable((var0x, var1) -> Pair.of(var0x, class04995.N(var1.intValue(), 0, 255)), var0.get("lvl").asNumber())
         .result();
   }

   private static void L(class02825 var0, Dynamic<?> var1, int var2) {
      OptionalDynamic<?> optionaldynamic = var0.N("AttributeModifiers");
      if (!optionaldynamic.result().isEmpty()) {
         boolean flag = (var2 & 2) != 0;
         List list = optionaldynamic.asList(class02849::u);
         Dynamic dynamic = var1.emptyMap().set("modifiers", var1.createList(list.stream()));
         if (flag) {
            dynamic = dynamic.set("show_in_tooltip", var1.createBoolean(false));
         }

         var0.N("minecraft:attribute_modifiers", dynamic);
      }
   }

   private static void M(class02825 var0, Dynamic<?> var1) {
      Optional<Dynamic<?>> optional = var0.N("LodestonePos").result();
      Optional<Dynamic<?>> optional1 = var0.N("LodestoneDimension").result();
      if (!optional.isEmpty() || !optional1.isEmpty()) {
         boolean flag = var0.N("LodestoneTracked").asBoolean(true);
         Dynamic dynamic = var1.emptyMap();
         if (optional.isPresent() && optional1.isPresent()) {
            dynamic = dynamic.set("target", var1.emptyMap().set("pos", optional.get()).set("dimension", optional1.get()));
         }

         if (!flag) {
            dynamic = dynamic.set("tracked", var1.createBoolean(false));
         }

         var0.N("minecraft:lodestone_tracker", dynamic);
      }
   }

   public class02849(Schema var1) {
      super(var1, true);
   }

   @Nullable
   private static Dynamic<?> i(class02825 var0, Dynamic<?> var1) {
      List list = var0.N("pages").asList(var0x -> var0x.asString(""));
      Map map = var0.N("filtered_pages").asMap(var0x -> var0x.asString("0"), var0x -> var0x.asString(""));
      if (list.isEmpty()) {
         return null;
      } else {
         ArrayList arraylist = new ArrayList(list.size());

         for (int ix = 0; ix < list.size(); ix++) {
            String s = (String)list.get(ix);
            String s1 = (String)map.get(String.valueOf(ix));
            arraylist.add(N(var1, s, Optional.ofNullable(s1)));
         }

         return var1.createList(arraylist.stream());
      }
   }

   private static Pair<Dynamic<?>, Dynamic<?>> i(Dynamic<?> var0) {
      Dynamic dynamic = (Dynamic)DataFixUtils.orElseGet(var0.get("id").result(), () -> var0.createString(""));
      Dynamic dynamic1 = var0.emptyMap()
         .set("type", var0.createString(N(var0.get("type").asInt(0))))
         .set("x", var0.createDouble(var0.get("x").asDouble(0.0)))
         .set("z", var0.createDouble(var0.get("z").asDouble(0.0)))
         .set("rotation", var0.createFloat((float)var0.get("rot").asDouble(0.0)));
      return Pair.of(dynamic, dynamic1);
   }

   private static void u(class02825 var0, Dynamic<?> var1) {
      Dynamic<?> dynamic = i(var0, var1);
      String s = var0.N("title").asString("");
      Optional<String> optional = var0.N("filtered_title").asString().result();
      Dynamic<?> dynamic1 = var1.emptyMap();
      dynamic1 = dynamic1.set("title", N(var1, s, optional));
      dynamic1 = var0.N("author", dynamic1, "author");
      dynamic1 = var0.N("resolved", dynamic1, "resolved");
      dynamic1 = var0.N("generation", dynamic1, "generation");
      if (dynamic != null) {
         dynamic1 = dynamic1.set("pages", dynamic);
      }

      var0.N("minecraft:written_book_content", dynamic1);
   }

   private static Dynamic<?> u(Dynamic<?> var0) {
      Dynamic<?> dynamic = var0.emptyMap()
         .set("name", var0.createString(""))
         .set("amount", var0.createDouble(0.0))
         .set("operation", var0.createString("add_value"));
      dynamic = Dynamic.copyField(var0, "AttributeName", dynamic, "type");
      dynamic = Dynamic.copyField(var0, "Slot", dynamic, "slot");
      dynamic = Dynamic.copyField(var0, "UUID", dynamic, "uuid");
      dynamic = Dynamic.copyField(var0, "Name", dynamic, "name");
      dynamic = Dynamic.copyField(var0, "Amount", dynamic, "amount");
      return Dynamic.copyAndFixField(var0, "Operation", dynamic, "operation", var0x -> {
         return var0x.createString(switch (var0x.asInt(0)) {
            case 1 -> "add_multiplied_base";
            case 2 -> "add_multiplied_total";
            default -> "add_value";
         });
      });
   }

   private static void y(class02825 var0, Dynamic<?> var1, int var2) {
      y(var0, var1, "CanDestroy", "minecraft:can_break", (var2 & 8) != 0);
      y(var0, var1, "CanPlaceOn", "minecraft:can_place_on", (var2 & 16) != 0);
   }

   private static void y(class02825 var0) {
      var0.N("Fireworks", true, var1 -> {
         Stream stream = var1.get("Explosions").asStream().map(class02849::R);
         int ix = var1.get("Flight").asInt(0);
         var0.N("minecraft:fireworks", var1.emptyMap().set("explosions", var1.createList(stream)).set("flight_duration", var1.createByte((byte)ix)));
         return var1.remove("Explosions").remove("Flight");
      });
   }

   private static Dynamic<?> y(Dynamic<?> var0) {
      return (Dynamic<?>)DataFixUtils.orElse(var0.asMapOpt().result().map(var0x -> var0x.collect(Collectors.toMap(Pair::getFirst, var0xx -> {
         String s = ((Dynamic)var0xx.getFirst()).asString("");
         Dynamic dynamic = (Dynamic)var0xx.getSecond();
         if (E.contains(s)) {
            Optional optional = dynamic.asBoolean().result();
            if (optional.isPresent()) {
               return dynamic.createString(String.valueOf(optional.get()));
            }
         }

         Optional optional1 = dynamic.asNumber().result();
         return optional1.isPresent() ? dynamic.createString(((Number)optional1.get()).toString()) : dynamic;
      }))).map(var0::createMap), var0);
   }

   private static void y(class02825 var0, Dynamic<?> var1) {
      Dynamic<?> dynamic = var1.emptyMap();
      Optional<String> optional = var0.N("Potion").asString().result().filter(var0x -> !var0x.equals("minecraft:empty"));
      if (optional.isPresent()) {
         dynamic = dynamic.set("potion", var1.createString(optional.get()));
      }

      dynamic = var0.N("CustomPotionColor", dynamic, "custom_color");
      dynamic = var0.N("custom_potion_effects", dynamic, "custom_effects");
      if (!dynamic.equals(var1.emptyMap())) {
         var0.N("minecraft:potion_contents", dynamic);
      }
   }

   private static void y(class02825 var0, Dynamic<?> var1, String var2, String var3, boolean var4) {
      Optional<Dynamic<?>> optional = var0.N(var2).result();
      if (!optional.isEmpty()) {
         Dynamic dynamic = var1.emptyMap()
            .set(
               "predicates",
               var1.createList(
                  optional.get()
                     .asStream()
                     .map(var0x -> (Dynamic)DataFixUtils.orElse(var0x.asString().map(var1x -> N((Dynamic<?>)var0x, var1x)).result(), var0x))
               )
            );
         if (var4) {
            dynamic = dynamic.set("show_in_tooltip", var1.createBoolean(false));
         }

         var0.N(var3, dynamic);
      }
   }

   private static void N(class02825 var0, Dynamic<?> var1) {
      int ix = var0.N("HideFlags").asInt(0);
      var0.N("Damage", "minecraft:damage", var1.createInt(0));
      var0.N("RepairCost", "minecraft:repair_cost", var1.createInt(0));
      var0.N("CustomModelData", "minecraft:custom_model_data");
      var0.N("BlockStateTag").result().ifPresent(var1x -> var0.N("minecraft:block_state", y((Dynamic<?>)var1x)));
      var0.N("EntityTag", "minecraft:entity_data");
      var0.N("BlockEntityTag", false, var1x -> {
         String s = class00622.N(var1x.get("id").asString(""));
         var1x = N(var0, var1x, s);
         Dynamic dynamic = var1x.remove("id");
         return dynamic.equals(var1x.emptyMap()) ? dynamic : var1x;
      });
      var0.N("BlockEntityTag", "minecraft:block_entity_data");
      if (var0.N("Unbreakable").asBoolean(false)) {
         Dynamic var3 = var1.emptyMap();
         if ((ix & 4) != 0) {
            var3 = var3.set("show_in_tooltip", var1.createBoolean(false));
         }

         var0.N("minecraft:unbreakable", var3);
      }

      N(var0, var1, "Enchantments", "minecraft:enchantments", (ix & 1) != 0);
      if (var0.y("minecraft:enchanted_book")) {
         N(var0, var1, "StoredEnchantments", "minecraft:stored_enchantments", (ix & 32) != 0);
      }

      var0.N("display", false, var2x -> N(var0, var2x, ix));
      y(var0, var1, ix);
      L(var0, var1, ix);
      Optional<Dynamic<?>> optional = var0.N("Trim").result();
      if (optional.isPresent()) {
         Dynamic<?> dynamic1 = optional.get();
         if ((ix & 128) != 0) {
            dynamic1 = dynamic1.set("show_in_tooltip", dynamic1.createBoolean(false));
         }

         var0.N("minecraft:trim", dynamic1);
      }

      if ((ix & 32) != 0) {
         var0.N("minecraft:hide_additional_tooltip", var1.emptyMap());
      }

      if (var0.y("minecraft:crossbow")) {
         var0.N("Charged");
         var0.N("ChargedProjectiles", "minecraft:charged_projectiles", var1.createList(Stream.empty()));
      }

      if (var0.y("minecraft:bundle")) {
         var0.N("Items", "minecraft:bundle_contents", var1.createList(Stream.empty()));
      }

      if (var0.y("minecraft:filled_map")) {
         var0.N("map", "minecraft:map_id");
         Map map = var0.N("Decorations").asStream().map(class02849::i).collect(Collectors.toMap(Pair::getFirst, Pair::getSecond, (var0x, var1x) -> var0x));
         if (!map.isEmpty()) {
            var0.N("minecraft:map_decorations", var1.createMap(map));
         }
      }

      if (var0.N(Z)) {
         y(var0, var1);
      }

      if (var0.y("minecraft:writable_book")) {
         L(var0, var1);
      }

      if (var0.y("minecraft:written_book")) {
         u(var0, var1);
      }

      if (var0.y("minecraft:suspicious_stew")) {
         var0.N("effects", "minecraft:suspicious_stew_effects");
      }

      if (var0.y("minecraft:debug_stick")) {
         var0.N("DebugProperty", "minecraft:debug_stick_state");
      }

      if (var0.N(z)) {
         R(var0, var1);
      }

      if (var0.y("minecraft:goat_horn")) {
         var0.N("instrument", "minecraft:instrument");
      }

      if (var0.y("minecraft:knowledge_book")) {
         var0.N("Recipes", "minecraft:recipes");
      }

      if (var0.y("minecraft:compass")) {
         M(var0, var1);
      }

      if (var0.y("minecraft:firework_rocket")) {
         y(var0);
      }

      if (var0.y("minecraft:firework_star")) {
         N(var0);
      }

      if (var0.y("minecraft:player_head")) {
         var0.N("SkullOwner").result().ifPresent(var1x -> var0.N("minecraft:profile", N((Dynamic<?>)var1x)));
      }
   }

   private static String N(int var0) {
      return switch (var0) {
         case 1 -> "frame";
         case 2 -> "red_marker";
         case 3 -> "blue_marker";
         case 4 -> "target_x";
         case 5 -> "target_point";
         case 6 -> "player_off_map";
         case 7 -> "player_off_limits";
         case 8 -> "mansion";
         case 9 -> "monument";
         case 10 -> "banner_white";
         case 11 -> "banner_orange";
         case 12 -> "banner_magenta";
         case 13 -> "banner_light_blue";
         case 14 -> "banner_yellow";
         case 15 -> "banner_lime";
         case 16 -> "banner_pink";
         case 17 -> "banner_gray";
         case 18 -> "banner_light_gray";
         case 19 -> "banner_cyan";
         case 20 -> "banner_purple";
         case 21 -> "banner_blue";
         case 22 -> "banner_brown";
         case 23 -> "banner_green";
         case 24 -> "banner_red";
         case 25 -> "banner_black";
         case 26 -> "red_x";
         case 27 -> "village_desert";
         case 28 -> "village_plains";
         case 29 -> "village_savanna";
         case 30 -> "village_snowy";
         case 31 -> "village_taiga";
         case 32 -> "jungle_temple";
         case 33 -> "swamp_hut";
         default -> "player";
      };
   }

   private static <T> Dynamic<T> N(class02825 var0, Dynamic<T> var1, String var2) {
      var0.N("minecraft:lock", var1.get("Lock"));
      var1 = var1.remove("Lock");
      Optional optional = var1.get("LootTable").result();
      if (optional.isPresent()) {
         Dynamic dynamic = var1.emptyMap().set("loot_table", (Dynamic)optional.get());
         long ix = var1.get("LootTableSeed").asLong(0L);
         if (ix != 0L) {
            dynamic = dynamic.set("seed", var1.createLong(ix));
         }

         var0.N("minecraft:container_loot", dynamic);
         var1 = var1.remove("LootTable").remove("LootTableSeed");
      }
      return switch (var2) {
         case "minecraft:skull" -> {
            var0.N("minecraft:note_block_sound", var1.get("note_block_sound"));
            yield var1.remove("note_block_sound");
         }
         case "minecraft:decorated_pot" -> {
            var0.N("minecraft:pot_decorations", var1.get("sherds"));
            Optional optional2 = var1.get("item").result();
            if (optional2.isPresent()) {
               var0.N("minecraft:container", var1.createList(Stream.of(var1.emptyMap().set("slot", var1.createInt(0)).set("item", (Dynamic)optional2.get()))));
            }

            yield var1.remove("sherds").remove("item");
         }
         case "minecraft:banner" -> {
            var0.N("minecraft:banner_patterns", var1.get("patterns"));
            Optional<Number> optional1 = var1.get("Base").asNumber().result();
            if (optional1.isPresent()) {
               var0.N("minecraft:base_color", var1.createString(class02269.N(optional1.get().intValue())));
            }

            yield var1.remove("patterns").remove("Base");
         }
         case "minecraft:shulker_box", "minecraft:chest", "minecraft:trapped_chest", "minecraft:furnace", "minecraft:ender_chest", "minecraft:dispenser", "minecraft:dropper", "minecraft:brewing_stand", "minecraft:hopper", "minecraft:barrel", "minecraft:smoker", "minecraft:blast_furnace", "minecraft:campfire", "minecraft:chiseled_bookshelf", "minecraft:crafter" -> {
            List var6 = var1.get("Items")
               .asList(var0x -> var0x.emptyMap().set("slot", var0x.createInt(var0x.get("Slot").asByte((byte)0) & 255)).set("item", var0x.remove("Slot")));
            if (!var6.isEmpty()) {
               var0.N("minecraft:container", var1.createList(var6.stream()));
            }

            yield var1.remove("Items");
         }
         case "minecraft:beehive" -> {
            var0.N("minecraft:bees", var1.get("bees"));
            yield var1.remove("bees");
         }
         default -> var1;
      };
   }

   private static Dynamic<?> N(class02825 var0, Dynamic<?> var1, int var2) {
      var1.get("Name").result().filter(class03731::N).ifPresent(var1x -> var0.N("minecraft:custom_name", (Dynamic<?>)var1x));
      if (var1.get("Lore").result().isPresent()) {
         var0.N("minecraft:lore", var1.createList(var1.get("Lore").asStream().filter(class03731::N)));
      }

      Optional optional = var1.get("color").asNumber().result().map(Number::intValue);
      boolean flag = (var2 & 64) != 0;
      if (optional.isPresent() || flag) {
         Dynamic var6 = var1.emptyMap().set("rgb", var1.createInt(optional.orElse(10511680)));
         if (flag) {
            var6 = var6.set("show_in_tooltip", var1.createBoolean(false));
         }

         var0.N("minecraft:dyed_color", var6);
      }

      Optional<String> optional1 = var1.get("LocName").asString().result();
      if (optional1.isPresent()) {
         var0.N("minecraft:item_name", class03731.y(var1.getOps(), optional1.get()));
      }

      if (var0.y("minecraft:filled_map")) {
         var0.N("minecraft:map_color", var1.get("MapColor"));
         var1 = var1.remove("MapColor");
      }

      return var1.remove("Name").remove("Lore").remove("color").remove("LocName");
   }

   @Nullable
   private static Dynamic<?> N(OptionalDynamic<?> var0) {
      Map map = var0.asMap(var0x -> var0x.asString(""), var0x -> var0x.asList(var0xx -> {
         String s = var0xx.get("Value").asString("");
         Optional<String> optional = var0xx.get("Signature").asString().result();
         return Pair.of(s, optional);
      }));
      return map.isEmpty() ? null : var0.createList(map.entrySet().stream().flatMap(var1x -> ((List)var1x.getValue()).stream().map(var2 -> {
         Dynamic dynamic = var0.emptyMap().set("name", var0.createString((String)var1x.getKey())).set("value", var0.createString((String)var2.getFirst()));
         Optional optional = (Optional)var2.getSecond();
         return optional.isPresent() ? dynamic.set("signature", var0.createString((String)optional.get())) : dynamic;
      })));
   }

   private static boolean N(String var0) {
      return var0.length() > 16 ? false : var0.chars().filter(var0x -> var0x <= 32 || var0x >= 127).findAny().isEmpty();
   }

   public static Dynamic<?> N(Dynamic<?> var0) {
      Optional<String> optional = var0.asString().result();
      if (optional.isPresent()) {
         return N(optional.get()) ? var0.emptyMap().set("name", var0.createString(optional.get())) : var0.emptyMap();
      } else {
         String s = var0.get("Name").asString("");
         Optional optional1 = var0.get("Id").result();
         Dynamic<?> dynamic = N(var0.get("Properties"));
         Dynamic dynamic1 = var0.emptyMap();
         if (N(s)) {
            dynamic1 = dynamic1.set("name", var0.createString(s));
         }

         if (optional1.isPresent()) {
            dynamic1 = dynamic1.set("id", (Dynamic)optional1.get());
         }

         if (dynamic != null) {
            dynamic1 = dynamic1.set("properties", dynamic);
         }

         return dynamic1;
      }
   }

   private static Dynamic<?> N(Dynamic<?> var0, String var1) {
      int ix = var1.indexOf(91);
      int j = var1.indexOf(123);
      int k = var1.length();
      if (ix != -1) {
         k = ix;
      }

      if (j != -1) {
         k = Math.min(k, j);
      }

      String s = var1.substring(0, k);
      Dynamic dynamic = var0.emptyMap().set("blocks", var0.createString(s.trim()));
      int l = var1.indexOf(93);
      if (ix != -1 && l != -1) {
         Dynamic dynamic1 = var0.emptyMap();

         for (String s1 : W.split(var1.substring(ix + 1, l))) {
            int i1 = s1.indexOf(61);
            if (i1 != -1) {
               String s2 = s1.substring(0, i1).trim();
               String s3 = s1.substring(i1 + 1).trim();
               dynamic1 = dynamic1.set(s2, var0.createString(s3));
            }
         }

         dynamic = dynamic.set("state", dynamic1);
      }

      int j1 = var1.indexOf(125);
      if (j != -1 && j1 != -1) {
         dynamic = dynamic.set("nbt", var0.createString(var1.substring(j, j1 + 1)));
      }

      return dynamic;
   }

   private static Dynamic<?> N(Dynamic<?> var0, String var1, Optional<String> var2) {
      Dynamic dynamic = var0.emptyMap().set("raw", var0.createString(var1));
      if (var2.isPresent()) {
         dynamic = dynamic.set("filtered", var0.createString((String)var2.get()));
      }

      return dynamic;
   }

   private static void N(class02825 var0) {
      var0.N("Explosion", true, var1 -> {
         var0.N("minecraft:firework_explosion", R(var1));
         return var1.remove("Type").remove("Colors").remove("FadeColors").remove("Trail").remove("Flicker");
      });
   }

   private static void N(class02825 var0, Dynamic<?> var1, String var2, String var3, boolean var4) {
      OptionalDynamic<?> optionaldynamic = var0.N(var2);
      List list = optionaldynamic.asList(Function.identity())
         .stream()
         .flatMap(var0x -> L((Dynamic<?>)var0x).stream())
         .filter(var0x -> (Integer)var0x.getSecond() > 0)
         .toList();
      if (!list.isEmpty() || var4) {
         Dynamic dynamic = var1.emptyMap();
         Dynamic dynamic1 = var1.emptyMap();

         for (Pair pair : list) {
            dynamic1 = dynamic1.set((String)pair.getFirst(), var1.createInt((Integer)pair.getSecond()));
         }

         dynamic = dynamic.set("levels", dynamic1);
         if (var4) {
            dynamic = dynamic.set("show_in_tooltip", var1.createBoolean(false));
         }

         var0.N(var3, dynamic);
      }

      if (optionaldynamic.result().isPresent() && list.isEmpty()) {
         var0.N("minecraft:enchantment_glint_override", var1.createBoolean(true));
      }
   }

   private static Dynamic<?> R(Dynamic<?> var0) {
      var0 = var0.set("shape", var0.createString(switch (var0.get("Type").asInt(0)) {
         case 1 -> "large_ball";
         case 2 -> "star";
         case 3 -> "creeper";
         case 4 -> "burst";
         default -> "small_ball";
      })).remove("Type");
      var0 = var0.renameField("Colors", "colors");
      var0 = var0.renameField("FadeColors", "fade_colors");
      var0 = var0.renameField("Trail", "has_trail");
      return var0.renameField("Flicker", "has_twinkle");
   }

   private static void R(class02825 var0, Dynamic<?> var1) {
      Dynamic<?> dynamic = var1.emptyMap();

      for (String s : U) {
         dynamic = var0.N(s, dynamic, s);
      }

      if (!dynamic.equals(var1.emptyMap())) {
         var0.N("minecraft:bucket_entity_data", dynamic);
      }
   }

   protected TypeRewriteRule makeRule() {
      return this.writeFixAndRead(
         "ItemStack componentization",
         this.getInputSchema().getType(class06962.l),
         this.getOutputSchema().getType(class06962.l),
         var0 -> (Dynamic)DataFixUtils.orElse(class02825.N(var0).map(var0x -> {
            N(var0x, var0x.N);
            return var0x.N();
         }), var0)
      );
   }
}
