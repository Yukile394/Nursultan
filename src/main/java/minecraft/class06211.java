package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class class06211 {
   public class06211() {
      super();
   }

   private static int N(class07701 var0, int var1) {
      var0.W().R(var1);
      if (var1 > 0) {
         var0.N(() -> class00392.N("commands.setidletimeout.success", var1), true);
      } else {
         var0.N(() -> class00392.L("commands.setidletimeout.success.disabled"), true);
      }

      return var1;
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("setidletimeout").requires(class07686.N(class07686.i)))
            .then(
               class07686.N("minutes", IntegerArgumentType.integer(0))
                  .executes(var0x -> N((class07701)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "minutes")))
            )
      );
   }
}
