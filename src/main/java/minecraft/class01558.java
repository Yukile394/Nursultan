package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class class01558 {
   private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("commands.experience.set.points.invalid"));

   public class01558() {
      super();
   }

   private static int y(class07701 var0, Collection<? extends class04770> var1, int var2, class01581 var3) throws CommandSyntaxException {
      int i = 0;

      for (class04770 class04770 : var1) {
         if (var3.field_13642.test(class04770, var2)) {
            i++;
         }
      }

      if (i == 0) {
         throw N.create();
      } else {
         if (var1.size() == 1) {
            var0.N(
               () -> class00392.N("commands.experience.set." + var3.field_13643 + ".success.single", var2, ((class04770)var1.iterator().next()).method_5476()),
               true
            );
         } else {
            var0.N(() -> class00392.N("commands.experience.set." + var3.field_13643 + ".success.multiple", var2, var1.size()), true);
         }

         return var1.size();
      }
   }

   public static void N(CommandDispatcher<class07701> var0) {
      LiteralCommandNode literalcommandnode = var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("experience")
                     .requires(class07686.N(class07686.u)))
                  .then(
                     class07686.y("add")
                        .then(
                           class07686.N("target", class07680.u())
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N("amount", IntegerArgumentType.integer())
                                          .executes(
                                             var0x -> N(
                                                (class07701)var0x.getSource(),
                                                class07680.R(var0x, "target"),
                                                IntegerArgumentType.getInteger(var0x, "amount"),
                                                class01581.field_13644
                                             )
                                          ))
                                       .then(
                                          class07686.y("points")
                                             .executes(
                                                var0x -> N(
                                                   (class07701)var0x.getSource(),
                                                   class07680.R(var0x, "target"),
                                                   IntegerArgumentType.getInteger(var0x, "amount"),
                                                   class01581.field_13644
                                                )
                                             )
                                       ))
                                    .then(
                                       class07686.y("levels")
                                          .executes(
                                             var0x -> N(
                                                (class07701)var0x.getSource(),
                                                class07680.R(var0x, "target"),
                                                IntegerArgumentType.getInteger(var0x, "amount"),
                                                class01581.field_13641
                                             )
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  class07686.y("set")
                     .then(
                        class07686.N("target", class07680.u())
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N("amount", IntegerArgumentType.integer(0))
                                       .executes(
                                          var0x -> y(
                                             (class07701)var0x.getSource(),
                                             class07680.R(var0x, "target"),
                                             IntegerArgumentType.getInteger(var0x, "amount"),
                                             class01581.field_13644
                                          )
                                       ))
                                    .then(
                                       class07686.y("points")
                                          .executes(
                                             var0x -> y(
                                                (class07701)var0x.getSource(),
                                                class07680.R(var0x, "target"),
                                                IntegerArgumentType.getInteger(var0x, "amount"),
                                                class01581.field_13644
                                             )
                                          )
                                    ))
                                 .then(
                                    class07686.y("levels")
                                       .executes(
                                          var0x -> y(
                                             (class07701)var0x.getSource(),
                                             class07680.R(var0x, "target"),
                                             IntegerArgumentType.getInteger(var0x, "amount"),
                                             class01581.field_13641
                                          )
                                       )
                                 )
                           )
                     )
               ))
            .then(
               class07686.y("query")
                  .then(
                     ((RequiredArgumentBuilder)class07686.N("target", class07680.L())
                           .then(
                              class07686.y("points").executes(var0x -> N((class07701)var0x.getSource(), class07680.i(var0x, "target"), class01581.field_13644))
                           ))
                        .then(class07686.y("levels").executes(var0x -> N((class07701)var0x.getSource(), class07680.i(var0x, "target"), class01581.field_13641)))
                  )
            )
      );
      var0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("xp").requires(class07686.N(class07686.u))).redirect(literalcommandnode));
   }

   private static int N(class07701 var0, Collection<? extends class04770> var1, int var2, class01581 var3) {
      for (class04770 class04770 : var1) {
         var3.field_13639.accept(class04770, var2);
      }

      if (var1.size() == 1) {
         var0.N(
            () -> class00392.N("commands.experience.add." + var3.field_13643 + ".success.single", var2, ((class04770)var1.iterator().next()).method_5476()),
            true
         );
      } else {
         var0.N(() -> class00392.N("commands.experience.add." + var3.field_13643 + ".success.multiple", var2, var1.size()), true);
      }

      return var1.size();
   }

   private static int N(class07701 var0, class04770 var1, class01581 var2) {
      int i = var2.field_13645.applyAsInt(var1);
      var0.N(() -> class00392.N("commands.experience.query." + var2.field_13643, var1.method_5476(), i), false);
      return i;
   }
}
