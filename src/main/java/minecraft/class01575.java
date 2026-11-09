package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class class01575 {
   private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("commands.particle.failed"));

   public class01575() {
      super();
   }

   public static void N(CommandDispatcher<class07701> var0, class04348 var1) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("particle").requires(class07686.N(class07686.u)))
            .then(
               ((RequiredArgumentBuilder)class07686.N("name", class07772.N(var1))
                     .executes(
                        var0x -> N(
                           (class07701)var0x.getSource(),
                           class07772.N(var0x, "name"),
                           ((class07701)var0x.getSource()).i(),
                           class06889.L,
                           0.0F,
                           0,
                           false,
                           ((class07701)var0x.getSource()).W().Nm().v()
                        )
                     ))
                  .then(
                     ((RequiredArgumentBuilder)class07686.N("pos", class00881.N())
                           .executes(
                              var0x -> N(
                                 (class07701)var0x.getSource(),
                                 class07772.N(var0x, "name"),
                                 class00881.N(var0x, "pos"),
                                 class06889.L,
                                 0.0F,
                                 0,
                                 false,
                                 ((class07701)var0x.getSource()).W().Nm().v()
                              )
                           ))
                        .then(
                           class07686.N("delta", class00881.N(false))
                              .then(
                                 class07686.N("speed", FloatArgumentType.floatArg(0.0F))
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N("count", IntegerArgumentType.integer(0))
                                                .executes(
                                                   var0x -> N(
                                                      (class07701)var0x.getSource(),
                                                      class07772.N(var0x, "name"),
                                                      class00881.N(var0x, "pos"),
                                                      class00881.N(var0x, "delta"),
                                                      FloatArgumentType.getFloat(var0x, "speed"),
                                                      IntegerArgumentType.getInteger(var0x, "count"),
                                                      false,
                                                      ((class07701)var0x.getSource()).W().Nm().v()
                                                   )
                                                ))
                                             .then(
                                                ((LiteralArgumentBuilder)class07686.y("force")
                                                      .executes(
                                                         var0x -> N(
                                                            (class07701)var0x.getSource(),
                                                            class07772.N(var0x, "name"),
                                                            class00881.N(var0x, "pos"),
                                                            class00881.N(var0x, "delta"),
                                                            FloatArgumentType.getFloat(var0x, "speed"),
                                                            IntegerArgumentType.getInteger(var0x, "count"),
                                                            true,
                                                            ((class07701)var0x.getSource()).W().Nm().v()
                                                         )
                                                      ))
                                                   .then(
                                                      class07686.N("viewers", class07680.u())
                                                         .executes(
                                                            var0x -> N(
                                                               (class07701)var0x.getSource(),
                                                               class07772.N(var0x, "name"),
                                                               class00881.N(var0x, "pos"),
                                                               class00881.N(var0x, "delta"),
                                                               FloatArgumentType.getFloat(var0x, "speed"),
                                                               IntegerArgumentType.getInteger(var0x, "count"),
                                                               true,
                                                               class07680.R(var0x, "viewers")
                                                            )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)class07686.y("normal")
                                                   .executes(
                                                      var0x -> N(
                                                         (class07701)var0x.getSource(),
                                                         class07772.N(var0x, "name"),
                                                         class00881.N(var0x, "pos"),
                                                         class00881.N(var0x, "delta"),
                                                         FloatArgumentType.getFloat(var0x, "speed"),
                                                         IntegerArgumentType.getInteger(var0x, "count"),
                                                         false,
                                                         ((class07701)var0x.getSource()).W().Nm().v()
                                                      )
                                                   ))
                                                .then(
                                                   class07686.N("viewers", class07680.u())
                                                      .executes(
                                                         var0x -> N(
                                                            (class07701)var0x.getSource(),
                                                            class07772.N(var0x, "name"),
                                                            class00881.N(var0x, "pos"),
                                                            class00881.N(var0x, "delta"),
                                                            FloatArgumentType.getFloat(var0x, "speed"),
                                                            IntegerArgumentType.getInteger(var0x, "count"),
                                                            false,
                                                            class07680.R(var0x, "viewers")
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

   private static int N(class07701 var0, class07126 var1, class06889 var2, class06889 var3, float var4, int var5, boolean var6, Collection<class04770> var7) throws CommandSyntaxException {
      int i = 0;

      for (class04770 class04770 : var7) {
         if (var0.R().method_14166(class04770, var1, var6, false, var2.M, var2.B, var2.Z, var5, var3.M, var3.B, var3.Z, var4)) {
            i++;
         }
      }

      if (i == 0) {
         throw N.create();
      } else {
         var0.N(() -> class00392.N("commands.particle.success", class04206.z.y(var1.method_10295()).toString()), true);
         return i;
      }
   }
}
