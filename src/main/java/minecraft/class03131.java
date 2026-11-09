package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Locale;

public class class03131 {
   private static final float N = 10000.0F;
   private static final String y = String.valueOf(20);

   private static int L(class07701 var0) {
      if (var0.W().yW().L()) {
         var0.N(() -> class00392.L("commands.tick.sprint.stop.success"), true);
         return 1;
      } else {
         var0.y(class00392.L("commands.tick.sprint.stop.fail"));
         return 0;
      }
   }

   public class03131() {
      super();
   }

   private static int y(class07701 var0, int var1) {
      if (var0.W().yW().N(var1)) {
         var0.N(() -> class00392.N("commands.tick.step.success", var1), true);
      } else {
         var0.y(class00392.L("commands.tick.step.fail"));
      }

      return 1;
   }

   private static int y(class07701 var0) {
      if (var0.W().yW().y()) {
         var0.N(() -> class00392.L("commands.tick.step.stop.success"), true);
         return 1;
      } else {
         var0.y(class00392.L("commands.tick.step.stop.fail"));
         return 0;
      }
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y(
                                 "tick"
                              )
                              .requires(class07686.N(class07686.i)))
                           .then(class07686.y("query").executes(var0x -> N((class07701)var0x.getSource()))))
                        .then(
                           class07686.y("rate")
                              .then(
                                 class07686.N("rate", FloatArgumentType.floatArg(1.0F, 10000.0F))
                                    .suggests((var0x, var1) -> class07689.N(new String[]{y}, var1))
                                    .executes(var0x -> N((class07701)var0x.getSource(), FloatArgumentType.getFloat(var0x, "rate")))
                              )
                        ))
                     .then(
                        ((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("step").executes(var0x -> y((class07701)var0x.getSource(), 1)))
                              .then(class07686.y("stop").executes(var0x -> y((class07701)var0x.getSource()))))
                           .then(
                              class07686.N("time", class07798.N(1))
                                 .suggests((var0x, var1) -> class07689.N(new String[]{"1t", "1s"}, var1))
                                 .executes(var0x -> y((class07701)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "time")))
                           )
                     ))
                  .then(
                     ((LiteralArgumentBuilder)class07686.y("sprint").then(class07686.y("stop").executes(var0x -> L((class07701)var0x.getSource()))))
                        .then(
                           class07686.N("time", class07798.N(1))
                              .suggests((var0x, var1) -> class07689.N(new String[]{"60s", "1d", "3d"}, var1))
                              .executes(var0x -> N((class07701)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "time")))
                        )
                  ))
               .then(class07686.y("unfreeze").executes(var0x -> N((class07701)var0x.getSource(), false))))
            .then(class07686.y("freeze").executes(var0x -> N((class07701)var0x.getSource(), true)))
      );
   }

   private static int N(class07701 var0, boolean var1) {
      class03143 class03143 = var0.W().yW();
      if (var1) {
         if (class03143.N()) {
            class03143.L();
         }

         if (class03143.z()) {
            class03143.y();
         }
      }

      class03143.N(var1);
      if (var1) {
         var0.N(() -> class00392.L("commands.tick.status.frozen"), true);
      } else {
         var0.N(() -> class00392.L("commands.tick.status.running"), true);
      }

      return var1 ? 1 : 0;
   }

   private static String N(long var0) {
      return String.format(Locale.ROOT, "%.1f", (float)var0 / (float)class01517.y);
   }

   private static int N(class07701 var0) {
      class03143 class03143 = var0.W().yW();
      String s = N(var0.W().ym());
      float f = class03143.R();
      String s1 = String.format(Locale.ROOT, "%.1f", f);
      if (class03143.N()) {
         var0.N(() -> class00392.L("commands.tick.status.sprinting"), false);
         var0.N(() -> class00392.N("commands.tick.query.rate.sprinting", s1, s), false);
      } else {
         if (class03143.E()) {
            var0.N(() -> class00392.L("commands.tick.status.frozen"), false);
         } else if (class03143.B() < var0.W().ym()) {
            var0.N(() -> class00392.L("commands.tick.status.lagging"), false);
         } else {
            var0.N(() -> class00392.L("commands.tick.status.running"), false);
         }

         String s2 = N(class03143.B());
         var0.N(() -> class00392.N("commands.tick.query.rate.running", s1, s, s2), false);
      }

      long[] along = Arrays.copyOf(var0.W().yP(), var0.W().yP().length);
      Arrays.sort(along);
      String s3 = N(along[along.length / 2]);
      String s4 = N(along[(int)(along.length * 0.95)]);
      String s5 = N(along[(int)(along.length * 0.99)]);
      var0.N(() -> class00392.N("commands.tick.query.percentiles", s3, s4, s5, along.length), false);
      return (int)f;
   }

   private static int N(class07701 var0, int var1) {
      if (var0.W().yW().y(var1)) {
         var0.N(() -> class00392.L("commands.tick.sprint.stop.success"), true);
      }

      var0.N(() -> class00392.L("commands.tick.status.sprinting"), true);
      return 1;
   }

   private static int N(class07701 var0, float var1) {
      var0.W().yW().N(var1);
      String s = String.format(Locale.ROOT, "%.1f", var1);
      var0.N(() -> class00392.N("commands.tick.rate.success", s), true);
      return (int)var1;
   }
}
