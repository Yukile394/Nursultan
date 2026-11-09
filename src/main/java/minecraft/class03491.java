package minecraft;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;

public class class03491 extends DataFix {
   private static final String N = "minecraft:decorated_pot";

   public class03491(Schema var1) {
      super(var1, true);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> type = this.getInputSchema().getChoiceType(class06962.G, "minecraft:decorated_pot");
      Type<?> type1 = this.getOutputSchema().getChoiceType(class06962.G, "minecraft:decorated_pot");
      return this.convertUnchecked("DecoratedPotFieldRenameFix", type, type1);
   }
}
