package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class class02494 implements ArgumentType<class02466> {
   private static final Collection<String> N = List.of("container.*", "container.5", "weapon");
   private static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(var0 -> class00392.y("slot.unknown", var0));

   public class02494() {
      super();
   }

   public static class02466 N(CommandContext<class07701> var0, String var1) {
      return (class02466)var0.getArgument(var1, class02466.class);
   }

   public class02466 parse(StringReader var1) throws CommandSyntaxException {
      String s = class01780.N(var1, var0 -> var0 != ' ');
      class02466 class02466 = class02488.N(s);
      if (class02466 == null) {
         throw y.createWithContext(var1, s);
      } else {
         return class02466;
      }
   }

   public static class02494 N() {
      return new class02494();
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return class07689.y(class02488.N(), var2);
   }

   public Collection<String> getExamples() {
      return N;
   }
}
