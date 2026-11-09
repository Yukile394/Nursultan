package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class class03789<T> implements ArgumentType<class03782<T>> {
   private static final Collection<String> y = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   private static final Dynamic2CommandExceptionType L = new Dynamic2CommandExceptionType(
      (var0, var1) -> class00392.y("argument.resource_tag.not_found", var0, var1)
   );
   private static final Dynamic3CommandExceptionType u = new Dynamic3CommandExceptionType(
      (var0, var1, var2) -> class00392.y("argument.resource_tag.invalid_type", var0, var1, var2)
   );
   private final class01905<T> i;
   public final class05946<? extends class00751<T>> N;

   public class03789(class04348 var1, class05946<? extends class00751<T>> var2) {
      super();
      this.N = var2;
      this.i = var1.y(var2);
   }

   public class03782<T> parse(StringReader var1) throws CommandSyntaxException {
      if (var1.canRead() && var1.peek() == '#') {
         int ix = var1.getCursor();

         try {
            var1.skip();
            class01894 class01894 = class01894.N(var1);
            class03530 class03530 = class03530.N(this.N, class01894);
            class03552 class03552 = this.i.N(class03530).orElseThrow(() -> L.createWithContext(var1, class01894, this.N.N()));
            return new class03765<>(class03552);
         } catch (CommandSyntaxException commandsyntaxexception) {
            var1.setCursor(ix);
            throw commandsyntaxexception;
         }
      } else {
         class01894 class01894x = class01894.N(var1);
         class05946 class05946 = class05946.N(this.N, class01894x);
         class03529 class03529 = this.i.N(class05946).orElseThrow(() -> class03784.N.createWithContext(var1, class01894x, this.N.N()));
         return new class03775<>(class03529);
      }
   }

   public static <T> class03789<T> N(class04348 var0, class05946<? extends class00751<T>> var1) {
      return new class03789<>(var0, var1);
   }

   public static <T> class03782<T> N(CommandContext<class07701> var0, String var1, class05946<class00751<T>> var2) throws CommandSyntaxException {
      class03782 class03782 = (class03782)var0.getArgument(var1, class03782.class);
      return class03782.<T>N(var2).orElseThrow(() -> (CommandSyntaxException)class03782.N().map(var1xx -> {
         class05946 class05946 = var1xx.B();
         return class03784.y.create(class05946.N(), class05946.y(), var2.N());
      }, var1xx -> {
         class03530 class03530 = var1xx.B();
         return u.create(class03530.y(), class03530.N(), var2.N());
      }));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return class07689.N(var1, var2, this.N, class07666.field_37264);
   }

   public Collection<String> getExamples() {
      return y;
   }
}
