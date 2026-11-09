package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Iterator;

public class class01563 {
   public class01563() {
      super();
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("kill").requires(class07686.N(class07686.u)))
               .executes(var0x -> N((class07701)var0x.getSource(), ImmutableList.of(((class07701)var0x.getSource()).B()))))
            .then(class07686.N("targets", class07680.y()).executes(var0x -> N((class07701)var0x.getSource(), class07680.y(var0x, "targets"))))
      );
   }

   private static int N(class07701 var0, Collection<? extends class07049> var1) {
      Iterator iterator = var1.iterator();

      while (iterator.hasNext()) {
         ((class07049)iterator.next()).method_5768(var0.R());
      }

      if (var1.size() == 1) {
         var0.N(() -> class00392.N("commands.kill.success.single", ((class07049)var1.iterator().next()).method_5476()), true);
      } else {
         var0.N(() -> class00392.N("commands.kill.success.multiple", var1.size()), true);
      }

      return var1.size();
   }
}
