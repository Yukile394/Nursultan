package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.Collections;

public class class06426 {
   private static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(var0 -> class00392.y("commands.bossbar.create.failed", var0));
   private static final DynamicCommandExceptionType L = new DynamicCommandExceptionType(var0 -> class00392.y("commands.bossbar.unknown", var0));
   private static final SimpleCommandExceptionType u = new SimpleCommandExceptionType(class00392.L("commands.bossbar.set.players.unchanged"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(class00392.L("commands.bossbar.set.name.unchanged"));
   private static final SimpleCommandExceptionType R = new SimpleCommandExceptionType(class00392.L("commands.bossbar.set.color.unchanged"));
   private static final SimpleCommandExceptionType M = new SimpleCommandExceptionType(class00392.L("commands.bossbar.set.style.unchanged"));
   private static final SimpleCommandExceptionType B = new SimpleCommandExceptionType(class00392.L("commands.bossbar.set.value.unchanged"));
   private static final SimpleCommandExceptionType Z = new SimpleCommandExceptionType(class00392.L("commands.bossbar.set.max.unchanged"));
   private static final SimpleCommandExceptionType z = new SimpleCommandExceptionType(class00392.L("commands.bossbar.set.visibility.unchanged.hidden"));
   private static final SimpleCommandExceptionType U = new SimpleCommandExceptionType(class00392.L("commands.bossbar.set.visibility.unchanged.visible"));
   public static final SuggestionProvider<class07701> N = (var0, var1) -> class07689.N(((class07701)var0.getSource()).W().yU().N(), var1);

   private static int L(class07701 var0, class06392 var1) {
      if (var1.P()) {
         var0.N(() -> class00392.N("commands.bossbar.get.visible.visible", var1.W()), true);
         return 1;
      } else {
         var0.N(() -> class00392.N("commands.bossbar.get.visible.hidden", var1.W()), true);
         return 0;
      }
   }

   public class06426() {
      super();
   }

   private static int i(class07701 var0, class06392 var1) {
      class06398 class06398 = var0.W().yU();
      var1.z();
      class06398.N(var1);
      var0.N(() -> class00392.N("commands.bossbar.remove.success", var1.W()), true);
      return class06398.y().size();
   }

   private static int u(class07701 var0, class06392 var1) {
      if (var1.s().isEmpty()) {
         var0.N(() -> class00392.N("commands.bossbar.get.players.none", var1.W()), true);
      } else {
         var0.N(() -> class00392.N("commands.bossbar.get.players.some", var1.W(), var1.s().size(), class00390.y(var1.s(), class08036::method_5476)), true);
      }

      return var1.s().size();
   }

   private static int y(class07701 var0, class06392 var1) {
      var0.N(() -> class00392.N("commands.bossbar.get.max", var1.W(), var1.E()), true);
      return var1.E();
   }

   private static int y(class07701 var0, class06392 var1, int var2) throws CommandSyntaxException {
      if (var1.E() == var2) {
         throw Z.create();
      } else {
         var1.y(var2);
         var0.N(() -> class00392.N("commands.bossbar.set.max.success", var1.W(), var2), true);
         return var2;
      }
   }

   private static int N(class07701 var0, class06392 var1) {
      var0.N(() -> class00392.N("commands.bossbar.get.value", var1.W(), var1.U()), true);
      return var1.U();
   }

   private static int N(class07701 var0, class06392 var1, class06702 var2) throws CommandSyntaxException {
      if (var1.i().equals(var2)) {
         throw M.create();
      } else {
         var1.N(var2);
         var0.N(() -> class00392.N("commands.bossbar.set.style.success", var1.W()), true);
         return 0;
      }
   }

   public static void N(CommandDispatcher<class07701> var0, class04348 var1) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y(
                              "bossbar"
                           )
                           .requires(class07686.N(class07686.u)))
                        .then(
                           class07686.y("add")
                              .then(
                                 class07686.N("id", class07778.N())
                                    .then(
                                       class07686.N("name", class07698.N(var1))
                                          .executes(var0x -> N((class07701)var0x.getSource(), class07778.N(var0x, "id"), class07698.y(var0x, "name")))
                                    )
                              )
                        ))
                     .then(
                        class07686.y("remove")
                           .then(class07686.N("id", class07778.N()).suggests(N).executes(var0x -> i((class07701)var0x.getSource(), N(var0x))))
                     ))
                  .then(class07686.y("list").executes(var0x -> N((class07701)var0x.getSource()))))
               .then(
                  class07686.y("set")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N(
                                                "id", class07778.N()
                                             )
                                             .suggests(N)
                                             .then(
                                                class07686.y("name")
                                                   .then(
                                                      class07686.N("name", class07698.N(var1))
                                                         .executes(var0x -> N((class07701)var0x.getSource(), N(var0x), class07698.y(var0x, "name")))
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y(
                                                                     "color"
                                                                  )
                                                                  .then(
                                                                     class07686.y("pink")
                                                                        .executes(var0x -> N((class07701)var0x.getSource(), N(var0x), class06685.field_5788))
                                                                  ))
                                                               .then(
                                                                  class07686.y("blue")
                                                                     .executes(var0x -> N((class07701)var0x.getSource(), N(var0x), class06685.field_5780))
                                                               ))
                                                            .then(
                                                               class07686.y("red")
                                                                  .executes(var0x -> N((class07701)var0x.getSource(), N(var0x), class06685.field_5784))
                                                            ))
                                                         .then(
                                                            class07686.y("green")
                                                               .executes(var0x -> N((class07701)var0x.getSource(), N(var0x), class06685.field_5785))
                                                         ))
                                                      .then(
                                                         class07686.y("yellow")
                                                            .executes(var0x -> N((class07701)var0x.getSource(), N(var0x), class06685.field_5782))
                                                      ))
                                                   .then(
                                                      class07686.y("purple")
                                                         .executes(var0x -> N((class07701)var0x.getSource(), N(var0x), class06685.field_5783))
                                                   ))
                                                .then(
                                                   class07686.y("white").executes(var0x -> N((class07701)var0x.getSource(), N(var0x), class06685.field_5786))
                                                )
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y(
                                                            "style"
                                                         )
                                                         .then(
                                                            class07686.y("progress")
                                                               .executes(var0x -> N((class07701)var0x.getSource(), N(var0x), class06702.field_5795))
                                                         ))
                                                      .then(
                                                         class07686.y("notched_6")
                                                            .executes(var0x -> N((class07701)var0x.getSource(), N(var0x), class06702.field_5796))
                                                      ))
                                                   .then(
                                                      class07686.y("notched_10")
                                                         .executes(var0x -> N((class07701)var0x.getSource(), N(var0x), class06702.field_5791))
                                                   ))
                                                .then(
                                                   class07686.y("notched_12")
                                                      .executes(var0x -> N((class07701)var0x.getSource(), N(var0x), class06702.field_5793))
                                                ))
                                             .then(
                                                class07686.y("notched_20").executes(var0x -> N((class07701)var0x.getSource(), N(var0x), class06702.field_5790))
                                             )
                                       ))
                                    .then(
                                       class07686.y("value")
                                          .then(
                                             class07686.N("value", IntegerArgumentType.integer(0))
                                                .executes(var0x -> N((class07701)var0x.getSource(), N(var0x), IntegerArgumentType.getInteger(var0x, "value")))
                                          )
                                    ))
                                 .then(
                                    class07686.y("max")
                                       .then(
                                          class07686.N("max", IntegerArgumentType.integer(1))
                                             .executes(var0x -> y((class07701)var0x.getSource(), N(var0x), IntegerArgumentType.getInteger(var0x, "max")))
                                       )
                                 ))
                              .then(
                                 class07686.y("visible")
                                    .then(
                                       class07686.N("visible", BoolArgumentType.bool())
                                          .executes(var0x -> N((class07701)var0x.getSource(), N(var0x), BoolArgumentType.getBool(var0x, "visible")))
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)class07686.y("players")
                                    .executes(var0x -> N((class07701)var0x.getSource(), N(var0x), Collections.emptyList())))
                                 .then(
                                    class07686.N("targets", class07680.u())
                                       .executes(var0x -> N((class07701)var0x.getSource(), N(var0x), class07680.u(var0x, "targets")))
                                 )
                           )
                     )
               ))
            .then(
               class07686.y("get")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N("id", class07778.N())
                                 .suggests(N)
                                 .then(class07686.y("value").executes(var0x -> N((class07701)var0x.getSource(), N(var0x)))))
                              .then(class07686.y("max").executes(var0x -> y((class07701)var0x.getSource(), N(var0x)))))
                           .then(class07686.y("visible").executes(var0x -> L((class07701)var0x.getSource(), N(var0x)))))
                        .then(class07686.y("players").executes(var0x -> u((class07701)var0x.getSource(), N(var0x))))
                  )
            )
      );
   }

   private static int N(class07701 var0, class06392 var1, class00392 var2) throws CommandSyntaxException {
      class05216 class05216 = class00390.N(var0, var2, null, 0);
      if (var1.y().equals(class05216)) {
         throw i.create();
      } else {
         var1.N(class05216);
         var0.N(() -> class00392.N("commands.bossbar.set.name.success", var1.W()), true);
         return 0;
      }
   }

   private static int N(class07701 var0, class06392 var1, Collection<class04770> var2) throws CommandSyntaxException {
      if (!var1.N(var2)) {
         throw u.create();
      } else {
         if (var1.s().isEmpty()) {
            var0.N(() -> class00392.N("commands.bossbar.set.players.success.none", var1.W()), true);
         } else {
            var0.N(() -> class00392.N("commands.bossbar.set.players.success.some", var1.W(), var2.size(), class00390.y(var2, class08036::method_5476)), true);
         }

         return var1.s().size();
      }
   }

   private static int N(class07701 var0) {
      Collection<class06392> collection = var0.W().yU().y();
      if (collection.isEmpty()) {
         var0.N(() -> class00392.L("commands.bossbar.list.bars.none"), false);
      } else {
         var0.N(() -> class00392.N("commands.bossbar.list.bars.some", collection.size(), class00390.y(collection, class06392::W)), false);
      }

      return collection.size();
   }

   private static int N(class07701 var0, class01894 var1, class00392 var2) throws CommandSyntaxException {
      class06398 class06398 = var0.W().yU();
      if (class06398.N(var1) != null) {
         throw y.create(var1.toString());
      } else {
         class06392 class06392 = class06398.N(var1, class00390.N(var0, var2, null, 0));
         var0.N(() -> class00392.N("commands.bossbar.create.success", class06392.W()), true);
         return class06398.y().size();
      }
   }

   public static class06392 N(CommandContext<class07701> var0) throws CommandSyntaxException {
      class01894 class01894 = class07778.N(var0, "id");
      class06392 class06392 = ((class07701)var0.getSource()).W().yU().N(class01894);
      if (class06392 == null) {
         throw L.create(class01894.toString());
      } else {
         return class06392;
      }
   }

   private static int N(class07701 var0, class06392 var1, boolean var2) throws CommandSyntaxException {
      if (var1.P() == var2) {
         if (var2) {
            throw U.create();
         } else {
            throw z.create();
         }
      } else {
         var1.u(var2);
         if (var2) {
            var0.N(() -> class00392.N("commands.bossbar.set.visible.success.visible", var1.W()), true);
         } else {
            var0.N(() -> class00392.N("commands.bossbar.set.visible.success.hidden", var1.W()), true);
         }

         return 0;
      }
   }

   private static int N(class07701 var0, class06392 var1, int var2) throws CommandSyntaxException {
      if (var1.U() == var2) {
         throw B.create();
      } else {
         var1.N(var2);
         var0.N(() -> class00392.N("commands.bossbar.set.value.success", var1.W(), var2), true);
         return var2;
      }
   }

   private static int N(class07701 var0, class06392 var1, class06685 var2) throws CommandSyntaxException {
      if (var1.u().equals(var2)) {
         throw R.create();
      } else {
         var1.N(var2);
         var0.N(() -> class00392.N("commands.bossbar.set.color.success", var1.W()), true);
         return 0;
      }
   }
}
