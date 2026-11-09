package minecraft;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;

record class06801(class01894 name, SuggestionProvider<class07689> delegate) implements SuggestionProvider<class07689> {

   class06801(class01894 name, SuggestionProvider<class07689> delegate) {
      super();
      this.name = name;
      this.delegate = delegate;
   }

   public SuggestionProvider<class07689> y() {
      return this.delegate;
   }

   public class01894 N() {
      return this.name;
   }

   public CompletableFuture<Suggestions> getSuggestions(CommandContext<class07689> var1, SuggestionsBuilder var2) throws CommandSyntaxException {
      return this.delegate.getSuggestions(var1, var2);
   }
}
