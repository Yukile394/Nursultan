package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.List;
import java.util.function.Function;

public class class01561 {
   public class01561() {
      super();
   }

   private static int y(class07701 var0) {
      return N(var0, var0x -> class00392.N("commands.list.nameAndId", var0x.method_5477(), class00392.N(var0x.method_7334().id())));
   }

   private static int N(class07701 var0, Function<class04770, class00392> var1) {
      class01062 class01062 = var0.W().Nm();
      List<class04770> list = class01062.v();
      class00392 class00392 = class00390.y(list, var1);
      var0.N(() -> class00392.N("commands.list.players", list.size(), class01062.P(), class00392), false);
      return list.size();
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("list").executes(var0x -> N((class07701)var0x.getSource())))
            .then(class07686.y("uuids").executes(var0x -> y((class07701)var0x.getSource())))
      );
   }

   private static int N(class07701 var0) {
      return N(var0, class08036::method_5476);
   }
}
