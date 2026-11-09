package minecraft;

import Nursultan.class09476;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import net.fabricmc.fabric.mixin.gamerule.GameRuleCommandAccessor;

public class class01549 implements GameRuleCommandAccessor {
   public class01549() {
      super();
   }

   private static <T> int y(class07701 var0, class06839<T> var1) {
      Object object = var0.R().method_64395().N(var1);
      var0.N(() -> class00392.N("commands.gamerule.query", var1.N(), var1.N(object)), false);
      return var1.y(object);
   }

   public static void N(CommandDispatcher<class07701> var0, class04348 var1) {
      LiteralArgumentBuilder<class07701> literalargumentbuilder = (LiteralArgumentBuilder<class07701>)class07686.y("gamerule")
         .requires(class07686.N(class07686.u));
      new class07305(var1.N()).N(new class09476(literalargumentbuilder));
      var0.register(literalargumentbuilder);
   }

   public static <T> LiteralArgumentBuilder<class07701> N(class06839<T> var0, LiteralArgumentBuilder<class07701> var1) {
      return (LiteralArgumentBuilder<class07701>)((LiteralArgumentBuilder)var1.executes(var1x -> y((class07701)var1x.getSource(), var0)))
         .then(class07686.N("value", var0.M()).executes(var1x -> N(var1x, var0)));
   }

   private static <T> int N(CommandContext<class07701> var0, class06839<T> var1) {
      class07701 class07701 = (class07701)var0.getSource();
      Object object = var0.getArgument("value", var1.u());
      class07701.R().method_64395().N(var1, object, ((class07701)var0.getSource()).W());
      class07701.N(() -> class00392.N("commands.gamerule.set", var1.N(), var1.N(object)), true);
      return var1.y(object);
   }
}
