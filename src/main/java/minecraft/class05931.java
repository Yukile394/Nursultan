package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import org.jspecify.annotations.Nullable;

public class class05931 {
   private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("commands.spectate.self"));
   private static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(var0 -> class00392.y("commands.spectate.not_spectator", var0));
   private static final DynamicCommandExceptionType L = new DynamicCommandExceptionType(var0 -> class00392.y("commands.spectate.cannot_spectate", var0));

   public class05931() {
      super();
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("spectate").requires(class07686.N(class07686.u)))
               .executes(var0x -> N((class07701)var0x.getSource(), null, ((class07701)var0x.getSource()).Z())))
            .then(
               ((RequiredArgumentBuilder)class07686.N("target", class07680.N())
                     .executes(var0x -> N((class07701)var0x.getSource(), class07680.N(var0x, "target"), ((class07701)var0x.getSource()).Z())))
                  .then(
                     class07686.N("player", class07680.L())
                        .executes(var0x -> N((class07701)var0x.getSource(), class07680.N(var0x, "target"), class07680.i(var0x, "player")))
                  )
            )
      );
   }

   private static int N(class07701 var0, @Nullable class07049 var1, class04770 var2) throws CommandSyntaxException {
      if (var2 == var1) {
         throw N.create();
      } else if (!var2.method_7325()) {
         throw y.create(var2.method_5476());
      } else if (var1 != null && var1.method_5864().W() == 0) {
         throw L.create(var1.method_5476());
      } else {
         var2.method_14224(var1);
         if (var1 != null) {
            var0.N(() -> class00392.N("commands.spectate.success.started", var1.method_5476()), false);
         } else {
            var0.N(() -> class00392.L("commands.spectate.success.stopped"), false);
         }

         return 1;
      }
   }
}
