package minecraft;

import Nursultan.class10790;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class class07785 implements ArgumentType<class07802> {
   private static final Collection<String> N = Arrays.asList("=", ">", "<");
   private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType(class00392.L("arguments.operation.invalid"));
   private static final SimpleCommandExceptionType L = new SimpleCommandExceptionType(class00392.L("arguments.operation.div0"));

   public class07785() {
      super();
   }

   private static class10790 y(String var0) throws CommandSyntaxException {
      return switch (var0) {
         case "=" -> (var0x, var1) -> var1;
         case "+=" -> Integer::sum;
         case "-=" -> (var0x, var1) -> var0x - var1;
         case "*=" -> (var0x, var1) -> var0x * var1;
         case "/=" -> (var0x, var1) -> {
            if (var1 == 0) {
               throw L.create();
            } else {
               return class04995.y(var0x, var1);
            }
         };
         case "%=" -> (var0x, var1) -> {
            if (var1 == 0) {
               throw L.create();
            } else {
               return class04995.L(var0x, var1);
            }
         };
         case "<" -> Math::min;
         case ">" -> Math::max;
         default -> throw y.create();
      };
   }

   public static class07785 N() {
      return new class07785();
   }

   public class07802 parse(StringReader var1) throws CommandSyntaxException {
      if (!var1.canRead()) {
         throw y.createWithContext(var1);
      } else {
         int i = var1.getCursor();

         while (var1.canRead() && var1.peek() != ' ') {
            var1.skip();
         }

         return N(var1.getString().substring(i, var1.getCursor()));
      }
   }

   private static class07802 N(String var0) throws CommandSyntaxException {
      return (class07802)(var0.equals("><") ? (var0x, var1) -> {
         int i = var0x.N();
         var0x.N(var1.N());
         var1.N(i);
      } : y(var0));
   }

   public static class07802 N(CommandContext<class07701> var0, String var1) {
      return (class07802)var0.getArgument(var1, class07802.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return class07689.N(new String[]{"=", "+=", "-=", "*=", "/=", "%=", "<", ">", "><"}, var2);
   }

   public Collection<String> getExamples() {
      return N;
   }
}
