package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.UUID;

public class class01760 {
   public class01760() {
      super();
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("serverpack").requires(class07686.N(class07686.u)))
               .then(
                  class07686.y("push")
                     .then(
                        ((RequiredArgumentBuilder)class07686.N("url", StringArgumentType.string())
                              .then(
                                 ((RequiredArgumentBuilder)class07686.N("uuid", class05193.N())
                                       .then(
                                          class07686.N("hash", StringArgumentType.word())
                                             .executes(
                                                var0x -> N(
                                                   (class07701)var0x.getSource(),
                                                   StringArgumentType.getString(var0x, "url"),
                                                   Optional.of(class05193.N(var0x, "uuid")),
                                                   Optional.of(StringArgumentType.getString(var0x, "hash"))
                                                )
                                             )
                                       ))
                                    .executes(
                                       var0x -> N(
                                          (class07701)var0x.getSource(),
                                          StringArgumentType.getString(var0x, "url"),
                                          Optional.of(class05193.N(var0x, "uuid")),
                                          Optional.empty()
                                       )
                                    )
                              ))
                           .executes(var0x -> N((class07701)var0x.getSource(), StringArgumentType.getString(var0x, "url"), Optional.empty(), Optional.empty()))
                     )
               ))
            .then(
               class07686.y("pop").then(class07686.N("uuid", class05193.N()).executes(var0x -> N((class07701)var0x.getSource(), class05193.N(var0x, "uuid"))))
            )
      );
   }

   private static int N(class07701 var0, String var1, Optional<UUID> var2, Optional<String> var3) {
      UUID uuid = var2.orElseGet(() -> UUID.nameUUIDFromBytes(var1.getBytes(StandardCharsets.UTF_8)));
      String s = var3.orElse("");
      class06666 class06666 = new class06666(uuid, var1, s, false, null);
      N(var0, class06666);
      return 0;
   }

   private static int N(class07701 var0, UUID var1) {
      class03807 class03807 = new class03807(Optional.of(var1));
      N(var0, class03807);
      return 0;
   }

   private static void N(class07701 var0, class00381<?> var1) {
      var0.W().Na().i().forEach(var1x -> var1x.method_10743(var1));
   }
}
