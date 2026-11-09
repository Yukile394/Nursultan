package minecraft;

import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List.ListType;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableInt;
import org.jspecify.annotations.Nullable;

public class class03018 extends DataFix {
   private static final int N = 16;
   private static final ImmutableSet<String> y = ImmutableSet.of(
      "minecraft:bubble_column", "minecraft:kelp", "minecraft:kelp_plant", "minecraft:seagrass", "minecraft:tall_seagrass"
   );

   public class03018(Schema var1) {
      super(var1, false);
   }

   private static String y(@Nullable Dynamic<?> var0) {
      if (var0 == null) {
         return "minecraft:empty";
      } else {
         String s = var0.get("Name").asString("");
         if ("minecraft:water".equals(s)) {
            return var0.get("Properties").get("level").asInt(0) == 0 ? "minecraft:water" : "minecraft:flowing_water";
         } else if ("minecraft:lava".equals(s)) {
            return var0.get("Properties").get("level").asInt(0) == 0 ? "minecraft:lava" : "minecraft:flowing_lava";
         } else {
            return !y.contains(s) && !var0.get("Properties").get("waterlogged").asBoolean(false) ? "minecraft:empty" : "minecraft:water";
         }
      }
   }

   private Dynamic<?> N(
      Dynamic<?> var1, Int2ObjectMap<Supplier<class03021>> var2, byte var3, int var4, int var5, String var6, Function<Dynamic<?>, String> var7
   ) {
      Stream stream = Stream.empty();
      List list = var1.get(var6).asList(Function.identity());

      for (int i = 0; i < list.size(); i++) {
         int j = i + var3;
         Supplier supplier = (Supplier)var2.get(j);
         Stream stream1 = ((Dynamic)list.get(i))
            .asStream()
            .mapToInt(var0 -> var0.asShort((short)-1))
            .filter(var0 -> var0 > 0)
            .mapToObj(var7x -> this.N(var1, supplier, var4, j, var5, var7x, var7));
         stream = Stream.concat(stream, stream1);
      }

      return var1.createList(stream);
   }

   private Dynamic<?> N(Dynamic<?> var1, @Nullable Supplier<class03021> var2, int var3, int var4, int var5, int var6, Function<Dynamic<?>, String> var7) {
      int i = var6 & 15;
      int j = var6 >>> 4 & 15;
      int k = var6 >>> 8 & 15;
      String s = (String)var7.apply(var2 != null ? ((class03021)var2.get()).N(i, j, k) : null);
      return var1.createMap(
         ImmutableMap.builder()
            .put(var1.createString("i"), var1.createString(s))
            .put(var1.createString("x"), var1.createInt(var3 * 16 + i))
            .put(var1.createString("y"), var1.createInt(var4 * 16 + j))
            .put(var1.createString("z"), var1.createInt(var5 * 16 + k))
            .put(var1.createString("t"), var1.createInt(0))
            .put(var1.createString("p"), var1.createInt(0))
            .build()
      );
   }

   private static String N(@Nullable Dynamic<?> var0) {
      return var0 != null ? var0.get("Name").asString("minecraft:air") : "minecraft:air";
   }

   protected TypeRewriteRule makeRule() {
      Type<?> type = this.getInputSchema().getType(class06962.u);
      OpticFinder<?> opticfinder = type.findField("Level");
      OpticFinder<?> opticfinder1 = opticfinder.type().findField("Sections");
      OpticFinder opticfinder2 = ((ListType)opticfinder1.type()).getElement().finder();
      OpticFinder<?> opticfinder3 = opticfinder2.type().findField("block_states");
      OpticFinder<?> opticfinder4 = opticfinder2.type().findField("biomes");
      OpticFinder<?> opticfinder5 = opticfinder3.type().findField("palette");
      OpticFinder<?> opticfinder6 = opticfinder.type().findField("TileTicks");
      return this.fixTypeEverywhereTyped(
         "ChunkProtoTickListFix",
         type,
         var8x -> var8x.updateTyped(
            opticfinder,
            var7xx -> {
               var7xx = var7xx.update(
                  DSL.remainderFinder(),
                  var0 -> (Dynamic)DataFixUtils.orElse(
                     var0.get("LiquidTicks").result().map(var1xxx -> var0.set("fluid_ticks", var1xxx).remove("LiquidTicks")), var0
                  )
               );
               Dynamic<?> dynamic = (Dynamic<?>)var7xx.get(DSL.remainderFinder());
               MutableInt mutableint = new MutableInt();
               Int2ObjectArrayMap int2objectarraymap = new Int2ObjectArrayMap();
               var7xx.getOptionalTyped(opticfinder1)
                  .ifPresent(
                     var6xxx -> var6xxx.getAllTyped(opticfinder2)
                        .forEach(
                           var5xxxx -> {
                              int ix = ((Dynamic)var5xxxx.get(DSL.remainderFinder())).get("Y").asInt(Integer.MAX_VALUE);
                              if (ix != Integer.MAX_VALUE) {
                                 if (var5xxxx.getOptionalTyped(opticfinder4).isPresent()) {
                                    mutableint.setValue(Math.min(ix, mutableint.intValue()));
                                 }

                                 var5xxxx.getOptionalTyped(opticfinder3)
                                    .ifPresent(
                                       var3xxxxx -> int2objectarraymap.put(
                                          ix,
                                          Suppliers.memoize(
                                             () -> {
                                                List list = var3xxxxx.getOptionalTyped(opticfinder5)
                                                   .map(
                                                      var0xxxx -> var0xxxx.write()
                                                         .result()
                                                         .map(var0xxxxx -> var0xxxxx.asList(Function.identity()))
                                                         .orElse(Collections.emptyList())
                                                   )
                                                   .orElse(Collections.emptyList());
                                                long[] along = ((Dynamic)var3xxxxx.get(DSL.remainderFinder())).get("data").asLongStream().toArray();
                                                return new class03021(list, along);
                                             }
                                          )
                                       )
                                    );
                              }
                           }
                        )
                  );
               byte b0 = mutableint.byteValue();
               var7xx = var7xx.update(DSL.remainderFinder(), var1xxx -> var1xxx.update("yPos", var1xxxx -> var1xxxx.createByte(b0)));
               if (!var7xx.getOptionalTyped(opticfinder6).isPresent() && !dynamic.get("fluid_ticks").result().isPresent()) {
                  int i = dynamic.get("xPos").asInt(0);
                  int j = dynamic.get("zPos").asInt(0);
                  Dynamic<?> dynamic1 = this.N(dynamic, int2objectarraymap, b0, i, j, "LiquidsToBeTicked", class03018::y);
                  Dynamic<?> dynamic2 = this.N(dynamic, int2objectarraymap, b0, i, j, "ToBeTicked", class03018::N);
                  Optional optional = opticfinder6.type().readTyped(dynamic2).result();
                  if (optional.isPresent()) {
                     var7xx = var7xx.set(opticfinder6, (Typed)((Pair)optional.get()).getFirst());
                  }

                  return var7xx.update(DSL.remainderFinder(), var1xxx -> var1xxx.remove("ToBeTicked").remove("LiquidsToBeTicked").set("fluid_ticks", dynamic1));
               } else {
                  return var7xx;
               }
            }
         )
      );
   }
}
