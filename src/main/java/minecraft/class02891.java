package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class class02891 {
   private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("commands.transfer.error.no_players"));

   public class02891() {
      super();
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("transfer").requires(class07686.N(class07686.i)))
            .then(
               ((RequiredArgumentBuilder)class07686.N("hostname", StringArgumentType.string())
                     .executes(
                        var0x -> N(
                           (class07701)var0x.getSource(), StringArgumentType.getString(var0x, "hostname"), 25565, List.of(((class07701)var0x.getSource()).Z())
                        )
                     ))
                  .then(
                     ((RequiredArgumentBuilder)class07686.N("port", IntegerArgumentType.integer(1, 65535))
                           .executes(
                              var0x -> N(
                                 (class07701)var0x.getSource(),
                                 StringArgumentType.getString(var0x, "hostname"),
                                 IntegerArgumentType.getInteger(var0x, "port"),
                                 List.of(((class07701)var0x.getSource()).Z())
                              )
                           ))
                        .then(
                           class07686.N("players", class07680.u())
                              .executes(
                                 var0x -> N(
                                    (class07701)var0x.getSource(),
                                    StringArgumentType.getString(var0x, "hostname"),
                                    IntegerArgumentType.getInteger(var0x, "port"),
                                    class07680.R(var0x, "players")
                                 )
                              )
                        )
                  )
            )
      );
   }

   private static int N(class07701 var0, String var1, int var2, Collection<class04770> var3) throws CommandSyntaxException {
      if (var3.isEmpty()) {
         throw N.create();
      } else {
         Iterator iterator = var3.iterator();

         while (iterator.hasNext()) {
            ((class04770)iterator.next()).field_13987.method_14364(new class02870(var1, var2));
         }

         if (var3.size() == 1) {
            var0.N(() -> class00392.N("commands.transfer.success.single", ((class04770)var3.iterator().next()).method_5476(), var1, var2), true);
         } else {
            var0.N(() -> class00392.N("commands.transfer.success.multiple", var3.size(), var1, var2), true);
         }

         return var3.size();
      }
   }
}
