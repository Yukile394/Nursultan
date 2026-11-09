package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class class07678 implements ArgumentType<class01894> {
   private static final Collection<String> N = Stream.of(class07299.field_25179, class07299.field_25180)
      .map(var0 -> var0.N().toString())
      .collect(Collectors.toList());
   private static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(var0 -> class00392.y("argument.dimension.invalid", var0));

   public class07678() {
      super();
   }

   public static class04782 N(CommandContext<class07701> var0, String var1) throws CommandSyntaxException {
      class01894 class01894 = (class01894)var0.getArgument(var1, class01894.class);
      class05946 class05946 = class05946.N(class04227.yg, class01894);
      class04782 class04782 = ((class07701)var0.getSource()).W().N(class05946);
      if (class04782 == null) {
         throw y.create(class01894);
      } else {
         return class04782;
      }
   }

   public class01894 parse(StringReader var1) throws CommandSyntaxException {
      return class01894.N(var1);
   }

   public static class07678 N() {
      return new class07678();
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return var1.getSource() instanceof class07689 ? class07689.N(((class07689)var1.getSource()).n().stream().map(class05946::N), var2) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return N;
   }
}
