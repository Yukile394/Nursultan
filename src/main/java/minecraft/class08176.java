package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;
import java.util.Map;

public class class08176 extends DataFix {
   private final String N;
   private final Map<String, String> y;

   public class08176(Schema var1, String var2, Map<String, String> var3) {
      super(var1, false);
      this.N = var2;
      this.y = var3;
   }

   private TypeRewriteRule y() {
      Type<?> type = this.getOutputSchema().getType(class06962.B);
      Type<?> type1 = this.getInputSchema().getType(class06962.B);
      OpticFinder<?> opticfinder = type1.findField("stats");
      OpticFinder<?> opticfinder1 = opticfinder.type().findField("minecraft:custom");
      OpticFinder<String> opticfinder2 = class00622.N().finder();
      return this.fixTypeEverywhereTyped(
         this.N,
         type1,
         type,
         var4x -> var4x.updateTyped(
            opticfinder,
            var3xx -> var3xx.updateTyped(opticfinder1, var2xxx -> var2xxx.update(opticfinder2, var1xxxx -> this.y.getOrDefault(var1xxxx, var1xxxx)))
         )
      );
   }

   private TypeRewriteRule N() {
      Type<?> type = this.getOutputSchema().getType(class06962.c);
      Type<?> type1 = this.getInputSchema().getType(class06962.c);
      OpticFinder<?> opticfinder = type1.findField("CriteriaType");
      Type type2 = (Type)((TaggedChoiceType)opticfinder.type()
            .findChoiceType("type", -1)
            .orElseThrow(() -> new IllegalStateException("Can't find choice type for criteria")))
         .types()
         .get("minecraft:custom");
      if (type2 == null) {
         throw new IllegalStateException("Failed to find custom criterion type variant");
      } else {
         OpticFinder opticfinder1 = DSL.namedChoice("minecraft:custom", type2);
         OpticFinder<String> opticfinder2 = DSL.fieldFinder("id", class00622.N());
         return this.fixTypeEverywhereTyped(
            this.N,
            type1,
            type,
            var4 -> var4.updateTyped(
               opticfinder,
               var3xx -> var3xx.updateTyped(opticfinder1, var2xxx -> var2xxx.update(opticfinder2, var1xxxx -> this.y.getOrDefault(var1xxxx, var1xxxx)))
            )
         );
      }
   }

   protected TypeRewriteRule makeRule() {
      return TypeRewriteRule.seq(this.y(), this.N());
   }
}
