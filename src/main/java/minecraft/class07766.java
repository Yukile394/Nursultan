package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class class07766 implements class07788<class00816> {
   private static final Collection<String> N = Arrays.asList("0..5.2", "0", "-5.4", "-100.76..", "..100");

   public class07766() {
      super();
   }

   public class00816 parse(StringReader var1) throws CommandSyntaxException {
      return class00816.N(var1);
   }

   public static class00816 N(CommandContext<class07701> var0, String var1) {
      return (class00816)var0.getArgument(var1, class00816.class);
   }

   public Collection<String> getExamples() {
      return N;
   }
}
