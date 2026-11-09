package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;

public class class05627 {
   private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("commands.worldborder.center.failed"));
   private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType(class00392.L("commands.worldborder.set.failed.nochange"));
   private static final SimpleCommandExceptionType L = new SimpleCommandExceptionType(class00392.L("commands.worldborder.set.failed.small"));
   private static final SimpleCommandExceptionType u = new SimpleCommandExceptionType(class00392.N("commands.worldborder.set.failed.big", 5.999997E7F));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(class00392.N("commands.worldborder.set.failed.far", 2.9999984E7));
   private static final SimpleCommandExceptionType R = new SimpleCommandExceptionType(class00392.L("commands.worldborder.warning.time.failed"));
   private static final SimpleCommandExceptionType M = new SimpleCommandExceptionType(class00392.L("commands.worldborder.warning.distance.failed"));
   private static final SimpleCommandExceptionType B = new SimpleCommandExceptionType(class00392.L("commands.worldborder.damage.buffer.failed"));
   private static final SimpleCommandExceptionType Z = new SimpleCommandExceptionType(class00392.L("commands.worldborder.damage.amount.failed"));

   public class05627() {
      super();
   }

   private static int y(class07701 var0, float var1) throws CommandSyntaxException {
      class08057 class08057 = var0.R().method_8621();
      if (class08057.P() == var1) {
         throw Z.create();
      } else {
         class08057.L((double)var1);
         var0.N(() -> class00392.N("commands.worldborder.damage.amount.success", String.format(Locale.ROOT, "%.2f", var1)), true);
         return (int)var1;
      }
   }

   private static int y(class07701 var0, int var1) throws CommandSyntaxException {
      class08057 class08057 = var0.R().method_8621();
      if (class08057.b() == var1) {
         throw M.create();
      } else {
         class08057.L(var1);
         var0.N(() -> class00392.N("commands.worldborder.warning.distance.success", var1), true);
         return var1;
      }
   }

   private static int N(class07701 var0, float var1) throws CommandSyntaxException {
      class08057 class08057 = var0.R().method_8621();
      if (class08057.m() == var1) {
         throw B.create();
      } else {
         class08057.y((double)var1);
         var0.N(() -> class00392.N("commands.worldborder.damage.buffer.success", String.format(Locale.ROOT, "%.2f", var1)), true);
         return (int)var1;
      }
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y(
                                 "worldborder"
                              )
                              .requires(class07686.N(class07686.u)))
                           .then(
                              class07686.y("add")
                                 .then(
                                    ((RequiredArgumentBuilder)class07686.N("distance", DoubleArgumentType.doubleArg(-5.999997E7F, 5.999997E7F))
                                          .executes(
                                             var0x -> N(
                                                (class07701)var0x.getSource(),
                                                ((class07701)var0x.getSource()).R().method_8621().Z() + DoubleArgumentType.getDouble(var0x, "distance"),
                                                0L
                                             )
                                          ))
                                       .then(
                                          class07686.N("time", class07798.N(0))
                                             .executes(
                                                var0x -> N(
                                                   (class07701)var0x.getSource(),
                                                   ((class07701)var0x.getSource()).R().method_8621().Z() + DoubleArgumentType.getDouble(var0x, "distance"),
                                                   ((class07701)var0x.getSource()).R().method_8621().z() + IntegerArgumentType.getInteger(var0x, "time")
                                                )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           class07686.y("set")
                              .then(
                                 ((RequiredArgumentBuilder)class07686.N("distance", DoubleArgumentType.doubleArg(-5.999997E7F, 5.999997E7F))
                                       .executes(var0x -> N((class07701)var0x.getSource(), DoubleArgumentType.getDouble(var0x, "distance"), 0L)))
                                    .then(
                                       class07686.N("time", class07798.N(0))
                                          .executes(
                                             var0x -> N(
                                                (class07701)var0x.getSource(),
                                                DoubleArgumentType.getDouble(var0x, "distance"),
                                                IntegerArgumentType.getInteger(var0x, "time")
                                             )
                                          )
                                    )
                              )
                        ))
                     .then(
                        class07686.y("center")
                           .then(class07686.N("pos", class00887.N()).executes(var0x -> N((class07701)var0x.getSource(), class00887.N(var0x, "pos"))))
                     ))
                  .then(
                     ((LiteralArgumentBuilder)class07686.y("damage")
                           .then(
                              class07686.y("amount")
                                 .then(
                                    class07686.N("damagePerBlock", FloatArgumentType.floatArg(0.0F))
                                       .executes(var0x -> y((class07701)var0x.getSource(), FloatArgumentType.getFloat(var0x, "damagePerBlock")))
                                 )
                           ))
                        .then(
                           class07686.y("buffer")
                              .then(
                                 class07686.N("distance", FloatArgumentType.floatArg(0.0F))
                                    .executes(var0x -> N((class07701)var0x.getSource(), FloatArgumentType.getFloat(var0x, "distance")))
                              )
                        )
                  ))
               .then(class07686.y("get").executes(var0x -> N((class07701)var0x.getSource()))))
            .then(
               ((LiteralArgumentBuilder)class07686.y("warning")
                     .then(
                        class07686.y("distance")
                           .then(
                              class07686.N("distance", IntegerArgumentType.integer(0))
                                 .executes(var0x -> y((class07701)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "distance")))
                           )
                     ))
                  .then(
                     class07686.y("time")
                        .then(
                           class07686.N("time", class07798.N(0))
                              .executes(var0x -> N((class07701)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "time")))
                        )
                  )
            )
      );
   }

   private static int N(class07701 var0, int var1) throws CommandSyntaxException {
      class08057 class08057 = var0.R().method_8621();
      if (class08057.T() == var1) {
         throw R.create();
      } else {
         class08057.y(var1);
         var0.N(() -> class00392.N("commands.worldborder.warning.time.success", N((long)var1)), true);
         return var1;
      }
   }

   private static String N(long var0) {
      return String.format(Locale.ROOT, "%.2f", var0 / 20.0);
   }

   private static int N(class07701 var0, double var1, long var3) throws CommandSyntaxException {
      class04782 class04782 = var0.R();
      class08057 class08057 = class04782.method_8621();
      double d0 = class08057.Z();
      if (d0 == var1) {
         throw y.create();
      } else if (var1 < 1.0) {
         throw L.create();
      } else if (var1 > 5.999997E7F) {
         throw u.create();
      } else {
         String s = String.format(Locale.ROOT, "%.1f", var1);
         if (var3 > 0L) {
            class08057.N(d0, var1, var3, class04782.N());
            if (var1 > d0) {
               var0.N(() -> class00392.N("commands.worldborder.set.grow", s, N(var3)), true);
            } else {
               var0.N(() -> class00392.N("commands.worldborder.set.shrink", s, N(var3)), true);
            }
         } else {
            class08057.N(var1);
            var0.N(() -> class00392.N("commands.worldborder.set.immediate", s), true);
         }

         return (int)(var1 - d0);
      }
   }

   private static int N(class07701 var0, class07109 var1) throws CommandSyntaxException {
      class08057 class08057 = var0.R().method_8621();
      if (class08057.M() == var1.z && class08057.B() == var1.U) {
         throw N.create();
      } else if (!(Math.abs(var1.z) > 2.9999984E7) && !(Math.abs(var1.U) > 2.9999984E7)) {
         class08057.L(var1.z, var1.U);
         var0.N(
            () -> class00392.N("commands.worldborder.center.success", String.format(Locale.ROOT, "%.2f", var1.z), String.format(Locale.ROOT, "%.2f", var1.U)),
            true
         );
         return 0;
      } else {
         throw i.create();
      }
   }

   private static int N(class07701 var0) {
      double d0 = var0.R().method_8621().Z();
      var0.N(() -> class00392.N("commands.worldborder.get", String.format(Locale.ROOT, "%.0f", d0)), false);
      return class04995.N(d0 + 0.5);
   }
}
