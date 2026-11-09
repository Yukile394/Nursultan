package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Optional;

public class class03186 {
   private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("commands.place.feature.failed"));
   private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType(class00392.L("commands.place.jigsaw.failed"));
   private static final SimpleCommandExceptionType L = new SimpleCommandExceptionType(class00392.L("commands.place.structure.failed"));
   private static final DynamicCommandExceptionType u = new DynamicCommandExceptionType(var0 -> class00392.y("commands.place.template.invalid", var0));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(class00392.L("commands.place.template.failed"));
   private static final SuggestionProvider<class07701> R = (var0, var1) -> class07689.N(((class07701)var0.getSource()).R().method_14183().N(), var1);

   public class03186() {
      super();
   }

   public static int y(class07701 var0, class03529<class04748> var1, class07209 var2) throws CommandSyntaxException {
      class04782 class04782 = var0.R();
      class04748 class04748 = (class04748)var1.N();
      class08088 class08088 = class04782.method_14178().U();
      class04932 class04932 = class04748.N(
         var1,
         class04782.method_27983(),
         var0.t(),
         class08088,
         class08088.u(),
         class04782.method_14178().W(),
         class04782.method_14183(),
         class04782.method_8412(),
         new class07321(var2),
         0,
         class04782,
         var0x -> true
      );
      if (!class04932.y()) {
         throw L.create();
      } else {
         class05163 class05163 = class04932.N();
         class07321 class07321x = new class07321(class01296.N(class05163.B()), class01296.N(class05163.z()));
         class07321 class07321x = new class07321(class01296.N(class05163.U()), class01296.N(class05163.W()));
         N(class04782, class07321x, class07321x);
         class07321.N(class07321x, class07321x)
            .forEach(
               var3x -> class04932.N(
                  class04782,
                  class04782.method_27056(),
                  class08088,
                  class04782.method_8409(),
                  new class05163(var3x.i(), class04782.method_31607(), var3x.R(), var3x.M(), class04782.method_31600() + 1, var3x.B()),
                  var3x
               )
            );
         String s = var1.B().N().toString();
         var0.N(() -> class00392.N("commands.place.structure.success", s, var2.method_10263(), var2.method_10264(), var2.method_10260()), true);
         return 1;
      }
   }

   private static void N(class04782 var0, class07321 var1, class07321 var2) throws CommandSyntaxException {
      if (class07321.N(var1, var2).filter(var1x -> !var0.method_8477(var1x.W())).findAny().isPresent()) {
         throw class00894.N.create();
      }
   }

   public static int N(class07701 var0, class01894 var1, class07209 var2, class06993 var3, class07111 var4, float var5, int var6, boolean var7) throws CommandSyntaxException {
      class04782 class04782 = var0.R();
      class01224 class01224 = class04782.method_14183();

      Optional<class01207> optional;
      try {
         optional = class01224.y(var1);
      } catch (class00719 class00719) {
         throw u.create(var1);
      }

      if (optional.isEmpty()) {
         throw u.create(var1);
      } else {
         class01207 class01207 = optional.get();
         N(class04782, new class07321(var2), new class07321(var2.method_10081(class01207.N())));
         class01233 class01233 = new class01233().N(var4).N(var3).y(var7);
         if (var5 < 1.0F) {
            class01233.y().N(new class01201(var5)).N(class07253.y(var6));
         }

         if (!class01207.N(class04782, var2, var2, class01233, class07253.y(var6), 2 | (var7 ? 816 : 0))) {
            throw i.create();
         } else {
            var0.N(
               () -> class00392.N("commands.place.template.success", class00392.N(var1), var2.method_10263(), var2.method_10264(), var2.method_10260()), true
            );
            return 1;
         }
      }
   }

   public static int N(class07701 var0, class03529<class03238<?, ?>> var1, class07209 var2) throws CommandSyntaxException {
      class04782 class04782 = var0.R();
      class03238 class03238 = (class03238)var1.N();
      class07321 class07321 = new class07321(var2);
      N(class04782, new class07321(class07321.B - 1, class07321.Z - 1), new class07321(class07321.B + 1, class07321.Z + 1));
      if (!class03238.N(class04782, class04782.method_14178().U(), class04782.method_8409(), var2)) {
         throw N.create();
      } else {
         String s = var1.B().N().toString();
         var0.N(() -> class00392.N("commands.place.feature.success", s, var2.method_10263(), var2.method_10264(), var2.method_10260()), true);
         return 1;
      }
   }

   public static int N(class07701 var0, class03556<class05281> var1, class01894 var2, int var3, class07209 var4) throws CommandSyntaxException {
      class04782 class04782 = var0.R();
      class07321 class07321 = new class07321(var4);
      N(class04782, class07321, class07321);
      if (!class04848.N(class04782, var1, var2, var3, var4, false)) {
         throw y.create();
      } else {
         var0.N(() -> class00392.N("commands.place.jigsaw.success", var4.method_10263(), var4.method_10264(), var4.method_10260()), true);
         return 1;
      }
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("place")
                        .requires(class07686.N(class07686.u)))
                     .then(
                        class07686.y("feature")
                           .then(
                              ((RequiredArgumentBuilder)class07686.N("feature", class04403.N(class04227.Nh))
                                    .executes(
                                       var0x -> N(
                                          (class07701)var0x.getSource(),
                                          class04403.N(var0x, "feature"),
                                          class07209.method_49638(((class07701)var0x.getSource()).i())
                                       )
                                    ))
                                 .then(
                                    class07686.N("pos", class00894.N())
                                       .executes(var0x -> N((class07701)var0x.getSource(), class04403.N(var0x, "feature"), class00894.N(var0x, "pos")))
                                 )
                           )
                     ))
                  .then(
                     class07686.y("jigsaw")
                        .then(
                           class07686.N("pool", class04403.N(class04227.yv))
                              .then(
                                 class07686.N("target", class07778.N())
                                    .then(
                                       ((RequiredArgumentBuilder)class07686.N("max_depth", IntegerArgumentType.integer(1, 20))
                                             .executes(
                                                var0x -> N(
                                                   (class07701)var0x.getSource(),
                                                   class04403.L(var0x, "pool"),
                                                   class07778.N(var0x, "target"),
                                                   IntegerArgumentType.getInteger(var0x, "max_depth"),
                                                   class07209.method_49638(((class07701)var0x.getSource()).i())
                                                )
                                             ))
                                          .then(
                                             class07686.N("position", class00894.N())
                                                .executes(
                                                   var0x -> N(
                                                      (class07701)var0x.getSource(),
                                                      class04403.L(var0x, "pool"),
                                                      class07778.N(var0x, "target"),
                                                      IntegerArgumentType.getInteger(var0x, "max_depth"),
                                                      class00894.N(var0x, "position")
                                                   )
                                                )
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  class07686.y("structure")
                     .then(
                        ((RequiredArgumentBuilder)class07686.N("structure", class04403.N(class04227.yj))
                              .executes(
                                 var0x -> y(
                                    (class07701)var0x.getSource(),
                                    class04403.y(var0x, "structure"),
                                    class07209.method_49638(((class07701)var0x.getSource()).i())
                                 )
                              ))
                           .then(
                              class07686.N("pos", class00894.N())
                                 .executes(var0x -> y((class07701)var0x.getSource(), class04403.y(var0x, "structure"), class00894.N(var0x, "pos")))
                           )
                     )
               ))
            .then(
               class07686.y("template")
                  .then(
                     ((RequiredArgumentBuilder)class07686.N("template", class07778.N())
                           .suggests(R)
                           .executes(
                              var0x -> N(
                                 (class07701)var0x.getSource(),
                                 class07778.N(var0x, "template"),
                                 class07209.method_49638(((class07701)var0x.getSource()).i()),
                                 class06993.field_11467,
                                 class07111.field_11302,
                                 1.0F,
                                 0,
                                 false
                              )
                           ))
                        .then(
                           ((RequiredArgumentBuilder)class07686.N("pos", class00894.N())
                                 .executes(
                                    var0x -> N(
                                       (class07701)var0x.getSource(),
                                       class07778.N(var0x, "template"),
                                       class00894.N(var0x, "pos"),
                                       class06993.field_11467,
                                       class07111.field_11302,
                                       1.0F,
                                       0,
                                       false
                                    )
                                 ))
                              .then(
                                 ((RequiredArgumentBuilder)class07686.N("rotation", class03935.N())
                                       .executes(
                                          var0x -> N(
                                             (class07701)var0x.getSource(),
                                             class07778.N(var0x, "template"),
                                             class00894.N(var0x, "pos"),
                                             class03935.N(var0x, "rotation"),
                                             class07111.field_11302,
                                             1.0F,
                                             0,
                                             false
                                          )
                                       ))
                                    .then(
                                       ((RequiredArgumentBuilder)class07686.N("mirror", class03966.N())
                                             .executes(
                                                var0x -> N(
                                                   (class07701)var0x.getSource(),
                                                   class07778.N(var0x, "template"),
                                                   class00894.N(var0x, "pos"),
                                                   class03935.N(var0x, "rotation"),
                                                   class03966.N(var0x, "mirror"),
                                                   1.0F,
                                                   0,
                                                   false
                                                )
                                             ))
                                          .then(
                                             ((RequiredArgumentBuilder)class07686.N("integrity", FloatArgumentType.floatArg(0.0F, 1.0F))
                                                   .executes(
                                                      var0x -> N(
                                                         (class07701)var0x.getSource(),
                                                         class07778.N(var0x, "template"),
                                                         class00894.N(var0x, "pos"),
                                                         class03935.N(var0x, "rotation"),
                                                         class03966.N(var0x, "mirror"),
                                                         FloatArgumentType.getFloat(var0x, "integrity"),
                                                         0,
                                                         false
                                                      )
                                                   ))
                                                .then(
                                                   ((RequiredArgumentBuilder)class07686.N("seed", IntegerArgumentType.integer())
                                                         .executes(
                                                            var0x -> N(
                                                               (class07701)var0x.getSource(),
                                                               class07778.N(var0x, "template"),
                                                               class00894.N(var0x, "pos"),
                                                               class03935.N(var0x, "rotation"),
                                                               class03966.N(var0x, "mirror"),
                                                               FloatArgumentType.getFloat(var0x, "integrity"),
                                                               IntegerArgumentType.getInteger(var0x, "seed"),
                                                               false
                                                            )
                                                         ))
                                                      .then(
                                                         class07686.y("strict")
                                                            .executes(
                                                               var0x -> N(
                                                                  (class07701)var0x.getSource(),
                                                                  class07778.N(var0x, "template"),
                                                                  class00894.N(var0x, "pos"),
                                                                  class03935.N(var0x, "rotation"),
                                                                  class03966.N(var0x, "mirror"),
                                                                  FloatArgumentType.getFloat(var0x, "integrity"),
                                                                  IntegerArgumentType.getInteger(var0x, "seed"),
                                                                  true
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
}
