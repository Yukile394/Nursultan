package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class class06405 {
   private static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(var0 -> (class00392)var0);
   private static final Dynamic2CommandExceptionType y = new Dynamic2CommandExceptionType(
      (var0, var1) -> class00392.y("commands.advancement.criterionNotFound", var0, var1)
   );

   public class06405() {
      super();
   }

   private static void N(class03734 var0, List<class03711> var1) {
      for (class03734 class03734 : var0.i()) {
         var1.add(class03734.y());
         N(class03734, var1);
      }
   }

   private static List<class03711> N(CommandContext<class07701> var0, class03711 var1, class06402 var2) {
      class03734 class03734x = ((class07701)var0.getSource()).W().Nh().N().N(var1);
      if (class03734x == null) {
         return List.of(var1);
      } else {
         ArrayList arraylist = new ArrayList();
         if (var2.field_13460) {
            for (class03734 class03734x = class03734x.L(); class03734x != null; class03734x = class03734x.L()) {
               arraylist.add(class03734x.y());
            }
         }

         arraylist.add(var1);
         if (var2.field_13459) {
            N(class03734x, arraylist);
         }

         return arraylist;
      }
   }

   private static int N(class07701 var0, Collection<class04770> var1, class06430 var2, Collection<class03711> var3) throws CommandSyntaxException {
      return N(var0, var1, var2, var3, true);
   }

   private static int N(class07701 var0, Collection<class04770> var1, class06430 var2, Collection<class03711> var3, boolean var4) throws CommandSyntaxException {
      int i = 0;

      for (class04770 class04770 : var1) {
         i += var2.N(class04770, var3, var4);
      }

      if (i == 0) {
         if (var3.size() == 1) {
            if (var1.size() == 1) {
               throw N.create(
                  class00392.N(
                     var2.N() + ".one.to.one.failure", class07151.N((class03711)var3.iterator().next()), ((class04770)var1.iterator().next()).method_5476()
                  )
               );
            } else {
               throw N.create(class00392.N(var2.N() + ".one.to.many.failure", class07151.N((class03711)var3.iterator().next()), var1.size()));
            }
         } else if (var1.size() == 1) {
            throw N.create(class00392.N(var2.N() + ".many.to.one.failure", var3.size(), ((class04770)var1.iterator().next()).method_5476()));
         } else {
            throw N.create(class00392.N(var2.N() + ".many.to.many.failure", var3.size(), var1.size()));
         }
      } else {
         if (var3.size() == 1) {
            if (var1.size() == 1) {
               var0.N(
                  () -> class00392.N(
                     var2.N() + ".one.to.one.success", class07151.N((class03711)var3.iterator().next()), ((class04770)var1.iterator().next()).method_5476()
                  ),
                  true
               );
            } else {
               var0.N(() -> class00392.N(var2.N() + ".one.to.many.success", class07151.N((class03711)var3.iterator().next()), var1.size()), true);
            }
         } else if (var1.size() == 1) {
            var0.N(() -> class00392.N(var2.N() + ".many.to.one.success", var3.size(), ((class04770)var1.iterator().next()).method_5476()), true);
         } else {
            var0.N(() -> class00392.N(var2.N() + ".many.to.many.success", var3.size(), var1.size()), true);
         }

         return i;
      }
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("advancement").requires(class07686.N(class07686.u)))
               .then(
                  class07686.y("grant")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N(
                                          "targets", class07680.u()
                                       )
                                       .then(
                                          class07686.y("only")
                                             .then(
                                                ((RequiredArgumentBuilder)class07686.N("advancement", class04403.N(class04227.yK))
                                                      .executes(
                                                         var0x -> N(
                                                            (class07701)var0x.getSource(),
                                                            class07680.R(var0x, "targets"),
                                                            class06430.field_13457,
                                                            N(var0x, class04403.i(var0x, "advancement"), class06402.field_13464)
                                                         )
                                                      ))
                                                   .then(
                                                      class07686.N("criterion", StringArgumentType.greedyString())
                                                         .suggests((var0x, var1) -> class07689.y(class04403.i(var0x, "advancement").y().i().keySet(), var1))
                                                         .executes(
                                                            var0x -> N(
                                                               (class07701)var0x.getSource(),
                                                               class07680.R(var0x, "targets"),
                                                               class06430.field_13457,
                                                               class04403.i(var0x, "advancement"),
                                                               StringArgumentType.getString(var0x, "criterion")
                                                            )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       class07686.y("from")
                                          .then(
                                             class07686.N("advancement", class04403.N(class04227.yK))
                                                .executes(
                                                   var0x -> N(
                                                      (class07701)var0x.getSource(),
                                                      class07680.R(var0x, "targets"),
                                                      class06430.field_13457,
                                                      N(var0x, class04403.i(var0x, "advancement"), class06402.field_13458)
                                                   )
                                                )
                                          )
                                    ))
                                 .then(
                                    class07686.y("until")
                                       .then(
                                          class07686.N("advancement", class04403.N(class04227.yK))
                                             .executes(
                                                var0x -> N(
                                                   (class07701)var0x.getSource(),
                                                   class07680.R(var0x, "targets"),
                                                   class06430.field_13457,
                                                   N(var0x, class04403.i(var0x, "advancement"), class06402.field_13465)
                                                )
                                             )
                                       )
                                 ))
                              .then(
                                 class07686.y("through")
                                    .then(
                                       class07686.N("advancement", class04403.N(class04227.yK))
                                          .executes(
                                             var0x -> N(
                                                (class07701)var0x.getSource(),
                                                class07680.R(var0x, "targets"),
                                                class06430.field_13457,
                                                N(var0x, class04403.i(var0x, "advancement"), class06402.field_13462)
                                             )
                                          )
                                    )
                              ))
                           .then(
                              class07686.y("everything")
                                 .executes(
                                    var0x -> N(
                                       (class07701)var0x.getSource(),
                                       class07680.R(var0x, "targets"),
                                       class06430.field_13457,
                                       ((class07701)var0x.getSource()).W().Nh().y(),
                                       false
                                    )
                                 )
                           )
                     )
               ))
            .then(
               class07686.y("revoke")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N(
                                       "targets", class07680.u()
                                    )
                                    .then(
                                       class07686.y("only")
                                          .then(
                                             ((RequiredArgumentBuilder)class07686.N("advancement", class04403.N(class04227.yK))
                                                   .executes(
                                                      var0x -> N(
                                                         (class07701)var0x.getSource(),
                                                         class07680.R(var0x, "targets"),
                                                         class06430.field_13456,
                                                         N(var0x, class04403.i(var0x, "advancement"), class06402.field_13464)
                                                      )
                                                   ))
                                                .then(
                                                   class07686.N("criterion", StringArgumentType.greedyString())
                                                      .suggests((var0x, var1) -> class07689.y(class04403.i(var0x, "advancement").y().i().keySet(), var1))
                                                      .executes(
                                                         var0x -> N(
                                                            (class07701)var0x.getSource(),
                                                            class07680.R(var0x, "targets"),
                                                            class06430.field_13456,
                                                            class04403.i(var0x, "advancement"),
                                                            StringArgumentType.getString(var0x, "criterion")
                                                         )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    class07686.y("from")
                                       .then(
                                          class07686.N("advancement", class04403.N(class04227.yK))
                                             .executes(
                                                var0x -> N(
                                                   (class07701)var0x.getSource(),
                                                   class07680.R(var0x, "targets"),
                                                   class06430.field_13456,
                                                   N(var0x, class04403.i(var0x, "advancement"), class06402.field_13458)
                                                )
                                             )
                                       )
                                 ))
                              .then(
                                 class07686.y("until")
                                    .then(
                                       class07686.N("advancement", class04403.N(class04227.yK))
                                          .executes(
                                             var0x -> N(
                                                (class07701)var0x.getSource(),
                                                class07680.R(var0x, "targets"),
                                                class06430.field_13456,
                                                N(var0x, class04403.i(var0x, "advancement"), class06402.field_13465)
                                             )
                                          )
                                    )
                              ))
                           .then(
                              class07686.y("through")
                                 .then(
                                    class07686.N("advancement", class04403.N(class04227.yK))
                                       .executes(
                                          var0x -> N(
                                             (class07701)var0x.getSource(),
                                             class07680.R(var0x, "targets"),
                                             class06430.field_13456,
                                             N(var0x, class04403.i(var0x, "advancement"), class06402.field_13462)
                                          )
                                       )
                                 )
                           ))
                        .then(
                           class07686.y("everything")
                              .executes(
                                 var0x -> N(
                                    (class07701)var0x.getSource(),
                                    class07680.R(var0x, "targets"),
                                    class06430.field_13456,
                                    ((class07701)var0x.getSource()).W().Nh().y()
                                 )
                              )
                        )
                  )
            )
      );
   }

   private static int N(class07701 var0, Collection<class04770> var1, class06430 var2, class03711 var3, String var4) throws CommandSyntaxException {
      int i = 0;
      if (!var3.y().i().containsKey(var4)) {
         throw y.create(class07151.N(var3), var4);
      } else {
         for (class04770 class04770 : var1) {
            if (var2.N(class04770, var3, var4)) {
               i++;
            }
         }

         if (i == 0) {
            if (var1.size() == 1) {
               throw N.create(
                  class00392.N(var2.N() + ".criterion.to.one.failure", var4, class07151.N(var3), ((class04770)var1.iterator().next()).method_5476())
               );
            } else {
               throw N.create(class00392.N(var2.N() + ".criterion.to.many.failure", var4, class07151.N(var3), var1.size()));
            }
         } else {
            if (var1.size() == 1) {
               var0.N(
                  () -> class00392.N(var2.N() + ".criterion.to.one.success", var4, class07151.N(var3), ((class04770)var1.iterator().next()).method_5476()),
                  true
               );
            } else {
               var0.N(() -> class00392.N(var2.N() + ".criterion.to.many.success", var4, class07151.N(var3), var1.size()), true);
            }

            return i;
         }
      }
   }
}
