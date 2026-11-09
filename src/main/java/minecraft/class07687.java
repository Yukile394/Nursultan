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

public class class07687 implements ArgumentType<class07664> {
   private static final Collection<String> N = Arrays.asList("eyes", "feet");
   private static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(var0 -> class00392.y("argument.anchor.invalid", var0));

   public class07687() {
      super();
   }

   public static class07687 N() {
      return new class07687();
   }

   public static class07664 N(CommandContext<class07701> var0, String var1) {
      return (class07664)var0.getArgument(var1, class07664.class);
   }

   public class07664 parse(StringReader var1) throws CommandSyntaxException {
      int i = var1.getCursor();
      String s = var1.readUnquotedString();
      class07664 class07664 = class07664.N(s);
      if (class07664 == null) {
         var1.setCursor(i);
         throw y.createWithContext(var1, s);
      } else {
         return class07664;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return class07689.y(class07664.field_9852.keySet(), var2);
   }

   public Collection<String> getExamples() {
      return N;
   }
}
