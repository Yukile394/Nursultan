package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class class00249 {
   public class00249() {
      super();
   }

   private static int N(class07701 var0, class07049 var1, class05617 var2) {
      var2.N(var0, var1);
      var0.N(() -> class00392.N("commands.rotate.success", var1.method_5476()), true);
      return 1;
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("rotate").requires(class07686.N(class07686.u)))
            .then(
               ((RequiredArgumentBuilder)class07686.N("target", class07680.N())
                     .then(
                        class07686.N("rotation", class00897.N())
                           .executes(var0x -> N((class07701)var0x.getSource(), class07680.N(var0x, "target"), class00897.N(var0x, "rotation")))
                     ))
                  .then(
                     ((LiteralArgumentBuilder)class07686.y("facing")
                           .then(
                              class07686.y("entity")
                                 .then(
                                    ((RequiredArgumentBuilder)class07686.N("facingEntity", class07680.N())
                                          .executes(
                                             var0x -> N(
                                                (class07701)var0x.getSource(),
                                                class07680.N(var0x, "target"),
                                                new class05601(class07680.N(var0x, "facingEntity"), class07664.field_9853)
                                             )
                                          ))
                                       .then(
                                          class07686.N("facingAnchor", class07687.N())
                                             .executes(
                                                var0x -> N(
                                                   (class07701)var0x.getSource(),
                                                   class07680.N(var0x, "target"),
                                                   new class05601(class07680.N(var0x, "facingEntity"), class07687.N(var0x, "facingAnchor"))
                                                )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           class07686.N("facingLocation", class00881.N())
                              .executes(
                                 var0x -> N((class07701)var0x.getSource(), class07680.N(var0x, "target"), new class05596(class00881.N(var0x, "facingLocation")))
                              )
                        )
                  )
            )
      );
   }

   private static int N(class07701 var0, class07049 var1, class00874 var2) {
      class07109 class07109 = var2.y(var0);
      float f = var2.y() ? class07109.U - var1.method_36454() : class07109.U;
      float f1 = var2.N() ? class07109.z - var1.method_36455() : class07109.z;
      var1.method_64578(f, var2.y(), f1, var2.N());
      var0.N(() -> class00392.N("commands.rotate.success", var1.method_5476()), true);
      return 1;
   }
}
