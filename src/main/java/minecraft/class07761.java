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

public class class07761 implements ArgumentType<String> {
   private static final Collection<String> N = Arrays.asList("foo", "123");
   private static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(var0 -> class00392.y("team.notFound", var0));

   public class07761() {
      super();
   }

   public static class00502 N(CommandContext<class07701> var0, String var1) throws CommandSyntaxException {
      String s = (String)var0.getArgument(var1, String.class);
      class00502 class00502 = ((class07701)var0.getSource()).W().yB().y(s);
      if (class00502 == null) {
         throw y.create(s);
      } else {
         return class00502;
      }
   }

   public static class07761 N() {
      return new class07761();
   }

   public String parse(StringReader var1) throws CommandSyntaxException {
      return var1.readUnquotedString();
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return var1.getSource() instanceof class07689 ? class07689.y(((class07689)var1.getSource()).j(), var2) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return N;
   }
}
