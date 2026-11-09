package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class class01547 {
   public class01547() {
      super();
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register((LiteralArgumentBuilder)class07686.y("me").then(class07686.N("action", class07690.N()).executes(var0x -> {
         class07690.N(var0x, "action", var1 -> {
            class07701 class07701 = (class07701)var0x.getSource();
            class07701.W().Nm().N(var1, class07701, class00629.N(class00629.U, class07701));
         });
         return 1;
      })));
   }
}
