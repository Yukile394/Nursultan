package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class class05588 {
   public class05588() {
      super();
   }

   public static void N(CommandDispatcher<class07701> var0, class04348 var1) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("tellraw").requires(class07686.N(class07686.u)))
            .then(class07686.N("targets", class07680.u()).then(class07686.N("message", class07698.N(var1)).executes(var0x -> {
               int i = 0;

               for (class04770 class04770 : class07680.R(var0x, "targets")) {
                  class04770.method_43502(class07698.N(var0x, "message", class04770), false);
                  i++;
               }

               return i;
            })))
      );
   }
}
