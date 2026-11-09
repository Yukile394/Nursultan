package minecraft;

import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.DataResult.Error;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class class00940 {
   public class00940() {
      super();
   }

   private static int N(class07701 var0, UUID var1) {
      class02796 class02796 = var0.W();
      class00909 class00909 = class02796.Nf().M();
      class07536.z()
         .execute(
            () -> {
               class00392 class00392 = class00392.N(var1);
               Optional<GameProfile> optional = class00909.N(var1);
               class02796.execute(
                  () -> optional.ifPresentOrElse(
                     var2xxx -> N(var0, var2xxx, "commands.fetchprofile.id.success", class00392),
                     () -> var0.y(class00392.N("commands.fetchprofile.id.failure", class00392))
                  )
               );
            }
         );
      return 1;
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("fetchprofile").requires(class07686.N(class07686.u)))
               .then(
                  class07686.y("name")
                     .then(
                        class07686.N("name", StringArgumentType.greedyString())
                           .executes(var0x -> N((class07701)var0x.getSource(), StringArgumentType.getString(var0x, "name")))
                     )
               ))
            .then(class07686.y("id").then(class07686.N("id", class05193.N()).executes(var0x -> N((class07701)var0x.getSource(), class05193.N(var0x, "id")))))
      );
   }

   private static void N(class07701 var0, GameProfile var1, String var2, class00392 var3) {
      class02689 class02689 = class02689.N(var1);
      class02689.N
         .encodeStart(class07713.N, class02689)
         .ifSuccess(
            var4x -> {
               String s = var4x.toString();
               class05216 class05216 = class00392.N(new class06609(class02689, true));
               class03748.N
                  .encodeStart(class07713.N, class05216)
                  .ifSuccess(
                     var5x -> {
                        String sx = var5x.toString();
                        var0.N(
                           () -> {
                              class05216 class05216x = class00390.N(
                                 List.of(
                                    class00392.L("commands.fetchprofile.copy_component").N(var1xxxx -> var1xxxx.N(new class00627(s))),
                                    class00392.L("commands.fetchprofile.give_item")
                                       .N(var1xxxx -> var1xxxx.N(new class00625("give @s minecraft:player_head[profile=" + s + "]"))),
                                    class00392.L("commands.fetchprofile.summon_mannequin")
                                       .N(var1xxxx -> var1xxxx.N(new class00625("summon minecraft:mannequin ~ ~ ~ {profile:" + s + "}"))),
                                    class00392.N("commands.fetchprofile.copy_text", class05216.N(class06541.field_1068))
                                       .N(var1xxxx -> var1xxxx.N(new class00627(sx)))
                                 ),
                                 class05220.l,
                                 var0xxxx -> class00390.N((class00392)var0xxxx.N(class06541.field_1060))
                              );
                              return class00392.N(var2, var3, class05216x);
                           },
                           false
                        );
                     }
                  )
                  .ifError(var1xx -> var0.y(class00392.N("commands.fetchprofile.failed_to_serialize", var1xx.message())));
            }
         )
         .ifError(var1x -> var0.y(class00392.N("commands.fetchprofile.failed_to_serialize", var1x.message())));
   }

   private static int N(class07701 var0, String var1) {
      class02796 class02796 = var0.W();
      class00909 class00909 = class02796.Nf().M();
      class07536.z()
         .execute(
            () -> {
               class05216 class05216 = class00392.y(var1);
               Optional<GameProfile> optional = class00909.N(var1);
               class02796.execute(
                  () -> optional.ifPresentOrElse(
                     var2xxx -> N(var0, var2xxx, "commands.fetchprofile.name.success", class05216),
                     () -> var0.y(class00392.N("commands.fetchprofile.name.failure", class05216))
                  )
               );
            }
         );
      return 1;
   }
}
