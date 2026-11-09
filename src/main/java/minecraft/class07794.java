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

public class class07794 implements ArgumentType<String> {
   private static final Collection<String> N = Arrays.asList("foo", "*", "012");
   private static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(var0 -> class00392.y("arguments.objective.notFound", var0));
   private static final DynamicCommandExceptionType L = new DynamicCommandExceptionType(var0 -> class00392.y("arguments.objective.readonly", var0));

   public class07794() {
      super();
   }

   public static class00518 y(CommandContext<class07701> var0, String var1) throws CommandSyntaxException {
      class00518 class00518 = N(var0, var1);
      if (class00518.u().L()) {
         throw L.create(class00518.L());
      } else {
         return class00518;
      }
   }

   public static class07794 N() {
      return new class07794();
   }

   public String parse(StringReader var1) throws CommandSyntaxException {
      return var1.readUnquotedString();
   }

   public static class00518 N(CommandContext<class07701> var0, String var1) throws CommandSyntaxException {
      String s = (String)var0.getArgument(var1, String.class);
      class00518 class00518 = ((class07701)var0.getSource()).W().yB().N(s);
      if (class00518 == null) {
         throw y.create(s);
      } else {
         return class00518;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      Object object = var1.getSource();
      if (object instanceof class07701) {
         return class07689.y(((class07701)object).W().yB().y(), var2);
      } else {
         return object instanceof class07689 ? ((class07689)object).N(var1) : Suggestions.empty();
      }
   }

   public Collection<String> getExamples() {
      return N;
   }
}
