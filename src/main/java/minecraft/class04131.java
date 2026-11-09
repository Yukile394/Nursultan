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
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class class04131 implements ArgumentType<class07282> {
   private static final Collection<String> N = Stream.of(class07282.field_9215, class07282.field_9220).map(class07282::y).collect(Collectors.toList());
   private static final class07282[] y = class07282.values();
   private static final DynamicCommandExceptionType L = new DynamicCommandExceptionType(var0 -> class00392.y("argument.gamemode.invalid", var0));

   public class04131() {
      super();
   }

   public static class04131 N() {
      return new class04131();
   }

   public static class07282 N(CommandContext<class07701> var0, String var1) throws CommandSyntaxException {
      return (class07282)var0.getArgument(var1, class07282.class);
   }

   public class07282 parse(StringReader var1) throws CommandSyntaxException {
      String s = var1.readUnquotedString();
      class07282 class07282 = class07282.N(s, null);
      if (class07282 == null) {
         throw L.createWithContext(var1, s);
      } else {
         return class07282;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return var1.getSource() instanceof class07689 ? class07689.y(Arrays.stream(y).map(class07282::y), var2) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return N;
   }
}
