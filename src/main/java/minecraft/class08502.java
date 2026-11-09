package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.concurrent.CompletableFuture;

class class08502<T> implements class08530<T> {
   class08502(class08530 var1, class08530 var2, Codec var3, DynamicOps var4, DynamicCommandExceptionType var5) {
      super();
      this.i = var1;
      this.N = var2;
      this.y = var3;
      this.L = var4;
      this.u = var5;
   }

   @Override
   public CompletableFuture<Suggestions> N(SuggestionsBuilder var1) {
      return this.i.N(var1);
   }

   @Override
   public T N(StringReader var1) throws CommandSyntaxException {
      int ix = var1.getCursor();
      Object object = this.N.N(var1);
      return (T)this.y.parse(this.L, object).getOrThrow(var3x -> {
         var1.setCursor(ix);
         return var2x.createWithContext(var1, var3x);
      });
   }
}
