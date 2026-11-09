package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicLike;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.OptionalDynamic;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.commons.lang3.mutable.MutableInt;

public class class05972 extends DataFix {
   private static final String N = "minecraft:village";
   private static final String y = "minecraft:desert_pyramid";
   private static final String L = "minecraft:igloo";
   private static final String u = "minecraft:jungle_pyramid";
   private static final String i = "minecraft:swamp_hut";
   private static final String R = "minecraft:pillager_outpost";
   private static final String M = "minecraft:endcity";
   private static final String B = "minecraft:mansion";
   private static final String Z = "minecraft:monument";
   private static final ImmutableMap<String, class05948> z = ImmutableMap.builder()
      .put("minecraft:village", new class05948(32, 8, 10387312))
      .put("minecraft:desert_pyramid", new class05948(32, 8, 14357617))
      .put("minecraft:igloo", new class05948(32, 8, 14357618))
      .put("minecraft:jungle_pyramid", new class05948(32, 8, 14357619))
      .put("minecraft:swamp_hut", new class05948(32, 8, 14357620))
      .put("minecraft:pillager_outpost", new class05948(32, 8, 165745296))
      .put("minecraft:monument", new class05948(32, 5, 10387313))
      .put("minecraft:endcity", new class05948(20, 11, 10387313))
      .put("minecraft:mansion", new class05948(80, 20, 10387319))
      .build();

   public class05972(Schema var1) {
      super(var1, true);
   }

   private static <T> Dynamic<T> N(Dynamic<T> var0, long var1, boolean var3, boolean var4) {
      Builder builder = ImmutableMap.builder()
         .put(var0.createString("type"), var0.createString("minecraft:vanilla_layered"))
         .put(var0.createString("seed"), var0.createLong(var1))
         .put(var0.createString("large_biomes"), var0.createBoolean(var4));
      if (var3) {
         builder.put(var0.createString("legacy_biome_init_layer"), var0.createBoolean(var3));
      }

      return var0.createMap(builder.build());
   }

   private static <T> Map<Dynamic<T>, Dynamic<T>> N(DynamicOps<T> var0, OptionalDynamic<T> var1) {
      MutableInt mutableint = new MutableInt(32);
      MutableInt mutableint1 = new MutableInt(3);
      MutableInt mutableint2 = new MutableInt(128);
      MutableBoolean mutableboolean = new MutableBoolean(false);
      HashMap hashmap = Maps.newHashMap();
      if (var1.result().isEmpty()) {
         mutableboolean.setTrue();
         hashmap.put("minecraft:village", (class05948)z.get("minecraft:village"));
      }

      var1.get("structures")
         .flatMap(Dynamic::getMapValues)
         .ifSuccess(var5x -> var5x.forEach((var5xx, var6x) -> var6x.getMapValues().result().ifPresent(var6xx -> var6xx.forEach((var6xxx, var7x) -> {
            String s = var5xx.asString("");
            String s1 = var6xxx.asString("");
            String s2 = var7x.asString("");
            if ("stronghold".equals(s)) {
               mutableboolean.setTrue();
               switch (s1) {
                  case "distance":
                     mutableint.setValue(N(s2, mutableint.intValue(), 1));
                     return;
                  case "spread":
                     mutableint1.setValue(N(s2, mutableint1.intValue(), 1));
                     return;
                  case "count":
                     mutableint2.setValue(N(s2, mutableint2.intValue(), 1));
                     return;
               }
            } else {
               switch (s1) {
                  case "distance":
                     switch (s) {
                        case "village":
                           N(hashmap, "minecraft:village", s2, 9);
                           return;
                        case "biome_1":
                           N(hashmap, "minecraft:desert_pyramid", s2, 9);
                           N(hashmap, "minecraft:igloo", s2, 9);
                           N(hashmap, "minecraft:jungle_pyramid", s2, 9);
                           N(hashmap, "minecraft:swamp_hut", s2, 9);
                           N(hashmap, "minecraft:pillager_outpost", s2, 9);
                           return;
                        case "endcity":
                           N(hashmap, "minecraft:endcity", s2, 1);
                           return;
                        case "mansion":
                           N(hashmap, "minecraft:mansion", s2, 1);
                           return;
                        default:
                           return;
                     }
                  case "separation":
                     if ("oceanmonument".equals(s)) {
                        class05948 class05948 = (class05948)hashmap.getOrDefault("minecraft:monument", (class05948)z.get("minecraft:monument"));
                        int ix = N(s2, class05948.L, 1);
                        hashmap.put("minecraft:monument", new class05948(ix, class05948.L, class05948.u));
                     }

                     return;
                  case "spacing":
                     if ("oceanmonument".equals(s)) {
                        N(hashmap, "minecraft:monument", s2, 1);
                     }

                     return;
               }
            }
         }))));
      Builder builder = ImmutableMap.builder();
      builder.put(
         var1.createString("structures"),
         var1.createMap(
            hashmap.entrySet()
               .stream()
               .collect(Collectors.toMap(var1x -> var1.createString((String)var1x.getKey()), var1x -> ((class05948)var1x.getValue()).N(var0)))
         )
      );
      if (mutableboolean.isTrue()) {
         builder.put(
            var1.createString("stronghold"),
            var1.createMap(
               ImmutableMap.of(
                  var1.createString("distance"),
                  var1.createInt(mutableint.intValue()),
                  var1.createString("spread"),
                  var1.createInt(mutableint1.intValue()),
                  var1.createString("count"),
                  var1.createInt(mutableint2.intValue())
               )
            )
         );
      }

      return builder.build();
   }

   protected static <T> T N(Dynamic<T> var0, long var1, Dynamic<T> var3, boolean var4) {
      DynamicOps dynamicops = var0.getOps();
      return (T)dynamicops.createMap(
         ImmutableMap.of(
            dynamicops.createString("minecraft:overworld"),
            dynamicops.createMap(
               ImmutableMap.of(
                  dynamicops.createString("type"),
                  dynamicops.createString("minecraft:overworld" + (var4 ? "_caves" : "")),
                  dynamicops.createString("generator"),
                  var3.getValue()
               )
            ),
            dynamicops.createString("minecraft:the_nether"),
            dynamicops.createMap(
               ImmutableMap.of(
                  dynamicops.createString("type"),
                  dynamicops.createString("minecraft:the_nether"),
                  dynamicops.createString("generator"),
                  N(
                        var1,
                        var0,
                        var0.createString("minecraft:nether"),
                        var0.createMap(
                           ImmutableMap.of(
                              var0.createString("type"),
                              var0.createString("minecraft:multi_noise"),
                              var0.createString("seed"),
                              var0.createLong(var1),
                              var0.createString("preset"),
                              var0.createString("minecraft:nether")
                           )
                        )
                     )
                     .getValue()
               )
            ),
            dynamicops.createString("minecraft:the_end"),
            dynamicops.createMap(
               ImmutableMap.of(
                  dynamicops.createString("type"),
                  dynamicops.createString("minecraft:the_end"),
                  dynamicops.createString("generator"),
                  N(
                        var1,
                        var0,
                        var0.createString("minecraft:end"),
                        var0.createMap(
                           ImmutableMap.of(var0.createString("type"), var0.createString("minecraft:the_end"), var0.createString("seed"), var0.createLong(var1))
                        )
                     )
                     .getValue()
               )
            )
         )
      );
   }

   protected static <T> Dynamic<T> N(Dynamic<T> var0, long var1) {
      return N(var1, var0, var0.createString("minecraft:overworld"), N(var0, var1, false, false));
   }

   private static <T> Dynamic<T> N(Dynamic<T> var0) {
      DynamicOps dynamicops = var0.getOps();
      long ix = var0.get("RandomSeed").asLong(0L);
      Optional optional = var0.get("generatorName").asString().map(var0x -> var0x.toLowerCase(Locale.ROOT)).result();
      Optional optional1 = var0.get("legacy_custom_options")
         .asString()
         .result()
         .map(Optional::of)
         .orElseGet(() -> optional.equals(Optional.of("customized")) ? var0.get("generatorOptions").asString().result() : Optional.empty());
      boolean flag = false;
      Dynamic dynamic;
      if (optional.equals(Optional.of("customized"))) {
         dynamic = N(var0, ix);
      } else if (optional.isEmpty()) {
         dynamic = N(var0, ix);
      } else {
         String s = (String)optional.get();
         switch (s) {
            case "flat":
               OptionalDynamic optionaldynamic = var0.get("generatorOptions");
               Map map = N(dynamicops, optionaldynamic);
               dynamic = var0.createMap(
                  ImmutableMap.of(
                     var0.createString("type"),
                     var0.createString("minecraft:flat"),
                     var0.createString("settings"),
                     var0.createMap(
                        ImmutableMap.of(
                           var0.createString("structures"),
                           var0.createMap(map),
                           var0.createString("layers"),
                           optionaldynamic.get("layers")
                              .result()
                              .orElseGet(
                                 () -> var0.createList(
                                    Stream.of(
                                       var0.createMap(
                                          ImmutableMap.of(
                                             var0.createString("height"), var0.createInt(1), var0.createString("block"), var0.createString("minecraft:bedrock")
                                          )
                                       ),
                                       var0.createMap(
                                          ImmutableMap.of(
                                             var0.createString("height"), var0.createInt(2), var0.createString("block"), var0.createString("minecraft:dirt")
                                          )
                                       ),
                                       var0.createMap(
                                          ImmutableMap.of(
                                             var0.createString("height"),
                                             var0.createInt(1),
                                             var0.createString("block"),
                                             var0.createString("minecraft:grass_block")
                                          )
                                       )
                                    )
                                 )
                              ),
                           var0.createString("biome"),
                           var0.createString(optionaldynamic.get("biome").asString("minecraft:plains"))
                        )
                     )
                  )
               );
               break;
            case "debug_all_block_states":
               dynamic = var0.createMap(ImmutableMap.of(var0.createString("type"), var0.createString("minecraft:debug")));
               break;
            case "buffet":
               OptionalDynamic optionaldynamic1 = var0.get("generatorOptions");
               Optional optional2 = optionaldynamic1.get("chunk_generator").get("type").asString().result();
               Dynamic dynamic1;
               if (Objects.equals(optional2, Optional.of("minecraft:caves"))) {
                  dynamic1 = var0.createString("minecraft:caves");
                  flag = true;
               } else if (Objects.equals(optional2, Optional.of("minecraft:floating_islands"))) {
                  dynamic1 = var0.createString("minecraft:floating_islands");
               } else {
                  dynamic1 = var0.createString("minecraft:overworld");
               }

               Dynamic dynamic2 = optionaldynamic1.get("biome_source")
                  .result()
                  .orElseGet(() -> var0.createMap(ImmutableMap.of(var0.createString("type"), var0.createString("minecraft:fixed"))));
               Dynamic dynamic3;
               if (dynamic2.get("type").asString().result().equals(Optional.of("minecraft:fixed"))) {
                  String s1 = dynamic2.get("options")
                     .get("biomes")
                     .asStream()
                     .findFirst()
                     .flatMap(var0x -> var0x.asString().result())
                     .orElse("minecraft:ocean");
                  dynamic3 = dynamic2.remove("options").set("biome", var0.createString(s1));
               } else {
                  dynamic3 = dynamic2;
               }

               dynamic = N(ix, var0, dynamic1, dynamic3);
               break;
            default:
               boolean flag1 = ((String)optional.get()).equals("default");
               boolean flag2 = ((String)optional.get()).equals("default_1_1") || flag1 && var0.get("generatorVersion").asInt(0) == 0;
               boolean flag3 = ((String)optional.get()).equals("amplified");
               boolean flag4 = ((String)optional.get()).equals("largebiomes");
               dynamic = N(ix, var0, var0.createString(flag3 ? "minecraft:amplified" : "minecraft:overworld"), N(var0, ix, flag2, flag4));
         }
      }

      boolean flag5 = var0.get("MapFeatures").asBoolean(true);
      boolean flag6 = var0.get("BonusChest").asBoolean(false);
      Builder builder = ImmutableMap.builder();
      builder.put(dynamicops.createString("seed"), dynamicops.createLong(ix));
      builder.put(dynamicops.createString("generate_features"), dynamicops.createBoolean(flag5));
      builder.put(dynamicops.createString("bonus_chest"), dynamicops.createBoolean(flag6));
      builder.put(dynamicops.createString("dimensions"), N(var0, ix, dynamic, flag));
      optional1.ifPresent(var2x -> builder.put(dynamicops.createString("legacy_custom_options"), dynamicops.createString(var2x)));
      return new Dynamic(dynamicops, dynamicops.createMap(builder.build()));
   }

   private static <T> Dynamic<T> N(long var0, DynamicLike<T> var2, Dynamic<T> var3, Dynamic<T> var4) {
      return var2.createMap(
         ImmutableMap.of(
            var2.createString("type"),
            var2.createString("minecraft:noise"),
            var2.createString("biome_source"),
            var4,
            var2.createString("seed"),
            var2.createLong(var0),
            var2.createString("settings"),
            var3
         )
      );
   }

   private static void N(Map<String, class05948> var0, String var1, String var2, int var3) {
      class05948 class05948 = (class05948)var0.getOrDefault(var1, (class05948)z.get(var1));
      int ix = N(var2, class05948.y, var3);
      var0.put(var1, new class05948(ix, class05948.L, class05948.u));
   }

   private static int N(String var0, int var1, int var2) {
      return Math.max(var2, N(var0, var1));
   }

   private static int N(String var0, int var1) {
      return NumberUtils.toInt(var0, var1);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "WorldGenSettings building", this.getInputSchema().getType(class06962.A), var0 -> var0.update(DSL.remainderFinder(), class05972::N)
      );
   }
}
