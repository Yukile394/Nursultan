package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;

public abstract class class01733 extends DataFix {
   private final String N;
   private final String y;
   private final TypeReference L;

   public class01733(Schema var1, boolean var2, String var3, TypeReference var4, String var5) {
      super(var1, var2);
      this.N = var3;
      this.L = var4;
      this.y = var5;
   }

   protected abstract <T> Dynamic<T> N(Dynamic<T> var1);

   private <S, T, A> TypeRewriteRule N(Type<S> var1, Type<T> var2, Type<?> var3, OpticFinder<A> var4) {
      return this.fixTypeEverywhereTyped(
         this.N, var1, var2, var4x -> var4x.getOptional(var4).isEmpty() ? class02269.N(var2, var4x) : class07536.N(class02269.N(var3, var4x), var2, this::N)
      );
   }

   public TypeRewriteRule makeRule() {
      Type<?> type = this.getInputSchema().getType(this.L);
      Type<?> type1 = this.getInputSchema().getChoiceType(this.L, this.y);
      Type<?> type2 = this.getOutputSchema().getType(this.L);
      OpticFinder opticfinder = DSL.namedChoice(this.y, type1);
      Type<?> type3 = class02269.N(type, type, type2);
      return this.N(type, type2, type3, opticfinder);
   }
}
