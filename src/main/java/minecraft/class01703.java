package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class class01703 {
   private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.y("Source is not a mob"));
   private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType(class00392.y("Path not found"));
   private static final SimpleCommandExceptionType L = new SimpleCommandExceptionType(class00392.y("Target not reached"));

   public class01703() {
      super();
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("debugpath").requires(class07686.N(class07686.u)))
            .then(class07686.N("to", class00894.N()).executes(var0x -> N((class07701)var0x.getSource(), class00894.N(var0x, "to"))))
      );
   }

   private static int N(class07701 var0, class07209 var1) throws CommandSyntaxException {
      if (!(var0.M() instanceof class07079 class07079)) {
         throw N.create();
      } else {
         class00143 class00143 = new class07655(class07079, var0.R()).N(var1, 0);
         if (class00143 == null) {
            throw y.create();
         } else if (!class00143.z()) {
            throw L.create();
         } else {
            var0.N(() -> class00392.y("Made path"), true);
            return 1;
         }
      }
   }
}
