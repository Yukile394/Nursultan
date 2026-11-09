package minecraft;

import com.google.gson.JsonPrimitive;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class class03940<T extends Enum<T> & class05033> implements ArgumentType<T> {
   private static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(var0 -> class00392.y("argument.enum.invalid", var0));
   private final Codec<T> y;
   private final Supplier<T[]> L;

   protected class03940(Codec<T> var1, Supplier<T[]> var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   public T parse(StringReader var1) throws CommandSyntaxException {
      String s = var1.readUnquotedString();
      return (T)this.y.parse(JsonOps.INSTANCE, new JsonPrimitive(s)).result().orElseThrow(() -> N.createWithContext(var1, s));
   }

   protected String N(String var1) {
      return var1;
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return class07689.y(
         Arrays.<Enum>stream((Enum[])this.L.get()).map(var0 -> ((class05033)var0).method_15434()).map(this::N).collect(Collectors.toList()), var2
      );
   }

   public Collection<String> getExamples() {
      return Arrays.<Enum>stream((Enum[])this.L.get()).map(var0 -> ((class05033)var0).method_15434()).map(this::N).limit(2L).collect(Collectors.toList());
   }
}
