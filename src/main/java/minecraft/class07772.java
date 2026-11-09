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

public class class07772 implements ArgumentType<class07126> {
   private static final Collection<String> L = Arrays.asList("foo", "foo:bar", "particle{foo:bar}");
   public static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(var0 -> class00392.y("particle.notFound", var0));
   public static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(var0 -> class00392.y("particle.invalidOptions", var0));
   private final class01929 u;
   private static final class07755<?> i = class07755.N(class07713.N);

   public class07772(class04348 var1) {
      super();
      this.u = var1;
   }

   public static class07772 N(class04348 var0) {
      return new class07772(var0);
   }

   private static <T extends class07126, O> T N(class07755<O> var0, StringReader var1, class07103<T> var2, class01929 var3) throws CommandSyntaxException {
      class03519 class03519 = var3.N(var0.N());
      Object object;
      if (var1.canRead() && var1.peek() == '{') {
         object = var0.y(var1);
      } else {
         object = class03519.emptyMap();
      }

      return (T)var2.method_29138().codec().parse(class03519, object).getOrThrow(y::create);
   }

   public static class07126 N(CommandContext<class07701> var0, String var1) {
      return (class07126)var0.getArgument(var1, class07126.class);
   }

   public class07126 parse(StringReader var1) throws CommandSyntaxException {
      return N(var1, this.u);
   }

   private static class07103<?> N(StringReader var0, class01905<class07103<?>> var1) throws CommandSyntaxException {
      class01894 class01894 = class01894.N(var0);
      class05946 class05946 = class05946.N(class04227.NM, class01894);
      return (class07103<?>)((class03529)var1.N(class05946).orElseThrow(() -> N.createWithContext(var0, class01894))).N();
   }

   public static class07126 N(StringReader var0, class01929 var1) throws CommandSyntaxException {
      class07103<?> class07103 = N(var0, var1.y(class04227.NM));
      return N(i, var0, (class07103<class07126>)class07103, var1);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return class07689.N(this.u.y(class04227.NM).n().map(class05946::N), var2);
   }

   public Collection<String> getExamples() {
      return L;
   }
}
