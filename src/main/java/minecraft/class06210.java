package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class class06210 {
   public class06210() {
      super();
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("say").requires(class07686.N(class07686.u)))
            .then(class07686.N("message", class07690.N()).executes(var0x -> {
               class07690.N(var0x, "message", var1 -> {
                  class07701 class07701 = (class07701)var0x.getSource();
                  class07701.W().Nm().N(var1, class07701, class00629.N(class00629.R, class07701));
               });
               return 1;
            }))
      );
   }
}
