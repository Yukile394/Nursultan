package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Function;

public class class05626 {
   public class05626() {
      super();
   }

   private static int y(class07701 var0, Collection<class04770> var1) {
      class02361 class02361 = new class02361(true);
      Iterator iterator = var1.iterator();

      while (iterator.hasNext()) {
         ((class04770)iterator.next()).field_13987.method_14364(class02361);
      }

      if (var1.size() == 1) {
         var0.N(() -> class00392.N("commands.title.reset.single", ((class04770)var1.iterator().next()).method_5476()), true);
      } else {
         var0.N(() -> class00392.N("commands.title.reset.multiple", var1.size()), true);
      }

      return var1.size();
   }

   public static void N(CommandDispatcher<class07701> var0, class04348 var1) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("title").requires(class07686.N(class07686.u)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N(
                                    "targets", class07680.u()
                                 )
                                 .then(class07686.y("clear").executes(var0x -> N((class07701)var0x.getSource(), class07680.R(var0x, "targets")))))
                              .then(class07686.y("reset").executes(var0x -> y((class07701)var0x.getSource(), class07680.R(var0x, "targets")))))
                           .then(
                              class07686.y("title")
                                 .then(
                                    class07686.N("title", class07698.N(var1))
                                       .executes(
                                          var0x -> N(
                                             (class07701)var0x.getSource(),
                                             class07680.R(var0x, "targets"),
                                             class07698.N(var0x, "title"),
                                             "title",
                                             class02511::new
                                          )
                                       )
                                 )
                           ))
                        .then(
                           class07686.y("subtitle")
                              .then(
                                 class07686.N("title", class07698.N(var1))
                                    .executes(
                                       var0x -> N(
                                          (class07701)var0x.getSource(),
                                          class07680.R(var0x, "targets"),
                                          class07698.N(var0x, "title"),
                                          "subtitle",
                                          class02775::new
                                       )
                                    )
                              )
                        ))
                     .then(
                        class07686.y("actionbar")
                           .then(
                              class07686.N("title", class07698.N(var1))
                                 .executes(
                                    var0x -> N(
                                       (class07701)var0x.getSource(),
                                       class07680.R(var0x, "targets"),
                                       class07698.N(var0x, "title"),
                                       "actionbar",
                                       class02459::new
                                    )
                                 )
                           )
                     ))
                  .then(
                     class07686.y("times")
                        .then(
                           class07686.N("fadeIn", class07798.N())
                              .then(
                                 class07686.N("stay", class07798.N())
                                    .then(
                                       class07686.N("fadeOut", class07798.N())
                                          .executes(
                                             var0x -> N(
                                                (class07701)var0x.getSource(),
                                                class07680.R(var0x, "targets"),
                                                IntegerArgumentType.getInteger(var0x, "fadeIn"),
                                                IntegerArgumentType.getInteger(var0x, "stay"),
                                                IntegerArgumentType.getInteger(var0x, "fadeOut")
                                             )
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int N(class07701 var0, Collection<class04770> var1, class00392 var2, String var3, Function<class00392, class00381<?>> var4) throws CommandSyntaxException {
      for (class04770 class04770 : var1) {
         class04770.field_13987.method_14364((class00381<?>)var4.apply(class00390.N(var0, var2, class04770, 0)));
      }

      if (var1.size() == 1) {
         var0.N(() -> class00392.N("commands.title.show." + var3 + ".single", ((class04770)var1.iterator().next()).method_5476()), true);
      } else {
         var0.N(() -> class00392.N("commands.title.show." + var3 + ".multiple", var1.size()), true);
      }

      return var1.size();
   }

   private static int N(class07701 var0, Collection<class04770> var1, int var2, int var3, int var4) {
      class02668 class02668 = new class02668(var2, var3, var4);
      Iterator iterator = var1.iterator();

      while (iterator.hasNext()) {
         ((class04770)iterator.next()).field_13987.method_14364(class02668);
      }

      if (var1.size() == 1) {
         var0.N(() -> class00392.N("commands.title.times.single", ((class04770)var1.iterator().next()).method_5476()), true);
      } else {
         var0.N(() -> class00392.N("commands.title.times.multiple", var1.size()), true);
      }

      return var1.size();
   }

   private static int N(class07701 var0, Collection<class04770> var1) {
      class02361 class02361 = new class02361(false);
      Iterator iterator = var1.iterator();

      while (iterator.hasNext()) {
         ((class04770)iterator.next()).field_13987.method_14364(class02361);
      }

      if (var1.size() == 1) {
         var0.N(() -> class00392.N("commands.title.cleared.single", ((class04770)var1.iterator().next()).method_5476()), true);
      } else {
         var0.N(() -> class00392.N("commands.title.cleared.multiple", var1.size()), true);
      }

      return var1.size();
   }
}
