package minecraft;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.serialization.DynamicOps;
import java.util.Collection;
import java.util.List;

public class class01786 extends class08520<class00405> {
   private static final Collection<String> y = List.of("{bold: true}", "{color: 'red'}", "{}");
   public static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(var0 -> class00392.y("argument.style.invalid", var0));
   private static final DynamicOps<class07709> L = class07713.N;
   private static final class08530<class07709> u = class08876.N(L);

   private class01786(class01929 var1) {
      super(u.N(var1.N(L), u, class00411.y, N));
   }

   public static class00405 N(CommandContext<class07701> var0, String var1) {
      return (class00405)var0.getArgument(var1, class00405.class);
   }

   public static class01786 N(class04348 var0) {
      return new class01786(var0);
   }

   public Collection<String> getExamples() {
      return y;
   }
}
