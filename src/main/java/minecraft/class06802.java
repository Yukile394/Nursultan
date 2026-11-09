package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

class class06802 implements class06777 {
   private Function<SuggestionsBuilder, CompletableFuture<Suggestions>> N = class06762.U;

   class06802() {
      super();
   }

   @Override
   public void N(Function<SuggestionsBuilder, CompletableFuture<Suggestions>> var1) {
      this.N = var1;
   }

   public CompletableFuture<Suggestions> N(SuggestionsBuilder var1, StringReader var2) {
      return this.N.apply(var1.createOffset(var2.getCursor()));
   }
}
