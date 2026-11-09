package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DynamicOps;
import java.util.Locale;
import java.util.Objects;

public abstract class class08181 extends DataFix {
   private final String N;

   public class08181(String var1, Schema var2, boolean var3) {
      super(var2, var3);
      this.N = var1;
   }

   protected abstract String N(String var1);

   public TypeRewriteRule makeRule() {
      TaggedChoiceType taggedchoicetype = this.getInputSchema().findChoiceType(class06962.o);
      TaggedChoiceType taggedchoicetype1 = this.getOutputSchema().findChoiceType(class06962.o);
      Type type = DSL.named(class06962.I.typeName(), class00622.N());
      if (!Objects.equals(this.getOutputSchema().getType(class06962.I), type)) {
         throw new IllegalStateException("Entity name type is not what was expected.");
      } else {
         return TypeRewriteRule.seq(this.fixTypeEverywhere(this.N, taggedchoicetype, taggedchoicetype1, var3x -> var3xx -> var3xx.mapFirst(var3xxx -> {
            String s = this.N(var3xxx);
            Type typex = (Type)taggedchoicetype.types().get(var3xxx);
            Type type1 = (Type)taggedchoicetype1.types().get(s);
            if (!type1.equals(typex, true, true)) {
               throw new IllegalStateException(String.format(Locale.ROOT, "Dynamic type check failed: %s not equal to %s", type1, typex));
            } else {
               return s;
            }
         })), this.fixTypeEverywhere(this.N + " for entity name", type, var1x -> var1xx -> var1xx.mapSecond(this::N)));
      }
   }
}
