package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class class03290 extends DataFix {
   private static final String y = "WorldGenSettingsHeightAndBiomeFix";
   public static final String N = "has_increased_height_already";

   public class03290(Schema var1) {
      super(var1, true);
   }

   private static Dynamic<?> N(Dynamic<?> var0) {
      Dynamic dynamic = var0.createMap(
         ImmutableMap.of(var0.createString("height"), var0.createInt(64), var0.createString("block"), var0.createString("minecraft:air"))
      );
      return var0.createList(Stream.concat(Stream.of(dynamic), var0.asStream()));
   }

   protected TypeRewriteRule makeRule() {
      Type type = this.getInputSchema().getType(class06962.A);
      OpticFinder opticfinder = type.findField("dimensions");
      Type type1 = this.getOutputSchema().getType(class06962.A);
      Type type2 = type1.findFieldType("dimensions");
      return this.fixTypeEverywhereTyped(
         "WorldGenSettingsHeightAndBiomeFix",
         type,
         type1,
         var2x -> {
            OptionalDynamic optionaldynamic = ((Dynamic)var2x.get(DSL.remainderFinder())).get("has_increased_height_already");
            boolean flag = optionaldynamic.result().isEmpty();
            boolean flag1 = optionaldynamic.asBoolean(true);
            return var2x.update(DSL.remainderFinder(), var0x -> var0x.remove("has_increased_height_already"))
               .updateTyped(
                  opticfinder,
                  type2,
                  var3x -> class07536.N(
                     var3x,
                     type2,
                     var2xxx -> var2xxx.update(
                        "minecraft:overworld",
                        var2xxxx -> var2xxxx.update(
                           "generator",
                           var2xxxxx -> {
                              String s = var2xxxxx.get("type").asString("");
                              if ("minecraft:noise".equals(s)) {
                                 MutableBoolean mutableboolean = new MutableBoolean();
                                 var2xxxxx = var2xxxxx.update(
                                    "biome_source",
                                    var2xxxxxx -> {
                                       String s1 = var2xxxxxx.get("type").asString("");
                                       if ("minecraft:vanilla_layered".equals(s1) || flag && "minecraft:multi_noise".equals(s1)) {
                                          if (var2xxxxxx.get("large_biomes").asBoolean(false)) {
                                             mutableboolean.setTrue();
                                          }

                                          return var2xxxxxx.createMap(
                                             ImmutableMap.of(
                                                var2xxxxxx.createString("preset"),
                                                var2xxxxxx.createString("minecraft:overworld"),
                                                var2xxxxxx.createString("type"),
                                                var2xxxxxx.createString("minecraft:multi_noise")
                                             )
                                          );
                                       } else {
                                          return var2xxxxxx;
                                       }
                                    }
                                 );
                                 return mutableboolean.booleanValue()
                                    ? var2xxxxx.update(
                                       "settings",
                                       var0xxxxx -> "minecraft:overworld".equals(var0xxxxx.asString(""))
                                          ? var0xxxxx.createString("minecraft:large_biomes")
                                          : var0xxxxx
                                    )
                                    : var2xxxxx;
                              } else if ("minecraft:flat".equals(s)) {
                                 return flag1 ? var2xxxxx : var2xxxxx.update("settings", var0xxxxx -> var0xxxxx.update("layers", class03290::N));
                              } else {
                                 return var2xxxxx;
                              }
                           }
                        )
                     )
                  )
               );
         }
      );
   }
}
