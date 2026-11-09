package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.stream.Stream;

public class class05195 {
   private static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(var0 -> class00392.y("commands.attribute.failed.entity", var0));
   private static final Dynamic2CommandExceptionType y = new Dynamic2CommandExceptionType(
      (var0, var1) -> class00392.y("commands.attribute.failed.no_attribute", var0, var1)
   );
   private static final Dynamic3CommandExceptionType L = new Dynamic3CommandExceptionType(
      (var0, var1, var2) -> class00392.y("commands.attribute.failed.no_modifier", var1, var0, var2)
   );
   private static final Dynamic3CommandExceptionType u = new Dynamic3CommandExceptionType(
      (var0, var1, var2) -> class00392.y("commands.attribute.failed.modifier_already_present", var2, var1, var0)
   );

   private static int L(class07701 var0, class07049 var1, class03556<class07468> var2, double var3) throws CommandSyntaxException {
      N(var1, var2).N(var3);
      var0.N(() -> class00392.N("commands.attribute.base_value.set.success", N(var2), var1.method_5477(), var3), false);
      return 1;
   }

   private static Stream<class01894> L(class07049 var0, class03556<class07468> var1) throws CommandSyntaxException {
      return N(var0, var1).L().stream().map(class07471::N);
   }

   public class05195() {
      super();
   }

   private static class07438 y(class07049 var0, class03556<class07468> var1) throws CommandSyntaxException {
      class07438 class07438 = N(var0);
      if (!class07438.method_6127().y(var1)) {
         throw y.create(var0.method_5477(), N(var1));
      } else {
         return class07438;
      }
   }

   private static int y(class07701 var0, class07049 var1, class03556<class07468> var2, double var3) throws CommandSyntaxException {
      double d0 = y(var1, var2).method_45326(var2);
      var0.N(() -> class00392.N("commands.attribute.base_value.get.success", N(var2), var1.method_5477(), d0), false);
      return (int)(d0 * var3);
   }

   public static void N(CommandDispatcher<class07701> var0, class04348 var1) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("attribute").requires(class07686.N(class07686.u)))
            .then(
               class07686.N("target", class07680.N())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N("attribute", class03784.N(var1, class04227.L))
                              .then(
                                 ((LiteralArgumentBuilder)class07686.y("get")
                                       .executes(
                                          var0x -> N((class07701)var0x.getSource(), class07680.N(var0x, "target"), class03784.N(var0x, "attribute"), 1.0)
                                       ))
                                    .then(
                                       class07686.N("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             var0x -> N(
                                                (class07701)var0x.getSource(),
                                                class07680.N(var0x, "target"),
                                                class03784.N(var0x, "attribute"),
                                                DoubleArgumentType.getDouble(var0x, "scale")
                                             )
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("base")
                                       .then(
                                          class07686.y("set")
                                             .then(
                                                class07686.N("value", DoubleArgumentType.doubleArg())
                                                   .executes(
                                                      var0x -> L(
                                                         (class07701)var0x.getSource(),
                                                         class07680.N(var0x, "target"),
                                                         class03784.N(var0x, "attribute"),
                                                         DoubleArgumentType.getDouble(var0x, "value")
                                                      )
                                                   )
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)class07686.y("get")
                                             .executes(
                                                var0x -> y((class07701)var0x.getSource(), class07680.N(var0x, "target"), class03784.N(var0x, "attribute"), 1.0)
                                             ))
                                          .then(
                                             class07686.N("scale", DoubleArgumentType.doubleArg())
                                                .executes(
                                                   var0x -> y(
                                                      (class07701)var0x.getSource(),
                                                      class07680.N(var0x, "target"),
                                                      class03784.N(var0x, "attribute"),
                                                      DoubleArgumentType.getDouble(var0x, "scale")
                                                   )
                                                )
                                          )
                                    ))
                                 .then(
                                    class07686.y("reset")
                                       .executes(var0x -> N((class07701)var0x.getSource(), class07680.N(var0x, "target"), class03784.N(var0x, "attribute")))
                                 )
                           ))
                        .then(
                           ((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("modifier")
                                    .then(
                                       class07686.y("add")
                                          .then(
                                             class07686.N("id", class07778.N())
                                                .then(
                                                   ((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N("value", DoubleArgumentType.doubleArg())
                                                            .then(
                                                               class07686.y("add_value")
                                                                  .executes(
                                                                     var0x -> N(
                                                                        (class07701)var0x.getSource(),
                                                                        class07680.N(var0x, "target"),
                                                                        class03784.N(var0x, "attribute"),
                                                                        class07778.N(var0x, "id"),
                                                                        DoubleArgumentType.getDouble(var0x, "value"),
                                                                        class07463.field_6328
                                                                     )
                                                                  )
                                                            ))
                                                         .then(
                                                            class07686.y("add_multiplied_base")
                                                               .executes(
                                                                  var0x -> N(
                                                                     (class07701)var0x.getSource(),
                                                                     class07680.N(var0x, "target"),
                                                                     class03784.N(var0x, "attribute"),
                                                                     class07778.N(var0x, "id"),
                                                                     DoubleArgumentType.getDouble(var0x, "value"),
                                                                     class07463.field_6330
                                                                  )
                                                               )
                                                         ))
                                                      .then(
                                                         class07686.y("add_multiplied_total")
                                                            .executes(
                                                               var0x -> N(
                                                                  (class07701)var0x.getSource(),
                                                                  class07680.N(var0x, "target"),
                                                                  class03784.N(var0x, "attribute"),
                                                                  class07778.N(var0x, "id"),
                                                                  DoubleArgumentType.getDouble(var0x, "value"),
                                                                  class07463.field_6331
                                                               )
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    class07686.y("remove")
                                       .then(
                                          class07686.N("id", class07778.N())
                                             .suggests(
                                                (var0x, var1x) -> class07689.N(L(class07680.N(var0x, "target"), class03784.N(var0x, "attribute")), var1x)
                                             )
                                             .executes(
                                                var0x -> N(
                                                   (class07701)var0x.getSource(),
                                                   class07680.N(var0x, "target"),
                                                   class03784.N(var0x, "attribute"),
                                                   class07778.N(var0x, "id")
                                                )
                                             )
                                       )
                                 ))
                              .then(
                                 class07686.y("value")
                                    .then(
                                       class07686.y("get")
                                          .then(
                                             ((RequiredArgumentBuilder)class07686.N("id", class07778.N())
                                                   .suggests(
                                                      (var0x, var1x) -> class07689.N(L(class07680.N(var0x, "target"), class03784.N(var0x, "attribute")), var1x)
                                                   )
                                                   .executes(
                                                      var0x -> N(
                                                         (class07701)var0x.getSource(),
                                                         class07680.N(var0x, "target"),
                                                         class03784.N(var0x, "attribute"),
                                                         class07778.N(var0x, "id"),
                                                         1.0
                                                      )
                                                   ))
                                                .then(
                                                   class07686.N("scale", DoubleArgumentType.doubleArg())
                                                      .executes(
                                                         var0x -> N(
                                                            (class07701)var0x.getSource(),
                                                            class07680.N(var0x, "target"),
                                                            class03784.N(var0x, "attribute"),
                                                            class07778.N(var0x, "id"),
                                                            DoubleArgumentType.getDouble(var0x, "scale")
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

   private static int N(class07701 var0, class07049 var1, class03556<class07468> var2, class01894 var3, double var4) throws CommandSyntaxException {
      class05320 class05320 = y(var1, var2).method_6127();
      if (!class05320.N(var2, var3)) {
         throw L.create(var1.method_5477(), N(var2), var3);
      } else {
         double d0 = class05320.y(var2, var3);
         var0.N(() -> class00392.N("commands.attribute.modifier.value.get.success", class00392.N(var3), N(var2), var1.method_5477(), d0), false);
         return (int)(d0 * var4);
      }
   }

   private static int N(class07701 var0, class07049 var1, class03556<class07468> var2, class01894 var3) throws CommandSyntaxException {
      if (N(var1, var2).L(var3)) {
         var0.N(() -> class00392.N("commands.attribute.modifier.remove.success", class00392.N(var3), N(var2), var1.method_5477()), false);
         return 1;
      } else {
         throw L.create(var1.method_5477(), N(var2), var3);
      }
   }

   private static class00392 N(class03556<class07468> var0) {
      return class00392.L(((class07468)var0.N()).L());
   }

   private static int N(class07701 var0, class07049 var1, class03556<class07468> var2, class01894 var3, double var4, class07463 var6) throws CommandSyntaxException {
      class07469 class07469 = N(var1, var2);
      class07471 class07471 = new class07471(var3, var4, var6);
      if (class07469.y(var3)) {
         throw u.create(var1.method_5477(), N(var2), var3);
      } else {
         class07469.u(class07471);
         var0.N(() -> class00392.N("commands.attribute.modifier.add.success", class00392.N(var3), N(var2), var1.method_5477()), false);
         return 1;
      }
   }

   private static int N(class07701 var0, class07049 var1, class03556<class07468> var2) throws CommandSyntaxException {
      class07438 class07438 = N(var1);
      if (!class07438.method_6127().i(var2)) {
         throw y.create(var1.method_5477(), N(var2));
      } else {
         double d0 = class07438.method_45326(var2);
         var0.N(() -> class00392.N("commands.attribute.base_value.reset.success", N(var2), var1.method_5477(), d0), false);
         return 1;
      }
   }

   private static int N(class07701 var0, class07049 var1, class03556<class07468> var2, double var3) throws CommandSyntaxException {
      double d0 = y(var1, var2).method_45325(var2);
      var0.N(() -> class00392.N("commands.attribute.value.get.success", N(var2), var1.method_5477(), d0), false);
      return (int)(d0 * var3);
   }

   private static class07469 N(class07049 var0, class03556<class07468> var1) throws CommandSyntaxException {
      class07469 class07469 = N(var0).method_6127().N(var1);
      if (class07469 == null) {
         throw y.create(var0.method_5477(), N(var1));
      } else {
         return class07469;
      }
   }

   private static class07438 N(class07049 var0) throws CommandSyntaxException {
      if (!(var0 instanceof class07438)) {
         throw N.create(var0.method_5477());
      } else {
         return (class07438)var0;
      }
   }
}
