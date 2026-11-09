package minecraft;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class class08668 {
   public static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("argument.waypoint.invalid"));

   public class08668() {
      super();
   }

   public static class00042 N(CommandContext<class07701> var0, String var1) throws CommandSyntaxException {
      class07049 class07049 = ((class06794)var0.getArgument(var1, class06794.class)).N((class07701)var0.getSource());
      if (class07049 instanceof class00042) {
         return (class00042)class07049;
      } else {
         throw N.create();
      }
   }
}
