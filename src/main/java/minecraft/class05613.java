package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;

public class class05613 {
   private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("commands.whitelist.alreadyOn"));
   private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType(class00392.L("commands.whitelist.alreadyOff"));
   private static final SimpleCommandExceptionType L = new SimpleCommandExceptionType(class00392.L("commands.whitelist.add.failed"));
   private static final SimpleCommandExceptionType u = new SimpleCommandExceptionType(class00392.L("commands.whitelist.remove.failed"));

   private static int L(class07701 var0) throws CommandSyntaxException {
      if (!var0.W().D_()) {
         throw y.create();
      } else {
         var0.W().u(false);
         var0.N(() -> class00392.L("commands.whitelist.disabled"), true);
         return 1;
      }
   }

   public class05613() {
      super();
   }

   private static int u(class07701 var0) {
      String[] astring = var0.W().Nm().U();
      if (astring.length == 0) {
         var0.N(() -> class00392.L("commands.whitelist.none"), false);
      } else {
         var0.N(() -> class00392.N("commands.whitelist.list", astring.length, String.join(", ", astring)), false);
      }

      return astring.length;
   }

   private static int y(class07701 var0, Collection<class08774> var1) throws CommandSyntaxException {
      class05152 class05152 = var0.W().Nm().z();
      int i = 0;

      for (class08774 class08774 : var1) {
         if (class05152.N(class08774)) {
            class05142 class05142 = new class05142(class08774);
            class05152.y(class05142);
            var0.N(() -> class00392.N("commands.whitelist.remove.success", class00392.y(class08774.y())), true);
            i++;
         }
      }

      if (i == 0) {
         throw u.create();
      } else {
         var0.W().yN();
         return i;
      }
   }

   private static int y(class07701 var0) throws CommandSyntaxException {
      if (var0.W().D_()) {
         throw N.create();
      } else {
         var0.W().u(true);
         var0.N(() -> class00392.L("commands.whitelist.enabled"), true);
         var0.W().yN();
         return 1;
      }
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y(
                                 "whitelist"
                              )
                              .requires(class07686.N(class07686.i)))
                           .then(class07686.y("on").executes(var0x -> y((class07701)var0x.getSource()))))
                        .then(class07686.y("off").executes(var0x -> L((class07701)var0x.getSource()))))
                     .then(class07686.y("list").executes(var0x -> u((class07701)var0x.getSource()))))
                  .then(class07686.y("add").then(class07686.N("targets", class07659.N()).suggests((var0x, var1) -> {
                     class01062 class01062 = ((class07701)var0x.getSource()).W().Nm();
                     return class07689.y(
                        class01062.v().stream().map(class08036::method_72498).filter(var1x -> !class01062.z().N(var1x)).map(class08774::y), var1
                     );
                  }).executes(var0x -> N((class07701)var0x.getSource(), class07659.N(var0x, "targets"))))))
               .then(
                  class07686.y("remove")
                     .then(
                        class07686.N("targets", class07659.N())
                           .suggests((var0x, var1) -> class07689.N(((class07701)var0x.getSource()).W().Nm().U(), var1))
                           .executes(var0x -> y((class07701)var0x.getSource(), class07659.N(var0x, "targets")))
                     )
               ))
            .then(class07686.y("reload").executes(var0x -> N((class07701)var0x.getSource())))
      );
   }

   private static int N(class07701 var0, Collection<class08774> var1) throws CommandSyntaxException {
      class05152 class05152 = var0.W().Nm().z();
      int i = 0;

      for (class08774 class08774 : var1) {
         if (!class05152.N(class08774)) {
            class05142 class05142 = new class05142(class08774);
            class05152.N(class05142);
            var0.N(() -> class00392.N("commands.whitelist.add.success", class00392.y(class08774.y())), true);
            i++;
         }
      }

      if (i == 0) {
         throw L.create();
      } else {
         return i;
      }
   }

   private static int N(class07701 var0) {
      var0.W().Nm().x_();
      var0.N(() -> class00392.L("commands.whitelist.reloaded"), true);
      var0.W().yN();
      return 1;
   }
}
