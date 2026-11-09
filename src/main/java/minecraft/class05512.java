package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableInt;

public class class05512 {
   public static final int N = 15;
   public static final int y = 250;
   public static final int L = 10;
   public static final int u = 100;
   private static final int i = 250;
   private static final int R = 1024;
   private static final int M = 3;
   private static final int B = 5;
   private static final int Z = 5;
   private static final int z = 5;
   private static final SimpleCommandExceptionType U = new SimpleCommandExceptionType(class00392.L("commands.test.clear.error.no_tests"));
   private static final SimpleCommandExceptionType E = new SimpleCommandExceptionType(class00392.L("commands.test.reset.error.no_tests"));
   private static final SimpleCommandExceptionType W = new SimpleCommandExceptionType(class00392.L("commands.test.error.test_instance_not_found"));
   private static final SimpleCommandExceptionType m = new SimpleCommandExceptionType(class00392.y("Could not find any structures to export"));
   private static final SimpleCommandExceptionType P = new SimpleCommandExceptionType(class00392.L("commands.test.error.no_test_instances"));
   private static final Dynamic3CommandExceptionType s = new Dynamic3CommandExceptionType(
      (var0, var1, var2) -> class00392.y("commands.test.error.no_test_containing_pos", var0, var1, var2)
   );
   private static final DynamicCommandExceptionType T = new DynamicCommandExceptionType(var0 -> class00392.y("commands.test.error.too_large", var0));

   private static int L(class04283 var0) throws CommandSyntaxException {
      class07701 class07701 = var0.y();
      class04782 class04782 = class07701.R();
      int ix = 0;
      boolean flag = true;

      for (Iterator<class07209> iterator = var0.findTestPos().iterator(); iterator.hasNext(); ix++) {
         class07209 class07209 = iterator.next();
         class00394 class00394 = class04782.method_8321(class07209);
         if (!(class00394 instanceof class08610)) {
            throw W.create();
         }

         if (!((class08610)class00394).L(class07701::N)) {
            flag = false;
         }
      }

      if (ix == 0) {
         throw m.create();
      } else {
         String sx = "Exported " + ix + " structures";
         var0.y().N(() -> class00392.y(sx), true);
         return flag ? 0 : 1;
      }
   }

   public class05512() {
      super();
   }

   private static int i(class04283 var0) throws CommandSyntaxException {
      var0.y().N(class00392.L("commands.test.locate.started"));
      MutableInt mutableint = new MutableInt(0);
      class07209 class07209 = class07209.method_49638(var0.y().i());
      var0.findTestPos()
         .forEach(
            var3x -> {
               if (var0.y().R().method_8321(var3x) instanceof class08610 class08610) {
                  class07211 class07211 = class08610.U().N(class07211.field_11043);
                  class07209 class07209x = class08610.d().method_10079(class07211, 2);
                  int j = (int)class07211.b().U();
                  String sx = String.format(
                     Locale.ROOT, "/tp @s %d %d %d %d 0", class07209x.method_10263(), class07209x.method_10264(), class07209x.method_10260(), j
                  );
                  int k = class07209.method_10263() - var3x.method_10263();
                  int l = class07209.method_10260() - var3x.method_10260();
                  int i1 = class04995.y(class04995.N((float)(k * k + l * l)));
                  class05216 class05216 = class00390.N(
                        (class00392)class00392.N("chat.coordinates", var3x.method_10263(), var3x.method_10264(), var3x.method_10260())
                     )
                     .N(var1xx -> var1xx.N(class06541.field_1060).N(new class00640(sx)).N(new class00401(class00392.L("chat.coordinates.tooltip"))));
                  var0.y().N(() -> class00392.N("commands.test.locate.found", class05216, i1), false);
                  mutableint.increment();
               }
            }
         );
      int ix = mutableint.intValue();
      if (ix == 0) {
         throw P.create();
      } else {
         var0.y().N(() -> class00392.N("commands.test.locate.done", ix), true);
         return ix;
      }
   }

   private static int u(class04283 var0) {
      N();
      class07701 class07701 = var0.y();
      class04782 class04782 = class07701.R();
      class07209 class07209 = N(class07701);
      List list = Stream.concat(N(class07701, class04272.N(), var0), N(class07701, class04272.N(), var0, 0)).toList();
      class00204.y();
      ArrayList arraylist = new ArrayList();

      for (class05513 class05513x : list) {
         for (class06993 class06993 : class06993.values()) {
            ArrayList arraylist1 = new ArrayList();

            for (int ix = 0; ix < 100; ix++) {
               class05513 class05513x = new class05513(class05513x.G(), class06993, class04782, new class04272(1, true));
               class05513x.N(class05513x.L());
               arraylist1.add(class05513x);
            }

            class05531 class05531 = class04265.N(arraylist1, class05513x.t().u(), class06993.ordinal());
            arraylist.add(class05531);
         }
      }

      class04270 class04270 = new class04270(class07209, 10, true);
      class05520 class05520 = class05500.N(arraylist, class04782).N(class04265.N(100)).N((class05516)class04270).N(class04270).N().y().L();
      return N(class07701, class05520);
   }

   private static ArgumentBuilder<class07701, ?> y(ArgumentBuilder<class07701, ?> var0, class08608<CommandContext<class07701>, class04283> var1) {
      return N(
         var0,
         var1,
         var1x -> var1x.then(
            ((RequiredArgumentBuilder)class07686.N("rotationSteps", IntegerArgumentType.integer())
                  .executes(
                     var1xx -> N(
                        (class04283)var1.apply(var1xx),
                        new class04272(IntegerArgumentType.getInteger(var1xx, "numberOfTimes"), BoolArgumentType.getBool(var1xx, "untilFailed")),
                        IntegerArgumentType.getInteger(var1xx, "rotationSteps"),
                        8
                     )
                  ))
               .then(
                  class07686.N("testsPerRow", IntegerArgumentType.integer())
                     .executes(
                        var1xx -> N(
                           (class04283)var1.apply(var1xx),
                           new class04272(IntegerArgumentType.getInteger(var1xx, "numberOfTimes"), BoolArgumentType.getBool(var1xx, "untilFailed")),
                           IntegerArgumentType.getInteger(var1xx, "rotationSteps"),
                           IntegerArgumentType.getInteger(var1xx, "testsPerRow")
                        )
                     )
               )
         )
      );
   }

   private static int y(class04283 var0) throws CommandSyntaxException {
      N();
      class07701 class07701 = var0.y();
      class04782 class04782 = class07701.R();
      List list = var0.findTestPos().flatMap(var1x -> class04782.N(var1x, class00404.field_55993).stream()).toList();

      for (class08610 class08610 : list) {
         class05514.N(class08610.u(), class04782);
         class08610.v();
         class04782.N(class08610.d(), false);
      }

      if (list.isEmpty()) {
         throw U.create();
      } else {
         class07701.N(() -> class00392.N("commands.test.clear.success", list.size()), true);
         return list.size();
      }
   }

   private static Stream<class05513> N(class07701 var0, class04272 var1, class00211 var2, int var3) {
      return var2.findTests()
         .filter(var1x -> N(var0, var1x.N().i()))
         .map(var3x -> new class05513((class03529<class00201>)var3x, class05514.N(var3), var0.R(), var1));
   }

   private static Stream<class05513> N(class07701 var0, class04272 var1, class00226 var2) {
      return var2.findTestPos().map(var2x -> N(var2x, var0, var1)).flatMap(Optional::stream);
   }

   private static Optional<class05513> N(class07209 var0, class07701 var1, class04272 var2) {
      class04782 class04782 = var1.R();
      if (class04782.method_8321(var0) instanceof class08610 class08610) {
         Optional optional = class08610.M().flatMap(var1.t().L(class04227.yt)::N);
         if (optional.isEmpty()) {
            var1.y(class00392.N("commands.test.error.non_existant_test", class08610.B()));
            return Optional.empty();
         } else {
            class03529 class03529 = (class03529)optional.get();
            class05513 class05513 = new class05513(class03529, class08610.U(), class04782, var2);
            class05513.N(var0);
            return !N(var1, class05513.v()) ? Optional.empty() : Optional.of(class05513);
         }
      } else {
         var1.y(class00392.N("commands.test.error.test_instance_not_found.position", var0.method_10263(), var0.method_10264(), var0.method_10260()));
         return Optional.empty();
      }
   }

   private static int N(class04283 var0) throws CommandSyntaxException {
      N();
      int ix = N(var0.y(), class04272.N(), var0).map(var1x -> N(var0.y(), var1x)).toList().size();
      if (ix == 0) {
         throw U.create();
      } else {
         var0.y().N(() -> class00392.N("commands.test.reset.success", ix), true);
         return ix;
      }
   }

   public static void N(CommandDispatcher<class07701> var0, class04348 var1) {
      ArgumentBuilder<class07701, ?> argumentbuilder = y(
         class07686.N("onlyRequiredTests", BoolArgumentType.bool()), var0x -> class04283.N().N(var0x, BoolArgumentType.getBool(var0x, "onlyRequiredTests"))
      );
      LiteralArgumentBuilder<class07701> literalargumentbuilder = (LiteralArgumentBuilder<class07701>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y(
                                                               "test"
                                                            )
                                                            .requires(class07686.N(class07686.u)))
                                                         .then(
                                                            class07686.y("run")
                                                               .then(
                                                                  y(
                                                                     class07686.N("tests", class00202.N(var1, class04227.yt)),
                                                                     var0x -> class04283.N().N(var0x, class00202.N(var0x, "tests"))
                                                                  )
                                                               )
                                                         ))
                                                      .then(
                                                         class07686.y("runmultiple")
                                                            .then(
                                                               ((RequiredArgumentBuilder)class07686.N("tests", class00202.N(var1, class04227.yt))
                                                                     .executes(
                                                                        var0x -> N(class04283.N().N(var0x, class00202.N(var0x, "tests")), class04272.N(), 0, 8)
                                                                     ))
                                                                  .then(
                                                                     class07686.N("amount", IntegerArgumentType.integer())
                                                                        .executes(
                                                                           var0x -> N(
                                                                              class04283.N()
                                                                                 .N(IntegerArgumentType.getInteger(var0x, "amount"))
                                                                                 .N(var0x, class00202.N(var0x, "tests")),
                                                                              class04272.N(),
                                                                              0,
                                                                              8
                                                                           )
                                                                        )
                                                                  )
                                                            )
                                                      ))
                                                   .then(N(class07686.y("runthese"), class04283.N()::y)))
                                                .then(N(class07686.y("runclosest"), class04283.N()::N)))
                                             .then(N(class07686.y("runthat"), class04283.N()::L)))
                                          .then(y(class07686.y("runfailed").then(argumentbuilder), class04283.N()::u)))
                                       .then(
                                          class07686.y("verify")
                                             .then(
                                                class07686.N("tests", class00202.N(var1, class04227.yt))
                                                   .executes(var0x -> u(class04283.N().N(var0x, class00202.N(var0x, "tests"))))
                                             )
                                       ))
                                    .then(
                                       class07686.y("locate")
                                          .then(
                                             class07686.N("tests", class00202.N(var1, class04227.yt))
                                                .executes(var0x -> i(class04283.N().N(var0x, class00202.N(var0x, "tests"))))
                                          )
                                    ))
                                 .then(class07686.y("resetclosest").executes(var0x -> N(class04283.N().N(var0x)))))
                              .then(class07686.y("resetthese").executes(var0x -> N(class04283.N().y(var0x)))))
                           .then(class07686.y("resetthat").executes(var0x -> N(class04283.N().L(var0x)))))
                        .then(class07686.y("clearthat").executes(var0x -> y(class04283.N().L(var0x)))))
                     .then(class07686.y("clearthese").executes(var0x -> y(class04283.N().y(var0x)))))
                  .then(
                     ((LiteralArgumentBuilder)class07686.y("clearall").executes(var0x -> y(class04283.N().N(var0x, 250))))
                        .then(
                           class07686.N("radius", IntegerArgumentType.integer())
                              .executes(var0x -> y(class04283.N().N(var0x, class04995.N(IntegerArgumentType.getInteger(var0x, "radius"), 0, 1024))))
                        )
                  ))
               .then(class07686.y("stop").executes(var0x -> N())))
            .then(
               ((LiteralArgumentBuilder)class07686.y("pos").executes(var0x -> N((class07701)var0x.getSource(), "pos")))
                  .then(
                     class07686.N("var", StringArgumentType.word())
                        .executes(var0x -> N((class07701)var0x.getSource(), StringArgumentType.getString(var0x, "var")))
                  )
            ))
         .then(
            class07686.y("create")
               .then(
                  ((RequiredArgumentBuilder)class07686.N("id", class07778.N())
                        .suggests(class05512::N)
                        .executes(var0x -> N((class07701)var0x.getSource(), class07778.N(var0x, "id"), 5, 5, 5)))
                     .then(
                        ((RequiredArgumentBuilder)class07686.N("width", IntegerArgumentType.integer())
                              .executes(
                                 var0x -> N(
                                    (class07701)var0x.getSource(),
                                    class07778.N(var0x, "id"),
                                    IntegerArgumentType.getInteger(var0x, "width"),
                                    IntegerArgumentType.getInteger(var0x, "width"),
                                    IntegerArgumentType.getInteger(var0x, "width")
                                 )
                              ))
                           .then(
                              class07686.N("height", IntegerArgumentType.integer())
                                 .then(
                                    class07686.N("depth", IntegerArgumentType.integer())
                                       .executes(
                                          var0x -> N(
                                             (class07701)var0x.getSource(),
                                             class07778.N(var0x, "id"),
                                             IntegerArgumentType.getInteger(var0x, "width"),
                                             IntegerArgumentType.getInteger(var0x, "height"),
                                             IntegerArgumentType.getInteger(var0x, "depth")
                                          )
                                       )
                                 )
                           )
                     )
               )
         );
      if (class07529.ND) {
         literalargumentbuilder = (LiteralArgumentBuilder<class07701>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)literalargumentbuilder.then(
                     class07686.y("export")
                        .then(
                           class07686.N("test", class03784.N(var1, class04227.yt))
                              .executes(var0x -> N((class07701)var0x.getSource(), (class03556<class00201>)class03784.N(var0x, "test", class04227.yt)))
                        )
                  ))
                  .then(class07686.y("exportclosest").executes(var0x -> L(class04283.N().N(var0x)))))
               .then(class07686.y("exportthese").executes(var0x -> L(class04283.N().y(var0x)))))
            .then(class07686.y("exportthat").executes(var0x -> L(class04283.N().L(var0x))));
      }

      var0.register(literalargumentbuilder);
   }

   private static ArgumentBuilder<class07701, ?> N(ArgumentBuilder<class07701, ?> var0, class08608<CommandContext<class07701>, class04283> var1) {
      return N(var0, var1, var0x -> var0x);
   }

   private static int N(class07701 var0, class05513 var1) {
      var1.R().N(var0::N);
      return 1;
   }

   public static CompletableFuture<Suggestions> N(CommandContext<class07701> var0, SuggestionsBuilder var1) {
      return class07689.y(((class07701)var0.getSource()).t().L(class04227.NJ).z().map(class03556::M), var1);
   }

   private static int N(class04283 var0, class04272 var1, int var2, int var3) {
      N();
      class07701 class07701 = var0.y();
      class04782 class04782 = class07701.R();
      class07209 class07209 = N(class07701);
      List list = Stream.concat(N(class07701, var1, var0), N(class07701, var1, var0, var2)).toList();
      if (list.isEmpty()) {
         class07701.N(() -> class00392.L("commands.test.no_tests"), false);
         return 0;
      } else {
         class00204.y();
         class07701.N(() -> class00392.N("commands.test.run.running", list.size()), false);
         class05520 class05520 = class05500.y(list, class04782).N((class05516)(new class04270(class07209, var3, false))).L();
         return N(class07701, class05520);
      }
   }

   private static int N() {
      class05492.N.N();
      return 1;
   }

   private static int N(class07701 var0, String var1) throws CommandSyntaxException {
      class04770 class04770 = var0.Z();
      class07209 class07209xx = ((class06183)class04770.method_5745(10.0, 1.0F, false)).u();
      class04782 class04782 = var0.R();
      Optional<class07209> optional = class05514.N(class07209xx, 15, class04782);
      if (optional.isEmpty()) {
         optional = class05514.N(class07209xx, 250, class04782);
      }

      if (optional.isEmpty()) {
         throw s.create(class07209xx.method_10263(), class07209xx.method_10264(), class07209xx.method_10260());
      } else if (class04782.method_8321(optional.get()) instanceof class08610 class08610) {
         class07209 class07209x = class08610.s();
         class07209 class07209xx = class07209xx.method_10059(class07209x);
         String sx = class07209xx.method_10263() + ", " + class07209xx.method_10264() + ", " + class07209xx.method_10260();
         String s1 = class08610.B().getString();
         class05216 class05216 = class00392.N(
               "commands.test.coordinates", class07209xx.method_10263(), class07209xx.method_10264(), class07209xx.method_10260()
            )
            .y(
               class00405.N
                  .N(true)
                  .N(class06541.field_1060)
                  .N(new class00401(class00392.L("commands.test.coordinates.copy")))
                  .N(new class00627("final BlockPos " + var1 + " = new BlockPos(" + sx + ");"))
            );
         var0.N(() -> class00392.N("commands.test.relative_position", s1, class05216), false);
         class04770.field_13987.method_14364(new class00444(class07209xx, class07209xx));
         return 1;
      } else {
         throw W.create();
      }
   }

   private static int N(class07701 var0, class01894 var1, int var2, int var3, int var4) throws CommandSyntaxException {
      if (var2 <= 48 && var3 <= 48 && var4 <= 48) {
         class04782 class04782 = var0.R();
         class07209 class07209xx = N(var0);
         class08610 class08610 = class05514.N(var1, class07209xx, new class00753(var2, var3, var4), class06993.field_11467, class04782);
         class07209 class07209x = class08610.s();
         class07209 class07209xx = class07209x.method_10069(var2 - 1, 0, var4 - 1);
         class07209.method_20437(class07209x, class07209xx).forEach(var1x -> class04782.method_8501(var1x, class00869.q.W()));
         var0.N(() -> class00392.N("commands.test.create.success", class08610.B()), true);
         return 1;
      } else {
         throw T.create(48);
      }
   }

   private static ArgumentBuilder<class07701, ?> N(
      ArgumentBuilder<class07701, ?> var0,
      class08608<CommandContext<class07701>, class04283> var1,
      Function<ArgumentBuilder<class07701, ?>, ArgumentBuilder<class07701, ?>> var2
   ) {
      return var0.executes(var1x -> N((class04283)var1.apply(var1x), class04272.N(), 0, 8))
         .then(
            ((RequiredArgumentBuilder)class07686.N("numberOfTimes", IntegerArgumentType.integer(0))
                  .executes(var1x -> N((class04283)var1.apply(var1x), new class04272(IntegerArgumentType.getInteger(var1x, "numberOfTimes"), false), 0, 8)))
               .then(
                  (ArgumentBuilder)var2.apply(
                     class07686.N("untilFailed", BoolArgumentType.bool())
                        .executes(
                           var1x -> N(
                              (class04283)var1.apply(var1x),
                              new class04272(IntegerArgumentType.getInteger(var1x, "numberOfTimes"), BoolArgumentType.getBool(var1x, "untilFailed")),
                              0,
                              8
                           )
                        )
                  )
               )
         );
   }

   private static class07209 N(class07701 var0) {
      class07209 class07209 = class07209.method_49638(var0.i());
      int ix = var0.R().N(class07830.field_13202, class07209).method_10264();
      return new class07209(class07209.method_10263(), ix, class07209.method_10260() + 3);
   }

   private static boolean N(class07701 var0, class01894 var1) {
      if (var0.R().method_14183().y(var1).isEmpty()) {
         var0.y(class00392.N("commands.test.error.structure_not_found", class00392.N(var1)));
         return false;
      } else {
         return true;
      }
   }

   private static int N(class07701 var0, class03556<class00201> var1) {
      return !class08610.N(var0.R(), ((class00201)var1.N()).i(), var0::N) ? 0 : 1;
   }

   public static int N(class07701 var0, class05520 var1) {
      var1.N(new class05510(var0));
      class05494 class05494 = new class05494(var1.N());
      class05494.N(new class05507(var0, class05494));
      class05494.N(var0x -> class00204.N(var0x.G()));
      var1.y();
      return 1;
   }
}
