package minecraft;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
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

public class class05624 {
   private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("commands.trigger.failed.unprimed"));
   private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType(class00392.L("commands.trigger.failed.invalid"));

   public class05624() {
      super();
   }

   private static int y(class07701 var0, class04770 var1, class00518 var2, int var3) throws CommandSyntaxException {
      N(var0.W().yB(), var1, var2).N(var3);
      var0.N(() -> class00392.N("commands.trigger.set.success", var2.B(), var3), true);
      return var3;
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)class07686.y("trigger")
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N("objective", class07794.N())
                        .suggests((var0x, var1) -> N((class07701)var0x.getSource(), var1))
                        .executes(var0x -> N((class07701)var0x.getSource(), ((class07701)var0x.getSource()).Z(), class07794.N(var0x, "objective"))))
                     .then(
                        class07686.y("add")
                           .then(
                              class07686.N("value", IntegerArgumentType.integer())
                                 .executes(
                                    var0x -> N(
                                       (class07701)var0x.getSource(),
                                       ((class07701)var0x.getSource()).Z(),
                                       class07794.N(var0x, "objective"),
                                       IntegerArgumentType.getInteger(var0x, "value")
                                    )
                                 )
                           )
                     ))
                  .then(
                     class07686.y("set")
                        .then(
                           class07686.N("value", IntegerArgumentType.integer())
                              .executes(
                                 var0x -> y(
                                    (class07701)var0x.getSource(),
                                    ((class07701)var0x.getSource()).Z(),
                                    class07794.N(var0x, "objective"),
                                    IntegerArgumentType.getInteger(var0x, "value")
                                 )
                              )
                        )
                  )
            )
      );
   }

   private static int N(class07701 var0, class04770 var1, class00518 var2) throws CommandSyntaxException {
      int i = N(var0.W().yB(), var1, var2).y(1);
      var0.N(() -> class00392.N("commands.trigger.simple.success", var2.B()), true);
      return i;
   }

   private static class01765 N(class06683 var0, class01766 var1, class00518 var2) throws CommandSyntaxException {
      if (var2.u() != class06675.L) {
         throw y.create();
      } else {
         class01788 class01788 = var0.y(var1, var2);
         if (class01788 != null && !class01788.L()) {
            class01765 class01765 = var0.N(var1, var2);
            class01765.i();
            return class01765;
         } else {
            throw N.create();
         }
      }
   }

   public static CompletableFuture<Suggestions> N(class07701 var0, SuggestionsBuilder var1) {
      class07049 class07049 = var0.M();
      ArrayList arraylist = Lists.newArrayList();
      if (class07049 != null) {
         class06394 class06394 = var0.W().yB();

         for (class00518 class00518 : class06394.N()) {
            if (class00518.u() == class06675.L) {
               class01788 class01788 = class06394.y(class07049, class00518);
               if (class01788 != null && !class01788.L()) {
                  arraylist.add(class00518.L());
               }
            }
         }
      }

      return class07689.y(arraylist, var1);
   }

   private static int N(class07701 var0, class04770 var1, class00518 var2, int var3) throws CommandSyntaxException {
      int i = N(var0.W().yB(), var1, var2).y(var3);
      var0.N(() -> class00392.N("commands.trigger.add.success", var2.B(), var3), true);
      return i;
   }
}
