package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List.ListType;
import com.mojang.serialization.Dynamic;

public class class02843 extends DataFix {
   public class02843(Schema var1) {
      super(var1, true);
   }

   private Dynamic<?> y(Dynamic<?> var1) {
      var1 = var1.remove("EntityData");
      var1 = var1.renameField("TicksInHive", "ticks_in_hive");
      return var1.renameField("MinOccupationTicks", "min_ticks_in_hive");
   }

   private Dynamic<?> N(Dynamic<?> var1) {
      return var1.remove("Bees");
   }

   public TypeRewriteRule makeRule() {
      Type type = this.getInputSchema().getChoiceType(class06962.G, "minecraft:beehive");
      OpticFinder opticfinder = DSL.namedChoice("minecraft:beehive", type);
      ListType listtype = (ListType)type.findFieldType("Bees");
      Type type1 = listtype.getElement();
      OpticFinder opticfinder1 = DSL.fieldFinder("Bees", listtype);
      OpticFinder opticfinder2 = DSL.typeFinder(type1);
      Type type2 = this.getInputSchema().getType(class06962.G);
      Type type3 = this.getOutputSchema().getType(class06962.G);
      return this.fixTypeEverywhereTyped(
         "BeehiveFieldRenameFix",
         type2,
         type3,
         var5x -> class02269.N(
            type3,
            var5x.updateTyped(
               opticfinder,
               var3xx -> var3xx.update(DSL.remainderFinder(), this::N)
                  .updateTyped(opticfinder1, var2xxx -> var2xxx.updateTyped(opticfinder2, var1xxxx -> var1xxxx.update(DSL.remainderFinder(), this::y)))
            )
         )
      );
   }
}
