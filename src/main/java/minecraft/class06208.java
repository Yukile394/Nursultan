package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class class06208 {
   public class06208() {
      super();
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("setworldspawn").requires(class07686.N(class07686.u)))
               .executes(var0x -> N((class07701)var0x.getSource(), class07209.method_49638(((class07701)var0x.getSource()).i()), class00863.N)))
            .then(
               ((RequiredArgumentBuilder)class07686.N("pos", class00894.N())
                     .executes(var0x -> N((class07701)var0x.getSource(), class00894.L(var0x, "pos"), class00863.N)))
                  .then(
                     class07686.N("rotation", class00897.N())
                        .executes(var0x -> N((class07701)var0x.getSource(), class00894.L(var0x, "pos"), class00897.N(var0x, "rotation")))
                  )
            )
      );
   }

   private static int N(class07701 var0, class07209 var1, class00874 var2) {
      class04782 class04782 = var0.R();
      class07109 class07109 = var2.y(var0);
      float f = class07109.U;
      float f1 = class07109.z;
      class05042 class05042 = class05042.N(class04782.method_27983(), var1, f, f1);
      class04782.method_27873(class05042);
      var0.N(
         () -> class00392.N(
            "commands.setworldspawn.success",
            var1.method_10263(),
            var1.method_10264(),
            var1.method_10260(),
            class05042.u(),
            class05042.i(),
            class04782.method_27983().N().toString()
         ),
         true
      );
      return 1;
   }
}
