package minecraft;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List.ListType;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntIterator;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class class06616 extends DataFix {
   private static final int L = 128;
   private static final int u = 64;
   private static final int i = 32;
   private static final int R = 16;
   private static final int M = 8;
   private static final int B = 4;
   private static final int Z = 2;
   private static final int z = 1;
   private static final int[][] U = new int[][]{{-1, 0, 0}, {1, 0, 0}, {0, -1, 0}, {0, 1, 0}, {0, 0, -1}, {0, 0, 1}};
   private static final int E = 7;
   private static final int W = 12;
   private static final int m = 4096;
   static final Object2IntMap<String> N = (Object2IntMap<String>)DataFixUtils.make(new Object2IntOpenHashMap(), var0 -> {
      var0.put("minecraft:acacia_leaves", 0);
      var0.put("minecraft:birch_leaves", 1);
      var0.put("minecraft:dark_oak_leaves", 2);
      var0.put("minecraft:jungle_leaves", 3);
      var0.put("minecraft:oak_leaves", 4);
      var0.put("minecraft:spruce_leaves", 5);
   });
   static final Set<String> y = ImmutableSet.of(
      "minecraft:acacia_bark",
      "minecraft:birch_bark",
      "minecraft:dark_oak_bark",
      "minecraft:jungle_bark",
      "minecraft:oak_bark",
      "minecraft:spruce_bark",
      new String[]{
         "minecraft:acacia_log",
         "minecraft:birch_log",
         "minecraft:dark_oak_log",
         "minecraft:jungle_log",
         "minecraft:oak_log",
         "minecraft:spruce_log",
         "minecraft:stripped_acacia_log",
         "minecraft:stripped_birch_log",
         "minecraft:stripped_dark_oak_log",
         "minecraft:stripped_jungle_log",
         "minecraft:stripped_oak_log",
         "minecraft:stripped_spruce_log"
      }
   );

   private int L(int var1) {
      return var1 >> 4 & 15;
   }

   public class06616(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private int y(int var1) {
      return var1 >> 8 & 0xFF;
   }

   private int N(int var1) {
      return var1 & 15;
   }

   public static int N(int var0, int var1, int var2) {
      return var1 << 8 | var2 << 4 | var0;
   }

   public static int N(boolean var0, boolean var1, boolean var2, boolean var3) {
      short short1 = 0;
      if (var2) {
         if (var1) {
            short1 |= 2;
         } else if (var0) {
            short1 |= 128;
         } else {
            short1 |= 1;
         }
      } else if (var3) {
         if (var0) {
            short1 |= 32;
         } else if (var1) {
            short1 |= 8;
         } else {
            short1 |= 16;
         }
      } else if (var1) {
         short1 |= 4;
      } else if (var0) {
         short1 |= 64;
      }

      return short1;
   }

   protected TypeRewriteRule makeRule() {
      Type<?> type = this.getInputSchema().getType(class06962.u);
      OpticFinder<?> opticfinder = type.findField("Level");
      OpticFinder<?> opticfinder1 = opticfinder.type().findField("Sections");
      Type<?> type1 = opticfinder1.type();
      if (!(type1 instanceof ListType)) {
         throw new IllegalStateException("Expecting sections to be a list.");
      } else {
         OpticFinder opticfinder2 = DSL.typeFinder(((ListType)type1).getElement());
         return this.fixTypeEverywhereTyped(
            "Leaves fix",
            type,
            var4x -> var4x.updateTyped(
               opticfinder,
               var3xx -> {
                  int[] aint = new int[]{0};
                  Typed<?> typed = var3xx.updateTyped(
                     opticfinder1,
                     var3xxx -> {
                        Int2ObjectOpenHashMap int2objectopenhashmap = new Int2ObjectOpenHashMap(
                           var3xxx.getAllTyped(opticfinder2)
                              .stream()
                              .map(var1xxxx -> new class06625((Typed<?>)var1xxxx, this.getInputSchema()))
                              .collect(Collectors.toMap(class06599::L, var0 -> (class06625)var0))
                        );
                        if (int2objectopenhashmap.values().stream().allMatch(class06599::y)) {
                           return var3xxx;
                        } else {
                           ArrayList arraylist = Lists.newArrayList();

                           for (int ix = 0; ix < 7; ix++) {
                              arraylist.add(new IntOpenHashSet());
                           }

                           ObjectIterator objectiterator = int2objectopenhashmap.values().iterator();

                           while (objectiterator.hasNext()) {
                              class06625 class06625x = (class06625)objectiterator.next();
                              if (!class06625x.y()) {
                                 for (int j = 0; j < 4096; j++) {
                                    int k = class06625x.u(j);
                                    if (class06625x.N(k)) {
                                       ((IntSet)arraylist.get(0)).add(class06625x.L() << 12 | j);
                                    } else if (class06625x.y(k)) {
                                       int l = this.N(j);
                                       int i1 = this.L(j);
                                       aint[0] |= N(l == 0, l == 15, i1 == 0, i1 == 15);
                                    }
                                 }
                              }
                           }

                           for (int k3 = 1; k3 < 7; k3++) {
                              IntSet intset = (IntSet)arraylist.get(k3 - 1);
                              IntSet intset1 = (IntSet)arraylist.get(k3);
                              IntIterator intiterator = intset.iterator();

                              while (intiterator.hasNext()) {
                                 int l3 = intiterator.nextInt();
                                 int i4 = this.N(l3);
                                 int j1 = this.y(l3);
                                 int k1 = this.L(l3);
                                 int l1 = U.length;

                                 for (int i2 = 0; i2 < l1; i2++) {
                                    int[] aintx = U[i2];
                                    int j2 = i4 + aintx[0];
                                    int k2 = j1 + aintx[1];
                                    int l2 = k1 + aintx[2];
                                    if (j2 >= 0 && j2 <= 15 && l2 >= 0 && l2 <= 15 && k2 >= 0 && k2 <= 255) {
                                       class06625 class06625 = (class06625)int2objectopenhashmap.get(k2 >> 4);
                                       if (class06625 != null && !class06625.y()) {
                                          int i3 = N(j2, k2 & 15, l2);
                                          int j3 = class06625.u(i3);
                                          if (class06625.y(j3) && class06625.L(j3) > k3) {
                                             class06625.N(i3, j3, k3);
                                             intset1.add(N(j2, k2, l2));
                                          }
                                       }
                                    }
                                 }
                              }
                           }

                           return var3xxx.updateTyped(
                              opticfinder2,
                              var1xxxx -> ((class06625)int2objectopenhashmap.get(((Dynamic)var1xxxx.get(DSL.remainderFinder())).get("Y").asInt(0))).N(var1xxxx)
                           );
                        }
                     }
                  );
                  if (aint[0] != 0) {
                     typed = typed.update(DSL.remainderFinder(), var1xxx -> {
                        Dynamic dynamic = (Dynamic)DataFixUtils.orElse(var1xxx.get("UpgradeData").result(), var1xxx.emptyMap());
                        return var1xxx.set("UpgradeData", dynamic.set("Sides", var1xxx.createByte((byte)(dynamic.get("Sides").asByte((byte)0) | aint[0]))));
                     });
                  }

                  return typed;
               }
            )
         );
      }
   }
}
