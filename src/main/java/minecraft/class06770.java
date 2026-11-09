package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class class06770 implements ArgumentType<class06778> {
   private static final Collection<String> N = Arrays.asList("stick", "minecraft:stick", "stick{foo=bar}");
   private final class06762 y;

   public class06770(class04348 var1) {
      super();
      this.y = new class06762(var1);
   }

   public class06778 parse(StringReader var1) throws CommandSyntaxException {
      class06796 class06796 = this.y.N(var1);
      return new class06778(class06796.N(), class06796.y());
   }

   public static class06770 N(class04348 var0) {
      return new class06770(var0);
   }

   public static <S> class06778 N(CommandContext<S> var0, String var1) {
      return (class06778)var0.getArgument(var1, class06778.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return this.y.N(var2);
   }

   public Collection<String> getExamples() {
      return N;
   }
}
