package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class class00897 implements ArgumentType<class00874> {
   private static final Collection<String> y = Arrays.asList("0 0", "~ ~", "~-5 ~5");
   public static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("argument.rotation.incomplete"));

   public class00897() {
      super();
   }

   public class00874 parse(StringReader var1) throws CommandSyntaxException {
      int i = var1.getCursor();
      if (!var1.canRead()) {
         throw N.createWithContext(var1);
      } else {
         class00883 class00883x = class00883.N(var1, false);
         if (var1.canRead() && var1.peek() == ' ') {
            var1.skip();
            class00883 class00883x = class00883.N(var1, false);
            return new class00863(class00883x, class00883x, new class00883(true, 0.0));
         } else {
            var1.setCursor(i);
            throw N.createWithContext(var1);
         }
      }
   }

   public static class00897 N() {
      return new class00897();
   }

   public static class00874 N(CommandContext<class07701> var0, String var1) {
      return (class00874)var0.getArgument(var1, class00874.class);
   }

   public Collection<String> getExamples() {
      return y;
   }
}
