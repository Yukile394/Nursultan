package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.CompoundList.CompoundListType;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class class06259 extends DataFix {
   public class06259(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private <SF> TypeRewriteRule N(CompoundListType<String, SF> var1) {
      Type<?> type = this.getInputSchema().getType(class06962.u);
      Type<?> type1 = this.getInputSchema().getType(class06962.H);
      OpticFinder<?> opticfinder = type.findField("Level");
      OpticFinder<?> opticfinder1 = opticfinder.type().findField("Structures");
      OpticFinder<?> opticfinder2 = opticfinder1.type().findField("Starts");
      OpticFinder opticfinder3 = var1.finder();
      return TypeRewriteRule.seq(
         this.fixTypeEverywhereTyped(
            "NewVillageFix",
            type,
            var4x -> var4x.updateTyped(
               opticfinder,
               var3xx -> var3xx.updateTyped(
                  opticfinder1,
                  var2xxx -> var2xxx.updateTyped(
                        opticfinder2,
                        var1xxxx -> var1xxxx.update(
                           opticfinder3,
                           var0xxxx -> var0xxxx.stream()
                              .filter(var0xxxxx -> !Objects.equals(var0xxxxx.getFirst(), "Village"))
                              .map(var0xxxxx -> var0xxxxx.mapFirst(var0xxxxxx -> var0xxxxxx.equals("New_Village") ? "Village" : var0xxxxxx))
                              .collect(Collectors.toList())
                        )
                     )
                     .update(
                        DSL.remainderFinder(),
                        var0xxx -> var0xxx.update(
                           "References",
                           var0xxxx -> ((Dynamic)DataFixUtils.orElse(
                                 var0xxxx.get("New_Village").result().map(var1xxxx -> var0xxxx.remove("New_Village").set("Village", var1xxxx)), var0xxxx
                              ))
                              .remove("Village")
                        )
                     )
               )
            )
         ),
         this.fixTypeEverywhereTyped(
            "NewVillageStartFix",
            type1,
            var0 -> var0.update(
               DSL.remainderFinder(),
               var0x -> var0x.update(
                  "id",
                  var0xx -> Objects.equals(class00622.N(var0xx.asString("")), "minecraft:new_village") ? var0xx.createString("minecraft:village") : var0xx
               )
            )
         )
      );
   }

   protected TypeRewriteRule makeRule() {
      CompoundListType compoundlisttype = DSL.compoundList(DSL.string(), this.getInputSchema().getType(class06962.H));
      OpticFinder opticfinder = compoundlisttype.finder();
      return this.N(compoundlisttype);
   }
}
