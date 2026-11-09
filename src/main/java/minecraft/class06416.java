package minecraft;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class class06416 {
   private static final Logger y = LogUtils.getLogger();
   private static final SimpleCommandExceptionType L = new SimpleCommandExceptionType(class00392.L("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType u = new Dynamic2CommandExceptionType((var0, var1) -> class00392.y("commands.clone.toobig", var0, var1));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(class00392.L("commands.clone.failed"));
   public static final Predicate<class06646> N = var0 -> !var0.N().P();

   public class06416() {
      super();
   }

   private static class06415 N(CommandContext<class07701> var0, class04782 var1, String var2) throws CommandSyntaxException {
      class07209 class07209 = class00894.N(var0, var1, var2);
      return new class06415(var1, class07209);
   }

   public static void N(CommandDispatcher<class07701> var0, class04348 var1) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("clone").requires(class07686.N(class07686.u)))
               .then(N(var1, var0x -> ((class07701)var0x.getSource()).R())))
            .then(class07686.y("from").then(class07686.N("sourceDimension", class07678.N()).then(N(var1, var0x -> class07678.N(var0x, "sourceDimension")))))
      );
   }

   private static ArgumentBuilder<class07701, ?> N(class04348 var0, class08608<CommandContext<class07701>, class04782> var1) {
      return class07686.N("begin", class00894.N())
         .then(
            ((RequiredArgumentBuilder)class07686.N("end", class00894.N()).then(N(var0, var1, var0x -> ((class07701)var0x.getSource()).R())))
               .then(
                  class07686.y("to").then(class07686.N("targetDimension", class07678.N()).then(N(var0, var1, var0x -> class07678.N(var0x, "targetDimension"))))
               )
         );
   }

   private static int N(class07701 var0, class06415 var1, class06415 var2, class06415 var3, Predicate<class06646> var4, class06427 var5, boolean var6) throws CommandSyntaxException {
      class07209 class07209xxxx = var1.y();
      class07209 class07209x = var2.y();
      class05163 class05163 = class05163.N(class07209xxxx, class07209x);
      class07209 class07209xx = var3.y();
      class07209 class07209xxx = class07209xx.method_10081(class05163.L());
      class05163 class05163x = class05163.N(class07209xx, class07209xxx);
      class04782 class04782 = var1.N();
      class04782 class04782x = var3.N();
      if (!var5.N() && class04782 == class04782x && class05163x.N(class05163)) {
         throw L.create();
      } else {
         int ix = class05163.u() * class05163.i() * class05163.R();
         int j = var0.R().method_64395().N(class07305.l);
         if (ix > j) {
            throw u.create(j, ix);
         } else if (!class04782.N(class07209xxxx, class07209x) || !class04782x.N(class07209xx, class07209xxx)) {
            throw class00894.N.create();
         } else if (class04782x.method_27982()) {
            throw i.create();
         } else {
            ArrayList arraylist = Lists.newArrayList();
            ArrayList arraylist1 = Lists.newArrayList();
            ArrayList arraylist2 = Lists.newArrayList();
            LinkedList linkedlist = Lists.newLinkedList();
            int k = 0;
            class04495 class04495 = new class04495(y);

            try {
               class07209 class07209xxxx = new class07209(class05163x.B() - class05163.B(), class05163x.Z() - class05163.Z(), class05163x.z() - class05163.z());

               for (int l = class05163.z(); l <= class05163.W(); l++) {
                  for (int i1 = class05163.Z(); i1 <= class05163.E(); i1++) {
                     for (int j1 = class05163.B(); j1 <= class05163.U(); j1++) {
                        class07209 class07209xxxxx = new class07209(j1, i1, l);
                        class07209 class07209xxxxxx = class07209xxxxx.method_10081(class07209xxxx);
                        class06646 class06646 = new class06646(class04782, class07209xxxxx, false);
                        class00500 class00500 = class06646.N();
                        if (var4.test(class06646)) {
                           class00394 class00394 = class04782.method_8321(class07209xxxxx);
                           if (class00394 != null) {
                              class08303 class08303 = class08303.N(class04495.N_46(class00394.J()), var0.t());
                              class00394.R(class08303);
                              class06404 class06404 = new class06404(class08303.y(), class00394.I());
                              arraylist1.add(new class06409(class07209xxxxxx, class00500, class06404, class04782x.method_8320(class07209xxxxxx)));
                              linkedlist.addLast(class07209xxxxx);
                           } else if (!class00500.t() && !class00500.W(class04782, class07209xxxxx)) {
                              arraylist2.add(new class06409(class07209xxxxxx, class00500, null, class04782x.method_8320(class07209xxxxxx)));
                              linkedlist.addFirst(class07209xxxxx);
                           } else {
                              arraylist.add(new class06409(class07209xxxxxx, class00500, null, class04782x.method_8320(class07209xxxxxx)));
                              linkedlist.addLast(class07209xxxxx);
                           }
                        }
                     }
                  }
               }

               int l1 = 2 | (var6 ? 816 : 0);
               if (var5 == class06427.field_13500) {
                  for (class07209 class07209xxxxx : linkedlist) {
                     class04782.method_8652(class07209xxxxx, class00869.ZX.W(), l1 | 816);
                  }

                  int i2 = var6 ? l1 : 3;

                  for (class07209 class07209xxxxx : linkedlist) {
                     class04782.method_8652(class07209xxxxx, class00869.N.W(), i2);
                  }
               }

               ArrayList arraylist3 = Lists.newArrayList();
               arraylist3.addAll(arraylist);
               arraylist3.addAll(arraylist1);
               arraylist3.addAll(arraylist2);
               List list = Lists.reverse(arraylist3);

               for (class06409 class06409xxx : list) {
                  class04782x.method_8652(class06409xxx.N(), class00869.ZX.W(), l1 | 816);
               }

               for (class06409 class06409x : arraylist3) {
                  if (class04782x.method_8652(class06409x.N(), class06409x.y(), l1)) {
                     k++;
                  }
               }

               for (class06409 class06409x : arraylist1) {
                  class00394 class00394x = class04782x.method_8321(class06409x.N());
                  if (class06409x.L() != null && class00394x != null) {
                     class00394x.L(class08308.N(class04495.N_46(class00394x.J()), class04782x.method_30349(), class06409x.L().N()));
                     class00394x.N(class06409x.L().y());
                     class00394x.method_5431();
                  }

                  class04782x.method_8652(class06409x.N(), class06409x.y(), l1);
               }

               if (!var6) {
                  for (class06409 class06409x : list) {
                     class04782x.method_70635(class06409x.N(), class06409x.u());
                  }
               }

               class04782x.method_14196().N(class04782.method_14196(), class05163, class07209xxxx);
            } catch (Throwable throwable1) {
               try {
                  class04495.close();
               } catch (Throwable throwable) {
                  throwable1.addSuppressed(throwable);
               }

               throw throwable1;
            }

            class04495.close();
            if (k == 0) {
               throw i.create();
            } else {
               int k1 = k;
               var0.N(() -> class00392.N("commands.clone.success", k1), true);
               return k;
            }
         }
      }
   }

   private static ArgumentBuilder<class07701, ?> N(
      class04348 var0, class08608<CommandContext<class07701>, class04782> var1, class08608<CommandContext<class07701>, class04782> var2
   ) {
      class08608 class08608xx = var1x -> N(var1x, (class04782)var1.apply(var1x), "begin");
      class08608 class08608x = var1x -> N(var1x, (class04782)var1.apply(var1x), "end");
      class08608 class08608xx = var1x -> N(var1x, (class04782)var2.apply(var1x), "destination");
      return N(var0, class08608xx, class08608x, class08608xx, false, class07686.N("destination", class00894.N()))
         .then(N(var0, class08608xx, class08608x, class08608xx, true, class07686.y("strict")));
   }

   private static ArgumentBuilder<class07701, ?> N(
      class04348 var0,
      class08608<CommandContext<class07701>, class06415> var1,
      class08608<CommandContext<class07701>, class06415> var2,
      class08608<CommandContext<class07701>, class06415> var3,
      boolean var4,
      ArgumentBuilder<class07701, ?> var5
   ) {
      return var5.executes(
            var4x -> N(
               (class07701)var4x.getSource(),
               (class06415)var1.apply(var4x),
               (class06415)var2.apply(var4x),
               (class06415)var3.apply(var4x),
               var0xx -> true,
               class06427.field_13499,
               var4
            )
         )
         .then(N(var1, var2, var3, var0x -> var0xx -> true, var4, class07686.y("replace")))
         .then(N(var1, var2, var3, var0x -> N, var4, class07686.y("masked")))
         .then(class07686.y("filtered").then(N(var1, var2, var3, var0x -> class00878.N(var0x, "filter"), var4, class07686.N("filter", class00878.N(var0)))));
   }

   private static ArgumentBuilder<class07701, ?> N(
      class08608<CommandContext<class07701>, class06415> var0,
      class08608<CommandContext<class07701>, class06415> var1,
      class08608<CommandContext<class07701>, class06415> var2,
      class08608<CommandContext<class07701>, Predicate<class06646>> var3,
      boolean var4,
      ArgumentBuilder<class07701, ?> var5
   ) {
      return var5.executes(
            var5x -> N(
               (class07701)var5x.getSource(),
               (class06415)var0.apply(var5x),
               (class06415)var1.apply(var5x),
               (class06415)var2.apply(var5x),
               (Predicate<class06646>)var3.apply(var5x),
               class06427.field_13499,
               var4
            )
         )
         .then(
            class07686.y("force")
               .executes(
                  var5x -> N(
                     (class07701)var5x.getSource(),
                     (class06415)var0.apply(var5x),
                     (class06415)var1.apply(var5x),
                     (class06415)var2.apply(var5x),
                     (Predicate<class06646>)var3.apply(var5x),
                     class06427.field_13497,
                     var4
                  )
               )
         )
         .then(
            class07686.y("move")
               .executes(
                  var5x -> N(
                     (class07701)var5x.getSource(),
                     (class06415)var0.apply(var5x),
                     (class06415)var1.apply(var5x),
                     (class06415)var2.apply(var5x),
                     (Predicate<class06646>)var3.apply(var5x),
                     class06427.field_13500,
                     var4
                  )
               )
         )
         .then(
            class07686.y("normal")
               .executes(
                  var5x -> N(
                     (class07701)var5x.getSource(),
                     (class06415)var0.apply(var5x),
                     (class06415)var1.apply(var5x),
                     (class06415)var2.apply(var5x),
                     (Predicate<class06646>)var3.apply(var5x),
                     class06427.field_13499,
                     var4
                  )
               )
         );
   }
}
