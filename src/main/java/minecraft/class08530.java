package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public interface class08530<T> {
   default <T, O> class08530<T> N(DynamicOps<O> var1, class08530<O> var2, Codec<T> var3, DynamicCommandExceptionType var4) {
      return new class08502<>(this, var2, var3, var1, var4);
   }

   default <S> class08530<S> N(Function<T, S> var1) {
      return new class08532<>(this, var1);
   }

   CompletableFuture<Suggestions> N(SuggestionsBuilder var1);

   T N(StringReader var1) throws CommandSyntaxException;
}
