package minecraft;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DynamicOps;
import java.util.Locale;
import java.util.function.Function;

public abstract class class08147 extends DataFix {
   protected final String N;

   public class08147(String var1, Schema var2, boolean var3) {
      super(var2, var3);
      this.N = var1;
   }

   protected abstract Pair<String, Typed<?>> N(String var1, Typed<?> var2);

   private <A> Typed<A> N(Object var1, DynamicOps<?> var2, Type<A> var3) {
      return new Typed(var3, var2, var1);
   }

   public TypeRewriteRule makeRule() {
      TaggedChoiceType taggedchoicetype = this.getInputSchema().findChoiceType(class06962.o);
      TaggedChoiceType taggedchoicetype1 = this.getOutputSchema().findChoiceType(class06962.o);
      Function function = class07536.y_4(var2x -> class02269.N((Type<?>)taggedchoicetype.types().get(var2x), taggedchoicetype, taggedchoicetype1));
      return this.fixTypeEverywhere(
         this.N,
         taggedchoicetype,
         taggedchoicetype1,
         var3x -> var4 -> {
            String s = (String)var4.getFirst();
            Type type = (Type)function.apply(s);
            Pair<String, Typed<?>> pair = this.N(s, this.N(var4.getSecond(), var3x, type));
            Type type1 = (Type)taggedchoicetype1.types().get(pair.getFirst());
            if (!type1.equals(((Typed)pair.getSecond()).getType(), true, true)) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "Dynamic type check failed: %s not equal to %s", type1, ((Typed)pair.getSecond()).getType())
               );
            } else {
               return Pair.of((String)pair.getFirst(), ((Typed)pair.getSecond()).getValue());
            }
         }
      );
   }
}
