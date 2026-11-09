package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Streams;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List.ListType;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class class05012 extends DataFix {
   public class05012(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private <TE> TypeRewriteRule N(Type<?> var1, ListType<TE> var2) {
      Type type = var2.getElement();
      OpticFinder opticfinder = DSL.fieldFinder("Level", var1);
      OpticFinder opticfinder1 = DSL.fieldFinder("TileEntities", var2);
      short short1 = 416;
      return TypeRewriteRule.seq(
         this.fixTypeEverywhere(
            "InjectBedBlockEntityType",
            this.getInputSchema().findChoiceType(class06962.G),
            this.getOutputSchema().findChoiceType(class06962.G),
            var0 -> var0x -> var0x
         ),
         this.fixTypeEverywhereTyped(
            "BedBlockEntityInjecter",
            this.getOutputSchema().getType(class06962.u),
            var3x -> {
               Typed typed = var3x.getTyped(opticfinder);
               Dynamic<?> dynamic = (Dynamic<?>)typed.get(DSL.remainderFinder());
               int i = dynamic.get("xPos").asInt(0);
               int j = dynamic.get("zPos").asInt(0);
               ArrayList arraylist = Lists.newArrayList((Iterable)typed.getOrCreate(opticfinder1));

               for (Dynamic dynamic1 : dynamic.get("Sections").asList(Function.identity())) {
                  int k = dynamic1.get("Y").asInt(0);
                  Streams.mapWithIndex(dynamic1.get("Blocks").asIntStream(), (var4x, var5x) -> {
                        if (416 == (var4x & 0xFF) << 4) {
                           int ix = (int)var5x;
                           int jx = ix & 15;
                           int kx = ix >> 8 & 15;
                           int l = ix >> 4 & 15;
                           HashMap hashmap = Maps.newHashMap();
                           hashmap.put(dynamic1.createString("id"), dynamic1.createString("minecraft:bed"));
                           hashmap.put(dynamic1.createString("x"), dynamic1.createInt(jx + (i << 4)));
                           hashmap.put(dynamic1.createString("y"), dynamic1.createInt(kx + (k << 4)));
                           hashmap.put(dynamic1.createString("z"), dynamic1.createInt(l + (j << 4)));
                           hashmap.put(dynamic1.createString("color"), dynamic1.createShort((short)14));
                           return hashmap;
                        } else {
                           return null;
                        }
                     })
                     .forEachOrdered(
                        var3xx -> {
                           if (var3xx != null) {
                              arraylist.add(
                                 ((Pair)type.read(dynamic1.createMap(var3xx))
                                       .result()
                                       .orElseThrow(() -> new IllegalStateException("Could not parse newly created bed block entity.")))
                                    .getFirst()
                              );
                           }
                        }
                     );
               }

               return !arraylist.isEmpty() ? var3x.set(opticfinder, typed.set(opticfinder1, arraylist)) : var3x;
            }
         )
      );
   }

   public TypeRewriteRule makeRule() {
      Type<?> type = this.getOutputSchema().getType(class06962.u).findFieldType("Level");
      if (!(type.findFieldType("TileEntities") instanceof ListType listtype)) {
         throw new IllegalStateException("Tile entity type is not a list type.");
      } else {
         return this.N(type, listtype);
      }
   }
}
