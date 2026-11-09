package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;

public abstract class class00955 extends DataFix {
   private final String L;
   protected final String N;
   protected final TypeReference y;

   public class00955(Schema var1, boolean var2, String var3, TypeReference var4, String var5) {
      super(var1, var2);
      this.L = var3;
      this.y = var4;
      this.N = var5;
   }

   protected abstract Typed<?> N(Typed<?> var1);

   public TypeRewriteRule makeRule() {
      OpticFinder opticfinder = DSL.namedChoice(this.N, this.getInputSchema().getChoiceType(this.y, this.N));
      return this.fixTypeEverywhereTyped(
         this.L,
         this.getInputSchema().getType(this.y),
         this.getOutputSchema().getType(this.y),
         var2 -> var2.updateTyped(opticfinder, this.getOutputSchema().getChoiceType(this.y, this.N), this::N)
      );
   }
}
