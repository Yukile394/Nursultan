package minecraft;

import com.google.common.collect.Iterables;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ParsedCommandNode;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Map;
import net.fabricmc.fabric.mixin.command.HelpCommandAccessor;

public class class01543 implements HelpCommandAccessor {
   public static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("commands.help.failed"));

   public class01543() {
      super();
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("help").executes(var1 -> {
         Map map = var0.getSmartUsage(var0.getRoot(), (class07701)var1.getSource());

         for (String s : map.values()) {
            ((class07701)var1.getSource()).N(() -> class00392.y("/" + s), false);
         }

         return map.size();
      })).then(class07686.N("command", StringArgumentType.greedyString()).executes(var1 -> {
         ParseResults parseresults = var0.parse(StringArgumentType.getString(var1, "command"), (class07701)var1.getSource());
         if (parseresults.getContext().getNodes().isEmpty()) {
            throw N.create();
         } else {
            Map map = var0.getSmartUsage(((ParsedCommandNode)Iterables.getLast(parseresults.getContext().getNodes())).getNode(), (class07701)var1.getSource());

            for (String s : map.values()) {
               ((class07701)var1.getSource()).N(() -> class00392.y("/" + parseresults.getReader().getString() + " " + s), false);
            }

            return map.size();
         }
      })));
   }
}
