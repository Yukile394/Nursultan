package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;

public class class01542 {
   public static final int N = 100;

   public class01542() {
      super();
   }

   public static void N(CommandDispatcher<class07701> var0, class04348 var1) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("give").requires(class07686.N(class07686.u)))
            .then(
               class07686.N("targets", class07680.u())
                  .then(
                     ((RequiredArgumentBuilder)class07686.N("item", class06770.N(var1))
                           .executes(var0x -> N((class07701)var0x.getSource(), class06770.N(var0x, "item"), class07680.R(var0x, "targets"), 1)))
                        .then(
                           class07686.N("count", IntegerArgumentType.integer(1))
                              .executes(
                                 var0x -> N(
                                    (class07701)var0x.getSource(),
                                    class06770.N(var0x, "item"),
                                    class07680.R(var0x, "targets"),
                                    IntegerArgumentType.getInteger(var0x, "count")
                                 )
                              )
                        )
                  )
            )
      );
   }

   private static int N(class07701 var0, class06778 var1, Collection<class04770> var2, int var3) throws CommandSyntaxException {
      class06584 class06584x = var1.N(1, false);
      int i = class06584x.U();
      int j = i * 100;
      if (var3 > j) {
         var0.y(class00392.N("commands.give.failed.toomanyitems", j, class06584x.V()));
         return 0;
      } else {
         for (class04770 class04770 : var2) {
            int k = var3;

            while (k > 0) {
               int l = Math.min(i, k);
               k -= l;
               class06584 class06584x = var1.N(l, false);
               if (class04770.method_31548().M(class06584x) && class06584x.R()) {
                  class00717 class00717 = class04770.method_7328(class06584x, false);
                  if (class00717 != null) {
                     class00717.Z();
                  }

                  class04770.method_51469()
                     .method_43128(
                        null,
                        class04770.method_23317(),
                        class04770.method_23318(),
                        class04770.method_23321(),
                        class04909.sJ,
                        class04911.field_15248,
                        0.2F,
                        ((class04770.method_59922().z() - class04770.method_59922().z()) * 0.7F + 1.0F) * 2.0F
                     );
                  ((class07482)class04770.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).u();
               } else {
                  class00717 class00717x = class04770.method_7328(class06584x, false);
                  if (class00717x != null) {
                     class00717x.u();
                     class00717x.N(class04770.method_5667());
                  }
               }
            }
         }

         if (var2.size() == 1) {
            var0.N(() -> class00392.N("commands.give.success.single", var3, class06584x.V(), ((class04770)var2.iterator().next()).method_5476()), true);
         } else {
            var0.N(() -> class00392.N("commands.give.success.single", var3, class06584x.V(), var2.size()), true);
         }

         return var2.size();
      }
   }
}
