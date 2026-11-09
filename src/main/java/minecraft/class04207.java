package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.datafixers.util.Either;
import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.apache.commons.lang3.mutable.MutableInt;

public class class04207 {
   public static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("argument.pos.unloaded"));
   private static final Dynamic2CommandExceptionType y = new Dynamic2CommandExceptionType((var0, var1) -> class00392.y("commands.fillbiome.toobig", var0, var1));

   public class04207() {
      super();
   }

   public static Either<Integer, CommandSyntaxException> N(class04782 var0, class07209 var1, class07209 var2, class03556<class00780> var3) {
      return N(var0, var1, var2, var3, var0x -> true, var0x -> {});
   }

   private static class04330 N(MutableInt var0, class08050 var1, class05163 var2, class03556<class00780> var3, Predicate<class03556<class00780>> var4) {
      return (var5, var6, var7, var8) -> {
         int i = class01146.L(var5);
         int j = class01146.L(var6);
         int k = class01146.L(var7);
         class03556 class03556 = var1.method_16359(var5, var6, var7);
         if (var2.u(i, j, k) && var4.test(class03556)) {
            var0.increment();
            return var3;
         } else {
            return class03556;
         }
      };
   }

   private static class07209 N(class07209 var0) {
      return new class07209(N(var0.method_10263()), N(var0.method_10264()), N(var0.method_10260()));
   }

   private static int N(int var0) {
      return class01146.L(class01146.N(var0));
   }

   public static void N(CommandDispatcher<class07701> var0, class04348 var1) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("fillbiome").requires(class07686.N(class07686.u)))
            .then(
               class07686.N("from", class00894.N())
                  .then(
                     class07686.N("to", class00894.N())
                        .then(
                           ((RequiredArgumentBuilder)class07686.N("biome", class03784.N(var1, class04227.NA))
                                 .executes(
                                    var0x -> N(
                                       (class07701)var0x.getSource(),
                                       class00894.N(var0x, "from"),
                                       class00894.N(var0x, "to"),
                                       class03784.N(var0x, "biome", class04227.NA),
                                       var0xx -> true
                                    )
                                 ))
                              .then(
                                 class07686.y("replace")
                                    .then(
                                       class07686.N("filter", class03789.N(var1, class04227.NA))
                                          .executes(
                                             var0x -> N(
                                                (class07701)var0x.getSource(),
                                                class00894.N(var0x, "from"),
                                                class00894.N(var0x, "to"),
                                                class03784.N(var0x, "biome", class04227.NA),
                                                class03789.N(var0x, "filter", class04227.NA)
                                             )
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int N(class07701 var0, class07209 var1, class07209 var2, class03529<class00780> var3, Predicate<class03556<class00780>> var4) throws CommandSyntaxException {
      Either either = N(var0.R(), var1, var2, var3, var4, var1x -> var0.N(var1x, true));
      Optional optional = either.right();
      if (optional.isPresent()) {
         throw (CommandSyntaxException)optional.get();
      } else {
         return (Integer)either.left().get();
      }
   }

   public static Either<Integer, CommandSyntaxException> N(
      class04782 var0,
      class07209 var1,
      class07209 var2,
      class03556<class00780> var3,
      Predicate<class03556<class00780>> var4,
      Consumer<Supplier<class00392>> var5
   ) {
      class07209 class07209x = N(var1);
      class07209 class07209x = N(var2);
      class05163 class05163 = class05163.N(class07209x, class07209x);
      int i = class05163.u() * class05163.i() * class05163.R();
      int j = var0.method_64395().N(class07305.l);
      if (i > j) {
         return Either.right(y.create(j, i));
      } else {
         ArrayList arraylist = new ArrayList();

         for (int k = class01296.N(class05163.z()); k <= class01296.N(class05163.W()); k++) {
            for (int l = class01296.N(class05163.B()); l <= class01296.N(class05163.U()); l++) {
               class08050 class08050x = var0.method_8402(l, k, class00549.m, false);
               if (class08050x == null) {
                  return Either.right(N.create());
               }

               arraylist.add(class08050x);
            }
         }

         MutableInt mutableint = new MutableInt(0);

         for (class08050 class08050 : arraylist) {
            class08050.N(N(mutableint, class08050, class05163, var3, var4), var0.method_14178().W().y());
            class08050.Z();
         }

         var0.method_14178().L.y(arraylist);
         var5.accept(
            () -> class00392.N(
               "commands.fillbiome.success.count",
               mutableint.intValue(),
               class05163.B(),
               class05163.Z(),
               class05163.z(),
               class05163.U(),
               class05163.E(),
               class05163.W()
            )
         );
         return Either.left(mutableint.intValue());
      }
   }
}
