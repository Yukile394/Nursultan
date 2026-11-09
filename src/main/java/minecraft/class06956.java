package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;

public class class06956 {
   private static final DynamicCommandExceptionType L = new DynamicCommandExceptionType(var0 -> class00392.y("commands.stopwatch.already_exists", var0));
   public static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(var0 -> class00392.y("commands.stopwatch.does_not_exist", var0));
   public static final SuggestionProvider<class07701> y = (var0, var1) -> class07689.N(((class07701)var0.getSource()).W().yz().N(), var1);

   private static int L(class07701 var0, class01894 var1) throws CommandSyntaxException {
      if (!var0.W().yz().y(var1)) {
         throw N.create(var1);
      } else {
         var0.N(() -> class00392.N("commands.stopwatch.remove.success", class00392.N(var1)), true);
         return 1;
      }
   }

   public class06956() {
      super();
   }

   private static int y(class07701 var0, class01894 var1) throws CommandSyntaxException {
      if (!var0.W().yz().N(var1, var0x -> new class08192(class08170.y()))) {
         throw N.create(var1);
      } else {
         var0.N(() -> class00392.N("commands.stopwatch.restart.success", class00392.N(var1)), true);
         return 1;
      }
   }

   private static int N(class07701 var0, class01894 var1) throws CommandSyntaxException {
      class08170 class08170 = var0.W().yz();
      class08192 class08192 = new class08192(class08170.y());
      if (!class08170.N(var1, class08192)) {
         throw L.create(var1);
      } else {
         var0.N(() -> class00392.N("commands.stopwatch.create.success", class00392.N(var1)), true);
         return 1;
      }
   }

   private static int N(class07701 var0, class01894 var1, double var2) throws CommandSyntaxException {
      class08192 class08192 = var0.W().yz().N(var1);
      if (class08192 == null) {
         throw N.create(var1);
      } else {
         long i = class08170.y();
         double d0 = class08192.y(i);
         var0.N(() -> class00392.N("commands.stopwatch.query", class00392.N(var1), d0), true);
         return (int)(d0 * var2);
      }
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("stopwatch")
                        .requires(class07686.N(class07686.u)))
                     .then(
                        class07686.y("create")
                           .then(class07686.N("id", class07778.N()).executes(var0x -> N((class07701)var0x.getSource(), class07778.N(var0x, "id"))))
                     ))
                  .then(
                     class07686.y("query")
                        .then(
                           ((RequiredArgumentBuilder)class07686.N("id", class07778.N())
                                 .suggests(y)
                                 .then(
                                    class07686.N("scale", DoubleArgumentType.doubleArg())
                                       .executes(
                                          var0x -> N((class07701)var0x.getSource(), class07778.N(var0x, "id"), DoubleArgumentType.getDouble(var0x, "scale"))
                                       )
                                 ))
                              .executes(var0x -> N((class07701)var0x.getSource(), class07778.N(var0x, "id"), 1.0))
                        )
                  ))
               .then(
                  class07686.y("restart")
                     .then(class07686.N("id", class07778.N()).suggests(y).executes(var0x -> y((class07701)var0x.getSource(), class07778.N(var0x, "id"))))
               ))
            .then(
               class07686.y("remove")
                  .then(class07686.N("id", class07778.N()).suggests(y).executes(var0x -> L((class07701)var0x.getSource(), class07778.N(var0x, "id"))))
            )
      );
   }
}
