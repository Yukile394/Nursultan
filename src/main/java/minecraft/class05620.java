package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class class05620 {
   private static final int N = -1;

   private static int L(class07701 var0, int var1) {
      var0.W().NY().method_27910(0, N(var0, var1, class04782.field_41751), true, true);
      var0.N(() -> class00392.L("commands.weather.set.thunder"), true);
      return var1;
   }

   public class05620() {
      super();
   }

   private static int y(class07701 var0, int var1) {
      var0.W().NY().method_27910(0, N(var0, var1, class04782.field_41750), true, false);
      var0.N(() -> class00392.L("commands.weather.set.rain"), true);
      return var1;
   }

   private static int N(class07701 var0, int var1) {
      var0.W().NY().method_27910(N(var0, var1, class04782.field_41749), 0, false, false);
      var0.N(() -> class00392.L("commands.weather.set.clear"), true);
      return var1;
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("weather")
                     .requires(class07686.N(class07686.u)))
                  .then(
                     ((LiteralArgumentBuilder)class07686.y("clear").executes(var0x -> N((class07701)var0x.getSource(), -1)))
                        .then(
                           class07686.N("duration", class07798.N(1))
                              .executes(var0x -> N((class07701)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "duration")))
                        )
                  ))
               .then(
                  ((LiteralArgumentBuilder)class07686.y("rain").executes(var0x -> y((class07701)var0x.getSource(), -1)))
                     .then(
                        class07686.N("duration", class07798.N(1))
                           .executes(var0x -> y((class07701)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "duration")))
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)class07686.y("thunder").executes(var0x -> L((class07701)var0x.getSource(), -1)))
                  .then(
                     class07686.N("duration", class07798.N(1))
                        .executes(var0x -> L((class07701)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "duration")))
                  )
            )
      );
   }

   private static int N(class07701 var0, int var1, class02142 var2) {
      return var1 == -1 ? var2.N(var0.W().NY().method_8409()) : var1;
   }
}
