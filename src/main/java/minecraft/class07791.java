package minecraft;

import com.mojang.brigadier.context.CommandContext;
import java.util.Arrays;
import java.util.Collection;

public class class07791 extends class08520<class07709> {
   private static final Collection<String> N = Arrays.asList("0", "0b", "0l", "0.0", "\"foo\"", "{foo=bar}", "[0]");
   private static final class08530<class07709> y = class08876.N(class07713.N);

   private class07791() {
      super(y);
   }

   public static class07791 N() {
      return new class07791();
   }

   public static <S> class07709 N(CommandContext<S> var0, String var1) {
      return (class07709)var0.getArgument(var1, class07709.class);
   }

   public Collection<String> getExamples() {
      return N;
   }
}
