package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import org.jspecify.annotations.Nullable;

public class class06412 {
   private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("commands.effect.give.failed"));
   private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType(class00392.L("commands.effect.clear.everything.failed"));
   private static final SimpleCommandExceptionType L = new SimpleCommandExceptionType(class00392.L("commands.effect.clear.specific.failed"));

   public class06412() {
      super();
   }

   public static void N(CommandDispatcher<class07701> var0, class04348 var1) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("effect").requires(class07686.N(class07686.u)))
               .then(
                  ((LiteralArgumentBuilder)class07686.y("clear")
                        .executes(var0x -> N((class07701)var0x.getSource(), ImmutableList.of(((class07701)var0x.getSource()).B()))))
                     .then(
                        ((RequiredArgumentBuilder)class07686.N("targets", class07680.y())
                              .executes(var0x -> N((class07701)var0x.getSource(), class07680.y(var0x, "targets"))))
                           .then(
                              class07686.N("effect", class03784.N(var1, class04227.Ni))
                                 .executes(var0x -> N((class07701)var0x.getSource(), class07680.y(var0x, "targets"), class03784.R(var0x, "effect")))
                           )
                     )
               ))
            .then(
               class07686.y("give")
                  .then(
                     class07686.N("targets", class07680.y())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N("effect", class03784.N(var1, class04227.Ni))
                                    .executes(
                                       var0x -> N((class07701)var0x.getSource(), class07680.y(var0x, "targets"), class03784.R(var0x, "effect"), null, 0, true)
                                    ))
                                 .then(
                                    ((RequiredArgumentBuilder)class07686.N("seconds", IntegerArgumentType.integer(1, 1000000))
                                          .executes(
                                             var0x -> N(
                                                (class07701)var0x.getSource(),
                                                class07680.y(var0x, "targets"),
                                                class03784.R(var0x, "effect"),
                                                IntegerArgumentType.getInteger(var0x, "seconds"),
                                                0,
                                                true
                                             )
                                          ))
                                       .then(
                                          ((RequiredArgumentBuilder)class07686.N("amplifier", IntegerArgumentType.integer(0, 255))
                                                .executes(
                                                   var0x -> N(
                                                      (class07701)var0x.getSource(),
                                                      class07680.y(var0x, "targets"),
                                                      class03784.R(var0x, "effect"),
                                                      IntegerArgumentType.getInteger(var0x, "seconds"),
                                                      IntegerArgumentType.getInteger(var0x, "amplifier"),
                                                      true
                                                   )
                                                ))
                                             .then(
                                                class07686.N("hideParticles", BoolArgumentType.bool())
                                                   .executes(
                                                      var0x -> N(
                                                         (class07701)var0x.getSource(),
                                                         class07680.y(var0x, "targets"),
                                                         class03784.R(var0x, "effect"),
                                                         IntegerArgumentType.getInteger(var0x, "seconds"),
                                                         IntegerArgumentType.getInteger(var0x, "amplifier"),
                                                         !BoolArgumentType.getBool(var0x, "hideParticles")
                                                      )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)class07686.y("infinite")
                                       .executes(
                                          var0x -> N((class07701)var0x.getSource(), class07680.y(var0x, "targets"), class03784.R(var0x, "effect"), -1, 0, true)
                                       ))
                                    .then(
                                       ((RequiredArgumentBuilder)class07686.N("amplifier", IntegerArgumentType.integer(0, 255))
                                             .executes(
                                                var0x -> N(
                                                   (class07701)var0x.getSource(),
                                                   class07680.y(var0x, "targets"),
                                                   class03784.R(var0x, "effect"),
                                                   -1,
                                                   IntegerArgumentType.getInteger(var0x, "amplifier"),
                                                   true
                                                )
                                             ))
                                          .then(
                                             class07686.N("hideParticles", BoolArgumentType.bool())
                                                .executes(
                                                   var0x -> N(
                                                      (class07701)var0x.getSource(),
                                                      class07680.y(var0x, "targets"),
                                                      class03784.R(var0x, "effect"),
                                                      -1,
                                                      IntegerArgumentType.getInteger(var0x, "amplifier"),
                                                      !BoolArgumentType.getBool(var0x, "hideParticles")
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

   private static int N(class07701 var0, Collection<? extends class07049> var1, class03556<class07084> var2) throws CommandSyntaxException {
      class07084 class07084 = (class07084)var2.N();
      int i = 0;

      for (class07049 class07049 : var1) {
         if (class07049 instanceof class07438 && ((class07438)class07049).method_6016(var2)) {
            i++;
         }
      }

      if (i == 0) {
         throw L.create();
      } else {
         if (var1.size() == 1) {
            var0.N(
               () -> class00392.N("commands.effect.clear.specific.success.single", class07084.M(), ((class07049)var1.iterator().next()).method_5476()), true
            );
         } else {
            var0.N(() -> class00392.N("commands.effect.clear.specific.success.multiple", class07084.M(), var1.size()), true);
         }

         return i;
      }
   }

   private static int N(class07701 var0, Collection<? extends class07049> var1) throws CommandSyntaxException {
      int i = 0;

      for (class07049 class07049 : var1) {
         if (class07049 instanceof class07438 && ((class07438)class07049).method_6012()) {
            i++;
         }
      }

      if (i == 0) {
         throw y.create();
      } else {
         if (var1.size() == 1) {
            var0.N(() -> class00392.N("commands.effect.clear.everything.success.single", ((class07049)var1.iterator().next()).method_5476()), true);
         } else {
            var0.N(() -> class00392.N("commands.effect.clear.everything.success.multiple", var1.size()), true);
         }

         return i;
      }
   }

   private static int N(class07701 var0, Collection<? extends class07049> var1, class03556<class07084> var2, @Nullable Integer var3, int var4, boolean var5) throws CommandSyntaxException {
      class07084 class07084 = (class07084)var2.N();
      int i = 0;
      int j;
      if (var3 != null) {
         if (class07084.N()) {
            j = var3;
         } else if (var3 == -1) {
            j = -1;
         } else {
            j = var3 * 20;
         }
      } else if (class07084.N()) {
         j = 1;
      } else {
         j = 600;
      }

      for (class07049 class07049 : var1) {
         if (class07049 instanceof class07438) {
            class07055 class07055 = new class07055(var2, j, var4, false, var5);
            if (((class07438)class07049).method_37222(class07055, var0.M())) {
               i++;
            }
         }
      }

      if (i == 0) {
         throw N.create();
      } else {
         if (var1.size() == 1) {
            var0.N(() -> class00392.N("commands.effect.give.success.single", class07084.M(), ((class07049)var1.iterator().next()).method_5476(), j / 20), true);
         } else {
            var0.N(() -> class00392.N("commands.effect.give.success.multiple", class07084.M(), var1.size(), j / 20), true);
         }

         return i;
      }
   }
}
