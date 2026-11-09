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

public class class04403<T> implements ArgumentType<class05946<T>> {
   private static final Collection<String> y = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType L = new DynamicCommandExceptionType(var0 -> class00392.y("commands.place.feature.invalid", var0));
   private static final DynamicCommandExceptionType u = new DynamicCommandExceptionType(var0 -> class00392.y("commands.place.structure.invalid", var0));
   private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType(var0 -> class00392.y("commands.place.jigsaw.invalid", var0));
   private static final DynamicCommandExceptionType R = new DynamicCommandExceptionType(var0 -> class00392.y("recipe.notFound", var0));
   private static final DynamicCommandExceptionType M = new DynamicCommandExceptionType(var0 -> class00392.y("advancement.advancementNotFound", var0));
   public final class05946<? extends class00751<T>> N;

   public static class03529<class05281> L(CommandContext<class07701> var0, String var1) throws CommandSyntaxException {
      return y(var0, var1, class04227.yv, i);
   }

   public class04403(class05946<? extends class00751<T>> var1) {
      super();
      this.N = var1;
   }

   public static class03711 i(CommandContext<class07701> var0, String var1) throws CommandSyntaxException {
      class05946<class07151> class05946 = N(var0, var1, class04227.yK, M);
      class03711 class03711 = ((class07701)var0.getSource()).W().Nh().N(class05946.N());
      if (class03711 == null) {
         throw M.create(class05946.N());
      } else {
         return class03711;
      }
   }

   public static class03729<?> u(CommandContext<class07701> var0, String var1) throws CommandSyntaxException {
      class06482 class06482 = ((class07701)var0.getSource()).W().yM();
      class05946<class06521<?>> class05946 = N(var0, var1, class04227.yV, R);
      return class06482.y(class05946).orElseThrow(() -> R.create(class05946.N()));
   }

   private static <T> class03529<T> y(CommandContext<class07701> var0, String var1, class05946<class00751<T>> var2, DynamicCommandExceptionType var3) throws CommandSyntaxException {
      class05946 class05946 = N(var0, var1, var2, var3);
      return N(var0, var2).N(class05946).orElseThrow(() -> var3.create(class05946.N()));
   }

   public static class03529<class04748> y(CommandContext<class07701> var0, String var1) throws CommandSyntaxException {
      return y(var0, var1, class04227.yj, u);
   }

   public static class03529<class03238<?, ?>> N(CommandContext<class07701> var0, String var1) throws CommandSyntaxException {
      return y(var0, var1, class04227.Nh, L);
   }

   public static <T> class04403<T> N(class05946<? extends class00751<T>> var0) {
      return new class04403<>(var0);
   }

   private static <T> class00751<T> N(CommandContext<class07701> var0, class05946<? extends class00751<T>> var1) {
      return ((class07701)var0.getSource()).W().yt().L(var1);
   }

   public class05946<T> parse(StringReader var1) throws CommandSyntaxException {
      class01894 class01894 = class01894.N(var1);
      return class05946.N(this.N, class01894);
   }

   public static <T> class05946<T> N(CommandContext<class07701> var0, String var1, class05946<class00751<T>> var2, DynamicCommandExceptionType var3) throws CommandSyntaxException {
      class05946 class05946 = (class05946)var0.getArgument(var1, class05946.class);
      return class05946.<T>u(var2).orElseThrow(() -> var3.create(class05946.N()));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return class07689.N(var1, var2, this.N, class07666.field_37263);
   }

   public Collection<String> getExamples() {
      return y;
   }
}
