package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class02987 extends DataFix {
   public class02987(Schema var1) {
      super(var1, false);
   }

   private <T> Dynamic<T> N(Dynamic<T> var1) {
      return var1.asString().result().map(var1x -> var1.createString(var1x.replace("\"programer_art\"", "\"programmer_art\""))).orElse(var1);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "OptionsProgrammerArtFix",
         this.getInputSchema().getType(class06962.R),
         var1 -> var1.update(DSL.remainderFinder(), var1x -> var1x.update("resourcePacks", this::N).update("incompatibleResourcePacks", this::N))
      );
   }
}
