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

public class class07787 implements ArgumentType<Integer> {
   private static final Collection<String> N = Arrays.asList("container.5", "weapon");
   private static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(var0 -> class00392.y("slot.unknown", var0));
   private static final DynamicCommandExceptionType L = new DynamicCommandExceptionType(var0 -> class00392.y("slot.only_single_allowed", var0));

   public class07787() {
      super();
   }

   public static int N(CommandContext<class07701> var0, String var1) {
      return (Integer)var0.getArgument(var1, Integer.class);
   }

   public Integer parse(StringReader var1) throws CommandSyntaxException {
      String s = class01780.N(var1, var0 -> var0 != ' ');
      class02466 class02466 = class02488.N(s);
      if (class02466 == null) {
         throw y.createWithContext(var1, s);
      } else if (class02466.y() != 1) {
         throw L.createWithContext(var1, s);
      } else {
         return class02466.N().getInt(0);
      }
   }

   public static class07787 N() {
      return new class07787();
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return class07689.y(class02488.y(), var2);
   }

   public Collection<String> getExamples() {
      return N;
   }
}
