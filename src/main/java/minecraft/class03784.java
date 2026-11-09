package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class class03784<T> implements ArgumentType<class03529<T>> {
   private static final Collection<String> u = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType(var0 -> class00392.y("entity.not_summonable", var0));
   public static final Dynamic2CommandExceptionType N = new Dynamic2CommandExceptionType(
      (var0, var1) -> class00392.y("argument.resource.not_found", var0, var1)
   );
   public static final Dynamic3CommandExceptionType y = new Dynamic3CommandExceptionType(
      (var0, var1, var2) -> class00392.y("argument.resource.invalid_type", var0, var1, var2)
   );
   public final class05946<? extends class00751<T>> L;
   private final class01905<T> R;

   public static class03529<class04748> L(CommandContext<class07701> var0, String var1) throws CommandSyntaxException {
      return N(var0, var1, class04227.yj);
   }

   public static class03529<class07304> M(CommandContext<class07701> var0, String var1) throws CommandSyntaxException {
      return N(var0, var1, class04227.yR);
   }

   public class03784(class04348 var1, class05946<? extends class00751<T>> var2) {
      super();
      this.L = var2;
      this.R = var1.y(var2);
   }

   public static class03529<class07078<?>> i(CommandContext<class07701> var0, String var1) throws CommandSyntaxException {
      class03529<class07078<?>> class03529 = N(var0, var1, class04227.I);
      if (!class03529.N().y()) {
         throw i.create(class03529.B().N().toString());
      } else {
         return class03529;
      }
   }

   public static class03529<class07078<?>> u(CommandContext<class07701> var0, String var1) throws CommandSyntaxException {
      return N(var0, var1, class04227.I);
   }

   public static class03529<class03238<?, ?>> y(CommandContext<class07701> var0, String var1) throws CommandSyntaxException {
      return N(var0, var1, class04227.Nh);
   }

   public static <T> class03529<T> N(CommandContext<class07701> var0, String var1, class05946<class00751<T>> var2) throws CommandSyntaxException {
      class03529 class03529 = (class03529)var0.getArgument(var1, class03529.class);
      class05946 class05946 = class03529.B();
      if (class05946.L(var2)) {
         return class03529;
      } else {
         throw y.create(class05946.N(), class05946.y(), var2.N());
      }
   }

   public class03529<T> parse(StringReader var1) throws CommandSyntaxException {
      class01894 class01894 = class01894.N(var1);
      class05946 class05946 = class05946.N(this.L, class01894);
      return this.R.N(class05946).orElseThrow(() -> N.createWithContext(var1, class01894, this.L.N()));
   }

   public static class03529<class07468> N(CommandContext<class07701> var0, String var1) throws CommandSyntaxException {
      return N(var0, var1, class04227.L);
   }

   public static <T> class03784<T> N(class04348 var0, class05946<? extends class00751<T>> var1) {
      return new class03784<>(var0, var1);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return class07689.N(var1, var2, this.L, class07666.field_37263);
   }

   public Collection<String> getExamples() {
      return u;
   }

   public static class03529<class07084> R(CommandContext<class07701> var0, String var1) throws CommandSyntaxException {
      return N(var0, var1, class04227.Ni);
   }
}
