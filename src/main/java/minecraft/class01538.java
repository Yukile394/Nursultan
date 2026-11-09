package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;

public class class01538 {
   private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("commands.pardon.failed"));

   public class01538() {
      super();
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("pardon").requires(class07686.N(class07686.i)))
            .then(
               class07686.N("targets", class07659.N())
                  .suggests((var0x, var1) -> class07689.N(((class07701)var0x.getSource()).W().Nm().M().y(), var1))
                  .executes(var0x -> N((class07701)var0x.getSource(), class07659.N(var0x, "targets")))
            )
      );
   }

   private static int N(class07701 var0, Collection<class08774> var1) throws CommandSyntaxException {
      class05170 class05170 = var0.W().Nm().M();
      int i = 0;

      for (class08774 class08774 : var1) {
         if (class05170.N(class08774)) {
            class05170.L(class08774);
            i++;
            var0.N(() -> class00392.N("commands.pardon.success", class00392.y(class08774.y())), true);
         }
      }

      if (i == 0) {
         throw N.create();
      } else {
         return i;
      }
   }
}
