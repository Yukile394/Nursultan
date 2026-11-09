package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class class06205 {
   public class06205() {
      super();
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("spawnpoint").requires(class07686.N(class07686.u)))
               .executes(
                  var0x -> N(
                     (class07701)var0x.getSource(),
                     Collections.singleton(((class07701)var0x.getSource()).Z()),
                     class07209.method_49638(((class07701)var0x.getSource()).i()),
                     class00863.N
                  )
               ))
            .then(
               ((RequiredArgumentBuilder)class07686.N("targets", class07680.u())
                     .executes(
                        var0x -> N(
                           (class07701)var0x.getSource(),
                           class07680.R(var0x, "targets"),
                           class07209.method_49638(((class07701)var0x.getSource()).i()),
                           class00863.N
                        )
                     ))
                  .then(
                     ((RequiredArgumentBuilder)class07686.N("pos", class00894.N())
                           .executes(var0x -> N((class07701)var0x.getSource(), class07680.R(var0x, "targets"), class00894.L(var0x, "pos"), class00863.N)))
                        .then(
                           class07686.N("rotation", class00897.N())
                              .executes(
                                 var0x -> N(
                                    (class07701)var0x.getSource(), class07680.R(var0x, "targets"), class00894.L(var0x, "pos"), class00897.N(var0x, "rotation")
                                 )
                              )
                        )
                  )
            )
      );
   }

   private static int N(class07701 var0, Collection<class04770> var1, class07209 var2, class00874 var3) {
      class05946<class07299> class05946 = var0.R().method_27983();
      class07109 class07109 = var3.y(var0);
      float f = class04995.R(class07109.U);
      float f1 = class04995.N(class07109.z, -90.0F, 90.0F);
      Iterator iterator = var1.iterator();

      while (iterator.hasNext()) {
         ((class04770)iterator.next()).method_26284(new class04744(class05042.N(class05946, var2, f, f1), true), false);
      }

      String s = class05946.N().toString();
      if (var1.size() == 1) {
         var0.N(
            () -> class00392.N(
               "commands.spawnpoint.success.single",
               var2.method_10263(),
               var2.method_10264(),
               var2.method_10260(),
               f,
               f1,
               s,
               ((class04770)var1.iterator().next()).method_5476()
            ),
            true
         );
      } else {
         var0.N(
            () -> class00392.N("commands.spawnpoint.success.multiple", var2.method_10263(), var2.method_10264(), var2.method_10260(), f, f1, s, var1.size()),
            true
         );
      }

      return var1.size();
   }
}
