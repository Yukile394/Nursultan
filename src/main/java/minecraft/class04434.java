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

public class class04434<T> implements ArgumentType<class04428<T>> {
   private static final Collection<String> y = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   public final class05946<? extends class00751<T>> N;

   public class04434(class05946<? extends class00751<T>> var1) {
      super();
      this.N = var1;
   }

   public static <T> class04428<T> N(CommandContext<class07701> var0, String var1, class05946<class00751<T>> var2, DynamicCommandExceptionType var3) throws CommandSyntaxException {
      class04428 class04428 = (class04428)var0.getArgument(var1, class04428.class);
      return class04428.<T>N(var2).orElseThrow(() -> var3.create(class04428));
   }

   public static <T> class04434<T> N(class05946<? extends class00751<T>> var0) {
      return new class04434<>(var0);
   }

   public class04428<T> parse(StringReader var1) throws CommandSyntaxException {
      if (var1.canRead() && var1.peek() == '#') {
         int i = var1.getCursor();

         try {
            var1.skip();
            class01894 class01894 = class01894.N(var1);
            return new class04427<>(class03530.N(this.N, class01894));
         } catch (CommandSyntaxException commandsyntaxexception) {
            var1.setCursor(i);
            throw commandsyntaxexception;
         }
      } else {
         class01894 class01894x = class01894.N(var1);
         return new class04400<>(class05946.N(this.N, class01894x));
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return class07689.N(var1, var2, this.N, class07666.field_37264);
   }

   public Collection<String> getExamples() {
      return y;
   }
}
