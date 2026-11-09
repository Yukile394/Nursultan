package minecraft;

import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class03305 {
   private static final Logger y = LogUtils.getLogger();
   private static final String L = "localhost";
   private static final String u = "0.0.0.0";
   private static final int i = 10000;
   private static final int R = 100;
   public static BiMap<String, class05946<class07299>> N = ImmutableBiMap.of(
      "o", class07299.field_25179, "n", class07299.field_25180, "e", class07299.field_25181
   );
   @Nullable
   private static class03309 M;
   @Nullable
   private static class03296 B;

   public class03305() {
      super();
   }

   private static boolean y(class07701 var0) {
      if (M != null) {
         var0.y(class00392.y("Chase server is already running. Stop it using /chase stop"));
         return true;
      } else if (B != null) {
         var0.y(class00392.y("You are already chasing someone. Stop it using /chase stop"));
         return true;
      } else {
         return false;
      }
   }

   private static int y(class07701 var0, String var1, int var2) {
      if (y(var0)) {
         return 0;
      } else {
         B = new class03296(var1, var2, var0.W());
         B.N();
         var0.N(
            () -> class00392.y(
               "You are now chasing "
                  + var1
                  + ":"
                  + var2
                  + ". If that server does '/chase lead' then you will automatically go to the same position. Use '/chase stop' to stop chasing."
            ),
            false
         );
         return 0;
      }
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("chase")
                  .then(
                     ((LiteralArgumentBuilder)class07686.y("follow")
                           .then(
                              ((RequiredArgumentBuilder)class07686.N("host", StringArgumentType.string())
                                    .executes(var0x -> y((class07701)var0x.getSource(), StringArgumentType.getString(var0x, "host"), 10000)))
                                 .then(
                                    class07686.N("port", IntegerArgumentType.integer(1, 65535))
                                       .executes(
                                          var0x -> y(
                                             (class07701)var0x.getSource(),
                                             StringArgumentType.getString(var0x, "host"),
                                             IntegerArgumentType.getInteger(var0x, "port")
                                          )
                                       )
                                 )
                           ))
                        .executes(var0x -> y((class07701)var0x.getSource(), "localhost", 10000))
                  ))
               .then(
                  ((LiteralArgumentBuilder)class07686.y("lead")
                        .then(
                           ((RequiredArgumentBuilder)class07686.N("bind_address", StringArgumentType.string())
                                 .executes(var0x -> N((class07701)var0x.getSource(), StringArgumentType.getString(var0x, "bind_address"), 10000)))
                              .then(
                                 class07686.N("port", IntegerArgumentType.integer(1024, 65535))
                                    .executes(
                                       var0x -> N(
                                          (class07701)var0x.getSource(),
                                          StringArgumentType.getString(var0x, "bind_address"),
                                          IntegerArgumentType.getInteger(var0x, "port")
                                       )
                                    )
                              )
                        ))
                     .executes(var0x -> N((class07701)var0x.getSource(), "0.0.0.0", 10000))
               ))
            .then(class07686.y("stop").executes(var0x -> N((class07701)var0x.getSource())))
      );
   }

   private static int N(class07701 var0, String var1, int var2) {
      if (y(var0)) {
         return 0;
      } else {
         M = new class03309(var1, var2, var0.W().Nm(), 100);

         try {
            M.N();
            var0.N(() -> class00392.y("Chase server is now running on port " + var2 + ". Clients can follow you using /chase follow <ip> <port>"), false);
         } catch (IOException ioexception) {
            y.error("Failed to start chase server", ioexception);
            var0.y(class00392.y("Failed to start chase server on port " + var2));
            M = null;
         }

         return 0;
      }
   }

   private static int N(class07701 var0) {
      if (B != null) {
         B.y();
         var0.N(() -> class00392.y("You have now stopped chasing"), false);
         B = null;
      }

      if (M != null) {
         M.y();
         var0.N(() -> class00392.y("You are no longer being chased"), false);
         M = null;
      }

      return 0;
   }
}
