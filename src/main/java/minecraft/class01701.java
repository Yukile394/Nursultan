package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class class01701 {
   public class01701() {
      super();
   }

   private static int N(class07701 var0, class07428 var1, class07209 var2) {
      class00803.N(var1, var0.R(), var2);
      return 1;
   }

   public static void N(CommandDispatcher<class07701> var0) {
      LiteralArgumentBuilder<class07701> literalargumentbuilder = (LiteralArgumentBuilder<class07701>)class07686.y("debugmobspawning")
         .requires(class07686.N(class07686.u));

      for (class07428 class07428 : class07428.values()) {
         literalargumentbuilder.then(
            class07686.y(class07428.N())
               .then(class07686.N("at", class00894.N()).executes(var1x -> N((class07701)var1x.getSource(), class07428, class00894.N(var1x, "at"))))
         );
      }

      var0.register(literalargumentbuilder);
   }
}
