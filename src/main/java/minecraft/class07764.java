package minecraft;

import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class class07764 implements ArgumentType<class06675> {
   private static final Collection<String> y = Arrays.asList("foo", "foo.bar.baz", "minecraft:foo");
   public static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(var0 -> class00392.y("argument.criteria.invalid", var0));

   private class07764() {
      super();
   }

   public <T> String N(class04922<T> var1, Object var2) {
      return class04907.N(var1, var2);
   }

   public static class06675 N(CommandContext<class07701> var0, String var1) {
      return (class06675)var0.getArgument(var1, class06675.class);
   }

   public class06675 parse(StringReader var1) throws CommandSyntaxException {
      int i = var1.getCursor();

      while (var1.canRead() && var1.peek() != ' ') {
         var1.skip();
      }

      String s = var1.getString().substring(i, var1.getCursor());
      return class06675.y(s).orElseThrow(() -> {
         var1.setCursor(i);
         return N.createWithContext(var1, s);
      });
   }

   public static class07764 N() {
      return new class07764();
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      ArrayList arraylist = Lists.newArrayList(class06675.N());

      for (class04922<?> class04922 : class04206.G) {
         for (Object object : class04922.y()) {
            String s = this.N(class04922, object);
            arraylist.add(s);
         }
      }

      return class07689.y(arraylist, var2);
   }

   public Collection<String> getExamples() {
      return y;
   }
}
