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

public class class00035 implements ArgumentType<Integer> {
   private static final Collection<String> y = Arrays.asList("F00", "FF0000");
   public static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(var0 -> class00392.y("argument.hexcolor.invalid", var0));

   private class00035() {
      super();
   }

   public static class00035 N() {
      return new class00035();
   }

   public static Integer N(CommandContext<class07701> var0, String var1) {
      return (Integer)var0.getArgument(var1, Integer.class);
   }

   private static int N(int var0) {
      return var0 * 17;
   }

   public Integer parse(StringReader var1) throws CommandSyntaxException {
      String s = var1.readUnquotedString();

      return switch (s.length()) {
         case 3 -> class02566.N(N(Integer.parseInt(s, 0, 1, 16)), N(Integer.parseInt(s, 1, 2, 16)), N(Integer.parseInt(s, 2, 3, 16)));
         case 6 -> class02566.N(Integer.parseInt(s, 0, 2, 16), Integer.parseInt(s, 2, 4, 16), Integer.parseInt(s, 4, 6, 16));
         default -> throw N.createWithContext(var1, s);
      };
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return class07689.y(y, var2);
   }

   public Collection<String> getExamples() {
      return y;
   }
}
