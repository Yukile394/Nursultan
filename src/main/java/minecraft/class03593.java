package minecraft;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DynamicOps;
import java.util.function.UnaryOperator;

public class class03593 extends DataFix {
   private final String N;
   private final UnaryOperator<String> y;

   private class03593(Schema var1, String var2, UnaryOperator<String> var3) {
      super(var1, true);
      this.N = var2;
      this.y = var3;
   }

   public static DataFix N(Schema var0, String var1, UnaryOperator<String> var2) {
      return new class03593(var0, var1, var2);
   }

   public TypeRewriteRule makeRule() {
      TaggedChoiceType taggedchoicetype = this.getInputSchema().findChoiceType(class06962.G);
      TaggedChoiceType taggedchoicetype1 = this.getOutputSchema().findChoiceType(class06962.G);
      return this.fixTypeEverywhere(this.N, taggedchoicetype, taggedchoicetype1, var1x -> var1xx -> var1xx.mapFirst(this.y));
   }
}
