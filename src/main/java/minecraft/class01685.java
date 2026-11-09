package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Iterator;
import org.jspecify.annotations.Nullable;

public class class01685 {
   private static int L(class07701 var0) throws CommandSyntaxException {
      class04770 class04770 = var0.Z();
      class07209 class07209 = class04770.method_24515();
      class04877 class04877 = class04770.method_51469().method_19502(class07209);
      if (class04877 != null) {
         class04877.W();
         var0.N(() -> class00392.y("Stopped raid"), false);
         return 1;
      } else {
         var0.y(class00392.y("No raid here"));
         return -1;
      }
   }

   public class01685() {
      super();
   }

   private static int u(class07701 var0) throws CommandSyntaxException {
      class04877 class04877 = N(var0.Z());
      if (class04877 != null) {
         StringBuilder stringbuilder = new StringBuilder();
         stringbuilder.append("Found a started raid! ");
         var0.N(() -> class00392.y(stringbuilder.toString()), false);
         StringBuilder stringbuilder1 = new StringBuilder();
         stringbuilder1.append("Num groups spawned: ");
         stringbuilder1.append(class04877.z());
         stringbuilder1.append(" Raid omen level: ");
         stringbuilder1.append(class04877.E());
         stringbuilder1.append(" Num mobs: ");
         stringbuilder1.append(class04877.P());
         stringbuilder1.append(" Raid health: ");
         stringbuilder1.append(class04877.m());
         stringbuilder1.append(" / ");
         stringbuilder1.append(class04877.M());
         var0.N(() -> class00392.y(stringbuilder1.toString()), false);
         return 1;
      } else {
         var0.y(class00392.y("Found no started raids"));
         return 0;
      }
   }

   private static int y(class07701 var0) {
      var0.N(() -> class00392.y("Spawned a raid captain"), false);
      class04882 class04882 = class07078.yy.N(var0.R(), class06113.field_16462);
      if (class04882 == null) {
         var0.y(class00392.y("Pillager failed to spawn"));
         return 0;
      } else {
         class04882.M(true);
         class04882.method_5673(class07085.field_6169, class04877.N(var0.t().L(class04227.NF)));
         class04882.method_5814(var0.i().M, var0.i().B, var0.i().Z);
         class04882.N(var0.R(), var0.R().method_8404(class07209.method_49638(var0.i())), class06113.field_16462, null);
         var0.R().y(class04882);
         return 1;
      }
   }

   private static int y(class07701 var0, int var1) throws CommandSyntaxException {
      class04770 class04770 = var0.Z();
      class07209 class07209 = class04770.method_24515();
      if (class04770.method_51469().method_19503(class07209)) {
         var0.y(class00392.y("Raid already started close by"));
         return -1;
      } else {
         class04868 class04868 = class04770.method_51469().method_19495();
         class04877 class04877 = class04868.N(class04770, class04770.method_24515());
         if (class04877 != null) {
            class04877.N(var1);
            class04868.method_80();
            var0.N(() -> class00392.y("Created a raid in your local village"), false);
         } else {
            var0.y(class00392.y("Failed to create a raid in your local village"));
         }

         return 1;
      }
   }

   private static int N(class07701 var0, @Nullable class00392 var1) {
      if (var1 != null && var1.getString().equals("local")) {
         class04782 class04782 = var0.R();
         class06889 class06889 = var0.i().y(5.0, 0.0, 0.0);
         class04782.method_8465(null, class06889.M, class06889.B, class06889.Z, class04909.lc, class04911.field_15254, 2.0F, 1.0F, class04782.field_9229.B());
      }

      return 1;
   }

   public static void N(CommandDispatcher<class07701> var0, class04348 var1) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y(
                                    "raid"
                                 )
                                 .requires(class07686.N(class07686.i)))
                              .then(
                                 class07686.y("start")
                                    .then(
                                       class07686.N("omenlvl", IntegerArgumentType.integer(0))
                                          .executes(var0x -> y((class07701)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "omenlvl")))
                                    )
                              ))
                           .then(class07686.y("stop").executes(var0x -> L((class07701)var0x.getSource()))))
                        .then(class07686.y("check").executes(var0x -> u((class07701)var0x.getSource()))))
                     .then(
                        class07686.y("sound")
                           .then(class07686.N("type", class07698.N(var1)).executes(var0x -> N((class07701)var0x.getSource(), class07698.y(var0x, "type"))))
                     ))
                  .then(class07686.y("spawnleader").executes(var0x -> y((class07701)var0x.getSource()))))
               .then(
                  class07686.y("setomen")
                     .then(
                        class07686.N("level", IntegerArgumentType.integer(0))
                           .executes(var0x -> N((class07701)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "level")))
                     )
               ))
            .then(class07686.y("glow").executes(var0x -> N((class07701)var0x.getSource())))
      );
   }

   @Nullable
   private static class04877 N(class04770 var0) {
      return var0.method_51469().method_19502(var0.method_24515());
   }

   private static int N(class07701 var0, int var1) throws CommandSyntaxException {
      class04877 class04877 = N(var0.Z());
      if (class04877 != null) {
         int i = class04877.U();
         if (var1 > i) {
            var0.y(class00392.y("Sorry, the max raid omen level you can set is " + i));
         } else {
            int j = class04877.E();
            class04877.N(var1);
            var0.N(() -> class00392.y("Changed village's raid omen level from " + j + " to " + var1), false);
         }
      } else {
         var0.y(class00392.y("No raid found here"));
      }

      return 1;
   }

   private static int N(class07701 var0) throws CommandSyntaxException {
      class04877 class04877 = N(var0.Z());
      if (class04877 != null) {
         Iterator<class04882> iterator = class04877.B().iterator();

         while (iterator.hasNext()) {
            iterator.next().method_6092(new class07055(class07047.l, 1000, 1));
         }
      }

      return 1;
   }
}
