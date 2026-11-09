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

public class class00887 implements ArgumentType<class00874> {
   private static final Collection<String> y = Arrays.asList("0 0", "~ ~", "0.1 -0.5", "~1 ~-2");
   public static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("argument.pos2d.incomplete"));
   private final boolean L;

   public class00887(boolean var1) {
      super();
      this.L = var1;
   }

   public class00874 parse(StringReader var1) throws CommandSyntaxException {
      int i = var1.getCursor();
      if (!var1.canRead()) {
         throw N.createWithContext(var1);
      } else {
         class00883 class00883x = class00883.N(var1, this.L);
         if (var1.canRead() && var1.peek() == ' ') {
            var1.skip();
            class00883 class00883x = class00883.N(var1, this.L);
            return new class00863(class00883x, new class00883(true, 0.0), class00883x);
         } else {
            var1.setCursor(i);
            throw N.createWithContext(var1);
         }
      }
   }

   public static class00887 N() {
      return new class00887(true);
   }

   public static class00887 N(boolean var0) {
      return new class00887(var0);
   }

   public static class07109 N(CommandContext<class07701> var0, String var1) {
      class06889 class06889 = ((class00874)var0.getArgument(var1, class00874.class)).N((class07701)var0.getSource());
      return new class07109((float)class06889.M, (float)class06889.Z);
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

         return class07689.y(s, collection, var2, class07686.N_80(this::parse));
      }
   }

   public Collection<String> getExamples() {
      return y;
   }
}
