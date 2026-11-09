package minecraft;

import Nursultan.class10784;
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

public class class07659 implements ArgumentType<class07675> {
   private static final Collection<String> y = Arrays.asList("Player", "0123", "dd12be42-52a9-4a91-a8a1-11c01849e498", "@e");
   public static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("argument.player.unknown"));

   public class07659() {
      super();
   }

   public static Collection<class08774> N(CommandContext<class07701> var0, String var1) throws CommandSyntaxException {
      return ((class07675)var0.getArgument(var1, class07675.class)).getNames((class07701)var0.getSource());
   }

   public static class07659 N() {
      return new class07659();
   }

   public <S> class07675 parse(StringReader var1, S var2) throws CommandSyntaxException {
      return N(var1, class06790.N(var2));
   }

   public class07675 parse(StringReader var1) throws CommandSyntaxException {
      return N(var1, true);
   }

   private static class07675 N(StringReader var0, boolean var1) throws CommandSyntaxException {
      if (var0.canRead() && var0.peek() == '@') {
         class06790 class06790 = new class06790(var0, var1);
         class06794 class06794 = class06790.v();
         if (class06794.y()) {
            throw class07680.L.createWithContext(var0);
         } else {
            return new class10784(class06794);
         }
      } else {
         int i = var0.getCursor();

         while (var0.canRead() && var0.peek() != ' ') {
            var0.skip();
         }

         String s = var0.getString().substring(i, var0.getCursor());
         return var1x -> Collections.singleton(var1x.W().Nf().R().N(s).orElseThrow(N::create));
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      if (var1.getSource() instanceof class07689 class07689) {
         StringReader stringreader = new StringReader(var2.getInput());
         stringreader.setCursor(var2.getStart());
         class06790 class06790 = new class06790(stringreader, class07689.N().hasPermission(class08162.i));

         try {
            class06790.v();
         } catch (CommandSyntaxException commandsyntaxexception) {
         }

         return class06790.N(var2, var1x -> class07689.y(class07689.b(), var1x));
      } else {
         return Suggestions.empty();
      }
   }

   public Collection<String> getExamples() {
      return y;
   }
}
