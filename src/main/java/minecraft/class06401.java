package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.logging.LogUtils;
import java.util.Locale;
import org.slf4j.Logger;

public class class06401 {
   static final Logger N = LogUtils.getLogger();
   private static final SimpleCommandExceptionType u = new SimpleCommandExceptionType(class00392.L("commands.debug.notRunning"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(class00392.L("commands.debug.alreadyRunning"));
   static final SimpleCommandExceptionType y = new SimpleCommandExceptionType(class00392.L("commands.debug.function.noRecursion"));
   static final SimpleCommandExceptionType L = new SimpleCommandExceptionType(class00392.L("commands.debug.function.noReturnRun"));

   public class06401() {
      super();
   }

   private static int y(class07701 var0) throws CommandSyntaxException {
      class02796 class02796 = var0.W();
      if (!class02796.yY()) {
         throw u.create();
      } else {
         class04681 class04681 = class02796.yO();
         double d0 = (double)class04681.M() / class01517.N;
         double d1 = class04681.R() / d0;
         var0.N(
            () -> class00392.N("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", d0), class04681.R(), String.format(Locale.ROOT, "%.2f", d1)), true
         );
         return (int)d1;
      }
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("debug")
                     .requires(class07686.N(class07686.i)))
                  .then(class07686.y("start").executes(var0x -> N((class07701)var0x.getSource()))))
               .then(class07686.y("stop").executes(var0x -> y((class07701)var0x.getSource()))))
            .then(
               ((LiteralArgumentBuilder)class07686.y("function").requires(class07686.N(class07686.i)))
                  .then(class07686.N("name", class06808.N()).suggests(class01568.L).executes(new class06388()))
            )
      );
   }

   private static int N(class07701 var0) throws CommandSyntaxException {
      class02796 class02796 = var0.W();
      if (class02796.yY()) {
         throw i.create();
      } else {
         class02796.yQ();
         var0.N(() -> class00392.L("commands.debug.started"), true);
         return 0;
      }
   }
}
