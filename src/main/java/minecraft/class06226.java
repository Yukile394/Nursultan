package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Iterator;
import org.jspecify.annotations.Nullable;

public class class06226 {
   public class06226() {
      super();
   }

   public static void N(CommandDispatcher<class07701> var0) {
      RequiredArgumentBuilder requiredargumentbuilder = (RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N("targets", class07680.u())
            .executes(var0x -> N((class07701)var0x.getSource(), class07680.R(var0x, "targets"), null, null)))
         .then(
            class07686.y("*")
               .then(
                  class07686.N("sound", class07778.N())
                     .suggests(class06791.N(class06791.y))
                     .executes(var0x -> N((class07701)var0x.getSource(), class07680.R(var0x, "targets"), null, class07778.N(var0x, "sound")))
               )
         );

      for (class04911 class04911 : class04911.values()) {
         requiredargumentbuilder.then(
            ((LiteralArgumentBuilder)class07686.y(class04911.N())
                  .executes(var1x -> N((class07701)var1x.getSource(), class07680.R(var1x, "targets"), class04911, null)))
               .then(
                  class07686.N("sound", class07778.N())
                     .suggests(class06791.N(class06791.y))
                     .executes(var1x -> N((class07701)var1x.getSource(), class07680.R(var1x, "targets"), class04911, class07778.N(var1x, "sound")))
               )
         );
      }

      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("stopsound").requires(class07686.N(class07686.u))).then(requiredargumentbuilder)
      );
   }

   private static int N(class07701 var0, Collection<class04770> var1, @Nullable class04911 var2, @Nullable class01894 var3) {
      class08090 class08090 = new class08090(var3, var2);
      Iterator iterator = var1.iterator();

      while (iterator.hasNext()) {
         ((class04770)iterator.next()).field_13987.method_14364(class08090);
      }

      if (var2 != null) {
         if (var3 != null) {
            var0.N(() -> class00392.N("commands.stopsound.success.source.sound", class00392.N(var3), var2.N()), true);
         } else {
            var0.N(() -> class00392.N("commands.stopsound.success.source.any", var2.N()), true);
         }
      } else if (var3 != null) {
         var0.N(() -> class00392.N("commands.stopsound.success.sourceless.sound", class00392.N(var3)), true);
      } else {
         var0.N(() -> class00392.L("commands.stopsound.success.sourceless.any"), true);
      }

      return var1.size();
   }
}
