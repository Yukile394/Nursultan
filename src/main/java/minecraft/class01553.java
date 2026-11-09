package minecraft;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class class01553 {
   private static final Dynamic2CommandExceptionType y = new Dynamic2CommandExceptionType((var0, var1) -> class00392.y("commands.fill.toobig", var0, var1));
   static final class00903 N = new class00903(class00869.N.W(), Collections.emptySet(), null);
   private static final SimpleCommandExceptionType L = new SimpleCommandExceptionType(class00392.L("commands.fill.failed"));

   public class01553() {
      super();
   }

   public static void N(CommandDispatcher<class07701> var0, class04348 var1) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("fill").requires(class07686.N(class07686.u)))
            .then(
               class07686.N("from", class00894.N())
                  .then(
                     class07686.N("to", class00894.N())
                        .then(
                           N(
                                 var1,
                                 class07686.N("block", class00877.N(var1)),
                                 var0x -> class00894.N(var0x, "from"),
                                 var0x -> class00894.N(var0x, "to"),
                                 var0x -> class00877.N(var0x, "block"),
                                 var0x -> null
                              )
                              .then(
                                 ((LiteralArgumentBuilder)class07686.y("replace")
                                       .executes(
                                          var0x -> N(
                                             (class07701)var0x.getSource(),
                                             class05163.N(class00894.N(var0x, "from"), class00894.N(var0x, "to")),
                                             class00877.N(var0x, "block"),
                                             class01548.field_13655,
                                             null,
                                             false
                                          )
                                       ))
                                    .then(
                                       N(
                                          var1,
                                          class07686.N("filter", class00878.N(var1)),
                                          var0x -> class00894.N(var0x, "from"),
                                          var0x -> class00894.N(var0x, "to"),
                                          var0x -> class00877.N(var0x, "block"),
                                          var0x -> class00878.N(var0x, "filter")
                                       )
                                    )
                              )
                              .then(
                                 class07686.y("keep")
                                    .executes(
                                       var0x -> N(
                                          (class07701)var0x.getSource(),
                                          class05163.N(class00894.N(var0x, "from"), class00894.N(var0x, "to")),
                                          class00877.N(var0x, "block"),
                                          class01548.field_13655,
                                          var0xx -> var0xx.L().R(var0xx.u()),
                                          false
                                       )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static ArgumentBuilder<class07701, ?> N(
      class04348 var0,
      ArgumentBuilder<class07701, ?> var1,
      class08608<CommandContext<class07701>, class07209> var2,
      class08608<CommandContext<class07701>, class07209> var3,
      class08608<CommandContext<class07701>, class00903> var4,
      class01555<CommandContext<class07701>, Predicate<class06646>> var5
   ) {
      return var1.executes(
            var4x -> N(
               (class07701)var4x.getSource(),
               class05163.N((class00753)var2.apply(var4x), (class00753)var3.apply(var4x)),
               (class00903)var4.apply(var4x),
               class01548.field_13655,
               (Predicate<class06646>)var5.apply(var4x),
               false
            )
         )
         .then(
            class07686.y("outline")
               .executes(
                  var4x -> N(
                     (class07701)var4x.getSource(),
                     class05163.N((class00753)var2.apply(var4x), (class00753)var3.apply(var4x)),
                     (class00903)var4.apply(var4x),
                     class01548.field_13652,
                     (Predicate<class06646>)var5.apply(var4x),
                     false
                  )
               )
         )
         .then(
            class07686.y("hollow")
               .executes(
                  var4x -> N(
                     (class07701)var4x.getSource(),
                     class05163.N((class00753)var2.apply(var4x), (class00753)var3.apply(var4x)),
                     (class00903)var4.apply(var4x),
                     class01548.field_13656,
                     (Predicate<class06646>)var5.apply(var4x),
                     false
                  )
               )
         )
         .then(
            class07686.y("destroy")
               .executes(
                  var4x -> N(
                     (class07701)var4x.getSource(),
                     class05163.N((class00753)var2.apply(var4x), (class00753)var3.apply(var4x)),
                     (class00903)var4.apply(var4x),
                     class01548.field_13651,
                     (Predicate<class06646>)var5.apply(var4x),
                     false
                  )
               )
         )
         .then(
            class07686.y("strict")
               .executes(
                  var4x -> N(
                     (class07701)var4x.getSource(),
                     class05163.N((class00753)var2.apply(var4x), (class00753)var3.apply(var4x)),
                     (class00903)var4.apply(var4x),
                     class01548.field_13655,
                     (Predicate<class06646>)var5.apply(var4x),
                     true
                  )
               )
         );
   }

   private static int N(class07701 var0, class05163 var1, class00903 var2, class01548 var3, @Nullable Predicate<class06646> var4, boolean var5) throws CommandSyntaxException {
      int i = var1.u() * var1.i() * var1.R();
      int j = var0.R().method_64395().N(class07305.l);
      if (i > j) {
         throw y.create(j, i);
      } else {
         ArrayList arraylist = Lists.newArrayList();
         class04782 class04782 = var0.R();
         if (class04782.method_27982()) {
            throw L.create();
         } else {
            int k = 0;

            for (class07209 class07209 : class07209.method_10094(var1.B(), var1.Z(), var1.z(), var1.U(), var1.E(), var1.W())) {
               if (var4 == null || var4.test(new class06646(class04782, class07209, true))) {
                  class00500 class00500 = class04782.method_8320(class07209);
                  boolean flag = false;
                  if (var3.field_55587.affect(class04782, class07209)) {
                     flag = true;
                  }

                  class00903 class00903 = var3.field_13654.filter(var1, class07209, var2, class04782);
                  if (class00903 == null) {
                     if (flag) {
                        k++;
                     }
                  } else if (!class00903.N(class04782, class07209, 2 | (var5 ? 816 : 256))) {
                     if (flag) {
                        k++;
                     }
                  } else {
                     if (!var5) {
                        arraylist.add(new class01571(class07209.method_10062(), class00500));
                     }

                     k++;
                  }
               }
            }

            for (class01571 class01571 : arraylist) {
               class04782.method_70635(class01571.N(), class01571.y());
            }

            if (k == 0) {
               throw L.create();
            } else {
               int l = k;
               var0.N(() -> class00392.N("commands.fill.success", l), true);
               return k;
            }
         }
      }
   }
}
