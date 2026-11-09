package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.function.Consumer;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class class04556 {
   private static final Logger N = LogUtils.getLogger();
   private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType(class00392.L("commands.perf.notRunning"));
   private static final SimpleCommandExceptionType L = new SimpleCommandExceptionType(class00392.L("commands.perf.alreadyRunning"));

   public class04556() {
      super();
   }

   private static int y(class07701 var0) throws CommandSyntaxException {
      class02796 class02796 = var0.W();
      if (!class02796.ys()) {
         throw y.create();
      } else {
         class02796.yb();
         return 0;
      }
   }

   private static int N(class07701 var0) throws CommandSyntaxException {
      class02796 class02796 = var0.W();
      if (class02796.ys()) {
         throw L.create();
      } else {
         Consumer consumer = var1x -> N(var0, var1x);
         Consumer consumer1 = var2x -> N(var0, var2x, class02796);
         class02796.N(consumer, consumer1);
         var0.N(() -> class00392.L("commands.perf.started"), false);
         return 0;
      }
   }

   private static void N(class07701 var0, Path var1, class02796 var2) {
      String s = String.format(Locale.ROOT, "%s-%s-%s", class07536.R(), var2.yn().u(), class07529.y().comp_4024());

      String s1;
      try {
         s1 = class06290.N(class04524.N, s, ".zip");
      } catch (IOException ioexception1) {
         var0.y(class00392.L("commands.perf.reportFailed"));
         N.error("Failed to create report name", ioexception1);
         return;
      }

      try (class03423 class03423 = new class03423(class04524.N.resolve(s1))) {
         class03423.N(Paths.get("system.txt"), var2.y(new class03463()).N());
         class03423.N(var1);
      }

      try {
         FileUtils.forceDelete(var1.toFile());
      } catch (IOException ioexception) {
         N.warn("Failed to delete temporary profiling file {}", var1, ioexception);
      }

      var0.N(() -> class00392.N("commands.perf.reportSaved", s1), false);
   }

   private static void N(class07701 var0, class04681 var1) {
      if (var1 != class04645.N) {
         int i = var1.R();
         double d0 = (double)var1.M() / class01517.N;
         var0.N(() -> class00392.N("commands.perf.stopped", String.format(Locale.ROOT, "%.2f", d0), i, String.format(Locale.ROOT, "%.2f", i / d0)), false);
      }
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("perf").requires(class07686.N(class07686.R)))
               .then(class07686.y("start").executes(var0x -> N((class07701)var0x.getSource()))))
            .then(class07686.y("stop").executes(var0x -> y((class07701)var0x.getSource())))
      );
   }
}
