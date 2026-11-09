package minecraft;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DynamicOps;
import java.util.Locale;

public class class05000 extends DataFix {
   private final String N;
   private final TypeReference y;

   public class05000(Schema var1, String var2, TypeReference var3) {
      super(var1, true);
      this.N = var2;
      this.y = var3;
   }

   private <K> TypeRewriteRule N(TaggedChoiceType<K> var1, TaggedChoiceType<?> var2) {
      if (var1.getKeyType() != var2.getKeyType()) {
         throw new IllegalStateException("Could not inject: key type is not the same");
      } else {
         return this.fixTypeEverywhere(this.N, var1, var2, var2x -> var2xx -> {
            if (!var2.hasType(var2xx.getFirst())) {
               throw new IllegalArgumentException(String.format(Locale.ROOT, "%s: Unknown type %s in '%s'", this.N, var2xx.getFirst(), this.y.typeName()));
            } else {
               return var2xx;
            }
         });
      }
   }

   public TypeRewriteRule makeRule() {
      TaggedChoiceType taggedchoicetype = this.getInputSchema().findChoiceType(this.y);
      TaggedChoiceType taggedchoicetype1 = this.getOutputSchema().findChoiceType(this.y);
      return this.N(taggedchoicetype, taggedchoicetype1);
   }
}
