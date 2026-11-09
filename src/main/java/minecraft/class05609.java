package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Iterator;

public class class05609 {
   private static int L(class07701 var0, int var1) {
      var0.N(() -> class00392.N("commands.time.query", var1), false);
      return var1;
   }

   public class05609() {
      super();
   }

   public static int y(class07701 var0, int var1) {
      for (class04782 class04782 : var0.W().NO()) {
         class04782.method_29199(class04782.method_8532() + var1);
      }

      var0.W().Nw();
      int i = N(var0.R());
      var0.N(() -> class00392.N("commands.time.set", i), true);
      return i;
   }

   private static int N(class04782 var0) {
      return (int)(var0.method_8532() % 24000L);
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("time")
                     .requires(class07686.N(class07686.u)))
                  .then(
                     ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("set")
                                    .then(class07686.y("day").executes(var0x -> N((class07701)var0x.getSource(), 1000))))
                                 .then(class07686.y("noon").executes(var0x -> N((class07701)var0x.getSource(), 6000))))
                              .then(class07686.y("night").executes(var0x -> N((class07701)var0x.getSource(), 13000))))
                           .then(class07686.y("midnight").executes(var0x -> N((class07701)var0x.getSource(), 18000))))
                        .then(
                           class07686.N("time", class07798.N())
                              .executes(var0x -> N((class07701)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "time")))
                        )
                  ))
               .then(
                  class07686.y("add")
                     .then(
                        class07686.N("time", class07798.N()).executes(var0x -> y((class07701)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "time")))
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("query")
                        .then(class07686.y("daytime").executes(var0x -> L((class07701)var0x.getSource(), N(((class07701)var0x.getSource()).R())))))
                     .then(
                        class07686.y("gametime")
                           .executes(var0x -> L((class07701)var0x.getSource(), (int)(((class07701)var0x.getSource()).R().N() % 2147483647L)))
                     ))
                  .then(
                     class07686.y("day")
                        .executes(var0x -> L((class07701)var0x.getSource(), (int)(((class07701)var0x.getSource()).R().method_75003() % 2147483647L)))
                  )
            )
      );
   }

   public static int N(class07701 var0, int var1) {
      Iterator<class04782> iterator = var0.W().NO().iterator();

      while (iterator.hasNext()) {
         iterator.next().method_29199(var1);
      }

      var0.W().Nw();
      var0.N(() -> class00392.N("commands.time.set", var1), true);
      return N(var0.R());
   }
}
