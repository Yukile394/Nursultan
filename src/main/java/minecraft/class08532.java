package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

class class08532<S> implements class08530<S> {
   class08532(class08530 var1, Function var2) {
      super();
      this.y = var1;
      this.N = var2;
   }

   @Override
   public S N(StringReader var1) throws CommandSyntaxException {
      return (S)this.N.apply(this.y.N(var1));
   }

   @Override
   public CompletableFuture<Suggestions> N(SuggestionsBuilder var1) {
      return this.y.N(var1);
   }
}
