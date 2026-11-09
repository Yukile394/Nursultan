package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import org.jspecify.annotations.Nullable;

public class class06223 {
   private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("commands.publish.failed"));
   private static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(var0 -> class00392.y("commands.publish.alreadyPublished", var0));

   public class06223() {
      super();
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("publish").requires(class07686.N(class07686.R)))
               .executes(var0x -> N((class07701)var0x.getSource(), class05021.N(), false, null)))
            .then(
               ((RequiredArgumentBuilder)class07686.N("allowCommands", BoolArgumentType.bool())
                     .executes(var0x -> N((class07701)var0x.getSource(), class05021.N(), BoolArgumentType.getBool(var0x, "allowCommands"), null)))
                  .then(
                     ((RequiredArgumentBuilder)class07686.N("gamemode", class04131.N())
                           .executes(
                              var0x -> N(
                                 (class07701)var0x.getSource(),
                                 class05021.N(),
                                 BoolArgumentType.getBool(var0x, "allowCommands"),
                                 class04131.N(var0x, "gamemode")
                              )
                           ))
                        .then(
                           class07686.N("port", IntegerArgumentType.integer(0, 65535))
                              .executes(
                                 var0x -> N(
                                    (class07701)var0x.getSource(),
                                    IntegerArgumentType.getInteger(var0x, "port"),
                                    BoolArgumentType.getBool(var0x, "allowCommands"),
                                    class04131.N(var0x, "gamemode")
                                 )
                              )
                        )
                  )
            )
      );
   }

   private static int N(class07701 var0, int var1, boolean var2, @Nullable class07282 var3) throws CommandSyntaxException {
      if (var0.W().P()) {
         throw y.create(var0.W().ar_());
      } else if (!var0.W().N(var3, var2, var1)) {
         throw N.create();
      } else {
         var0.N(() -> y(var1), true);
         return var1;
      }
   }

   public static class05216 y(int var0) {
      class05216 class05216 = class00390.N(String.valueOf(var0));
      return class00392.N("commands.publish.started", class05216);
   }
}
