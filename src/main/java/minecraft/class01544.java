package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class class01544 {
   private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("commands.kick.owner.failed"));
   private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType(class00392.L("commands.kick.singleplayer.failed"));

   public class01544() {
      super();
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("kick").requires(class07686.N(class07686.i)))
            .then(
               ((RequiredArgumentBuilder)class07686.N("targets", class07680.u())
                     .executes(var0x -> N((class07701)var0x.getSource(), class07680.R(var0x, "targets"), class00392.L("multiplayer.disconnect.kicked"))))
                  .then(
                     class07686.N("reason", class07690.N())
                        .executes(var0x -> N((class07701)var0x.getSource(), class07680.R(var0x, "targets"), class07690.N(var0x, "reason")))
                  )
            )
      );
   }

   private static int N(class07701 var0, Collection<class04770> var1, class00392 var2) throws CommandSyntaxException {
      if (!var0.W().P()) {
         throw y.create();
      } else {
         int i = 0;

         for (class04770 class04770 : var1) {
            if (!var0.W().N(class04770.method_72498())) {
               class04770.field_13987.method_52396(var2);
               var0.N(() -> class00392.N("commands.kick.success", class04770.method_5476(), var2), true);
               i++;
            }
         }

         if (i == 0) {
            throw N.create();
         } else {
            return i;
         }
      }
   }
}
