package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;

public class class01537 {
   private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("commands.op.failed"));

   public class01537() {
      super();
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("op").requires(class07686.N(class07686.i)))
            .then(class07686.N("targets", class07659.N()).suggests((var0x, var1) -> {
               class01062 class01062 = ((class07701)var0x.getSource()).W().Nm();
               return class07689.y(
                  class01062.v().stream().filter(var1x -> !class01062.R(var1x.method_72498())).map(var0xx -> var0xx.method_7334().name()), var1
               );
            }).executes(var0x -> N((class07701)var0x.getSource(), class07659.N(var0x, "targets"))))
      );
   }

   private static int N(class07701 var0, Collection<class08774> var1) throws CommandSyntaxException {
      class01062 class01062 = var0.W().Nm();
      int i = 0;

      for (class08774 class08774 : var1) {
         if (!class01062.R(class08774)) {
            class01062.u(class08774);
            i++;
            var0.N(() -> class00392.N("commands.op.success", class08774.y()), true);
         }
      }

      if (i == 0) {
         throw N.create();
      } else {
         return i;
      }
   }
}
