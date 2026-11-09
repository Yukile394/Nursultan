package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class class07798 implements ArgumentType<Integer> {
   private static final Collection<String> y = Arrays.asList("0d", "0s", "0t", "0");
   private static final SimpleCommandExceptionType L = new SimpleCommandExceptionType(class00392.L("argument.time.invalid_unit"));
   private static final Dynamic2CommandExceptionType u = new Dynamic2CommandExceptionType(
      (var0, var1) -> class00392.y("argument.time.tick_count_too_low", var1, var0)
   );
   private static final Object2IntMap<String> i = new Object2IntOpenHashMap();
   final int N;

   private class07798(int var1) {
      super();
      this.N = var1;
   }

   static {
      i.put("d", 24000);
      i.put("s", 20);
      i.put("t", 1);
      i.put("", 1);
   }

   public static class07798 N(int var0) {
      return new class07798(var0);
   }

   public static class07798 N() {
      return new class07798(0);
   }

   public Integer parse(StringReader var1) throws CommandSyntaxException {
      float f = var1.readFloat();
      String s = var1.readUnquotedString();
      int ix = i.getOrDefault(s, 0);
      if (ix == 0) {
         throw L.createWithContext(var1);
      } else {
         int j = Math.round(f * ix);
         if (j < this.N) {
            throw u.createWithContext(var1, j, this.N);
         } else {
            return j;
         }
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      StringReader stringreader = new StringReader(var2.getRemaining());

      try {
         stringreader.readFloat();
      } catch (CommandSyntaxException commandsyntaxexception) {
         return var2.buildFuture();
      }

      return class07689.y(i.keySet(), var2.createOffset(var2.getStart() + stringreader.getCursor()));
   }

   public Collection<String> getExamples() {
      return y;
   }
}
