package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.nio.file.Path;
import java.nio.file.Paths;

public class class01808 {
   private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("commands.jfr.start.failed"));
   private static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(var0 -> class00392.y("commands.jfr.dump.failed", var0));

   private class01808() {
      super();
   }

   private static int y(class07701 var0) throws CommandSyntaxException {
      try {
         Path path = Paths.get(".").relativize(class01834.M.L().normalize());
         Path path1 = var0.W().P() && !class07529.ND ? path : path.toAbsolutePath();
         class05216 class05216 = class00392.y(path.toString())
            .N(class06541.field_1073)
            .N(var1x -> var1x.N(new class00627(path1.toString())).N(new class00401(class00392.L("chat.copy.click"))));
         var0.N(() -> class00392.N("commands.jfr.stopped", class05216), false);
         return 1;
      } catch (Throwable throwable) {
         throw y.create(throwable.getMessage());
      }
   }

   private static int N(class07701 var0) throws CommandSyntaxException {
      class03215 class03215 = class03215.N(var0.W());
      if (!class01834.M.N(class03215)) {
         throw N.create();
      } else {
         var0.N(() -> class00392.L("commands.jfr.started"), false);
         return 1;
      }
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("jfr").requires(class07686.N(class07686.R)))
               .then(class07686.y("start").executes(var0x -> N((class07701)var0x.getSource()))))
            .then(class07686.y("stop").executes(var0x -> y((class07701)var0x.getSource())))
      );
   }
}
