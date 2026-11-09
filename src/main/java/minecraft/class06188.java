package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class class06188 {
   public class06188() {
      super();
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("stop").requires(class07686.N(class07686.R))).executes(var0x -> {
         ((class07701)var0x.getSource()).N(() -> class00392.L("commands.stop.stopping"), true);
         ((class07701)var0x.getSource()).W().y(false);
         return 1;
      }));
   }
}
