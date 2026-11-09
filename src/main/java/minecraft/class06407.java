package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import org.jspecify.annotations.Nullable;

public class class06407 {
   private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("commands.ban.failed"));

   public class06407() {
      super();
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("ban").requires(class07686.N(class07686.i)))
            .then(
               ((RequiredArgumentBuilder)class07686.N("targets", class07659.N())
                     .executes(var0x -> N((class07701)var0x.getSource(), class07659.N(var0x, "targets"), null)))
                  .then(
                     class07686.N("reason", class07690.N())
                        .executes(var0x -> N((class07701)var0x.getSource(), class07659.N(var0x, "targets"), class07690.N(var0x, "reason")))
                  )
            )
      );
   }

   private static int N(class07701 var0, Collection<class08774> var1, @Nullable class00392 var2) throws CommandSyntaxException {
      class05170 class05170 = var0.W().Nm().M();
      int i = 0;

      for (class08774 class08774 : var1) {
         if (!class05170.N(class08774)) {
            class05157 class05157 = new class05157(class08774, null, var0.u(), null, var2 == null ? null : var2.getString());
            class05170.N(class05157);
            i++;
            var0.N(() -> class00392.N("commands.ban.success", class00392.y(class08774.y()), class05157.i()), true);
            class04770 class04770 = var0.W().Nm().y(class08774.N());
            if (class04770 != null) {
               class04770.field_13987.method_52396(class00392.L("multiplayer.disconnect.banned"));
            }
         }
      }

      if (i == 0) {
         throw N.create();
      } else {
         return i;
      }
   }
}
