package minecraft;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;

public class class06399 {
   public class06399() {
      super();
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("banlist")
                     .requires(class07686.N(class07686.i)))
                  .executes(var0x -> {
                     class01062 class01062 = ((class07701)var0x.getSource()).W().Nm();
                     return N((class07701)var0x.getSource(), Lists.newArrayList(Iterables.concat(class01062.M().i(), class01062.B().i())));
                  }))
               .then(class07686.y("ips").executes(var0x -> N((class07701)var0x.getSource(), ((class07701)var0x.getSource()).W().Nm().B().i()))))
            .then(class07686.y("players").executes(var0x -> N((class07701)var0x.getSource(), ((class07701)var0x.getSource()).W().Nm().M().i())))
      );
   }

   private static int N(class07701 var0, Collection<? extends class01060<?>> var1) {
      if (var1.isEmpty()) {
         var0.N(() -> class00392.L("commands.banlist.none"), false);
      } else {
         var0.N(() -> class00392.N("commands.banlist.list", var1.size()), false);

         for (class01060 class01060 : var1) {
            var0.N(() -> class00392.N("commands.banlist.entry", class01060.R(), class01060.y(), class01060.i()), false);
         }
      }

      return var1.size();
   }
}
