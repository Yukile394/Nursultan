package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class class07667 implements ArgumentType<class07001> {
   private static final Collection<String> N = Arrays.asList("{}", "{foo=bar}");

   private class07667() {
      super();
   }

   public class07001 parse(StringReader var1) throws CommandSyntaxException {
      return class07755.L(var1);
   }

   public static class07667 N() {
      return new class07667();
   }

   public static <S> class07001 N(CommandContext<S> var0, String var1) {
      return (class07001)var0.getArgument(var1, class07001.class);
   }

   public Collection<String> getExamples() {
      return N;
   }
}
