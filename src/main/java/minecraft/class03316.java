package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import it.unimi.dsi.fastutil.ints.Int2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.commons.lang3.mutable.MutableObject;

public class class03316 extends DataFix {
   public static final String N = "__context";
   private static final String u = "ChunkHeightAndBiomeFix";
   private static final int i = 16;
   private static final int R = 24;
   private static final int M = -4;
   public static final int y = 4096;
   private static final int B = 64;
   private static final int Z = 9;
   private static final long z = 511L;
   private static final int U = 64;
   private static final String[] E = new String[]{
      "WORLD_SURFACE_WG", "WORLD_SURFACE", "WORLD_SURFACE_IGNORE_SNOW", "OCEAN_FLOOR_WG", "OCEAN_FLOOR", "MOTION_BLOCKING", "MOTION_BLOCKING_NO_LEAVES"
   };
   private static final Set<String> W = Set.of("surface", "carvers", "liquid_carvers", "features", "light", "spawn", "heightmaps", "full");
   private static final Set<String> m = Set.of("noise", "surface", "carvers", "liquid_carvers", "features", "light", "spawn", "heightmaps", "full");
   private static final Set<String> P = Set.of(
      "minecraft:air",
      "minecraft:basalt",
      "minecraft:bedrock",
      "minecraft:blackstone",
      "minecraft:calcite",
      "minecraft:cave_air",
      "minecraft:coarse_dirt",
      "minecraft:crimson_nylium",
      "minecraft:dirt",
      "minecraft:end_stone",
      "minecraft:grass_block",
      "minecraft:gravel",
      "minecraft:ice",
      "minecraft:lava",
      "minecraft:mycelium",
      "minecraft:nether_wart_block",
      "minecraft:netherrack",
      "minecraft:orange_terracotta",
      "minecraft:packed_ice",
      "minecraft:podzol",
      "minecraft:powder_snow",
      "minecraft:red_sand",
      "minecraft:red_sandstone",
      "minecraft:sand",
      "minecraft:sandstone",
      "minecraft:snow_block",
      "minecraft:soul_sand",
      "minecraft:soul_soil",
      "minecraft:stone",
      "minecraft:terracotta",
      "minecraft:warped_nylium",
      "minecraft:warped_wart_block",
      "minecraft:water",
      "minecraft:white_terracotta"
   );
   private static final int s = 16;
   private static final int T = 64;
   private static final int b = 1008;
   public static final String L = "minecraft:plains";
   private static final Int2ObjectMap<String> j = new Int2ObjectOpenHashMap();

   private static Dynamic<?> L(Dynamic<?> var0) {
      return var0.createLongList(var0.asLongStream().map(var0x -> {
         long ix = 0L;

         for (byte b0 = 0; b0 + 9 <= 64; b0 += 9) {
            long jx = var0x >> b0 & 511L;
            long k;
            if (jx == 0L) {
               k = 0L;
            } else {
               k = Math.min(jx + 64L, 511L);
            }

            ix |= k << b0;
         }

         return ix;
      }));
   }

   public class03316(Schema var1) {
      super(var1, true);
   }

   private static Dynamic<?> u(Dynamic<?> var0) {
      return var0.createMap(ImmutableMap.of(var0.createString("palette"), var0));
   }

   private static Dynamic<?> y(Dynamic<?> var0, Dynamic<?> var1) {
      List list = var0.asStream().collect(Collectors.toCollection(ArrayList::new));
      if (list.size() == 1) {
         return u(var0);
      } else {
         var0 = N(var0, var1, list);
         return N(var0, var1);
      }
   }

   private static Dynamic<?> y(Dynamic<?> var0) {
      return var0.update("Heightmaps", var0x -> {
         int ix = E.length;

         for (int jx = 0; jx < ix; jx++) {
            String sx = E[jx];
            var0x = var0x.update(sx, class03316::L);
         }

         return var0x;
      });
   }

   private static Dynamic<?>[] N(Dynamic<?> var0, boolean var1, int var2, MutableBoolean var3) {
      Dynamic[] adynamic = new Dynamic[var1 ? 24 : 16];
      int[] aint = var0.get("Biomes").asIntStreamOpt().result().map(IntStream::toArray).orElse(null);
      if (aint != null && aint.length == 1536) {
         var3.setValue(true);

         for (int l = 0; l < 24; l++) {
            int i1 = l;
            adynamic[l] = N(var0, (Int2IntFunction)(var2x -> N(aint, i1 * 64 + var2x)));
         }
      } else if (aint != null && aint.length == 1024) {
         for (int var6 = 0; var6 < 16; var6++) {
            int var7 = var6 - var2;
            adynamic[var7] = N(var0, (Int2IntFunction)(var2x -> N(aint, var6 * 64 + var2x)));
         }

         if (var1) {
            Dynamic<?> dynamic = N(var0, (Int2IntFunction)(var1x -> N(aint, var1x % 16)));
            Dynamic<?> dynamic1 = N(var0, (Int2IntFunction)(var1x -> N(aint, var1x % 16 + 1008)));

            for (int k = 0; k < 4; k++) {
               adynamic[k] = dynamic;
            }

            for (int j1 = 20; j1 < 24; j1++) {
               adynamic[j1] = dynamic1;
            }
         }
      } else {
         Arrays.fill(adynamic, u(var0.createList(Stream.of(var0.createString("minecraft:plains")))));
      }

      return adynamic;
   }

   private Dynamic<?> N(Dynamic<?> var1, Set<String> var2) {
      return var1.update("Status", var1x -> {
         String sx = var1x.asString("empty");
         if (W.contains(sx)) {
            return var1x;
         } else {
            var2.remove("minecraft:air");
            boolean flag = !var2.isEmpty();
            var2.removeAll(P);
            if (!var2.isEmpty()) {
               return var1x.createString("liquid_carvers");
            } else if ("noise".equals(sx) || flag) {
               return var1x.createString("noise");
            } else {
               return "biomes".equals(sx) ? var1x.createString("structure_references") : var1x;
            }
         }
      });
   }

   private static Dynamic<?> N(Dynamic<?> var0, Int2IntFunction var1) {
      Int2IntLinkedOpenHashMap int2intlinkedopenhashmap = new Int2IntLinkedOpenHashMap();

      for (int ix = 0; ix < 64; ix++) {
         int jx = var1.applyAsInt(ix);
         if (!int2intlinkedopenhashmap.containsKey(jx)) {
            int2intlinkedopenhashmap.put(jx, int2intlinkedopenhashmap.size());
         }
      }

      Dynamic dynamic = var0.createList(
         int2intlinkedopenhashmap.keySet().stream().map(var1x -> var0.createString((String)j.getOrDefault(var1x, "minecraft:plains")))
      );
      int l1 = N(int2intlinkedopenhashmap.size());
      if (l1 == 0) {
         return u(dynamic);
      } else {
         int k = 64 / l1;
         long[] along = new long[(64 + k - 1) / k];
         int l = 0;
         int i1 = 0;

         for (int var10 = 0; var10 < 64; var10++) {
            int k1 = var1.applyAsInt(var10);
            along[l] |= (long)int2intlinkedopenhashmap.get(k1) << i1;
            i1 += l1;
            if (i1 + l1 > 64) {
               l++;
               i1 = 0;
            }
         }

         Dynamic<?> dynamic1 = var0.createLongList(Arrays.stream(along));
         return N(dynamic, dynamic1);
      }
   }

   private static Dynamic<?> N(Dynamic<?> var0, Dynamic<?> var1) {
      return var0.createMap(ImmutableMap.of(var0.createString("palette"), var0, var0.createString("data"), var1));
   }

   private static Dynamic<?> N(Dynamic<?> var0, Dynamic<?> var1, List<Dynamic<?>> var2) {
      long ix = var1.asLongStream().count() * 64L / 4096L;
      int jx = var2.size();
      int k = N(jx);
      if (ix <= k) {
         return var0;
      } else {
         Dynamic dynamic = var0.createMap(ImmutableMap.of(var0.createString("Name"), var0.createString("minecraft:air")));
         int l = (1 << (int)(ix - 1L)) + 1 - jx;

         for (int i1 = 0; i1 < l; i1++) {
            var2.add(dynamic);
         }

         return var0.createList(var2.stream());
      }
   }

   public static int N(int var0) {
      return var0 == 0 ? 0 : (int)Math.ceil(Math.log(var0) / Math.log(2.0));
   }

   private static <T> Dynamic<T> N(Dynamic<T> var0) {
      return var0.update("Indices", var0x -> {
         HashMap hashmap = new HashMap();
         var0x.getMapValues().ifSuccess(var1x -> var1x.forEach((var1xx, var2) -> {
            try {
               var1xx.asString().result().map(Integer::parseInt).ifPresent(var3 -> {
                  int ix = var3 - -4;
                  hashmap.put(var1xx.createString(Integer.toString(ix)), var2);
               });
            } catch (NumberFormatException numberformatexception) {
            }
         }));
         return var0x.createMap(hashmap);
      });
   }

   private static Dynamic<?> N(Dynamic<?> var0, int var1, int var2) {
      Dynamic dynamic = var0.get("CarvingMasks").orElseEmptyMap();
      dynamic = dynamic.updateMapValues(var3x -> {
         long[] along = BitSet.valueOf(((Dynamic)var3x.getSecond()).asByteBuffer().array()).toLongArray();
         long[] along1 = new long[64 * var1];
         System.arraycopy(along, 0, along1, 64 * var2, along.length);
         return Pair.of((Dynamic)var3x.getFirst(), var0.createLongList(LongStream.of(along1)));
      });
      return var0.set("CarvingMasks", dynamic);
   }

   private static Dynamic<?> N(Dynamic<?> var0, String var1) {
      List list = var0.get(var1).orElseEmptyList().asStream().collect(Collectors.toCollection(ArrayList::new));
      if (list.size() == 24) {
         return var0;
      } else {
         Dynamic dynamic = var0.emptyList();

         for (int ix = 0; ix < 4; ix++) {
            list.add(0, dynamic);
            list.add(dynamic);
         }

         return var0.set(var1, var0.createList(list.stream()));
      }
   }

   private static Dynamic<?> N(Dynamic<?> var0, boolean var1, boolean var2, boolean var3, Supplier<class03021> var4) {
      var0 = var0.remove("Biomes");
      if (!var1) {
         return N(var0, 16, 0);
      } else if (var2) {
         return N(var0, 24, 0);
      } else {
         var0 = y(var0);
         var0 = N(var0, "LiquidsToBeTicked");
         var0 = N(var0, "PostProcessing");
         var0 = N(var0, "ToBeTicked");
         var0 = N(var0, 24, 4);
         var0 = var0.update("UpgradeData", class03316::N);
         if (!var3) {
            return var0;
         } else {
            Optional<Dynamic<?>> optional = var0.get("Status").result();
            if (optional.isPresent()) {
               Dynamic<?> dynamic = optional.get();
               String sx = dynamic.asString("");
               if (!"empty".equals(sx)) {
                  var0 = var0.set("blending_data", var0.createMap(ImmutableMap.of(var0.createString("old_noise"), var0.createBoolean(m.contains(sx)))));
                  if (!class07529.NJ) {
                     class03021 class03021 = (class03021)var4.get();
                     if (class03021 != null) {
                        BitSet bitset = new BitSet(256);
                        boolean flag = sx.equals("noise");

                        for (int var11 = 0; var11 < 16; var11++) {
                           for (int jx = 0; jx < 16; jx++) {
                              Dynamic<?> dynamic1 = class03021.N(jx, 0, var11);
                              boolean flag1 = dynamic1 != null && "minecraft:bedrock".equals(dynamic1.get("Name").asString(""));
                              if (dynamic1 != null && "minecraft:air".equals(dynamic1.get("Name").asString(""))) {
                                 bitset.set(var11 * 16 + jx);
                              }

                              flag |= flag1;
                           }
                        }

                        if (flag && bitset.cardinality() != bitset.size()) {
                           Dynamic<?> dynamic2 = "full".equals(sx) ? var0.createString("heightmaps") : dynamic;
                           var0 = var0.set(
                              "below_zero_retrogen",
                              var0.createMap(
                                 ImmutableMap.of(
                                    var0.createString("target_status"),
                                    dynamic2,
                                    var0.createString("missing_bedrock"),
                                    var0.createLongList(LongStream.of(bitset.toLongArray()))
                                 )
                              )
                           );
                           var0 = var0.set("Status", var0.createString("empty"));
                        }

                        var0 = var0.set("isLightOn", var0.createBoolean(false));
                     }
                  }
               }
            }

            return var0;
         }
      }
   }

   private static int N(int[] var0, int var1) {
      return var0[var1] & 0xFF;
   }

   protected TypeRewriteRule makeRule() {
      Type<?> type = this.getInputSchema().getType(class06962.u);
      OpticFinder<?> opticfinder = type.findField("Level");
      OpticFinder<?> opticfinder1 = opticfinder.type().findField("Sections");
      Type<?> type1 = this.getOutputSchema().getType(class06962.u);
      Type<?> type2 = type1.findField("Level").type();
      Type<?> type3 = type2.findField("Sections").type();
      return this.fixTypeEverywhereTyped(
         "ChunkHeightAndBiomeFix",
         type,
         type1,
         var5x -> var5x.updateTyped(
            opticfinder,
            type2,
            var4x -> {
               Dynamic<?> dynamic = (Dynamic<?>)var4x.get(DSL.remainderFinder());
               OptionalDynamic<?> optionaldynamic = ((Dynamic)var5x.get(DSL.remainderFinder())).get("__context");
               String sx = optionaldynamic.get("dimension").asString().result().orElse("");
               String s1 = optionaldynamic.get("generator").asString().result().orElse("");
               boolean flag = "minecraft:overworld".equals(sx);
               MutableBoolean mutableboolean = new MutableBoolean();
               int ix = flag ? -4 : 0;
               Dynamic<?>[] dynamic1 = N(dynamic, flag, ix, mutableboolean);
               Dynamic<?> dynamic2 = u(
                  dynamic.createList(Stream.of(dynamic.createMap(ImmutableMap.of(dynamic.createString("Name"), dynamic.createString("minecraft:air")))))
               );
               HashSet hashset = Sets.newHashSet();
               MutableObject mutableobject = new MutableObject((Supplier<class03021>)() -> null);
               var4x = var4x.updateTyped(
                  opticfinder1,
                  type3,
                  var7x -> {
                     IntOpenHashSet intopenhashset = new IntOpenHashSet();
                     List list = ((Dynamic)var7x.write().result().orElseThrow(() -> new IllegalStateException("Malformed Chunk.Level.Sections")))
                        .asStream()
                        .map(var6xx -> {
                           int k = var6xx.get("Y").asInt(0);
                           Dynamic dynamic1x = (Dynamic)DataFixUtils.orElse(var6xx.get("Palette").result().flatMap(var2xxxxx -> {
                              var2xxxxx.asStream().map(var0xxx -> var0xxx.get("Name").asString("minecraft:air")).forEach(hashset::add);
                              return var6xx.get("BlockStates").result().map(var1xxxxxx -> y(var2xxxxx, (Dynamic<?>)var1xxxxxx));
                           }), dynamic2);
                           Dynamic dynamic2x = var6xx;
                           int l = k - ix;
                           if (l >= 0 && l < dynamic1.length) {
                              dynamic2x = var6xx.set("biomes", dynamic1[l]);
                           }

                           intopenhashset.add(k);
                           if (var6xx.get("Y").asInt(Integer.MAX_VALUE) == 0) {
                              mutableobject.setValue((Supplier<class03021>)() -> {
                                 List listx = dynamic1.get("palette").asList(Function.identity());
                                 long[] along = dynamic1.get("data").asLongStream().toArray();
                                 return new class03021(listx, along);
                              });
                           }

                           return dynamic2x.set("block_states", dynamic1x).remove("Palette").remove("BlockStates");
                        })
                        .collect(Collectors.toCollection(ArrayList::new));

                     for (int ixx = 0; ixx < dynamic1.length; ixx++) {
                        int jx = ixx + ix;
                        if (intopenhashset.add(jx)) {
                           Dynamic dynamicx = dynamic.createMap(Map.of(dynamic.createString("Y"), dynamic.createInt(jx)));
                           dynamicx = dynamicx.set("block_states", dynamic2);
                           dynamicx = dynamicx.set("biomes", dynamic1[ixx]);
                           list.add(dynamicx);
                        }
                     }

                     return class07536.N(type3, dynamic.createList(list.stream()));
                  }
               );
               return var4x.update(DSL.remainderFinder(), var6x -> {
                  if (flag) {
                     var6x = this.N(var6x, hashset);
                  }

                  return N(var6x, flag, mutableboolean.booleanValue(), "minecraft:noise".equals(s1), (Supplier<class03021>)mutableobject.get());
               });
            }
         )
      );
   }

   static {
      j.put(0, "minecraft:ocean");
      j.put(1, "minecraft:plains");
      j.put(2, "minecraft:desert");
      j.put(3, "minecraft:mountains");
      j.put(4, "minecraft:forest");
      j.put(5, "minecraft:taiga");
      j.put(6, "minecraft:swamp");
      j.put(7, "minecraft:river");
      j.put(8, "minecraft:nether_wastes");
      j.put(9, "minecraft:the_end");
      j.put(10, "minecraft:frozen_ocean");
      j.put(11, "minecraft:frozen_river");
      j.put(12, "minecraft:snowy_tundra");
      j.put(13, "minecraft:snowy_mountains");
      j.put(14, "minecraft:mushroom_fields");
      j.put(15, "minecraft:mushroom_field_shore");
      j.put(16, "minecraft:beach");
      j.put(17, "minecraft:desert_hills");
      j.put(18, "minecraft:wooded_hills");
      j.put(19, "minecraft:taiga_hills");
      j.put(20, "minecraft:mountain_edge");
      j.put(21, "minecraft:jungle");
      j.put(22, "minecraft:jungle_hills");
      j.put(23, "minecraft:jungle_edge");
      j.put(24, "minecraft:deep_ocean");
      j.put(25, "minecraft:stone_shore");
      j.put(26, "minecraft:snowy_beach");
      j.put(27, "minecraft:birch_forest");
      j.put(28, "minecraft:birch_forest_hills");
      j.put(29, "minecraft:dark_forest");
      j.put(30, "minecraft:snowy_taiga");
      j.put(31, "minecraft:snowy_taiga_hills");
      j.put(32, "minecraft:giant_tree_taiga");
      j.put(33, "minecraft:giant_tree_taiga_hills");
      j.put(34, "minecraft:wooded_mountains");
      j.put(35, "minecraft:savanna");
      j.put(36, "minecraft:savanna_plateau");
      j.put(37, "minecraft:badlands");
      j.put(38, "minecraft:wooded_badlands_plateau");
      j.put(39, "minecraft:badlands_plateau");
      j.put(40, "minecraft:small_end_islands");
      j.put(41, "minecraft:end_midlands");
      j.put(42, "minecraft:end_highlands");
      j.put(43, "minecraft:end_barrens");
      j.put(44, "minecraft:warm_ocean");
      j.put(45, "minecraft:lukewarm_ocean");
      j.put(46, "minecraft:cold_ocean");
      j.put(47, "minecraft:deep_warm_ocean");
      j.put(48, "minecraft:deep_lukewarm_ocean");
      j.put(49, "minecraft:deep_cold_ocean");
      j.put(50, "minecraft:deep_frozen_ocean");
      j.put(127, "minecraft:the_void");
      j.put(129, "minecraft:sunflower_plains");
      j.put(130, "minecraft:desert_lakes");
      j.put(131, "minecraft:gravelly_mountains");
      j.put(132, "minecraft:flower_forest");
      j.put(133, "minecraft:taiga_mountains");
      j.put(134, "minecraft:swamp_hills");
      j.put(140, "minecraft:ice_spikes");
      j.put(149, "minecraft:modified_jungle");
      j.put(151, "minecraft:modified_jungle_edge");
      j.put(155, "minecraft:tall_birch_forest");
      j.put(156, "minecraft:tall_birch_hills");
      j.put(157, "minecraft:dark_forest_hills");
      j.put(158, "minecraft:snowy_taiga_mountains");
      j.put(160, "minecraft:giant_spruce_taiga");
      j.put(161, "minecraft:giant_spruce_taiga_hills");
      j.put(162, "minecraft:modified_gravelly_mountains");
      j.put(163, "minecraft:shattered_savanna");
      j.put(164, "minecraft:shattered_savanna_plateau");
      j.put(165, "minecraft:eroded_badlands");
      j.put(166, "minecraft:modified_wooded_badlands_plateau");
      j.put(167, "minecraft:modified_badlands_plateau");
      j.put(168, "minecraft:bamboo_jungle");
      j.put(169, "minecraft:bamboo_jungle_hills");
      j.put(170, "minecraft:soul_sand_valley");
      j.put(171, "minecraft:crimson_forest");
      j.put(172, "minecraft:warped_forest");
      j.put(173, "minecraft:basalt_deltas");
      j.put(174, "minecraft:dripstone_caves");
      j.put(175, "minecraft:lush_caves");
      j.put(177, "minecraft:meadow");
      j.put(178, "minecraft:grove");
      j.put(179, "minecraft:snowy_slopes");
      j.put(180, "minecraft:snowcapped_peaks");
      j.put(181, "minecraft:lofty_peaks");
      j.put(182, "minecraft:stony_peaks");
   }
}
