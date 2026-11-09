package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class class07778 implements ArgumentType<class01894> {
   private static final Collection<String> N = Arrays.asList("foo", "foo:bar", "012");

   public class07778() {
      super();
   }

   public class01894 parse(StringReader var1) throws CommandSyntaxException {
      return class01894.N(var1);
   }

   public static class07778 N() {
      return new class07778();
   }

   public static class01894 N(CommandContext<class07701> var0, String var1) {
      return (class01894)var0.getArgument(var1, class01894.class);
   }

   public Collection<String> getExamples() {
      return N;
   }
}
