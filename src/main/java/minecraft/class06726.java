package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List.ListType;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.slf4j.Logger;

public class class06726 extends DataFix {
   private static final Logger N = LogUtils.getLogger();
   private static final int y = 4096;
   private static final short L = 12;

   public class06726(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      if (!(this.getOutputSchema().getType(class06962.u).findFieldType("Level").findFieldType("TileEntities") instanceof ListType listtype)) {
         throw new IllegalStateException("Tile entity type is not a list type.");
      } else {
         OpticFinder opticfinder = DSL.fieldFinder("TileEntities", listtype);
         Type type = this.getInputSchema().getType(class06962.u);
         OpticFinder opticfinder1 = type.findField("Level");
         OpticFinder opticfinder2 = opticfinder1.type().findField("Sections");
         Type type1 = opticfinder2.type();
         if (!(type1 instanceof ListType)) {
            throw new IllegalStateException("Expecting sections to be a list.");
         } else {
            OpticFinder opticfinder3 = DSL.typeFinder(((ListType)type1).getElement());
            return TypeRewriteRule.seq(
               new class05000(this.getOutputSchema(), "AddTrappedChestFix", class06962.G).makeRule(),
               this.fixTypeEverywhereTyped(
                  "Trapped Chest fix",
                  type,
                  var5x -> var5x.updateTyped(
                     opticfinder1,
                     var4xx -> {
                        Optional optional = var4xx.getOptionalTyped(opticfinder2);
                        if (optional.isEmpty()) {
                           return var4xx;
                        } else {
                           List list = ((Typed)optional.get()).getAllTyped(opticfinder3);
                           IntOpenHashSet intopenhashset = new IntOpenHashSet();

                           for (Typed typed : list) {
                              class06716 class06716 = new class06716(typed, this.getInputSchema());
                              if (!class06716.y()) {
                                 for (int i = 0; i < 4096; i++) {
                                    int j = class06716.u(i);
                                    if (class06716.N(j)) {
                                       intopenhashset.add(class06716.L() << 12 | i);
                                    }
                                 }
                              }
                           }

                           Dynamic dynamic = (Dynamic)var4xx.get(DSL.remainderFinder());
                           int k = dynamic.get("xPos").asInt(0);
                           int l = dynamic.get("zPos").asInt(0);
                           TaggedChoiceType taggedchoicetype = this.getInputSchema().findChoiceType(class06962.G);
                           return var4xx.updateTyped(
                              opticfinder,
                              var4xxx -> var4xxx.updateTyped(
                                 taggedchoicetype.finder(),
                                 var4xxxx -> {
                                    Dynamic dynamicx = (Dynamic)var4xxxx.getOrCreate(DSL.remainderFinder());
                                    int ix = dynamicx.get("x").asInt(0) - (k << 4);
                                    int jx = dynamicx.get("y").asInt(0);
                                    int kx = dynamicx.get("z").asInt(0) - (l << 4);
                                    return intopenhashset.contains(class06616.N(ix, jx, kx))
                                       ? var4xxxx.update(taggedchoicetype.finder(), var0xx -> var0xx.mapFirst(var0xxx -> {
                                          if (!Objects.equals(var0xxx, "minecraft:chest")) {
                                             N.warn("Block Entity was expected to be a chest");
                                          }

                                          return "minecraft:trapped_chest";
                                       }))
                                       : var4xxxx;
                                 }
                              )
                           );
                        }
                     }
                  )
               )
            );
         }
      }
   }
}
