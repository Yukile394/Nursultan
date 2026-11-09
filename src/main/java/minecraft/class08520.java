package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;

public abstract class class08520<T> implements ArgumentType<T> {
   private final class08530<T> N;

   public class08520(class08530<T> var1) {
      super();
      this.N = var1;
   }

   public T parse(StringReader var1) throws CommandSyntaxException {
      return this.N.N(var1);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return this.N.N(var2);
   }
}
