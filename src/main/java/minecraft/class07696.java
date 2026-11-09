package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class class07696 implements ArgumentType<class06541> {
   private static final Collection<String> y = Arrays.asList("red", "green");
   public static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(var0 -> class00392.y("argument.color.invalid", var0));

   private class07696() {
      super();
   }

   public static class06541 N(CommandContext<class07701> var0, String var1) {
      return (class06541)var0.getArgument(var1, class06541.class);
   }

   public static class07696 N() {
      return new class07696();
   }

   public class06541 parse(StringReader var1) throws CommandSyntaxException {
      String s = var1.readUnquotedString();
      class06541 class06541 = class06541.y(s);
      if (class06541 != null && !class06541.L()) {
         return class06541;
      } else {
         throw N.createWithContext(var1, s);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return class07689.y(class06541.N(true, false), var2);
   }

   public Collection<String> getExamples() {
      return y;
   }
}
