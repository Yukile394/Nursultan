package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class class05843 {
   private static final class00405 N = class00405.N.N(new class00401(class00392.L("chat.type.team.hover"))).N(new class00640("/teammsg "));
   private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType(class00392.L("commands.teammsg.failed.noteam"));

   public class05843() {
      super();
   }

   private static void N(class07701 var0, class07049 var1, class00502 var2, List<class04770> var3, class03926 var4) {
      class05216 class05216 = var2.i().L(N);
      class00649 class00649xx = class00629.N(class00629.Z, var0).L(class05216);
      class00649 class00649x = class00629.N(class00629.z, var0).L(class05216);
      class03059 class03059 = class03059.N(var4);
      boolean flag = false;

      for (class04770 class04770 : var3) {
         class00649 class00649xx = class04770 == var1 ? class00649x : class00649xx;
         boolean flag1 = var0.N(class04770);
         class04770.method_43505(class03059, flag1, class00649xx);
         flag |= flag1 && var4.z();
      }

      if (flag) {
         var0.N(class01062.i);
      }
   }

   public static void N(CommandDispatcher<class07701> var0) {
      LiteralCommandNode literalcommandnode = var0.register(
         (LiteralArgumentBuilder)class07686.y("teammsg").then(class07686.N("message", class07690.N()).executes(var0x -> {
            class07701 class07701 = (class07701)var0x.getSource();
            class07049 class07049 = class07701.B();
            class00502 class00502 = class07049.method_5781();
            if (class00502 == null) {
               throw y.create();
            } else {
               List<class04770> list = class07701.W().Nm().v().stream().filter(var2x -> var2x == class07049 || var2x.method_5781() == class00502).toList();
               if (!list.isEmpty()) {
                  class07690.N(var0x, "message", var4x -> N(class07701, class07049, class00502, list, var4x));
               }

               return list.size();
            }
         }))
      );
      var0.register((LiteralArgumentBuilder)class07686.y("tm").redirect(literalcommandnode));
   }
}
