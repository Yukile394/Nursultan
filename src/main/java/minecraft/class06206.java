package minecraft;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import org.jspecify.annotations.Nullable;

public class class06206 {
   private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("commands.scoreboard.objectives.add.duplicate"));
   private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType(class00392.L("commands.scoreboard.objectives.display.alreadyEmpty"));
   private static final SimpleCommandExceptionType L = new SimpleCommandExceptionType(class00392.L("commands.scoreboard.objectives.display.alreadySet"));
   private static final SimpleCommandExceptionType u = new SimpleCommandExceptionType(class00392.L("commands.scoreboard.players.enable.failed"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(class00392.L("commands.scoreboard.players.enable.invalid"));
   private static final Dynamic2CommandExceptionType R = new Dynamic2CommandExceptionType(
      (var0, var1) -> class00392.y("commands.scoreboard.players.get.null", var0, var1)
   );

   private static int L(class07701 var0, Collection<class01766> var1, class00518 var2, int var3) {
      class06394 class06394 = var0.W().yB();
      int ix = 0;

      for (class01766 class01766 : var1) {
         class01765 class01765 = class06394.N(class01766, var2);
         class01765.N(class01765.N() - var3);
         ix += class01765.N();
      }

      if (var1.size() == 1) {
         int j = ix;
         var0.N(() -> class00392.N("commands.scoreboard.players.remove.success.single", var3, var2.B(), N(var1), j), true);
      } else {
         var0.N(() -> class00392.N("commands.scoreboard.players.remove.success.multiple", var3, var2.B(), var1.size()), true);
      }

      return ix;
   }

   public class06206() {
      super();
   }

   private static int y(class07701 var0, Collection<class01766> var1, class00518 var2, int var3) {
      class06394 class06394 = var0.W().yB();
      int ix = 0;

      for (class01766 class01766 : var1) {
         class01765 class01765 = class06394.N(class01766, var2);
         class01765.N(class01765.N() + var3);
         ix += class01765.N();
      }

      if (var1.size() == 1) {
         int j = ix;
         var0.N(() -> class00392.N("commands.scoreboard.players.add.success.single", var3, var2.B(), N(var1), j), true);
      } else {
         var0.N(() -> class00392.N("commands.scoreboard.players.add.success.multiple", var3, var2.B(), var1.size()), true);
      }

      return ix;
   }

   private static int y(class07701 var0) {
      Collection<class00518> collection = var0.W().yB().N();
      if (collection.isEmpty()) {
         var0.N(() -> class00392.L("commands.scoreboard.objectives.list.empty"), false);
      } else {
         var0.N(() -> class00392.N("commands.scoreboard.objectives.list.success", collection.size(), class00390.y(collection, class00518::B)), false);
      }

      return collection.size();
   }

   private static int y(class07701 var0, Collection<class01766> var1, class00518 var2) {
      class06394 class06394 = var0.W().yB();

      for (class01766 class01766 : var1) {
         class06394.L(class01766, var2);
      }

      if (var1.size() == 1) {
         var0.N(() -> class00392.N("commands.scoreboard.players.reset.specific.single", var2.B(), N(var1)), true);
      } else {
         var0.N(() -> class00392.N("commands.scoreboard.players.reset.specific.multiple", var2.B(), var1.size()), true);
      }

      return var1.size();
   }

   private static class00392 N(Collection<class01766> var0) {
      return ((class01766)var0.iterator().next()).yZ();
   }

   private static LiteralArgumentBuilder<class07701> N() {
      LiteralArgumentBuilder<class07701> literalargumentbuilder = class07686.y("rendertype");

      for (class06640 class06640 : class06640.values()) {
         literalargumentbuilder.then(
            class07686.y(class06640.N()).executes(var1 -> N((class07701)var1.getSource(), class07794.N(var1, "objective"), class06640))
         );
      }

      return literalargumentbuilder;
   }

   public static void N(CommandDispatcher<class07701> var0, class04348 var1) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("scoreboard").requires(class07686.N(class07686.u)))
               .then(
                  ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("objectives")
                                 .then(class07686.y("list").executes(var0x -> y((class07701)var0x.getSource()))))
                              .then(
                                 class07686.y("add")
                                    .then(
                                       class07686.N("objective", StringArgumentType.word())
                                          .then(
                                             ((RequiredArgumentBuilder)class07686.N("criteria", class07764.N())
                                                   .executes(
                                                      var0x -> N(
                                                         (class07701)var0x.getSource(),
                                                         StringArgumentType.getString(var0x, "objective"),
                                                         class07764.N(var0x, "criteria"),
                                                         class00392.y(StringArgumentType.getString(var0x, "objective"))
                                                      )
                                                   ))
                                                .then(
                                                   class07686.N("displayName", class07698.N(var1))
                                                      .executes(
                                                         var0x -> N(
                                                            (class07701)var0x.getSource(),
                                                            StringArgumentType.getString(var0x, "objective"),
                                                            class07764.N(var0x, "criteria"),
                                                            class07698.y(var0x, "displayName")
                                                         )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              class07686.y("modify")
                                 .then(
                                    ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N("objective", class07794.N())
                                                .then(
                                                   class07686.y("displayname")
                                                      .then(
                                                         class07686.N("displayName", class07698.N(var1))
                                                            .executes(
                                                               var0x -> N(
                                                                  (class07701)var0x.getSource(),
                                                                  class07794.N(var0x, "objective"),
                                                                  class07698.y(var0x, "displayName")
                                                               )
                                                            )
                                                      )
                                                ))
                                             .then(N()))
                                          .then(
                                             class07686.y("displayautoupdate")
                                                .then(
                                                   class07686.N("value", BoolArgumentType.bool())
                                                      .executes(
                                                         var0x -> N(
                                                            (class07701)var0x.getSource(),
                                                            class07794.N(var0x, "objective"),
                                                            BoolArgumentType.getBool(var0x, "value")
                                                         )
                                                      )
                                                )
                                          ))
                                       .then(
                                          N(
                                             var1,
                                             class07686.y("numberformat"),
                                             (var0x, var1x) -> N((class07701)var0x.getSource(), class07794.N(var0x, "objective"), var1x)
                                          )
                                       )
                                 )
                           ))
                        .then(
                           class07686.y("remove")
                              .then(
                                 class07686.N("objective", class07794.N())
                                    .executes(var0x -> N((class07701)var0x.getSource(), class07794.N(var0x, "objective")))
                              )
                        ))
                     .then(
                        class07686.y("setdisplay")
                           .then(
                              ((RequiredArgumentBuilder)class07686.N("slot", class07758.N())
                                    .executes(var0x -> N((class07701)var0x.getSource(), class07758.N(var0x, "slot"))))
                                 .then(
                                    class07686.N("objective", class07794.N())
                                       .executes(var0x -> N((class07701)var0x.getSource(), class07758.N(var0x, "slot"), class07794.N(var0x, "objective")))
                                 )
                           )
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y(
                                             "players"
                                          )
                                          .then(
                                             ((LiteralArgumentBuilder)class07686.y("list").executes(var0x -> N((class07701)var0x.getSource())))
                                                .then(
                                                   class07686.N("target", class07786.N())
                                                      .suggests(class07786.N)
                                                      .executes(var0x -> N((class07701)var0x.getSource(), class07786.N(var0x, "target")))
                                                )
                                          ))
                                       .then(
                                          class07686.y("set")
                                             .then(
                                                class07686.N("targets", class07786.y())
                                                   .suggests(class07786.N)
                                                   .then(
                                                      class07686.N("objective", class07794.N())
                                                         .then(
                                                            class07686.N("score", IntegerArgumentType.integer())
                                                               .executes(
                                                                  var0x -> N(
                                                                     (class07701)var0x.getSource(),
                                                                     class07786.L(var0x, "targets"),
                                                                     class07794.y(var0x, "objective"),
                                                                     IntegerArgumentType.getInteger(var0x, "score")
                                                                  )
                                                               )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       class07686.y("get")
                                          .then(
                                             class07686.N("target", class07786.N())
                                                .suggests(class07786.N)
                                                .then(
                                                   class07686.N("objective", class07794.N())
                                                      .executes(
                                                         var0x -> N(
                                                            (class07701)var0x.getSource(), class07786.N(var0x, "target"), class07794.N(var0x, "objective")
                                                         )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    class07686.y("add")
                                       .then(
                                          class07686.N("targets", class07786.y())
                                             .suggests(class07786.N)
                                             .then(
                                                class07686.N("objective", class07794.N())
                                                   .then(
                                                      class07686.N("score", IntegerArgumentType.integer(0))
                                                         .executes(
                                                            var0x -> y(
                                                               (class07701)var0x.getSource(),
                                                               class07786.L(var0x, "targets"),
                                                               class07794.y(var0x, "objective"),
                                                               IntegerArgumentType.getInteger(var0x, "score")
                                                            )
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 class07686.y("remove")
                                    .then(
                                       class07686.N("targets", class07786.y())
                                          .suggests(class07786.N)
                                          .then(
                                             class07686.N("objective", class07794.N())
                                                .then(
                                                   class07686.N("score", IntegerArgumentType.integer(0))
                                                      .executes(
                                                         var0x -> L(
                                                            (class07701)var0x.getSource(),
                                                            class07786.L(var0x, "targets"),
                                                            class07794.y(var0x, "objective"),
                                                            IntegerArgumentType.getInteger(var0x, "score")
                                                         )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              class07686.y("reset")
                                 .then(
                                    ((RequiredArgumentBuilder)class07686.N("targets", class07786.y())
                                          .suggests(class07786.N)
                                          .executes(var0x -> N((class07701)var0x.getSource(), class07786.L(var0x, "targets"))))
                                       .then(
                                          class07686.N("objective", class07794.N())
                                             .executes(
                                                var0x -> y((class07701)var0x.getSource(), class07786.L(var0x, "targets"), class07794.N(var0x, "objective"))
                                             )
                                       )
                                 )
                           ))
                        .then(
                           class07686.y("enable")
                              .then(
                                 class07686.N("targets", class07786.y())
                                    .suggests(class07786.N)
                                    .then(
                                       class07686.N("objective", class07794.N())
                                          .suggests((var0x, var1x) -> N((class07701)var0x.getSource(), class07786.L(var0x, "targets"), var1x))
                                          .executes(var0x -> N((class07701)var0x.getSource(), class07786.L(var0x, "targets"), class07794.N(var0x, "objective")))
                                    )
                              )
                        ))
                     .then(
                        ((LiteralArgumentBuilder)class07686.y("display")
                              .then(
                                 class07686.y("name")
                                    .then(
                                       class07686.N("targets", class07786.y())
                                          .suggests(class07786.N)
                                          .then(
                                             ((RequiredArgumentBuilder)class07686.N("objective", class07794.N())
                                                   .then(
                                                      class07686.N("name", class07698.N(var1))
                                                         .executes(
                                                            var0x -> N(
                                                               (class07701)var0x.getSource(),
                                                               class07786.L(var0x, "targets"),
                                                               class07794.N(var0x, "objective"),
                                                               class07698.y(var0x, "name")
                                                            )
                                                         )
                                                   ))
                                                .executes(
                                                   var0x -> N(
                                                      (class07701)var0x.getSource(), class07786.L(var0x, "targets"), class07794.N(var0x, "objective"), null
                                                   )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              class07686.y("numberformat")
                                 .then(
                                    class07686.N("targets", class07786.y())
                                       .suggests(class07786.N)
                                       .then(
                                          N(
                                             var1,
                                             class07686.N("objective", class07794.N()),
                                             (var0x, var1x) -> N(
                                                (class07701)var0x.getSource(), class07786.L(var0x, "targets"), class07794.N(var0x, "objective"), var1x
                                             )
                                          )
                                       )
                                 )
                           )
                     ))
                  .then(
                     class07686.y("operation")
                        .then(
                           class07686.N("targets", class07786.y())
                              .suggests(class07786.N)
                              .then(
                                 class07686.N("targetObjective", class07794.N())
                                    .then(
                                       class07686.N("operation", class07785.N())
                                          .then(
                                             class07686.N("source", class07786.y())
                                                .suggests(class07786.N)
                                                .then(
                                                   class07686.N("sourceObjective", class07794.N())
                                                      .executes(
                                                         var0x -> N(
                                                            (class07701)var0x.getSource(),
                                                            class07786.L(var0x, "targets"),
                                                            class07794.y(var0x, "targetObjective"),
                                                            class07785.N(var0x, "operation"),
                                                            class07786.L(var0x, "source"),
                                                            class07794.N(var0x, "sourceObjective")
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

   private static int N(class07701 var0, class01766 var1, class00518 var2) throws CommandSyntaxException {
      class01788 class01788 = var0.W().yB().y(var1, var2);
      if (class01788 == null) {
         throw R.create(var2.L(), var1.yZ());
      } else {
         var0.N(() -> class00392.N("commands.scoreboard.players.get.success", var1.yZ(), class01788.y(), var2.B()), false);
         return class01788.y();
      }
   }

   private static ArgumentBuilder<class07701, ?> N(class04348 var0, ArgumentBuilder<class07701, ?> var1, class06199 var2) {
      return var1.then(class07686.y("blank").executes(var1x -> var2.run(var1x, class01784.N)))
         .then(class07686.y("fixed").then(class07686.N("contents", class07698.N(var0)).executes(var1x -> {
            class00392 class00392 = class07698.y(var1x, "contents");
            return var2.run(var1x, new class01782(class00392));
         })))
         .then(class07686.y("styled").then(class07686.N("style", class01786.N(var0)).executes(var1x -> {
            class00405 class00405 = class01786.N(var1x, "style");
            return var2.run(var1x, new class01759(class00405));
         })))
         .executes(var1x -> var2.run(var1x, null));
   }

   private static CompletableFuture<Suggestions> N(class07701 var0, Collection<class01766> var1, SuggestionsBuilder var2) {
      ArrayList arraylist = Lists.newArrayList();
      class06394 class06394 = var0.W().yB();

      for (class00518 class00518 : class06394.N()) {
         if (class00518.u() == class06675.L) {
            boolean flag = false;

            for (class01766 class01766 : var1) {
               class01788 class01788 = class06394.y(class01766, class00518);
               if (class01788 == null || class01788.L()) {
                  flag = true;
                  break;
               }
            }

            if (flag) {
               arraylist.add(class00518.L());
            }
         }
      }

      return class07689.y(arraylist, var2);
   }

   private static int N(class07701 var0, String var1, class06675 var2, class00392 var3) throws CommandSyntaxException {
      class06394 class06394 = var0.W().yB();
      if (class06394.N(var1) != null) {
         throw N.create();
      } else {
         class06394.N(var1, var2, var3, var2.u(), false, null);
         class00518 class00518 = class06394.N(var1);
         var0.N(() -> class00392.N("commands.scoreboard.objectives.add.success", class00518.B()), true);
         return class06394.N().size();
      }
   }

   private static int N(class07701 var0, class00518 var1) {
      class06394 class06394 = var0.W().yB();
      class06394.y(var1);
      var0.N(() -> class00392.N("commands.scoreboard.objectives.remove.success", var1.B()), true);
      return class06394.N().size();
   }

   private static int N(class07701 var0, class00518 var1, class06640 var2) {
      if (var1.Z() != var2) {
         var1.N(var2);
         var0.N(() -> class00392.N("commands.scoreboard.objectives.modify.rendertype", var1.B()), true);
      }

      return 0;
   }

   private static int N(class07701 var0, Collection<class01766> var1, class00518 var2, @Nullable class00392 var3) {
      class06394 class06394 = var0.W().yB();

      for (class01766 class01766 : var1) {
         class06394.N(class01766, var2).N(var3);
      }

      if (var3 == null) {
         if (var1.size() == 1) {
            var0.N(() -> class00392.N("commands.scoreboard.players.display.name.clear.success.single", N(var1), var2.B()), true);
         } else {
            var0.N(() -> class00392.N("commands.scoreboard.players.display.name.clear.success.multiple", var1.size(), var2.B()), true);
         }
      } else if (var1.size() == 1) {
         var0.N(() -> class00392.N("commands.scoreboard.players.display.name.set.success.single", var3, N(var1), var2.B()), true);
      } else {
         var0.N(() -> class00392.N("commands.scoreboard.players.display.name.set.success.multiple", var3, var1.size(), var2.B()), true);
      }

      return var1.size();
   }

   private static int N(class07701 var0, Collection<class01766> var1, class00518 var2, @Nullable class01762 var3) {
      class06394 class06394 = var0.W().yB();

      for (class01766 class01766 : var1) {
         class06394.N(class01766, var2).N(var3);
      }

      if (var3 == null) {
         if (var1.size() == 1) {
            var0.N(() -> class00392.N("commands.scoreboard.players.display.numberFormat.clear.success.single", N(var1), var2.B()), true);
         } else {
            var0.N(() -> class00392.N("commands.scoreboard.players.display.numberFormat.clear.success.multiple", var1.size(), var2.B()), true);
         }
      } else if (var1.size() == 1) {
         var0.N(() -> class00392.N("commands.scoreboard.players.display.numberFormat.set.success.single", N(var1), var2.B()), true);
      } else {
         var0.N(() -> class00392.N("commands.scoreboard.players.display.numberFormat.set.success.multiple", var1.size(), var2.B()), true);
      }

      return var1.size();
   }

   private static int N(class07701 var0, class01890 var1, class00518 var2) throws CommandSyntaxException {
      class06394 class06394 = var0.W().yB();
      if (class06394.N(var1) == var2) {
         throw L.create();
      } else {
         class06394.N(var1, var2);
         var0.N(() -> class00392.N("commands.scoreboard.objectives.display.set", var1.method_15434(), var2.i()), true);
         return 0;
      }
   }

   private static int N(class07701 var0, class01890 var1) throws CommandSyntaxException {
      class06394 class06394 = var0.W().yB();
      if (class06394.N(var1) == null) {
         throw y.create();
      } else {
         class06394.N(var1, null);
         var0.N(() -> class00392.N("commands.scoreboard.objectives.display.cleared", var1.method_15434()), true);
         return 0;
      }
   }

   private static int N(class07701 var0, class01766 var1) {
      Object2IntMap<class00518> object2intmap = var0.W().yB().y(var1);
      if (object2intmap.isEmpty()) {
         var0.N(() -> class00392.N("commands.scoreboard.players.list.entity.empty", var1.yZ()), false);
      } else {
         var0.N(() -> class00392.N("commands.scoreboard.players.list.entity.success", var1.yZ(), object2intmap.size()), false);
         Object2IntMaps.fastForEach(
            object2intmap,
            var1x -> var0.N(() -> class00392.N("commands.scoreboard.players.list.entity.entry", ((class00518)var1x.getKey()).B(), var1x.getIntValue()), false)
         );
      }

      return object2intmap.size();
   }

   private static int N(class07701 var0) {
      Collection<class01766> collection = var0.W().yB().L();
      if (collection.isEmpty()) {
         var0.N(() -> class00392.L("commands.scoreboard.players.list.empty"), false);
      } else {
         var0.N(() -> class00392.N("commands.scoreboard.players.list.success", collection.size(), class00390.y(collection, class01766::yZ)), false);
      }

      return collection.size();
   }

   private static int N(class07701 var0, class00518 var1, class00392 var2) {
      if (!var1.i().equals(var2)) {
         var1.N(var2);
         var0.N(() -> class00392.N("commands.scoreboard.objectives.modify.displayname", var1.L(), var1.B()), true);
      }

      return 0;
   }

   private static int N(class07701 var0, class00518 var1, boolean var2) {
      if (var1.R() != var2) {
         var1.N(var2);
         if (var2) {
            var0.N(() -> class00392.N("commands.scoreboard.objectives.modify.displayAutoUpdate.enable", var1.L(), var1.B()), true);
         } else {
            var0.N(() -> class00392.N("commands.scoreboard.objectives.modify.displayAutoUpdate.disable", var1.L(), var1.B()), true);
         }
      }

      return 0;
   }

   private static int N(class07701 var0, class00518 var1, @Nullable class01762 var2) {
      var1.y(var2);
      if (var2 != null) {
         var0.N(() -> class00392.N("commands.scoreboard.objectives.modify.objectiveFormat.set", var1.L()), true);
      } else {
         var0.N(() -> class00392.N("commands.scoreboard.objectives.modify.objectiveFormat.clear", var1.L()), true);
      }

      return 0;
   }

   private static int N(class07701 var0, Collection<class01766> var1, class00518 var2) throws CommandSyntaxException {
      if (var2.u() != class06675.L) {
         throw i.create();
      } else {
         class06394 class06394 = var0.W().yB();
         int ix = 0;

         for (class01766 class01766 : var1) {
            class01765 class01765 = class06394.N(class01766, var2);
            if (class01765.L()) {
               class01765.u();
               ix++;
            }
         }

         if (ix == 0) {
            throw u.create();
         } else {
            if (var1.size() == 1) {
               var0.N(() -> class00392.N("commands.scoreboard.players.enable.success.single", var2.B(), N(var1)), true);
            } else {
               var0.N(() -> class00392.N("commands.scoreboard.players.enable.success.multiple", var2.B(), var1.size()), true);
            }

            return ix;
         }
      }
   }

   private static int N(class07701 var0, Collection<class01766> var1) {
      class06394 class06394 = var0.W().yB();

      for (class01766 class01766 : var1) {
         class06394.N(class01766);
      }

      if (var1.size() == 1) {
         var0.N(() -> class00392.N("commands.scoreboard.players.reset.all.single", N(var1)), true);
      } else {
         var0.N(() -> class00392.N("commands.scoreboard.players.reset.all.multiple", var1.size()), true);
      }

      return var1.size();
   }

   private static int N(class07701 var0, Collection<class01766> var1, class00518 var2, class07802 var3, Collection<class01766> var4, class00518 var5) throws CommandSyntaxException {
      class06394 class06394 = var0.W().yB();
      int ix = 0;

      for (class01766 class01766x : var1) {
         class01765 class01765x = class06394.N(class01766x, var2);

         for (class01766 class01766x : var4) {
            class01765 class01765x = class06394.N(class01766x, var5);
            var3.apply(class01765x, class01765x);
         }

         ix += class01765x.N();
      }

      if (var1.size() == 1) {
         int j = ix;
         var0.N(() -> class00392.N("commands.scoreboard.players.operation.success.single", var2.B(), N(var1), j), true);
      } else {
         var0.N(() -> class00392.N("commands.scoreboard.players.operation.success.multiple", var2.B(), var1.size()), true);
      }

      return ix;
   }

   private static int N(class07701 var0, Collection<class01766> var1, class00518 var2, int var3) {
      class06394 class06394 = var0.W().yB();

      for (class01766 class01766 : var1) {
         class06394.N(class01766, var2).N(var3);
      }

      if (var1.size() == 1) {
         var0.N(() -> class00392.N("commands.scoreboard.players.set.success.single", var2.B(), N(var1), var3), true);
      } else {
         var0.N(() -> class00392.N("commands.scoreboard.players.set.success.multiple", var2.B(), var1.size(), var3), true);
      }

      return var3 * var1.size();
   }
}
