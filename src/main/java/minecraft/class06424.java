package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class class06424 {
   private static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(var0 -> class00392.y("clear.failed.single", var0));
   private static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(var0 -> class00392.y("clear.failed.multiple", var0));

   public class06424() {
      super();
   }

   private static int N(class07701 var0, Collection<class04770> var1, Predicate<class06584> var2, int var3) throws CommandSyntaxException {
      int i = 0;

      for (class04770 class04770 : var1) {
         i += class04770.method_31548().N(var2, var3, class04770.fields_07fa3311b0e9d3e9b883d09222919bf5a_2.T());
         ((class07482)class04770.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).u();
         class04770.fields_07fa3311b0e9d3e9b883d09222919bf5a_2.y(class04770.method_31548());
      }

      if (i == 0) {
         if (var1.size() == 1) {
            throw N.create(((class04770)var1.iterator().next()).method_5477());
         } else {
            throw y.create(var1.size());
         }
      } else {
         int j = i;
         if (var3 == 0) {
            if (var1.size() == 1) {
               var0.N(() -> class00392.N("commands.clear.test.single", j, ((class04770)var1.iterator().next()).method_5476()), true);
            } else {
               var0.N(() -> class00392.N("commands.clear.test.multiple", j, var1.size()), true);
            }
         } else if (var1.size() == 1) {
            var0.N(() -> class00392.N("commands.clear.success.single", j, ((class04770)var1.iterator().next()).method_5476()), true);
         } else {
            var0.N(() -> class00392.N("commands.clear.success.multiple", j, var1.size()), true);
         }

         return i;
      }
   }

   private static int N(class07701 var0, Collection<class04770> var1, Predicate<class06584> var2) throws CommandSyntaxException {
      return N(var0, var1, var2, -1);
   }

   public static void N(CommandDispatcher<class07701> var0, class04348 var1) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("clear").requires(class07686.N(class07686.u)))
               .executes(var0x -> N((class07701)var0x.getSource(), Collections.singleton(((class07701)var0x.getSource()).Z()), var0xx -> true)))
            .then(
               ((RequiredArgumentBuilder)class07686.N("targets", class07680.u())
                     .executes(var0x -> N((class07701)var0x.getSource(), class07680.R(var0x, "targets"), var0xx -> true)))
                  .then(
                     ((RequiredArgumentBuilder)class07686.N("item", class06793.N(var1))
                           .executes(var0x -> N((class07701)var0x.getSource(), class07680.R(var0x, "targets"), class06793.N(var0x, "item"))))
                        .then(
                           class07686.N("maxCount", IntegerArgumentType.integer(0))
                              .executes(
                                 var0x -> N(
                                    (class07701)var0x.getSource(),
                                    class07680.R(var0x, "targets"),
                                    class06793.N(var0x, "item"),
                                    IntegerArgumentType.getInteger(var0x, "maxCount")
                                 )
                              )
                        )
                  )
            )
      );
   }
}
