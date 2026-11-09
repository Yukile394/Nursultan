package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class class06213 {
   public class06213() {
      super();
   }

   public static void N(CommandDispatcher<class07701> var0, boolean var1) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("seed").requires(class07686.N(var1 ? class07686.u : class07686.y))).executes(var0x -> {
            long i = ((class07701)var0x.getSource()).R().method_8412();
            class05216 class05216 = class00390.N(String.valueOf(i));
            ((class07701)var0x.getSource()).N(() -> class00392.N("commands.seed.success", class05216), false);
            return (int)i;
         })
      );
   }
}
