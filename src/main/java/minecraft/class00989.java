package minecraft;

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public class class00989 extends DataFix {
   static final Map<String, String> N = class07536.N(Maps.newHashMap(), var0 -> {
      var0.put("0", "minecraft:ocean");
      var0.put("1", "minecraft:plains");
      var0.put("2", "minecraft:desert");
      var0.put("3", "minecraft:mountains");
      var0.put("4", "minecraft:forest");
      var0.put("5", "minecraft:taiga");
      var0.put("6", "minecraft:swamp");
      var0.put("7", "minecraft:river");
      var0.put("8", "minecraft:nether");
      var0.put("9", "minecraft:the_end");
      var0.put("10", "minecraft:frozen_ocean");
      var0.put("11", "minecraft:frozen_river");
      var0.put("12", "minecraft:snowy_tundra");
      var0.put("13", "minecraft:snowy_mountains");
      var0.put("14", "minecraft:mushroom_fields");
      var0.put("15", "minecraft:mushroom_field_shore");
      var0.put("16", "minecraft:beach");
      var0.put("17", "minecraft:desert_hills");
      var0.put("18", "minecraft:wooded_hills");
      var0.put("19", "minecraft:taiga_hills");
      var0.put("20", "minecraft:mountain_edge");
      var0.put("21", "minecraft:jungle");
      var0.put("22", "minecraft:jungle_hills");
      var0.put("23", "minecraft:jungle_edge");
      var0.put("24", "minecraft:deep_ocean");
      var0.put("25", "minecraft:stone_shore");
      var0.put("26", "minecraft:snowy_beach");
      var0.put("27", "minecraft:birch_forest");
      var0.put("28", "minecraft:birch_forest_hills");
      var0.put("29", "minecraft:dark_forest");
      var0.put("30", "minecraft:snowy_taiga");
      var0.put("31", "minecraft:snowy_taiga_hills");
      var0.put("32", "minecraft:giant_tree_taiga");
      var0.put("33", "minecraft:giant_tree_taiga_hills");
      var0.put("34", "minecraft:wooded_mountains");
      var0.put("35", "minecraft:savanna");
      var0.put("36", "minecraft:savanna_plateau");
      var0.put("37", "minecraft:badlands");
      var0.put("38", "minecraft:wooded_badlands_plateau");
      var0.put("39", "minecraft:badlands_plateau");
      var0.put("40", "minecraft:small_end_islands");
      var0.put("41", "minecraft:end_midlands");
      var0.put("42", "minecraft:end_highlands");
      var0.put("43", "minecraft:end_barrens");
      var0.put("44", "minecraft:warm_ocean");
      var0.put("45", "minecraft:lukewarm_ocean");
      var0.put("46", "minecraft:cold_ocean");
      var0.put("47", "minecraft:deep_warm_ocean");
      var0.put("48", "minecraft:deep_lukewarm_ocean");
      var0.put("49", "minecraft:deep_cold_ocean");
      var0.put("50", "minecraft:deep_frozen_ocean");
      var0.put("127", "minecraft:the_void");
      var0.put("129", "minecraft:sunflower_plains");
      var0.put("130", "minecraft:desert_lakes");
      var0.put("131", "minecraft:gravelly_mountains");
      var0.put("132", "minecraft:flower_forest");
      var0.put("133", "minecraft:taiga_mountains");
      var0.put("134", "minecraft:swamp_hills");
      var0.put("140", "minecraft:ice_spikes");
      var0.put("149", "minecraft:modified_jungle");
      var0.put("151", "minecraft:modified_jungle_edge");
      var0.put("155", "minecraft:tall_birch_forest");
      var0.put("156", "minecraft:tall_birch_hills");
      var0.put("157", "minecraft:dark_forest_hills");
      var0.put("158", "minecraft:snowy_taiga_mountains");
      var0.put("160", "minecraft:giant_spruce_taiga");
      var0.put("161", "minecraft:giant_spruce_taiga_hills");
      var0.put("162", "minecraft:modified_gravelly_mountains");
      var0.put("163", "minecraft:shattered_savanna");
      var0.put("164", "minecraft:shattered_savanna_plateau");
      var0.put("165", "minecraft:eroded_badlands");
      var0.put("166", "minecraft:modified_wooded_badlands_plateau");
      var0.put("167", "minecraft:modified_badlands_plateau");
   });
   public static final String y = "generatorOptions";

   public class00989(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private static List<Pair<Integer, String>> y(String var0) {
      ArrayList arraylist = Lists.newArrayList();
      String[] astring = var0.split(",");
      int i = astring.length;

      for (int j = 0; j < i; j++) {
         Pair pair = N(astring[j]);
         if (pair == null) {
            return Collections.emptyList();
         }

         arraylist.add(pair);
      }

      return arraylist;
   }

   private static <T> Dynamic<T> N(String var0, DynamicOps<T> var1) {
      Iterator iterator = Splitter.on(';').split(var0).iterator();
      String s = "minecraft:plains";
      HashMap hashmap = Maps.newHashMap();
      Object object;
      if (!var0.isEmpty() && iterator.hasNext()) {
         object = y((String)iterator.next());
         if (!object.isEmpty()) {
            if (iterator.hasNext()) {
               s = N.getOrDefault(iterator.next(), "minecraft:plains");
            }

            if (iterator.hasNext()) {
               String[] astring = ((String)iterator.next()).toLowerCase(Locale.ROOT).split(",");
               String[] astring1 = astring;
               int i = astring.length;

               for (int j = 0; j < i; j++) {
                  String[] astring2 = astring1[j].split("\\(", 2);
                  if (!astring2[0].isEmpty()) {
                     hashmap.put(astring2[0], Maps.newHashMap());
                     if (astring2.length > 1 && astring2[1].endsWith(")") && astring2[1].length() > 1) {
                        String[] astring3 = astring2[1].substring(0, astring2[1].length() - 1).split(" ");
                        int k = astring3.length;

                        for (int l = 0; l < k; l++) {
                           String[] astring4 = astring3[l].split("=", 2);
                           if (astring4.length == 2) {
                              ((Map)hashmap.get(astring2[0])).put(astring4[0], astring4[1]);
                           }
                        }
                     }
                  }
               }
            } else {
               hashmap.put("village", Maps.newHashMap());
            }
         }
      } else {
         object = Lists.newArrayList();
         object.add(Pair.of(1, "minecraft:bedrock"));
         object.add(Pair.of(2, "minecraft:dirt"));
         object.add(Pair.of(1, "minecraft:grass_block"));
         hashmap.put("village", Maps.newHashMap());
      }

      Object object1 = var1.createList(
         object.stream()
            .map(
               var1x -> var1.createMap(
                  ImmutableMap.of(
                     var1.createString("height"),
                     var1.createInt((Integer)var1x.getFirst()),
                     var1.createString("block"),
                     var1.createString((String)var1x.getSecond())
                  )
               )
            )
      );
      Object object2 = var1.createMap(
         hashmap.entrySet()
            .stream()
            .map(
               var1x -> Pair.of(
                  var1.createString(((String)var1x.getKey()).toLowerCase(Locale.ROOT)),
                  var1.createMap(
                     ((Map)var1x.getValue())
                        .entrySet()
                        .stream()
                        .map(var1xx -> Pair.of(var1.createString((String)var1xx.getKey()), var1.createString((String)var1xx.getValue())))
                        .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond))
                  )
               )
            )
            .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond))
      );
      return new Dynamic(
         var1,
         var1.createMap(
            ImmutableMap.of(var1.createString("layers"), object1, var1.createString("biome"), var1.createString(s), var1.createString("structures"), object2)
         )
      );
   }

   @Nullable
   private static Pair<Integer, String> N(String var0) {
      String[] astring = var0.split("\\*", 2);
      int i;
      if (astring.length == 2) {
         try {
            i = Integer.parseInt(astring[0]);
         } catch (NumberFormatException numberformatexception) {
            return null;
         }
      } else {
         i = 1;
      }

      String s = astring[astring.length - 1];
      return Pair.of(i, s);
   }

   protected TypeRewriteRule makeRule() {
      Type type = this.getOutputSchema().getType(class06962.N);
      return this.fixTypeEverywhereTyped(
         "LevelDataGeneratorOptionsFix", this.getInputSchema().getType(class06962.N), type, var1x -> class07536.N(var1x, type, var0x -> {
            Optional optional = var0x.get("generatorOptions").asString().result();
            if ("flat".equalsIgnoreCase(var0x.get("generatorName").asString(""))) {
               String s = optional.orElse("");
               return var0x.set("generatorOptions", N(s, var0x.getOps()));
            } else if ("buffet".equalsIgnoreCase(var0x.get("generatorName").asString("")) && optional.isPresent()) {
               JsonElement jsonelement = class08314.N((String)optional.get());
               return var0x.set("generatorOptions", new Dynamic(JsonOps.INSTANCE, jsonelement).convert(var0x.getOps()));
            } else {
               return var0x;
            }
         })
      );
   }
}
