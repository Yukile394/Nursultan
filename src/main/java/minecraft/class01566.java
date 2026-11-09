package minecraft;

import com.google.common.net.InetAddresses;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;

public class class01566 {
   private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("commands.pardonip.invalid"));
   private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType(class00392.L("commands.pardonip.failed"));

   public class01566() {
      super();
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("pardon-ip").requires(class07686.N(class07686.i)))
            .then(
               class07686.N("target", StringArgumentType.word())
                  .suggests((var0x, var1) -> class07689.N(((class07701)var0x.getSource()).W().Nm().B().y(), var1))
                  .executes(var0x -> N((class07701)var0x.getSource(), StringArgumentType.getString(var0x, "target")))
            )
      );
   }

   private static int N(class07701 var0, String var1) throws CommandSyntaxException {
      if (!InetAddresses.isInetAddress(var1)) {
         throw N.create();
      } else {
         class01086 class01086 = var0.W().Nm().B();
         if (!class01086.N(var1)) {
            throw y.create();
         } else {
            class01086.y(var1);
            var0.N(() -> class00392.N("commands.pardonip.success", var1), true);
            return 1;
         }
      }
   }
}
