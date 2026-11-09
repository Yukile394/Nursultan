package minecraft;

import Nursultan.class09429;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class class01021 implements ArgumentType<class09429> {
   private static final Collection<String> L = Arrays.asList("0", "~", "~-5");
   public static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("argument.angle.incomplete"));
   public static final SimpleCommandExceptionType y = new SimpleCommandExceptionType(class00392.L("argument.angle.invalid"));

   public class01021() {
      super();
   }

   public class09429 parse(StringReader var1) throws CommandSyntaxException {
      if (!var1.canRead()) {
         throw N.createWithContext(var1);
      } else {
         boolean flag = class00883.y(var1);
         float f = var1.canRead() && var1.peek() != ' ' ? var1.readFloat() : 0.0F;
         if (!Float.isNaN(f) && !Float.isInfinite(f)) {
            return new class09429(f, flag);
         } else {
            throw y.createWithContext(var1);
         }
      }
   }

   public static class01021 N() {
      return new class01021();
   }

   public static float N(CommandContext<class07701> var0, String var1) {
      return ((class09429)var0.getArgument(var1, class09429.class)).N((class07701)var0.getSource());
   }

   public Collection<String> getExamples() {
      return L;
   }
}
