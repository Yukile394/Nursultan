package minecraft;

import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.collect.Comparators;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public final class class07717 {
   private static final Comparator<class07741> y = Comparator.<class07741>comparingInt(var0 -> var0.N(1, 0))
      .thenComparingInt(var0 -> var0.N(0, 0))
      .thenComparingInt(var0 -> var0.N(2, 0));
   private static final Comparator<class07741> L = Comparator.<class07741>comparingDouble(var0 -> var0.N(1, 0.0))
      .thenComparingDouble(var0 -> var0.N(0, 0.0))
      .thenComparingDouble(var0 -> var0.N(2, 0.0));
   private static final Codec<class05946<class00891>> u = class05946.N(class04227.Z);
   public static final String N = "data";
   private static final char i = '{';
   private static final char R = '}';
   private static final String M = ",";
   private static final char B = ':';
   private static final Splitter Z = Splitter.on(",");
   private static final Splitter z = Splitter.on(':').limit(2);
   private static final Logger U = LogUtils.getLogger();
   private static final int E = 2;
   private static final int W = -1;

   static class07001 L(class07001 var0) {
      class07741 class07741x = var0.s("palette");
      Map map = class07741x.stream().flatMap(var0x -> var0x.ah_().stream()).collect(ImmutableMap.toImmutableMap(Function.identity(), class07717::y));
      Optional<class07741> optional = var0.P("palettes");
      if (optional.isPresent()) {
         var0.N(
            "palettes",
            optional.get()
               .z()
               .map(
                  var1x -> map.keySet()
                     .stream()
                     .map(var1xx -> var1x.Z(var1xx).orElseThrow())
                     .map(class07717::y)
                     .collect(Collectors.toCollection(class07741::new))
               )
               .collect(Collectors.toCollection(class07741::new))
         );
         var0.b("palette");
      } else {
         var0.N("palette", map.values().stream().collect(Collectors.toCollection(class07741::new)));
      }

      Optional<class07741> optional1 = var0.P("data");
      if (optional1.isPresent()) {
         Object2IntOpenHashMap object2intopenhashmap = new Object2IntOpenHashMap();
         object2intopenhashmap.defaultReturnValue(-1);

         for (int ix = 0; ix < class07741x.size(); ix++) {
            object2intopenhashmap.put(class07741x.W(ix).orElseThrow(), ix);
         }

         class07741 class07741x = optional1.get();

         for (int j = 0; j < class07741x.size(); j++) {
            class07001 class07001 = class07741x.N(j).orElseThrow();
            String s = class07001.Z("state").orElseThrow();
            int k = object2intopenhashmap.getInt(s);
            if (k == -1) {
               throw new IllegalStateException("Entry " + s + " missing from palette");
            }

            class07001.N("state", k);
         }

         var0.N("blocks", class07741x);
         var0.b("data");
      }

      return var0;
   }

   private class07717() {
      super();
   }

   public static class07001 i(class07001 var0) {
      int ix = class07529.y().comp_4026().y();
      return N(var0, ix);
   }

   static String u(class07001 var0) {
      StringBuilder stringbuilder = new StringBuilder(var0.Z("Name").orElseThrow());
      var0.W("Properties")
         .ifPresent(
            var1x -> {
               String s = var1x.M()
                  .stream()
                  .sorted(Entry.comparingByKey())
                  .map(var0xx -> var0xx.getKey() + ":" + var0xx.getValue().ah_().orElseThrow())
                  .collect(Collectors.joining(","));
               stringbuilder.append('{').append(s).append('}');
            }
         );
      return stringbuilder.toString();
   }

   static class07001 y(class07001 var0) {
      Optional<class07741> optional = var0.P("palettes");
      class07741 class07741xxxx;
      if (optional.isPresent()) {
         class07741xxxx = optional.get().R(0);
      } else {
         class07741xxxx = var0.s("palette");
      }

      class07741 class07741x = class07741xxxx.z().map(class07717::u).map(class07707::N).collect(Collectors.toCollection(class07741::new));
      var0.N("palette", class07741x);
      if (optional.isPresent()) {
         class07741 class07741xx = new class07741();
         optional.get().stream().flatMap(var0x -> var0x.al_().stream()).forEach(var2x -> {
            class07001 class07001 = new class07001();

            for (int ix = 0; ix < var2x.size(); ix++) {
               class07001.N_67(class07741xxx.W(ix).orElseThrow(), u(var2x.N(ix).orElseThrow()));
            }

            var4.add(class07001);
         });
         var0.N("palettes", class07741xx);
      }

      Optional<class07741> optional1 = var0.P("entities");
      if (optional1.isPresent()) {
         class07741 class07741xx = optional1.get()
            .z()
            .sorted(Comparator.comparing(var0x -> var0x.P("pos"), Comparators.emptiesLast(L)))
            .collect(Collectors.toCollection(class07741::new));
         var0.N("entities", class07741xx);
      }

      class07741 class07741xx = var0.P("blocks")
         .stream()
         .flatMap(class07741::z)
         .sorted(Comparator.comparing(var0x -> var0x.P("pos"), Comparators.emptiesLast(y)))
         .peek(var1x -> var1x.N_67("state", class07741xxx.W(var1x.y("state", 0)).orElseThrow()))
         .collect(Collectors.toCollection(class07741::new));
      var0.N("data", class07741xx);
      var0.b("blocks");
      return var0;
   }

   static class07001 y(String var0) {
      class07001 class07001x = new class07001();
      int ix = var0.indexOf(123);
      String s;
      if (ix >= 0) {
         s = var0.substring(0, ix);
         class07001 class07001x = new class07001();
         if (ix + 2 <= var0.length()) {
            String s1 = var0.substring(ix + 1, var0.indexOf(125, ix));
            Z.split(s1).forEach(var2x -> {
               List<String> list = z.splitToList(var2x);
               if (list.size() == 2) {
                  class07001.N_67(list.get(0), list.get(1));
               } else {
                  U.error("Something went wrong parsing: '{}' -- incorrect gamedata!", var0);
               }
            });
            class07001x.N("Properties", class07001x);
         }
      } else {
         s = var0;
      }

      class07001x.N_67("Name", s);
      return class07001x;
   }

   public static int y(Dynamic<?> var0, int var1) {
      return var0.get("DataVersion").asInt(var1);
   }

   public static class00392 y(class07709 var0) {
      return new class04824("").N(var0);
   }

   public static int y(class07001 var0, int var1) {
      return var0.y("DataVersion", var1);
   }

   private static <S extends class00522<?, S>, T extends Comparable<T>> S N(S var0, class08092<T> var1, String var2, class07001 var3, class07001 var4) {
      Optional optional = var3.Z(var2).flatMap(var1::y);
      if (optional.isPresent()) {
         return (S)var0.y(var1, (Comparable)optional.get());
      } else {
         U.warn("Unable to read property: {} with value: {} for blockstate: {}", new Object[]{var2, var3.N(var2), var4});
         return (S)var0;
      }
   }

   public static boolean N(@Nullable class07709 var0, @Nullable class07709 var1, boolean var2) {
      if (var0 == var1) {
         return true;
      } else if (var0 == null) {
         return true;
      } else if (var1 == null) {
         return false;
      } else if (!var0.getClass().equals(var1.getClass())) {
         return false;
      } else if (var0 instanceof class07001 class07001x) {
         class07001 class07001x = (class07001)var1;
         if (class07001x.Z() < class07001x.Z()) {
            return false;
         } else {
            for (Entry entry : class07001x.M()) {
               class07709 class07709 = (class07709)entry.getValue();
               if (!N(class07709, class07001x.N((String)entry.getKey()), var2)) {
                  return false;
               }
            }

            return true;
         }
      } else if (var0 instanceof class07741 class07741x && var2) {
         class07741 class07741x = (class07741)var1;
         if (class07741x.isEmpty()) {
            return class07741x.isEmpty();
         } else if (class07741x.size() < class07741x.size()) {
            return false;
         } else {
            for (class07709 class07709xx : class07741x) {
               boolean flag = false;

               for (class07709 class07709x : class07741x) {
                  if (N(class07709xx, class07709x, var2)) {
                     flag = true;
                     break;
                  }
               }

               if (!flag) {
                  return false;
               }
            }

            return true;
         }
      } else {
         return var0.equals(var1);
      }
   }

   public static void N(class08329 var0) {
      int ix = class07529.y().comp_4026().y();
      N(var0, ix);
   }

   public static class00500 N(class02055<class00891> var0, class07001 var1) {
      Optional optional = var1.<class05946<T>>N_15("Name", u).flatMap(var0::N);
      if (optional.isEmpty()) {
         return class00869.N.W();
      } else {
         class00891 class00891 = (class00891)((class03556)optional.get()).N();
         class00500 class00500 = class00891.W();
         Optional<class07001> optional1 = var1.W("Properties");
         if (optional1.isPresent()) {
            class00507<class00891, class00500> class00507 = class00891.E();

            for (String s : optional1.get().i()) {
               class08092<?> class08092 = class00507.N(s);
               if (class08092 != null) {
                  class00500 = N(class00500, class08092, s, optional1.get(), var1);
               }
            }
         }

         return class00500;
      }
   }

   public static String N(class07001 var0) {
      return new class04825().N((class07709)y(var0));
   }

   public static class07001 N(String var0) throws CommandSyntaxException {
      return L(class07755.N(var0));
   }

   public static class07001 N(class04688 var0) {
      class07001 class07001x = new class07001();
      class07001x.N_67("Name", class04206.L.y(var0.N()).toString());
      Map<class08092<?>, Comparable<?>> map = var0.L();
      if (!map.isEmpty()) {
         class07001 class07001x = new class07001();

         for (Entry entry : map.entrySet()) {
            class08092<?> class08092 = (class08092<?>)entry.getKey();
            class07001x.N_67(class08092.R(), N(class08092, (Comparable<?>)entry.getValue()));
         }

         class07001x.N("Properties", class07001x);
      }

      return class07001x;
   }

   public static class07001 N(class07001 var0, int var1) {
      var0.N("DataVersion", var1);
      return var0;
   }

   public static String N(class07709 var0) {
      return N(var0, false);
   }

   public static String N(class07709 var0, boolean var1) {
      return N(new StringBuilder(), var0, 0, var1).toString();
   }

   public static StringBuilder N(StringBuilder var0, class07709 var1, int var2, boolean var3) {
      return switch (var1) {
         case class08884 class08884 -> var0.append(class08884);
         case class06997 class06997 -> var0;
         case class07029 class07029 -> {
            byte[] abyte = ((class07029)var1).i();
            int i1 = abyte.length;
            N(var2, var0).append("byte[").append(i1).append("] {\n");
            if (var3) {
               N(var2 + 1, var0);

               for (int k1 = 0; k1 < abyte.length; k1++) {
                  if (k1 != 0) {
                     var0.append(',');
                  }

                  if (k1 % 16 == 0 && k1 / 16 > 0) {
                     var0.append('\n');
                     if (k1 < abyte.length) {
                        N(var2 + 1, var0);
                     }
                  } else if (k1 != 0) {
                     var0.append(' ');
                  }

                  var0.append(String.format(Locale.ROOT, "0x%02X", abyte[k1] & 255));
               }
            } else {
               N(var2 + 1, var0).append(" // Skipped, supply withBinaryBlobs true");
            }

            var0.append('\n');
            N(var2, var0).append('}');
            yield var0;
         }
         case class07741 class07741 -> {
            int l = class07741.size();
            N(var2, var0).append("list").append("[").append(l).append("] [");
            if (l != 0) {
               var0.append('\n');
            }

            for (int j1 = 0; j1 < l; j1++) {
               if (j1 != 0) {
                  var0.append(",\n");
               }

               N(var2 + 1, var0);
               N(var0, class07741.get(j1), var2 + 1, var3);
            }

            if (l != 0) {
               var0.append('\n');
            }

            N(var2, var0).append(']');
            yield var0;
         }
         case class06995 class06995 -> {
            int[] aint = class06995.M();
            int l1 = 0;

            for (int i3 : aint) {
               l1 = Math.max(l1, String.format(Locale.ROOT, "%X", i3).length());
            }

            int j2 = aint.length;
            N(var2, var0).append("int[").append(j2).append("] {\n");
            if (var3) {
               N(var2 + 1, var0);

               for (int k2 = 0; k2 < aint.length; k2++) {
                  if (k2 != 0) {
                     var0.append(',');
                  }

                  if (k2 % 16 == 0 && k2 / 16 > 0) {
                     var0.append('\n');
                     if (k2 < aint.length) {
                        N(var2 + 1, var0);
                     }
                  } else if (k2 != 0) {
                     var0.append(' ');
                  }

                  var0.append(String.format(Locale.ROOT, "0x%0" + l1 + "X", aint[k2]));
               }
            } else {
               N(var2 + 1, var0).append(" // Skipped, supply withBinaryBlobs true");
            }

            var0.append('\n');
            N(var2, var0).append('}');
            yield var0;
         }
         case class07001 class07001 -> {
            ArrayList arraylist = Lists.newArrayList(class07001.i());
            Collections.sort(arraylist);
            N(var2, var0).append('{');
            if (var0.length() - var0.lastIndexOf("\n") > 2 * (var2 + 1)) {
               var0.append('\n');
               N(var2 + 1, var0);
            }

            int i2 = arraylist.stream().mapToInt(String::length).max().orElse(0);
            String s = Strings.repeat(" ", i2);

            for (int j = 0; j < arraylist.size(); j++) {
               if (j != 0) {
                  var0.append(",\n");
               }

               String s1 = (String)arraylist.get(j);
               N(var2 + 1, var0).append('"').append(s1).append('"').append(s, 0, s.length() - s1.length()).append(": ");
               N(var0, class07001.N(s1), var2 + 1, var3);
            }

            if (!arraylist.isEmpty()) {
               var0.append('\n');
            }

            N(var2, var0).append('}');
            yield var0;
         }
         case class07757 class07757 -> {
            long[] along = class07757.M();
            long ix = 0L;

            for (long k : along) {
               ix = Math.max(ix, (long)String.format(Locale.ROOT, "%X", k).length());
            }

            long l2 = along.length;
            N(var2, var0).append("long[").append(l2).append("] {\n");
            if (var3) {
               N(var2 + 1, var0);

               for (int j3 = 0; j3 < along.length; j3++) {
                  if (j3 != 0) {
                     var0.append(',');
                  }

                  if (j3 % 16 == 0 && j3 / 16 > 0) {
                     var0.append('\n');
                     if (j3 < along.length) {
                        N(var2 + 1, var0);
                     }
                  } else if (j3 != 0) {
                     var0.append(' ');
                  }

                  var0.append(String.format(Locale.ROOT, "0x%0" + ix + "X", along[j3]));
               }
            } else {
               N(var2 + 1, var0).append(" // Skipped, supply withBinaryBlobs true");
            }

            var0.append('\n');
            N(var2, var0).append('}');
            yield var0;
         }
         default -> throw new MatchException(null, null);
      };
   }

   private static StringBuilder N(int var0, StringBuilder var1) {
      int ix = var1.lastIndexOf("\n") + 1;
      int j = var1.length() - ix;

      for (int k = 0; k < 2 * var0 - j; k++) {
         var1.append(' ');
      }

      return var1;
   }

   private static <T extends Comparable<T>> String N(class08092<T> var0, Comparable<?> var1) {
      return var0.y((T)var1);
   }

   public static void N(class08329 var0, int var1) {
      var0.N("DataVersion", var1);
   }

   public static Dynamic<class07709> N(Dynamic<class07709> var0) {
      int ix = class07529.y().comp_4026().y();
      return N(var0, ix);
   }

   public static Dynamic<class07709> N(Dynamic<class07709> var0, int var1) {
      return var0.set("DataVersion", var0.createInt(var1));
   }

   public static class07001 N(class00500 var0) {
      class07001 class07001x = new class07001();
      class07001x.N_67("Name", class04206.i.y(var0.i()).toString());
      Map<class08092<?>, Comparable<?>> map = var0.L();
      if (!map.isEmpty()) {
         class07001 class07001x = new class07001();

         for (Entry entry : map.entrySet()) {
            class08092<?> class08092 = (class08092<?>)entry.getKey();
            class07001x.N_67(class08092.R(), N(class08092, (Comparable<?>)entry.getValue()));
         }

         class07001x.N("Properties", class07001x);
      }

      return class07001x;
   }

   public static int R(class07001 var0) {
      return y(var0, -1);
   }
}
