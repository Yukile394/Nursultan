package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.CompletableFuture;

public class class00905 implements ArgumentType<class00874> {
   private static final Collection<String> y = Arrays.asList("0 0", "~ ~", "~1 ~-2", "^ ^", "^-1 ^0");
   public static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("argument.pos2d.incomplete"));

   public class00905() {
      super();
   }

   public static class00893 N(CommandContext<class07701> var0, String var1) {
      class07209 class07209 = ((class00874)var0.getArgument(var1, class00874.class)).L((class07701)var0.getSource());
      return new class00893(class07209.method_10263(), class07209.method_10260());
   }

   public static class00905 N() {
      return new class00905();
   }

   public class00874 parse(StringReader var1) throws CommandSyntaxException {
      int i = var1.getCursor();
      if (!var1.canRead()) {
         throw N.createWithContext(var1);
      } else {
         class00883 class00883x = class00883.N(var1);
         if (var1.canRead() && var1.peek() == ' ') {
            var1.skip();
            class00883 class00883x = class00883.N(var1);
            return new class00863(class00883x, new class00883(true, 0.0), class00883x);
         } else {
            var1.setCursor(i);
            throw N.createWithContext(var1);
         }
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      if (!(var1.getSource() instanceof class07689)) {
         return Suggestions.empty();
      } else {
         String s = var2.getRemaining();
         Collection<class07665> collection;
         if (!s.isEmpty() && s.charAt(0) == '^') {
            collection = Collections.singleton(class07665.N);
         } else {
            collection = ((class07689)var1.getSource()).Y();
         }

         return class07689.y(s, collection, var2, class07686.N_80(this::parse));
      }
   }

   public Collection<String> getExamples() {
      return y;
   }
}
