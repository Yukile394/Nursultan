package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;

public class class06420 {
   private static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(var0 -> class00392.y("commands.difficulty.failure", var0));

   public class06420() {
      super();
   }

   public static int N(class07701 var0, class07086 var1) throws CommandSyntaxException {
      class02796 class02796 = var0.W();
      if (class02796.yn().s() == var1) {
         throw N.create(var1.u());
      } else {
         class02796.N(var1, true);
         var0.N(() -> class00392.N("commands.difficulty.success", var1.y()), true);
         return 0;
      }
   }

   public static void N(CommandDispatcher<class07701> var0) {
      LiteralArgumentBuilder<class07701> literalargumentbuilder = class07686.y("difficulty");

      for (class07086 class07086 : class07086.values()) {
         literalargumentbuilder.then(class07686.y(class07086.u()).executes(var1x -> N((class07701)var1x.getSource(), class07086)));
      }

      var0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)literalargumentbuilder.requires(class07686.N(class07686.u))).executes(var0x -> {
         class07086 class07086x = ((class07701)var0x.getSource()).R().y();
         ((class07701)var0x.getSource()).N(() -> class00392.N("commands.difficulty.query", class07086x.y()), false);
         return class07086x.N();
      }));
   }
}
