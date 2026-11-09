package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class class01564 {
   public class01564() {
      super();
   }

   private static void N(class07701 var0, Collection<class04770> var1, class03926 var2) {
      class00649 class00649x = class00629.N(class00629.M, var0);
      class03059 class03059 = class03059.N(var2);
      boolean flag = false;

      for (class04770 class04770 : var1) {
         class00649 class00649x = class00629.N(class00629.B, var0).L(class04770.method_5476());
         var0.N(class03059, false, class00649x);
         boolean flag1 = var0.N(class04770);
         class04770.method_43505(class03059, flag1, class00649x);
         flag |= flag1 && var2.z();
      }

      if (flag) {
         var0.N(class01062.i);
      }
   }

   public static void N(CommandDispatcher<class07701> var0) {
      LiteralCommandNode literalcommandnode = var0.register(
         (LiteralArgumentBuilder)class07686.y("msg")
            .then(class07686.N("targets", class07680.u()).then(class07686.N("message", class07690.N()).executes(var0x -> {
               Collection<class04770> collection = class07680.R(var0x, "targets");
               if (!collection.isEmpty()) {
                  class07690.N(var0x, "message", var2 -> N((class07701)var0x.getSource(), collection, var2));
               }

               return collection.size();
            })))
      );
      var0.register((LiteralArgumentBuilder)class07686.y("tell").redirect(literalcommandnode));
      var0.register((LiteralArgumentBuilder)class07686.y("w").redirect(literalcommandnode));
   }
}
