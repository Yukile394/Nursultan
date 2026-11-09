package minecraft;

import Nursultan.class09648;
import Nursultan.class09649;
import Nursultan.class09650;
import Nursultan.class09655;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import org.jspecify.annotations.Nullable;

public class class02198<T> implements ArgumentType<class03556<T>> {
   private static final Collection<String> u = List.of("foo", "foo:bar", "012", "{}", "true");
   public static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(var0 -> class00392.y("argument.resource_or_id.failed_to_parse", var0));
   public static final Dynamic2CommandExceptionType y = new Dynamic2CommandExceptionType(
      (var0, var1) -> class00392.y("argument.resource_or_id.no_such_element", var0, var1)
   );
   public static final DynamicOps<class07709> L = class07713.N;
   private final class01929 i;
   private final Optional<? extends class01921<T>> R;
   private final Codec<T> M;
   private final class02169<class02172<T, class07709>> B;
   private final class05946<? extends class00751<T>> Z;

   public static class09648 L(class04348 var0) {
      return new class09648(var0);
   }

   public static class03556<class05957> L(CommandContext<class07701> var0, String var1) {
      return i(var0, var1);
   }

   protected class02198(class04348 var1, class05946<? extends class00751<T>> var2, Codec<T> var3) {
      super();
      this.i = var1;
      this.R = var1.method_46759(var2);
      this.Z = var2;
      this.M = var3;
      this.B = N(var2, L);
   }

   private static <T> class03556<T> i(CommandContext<class07701> var0, String var1) {
      return (class03556<T>)var0.getArgument(var1, class03556.class);
   }

   public static class03556<class09037> u(CommandContext<class07701> var0, String var1) {
      return i(var0, var1);
   }

   public static class09650 u(class04348 var0) {
      return new class09650(var0);
   }

   public static class09655 y(class04348 var0) {
      return new class09655(var0);
   }

   public static class03556<class08122> y(CommandContext<class07701> var0, String var1) {
      return i(var0, var1);
   }

   @Nullable
   private <O> class03556<T> N(StringReader var1, class02169<class02172<T, O>> var2, DynamicOps<O> var3) throws CommandSyntaxException {
      class02172 class02172 = (class02172)var2.N(var1);
      return this.R.isEmpty() ? null : class02172.N(var1, this.i, var3, this.M, (class01921<T>)this.R.get());
   }

   public static class09649 N(class04348 var0) {
      return new class09649(var0);
   }

   @Nullable
   public class03556<T> N(StringReader var1) throws CommandSyntaxException {
      return this.N(var1, this.B, L);
   }

   public static class03556<class05074> N(CommandContext<class07701> var0, String var1) throws CommandSyntaxException {
      return i(var0, var1);
   }

   public static <T, O> class02169<class02172<T, O>> N(class05946<? extends class00751<T>> var0, DynamicOps<O> var1) {
      class02169 class02169 = class08876.N(var1);
      class02344 class02344 = new class02344();
      class02353 class02353xx = class02353.N("result");
      class02353 class02353x = class02353.N("id");
      class02353 class02353xx = class02353.N("value");
      class02344.N(class02353x, class02196.N);
      class02344.N(class02353xx, class02169.y().y());
      class08501 class08501 = class02344.N(class02353xx, class02315.y(class02344.L(class02353x), class02344.L(class02353xx)), var3x -> {
         class01894 class01894 = var3x.N(class02353x);
         if (class01894 != null) {
            return new class02178(class05946.N(var0, class01894));
         } else {
            Object object = var3x.y(class02353);
            return new class02188<>(object);
         }
      });
      return new class02169<>(class02344, class08501);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return class07689.N(var1, var2, this.Z, class07666.field_37263);
   }

   public Collection<String> getExamples() {
      return u;
   }
}
