package minecraft;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.serialization.DynamicOps;
import java.util.Arrays;
import java.util.Collection;
import org.jspecify.annotations.Nullable;

public class class07698 extends class08520<class00392> {
   private static final Collection<String> y = Arrays.asList("\"hello world\"", "'hello world'", "\"\"", "{text:\"hello world\"}", "[\"\"]");
   public static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(var0 -> class00392.y("argument.component.invalid", var0));
   private static final DynamicOps<class07709> L = class07713.N;
   private static final class08530<class07709> u = class08876.N(L);

   private class07698(class01929 var1) {
      super(u.N(var1.N(L), u, class03748.N, N));
   }

   public static class00392 y(CommandContext<class07701> var0, String var1) throws CommandSyntaxException {
      return N(var0, var1, ((class07701)var0.getSource()).M());
   }

   public static class07698 N(class04348 var0) {
      return new class07698(var0);
   }

   public static class00392 N(CommandContext<class07701> var0, String var1) {
      return (class00392)var0.getArgument(var1, class00392.class);
   }

   public static class00392 N(CommandContext<class07701> var0, String var1, @Nullable class07049 var2) throws CommandSyntaxException {
      return class00390.N((class07701)var0.getSource(), N(var0, var1), var2, 0);
   }

   public Collection<String> getExamples() {
      return y;
   }
}
