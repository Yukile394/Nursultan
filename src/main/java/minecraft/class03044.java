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
import java.util.Optional;
import java.util.Set;

public class class03044 extends DataFix {
   private final Set<String> N;

   public class03044(Schema var1, Set<String> var2) {
      super(var1, true);
      this.N = var2;
   }

   private Typed<?> N(Typed<?> var1, OpticFinder<?> var2, OpticFinder<String> var3, String var4) {
      Optional optional = var1.getOptionalTyped(var2);
      if (optional.isEmpty()) {
         return var1;
      } else {
         String s = ((Typed)optional.get()).getOptional(var3).orElse("");
         return !this.N.contains(s) ? var1 : class07536.N(var1, var1.getType(), var1x -> var1x.remove(var4));
      }
   }

   public TypeRewriteRule makeRule() {
      Type type = this.getInputSchema().getType(class06962.l);
      OpticFinder opticfinder = type.findField("tag");
      OpticFinder opticfinder1 = opticfinder.type().findField("BlockEntityTag");
      Type type1 = this.getInputSchema().getType(class06962.o);
      OpticFinder opticfinder2 = DSL.namedChoice("minecraft:falling_block", this.getInputSchema().getChoiceType(class06962.o, "minecraft:falling_block"));
      OpticFinder opticfinder3 = opticfinder2.type().findField("TileEntityData");
      Type type2 = this.getInputSchema().getType(class06962.M);
      OpticFinder opticfinder4 = type2.findField("blocks");
      OpticFinder opticfinder5 = DSL.typeFinder(((ListType)opticfinder4.type()).getElement());
      OpticFinder opticfinder6 = opticfinder5.type().findField("nbt");
      OpticFinder opticfinder7 = DSL.fieldFinder("id", class00622.N());
      return TypeRewriteRule.seq(
         this.fixTypeEverywhereTyped(
            "ItemRemoveBlockEntityTagFix",
            type,
            var4x -> var4x.updateTyped(opticfinder, var3xx -> this.N(var3xx, opticfinder1, opticfinder7, "BlockEntityTag"))
         ),
         new TypeRewriteRule[]{
            this.fixTypeEverywhereTyped(
               "FallingBlockEntityRemoveBlockEntityTagFix",
               type1,
               var4x -> var4x.updateTyped(opticfinder2, var3xx -> this.N(var3xx, opticfinder3, opticfinder7, "TileEntityData"))
            ),
            this.fixTypeEverywhereTyped(
               "StructureRemoveBlockEntityTagFix",
               type2,
               var5x -> var5x.updateTyped(
                  opticfinder4, var4xx -> var4xx.updateTyped(opticfinder5, var3xxx -> this.N(var3xxx, opticfinder6, opticfinder7, "nbt"))
               )
            ),
            this.convertUnchecked(
               "ItemRemoveBlockEntityTagFix - update block entity type",
               this.getInputSchema().getType(class06962.G),
               this.getOutputSchema().getType(class06962.G)
            )
         }
      );
   }
}
