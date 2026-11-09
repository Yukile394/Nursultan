package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class class06214 {
   private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("commands.summon.failed"));
   private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType(class00392.L("commands.summon.failed.peaceful"));
   private static final SimpleCommandExceptionType L = new SimpleCommandExceptionType(class00392.L("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType u = new SimpleCommandExceptionType(class00392.L("commands.summon.invalidPosition"));

   public class06214() {
      super();
   }

   private static int y(class07701 var0, class03529<class07078<?>> var1, class06889 var2, class07001 var3, boolean var4) throws CommandSyntaxException {
      class07049 class07049 = N(var0, var1, var2, var3, var4);
      var0.N(() -> class00392.N("commands.summon.success", class07049.method_5476()), true);
      return 1;
   }

   public static void N(CommandDispatcher<class07701> var0, class04348 var1) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("summon").requires(class07686.N(class07686.u)))
            .then(
               ((RequiredArgumentBuilder)class07686.N("entity", class03784.N(var1, class04227.I))
                     .suggests(class06791.N(class06791.L))
                     .executes(
                        var0x -> y((class07701)var0x.getSource(), class03784.i(var0x, "entity"), ((class07701)var0x.getSource()).i(), new class07001(), true)
                     ))
                  .then(
                     ((RequiredArgumentBuilder)class07686.N("pos", class00881.N())
                           .executes(
                              var0x -> y((class07701)var0x.getSource(), class03784.i(var0x, "entity"), class00881.N(var0x, "pos"), new class07001(), true)
                           ))
                        .then(
                           class07686.N("nbt", class07667.N())
                              .executes(
                                 var0x -> y(
                                    (class07701)var0x.getSource(), class03784.i(var0x, "entity"), class00881.N(var0x, "pos"), class07667.N(var0x, "nbt"), false
                                 )
                              )
                        )
                  )
            )
      );
   }

   public static class07049 N(class07701 var0, class03529<class07078<?>> var1, class06889 var2, class07001 var3, boolean var4) throws CommandSyntaxException {
      if (!class07299.method_25953(class07209.method_49638(var2))) {
         throw u.create();
      } else if (var0.R().y() == class07086.field_5801 && !((class07078)var1.N()).b()) {
         throw y.create();
      } else {
         class07001 class07001 = var3.N();
         class07001.N_67("id", var1.B().N().toString());
         class04782 class04782 = var0.R();
         class07049 class07049 = class07078.N(class07001, class04782, class06113.field_16462, var1x -> {
            var1x.method_5808(var2.M, var2.B, var2.Z, var1x.method_36454(), var1x.method_36455());
            return var1x;
         });
         if (class07049 == null) {
            throw N.create();
         } else {
            if (var4 && class07049 instanceof class07079) {
               ((class07079)class07049).N(var0.R(), var0.R().method_8404(class07049.method_24515()), class06113.field_16462, null);
            }

            if (!class04782.method_30736(class07049)) {
               throw L.create();
            } else {
               return class07049;
            }
         }
      }
   }
}
