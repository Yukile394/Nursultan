package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public record class02169<T>(class02344<StringReader> rules, class08501<StringReader, T> top) implements class08530<T> {
   public class02169(class02344<StringReader> rules, class08501<StringReader, T> top) {
      super();
      rules.N();
      this.rules = rules;
      this.top = top;
   }

   public class08501<StringReader, T> y() {
      return this.top;
   }

   public class02344<StringReader> N() {
      return this.rules;
   }

   public Optional<T> N(class02325<StringReader> var1) {
      return var1.y(this.top);
   }

   @Override
   public T N(StringReader var1) throws CommandSyntaxException {
      class02357 class02357 = new class02357();
      class02162 class02162 = new class02162(class02357, var1);
      Optional optional = this.N(class02162);
      if (optional.isPresent()) {
         return (T)optional.get();
      } else {
         List list = class02357.N();
         List list1 = list.stream().mapMulti((var1x, var2x) -> {
            if (var1x.L() instanceof class08524 class08524) {
               var2x.accept(class08524.create(var1.getString(), var1x.N()));
            } else if (var1x.L() instanceof Exception exceptionx) {
               var2x.accept(exceptionx);
            }
         }).toList();

         for (Exception exception : list1) {
            if (exception instanceof CommandSyntaxException) {
               throw (CommandSyntaxException)exception;
            }
         }

         if (list1.size() == 1 && list1.get(0) instanceof RuntimeException runtimeexception) {
            throw runtimeexception;
         } else {
            throw new IllegalStateException("Failed to parse: " + list.stream().map(class02333::toString).collect(Collectors.joining(", ")));
         }
      }
   }

   @Override
   public CompletableFuture<Suggestions> N(SuggestionsBuilder var1) {
      StringReader stringreader = new StringReader(var1.getInput());
      stringreader.setCursor(var1.getStart());
      class02357 class02357 = new class02357();
      class02162 class02162 = new class02162(class02357, stringreader);
      this.N(class02162);
      List list = class02357.N();
      if (list.isEmpty()) {
         return var1.buildFuture();
      } else {
         SuggestionsBuilder suggestionsbuilder = var1.createOffset(class02357.y());

         for (class02333 class02333 : list) {
            class02350 class02350 = class02333.y();
            if (class02350 instanceof class02170) {
               class07689.N(((class02170)class02350).y(), suggestionsbuilder);
            } else {
               class07689.y(class02333.y().possibleValues(class02162), suggestionsbuilder);
            }
         }

         return suggestionsbuilder.buildFuture();
      }
   }
}
