package minecraft;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class class05595 {
   private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("commands.team.add.duplicate"));
   private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType(class00392.L("commands.team.empty.unchanged"));
   private static final SimpleCommandExceptionType L = new SimpleCommandExceptionType(class00392.L("commands.team.option.name.unchanged"));
   private static final SimpleCommandExceptionType u = new SimpleCommandExceptionType(class00392.L("commands.team.option.color.unchanged"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(class00392.L("commands.team.option.friendlyfire.alreadyEnabled"));
   private static final SimpleCommandExceptionType R = new SimpleCommandExceptionType(class00392.L("commands.team.option.friendlyfire.alreadyDisabled"));
   private static final SimpleCommandExceptionType M = new SimpleCommandExceptionType(class00392.L("commands.team.option.seeFriendlyInvisibles.alreadyEnabled"));
   private static final SimpleCommandExceptionType B = new SimpleCommandExceptionType(
      class00392.L("commands.team.option.seeFriendlyInvisibles.alreadyDisabled")
   );
   private static final SimpleCommandExceptionType Z = new SimpleCommandExceptionType(class00392.L("commands.team.option.nametagVisibility.unchanged"));
   private static final SimpleCommandExceptionType z = new SimpleCommandExceptionType(class00392.L("commands.team.option.deathMessageVisibility.unchanged"));
   private static final SimpleCommandExceptionType U = new SimpleCommandExceptionType(class00392.L("commands.team.option.collisionRule.unchanged"));

   private static int L(class07701 var0, class00502 var1) {
      Collection<String> collection = var1.B();
      if (collection.isEmpty()) {
         var0.N(() -> class00392.N("commands.team.list.members.empty", var1.i()), false);
      } else {
         var0.N(() -> class00392.N("commands.team.list.members.success", var1.i(), collection.size(), class00390.N(collection)), false);
      }

      return collection.size();
   }

   private static int L(class07701 var0, class00502 var1, class00392 var2) {
      var1.L(var2);
      var0.N(() -> class00392.N("commands.team.option.suffix.success", var2), false);
      return 1;
   }

   public class05595() {
      super();
   }

   private static int y(class07701 var0, class00502 var1, class06672 var2) throws CommandSyntaxException {
      if (var1.E() == var2) {
         throw z.create();
      } else {
         var1.y(var2);
         var0.N(() -> class00392.N("commands.team.option.deathMessageVisibility.success", var1.i(), var2.N()), true);
         return 0;
      }
   }

   private static int y(class07701 var0, class00502 var1, class00392 var2) {
      var1.y(var2);
      var0.N(() -> class00392.N("commands.team.option.prefix.success", var2), false);
      return 1;
   }

   private static int y(class07701 var0, class00502 var1, boolean var2) throws CommandSyntaxException {
      if (var1.Z() == var2) {
         if (var2) {
            throw i.create();
         } else {
            throw R.create();
         }
      } else {
         var1.N(var2);
         var0.N(() -> class00392.N("commands.team.option.friendlyfire." + (var2 ? "enabled" : "disabled"), var1.i()), true);
         return 0;
      }
   }

   private static int y(class07701 var0, class00502 var1) {
      class06394 class06394 = var0.W().yB();
      class06394.N(var1);
      var0.N(() -> class00392.N("commands.team.remove.success", var1.i()), true);
      return class06394.i().size();
   }

   private static int N(class07701 var0, class00502 var1, Collection<class01766> var2) {
      class06394 class06394 = var0.W().yB();

      for (class01766 class01766 : var2) {
         class06394.N(class01766.method_5820(), var1);
      }

      if (var2.size() == 1) {
         var0.N(() -> class00392.N("commands.team.join.success.single", N(var2), var1.i()), true);
      } else {
         var0.N(() -> class00392.N("commands.team.join.success.multiple", var2.size(), var1.i()), true);
      }

      return var2.size();
   }

   public static void N(CommandDispatcher<class07701> var0, class04348 var1) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y(
                                    "team"
                                 )
                                 .requires(class07686.N(class07686.u)))
                              .then(
                                 ((LiteralArgumentBuilder)class07686.y("list").executes(var0x -> N((class07701)var0x.getSource())))
                                    .then(class07686.N("team", class07761.N()).executes(var0x -> L((class07701)var0x.getSource(), class07761.N(var0x, "team"))))
                              ))
                           .then(
                              class07686.y("add")
                                 .then(
                                    ((RequiredArgumentBuilder)class07686.N("team", StringArgumentType.word())
                                          .executes(var0x -> N((class07701)var0x.getSource(), StringArgumentType.getString(var0x, "team"))))
                                       .then(
                                          class07686.N("displayName", class07698.N(var1))
                                             .executes(
                                                var0x -> N(
                                                   (class07701)var0x.getSource(),
                                                   StringArgumentType.getString(var0x, "team"),
                                                   class07698.y(var0x, "displayName")
                                                )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           class07686.y("remove")
                              .then(class07686.N("team", class07761.N()).executes(var0x -> y((class07701)var0x.getSource(), class07761.N(var0x, "team"))))
                        ))
                     .then(
                        class07686.y("empty")
                           .then(class07686.N("team", class07761.N()).executes(var0x -> N((class07701)var0x.getSource(), class07761.N(var0x, "team"))))
                     ))
                  .then(
                     class07686.y("join")
                        .then(
                           ((RequiredArgumentBuilder)class07686.N("team", class07761.N())
                                 .executes(
                                    var0x -> N(
                                       (class07701)var0x.getSource(), class07761.N(var0x, "team"), Collections.singleton(((class07701)var0x.getSource()).B())
                                    )
                                 ))
                              .then(
                                 class07686.N("members", class07786.y())
                                    .suggests(class07786.N)
                                    .executes(var0x -> N((class07701)var0x.getSource(), class07761.N(var0x, "team"), class07786.L(var0x, "members")))
                              )
                        )
                  ))
               .then(
                  class07686.y("leave")
                     .then(
                        class07686.N("members", class07786.y())
                           .suggests(class07786.N)
                           .executes(var0x -> N((class07701)var0x.getSource(), class07786.L(var0x, "members")))
                     )
               ))
            .then(
               class07686.y("modify")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N(
                                                   "team", class07761.N()
                                                )
                                                .then(
                                                   class07686.y("displayName")
                                                      .then(
                                                         class07686.N("displayName", class07698.N(var1))
                                                            .executes(
                                                               var0x -> N(
                                                                  (class07701)var0x.getSource(),
                                                                  class07761.N(var0x, "team"),
                                                                  class07698.y(var0x, "displayName")
                                                               )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                class07686.y("color")
                                                   .then(
                                                      class07686.N("value", class07696.N())
                                                         .executes(
                                                            var0x -> N((class07701)var0x.getSource(), class07761.N(var0x, "team"), class07696.N(var0x, "value"))
                                                         )
                                                   )
                                             ))
                                          .then(
                                             class07686.y("friendlyFire")
                                                .then(
                                                   class07686.N("allowed", BoolArgumentType.bool())
                                                      .executes(
                                                         var0x -> y(
                                                            (class07701)var0x.getSource(),
                                                            class07761.N(var0x, "team"),
                                                            BoolArgumentType.getBool(var0x, "allowed")
                                                         )
                                                      )
                                                )
                                          ))
                                       .then(
                                          class07686.y("seeFriendlyInvisibles")
                                             .then(
                                                class07686.N("allowed", BoolArgumentType.bool())
                                                   .executes(
                                                      var0x -> N(
                                                         (class07701)var0x.getSource(), class07761.N(var0x, "team"), BoolArgumentType.getBool(var0x, "allowed")
                                                      )
                                                   )
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("nametagVisibility")
                                                   .then(
                                                      class07686.y("never")
                                                         .executes(
                                                            var0x -> N((class07701)var0x.getSource(), class07761.N(var0x, "team"), class06672.field_1443)
                                                         )
                                                   ))
                                                .then(
                                                   class07686.y("hideForOtherTeams")
                                                      .executes(var0x -> N((class07701)var0x.getSource(), class07761.N(var0x, "team"), class06672.field_1444))
                                                ))
                                             .then(
                                                class07686.y("hideForOwnTeam")
                                                   .executes(var0x -> N((class07701)var0x.getSource(), class07761.N(var0x, "team"), class06672.field_1446))
                                             ))
                                          .then(
                                             class07686.y("always")
                                                .executes(var0x -> N((class07701)var0x.getSource(), class07761.N(var0x, "team"), class06672.field_1442))
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("deathMessageVisibility")
                                                .then(
                                                   class07686.y("never")
                                                      .executes(var0x -> y((class07701)var0x.getSource(), class07761.N(var0x, "team"), class06672.field_1443))
                                                ))
                                             .then(
                                                class07686.y("hideForOtherTeams")
                                                   .executes(var0x -> y((class07701)var0x.getSource(), class07761.N(var0x, "team"), class06672.field_1444))
                                             ))
                                          .then(
                                             class07686.y("hideForOwnTeam")
                                                .executes(var0x -> y((class07701)var0x.getSource(), class07761.N(var0x, "team"), class06672.field_1446))
                                          ))
                                       .then(
                                          class07686.y("always")
                                             .executes(var0x -> y((class07701)var0x.getSource(), class07761.N(var0x, "team"), class06672.field_1442))
                                       )
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("collisionRule")
                                             .then(
                                                class07686.y("never")
                                                   .executes(var0x -> N((class07701)var0x.getSource(), class07761.N(var0x, "team"), class06656.field_1435))
                                             ))
                                          .then(
                                             class07686.y("pushOwnTeam")
                                                .executes(var0x -> N((class07701)var0x.getSource(), class07761.N(var0x, "team"), class06656.field_1440))
                                          ))
                                       .then(
                                          class07686.y("pushOtherTeams")
                                             .executes(var0x -> N((class07701)var0x.getSource(), class07761.N(var0x, "team"), class06656.field_1434))
                                       ))
                                    .then(
                                       class07686.y("always")
                                          .executes(var0x -> N((class07701)var0x.getSource(), class07761.N(var0x, "team"), class06656.field_1437))
                                    )
                              ))
                           .then(
                              class07686.y("prefix")
                                 .then(
                                    class07686.N("prefix", class07698.N(var1))
                                       .executes(var0x -> y((class07701)var0x.getSource(), class07761.N(var0x, "team"), class07698.y(var0x, "prefix")))
                                 )
                           ))
                        .then(
                           class07686.y("suffix")
                              .then(
                                 class07686.N("suffix", class07698.N(var1))
                                    .executes(var0x -> L((class07701)var0x.getSource(), class07761.N(var0x, "team"), class07698.y(var0x, "suffix")))
                              )
                        )
                  )
            )
      );
   }

   private static class00392 N(Collection<class01766> var0) {
      return ((class01766)var0.iterator().next()).yZ();
   }

   private static int N(class07701 var0, Collection<class01766> var1) {
      class06394 class06394 = var0.W().yB();

      for (class01766 class01766 : var1) {
         class06394.u(class01766.method_5820());
      }

      if (var1.size() == 1) {
         var0.N(() -> class00392.N("commands.team.leave.success.single", N(var1)), true);
      } else {
         var0.N(() -> class00392.N("commands.team.leave.success.multiple", var1.size()), true);
      }

      return var1.size();
   }

   private static int N(class07701 var0, class00502 var1) throws CommandSyntaxException {
      class06394 class06394 = var0.W().yB();
      ArrayList arraylist = Lists.newArrayList(var1.B());
      if (arraylist.isEmpty()) {
         throw y.create();
      } else {
         for (String s : arraylist) {
            class06394.y(s, var1);
         }

         var0.N(() -> class00392.N("commands.team.empty.success", arraylist.size(), var1.i()), true);
         return arraylist.size();
      }
   }

   private static int N(class07701 var0, String var1) throws CommandSyntaxException {
      return N(var0, var1, class00392.y(var1));
   }

   private static int N(class07701 var0, String var1, class00392 var2) throws CommandSyntaxException {
      class06394 class06394 = var0.W().yB();
      if (class06394.y(var1) != null) {
         throw N.create();
      } else {
         class00502 class00502 = class06394.L(var1);
         class00502.N(var2);
         var0.N(() -> class00392.N("commands.team.add.success", class00502.i()), true);
         return class06394.i().size();
      }
   }

   private static int N(class07701 var0, class00502 var1, class06541 var2) throws CommandSyntaxException {
      if (var1.P() == var2) {
         throw u.create();
      } else {
         var1.N(var2);
         var0.N(() -> class00392.N("commands.team.option.color.success", var1.i(), var2.R()), true);
         return 0;
      }
   }

   private static int N(class07701 var0) {
      Collection<class00502> collection = var0.W().yB().i();
      if (collection.isEmpty()) {
         var0.N(() -> class00392.L("commands.team.list.teams.empty"), false);
      } else {
         var0.N(() -> class00392.N("commands.team.list.teams.success", collection.size(), class00390.y(collection, class00502::i)), false);
      }

      return collection.size();
   }

   private static int N(class07701 var0, class00502 var1, class00392 var2) throws CommandSyntaxException {
      if (var1.u().equals(var2)) {
         throw L.create();
      } else {
         var1.N(var2);
         var0.N(() -> class00392.N("commands.team.option.name.success", var1.i()), true);
         return 0;
      }
   }

   private static int N(class07701 var0, class00502 var1, boolean var2) throws CommandSyntaxException {
      if (var1.z() == var2) {
         if (var2) {
            throw M.create();
         } else {
            throw B.create();
         }
      } else {
         var1.y(var2);
         var0.N(() -> class00392.N("commands.team.option.seeFriendlyInvisibles." + (var2 ? "enabled" : "disabled"), var1.i()), true);
         return 0;
      }
   }

   private static int N(class07701 var0, class00502 var1, class06656 var2) throws CommandSyntaxException {
      if (var1.W() == var2) {
         throw U.create();
      } else {
         var1.N(var2);
         var0.N(() -> class00392.N("commands.team.option.collisionRule.success", var1.i(), var2.N()), true);
         return 0;
      }
   }

   private static int N(class07701 var0, class00502 var1, class06672 var2) throws CommandSyntaxException {
      if (var1.U() == var2) {
         throw Z.create();
      } else {
         var1.N(var2);
         var0.N(() -> class00392.N("commands.team.option.nametagVisibility.success", var1.i(), var2.N()), true);
         return 0;
      }
   }
}
