package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import net.fabricmc.fabric.api.item.v1.EnchantingContext;

public class class01545 {
   private static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(var0 -> class00392.y("commands.enchant.failed.entity", var0));
   private static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(var0 -> class00392.y("commands.enchant.failed.itemless", var0));
   private static final DynamicCommandExceptionType L = new DynamicCommandExceptionType(var0 -> class00392.y("commands.enchant.failed.incompatible", var0));
   private static final Dynamic2CommandExceptionType u = new Dynamic2CommandExceptionType(
      (var0, var1) -> class00392.y("commands.enchant.failed.level", var0, var1)
   );
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(class00392.L("commands.enchant.failed"));

   public class01545() {
      super();
   }

   private static int N(class07701 var0, Collection<? extends class07049> var1, class03556<class07304> var2, int var3) throws CommandSyntaxException {
      class07304 class07304 = (class07304)var2.N();
      if (var3 > class07304.i()) {
         throw u.create(var3, class07304.i());
      } else {
         int ix = 0;

         for (class07049 class07049 : var1) {
            if (class07049 instanceof class07438 class07438) {
               class06584 class06584 = class07438.method_6047();
               if (!class06584.R()) {
                  if (N(class07304, class06584, var0, var1, var2) && class07323.N(class07323.y(class06584).N(), var2)) {
                     class06584.N(var2, var3);
                     ix++;
                  } else if (var1.size() == 1) {
                     throw L.create(class06584.d().getString());
                  }
               } else if (var1.size() == 1) {
                  throw y.create(class07438.method_5477().getString());
               }
            } else if (var1.size() == 1) {
               throw N.create(class07049.method_5477().getString());
            }
         }

         if (ix == 0) {
            throw i.create();
         } else {
            if (var1.size() == 1) {
               var0.N(() -> class00392.N("commands.enchant.success.single", class07304.N(var2, var3), ((class07049)var1.iterator().next()).method_5476()), true);
            } else {
               var0.N(() -> class00392.N("commands.enchant.success.multiple", class07304.N(var2, var3), var1.size()), true);
            }

            return ix;
         }
      }
   }

   public static void N(CommandDispatcher<class07701> var0, class04348 var1) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("enchant").requires(class07686.N(class07686.u)))
            .then(
               class07686.N("targets", class07680.y())
                  .then(
                     ((RequiredArgumentBuilder)class07686.N("enchantment", class03784.N(var1, class04227.yR))
                           .executes(var0x -> N((class07701)var0x.getSource(), class07680.y(var0x, "targets"), class03784.M(var0x, "enchantment"), 1)))
                        .then(
                           class07686.N("level", IntegerArgumentType.integer(0))
                              .executes(
                                 var0x -> N(
                                    (class07701)var0x.getSource(),
                                    class07680.y(var0x, "targets"),
                                    class03784.M(var0x, "enchantment"),
                                    IntegerArgumentType.getInteger(var0x, "level")
                                 )
                              )
                        )
                  )
            )
      );
   }

   private static boolean N(class07304 var0, class06584 var1, class07701 var2, Collection var3, class03556 var4) {
      return var1.canBeEnchantedWith(var4, EnchantingContext.ACCEPTABLE);
   }
}
