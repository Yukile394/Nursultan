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

public class class00881 implements ArgumentType<class00874> {
   private static final Collection<String> L = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "0.1 -0.5 .9", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("argument.pos3d.incomplete"));
   public static final SimpleCommandExceptionType y = new SimpleCommandExceptionType(class00392.L("argument.pos.mixed"));
   private final boolean u;

   public class00881(boolean var1) {
      super();
      this.u = var1;
   }

   public static class00874 y(CommandContext<class07701> var0, String var1) {
      return (class00874)var0.getArgument(var1, class00874.class);
   }

   public class00874 parse(StringReader var1) throws CommandSyntaxException {
      return (class00874)(var1.canRead() && var1.peek() == '^' ? class00872.N(var1) : class00863.N(var1, this.u));
   }

   public static class00881 N() {
      return new class00881(true);
   }

   public static class00881 N(boolean var0) {
      return new class00881(var0);
   }

   public static class06889 N(CommandContext<class07701> var0, String var1) {
      return ((class00874)var0.getArgument(var1, class00874.class)).N((class07701)var0.getSource());
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
            collection = ((class07689)var1.getSource()).Q();
         }

         return class07689.N(s, collection, var2, class07686.N_80(this::parse));
      }
   }

   public Collection<String> getExamples() {
      return L;
   }
}
