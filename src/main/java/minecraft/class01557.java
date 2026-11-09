package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Collections;

public class class01557 {
   public static final class08164 N = new class08149(class08162.y);

   public class01557() {
      super();
   }

   private static boolean y(class07701 var0, class04770 var1, class07282 var2) {
      if (var1.method_7336(var2)) {
         N(var0, var1, var2);
         return true;
      } else {
         return false;
      }
   }

   private static void N(class07701 var0, class04770 var1, class07282 var2) {
      class05216 class05216 = class00392.L("gameMode." + var2.y());
      if (var0.M() == var1) {
         var0.N(() -> class00392.N("commands.gamemode.success.self", class05216), true);
      } else {
         if (var0.R().method_64395().N(class07305.F)) {
            var1.method_64398(class00392.N("gameMode.changed", class05216));
         }

         var0.N(() -> class00392.N("commands.gamemode.success.other", var1.method_5476(), class05216), true);
      }
   }

   private static int N(CommandContext<class07701> var0, Collection<class04770> var1, class07282 var2) {
      int i = 0;

      for (class04770 class04770 : var1) {
         if (y((class07701)var0.getSource(), class04770, var2)) {
            i++;
         }
      }

      return i;
   }

   public static void N(class04770 var0, class07282 var1) {
      y(var0.method_64396(), var0, var1);
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("gamemode").requires(class07686.N(N)))
            .then(
               ((RequiredArgumentBuilder)class07686.N("gamemode", class04131.N())
                     .executes(var0x -> N(var0x, Collections.singleton(((class07701)var0x.getSource()).Z()), class04131.N(var0x, "gamemode"))))
                  .then(class07686.N("target", class07680.u()).executes(var0x -> N(var0x, class07680.R(var0x, "target"), class04131.N(var0x, "gamemode"))))
            )
      );
   }
}
