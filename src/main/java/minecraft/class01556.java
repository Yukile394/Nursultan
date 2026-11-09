package minecraft;

import com.google.common.base.Stopwatch;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.time.Duration;
import java.util.Optional;
import org.slf4j.Logger;

public class class01556 {
   private static final Logger N = LogUtils.getLogger();
   private static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(var0 -> class00392.y("commands.locate.structure.not_found", var0));
   private static final DynamicCommandExceptionType L = new DynamicCommandExceptionType(var0 -> class00392.y("commands.locate.structure.invalid", var0));
   private static final DynamicCommandExceptionType u = new DynamicCommandExceptionType(var0 -> class00392.y("commands.locate.biome.not_found", var0));
   private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType(var0 -> class00392.y("commands.locate.poi.not_found", var0));
   private static final int R = 100;
   private static final int M = 6400;
   private static final int B = 32;
   private static final int Z = 64;
   private static final int z = 256;

   public class01556() {
      super();
   }

   private static int y(class07701 var0, class03782<class05369> var1) throws CommandSyntaxException {
      class07209 class07209 = class07209.method_49638(var0.i());
      class04782 class04782 = var0.R();
      Stopwatch stopwatch = Stopwatch.createStarted(class07536.i);
      Optional optional = class04782.method_19494().y(var1, class07209, 256, class05372.field_18489);
      stopwatch.stop();
      if (optional.isEmpty()) {
         throw i.create(var1.y());
      } else {
         return N(var0, var1, class07209, ((Pair)optional.get()).swap(), "commands.locate.poi.success", false, stopwatch.elapsed());
      }
   }

   public static void N(CommandDispatcher<class07701> var0, class04348 var1) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("locate")
                     .requires(class07686.N(class07686.u)))
                  .then(
                     class07686.y("structure")
                        .then(
                           class07686.N("structure", class04434.N(class04227.yj))
                              .executes(var0x -> N((class07701)var0x.getSource(), class04434.N(var0x, "structure", class04227.yj, L)))
                        )
                  ))
               .then(
                  class07686.y("biome")
                     .then(
                        class07686.N("biome", class03789.N(var1, class04227.NA))
                           .executes(var0x -> N((class07701)var0x.getSource(), class03789.N(var0x, "biome", class04227.NA)))
                     )
               ))
            .then(
               class07686.y("poi")
                  .then(
                     class07686.N("poi", class03789.N(var1, class04227.NZ))
                        .executes(var0x -> y((class07701)var0x.getSource(), class03789.N(var0x, "poi", class04227.NZ)))
                  )
            )
      );
   }

   private static Optional<? extends class03550<class04748>> N(class04428<class04748> var0, class00751<class04748> var1) {
      return (Optional<? extends class03550<class04748>>)var0.N().map(var1x -> var1.N(var1x).map(var0xx -> class03543.N(var0xx)), var1::N);
   }

   private static float N(int var0, int var1, int var2, int var3) {
      int ix = var2 - var0;
      int j = var3 - var1;
      return class04995.N((float)(ix * ix + j * j));
   }

   private static int N(class07701 var0, class07209 var1, Pair<class07209, ? extends class03556<?>> var2, String var3, boolean var4, String var5, Duration var6) {
      class07209 class07209 = (class07209)var2.getFirst();
      int ix = var4
         ? class04995.y(class04995.N((float)var1.method_10262(class07209)))
         : class04995.y(N(var1.method_10263(), var1.method_10260(), class07209.method_10263(), class07209.method_10260()));
      String s = var4 ? String.valueOf(class07209.method_10264()) : "~";
      class05216 class05216 = class00390.N((class00392)class00392.N("chat.coordinates", class07209.method_10263(), s, class07209.method_10260()))
         .N(
            var2x -> var2x.N(class06541.field_1060)
               .N(new class00640("/tp @s " + class07209.method_10263() + " " + s + " " + class07209.method_10260()))
               .N(new class00401(class00392.L("chat.coordinates.tooltip")))
         );
      var0.N(() -> class00392.N(var3, var5, class05216, ix), false);
      N.info("Locating element {} took {} ms", var5, var6.toMillis());
      return ix;
   }

   public static int N(
      class07701 var0, class04428<?> var1, class07209 var2, Pair<class07209, ? extends class03556<?>> var3, String var4, boolean var5, Duration var6
   ) {
      String s = (String)var1.N().map(var0x -> var0x.N().toString(), var1x -> "#" + var1x.y() + " (" + ((class03556)var3.getSecond()).M() + ")");
      return N(var0, var2, var3, var4, var5, s, var6);
   }

   public static int N(
      class07701 var0, class03782<?> var1, class07209 var2, Pair<class07209, ? extends class03556<?>> var3, String var4, boolean var5, Duration var6
   ) {
      String s = (String)var1.N().map(var1x -> var1.y(), var2x -> var1.y() + " (" + ((class03556)var3.getSecond()).M() + ")");
      return N(var0, var2, var3, var4, var5, s, var6);
   }

   private static int N(class07701 var0, class03782<class00780> var1) throws CommandSyntaxException {
      class07209 class07209 = class07209.method_49638(var0.i());
      Stopwatch stopwatch = Stopwatch.createStarted(class07536.i);
      Pair<class07209, class03556<class00780>> pair = var0.R().method_42108(var1, class07209, 6400, 32, 64);
      stopwatch.stop();
      if (pair == null) {
         throw u.create(var1.y());
      } else {
         return N(var0, var1, class07209, pair, "commands.locate.biome.success", true, stopwatch.elapsed());
      }
   }

   private static int N(class07701 var0, class04428<class04748> var1) throws CommandSyntaxException {
      class00751 class00751 = var0.R().method_30349().L(class04227.yj);
      class03543 class03543 = N(var1, class00751).orElseThrow(() -> L.create(var1.y()));
      class07209 class07209 = class07209.method_49638(var0.i());
      class04782 class04782 = var0.R();
      Stopwatch stopwatch = Stopwatch.createStarted(class07536.i);
      Pair<class07209, class03556<class04748>> pair = class04782.method_14178().U().N(class04782, class03543, class07209, 100, false);
      stopwatch.stop();
      if (pair == null) {
         throw y.create(var1.y());
      } else {
         return N(var0, var1, class07209, pair, "commands.locate.structure.success", false, stopwatch.elapsed());
      }
   }
}
