package minecraft;

import com.google.common.net.InetAddresses;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Iterator;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class06423 {
   private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("commands.banip.invalid"));
   private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType(class00392.L("commands.banip.failed"));

   public class06423() {
      super();
   }

   private static int y(class07701 var0, String var1, @Nullable class00392 var2) throws CommandSyntaxException {
      class01086 class01086 = var0.W().Nm().B();
      if (class01086.N(var1)) {
         throw y.create();
      } else {
         List<class04770> list = var0.W().Nm().y(var1);
         class01072 class01072 = new class01072(var1, null, var0.u(), null, var2 == null ? null : var2.getString());
         class01086.N(class01072);
         var0.N(() -> class00392.N("commands.banip.success", var1, class01072.i()), true);
         if (!list.isEmpty()) {
            var0.N(() -> class00392.N("commands.banip.info", list.size(), class06794.N(list)), true);
         }

         Iterator<class04770> iterator = list.iterator();

         while (iterator.hasNext()) {
            iterator.next().field_13987.method_52396(class00392.L("multiplayer.disconnect.ip_banned"));
         }

         return list.size();
      }
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("ban-ip").requires(class07686.N(class07686.i)))
            .then(
               ((RequiredArgumentBuilder)class07686.N("target", StringArgumentType.word())
                     .executes(var0x -> N((class07701)var0x.getSource(), StringArgumentType.getString(var0x, "target"), null)))
                  .then(
                     class07686.N("reason", class07690.N())
                        .executes(var0x -> N((class07701)var0x.getSource(), StringArgumentType.getString(var0x, "target"), class07690.N(var0x, "reason")))
                  )
            )
      );
   }

   private static int N(class07701 var0, String var1, @Nullable class00392 var2) throws CommandSyntaxException {
      if (InetAddresses.isInetAddress(var1)) {
         return y(var0, var1, var2);
      } else {
         class04770 class04770 = var0.W().Nm().N(var1);
         if (class04770 != null) {
            return y(var0, class04770.method_14209(), var2);
         } else {
            throw N.create();
         }
      }
   }
}
