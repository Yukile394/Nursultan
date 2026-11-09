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

public class class00894 implements ArgumentType<class00874> {
   private static final Collection<String> u = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("argument.pos.unloaded"));
   public static final SimpleCommandExceptionType y = new SimpleCommandExceptionType(class00392.L("argument.pos.outofworld"));
   public static final SimpleCommandExceptionType L = new SimpleCommandExceptionType(class00392.L("argument.pos.outofbounds"));

   public static class07209 L(CommandContext<class07701> var0, String var1) throws CommandSyntaxException {
      class07209 class07209 = y(var0, var1);
      if (!class07299.method_25953(class07209)) {
         throw L.create();
      } else {
         return class07209;
      }
   }

   public class00894() {
      super();
   }

   public static class07209 y(CommandContext<class07701> var0, String var1) {
      return ((class00874)var0.getArgument(var1, class00874.class)).L((class07701)var0.getSource());
   }

   public static class07209 N(CommandContext<class07701> var0, String var1) throws CommandSyntaxException {
      class04782 class04782 = ((class07701)var0.getSource()).R();
      return N(var0, class04782, var1);
   }

   public class00874 parse(StringReader var1) throws CommandSyntaxException {
      return (class00874)(var1.canRead() && var1.peek() == '^' ? class00872.N(var1) : class00863.N(var1));
   }

   public static class07209 N(CommandContext<class07701> var0, class04782 var1, String var2) throws CommandSyntaxException {
      class07209 class07209 = y(var0, var2);
      if (!var1.E(class07209)) {
         throw N.create();
      } else if (!var1.method_24794(class07209)) {
         throw y.create();
      } else {
         return class07209;
      }
   }

   public static class00894 N() {
      return new class00894();
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

         return class07689.N(s, collection, var2, class07686.N_80(this::parse));
      }
   }

   public Collection<String> getExamples() {
      return u;
   }
}
