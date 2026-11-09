package minecraft;

import Nursultan.class09109;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.HexFormat;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

public class class00024 {
   public class00024() {
      super();
   }

   private static int N(class07701 var0) {
      class04782 class04782 = var0.R();
      Set<class00042> set = class04782.method_70636().y();
      String s = class04782.method_27983().N().toString();
      if (set.isEmpty()) {
         var0.N(() -> class00392.N("commands.waypoint.list.empty", s), false);
         return 0;
      } else {
         class00392 class00392 = class00390.y(
            set.stream()
               .map(
                  var1x -> {
                     if (var1x instanceof class07438 class07438) {
                        class07209 class07209 = class07438.method_24515();
                        return class07438.yZ()
                           .L()
                           .N(
                              var3x -> var3x.N(
                                    new class00640(
                                       "/execute in "
                                          + s
                                          + " run tp @s "
                                          + class07209.method_10263()
                                          + " "
                                          + class07209.method_10264()
                                          + " "
                                          + class07209.method_10260()
                                    )
                                 )
                                 .N(new class00401(class00392.L("chat.coordinates.tooltip")))
                                 .N(var1x.method_70675().i.orElse(-1))
                           );
                     } else {
                        return class00392.y(var1x.toString());
                     }
                  }
               )
               .toList(),
            Function.identity()
         );
         var0.N(() -> class00392.N("commands.waypoint.list.success", set.size(), s, class00392), false);
         return set.size();
      }
   }

   private static int N(class07701 var0, class00042 var1) {
      N(var0, var1, var0x -> var0x.i = Optional.empty());
      var0.N(() -> class00392.L("commands.waypoint.modify.color.reset"), false);
      return 0;
   }

   private static int N(class07701 var0, class00042 var1, Integer var2) {
      N(var0, var1, var1x -> var1x.i = Optional.of(var2));
      var0.N(
         () -> class00392.N("commands.waypoint.modify.color", class00392.y(HexFormat.of().withUpperCase().toHexDigits(class02566.R(0, var2), 6)).y(var2)),
         false
      );
      return 0;
   }

   private static int N(class07701 var0, class00042 var1, class06541 var2) {
      N(var0, var1, var1x -> var1x.i = Optional.of(var2.i()));
      var0.N(() -> class00392.N("commands.waypoint.modify.color", class00392.y(var2.R()).N(var2)), false);
      return 0;
   }

   private static int N(class07701 var0, class00042 var1, class05946<class09109> var2) {
      N(var0, var1, var1x -> var1x.u = var2);
      var0.N(() -> class00392.L("commands.waypoint.modify.style"), false);
      return 0;
   }

   public static void N(CommandDispatcher<class07701> var0, class04348 var1) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("waypoint").requires(class07686.N(class07686.u)))
               .then(class07686.y("list").executes(var0x -> N((class07701)var0x.getSource()))))
            .then(
               class07686.y("modify")
                  .then(
                     ((RequiredArgumentBuilder)class07686.N("waypoint", class07680.N())
                           .then(
                              ((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("color")
                                       .then(
                                          class07686.N("color", class07696.N())
                                             .executes(var0x -> N((class07701)var0x.getSource(), class08668.N(var0x, "waypoint"), class07696.N(var0x, "color")))
                                       ))
                                    .then(
                                       class07686.y("hex")
                                          .then(
                                             class07686.N("color", class00035.N())
                                                .executes(
                                                   var0x -> N((class07701)var0x.getSource(), class08668.N(var0x, "waypoint"), class00035.N(var0x, "color"))
                                                )
                                          )
                                    ))
                                 .then(class07686.y("reset").executes(var0x -> N((class07701)var0x.getSource(), class08668.N(var0x, "waypoint"))))
                           ))
                        .then(
                           ((LiteralArgumentBuilder)class07686.y("style")
                                 .then(class07686.y("reset").executes(var0x -> N((class07701)var0x.getSource(), class08668.N(var0x, "waypoint"), class00058.y))))
                              .then(
                                 class07686.y("set")
                                    .then(
                                       class07686.N("style", class07778.N())
                                          .executes(
                                             var0x -> N(
                                                (class07701)var0x.getSource(),
                                                class08668.N(var0x, "waypoint"),
                                                class05946.N(class00058.N, class07778.N(var0x, "style"))
                                             )
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static void N(class07701 var0, class00042 var1, Consumer<class00028> var2) {
      class04782 class04782 = var0.R();
      class04782.method_70636().L(var1);
      var2.accept(var1.method_70675());
      class04782.method_70636().N(var1);
   }
}
