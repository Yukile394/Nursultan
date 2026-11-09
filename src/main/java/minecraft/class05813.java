package minecraft;

import com.google.common.collect.Lists;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

final class class05813 {
   private int N;
   private final class05821[] y = new class05821[16];
   private final Dynamic<?> L;
   private final int u;
   private final int i;
   private final Int2ObjectMap<Dynamic<?>> R = new Int2ObjectLinkedOpenHashMap(16);

   @Nullable
   private Dynamic<?> L(int var1) {
      return (Dynamic<?>)this.R.remove(var1);
   }

   public class05813(Dynamic<?> var1) {
      super();
      this.L = var1;
      this.u = var1.get("xPos").asInt(0) << 4;
      this.i = var1.get("zPos").asInt(0) << 4;
      var1.get("TileEntities").asStreamOpt().ifSuccess(var1x -> var1x.forEach(var1xx -> {
         int ixx = var1xx.get("x").asInt(0) - this.u & 15;
         int jx = var1xx.get("y").asInt(0);
         int kx = var1xx.get("z").asInt(0) - this.i & 15;
         int lx = jx << 8 | kx << 4 | ixx;
         if (this.R.put(lx, var1xx) != null) {
            class05819.N.warn("In chunk: {}x{} found a duplicate block entity at position: [{}, {}, {}]", new Object[]{this.u, this.i, ixx, jx, kx});
         }
      }));
      boolean flag = var1.get("convertedFromAlphaFormat").asBoolean(false);
      var1.get("Sections").asStreamOpt().ifSuccess(var1x -> var1x.forEach(var1xx -> {
         class05821 class05821x = new class05821((Dynamic<?>)var1xx);
         this.N = class05821x.y(this.N);
         this.y[class05821x.L] = class05821x;
      }));

      for (class05821 class05821 : this.y) {
         if (class05821 != null) {
            ObjectIterator<Entry<IntList>> objectiterator = class05821.N.int2ObjectEntrySet().iterator();

            while (objectiterator.hasNext()) {
               Entry entry = (Entry)objectiterator.next();
               int ix = class05821.L << 12;
               switch (entry.getIntKey()) {
                  case 2:
                     IntListIterator intlistiterator10 = ((IntList)entry.getValue()).iterator();

                     while (intlistiterator10.hasNext()) {
                        int i3 = (Integer)intlistiterator10.next();
                        i3 |= ix;
                        Dynamic<?> dynamic11 = this.N(i3);
                        if ("minecraft:grass_block".equals(class05819.N(dynamic11))) {
                           String s11 = class05819.N(this.N(N(i3, class05823.field_15863)));
                           if ("minecraft:snow".equals(s11) || "minecraft:snow_layer".equals(s11)) {
                              this.N(i3, class05830.i);
                           }
                        }
                     }
                     break;
                  case 3:
                     IntListIterator intlistiterator9 = ((IntList)entry.getValue()).iterator();

                     while (intlistiterator9.hasNext()) {
                        int l2 = (Integer)intlistiterator9.next();
                        l2 |= ix;
                        Dynamic<?> dynamic10 = this.N(l2);
                        if ("minecraft:podzol".equals(class05819.N(dynamic10))) {
                           String s10 = class05819.N(this.N(N(l2, class05823.field_15863)));
                           if ("minecraft:snow".equals(s10) || "minecraft:snow_layer".equals(s10)) {
                              this.N(l2, class05830.u);
                           }
                        }
                     }
                     break;
                  case 25:
                     IntListIterator intlistiterator8 = ((IntList)entry.getValue()).iterator();

                     while (intlistiterator8.hasNext()) {
                        int k2 = (Integer)intlistiterator8.next();
                        k2 |= ix;
                        Dynamic<?> dynamic9 = this.L(k2);
                        if (dynamic9 != null) {
                           String s9 = Boolean.toString(dynamic9.get("powered").asBoolean(false))
                              + (byte)Math.min(Math.max(dynamic9.get("note").asInt(0), 0), 24);
                           this.N(k2, class05830.s.getOrDefault(s9, class05830.s.get("false0")));
                        }
                     }
                     break;
                  case 26:
                     IntListIterator intlistiterator7 = ((IntList)entry.getValue()).iterator();

                     while (intlistiterator7.hasNext()) {
                        int j2 = (Integer)intlistiterator7.next();
                        j2 |= ix;
                        Dynamic<?> dynamic8 = this.y(j2);
                        Dynamic<?> dynamic14 = this.N(j2);
                        if (dynamic8 != null) {
                           int k3 = dynamic8.get("color").asInt(0);
                           if (k3 != 14 && k3 >= 0 && k3 < 16) {
                              String s15 = class05819.N(dynamic14, "facing") + class05819.N(dynamic14, "occupied") + class05819.N(dynamic14, "part") + k3;
                              if (class05830.T.containsKey(s15)) {
                                 this.N(j2, class05830.T.get(s15));
                              }
                           }
                        }
                     }
                     break;
                  case 64:
                  case 71:
                  case 193:
                  case 194:
                  case 195:
                  case 196:
                  case 197:
                     IntListIterator intlistiterator6 = ((IntList)entry.getValue()).iterator();

                     while (intlistiterator6.hasNext()) {
                        int i2 = (Integer)intlistiterator6.next();
                        i2 |= ix;
                        Dynamic<?> dynamic7 = this.N(i2);
                        if (class05819.N(dynamic7).endsWith("_door")) {
                           Dynamic<?> dynamic13 = this.N(i2);
                           if ("lower".equals(class05819.N(dynamic13, "half"))) {
                              int j3 = N(i2, class05823.field_15863);
                              Dynamic<?> dynamic15 = this.N(j3);
                              String s16 = class05819.N(dynamic13);
                              if (s16.equals(class05819.N(dynamic15))) {
                                 String s1 = class05819.N(dynamic13, "facing");
                                 String s2 = class05819.N(dynamic13, "open");
                                 String s3 = flag ? "left" : class05819.N(dynamic15, "hinge");
                                 String s4 = flag ? "false" : class05819.N(dynamic15, "powered");
                                 this.N(i2, class05830.P.get(s16 + s1 + "lower" + s3 + s2 + s4));
                                 this.N(j3, class05830.P.get(s16 + s1 + "upper" + s3 + s2 + s4));
                              }
                           }
                        }
                     }
                     break;
                  case 86:
                     IntListIterator intlistiterator5 = ((IntList)entry.getValue()).iterator();

                     while (intlistiterator5.hasNext()) {
                        int l1 = (Integer)intlistiterator5.next();
                        l1 |= ix;
                        Dynamic<?> dynamic6 = this.N(l1);
                        if ("minecraft:carved_pumpkin".equals(class05819.N(dynamic6))) {
                           String s8 = class05819.N(this.N(N(l1, class05823.field_15858)));
                           if ("minecraft:grass_block".equals(s8) || "minecraft:dirt".equals(s8)) {
                              this.N(l1, class05830.L);
                           }
                        }
                     }
                     break;
                  case 110:
                     IntListIterator intlistiterator4 = ((IntList)entry.getValue()).iterator();

                     while (intlistiterator4.hasNext()) {
                        int k1 = (Integer)intlistiterator4.next();
                        k1 |= ix;
                        Dynamic<?> dynamic5 = this.N(k1);
                        if ("minecraft:mycelium".equals(class05819.N(dynamic5))) {
                           String s7 = class05819.N(this.N(N(k1, class05823.field_15863)));
                           if ("minecraft:snow".equals(s7) || "minecraft:snow_layer".equals(s7)) {
                              this.N(k1, class05830.R);
                           }
                        }
                     }
                     break;
                  case 140:
                     IntListIterator intlistiterator3 = ((IntList)entry.getValue()).iterator();

                     while (intlistiterator3.hasNext()) {
                        int j1 = (Integer)intlistiterator3.next();
                        j1 |= ix;
                        Dynamic<?> dynamic4 = this.L(j1);
                        if (dynamic4 != null) {
                           String s6 = dynamic4.get("Item").asString("") + dynamic4.get("Data").asInt(0);
                           this.N(j1, class05830.W.getOrDefault(s6, class05830.W.get("minecraft:air0")));
                        }
                     }
                     break;
                  case 144:
                     IntListIterator intlistiterator2 = ((IntList)entry.getValue()).iterator();

                     while (intlistiterator2.hasNext()) {
                        int i1 = (Integer)intlistiterator2.next();
                        i1 |= ix;
                        Dynamic<?> dynamic3 = this.y(i1);
                        if (dynamic3 != null) {
                           String s5 = String.valueOf(dynamic3.get("SkullType").asInt(0));
                           String s13 = class05819.N(this.N(i1), "facing");
                           String s14;
                           if (!"up".equals(s13) && !"down".equals(s13)) {
                              s14 = s5 + s13;
                           } else {
                              s14 = s5 + dynamic3.get("Rot").asInt(0);
                           }

                           dynamic3.remove("SkullType");
                           dynamic3.remove("facing");
                           dynamic3.remove("Rot");
                           this.N(i1, class05830.m.getOrDefault(s14, class05830.m.get("0north")));
                        }
                     }
                     break;
                  case 175:
                     IntListIterator intlistiterator1 = ((IntList)entry.getValue()).iterator();

                     while (intlistiterator1.hasNext()) {
                        int l = (Integer)intlistiterator1.next();
                        l |= ix;
                        Dynamic<?> dynamic2 = this.N(l);
                        if ("upper".equals(class05819.N(dynamic2, "half"))) {
                           Dynamic<?> dynamic12 = this.N(N(l, class05823.field_15858));
                           String s12 = class05819.N(dynamic12);
                           switch (s12) {
                              case "minecraft:sunflower":
                                 this.N(l, class05830.M);
                                 break;
                              case "minecraft:lilac":
                                 this.N(l, class05830.B);
                                 break;
                              case "minecraft:tall_grass":
                                 this.N(l, class05830.Z);
                                 break;
                              case "minecraft:large_fern":
                                 this.N(l, class05830.z);
                                 break;
                              case "minecraft:rose_bush":
                                 this.N(l, class05830.U);
                                 break;
                              case "minecraft:peony":
                                 this.N(l, class05830.E);
                           }
                        }
                     }
                     break;
                  case 176:
                  case 177:
                     IntListIterator intlistiterator = ((IntList)entry.getValue()).iterator();

                     while (intlistiterator.hasNext()) {
                        int j = (Integer)intlistiterator.next();
                        j |= ix;
                        Dynamic<?> dynamic = this.y(j);
                        Dynamic<?> dynamic1 = this.N(j);
                        if (dynamic != null) {
                           int k = dynamic.get("Base").asInt(0);
                           if (k != 15 && k >= 0 && k < 16) {
                              String var15 = class05819.N(dynamic1, entry.getIntKey() == 176 ? "rotation" : "facing") + "_" + k;
                              if (class05830.b.containsKey(var15)) {
                                 this.N(j, class05830.b.get(var15));
                              }
                           }
                        }
                     }
               }
            }
         }
      }
   }

   @Nullable
   private class05821 u(int var1) {
      int ix = var1 >> 12;
      return ix < this.y.length ? this.y[ix] : null;
   }

   @Nullable
   private Dynamic<?> y(int var1) {
      return (Dynamic<?>)this.R.get(var1);
   }

   public Dynamic<?> N(int var1) {
      if (var1 >= 0 && var1 <= 65535) {
         class05821 class05821 = this.u(var1);
         return class05821 == null ? class05830.j : class05821.N(var1 & 4095);
      } else {
         return class05830.j;
      }
   }

   public Dynamic<?> N() {
      Dynamic<?> dynamic = this.L;
      if (this.R.isEmpty()) {
         dynamic = dynamic.remove("TileEntities");
      } else {
         dynamic = dynamic.set("TileEntities", dynamic.createList(this.R.values().stream()));
      }

      Dynamic<?> dynamic1 = dynamic.emptyMap();
      ArrayList arraylist = Lists.newArrayList();

      for (class05821 class05821 : this.y) {
         if (class05821 != null) {
            arraylist.add(class05821.N());
            dynamic1 = dynamic1.set(String.valueOf(class05821.L), dynamic1.createIntList(Arrays.stream(class05821.y.toIntArray())));
         }
      }

      Dynamic<?> dynamic2 = dynamic.emptyMap();
      dynamic2 = dynamic2.set("Sides", dynamic2.createByte((byte)this.N));
      dynamic2 = dynamic2.set("Indices", dynamic1);
      return dynamic.set("UpgradeData", dynamic2).set("Sections", dynamic2.createList(arraylist.stream()));
   }

   public static int N(int var0, class05823 var1) {
      return switch (var1.y()) {
         case field_15869 -> {
            int k = (var0 & 15) + var1.N().N();
            yield k >= 0 && k <= 15 ? var0 & -16 | k : -1;
         }
         case field_15866 -> {
            int j = (var0 >> 8) + var1.N().N();
            yield j >= 0 && j <= 255 ? var0 & 0xFF | j << 8 : -1;
         }
         case field_15867 -> {
            int ix = (var0 >> 4 & 15) + var1.N().N();
            yield ix >= 0 && ix <= 15 ? var0 & -241 | ix << 4 : -1;
         }
      };
   }

   private void N(int var1, Dynamic<?> var2) {
      if (var1 >= 0 && var1 <= 65535) {
         class05821 class05821 = this.u(var1);
         if (class05821 != null) {
            class05821.N(var1 & 4095, var2);
         }
      }
   }
}
