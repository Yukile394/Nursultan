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
import java.util.function.Predicate;

public class class00878 implements ArgumentType<class00880> {
   private static final Collection<String> N = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "#stone", "#stone[foo=bar]{baz=nbt}");
   private final class01905<class00891> y;

   public class00878(class04348 var1) {
      super();
      this.y = var1.y(class04227.Z);
   }

   public static class00878 N(class04348 var0) {
      return new class00878(var0);
   }

   public static Predicate<class06646> N(CommandContext<class07701> var0, String var1) throws CommandSyntaxException {
      return (Predicate<class06646>)var0.getArgument(var1, class00880.class);
   }

   public static class00880 N(class01905<class00891> var0, StringReader var1) throws CommandSyntaxException {
      return (class00880)class00892.y(var0, var1, true)
         .map(var0x -> new class00862(var0x.N(), var0x.y().keySet(), var0x.L()), var0x -> new class00895(var0x.N(), var0x.y(), var0x.L()));
   }

   public class00880 parse(StringReader var1) throws CommandSyntaxException {
      return N(this.y, var1);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return class00892.N(this.y, var2, true, true);
   }

   public Collection<String> getExamples() {
      return N;
   }
}
