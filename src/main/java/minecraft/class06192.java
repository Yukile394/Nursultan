package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class class06192 {
   private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("commands.setblock.failed"));

   public class06192() {
      super();
   }

   public static void N(CommandDispatcher<class07701> var0, class04348 var1) {
      Predicate predicate = var0x -> var0x.L().R(var0x.u());
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("setblock").requires(class07686.N(class07686.u)))
            .then(
               class07686.N("pos", class00894.N())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N(
                                       "block", class00877.N(var1)
                                    )
                                    .executes(
                                       var0x -> N(
                                          (class07701)var0x.getSource(),
                                          class00894.N(var0x, "pos"),
                                          class00877.N(var0x, "block"),
                                          class06193.field_13722,
                                          null,
                                          false
                                       )
                                    ))
                                 .then(
                                    class07686.y("destroy")
                                       .executes(
                                          var0x -> N(
                                             (class07701)var0x.getSource(),
                                             class00894.N(var0x, "pos"),
                                             class00877.N(var0x, "block"),
                                             class06193.field_13721,
                                             null,
                                             false
                                          )
                                       )
                                 ))
                              .then(
                                 class07686.y("keep")
                                    .executes(
                                       var1x -> N(
                                          (class07701)var1x.getSource(),
                                          class00894.N(var1x, "pos"),
                                          class00877.N(var1x, "block"),
                                          class06193.field_13722,
                                          predicate,
                                          false
                                       )
                                    )
                              ))
                           .then(
                              class07686.y("replace")
                                 .executes(
                                    var0x -> N(
                                       (class07701)var0x.getSource(),
                                       class00894.N(var0x, "pos"),
                                       class00877.N(var0x, "block"),
                                       class06193.field_13722,
                                       null,
                                       false
                                    )
                                 )
                           ))
                        .then(
                           class07686.y("strict")
                              .executes(
                                 var0x -> N(
                                    (class07701)var0x.getSource(), class00894.N(var0x, "pos"), class00877.N(var0x, "block"), class06193.field_13722, null, true
                                 )
                              )
                        )
                  )
            )
      );
   }

   private static int N(class07701 var0, class07209 var1, class00903 var2, class06193 var3, @Nullable Predicate<class06646> var4, boolean var5) throws CommandSyntaxException {
      class04782 class04782 = var0.R();
      if (class04782.method_27982()) {
         throw N.create();
      } else if (var4 != null && !var4.test(new class06646(class04782, var1, true))) {
         throw N.create();
      } else {
         boolean flag;
         if (var3 == class06193.field_13721) {
            class04782.N(var1, true);
            flag = !var2.N().P() || !class04782.method_8320(var1).P();
         } else {
            flag = true;
         }

         class00500 class00500 = class04782.method_8320(var1);
         if (flag && !var2.N(class04782, var1, 2 | (var5 ? 816 : 256))) {
            throw N.create();
         } else {
            if (!var5) {
               class04782.method_70635(var1, class00500);
            }

            var0.N(() -> class00392.N("commands.setblock.success", var1.method_10263(), var1.method_10264(), var1.method_10260()), true);
            return 1;
         }
      }
   }
}
