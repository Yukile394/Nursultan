package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class class07767 implements class07788<class00836> {
   private static final Collection<String> N = Arrays.asList("0..5", "0", "-5", "-100..", "..100");

   public class07767() {
      super();
   }

   public class00836 parse(StringReader var1) throws CommandSyntaxException {
      return class00836.N(var1);
   }

   public static class00836 N(CommandContext<class07701> var0, String var1) {
      return (class00836)var0.getArgument(var1, class00836.class);
   }

   public Collection<String> getExamples() {
      return N;
   }
}
