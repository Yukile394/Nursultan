package minecraft;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import org.jspecify.annotations.Nullable;

public class class04180 {
   private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("commands.random.error.range_too_large"));
   private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType(class00392.L("commands.random.error.range_too_small"));

   public class04180() {
      super();
   }

   private static int N(class07701 var0, class00836 var1, @Nullable class01894 var2, boolean var3) throws CommandSyntaxException {
      class06069 class06069;
      if (var2 != null) {
         class06069 = var0.R().method_51836(var2);
      } else {
         class06069 = var0.R().method_8409();
      }

      int i = var1.y().orElse(Integer.MIN_VALUE);
      int j = var1.L().orElse(Integer.MAX_VALUE);
      long k = (long)j - i;
      if (k == 0L) {
         throw y.create();
      } else if (k >= 2147483647L) {
         throw N.create();
      } else {
         int l = class04995.y(class06069, i, j);
         if (var3) {
            var0.W().Nm().N(class00392.N("commands.random.roll", var0.L(), l, i, j), false);
         } else {
            var0.N(() -> class00392.N("commands.random.sample.success", l), false);
         }

         return l;
      }
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("random").then(N("value", false))).then(N("roll", true)))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("reset").requires(class07686.N(class07686.u)))
                     .then(
                        ((LiteralArgumentBuilder)class07686.y("*").executes(var0x -> N((class07701)var0x.getSource())))
                           .then(
                              ((RequiredArgumentBuilder)class07686.N("seed", IntegerArgumentType.integer())
                                    .executes(var0x -> N((class07701)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "seed"), true, true)))
                                 .then(
                                    ((RequiredArgumentBuilder)class07686.N("includeWorldSeed", BoolArgumentType.bool())
                                          .executes(
                                             var0x -> N(
                                                (class07701)var0x.getSource(),
                                                IntegerArgumentType.getInteger(var0x, "seed"),
                                                BoolArgumentType.getBool(var0x, "includeWorldSeed"),
                                                true
                                             )
                                          ))
                                       .then(
                                          class07686.N("includeSequenceId", BoolArgumentType.bool())
                                             .executes(
                                                var0x -> N(
                                                   (class07701)var0x.getSource(),
                                                   IntegerArgumentType.getInteger(var0x, "seed"),
                                                   BoolArgumentType.getBool(var0x, "includeWorldSeed"),
                                                   BoolArgumentType.getBool(var0x, "includeSequenceId")
                                                )
                                             )
                                       )
                                 )
                           )
                     ))
                  .then(
                     ((RequiredArgumentBuilder)class07686.N("sequence", class07778.N())
                           .suggests(class04180::N)
                           .executes(var0x -> N((class07701)var0x.getSource(), class07778.N(var0x, "sequence"))))
                        .then(
                           ((RequiredArgumentBuilder)class07686.N("seed", IntegerArgumentType.integer())
                                 .executes(
                                    var0x -> N(
                                       (class07701)var0x.getSource(),
                                       class07778.N(var0x, "sequence"),
                                       IntegerArgumentType.getInteger(var0x, "seed"),
                                       true,
                                       true
                                    )
                                 ))
                              .then(
                                 ((RequiredArgumentBuilder)class07686.N("includeWorldSeed", BoolArgumentType.bool())
                                       .executes(
                                          var0x -> N(
                                             (class07701)var0x.getSource(),
                                             class07778.N(var0x, "sequence"),
                                             IntegerArgumentType.getInteger(var0x, "seed"),
                                             BoolArgumentType.getBool(var0x, "includeWorldSeed"),
                                             true
                                          )
                                       ))
                                    .then(
                                       class07686.N("includeSequenceId", BoolArgumentType.bool())
                                          .executes(
                                             var0x -> N(
                                                (class07701)var0x.getSource(),
                                                class07778.N(var0x, "sequence"),
                                                IntegerArgumentType.getInteger(var0x, "seed"),
                                                BoolArgumentType.getBool(var0x, "includeWorldSeed"),
                                                BoolArgumentType.getBool(var0x, "includeSequenceId")
                                             )
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static LiteralArgumentBuilder<class07701> N(String var0, boolean var1) {
      return (LiteralArgumentBuilder<class07701>)class07686.y(var0)
         .then(
            ((RequiredArgumentBuilder)class07686.N("range", class07788.N())
                  .executes(var1x -> N((class07701)var1x.getSource(), class07767.N(var1x, "range"), null, var1)))
               .then(
                  ((RequiredArgumentBuilder)class07686.N("sequence", class07778.N()).suggests(class04180::N).requires(class07686.N(class07686.u)))
                     .executes(var1x -> N((class07701)var1x.getSource(), class07767.N(var1x, "range"), class07778.N(var1x, "sequence"), var1))
               )
         );
   }

   private static int N(class07701 var0, int var1, boolean var2, boolean var3) {
      class03470 class03470 = var0.R().method_52168();
      class03470.N(var1, var2, var3);
      int i = class03470.N();
      var0.N(() -> class00392.N("commands.random.reset.all.success", i), false);
      return i;
   }

   private static int N(class07701 var0) {
      int i = var0.R().method_52168().N();
      var0.N(() -> class00392.N("commands.random.reset.all.success", i), false);
      return i;
   }

   private static int N(class07701 var0, class01894 var1, int var2, boolean var3, boolean var4) throws CommandSyntaxException {
      class04782 class04782 = var0.R();
      class04782.method_52168().N(var1, class04782.method_8412(), var2, var3, var4);
      var0.N(() -> class00392.N("commands.random.reset.success", class00392.N(var1)), false);
      return 1;
   }

   private static int N(class07701 var0, class01894 var1) throws CommandSyntaxException {
      class04782 class04782 = var0.R();
      class04782.method_52168().y(var1, class04782.method_8412());
      var0.N(() -> class00392.N("commands.random.reset.success", class00392.N(var1)), false);
      return 1;
   }

   private static CompletableFuture<Suggestions> N(CommandContext<class07701> var0, SuggestionsBuilder var1) {
      ArrayList arraylist = Lists.newArrayList();
      ((class07701)var0.getSource()).R().method_52168().N((var1x, var2x) -> arraylist.add(var1x.toString()));
      return class07689.y(arraylist, var1);
   }
}
