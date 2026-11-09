package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Collections;

public class class06215 {
   private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("commands.recipe.give.failed"));
   private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType(class00392.L("commands.recipe.take.failed"));

   public class06215() {
      super();
   }

   private static int y(class07701 var0, Collection<class04770> var1, Collection<class03729<?>> var2) throws CommandSyntaxException {
      int i = 0;

      for (class04770 class04770 : var1) {
         i += class04770.method_7333(var2);
      }

      if (i == 0) {
         throw y.create();
      } else {
         if (var1.size() == 1) {
            var0.N(() -> class00392.N("commands.recipe.take.success.single", var2.size(), ((class04770)var1.iterator().next()).method_5476()), true);
         } else {
            var0.N(() -> class00392.N("commands.recipe.take.success.multiple", var2.size(), var1.size()), true);
         }

         return i;
      }
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("recipe").requires(class07686.N(class07686.u)))
               .then(
                  class07686.y("give")
                     .then(
                        ((RequiredArgumentBuilder)class07686.N("targets", class07680.u())
                              .then(
                                 class07686.N("recipe", class04403.N(class04227.yV))
                                    .executes(
                                       var0x -> N(
                                          (class07701)var0x.getSource(), class07680.R(var0x, "targets"), Collections.singleton(class04403.u(var0x, "recipe"))
                                       )
                                    )
                              ))
                           .then(
                              class07686.y("*")
                                 .executes(
                                    var0x -> N((class07701)var0x.getSource(), class07680.R(var0x, "targets"), ((class07701)var0x.getSource()).W().yM().u())
                                 )
                           )
                     )
               ))
            .then(
               class07686.y("take")
                  .then(
                     ((RequiredArgumentBuilder)class07686.N("targets", class07680.u())
                           .then(
                              class07686.N("recipe", class04403.N(class04227.yV))
                                 .executes(
                                    var0x -> y(
                                       (class07701)var0x.getSource(), class07680.R(var0x, "targets"), Collections.singleton(class04403.u(var0x, "recipe"))
                                    )
                                 )
                           ))
                        .then(
                           class07686.y("*")
                              .executes(var0x -> y((class07701)var0x.getSource(), class07680.R(var0x, "targets"), ((class07701)var0x.getSource()).W().yM().u()))
                        )
                  )
            )
      );
   }

   private static int N(class07701 var0, Collection<class04770> var1, Collection<class03729<?>> var2) throws CommandSyntaxException {
      int i = 0;

      for (class04770 class04770 : var1) {
         i += class04770.method_7254(var2);
      }

      if (i == 0) {
         throw N.create();
      } else {
         if (var1.size() == 1) {
            var0.N(() -> class00392.N("commands.recipe.give.success.single", var2.size(), ((class04770)var1.iterator().next()).method_5476()), true);
         } else {
            var0.N(() -> class00392.N("commands.recipe.give.success.multiple", var2.size(), var1.size()), true);
         }

         return i;
      }
   }
}
