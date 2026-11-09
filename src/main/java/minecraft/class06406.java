package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class class06406 {
   public class06406() {
      super();
   }

   private static int N(class07701 var0, class07282 var1) {
      class02796 class02796 = var0.W();
      class02796.N(var1);
      int i = class02796.L(class02796.v());
      var0.N(() -> class00392.N("commands.defaultgamemode.success", var1.L()), true);
      return i;
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("defaultgamemode").requires(class07686.N(class07686.u)))
            .then(class07686.N("gamemode", class04131.N()).executes(var0x -> N((class07701)var0x.getSource(), class04131.N(var0x, "gamemode"))))
      );
   }
}
