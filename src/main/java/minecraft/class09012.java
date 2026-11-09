package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Iterator;

public class class09012 {
   public class09012() {
      super();
   }

   public static void N(CommandDispatcher<class07701> var0, class04348 var1) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("dialog").requires(class07686.N(class07686.u)))
               .then(
                  class07686.y("show")
                     .then(
                        class07686.N("targets", class07680.u())
                           .then(
                              class07686.N("dialog", class02198.u(var1))
                                 .executes(var0x -> N((class07701)var0x.getSource(), class07680.R(var0x, "targets"), class02198.u(var0x, "dialog")))
                           )
                     )
               ))
            .then(
               class07686.y("clear")
                  .then(class07686.N("targets", class07680.u()).executes(var0x -> N((class07701)var0x.getSource(), class07680.R(var0x, "targets"))))
            )
      );
   }

   private static int N(class07701 var0, Collection<class04770> var1, class03556<class09037> var2) {
      Iterator iterator = var1.iterator();

      while (iterator.hasNext()) {
         ((class04770)iterator.next()).method_71753(var2);
      }

      if (var1.size() == 1) {
         var0.N(() -> class00392.N("commands.dialog.show.single", ((class04770)var1.iterator().next()).method_5476()), true);
      } else {
         var0.N(() -> class00392.N("commands.dialog.show.multiple", var1.size()), true);
      }

      return var1.size();
   }

   private static int N(class07701 var0, Collection<class04770> var1) {
      Iterator iterator = var1.iterator();

      while (iterator.hasNext()) {
         ((class04770)iterator.next()).field_13987.method_14364(class09014.N);
      }

      if (var1.size() == 1) {
         var0.N(() -> class00392.N("commands.dialog.clear.single", ((class04770)var1.iterator().next()).method_5476()), true);
      } else {
         var0.N(() -> class00392.N("commands.dialog.clear.multiple", var1.size()), true);
      }

      return var1.size();
   }
}
