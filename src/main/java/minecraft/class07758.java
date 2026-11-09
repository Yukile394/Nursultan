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

public class class07758 implements ArgumentType<class01890> {
   private static final Collection<String> y = Arrays.asList("sidebar", "foo.bar");
   public static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(var0 -> class00392.y("argument.scoreboardDisplaySlot.invalid", var0));

   private class07758() {
      super();
   }

   public static class01890 N(CommandContext<class07701> var0, String var1) {
      return (class01890)var0.getArgument(var1, class01890.class);
   }

   public static class07758 N() {
      return new class07758();
   }

   public class01890 parse(StringReader var1) throws CommandSyntaxException {
      String s = var1.readUnquotedString();
      class01890 class01890 = class01890.field_45175.N(s);
      if (class01890 == null) {
         throw N.createWithContext(var1, s);
      } else {
         return class01890;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return class07689.y(Arrays.stream(class01890.values()).map(class01890::method_15434), var2);
   }

   public Collection<String> getExamples() {
      return y;
   }
}
