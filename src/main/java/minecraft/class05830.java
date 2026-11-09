package minecraft;

import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class class05830 {
   static final BitSet N = new BitSet(256);
   static final BitSet y = new BitSet(256);
   static final Dynamic<?> L = class02269.N("minecraft:pumpkin");
   static final Dynamic<?> u = class02269.N("minecraft:podzol", Map.of("snowy", "true"));
   static final Dynamic<?> i = class02269.N("minecraft:grass_block", Map.of("snowy", "true"));
   static final Dynamic<?> R = class02269.N("minecraft:mycelium", Map.of("snowy", "true"));
   static final Dynamic<?> M = class02269.N("minecraft:sunflower", Map.of("half", "upper"));
   static final Dynamic<?> B = class02269.N("minecraft:lilac", Map.of("half", "upper"));
   static final Dynamic<?> Z = class02269.N("minecraft:tall_grass", Map.of("half", "upper"));
   static final Dynamic<?> z = class02269.N("minecraft:large_fern", Map.of("half", "upper"));
   static final Dynamic<?> U = class02269.N("minecraft:rose_bush", Map.of("half", "upper"));
   static final Dynamic<?> E = class02269.N("minecraft:peony", Map.of("half", "upper"));
   static final Map<String, Dynamic<?>> W = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), var0 -> {
      var0.put("minecraft:air0", class02269.N("minecraft:flower_pot"));
      var0.put("minecraft:red_flower0", class02269.N("minecraft:potted_poppy"));
      var0.put("minecraft:red_flower1", class02269.N("minecraft:potted_blue_orchid"));
      var0.put("minecraft:red_flower2", class02269.N("minecraft:potted_allium"));
      var0.put("minecraft:red_flower3", class02269.N("minecraft:potted_azure_bluet"));
      var0.put("minecraft:red_flower4", class02269.N("minecraft:potted_red_tulip"));
      var0.put("minecraft:red_flower5", class02269.N("minecraft:potted_orange_tulip"));
      var0.put("minecraft:red_flower6", class02269.N("minecraft:potted_white_tulip"));
      var0.put("minecraft:red_flower7", class02269.N("minecraft:potted_pink_tulip"));
      var0.put("minecraft:red_flower8", class02269.N("minecraft:potted_oxeye_daisy"));
      var0.put("minecraft:yellow_flower0", class02269.N("minecraft:potted_dandelion"));
      var0.put("minecraft:sapling0", class02269.N("minecraft:potted_oak_sapling"));
      var0.put("minecraft:sapling1", class02269.N("minecraft:potted_spruce_sapling"));
      var0.put("minecraft:sapling2", class02269.N("minecraft:potted_birch_sapling"));
      var0.put("minecraft:sapling3", class02269.N("minecraft:potted_jungle_sapling"));
      var0.put("minecraft:sapling4", class02269.N("minecraft:potted_acacia_sapling"));
      var0.put("minecraft:sapling5", class02269.N("minecraft:potted_dark_oak_sapling"));
      var0.put("minecraft:red_mushroom0", class02269.N("minecraft:potted_red_mushroom"));
      var0.put("minecraft:brown_mushroom0", class02269.N("minecraft:potted_brown_mushroom"));
      var0.put("minecraft:deadbush0", class02269.N("minecraft:potted_dead_bush"));
      var0.put("minecraft:tallgrass2", class02269.N("minecraft:potted_fern"));
      var0.put("minecraft:cactus0", class02269.N("minecraft:potted_cactus"));
   });
   static final Map<String, Dynamic<?>> m = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), var0 -> {
      N(var0, 0, "skeleton", "skull");
      N(var0, 1, "wither_skeleton", "skull");
      N(var0, 2, "zombie", "head");
      N(var0, 3, "player", "head");
      N(var0, 4, "creeper", "head");
      N(var0, 5, "dragon", "head");
   });
   static final Map<String, Dynamic<?>> P = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), var0 -> {
      N(var0, "oak_door");
      N(var0, "iron_door");
      N(var0, "spruce_door");
      N(var0, "birch_door");
      N(var0, "jungle_door");
      N(var0, "acacia_door");
      N(var0, "dark_oak_door");
   });
   static final Map<String, Dynamic<?>> s = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), var0 -> {
      for (int ix = 0; ix < 26; ix++) {
         var0.put("true" + ix, class02269.N("minecraft:note_block", Map.of("powered", "true", "note", String.valueOf(ix))));
         var0.put("false" + ix, class02269.N("minecraft:note_block", Map.of("powered", "false", "note", String.valueOf(ix))));
      }
   });
   private static final Int2ObjectMap<String> v = (Int2ObjectMap<String>)DataFixUtils.make(new Int2ObjectOpenHashMap(), var0 -> {
      var0.put(0, "white");
      var0.put(1, "orange");
      var0.put(2, "magenta");
      var0.put(3, "light_blue");
      var0.put(4, "yellow");
      var0.put(5, "lime");
      var0.put(6, "pink");
      var0.put(7, "gray");
      var0.put(8, "light_gray");
      var0.put(9, "cyan");
      var0.put(10, "purple");
      var0.put(11, "blue");
      var0.put(12, "brown");
      var0.put(13, "green");
      var0.put(14, "red");
      var0.put(15, "black");
   });
   static final Map<String, Dynamic<?>> T = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), var0 -> {
      ObjectIterator<Entry<String>> objectiterator = v.int2ObjectEntrySet().iterator();

      while (objectiterator.hasNext()) {
         Entry entry = (Entry)objectiterator.next();
         if (!Objects.equals(entry.getValue(), "red")) {
            N(var0, entry.getIntKey(), (String)entry.getValue());
         }
      }
   });
   static final Map<String, Dynamic<?>> b = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), var0 -> {
      ObjectIterator<Entry<String>> objectiterator = v.int2ObjectEntrySet().iterator();

      while (objectiterator.hasNext()) {
         Entry entry = (Entry)objectiterator.next();
         if (!Objects.equals(entry.getValue(), "white")) {
            y(var0, 15 - entry.getIntKey(), (String)entry.getValue());
         }
      }
   });
   static final Dynamic<?> j = class02269.N("minecraft:air");

   private class05830() {
      super();
   }

   static {
      y.set(2);
      y.set(3);
      y.set(110);
      y.set(140);
      y.set(144);
      y.set(25);
      y.set(86);
      y.set(26);
      y.set(176);
      y.set(177);
      y.set(175);
      y.set(64);
      y.set(71);
      y.set(193);
      y.set(194);
      y.set(195);
      y.set(196);
      y.set(197);
      N.set(54);
      N.set(146);
      N.set(25);
      N.set(26);
      N.set(51);
      N.set(53);
      N.set(67);
      N.set(108);
      N.set(109);
      N.set(114);
      N.set(128);
      N.set(134);
      N.set(135);
      N.set(136);
      N.set(156);
      N.set(163);
      N.set(164);
      N.set(180);
      N.set(203);
      N.set(55);
      N.set(85);
      N.set(113);
      N.set(188);
      N.set(189);
      N.set(190);
      N.set(191);
      N.set(192);
      N.set(93);
      N.set(94);
      N.set(101);
      N.set(102);
      N.set(160);
      N.set(106);
      N.set(107);
      N.set(183);
      N.set(184);
      N.set(185);
      N.set(186);
      N.set(187);
      N.set(132);
      N.set(139);
      N.set(199);
   }

   private static void y(Map<String, Dynamic<?>> var0, int var1, String var2) {
      for (int ix = 0; ix < 16; ix++) {
         var0.put(ix + "_" + var1, class02269.N("minecraft:" + var2 + "_banner", Map.of("rotation", String.valueOf(ix))));
      }

      var0.put("north_" + var1, class02269.N("minecraft:" + var2 + "_wall_banner", Map.of("facing", "north")));
      var0.put("south_" + var1, class02269.N("minecraft:" + var2 + "_wall_banner", Map.of("facing", "south")));
      var0.put("west_" + var1, class02269.N("minecraft:" + var2 + "_wall_banner", Map.of("facing", "west")));
      var0.put("east_" + var1, class02269.N("minecraft:" + var2 + "_wall_banner", Map.of("facing", "east")));
   }

   private static void N(Map<String, Dynamic<?>> var0, int var1, String var2) {
      var0.put("southfalsefoot" + var1, class02269.N("minecraft:" + var2 + "_bed", Map.of("facing", "south", "occupied", "false", "part", "foot")));
      var0.put("westfalsefoot" + var1, class02269.N("minecraft:" + var2 + "_bed", Map.of("facing", "west", "occupied", "false", "part", "foot")));
      var0.put("northfalsefoot" + var1, class02269.N("minecraft:" + var2 + "_bed", Map.of("facing", "north", "occupied", "false", "part", "foot")));
      var0.put("eastfalsefoot" + var1, class02269.N("minecraft:" + var2 + "_bed", Map.of("facing", "east", "occupied", "false", "part", "foot")));
      var0.put("southfalsehead" + var1, class02269.N("minecraft:" + var2 + "_bed", Map.of("facing", "south", "occupied", "false", "part", "head")));
      var0.put("westfalsehead" + var1, class02269.N("minecraft:" + var2 + "_bed", Map.of("facing", "west", "occupied", "false", "part", "head")));
      var0.put("northfalsehead" + var1, class02269.N("minecraft:" + var2 + "_bed", Map.of("facing", "north", "occupied", "false", "part", "head")));
      var0.put("eastfalsehead" + var1, class02269.N("minecraft:" + var2 + "_bed", Map.of("facing", "east", "occupied", "false", "part", "head")));
      var0.put("southtruehead" + var1, class02269.N("minecraft:" + var2 + "_bed", Map.of("facing", "south", "occupied", "true", "part", "head")));
      var0.put("westtruehead" + var1, class02269.N("minecraft:" + var2 + "_bed", Map.of("facing", "west", "occupied", "true", "part", "head")));
      var0.put("northtruehead" + var1, class02269.N("minecraft:" + var2 + "_bed", Map.of("facing", "north", "occupied", "true", "part", "head")));
      var0.put("easttruehead" + var1, class02269.N("minecraft:" + var2 + "_bed", Map.of("facing", "east", "occupied", "true", "part", "head")));
   }

   private static void N(Map<String, Dynamic<?>> var0, int var1, String var2, String var3) {
      var0.put(var1 + "north", class02269.N("minecraft:" + var2 + "_wall_" + var3, Map.of("facing", "north")));
      var0.put(var1 + "east", class02269.N("minecraft:" + var2 + "_wall_" + var3, Map.of("facing", "east")));
      var0.put(var1 + "south", class02269.N("minecraft:" + var2 + "_wall_" + var3, Map.of("facing", "south")));
      var0.put(var1 + "west", class02269.N("minecraft:" + var2 + "_wall_" + var3, Map.of("facing", "west")));

      for (int ix = 0; ix < 16; ix++) {
         var0.put("" + var1 + ix, class02269.N("minecraft:" + var2 + "_" + var3, Map.of("rotation", String.valueOf(ix))));
      }
   }

   private static void N(Map<String, Dynamic<?>> var0, String var1) {
      String sx = "minecraft:" + var1;
      var0.put(
         "minecraft:" + var1 + "eastlowerleftfalsefalse",
         class02269.N(sx, Map.of("facing", "east", "half", "lower", "hinge", "left", "open", "false", "powered", "false"))
      );
      var0.put(
         "minecraft:" + var1 + "eastlowerleftfalsetrue",
         class02269.N(sx, Map.of("facing", "east", "half", "lower", "hinge", "left", "open", "false", "powered", "true"))
      );
      var0.put(
         "minecraft:" + var1 + "eastlowerlefttruefalse",
         class02269.N(sx, Map.of("facing", "east", "half", "lower", "hinge", "left", "open", "true", "powered", "false"))
      );
      var0.put(
         "minecraft:" + var1 + "eastlowerlefttruetrue",
         class02269.N(sx, Map.of("facing", "east", "half", "lower", "hinge", "left", "open", "true", "powered", "true"))
      );
      var0.put(
         "minecraft:" + var1 + "eastlowerrightfalsefalse",
         class02269.N(sx, Map.of("facing", "east", "half", "lower", "hinge", "right", "open", "false", "powered", "false"))
      );
      var0.put(
         "minecraft:" + var1 + "eastlowerrightfalsetrue",
         class02269.N(sx, Map.of("facing", "east", "half", "lower", "hinge", "right", "open", "false", "powered", "true"))
      );
      var0.put(
         "minecraft:" + var1 + "eastlowerrighttruefalse",
         class02269.N(sx, Map.of("facing", "east", "half", "lower", "hinge", "right", "open", "true", "powered", "false"))
      );
      var0.put(
         "minecraft:" + var1 + "eastlowerrighttruetrue",
         class02269.N(sx, Map.of("facing", "east", "half", "lower", "hinge", "right", "open", "true", "powered", "true"))
      );
      var0.put(
         "minecraft:" + var1 + "eastupperleftfalsefalse",
         class02269.N(sx, Map.of("facing", "east", "half", "upper", "hinge", "left", "open", "false", "powered", "false"))
      );
      var0.put(
         "minecraft:" + var1 + "eastupperleftfalsetrue",
         class02269.N(sx, Map.of("facing", "east", "half", "upper", "hinge", "left", "open", "false", "powered", "true"))
      );
      var0.put(
         "minecraft:" + var1 + "eastupperlefttruefalse",
         class02269.N(sx, Map.of("facing", "east", "half", "upper", "hinge", "left", "open", "true", "powered", "false"))
      );
      var0.put(
         "minecraft:" + var1 + "eastupperlefttruetrue",
         class02269.N(sx, Map.of("facing", "east", "half", "upper", "hinge", "left", "open", "true", "powered", "true"))
      );
      var0.put(
         "minecraft:" + var1 + "eastupperrightfalsefalse",
         class02269.N(sx, Map.of("facing", "east", "half", "upper", "hinge", "right", "open", "false", "powered", "false"))
      );
      var0.put(
         "minecraft:" + var1 + "eastupperrightfalsetrue",
         class02269.N(sx, Map.of("facing", "east", "half", "upper", "hinge", "right", "open", "false", "powered", "true"))
      );
      var0.put(
         "minecraft:" + var1 + "eastupperrighttruefalse",
         class02269.N(sx, Map.of("facing", "east", "half", "upper", "hinge", "right", "open", "true", "powered", "false"))
      );
      var0.put(
         "minecraft:" + var1 + "eastupperrighttruetrue",
         class02269.N(sx, Map.of("facing", "east", "half", "upper", "hinge", "right", "open", "true", "powered", "true"))
      );
      var0.put(
         "minecraft:" + var1 + "northlowerleftfalsefalse",
         class02269.N(sx, Map.of("facing", "north", "half", "lower", "hinge", "left", "open", "false", "powered", "false"))
      );
      var0.put(
         "minecraft:" + var1 + "northlowerleftfalsetrue",
         class02269.N(sx, Map.of("facing", "north", "half", "lower", "hinge", "left", "open", "false", "powered", "true"))
      );
      var0.put(
         "minecraft:" + var1 + "northlowerlefttruefalse",
         class02269.N(sx, Map.of("facing", "north", "half", "lower", "hinge", "left", "open", "true", "powered", "false"))
      );
      var0.put(
         "minecraft:" + var1 + "northlowerlefttruetrue",
         class02269.N(sx, Map.of("facing", "north", "half", "lower", "hinge", "left", "open", "true", "powered", "true"))
      );
      var0.put(
         "minecraft:" + var1 + "northlowerrightfalsefalse",
         class02269.N(sx, Map.of("facing", "north", "half", "lower", "hinge", "right", "open", "false", "powered", "false"))
      );
      var0.put(
         "minecraft:" + var1 + "northlowerrightfalsetrue",
         class02269.N(sx, Map.of("facing", "north", "half", "lower", "hinge", "right", "open", "false", "powered", "true"))
      );
      var0.put(
         "minecraft:" + var1 + "northlowerrighttruefalse",
         class02269.N(sx, Map.of("facing", "north", "half", "lower", "hinge", "right", "open", "true", "powered", "false"))
      );
      var0.put(
         "minecraft:" + var1 + "northlowerrighttruetrue",
         class02269.N(sx, Map.of("facing", "north", "half", "lower", "hinge", "right", "open", "true", "powered", "true"))
      );
      var0.put(
         "minecraft:" + var1 + "northupperleftfalsefalse",
         class02269.N(sx, Map.of("facing", "north", "half", "upper", "hinge", "left", "open", "false", "powered", "false"))
      );
      var0.put(
         "minecraft:" + var1 + "northupperleftfalsetrue",
         class02269.N(sx, Map.of("facing", "north", "half", "upper", "hinge", "left", "open", "false", "powered", "true"))
      );
      var0.put(
         "minecraft:" + var1 + "northupperlefttruefalse",
         class02269.N(sx, Map.of("facing", "north", "half", "upper", "hinge", "left", "open", "true", "powered", "false"))
      );
      var0.put(
         "minecraft:" + var1 + "northupperlefttruetrue",
         class02269.N(sx, Map.of("facing", "north", "half", "upper", "hinge", "left", "open", "true", "powered", "true"))
      );
      var0.put(
         "minecraft:" + var1 + "northupperrightfalsefalse",
         class02269.N(sx, Map.of("facing", "north", "half", "upper", "hinge", "right", "open", "false", "powered", "false"))
      );
      var0.put(
         "minecraft:" + var1 + "northupperrightfalsetrue",
         class02269.N(sx, Map.of("facing", "north", "half", "upper", "hinge", "right", "open", "false", "powered", "true"))
      );
      var0.put(
         "minecraft:" + var1 + "northupperrighttruefalse",
         class02269.N(sx, Map.of("facing", "north", "half", "upper", "hinge", "right", "open", "true", "powered", "false"))
      );
      var0.put(
         "minecraft:" + var1 + "northupperrighttruetrue",
         class02269.N(sx, Map.of("facing", "north", "half", "upper", "hinge", "right", "open", "true", "powered", "true"))
      );
      var0.put(
         "minecraft:" + var1 + "southlowerleftfalsefalse",
         class02269.N(sx, Map.of("facing", "south", "half", "lower", "hinge", "left", "open", "false", "powered", "false"))
      );
      var0.put(
         "minecraft:" + var1 + "southlowerleftfalsetrue",
         class02269.N(sx, Map.of("facing", "south", "half", "lower", "hinge", "left", "open", "false", "powered", "true"))
      );
      var0.put(
         "minecraft:" + var1 + "southlowerlefttruefalse",
         class02269.N(sx, Map.of("facing", "south", "half", "lower", "hinge", "left", "open", "true", "powered", "false"))
      );
      var0.put(
         "minecraft:" + var1 + "southlowerlefttruetrue",
         class02269.N(sx, Map.of("facing", "south", "half", "lower", "hinge", "left", "open", "true", "powered", "true"))
      );
      var0.put(
         "minecraft:" + var1 + "southlowerrightfalsefalse",
         class02269.N(sx, Map.of("facing", "south", "half", "lower", "hinge", "right", "open", "false", "powered", "false"))
      );
      var0.put(
         "minecraft:" + var1 + "southlowerrightfalsetrue",
         class02269.N(sx, Map.of("facing", "south", "half", "lower", "hinge", "right", "open", "false", "powered", "true"))
      );
      var0.put(
         "minecraft:" + var1 + "southlowerrighttruefalse",
         class02269.N(sx, Map.of("facing", "south", "half", "lower", "hinge", "right", "open", "true", "powered", "false"))
      );
      var0.put(
         "minecraft:" + var1 + "southlowerrighttruetrue",
         class02269.N(sx, Map.of("facing", "south", "half", "lower", "hinge", "right", "open", "true", "powered", "true"))
      );
      var0.put(
         "minecraft:" + var1 + "southupperleftfalsefalse",
         class02269.N(sx, Map.of("facing", "south", "half", "upper", "hinge", "left", "open", "false", "powered", "false"))
      );
      var0.put(
         "minecraft:" + var1 + "southupperleftfalsetrue",
         class02269.N(sx, Map.of("facing", "south", "half", "upper", "hinge", "left", "open", "false", "powered", "true"))
      );
      var0.put(
         "minecraft:" + var1 + "southupperlefttruefalse",
         class02269.N(sx, Map.of("facing", "south", "half", "upper", "hinge", "left", "open", "true", "powered", "false"))
      );
      var0.put(
         "minecraft:" + var1 + "southupperlefttruetrue",
         class02269.N(sx, Map.of("facing", "south", "half", "upper", "hinge", "left", "open", "true", "powered", "true"))
      );
      var0.put(
         "minecraft:" + var1 + "southupperrightfalsefalse",
         class02269.N(sx, Map.of("facing", "south", "half", "upper", "hinge", "right", "open", "false", "powered", "false"))
      );
      var0.put(
         "minecraft:" + var1 + "southupperrightfalsetrue",
         class02269.N(sx, Map.of("facing", "south", "half", "upper", "hinge", "right", "open", "false", "powered", "true"))
      );
      var0.put(
         "minecraft:" + var1 + "southupperrighttruefalse",
         class02269.N(sx, Map.of("facing", "south", "half", "upper", "hinge", "right", "open", "true", "powered", "false"))
      );
      var0.put(
         "minecraft:" + var1 + "southupperrighttruetrue",
         class02269.N(sx, Map.of("facing", "south", "half", "upper", "hinge", "right", "open", "true", "powered", "true"))
      );
      var0.put(
         "minecraft:" + var1 + "westlowerleftfalsefalse",
         class02269.N(sx, Map.of("facing", "west", "half", "lower", "hinge", "left", "open", "false", "powered", "false"))
      );
      var0.put(
         "minecraft:" + var1 + "westlowerleftfalsetrue",
         class02269.N(sx, Map.of("facing", "west", "half", "lower", "hinge", "left", "open", "false", "powered", "true"))
      );
      var0.put(
         "minecraft:" + var1 + "westlowerlefttruefalse",
         class02269.N(sx, Map.of("facing", "west", "half", "lower", "hinge", "left", "open", "true", "powered", "false"))
      );
      var0.put(
         "minecraft:" + var1 + "westlowerlefttruetrue",
         class02269.N(sx, Map.of("facing", "west", "half", "lower", "hinge", "left", "open", "true", "powered", "true"))
      );
      var0.put(
         "minecraft:" + var1 + "westlowerrightfalsefalse",
         class02269.N(sx, Map.of("facing", "west", "half", "lower", "hinge", "right", "open", "false", "powered", "false"))
      );
      var0.put(
         "minecraft:" + var1 + "westlowerrightfalsetrue",
         class02269.N(sx, Map.of("facing", "west", "half", "lower", "hinge", "right", "open", "false", "powered", "true"))
      );
      var0.put(
         "minecraft:" + var1 + "westlowerrighttruefalse",
         class02269.N(sx, Map.of("facing", "west", "half", "lower", "hinge", "right", "open", "true", "powered", "false"))
      );
      var0.put(
         "minecraft:" + var1 + "westlowerrighttruetrue",
         class02269.N(sx, Map.of("facing", "west", "half", "lower", "hinge", "right", "open", "true", "powered", "true"))
      );
      var0.put(
         "minecraft:" + var1 + "westupperleftfalsefalse",
         class02269.N(sx, Map.of("facing", "west", "half", "upper", "hinge", "left", "open", "false", "powered", "false"))
      );
      var0.put(
         "minecraft:" + var1 + "westupperleftfalsetrue",
         class02269.N(sx, Map.of("facing", "west", "half", "upper", "hinge", "left", "open", "false", "powered", "true"))
      );
      var0.put(
         "minecraft:" + var1 + "westupperlefttruefalse",
         class02269.N(sx, Map.of("facing", "west", "half", "upper", "hinge", "left", "open", "true", "powered", "false"))
      );
      var0.put(
         "minecraft:" + var1 + "westupperlefttruetrue",
         class02269.N(sx, Map.of("facing", "west", "half", "upper", "hinge", "left", "open", "true", "powered", "true"))
      );
      var0.put(
         "minecraft:" + var1 + "westupperrightfalsefalse",
         class02269.N(sx, Map.of("facing", "west", "half", "upper", "hinge", "right", "open", "false", "powered", "false"))
      );
      var0.put(
         "minecraft:" + var1 + "westupperrightfalsetrue",
         class02269.N(sx, Map.of("facing", "west", "half", "upper", "hinge", "right", "open", "false", "powered", "true"))
      );
      var0.put(
         "minecraft:" + var1 + "westupperrighttruefalse",
         class02269.N(sx, Map.of("facing", "west", "half", "upper", "hinge", "right", "open", "true", "powered", "false"))
      );
      var0.put(
         "minecraft:" + var1 + "westupperrighttruetrue",
         class02269.N(sx, Map.of("facing", "west", "half", "upper", "hinge", "right", "open", "true", "powered", "true"))
      );
   }
}
