package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Iterator;

public class class04014 {
   public class04014() {
      super();
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("warden_spawn_tracker").requires(class07686.N(class07686.u)))
               .then(class07686.y("clear").executes(var0x -> N((class07701)var0x.getSource(), ImmutableList.of(((class07701)var0x.getSource()).Z())))))
            .then(
               class07686.y("set")
                  .then(
                     class07686.N("warning_level", IntegerArgumentType.integer(0, 4))
                        .executes(
                           var0x -> N(
                              (class07701)var0x.getSource(),
                              ImmutableList.of(((class07701)var0x.getSource()).Z()),
                              IntegerArgumentType.getInteger(var0x, "warning_level")
                           )
                        )
                  )
            )
      );
   }

   private static int N(class07701 var0, Collection<? extends class08036> var1, int var2) {
      Iterator iterator = var1.iterator();

      while (iterator.hasNext()) {
         ((class08036)iterator.next()).method_42272().ifPresent(var1x -> var1x.N(var2));
      }

      if (var1.size() == 1) {
         var0.N(() -> class00392.N("commands.warden_spawn_tracker.set.success.single", ((class08036)var1.iterator().next()).method_5476()), true);
      } else {
         var0.N(() -> class00392.N("commands.warden_spawn_tracker.set.success.multiple", var1.size()), true);
      }

      return var1.size();
   }

   private static int N(class07701 var0, Collection<? extends class08036> var1) {
      Iterator iterator = var1.iterator();

      while (iterator.hasNext()) {
         ((class08036)iterator.next()).method_42272().ifPresent(class03982::y);
      }

      if (var1.size() == 1) {
         var0.N(() -> class00392.N("commands.warden_spawn_tracker.clear.success.single", ((class08036)var1.iterator().next()).method_5476()), true);
      } else {
         var0.N(() -> class00392.N("commands.warden_spawn_tracker.clear.success.multiple", var1.size()), true);
      }

      return var1.size();
   }
}
