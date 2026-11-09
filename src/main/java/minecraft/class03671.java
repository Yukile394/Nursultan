package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class class03671 {
   private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("commands.damage.invulnerable"));

   public class03671() {
      super();
   }

   public static void N(CommandDispatcher<class07701> var0, class04348 var1) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("damage").requires(class07686.N(class07686.u)))
            .then(
               class07686.N("target", class07680.N())
                  .then(
                     ((RequiredArgumentBuilder)class07686.N("amount", FloatArgumentType.floatArg(0.0F))
                           .executes(
                              var0x -> N(
                                 (class07701)var0x.getSource(),
                                 class07680.N(var0x, "target"),
                                 FloatArgumentType.getFloat(var0x, "amount"),
                                 ((class07701)var0x.getSource()).R().method_48963().s()
                              )
                           ))
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N("damageType", class03784.N(var1, class04227.yN))
                                    .executes(
                                       var0x -> N(
                                          (class07701)var0x.getSource(),
                                          class07680.N(var0x, "target"),
                                          FloatArgumentType.getFloat(var0x, "amount"),
                                          new class07072(class03784.N(var0x, "damageType", class04227.yN))
                                       )
                                    ))
                                 .then(
                                    class07686.y("at")
                                       .then(
                                          class07686.N("location", class00881.N())
                                             .executes(
                                                var0x -> N(
                                                   (class07701)var0x.getSource(),
                                                   class07680.N(var0x, "target"),
                                                   FloatArgumentType.getFloat(var0x, "amount"),
                                                   new class07072(class03784.N(var0x, "damageType", class04227.yN), class00881.N(var0x, "location"))
                                                )
                                             )
                                       )
                                 ))
                              .then(
                                 class07686.y("by")
                                    .then(
                                       ((RequiredArgumentBuilder)class07686.N("entity", class07680.N())
                                             .executes(
                                                var0x -> N(
                                                   (class07701)var0x.getSource(),
                                                   class07680.N(var0x, "target"),
                                                   FloatArgumentType.getFloat(var0x, "amount"),
                                                   new class07072(class03784.N(var0x, "damageType", class04227.yN), class07680.N(var0x, "entity"))
                                                )
                                             ))
                                          .then(
                                             class07686.y("from")
                                                .then(
                                                   class07686.N("cause", class07680.N())
                                                      .executes(
                                                         var0x -> N(
                                                            (class07701)var0x.getSource(),
                                                            class07680.N(var0x, "target"),
                                                            FloatArgumentType.getFloat(var0x, "amount"),
                                                            new class07072(
                                                               class03784.N(var0x, "damageType", class04227.yN),
                                                               class07680.N(var0x, "entity"),
                                                               class07680.N(var0x, "cause")
                                                            )
                                                         )
                                                      )
                                                )
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int N(class07701 var0, class07049 var1, float var2, class07072 var3) throws CommandSyntaxException {
      if (var1.method_64397(var0.R(), var3, var2)) {
         var0.N(() -> class00392.N("commands.damage.success", var2, var1.method_5476()), true);
         return 1;
      } else {
         throw N.create();
      }
   }
}
