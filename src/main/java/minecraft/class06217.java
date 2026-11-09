package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import java.util.Optional;

public class class06217 {
   private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("commands.schedule.same_tick"));
   private static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(var0 -> class00392.y("commands.schedule.cleared.failure", var0));
   private static final SimpleCommandExceptionType L = new SimpleCommandExceptionType(class00392.y("commands.schedule.macro"));
   private static final SuggestionProvider<class07701> u = (var0, var1) -> class07689.y(((class07701)var0.getSource()).W().yn().o().b().N(), var1);

   public class06217() {
      super();
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("schedule").requires(class07686.N(class07686.u)))
               .then(
                  class07686.y("function")
                     .then(
                        class07686.N("function", class06808.N())
                           .suggests(class01568.L)
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N("time", class07798.N())
                                       .executes(
                                          var0x -> N(
                                             (class07701)var0x.getSource(),
                                             class06808.y(var0x, "function"),
                                             IntegerArgumentType.getInteger(var0x, "time"),
                                             true
                                          )
                                       ))
                                    .then(
                                       class07686.y("append")
                                          .executes(
                                             var0x -> N(
                                                (class07701)var0x.getSource(),
                                                class06808.y(var0x, "function"),
                                                IntegerArgumentType.getInteger(var0x, "time"),
                                                false
                                             )
                                          )
                                    ))
                                 .then(
                                    class07686.y("replace")
                                       .executes(
                                          var0x -> N(
                                             (class07701)var0x.getSource(),
                                             class06808.y(var0x, "function"),
                                             IntegerArgumentType.getInteger(var0x, "time"),
                                             true
                                          )
                                       )
                                 )
                           )
                     )
               ))
            .then(
               class07686.y("clear")
                  .then(
                     class07686.N("function", StringArgumentType.greedyString())
                        .suggests(u)
                        .executes(var0x -> N((class07701)var0x.getSource(), StringArgumentType.getString(var0x, "function")))
                  )
            )
      );
   }

   private static int N(class07701 var0, Pair<class01894, Either<class07684<class07701>, Collection<class07684<class07701>>>> var1, int var2, boolean var3) throws CommandSyntaxException {
      if (var2 == 0) {
         throw N.create();
      } else {
         long i = var0.R().N() + var2;
         class01894 class01894 = (class01894)var1.getFirst();
         class00754<class02796> class00754 = var0.W().yn().o().b();
         Optional optional = ((Either)var1.getSecond()).left();
         if (optional.isPresent()) {
            if (optional.get() instanceof class01859) {
               throw L.create();
            }

            String s = class01894.toString();
            if (var3) {
               class00754.N(s);
            }

            class00754.N(s, i, new class06779(class01894));
            var0.N(() -> class00392.N("commands.schedule.created.function", class00392.N(class01894), var2, i), true);
         } else {
            String s1 = "#" + class01894;
            if (var3) {
               class00754.N(s1);
            }

            class00754.N(s1, i, new class06809(class01894));
            var0.N(() -> class00392.N("commands.schedule.created.tag", class00392.N(class01894), var2, i), true);
         }

         return Math.floorMod(i, Integer.MAX_VALUE);
      }
   }

   private static int N(class07701 var0, String var1) throws CommandSyntaxException {
      int i = var0.W().yn().o().b().N(var1);
      if (i == 0) {
         throw y.create(var1);
      } else {
         var0.N(() -> class00392.N("commands.schedule.cleared.success", i, var1), true);
         return i;
      }
   }
}
