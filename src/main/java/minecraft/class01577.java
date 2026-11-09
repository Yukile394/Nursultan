package minecraft;

import Nursultan.class09474;
import Nursultan.class09518;
import com.google.common.collect.Lists;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.RedirectModifier;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class01577 {
   private static final Logger y = LogUtils.getLogger();
   private static final int L = 32768;
   private static final Dynamic2CommandExceptionType u = new Dynamic2CommandExceptionType(
      (var0, var1) -> class00392.y("commands.execute.blocks.toobig", var0, var1)
   );
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(class00392.L("commands.execute.conditional.fail"));
   private static final DynamicCommandExceptionType R = new DynamicCommandExceptionType(var0 -> class00392.y("commands.execute.conditional.fail_count", var0));
   public static final Dynamic2CommandExceptionType N = new Dynamic2CommandExceptionType(
      (var0, var1) -> class00392.y("commands.execute.function.instantiationFailure", var0, var1)
   );

   private static OptionalInt L(CommandContext<class07701> var0, boolean var1) throws CommandSyntaxException {
      return N(((class07701)var0.getSource()).R(), class00894.N(var0, "start"), class00894.N(var0, "end"), class00894.N(var0, "destination"), var1);
   }

   public class01577() {
      super();
   }

   private static RedirectModifier<class07701> y(Function<class07049, Stream<class07049>> var0) {
      return var1 -> {
         class07701 class07701 = (class07701)var1.getSource();
         class07049 class07049 = class07701.M();
         return class07049 == null ? List.of() : ((Stream)var0.apply(class07049)).filter(var0xx -> !var0xx.method_31481()).map(class07701::N).toList();
      };
   }

   private static int y(CommandContext<class07701> var0, boolean var1) throws CommandSyntaxException {
      OptionalInt optionalint = L(var0, var1);
      if (optionalint.isPresent()) {
         throw R.create(optionalint.getAsInt());
      } else {
         ((class07701)var0.getSource()).N(() -> class00392.L("commands.execute.conditional.pass"), false);
         return 1;
      }
   }

   private static ArgumentBuilder<class07701, ?> N(LiteralCommandNode<class07701> var0, LiteralArgumentBuilder<class07701> var1, boolean var2) {
      var1.then(
         class07686.y("score")
            .then(
               class07686.N("targets", class07786.y())
                  .suggests(class07786.N)
                  .then(
                     class07686.N("objective", class07794.N())
                        .redirect(var0, var1x -> N((class07701)var1x.getSource(), class07786.L(var1x, "targets"), class07794.N(var1x, "objective"), var2))
                  )
            )
      );
      var1.then(
         class07686.y("bossbar")
            .then(
               ((RequiredArgumentBuilder)class07686.N("id", class07778.N())
                     .suggests(class06426.N)
                     .then(class07686.y("value").redirect(var0, var1x -> N((class07701)var1x.getSource(), class06426.N(var1x), true, var2))))
                  .then(class07686.y("max").redirect(var0, var1x -> N((class07701)var1x.getSource(), class06426.N(var1x), false, var2)))
            )
      );

      for (class05622 class05622 : class05616.y) {
         class05622.N(
            var1,
            var3 -> var3.then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N(
                                    "path", class07759.N()
                                 )
                                 .then(
                                    class07686.y("int")
                                       .then(
                                          class07686.N("scale", DoubleArgumentType.doubleArg())
                                             .redirect(
                                                var0,
                                                var2xx -> N(
                                                   (class07701)var2xx.getSource(),
                                                   class05622.N(var2xx),
                                                   class07759.N(var2xx, "path"),
                                                   var1xxx -> class07720.N((int)(var1xxx * DoubleArgumentType.getDouble(var2xx, "scale"))),
                                                   var2
                                                )
                                             )
                                       )
                                 ))
                              .then(
                                 class07686.y("float")
                                    .then(
                                       class07686.N("scale", DoubleArgumentType.doubleArg())
                                          .redirect(
                                             var0,
                                             var2xx -> N(
                                                (class07701)var2xx.getSource(),
                                                class05622.N(var2xx),
                                                class07759.N(var2xx, "path"),
                                                var1xxx -> class07009.N((float)(var1xxx * DoubleArgumentType.getDouble(var2xx, "scale"))),
                                                var2
                                             )
                                          )
                                    )
                              ))
                           .then(
                              class07686.y("short")
                                 .then(
                                    class07686.N("scale", DoubleArgumentType.doubleArg())
                                       .redirect(
                                          var0,
                                          var2xx -> N(
                                             (class07701)var2xx.getSource(),
                                             class05622.N(var2xx),
                                             class07759.N(var2xx, "path"),
                                             var1xxx -> class07730.N((short)(var1xxx * DoubleArgumentType.getDouble(var2xx, "scale"))),
                                             var2
                                          )
                                       )
                                 )
                           ))
                        .then(
                           class07686.y("long")
                              .then(
                                 class07686.N("scale", DoubleArgumentType.doubleArg())
                                    .redirect(
                                       var0,
                                       var2xx -> N(
                                          (class07701)var2xx.getSource(),
                                          class05622.N(var2xx),
                                          class07759.N(var2xx, "path"),
                                          var1xxx -> class07729.N((long)(var1xxx * DoubleArgumentType.getDouble(var2xx, "scale"))),
                                          var2
                                       )
                                    )
                              )
                        ))
                     .then(
                        class07686.y("double")
                           .then(
                              class07686.N("scale", DoubleArgumentType.doubleArg())
                                 .redirect(
                                    var0,
                                    var2xx -> N(
                                       (class07701)var2xx.getSource(),
                                       class05622.N(var2xx),
                                       class07759.N(var2xx, "path"),
                                       var1xxx -> class07019.N(var1xxx * DoubleArgumentType.getDouble(var2xx, "scale")),
                                       var2
                                    )
                                 )
                           )
                     ))
                  .then(
                     class07686.y("byte")
                        .then(
                           class07686.N("scale", DoubleArgumentType.doubleArg())
                              .redirect(
                                 var0,
                                 var2xx -> N(
                                    (class07701)var2xx.getSource(),
                                    class05622.N(var2xx),
                                    class07759.N(var2xx, "path"),
                                    var1xxx -> class07037.N((byte)(var1xxx * DoubleArgumentType.getDouble(var2xx, "scale"))),
                                    var2
                                 )
                              )
                        )
                  )
            )
         );
      }

      return var1;
   }

   private static class07701 N(class07701 var0, class06392 var1, boolean var2, boolean var3) {
      return var0.N((var3x, var4) -> {
         int ix = var3 ? var4 : (var3x ? 1 : 0);
         if (var2) {
            var1.N(ix);
         } else {
            var1.y(ix);
         }
      }, class03102::N);
   }

   public static void N(CommandDispatcher<class07701> var0, class04348 var1) {
      LiteralCommandNode literalcommandnode = var0.register((LiteralArgumentBuilder)class07686.y("execute").requires(class07686.N(class07686.u)));
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y(
                                                         "execute"
                                                      )
                                                      .requires(class07686.N(class07686.u)))
                                                   .then(class07686.y("run").redirect(var0.getRoot())))
                                                .then(N(literalcommandnode, class07686.y("if"), true, var1)))
                                             .then(N(literalcommandnode, class07686.y("unless"), false, var1)))
                                          .then(class07686.y("as").then(class07686.N("targets", class07680.y()).fork(literalcommandnode, var0x -> {
                                             ArrayList arraylist = Lists.newArrayList();

                                             for (class07049 class07049 : class07680.L(var0x, "targets")) {
                                                arraylist.add(((class07701)var0x.getSource()).N(class07049));
                                             }

                                             return arraylist;
                                          }))))
                                       .then(
                                          class07686.y("at")
                                             .then(
                                                class07686.N("targets", class07680.y())
                                                   .fork(
                                                      literalcommandnode,
                                                      var0x -> {
                                                         ArrayList arraylist = Lists.newArrayList();

                                                         for (class07049 class07049 : class07680.L(var0x, "targets")) {
                                                            arraylist.add(
                                                               ((class07701)var0x.getSource())
                                                                  .N((class04782)class07049.method_73183())
                                                                  .N(class07049.method_73189())
                                                                  .N(class07049.method_5802())
                                                            );
                                                         }

                                                         return arraylist;
                                                      }
                                                   )
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)class07686.y("store").then(N(literalcommandnode, class07686.y("result"), true)))
                                          .then(N(literalcommandnode, class07686.y("success"), false))
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("positioned")
                                             .then(
                                                class07686.N("pos", class00881.N())
                                                   .redirect(
                                                      literalcommandnode,
                                                      var0x -> ((class07701)var0x.getSource()).N(class00881.N(var0x, "pos")).N(class07664.field_9853)
                                                   )
                                             ))
                                          .then(class07686.y("as").then(class07686.N("targets", class07680.y()).fork(literalcommandnode, var0x -> {
                                             ArrayList arraylist = Lists.newArrayList();

                                             for (class07049 class07049 : class07680.L(var0x, "targets")) {
                                                arraylist.add(((class07701)var0x.getSource()).N(class07049.method_73189()));
                                             }

                                             return arraylist;
                                          }))))
                                       .then(class07686.y("over").then(class07686.N("heightmap", class03583.N()).redirect(literalcommandnode, var0x -> {
                                          class06889 class06889 = ((class07701)var0x.getSource()).i();
                                          class04782 class04782 = ((class07701)var0x.getSource()).R();
                                          double d0 = class06889.N();
                                          double d1 = class06889.L();
                                          if (!class04782.N(class01296.y(d0), class01296.y(d1))) {
                                             throw class00894.N.create();
                                          } else {
                                             int ix = class04782.method_8624(class03583.N(var0x, "heightmap"), class04995.N(d0), class04995.N(d1));
                                             return ((class07701)var0x.getSource()).N(new class06889(d0, ix, d1));
                                          }
                                       })))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)class07686.y("rotated")
                                       .then(
                                          class07686.N("rot", class00897.N())
                                             .redirect(
                                                literalcommandnode,
                                                var0x -> ((class07701)var0x.getSource()).N(class00897.N(var0x, "rot").y((class07701)var0x.getSource()))
                                             )
                                       ))
                                    .then(class07686.y("as").then(class07686.N("targets", class07680.y()).fork(literalcommandnode, var0x -> {
                                       ArrayList arraylist = Lists.newArrayList();

                                       for (class07049 class07049 : class07680.L(var0x, "targets")) {
                                          arraylist.add(((class07701)var0x.getSource()).N(class07049.method_5802()));
                                       }

                                       return arraylist;
                                    })))
                              ))
                           .then(
                              ((LiteralArgumentBuilder)class07686.y("facing")
                                    .then(
                                       class07686.y("entity")
                                          .then(
                                             class07686.N("targets", class07680.y())
                                                .then(class07686.N("anchor", class07687.N()).fork(literalcommandnode, var0x -> {
                                                   ArrayList arraylist = Lists.newArrayList();
                                                   class07664 class07664 = class07687.N(var0x, "anchor");

                                                   for (class07049 class07049 : class07680.L(var0x, "targets")) {
                                                      arraylist.add(((class07701)var0x.getSource()).N(class07049, class07664));
                                                   }

                                                   return arraylist;
                                                }))
                                          )
                                    ))
                                 .then(
                                    class07686.N("pos", class00881.N())
                                       .redirect(literalcommandnode, var0x -> ((class07701)var0x.getSource()).y(class00881.N(var0x, "pos")))
                                 )
                           ))
                        .then(
                           class07686.y("align")
                              .then(
                                 class07686.N("axes", class00879.N())
                                    .redirect(
                                       literalcommandnode,
                                       var0x -> ((class07701)var0x.getSource()).N(((class07701)var0x.getSource()).i().N(class00879.N(var0x, "axes")))
                                    )
                              )
                        ))
                     .then(
                        class07686.y("anchored")
                           .then(
                              class07686.N("anchor", class07687.N())
                                 .redirect(literalcommandnode, var0x -> ((class07701)var0x.getSource()).N(class07687.N(var0x, "anchor")))
                           )
                     ))
                  .then(
                     class07686.y("in")
                        .then(
                           class07686.N("dimension", class07678.N())
                              .redirect(literalcommandnode, var0x -> ((class07701)var0x.getSource()).N(class07678.N(var0x, "dimension")))
                        )
                  ))
               .then(
                  class07686.y("summon")
                     .then(
                        class07686.N("entity", class03784.N(var1, class04227.I))
                           .suggests(class06791.N(class06791.L))
                           .redirect(literalcommandnode, var0x -> N((class07701)var0x.getSource(), class03784.i(var0x, "entity")))
                     )
               ))
            .then(N(literalcommandnode, class07686.y("on")))
      );
   }

   private static boolean N(class04782 var0, class07209 var1) {
      class07321 class07321 = new class07321(var1);
      class00570 class00570 = var0.method_14178().N(class07321.B, class07321.Z);
      return class00570 == null ? false : class00570.g() == class04763.field_13877 && var0.method_37116(class07321.y());
   }

   private static class07701 N(class07701 var0, class05598 var1, class07793 var2, IntFunction<class07709> var3, boolean var4) {
      return var0.N((var4x, var5) -> {
         try {
            class07001 class07001 = var1.N();
            int ix = var4 ? var5 : (var4x ? 1 : 0);
            var2.N(class07001, (class07709)var3.apply(ix));
            var1.N(class07001);
         } catch (CommandSyntaxException commandsyntaxexception) {
         }
      }, class03102::N);
   }

   private static class07701 N(class07701 var0, Collection<class01766> var1, class00518 var2, boolean var3) {
      class06394 class06394 = var0.W().yB();
      return var0.N((var4x, var5) -> {
         for (class01766 class01766 : var1) {
            class01765 class01765 = class06394.N(class01766, var2);
            int ix = var3 ? var5 : (var4x ? 1 : 0);
            class01765.N(ix);
         }
      }, class03102::N);
   }

   private static ArgumentBuilder<class07701, ?> N(CommandNode<class07701> var0, ArgumentBuilder<class07701, ?> var1, boolean var2, class01550 var3) {
      return var1.fork(var0, var2x -> N(var2x, var2, var3.test(var2x))).executes(var2x -> {
         if (var2 == var3.test(var2x)) {
            ((class07701)var2x.getSource()).N(() -> class00392.L("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw i.create();
         }
      });
   }

   private static boolean N(CommandContext<class07701> var0, class00836 var1) throws CommandSyntaxException {
      class01766 class01766 = class07786.N(var0, "target");
      class00518 class00518 = class07794.N(var0, "targetObjective");
      class01788 class01788 = ((class07701)var0.getSource()).W().yB().y(class01766, class00518);
      return class01788 == null ? false : var1.u(class01788.y());
   }

   private static ArgumentBuilder<class07701, ?> N(CommandNode<class07701> var0, ArgumentBuilder<class07701, ?> var1, boolean var2, boolean var3) {
      return var1.fork(var0, var2x -> N(var2x, var2, L(var2x, var3).isPresent())).executes(var2 ? var1x -> N(var1x, var3) : var1x -> y(var1x, var3));
   }

   private static boolean N(CommandContext<class07701> var0, class00816 var1) throws CommandSyntaxException {
      class01894 class01894 = class07778.N(var0, "id");
      class08192 class08192 = ((class07701)var0.getSource()).W().yz().N(class01894);
      if (class08192 == null) {
         throw class06956.N.create(class01894);
      } else {
         long ix = class08170.y();
         double d0 = class08192.y(ix);
         return var1.u(d0);
      }
   }

   private static Collection<class07701> N(CommandContext<class07701> var0, boolean var1, boolean var2) {
      return (Collection<class07701>)(var2 == var1 ? Collections.singleton((class07701)var0.getSource()) : Collections.emptyList());
   }

   private static LiteralArgumentBuilder<class07701> N(CommandNode<class07701> var0, LiteralArgumentBuilder<class07701> var1) {
      return (LiteralArgumentBuilder<class07701>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)var1.then(
                              class07686.y("owner")
                                 .fork(
                                    var0,
                                    N(
                                       (Function<class07049, Optional<class07049>>)(var0x -> var0x instanceof class02145
                                          ? Optional.ofNullable(((class02145)var0x).L_())
                                          : Optional.empty())
                                    )
                                 )
                           ))
                           .then(
                              class07686.y("leasher")
                                 .fork(
                                    var0,
                                    N(
                                       (Function<class07049, Optional<class07049>>)(var0x -> var0x instanceof class02607
                                          ? Optional.ofNullable(((class02607)var0x).yW())
                                          : Optional.empty())
                                    )
                                 )
                           ))
                        .then(
                           class07686.y("target")
                              .fork(
                                 var0,
                                 N(
                                    (Function<class07049, Optional<class07049>>)(var0x -> var0x instanceof class01956
                                       ? Optional.ofNullable(((class01956)var0x).T())
                                       : Optional.empty())
                                 )
                              )
                        ))
                     .then(
                        class07686.y("attacker")
                           .fork(
                              var0,
                              N(
                                 (Function<class07049, Optional<class07049>>)(var0x -> var0x instanceof class01959
                                    ? Optional.ofNullable(((class01959)var0x).method_49107())
                                    : Optional.empty())
                              )
                           )
                     ))
                  .then(class07686.y("vehicle").fork(var0, N((Function<class07049, Optional<class07049>>)(var0x -> Optional.ofNullable(var0x.method_5854()))))))
               .then(class07686.y("controller").fork(var0, N((Function<class07049, Optional<class07049>>)(var0x -> Optional.ofNullable(var0x.method_5642()))))))
            .then(
               class07686.y("origin")
                  .fork(
                     var0,
                     N(
                        (Function<class07049, Optional<class07049>>)(var0x -> var0x instanceof class03244
                           ? Optional.ofNullable(((class03244)var0x).z())
                           : Optional.empty())
                     )
                  )
            ))
         .then(class07686.y("passengers").fork(var0, y((Function<class07049, Stream<class07049>>)(var0x -> var0x.method_5685().stream()))));
   }

   private static int N(CommandContext<class07701> var0, boolean var1) throws CommandSyntaxException {
      OptionalInt optionalint = L(var0, var1);
      if (optionalint.isPresent()) {
         ((class07701)var0.getSource()).N(() -> class00392.N("commands.execute.conditional.pass_count", optionalint.getAsInt()), false);
         return optionalint.getAsInt();
      } else {
         throw i.create();
      }
   }

   private static RedirectModifier<class07701> N(Function<class07049, Optional<class07049>> var0) {
      return var1 -> {
         class07701 class07701 = (class07701)var1.getSource();
         class07049 class07049 = class07701.M();
         return (Collection)(class07049 == null
            ? List.of()
            : ((Optional)var0.apply(class07049)).filter(var0xx -> !var0xx.method_31481()).map(var1x -> List.of(class07701.N(var1x))).orElse(List.of()));
      };
   }

   private static OptionalInt N(class04782 var0, class07209 var1, class07209 var2, class07209 var3, boolean var4) throws CommandSyntaxException {
      class05163 class05163 = class05163.N(var1, var2);
      class05163 class05163x = class05163.N(var3, var3.method_10081(class05163.L()));
      class07209 class07209x = new class07209(class05163x.B() - class05163.B(), class05163x.Z() - class05163.Z(), class05163x.z() - class05163.z());
      int ix = class05163.u() * class05163.i() * class05163.R();
      if (ix > 32768) {
         throw u.create(32768, ix);
      } else {
         int j = 0;
         class01042 class01042 = var0.method_30349();

         try (class04495 class04495 = new class04495(y)) {
            for (int k = class05163.z(); k <= class05163.W(); k++) {
               for (int l = class05163.Z(); l <= class05163.E(); l++) {
                  for (int i1 = class05163.B(); i1 <= class05163.U(); i1++) {
                     class07209 class07209x = new class07209(i1, l, k);
                     class07209 class07209xx = class07209x.method_10081(class07209x);
                     class00500 class00500 = var0.method_8320(class07209x);
                     if (!var4 || !class00500.N(class00869.N)) {
                        if (class00500 != var0.method_8320(class07209xx)) {
                           return OptionalInt.empty();
                        }

                        class00394 class00394x = var0.method_8321(class07209x);
                        class00394 class00394x = var0.method_8321(class07209xx);
                        if (class00394x != null) {
                           if (class00394x == null) {
                              return OptionalInt.empty();
                           }

                           if (class00394x.O() != class00394x.O()) {
                              return OptionalInt.empty();
                           }

                           if (!class00394x.I().equals(class00394x.I())) {
                              return OptionalInt.empty();
                           }

                           class08303 class08303x = class08303.N(class04495.N_46(class00394x.J()), class01042);
                           class00394x.R(class08303x);
                           class07001 class07001x = class08303x.y();
                           class08303 class08303x = class08303.N(class04495.N_46(class00394x.J()), class01042);
                           class00394x.R(class08303x);
                           class07001 class07001x = class08303x.y();
                           if (!class07001x.equals(class07001x)) {
                              return OptionalInt.empty();
                           }
                        }

                        j++;
                     }
                  }
               }
            }
         }

         return OptionalInt.of(j);
      }
   }

   private static boolean N(class07701 var0, class03556<class05957> var1) {
      class04782 class04782 = var0.R();
      class04162 class04162 = new class04160(class04782).N(class06551.B, var0.i()).y(class06551.N, var0.M()).N(class06925.i);
      class05908 class05908 = new class05927(class04162).N(Optional.empty());
      class05908.y(class05908.N((class05957)var1.N()));
      return ((class05957)var1.N()).test(class05908);
   }

   public static <T extends class01711<T>> void N(
      T var0,
      List<T> var1,
      Function<T, T> var2,
      IntPredicate var3,
      ContextChain<T> var4,
      @Nullable class07001 var5,
      class01744<T> var6,
      class08608<CommandContext<T>, Collection<class07684<T>>> var7,
      class03126 var8
   ) {
      ArrayList arraylist = new ArrayList(var1.size());

      Collection collection;
      try {
         collection = (Collection)var7.apply(var4.getTopContext().copyFor(var0));
      } catch (CommandSyntaxException commandsyntaxexception) {
         var0.N(commandsyntaxexception, var8.N(), var6.N());
         return;
      }

      int ix = collection.size();
      if (ix != 0) {
         ArrayList arraylist1 = new ArrayList(ix);

         try {
            for (class07684 class07684 : collection) {
               try {
                  arraylist1.add(class07684.N(var5, var0.l()));
               } catch (class01878 class01878) {
                  throw N.create(class07684.N(), class01878.N());
               }
            }
         } catch (CommandSyntaxException commandsyntaxexception1) {
            var0.N(commandsyntaxexception1, var8.N(), var6.N());
         }

         for (class01711 class01711 : var1) {
            class01711 class01711x = (class01711)var2.apply(class01711.w());
            class03102 class03102 = (var3x, var4x) -> {
               if (var3.test(var4x)) {
                  arraylist.add(class01711);
               }
            };
            var6.N(new class03128<>(var2x -> {
               for (class01747 class01747 : arraylist1) {
                  var2x.N(new class01724<T>(class01747, var2x.y().u(), true).N((T)class01711x));
               }

               var2x.N(class03144.N());
            }, class03102));
         }

         ContextChain contextchain = var4.nextStage();
         String s = var4.getTopContext().getInput();
         var6.N(new class09518<>(s, contextchain, var8, (T)var0, arraylist));
      }
   }

   private static class07701 N(class07701 var0, class03529<class07078<?>> var1) throws CommandSyntaxException {
      class07049 class07049 = class06214.N(var0, var1, var0.i(), new class07001(), true);
      return var0.N(class07049);
   }

   private static int N(class07701 var0, class07209 var1, class02466 var2, Predicate<class06584> var3) throws CommandSyntaxException {
      int ix = 0;
      class06695 class06695 = class06352.N(var0, var1, class06352.y);
      int j = class06695.method_5439();
      IntList intlist = var2.N();

      for (int k = 0; k < intlist.size(); k++) {
         int l = intlist.getInt(k);
         if (l >= 0 && l < j) {
            class06584 class06584 = class06695.method_5438(l);
            if (var3.test(class06584)) {
               ix += class06584.c();
            }
         }
      }

      return ix;
   }

   private static Command<class07701> N(boolean var0, class01567 var1) {
      return var0 ? var1x -> {
         int ix = var1.test(var1x);
         if (ix > 0) {
            ((class07701)var1x.getSource()).N(() -> class00392.N("commands.execute.conditional.pass_count", ix), false);
            return ix;
         } else {
            throw i.create();
         }
      } : var1x -> {
         int ix = var1.test(var1x);
         if (ix == 0) {
            ((class07701)var1x.getSource()).N(() -> class00392.L("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw R.create(ix);
         }
      };
   }

   private static int N(class05598 var0, class07793 var1) throws CommandSyntaxException {
      return var1.y(var0.N());
   }

   private static ArgumentBuilder<class07701, ?> N(CommandNode<class07701> var0, LiteralArgumentBuilder<class07701> var1, boolean var2, class04348 var3) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)var1.then(
                                       class07686.y("block")
                                          .then(
                                             class07686.N("pos", class00894.N())
                                                .then(
                                                   N(
                                                      var0,
                                                      class07686.N("block", class00878.N(var3)),
                                                      var2,
                                                      var0x -> class00878.N(var0x, "block")
                                                         .test(new class06646(((class07701)var0x.getSource()).R(), class00894.N(var0x, "pos"), true))
                                                   )
                                                )
                                          )
                                    ))
                                    .then(
                                       class07686.y("biome")
                                          .then(
                                             class07686.N("pos", class00894.N())
                                                .then(
                                                   N(
                                                      var0,
                                                      class07686.N("biome", class03789.N(var3, class04227.NA)),
                                                      var2,
                                                      var0x -> class03789.N(var0x, "biome", class04227.NA)
                                                         .test(((class07701)var0x.getSource()).R().i(class00894.N(var0x, "pos")))
                                                   )
                                                )
                                          )
                                    ))
                                 .then(
                                    class07686.y("loaded")
                                       .then(
                                          N(
                                             var0,
                                             class07686.N("pos", class00894.N()),
                                             var2,
                                             var0x -> N(((class07701)var0x.getSource()).R(), class00894.y(var0x, "pos"))
                                          )
                                       )
                                 ))
                              .then(
                                 class07686.y("dimension")
                                    .then(
                                       N(
                                          var0,
                                          class07686.N("dimension", class07678.N()),
                                          var2,
                                          var0x -> class07678.N(var0x, "dimension") == ((class07701)var0x.getSource()).R()
                                       )
                                    )
                              ))
                           .then(
                              class07686.y("score")
                                 .then(
                                    class07686.N("target", class07786.N())
                                       .suggests(class07786.N)
                                       .then(
                                          ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N(
                                                               "targetObjective", class07794.N()
                                                            )
                                                            .then(
                                                               class07686.y("=")
                                                                  .then(
                                                                     class07686.N("source", class07786.N())
                                                                        .suggests(class07786.N)
                                                                        .then(
                                                                           N(
                                                                              var0,
                                                                              class07686.N("sourceObjective", class07794.N()),
                                                                              var2,
                                                                              var0x -> N(var0x, (var0xx, var1x) -> var0xx == var1x)
                                                                           )
                                                                        )
                                                                  )
                                                            ))
                                                         .then(
                                                            class07686.y("<")
                                                               .then(
                                                                  class07686.N("source", class07786.N())
                                                                     .suggests(class07786.N)
                                                                     .then(
                                                                        N(
                                                                           var0,
                                                                           class07686.N("sourceObjective", class07794.N()),
                                                                           var2,
                                                                           var0x -> N(var0x, (var0xx, var1x) -> var0xx < var1x)
                                                                        )
                                                                     )
                                                               )
                                                         ))
                                                      .then(
                                                         class07686.y("<=")
                                                            .then(
                                                               class07686.N("source", class07786.N())
                                                                  .suggests(class07786.N)
                                                                  .then(
                                                                     N(
                                                                        var0,
                                                                        class07686.N("sourceObjective", class07794.N()),
                                                                        var2,
                                                                        var0x -> N(var0x, (var0xx, var1x) -> var0xx <= var1x)
                                                                     )
                                                                  )
                                                            )
                                                      ))
                                                   .then(
                                                      class07686.y(">")
                                                         .then(
                                                            class07686.N("source", class07786.N())
                                                               .suggests(class07786.N)
                                                               .then(
                                                                  N(
                                                                     var0,
                                                                     class07686.N("sourceObjective", class07794.N()),
                                                                     var2,
                                                                     var0x -> N(var0x, (var0xx, var1x) -> var0xx > var1x)
                                                                  )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   class07686.y(">=")
                                                      .then(
                                                         class07686.N("source", class07786.N())
                                                            .suggests(class07786.N)
                                                            .then(
                                                               N(
                                                                  var0,
                                                                  class07686.N("sourceObjective", class07794.N()),
                                                                  var2,
                                                                  var0x -> N(var0x, (var0xx, var1x) -> var0xx >= var1x)
                                                               )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                class07686.y("matches")
                                                   .then(N(var0, class07686.N("range", class07788.N()), var2, var0x -> N(var0x, class07767.N(var0x, "range"))))
                                             )
                                       )
                                 )
                           ))
                        .then(
                           class07686.y("blocks")
                              .then(
                                 class07686.N("start", class00894.N())
                                    .then(
                                       class07686.N("end", class00894.N())
                                          .then(
                                             ((RequiredArgumentBuilder)class07686.N("destination", class00894.N())
                                                   .then(N(var0, class07686.y("all"), var2, false)))
                                                .then(N(var0, class07686.y("masked"), var2, true))
                                          )
                                    )
                              )
                        ))
                     .then(
                        class07686.y("entity")
                           .then(
                              ((RequiredArgumentBuilder)class07686.N("entities", class07680.y())
                                    .fork(var0, var1x -> N(var1x, var2, !class07680.L(var1x, "entities").isEmpty())))
                                 .executes(N(var2, (class01567)(var0x -> class07680.L(var0x, "entities").size())))
                           )
                     ))
                  .then(
                     class07686.y("predicate")
                        .then(
                           N(
                              var0,
                              class07686.N("predicate", class02198.L(var3)),
                              var2,
                              var0x -> N((class07701)var0x.getSource(), class02198.L(var0x, "predicate"))
                           )
                        )
                  ))
               .then(class07686.y("function").then(class07686.N("name", class06808.N()).suggests(class01568.L).fork(var0, new class01546(var2)))))
            .then(
               ((LiteralArgumentBuilder)class07686.y("items")
                     .then(
                        class07686.y("entity")
                           .then(
                              class07686.N("entities", class07680.y())
                                 .then(
                                    class07686.N("slots", class02494.N())
                                       .then(
                                          ((RequiredArgumentBuilder)class07686.N("item_predicate", class06793.N(var3))
                                                .fork(
                                                   var0,
                                                   var1x -> N(
                                                      var1x,
                                                      var2,
                                                      N(class07680.y(var1x, "entities"), class02494.N(var1x, "slots"), class06793.N(var1x, "item_predicate"))
                                                         > 0
                                                   )
                                                ))
                                             .executes(
                                                N(
                                                   var2,
                                                   (class01567)(var0x -> N(
                                                      class07680.y(var0x, "entities"), class02494.N(var0x, "slots"), class06793.N(var0x, "item_predicate")
                                                   ))
                                                )
                                             )
                                       )
                                 )
                           )
                     ))
                  .then(
                     class07686.y("block")
                        .then(
                           class07686.N("pos", class00894.N())
                              .then(
                                 class07686.N("slots", class02494.N())
                                    .then(
                                       ((RequiredArgumentBuilder)class07686.N("item_predicate", class06793.N(var3))
                                             .fork(
                                                var0,
                                                var1x -> N(
                                                   var1x,
                                                   var2,
                                                   N(
                                                         (class07701)var1x.getSource(),
                                                         class00894.N(var1x, "pos"),
                                                         class02494.N(var1x, "slots"),
                                                         class06793.N(var1x, "item_predicate")
                                                      )
                                                      > 0
                                                )
                                             ))
                                          .executes(
                                             N(
                                                var2,
                                                (class01567)(var0x -> N(
                                                   (class07701)var0x.getSource(),
                                                   class00894.N(var0x, "pos"),
                                                   class02494.N(var0x, "slots"),
                                                   class06793.N(var0x, "item_predicate")
                                                ))
                                             )
                                          )
                                    )
                              )
                        )
                  )
            ))
         .then(
            class07686.y("stopwatch")
               .then(
                  class07686.N("id", class07778.N())
                     .suggests(class06956.y)
                     .then(N(var0, class07686.N("range", class07788.y()), var2, var0x -> N(var0x, class07766.N(var0x, "range"))))
               )
         );

      for (class05622 class05622 : class05616.L) {
         var1.then(
            class05622.N(
               class07686.y("data"),
               var3x -> var3x.then(
                  ((RequiredArgumentBuilder)class07686.N("path", class07759.N())
                        .fork(var0, var2xx -> N(var2xx, var2, N(class05622.N(var2xx), class07759.N(var2xx, "path")) > 0)))
                     .executes(N(var2, (class01567)(var1xx -> N(class05622.N(var1xx), class07759.N(var1xx, "path")))))
               )
            )
         );
      }

      return var1;
   }

   private static int N(Iterable<? extends class06843> var0, class02466 var1, Predicate<class06584> var2) {
      int ix = 0;

      for (class06843 class06843 : var0) {
         IntList intlist = var1.N();

         for (int j = 0; j < intlist.size(); j++) {
            int k = intlist.getInt(j);
            class04803 class04803 = class06843.method_32318(k);
            if (class04803 != null) {
               class06584 class06584 = class04803.N();
               if (var2.test(class06584)) {
                  ix += class06584.c();
               }
            }
         }
      }

      return ix;
   }

   private static boolean N(CommandContext<class07701> var0, class09474 var1) throws CommandSyntaxException {
      class01766 class01766x = class07786.N(var0, "target");
      class00518 class00518x = class07794.N(var0, "targetObjective");
      class01766 class01766x = class07786.N(var0, "source");
      class00518 class00518x = class07794.N(var0, "sourceObjective");
      class06394 class06394 = ((class07701)var0.getSource()).W().yB();
      class01788 class01788x = class06394.y(class01766x, class00518x);
      class01788 class01788x = class06394.y(class01766x, class00518x);
      return class01788x != null && class01788x != null ? var1.test(class01788x.y(), class01788x.y()) : false;
   }
}
