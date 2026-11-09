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

public class class00877 implements ArgumentType<class00903> {
   private static final Collection<String> N = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "foo{bar=baz}");
   private final class01905<class00891> y;

   public class00877(class04348 var1) {
      super();
      this.y = var1.y(class04227.Z);
   }

   public class00903 parse(StringReader var1) throws CommandSyntaxException {
      class00904 class00904 = class00892.N(this.y, var1, true);
      return new class00903(class00904.N(), class00904.y().keySet(), class00904.L());
   }

   public static class00877 N(class04348 var0) {
      return new class00877(var0);
   }

   public static class00903 N(CommandContext<class07701> var0, String var1) {
      return (class00903)var0.getArgument(var1, class00903.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return class00892.N(this.y, var2, false, true);
   }

   public Collection<String> getExamples() {
      return N;
   }
}
