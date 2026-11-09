package minecraft;

import Nursultan.class09475;
import Nursultan.class09477;
import Nursultan.class09478;
import Nursultan.class09479;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import org.jspecify.annotations.Nullable;

public class class01568 {
   private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType(
      var0 -> class00392.y("commands.function.error.argument_not_compound", var0)
   );
   static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(var0 -> class00392.y("commands.function.scheduled.no_functions", var0));
   public static final Dynamic2CommandExceptionType y = new Dynamic2CommandExceptionType(
      (var0, var1) -> class00392.y("commands.function.instantiationFailure", var0, var1)
   );
   public static final SuggestionProvider<class07701> L = (var0, var1) -> {
      class03800 class03800 = ((class07701)var0.getSource()).W().Nr();
      class07689.N(class03800.i(), var1, "#");
      return class07689.N(class03800.u(), var1);
   };
   static final class01562<class07701> u = new class01570();

   public class01568() {
      super();
   }

   private static <T extends class01711<T>> void y(
      Collection<class07684<T>> var0, @Nullable class07001 var1, T var2, T var3, class01744<T> var4, class01562<T> var5
   ) throws CommandSyntaxException {
      CommandDispatcher commanddispatcher = var2.l();
      class01711 class01711 = var3.w();
      class03102 class03102xxxx = var2.T();
      if (!var0.isEmpty()) {
         if (var0.size() == 1) {
            class07684 class07684xx = (class07684)var0.iterator().next();
            class01894 class01894xx = class07684xx.N();
            class03102 class03102x = N((T)var2, var5, class01894xx, class03102xxxx);
            N(var1, var4, commanddispatcher, (T)class01711, class07684xx, class01894xx, class03102x, false);
         } else if (class03102xxxx == class03102.N) {
            for (class07684 class07684x : var0) {
               class01894 class01894 = class07684x.N();
               class03102 class03102x = N((T)var2, var5, class01894, class03102xxxx);
               N(var1, var4, commanddispatcher, (T)class01711, class07684x, class01894, class03102x, false);
            }
         } else {
            class01569 class01569 = new class01569();
            class03102 class03102x = (var1x, var2x) -> class01569.N(var2x);

            for (class07684 class07684 : var0) {
               class01894 class01894x = class07684.N();
               class03102 class03102xx = N((T)var2, var5, class01894x, class03102x);
               N(var1, var4, commanddispatcher, (T)class01711, class07684, class01894x, class03102xx, false);
            }

            var4.N((var2x, var3x) -> {
               if (class01569.N) {
                  class03102xxxx.N(class01569.y);
               }
            });
         }
      }
   }

   private static <T extends class01711<T>> void N(
      @Nullable class07001 var0, class01744<T> var1, CommandDispatcher<T> var2, T var3, class07684<T> var4, class01894 var5, class03102 var6, boolean var7
   ) throws CommandSyntaxException {
      try {
         class01747 class01747 = var4.N(var0, var2);
         var1.N(new class01724<T>(class01747, var6, var7).N((T)var3));
      } catch (class01878 class01878) {
         throw y.create(var5, class01878.N());
      }
   }

   public static <T extends class01711<T>> void N(
      Collection<class07684<T>> var0, @Nullable class07001 var1, T var2, T var3, class01744<T> var4, class01562<T> var5, class03126 var6
   ) throws CommandSyntaxException {
      if (var6.L()) {
         N(var0, var1, (T)var2, (T)var3, var4, var5);
      } else {
         y(var0, var1, (T)var2, (T)var3, var4, var5);
      }
   }

   public static class07701 N(class07701 var0) {
      return var0.y().y(class06984.L);
   }

   public static class07001 N(class07793 var0, class05598 var1) throws CommandSyntaxException {
      class07709 class07709 = class05616.N(var0, var1);
      if (class07709 instanceof class07001) {
         return (class07001)class07709;
      } else {
         throw i.create(class07709.u().N());
      }
   }

   private static <T extends class01711<T>> class03102 N(T var0, class01562<T> var1, class01894 var2, class03102 var3) {
      return var0.d() ? var3 : (var4, var5) -> {
         var1.N(var0, var2, var5);
         var3.onResult(var4, var5);
      };
   }

   private static <T extends class01711<T>> void N(
      Collection<class07684<T>> var0, @Nullable class07001 var1, T var2, T var3, class01744<T> var4, class01562<T> var5
   ) throws CommandSyntaxException {
      CommandDispatcher commanddispatcher = var2.l();
      class01711 class01711 = var3.w();
      class03102 class03102x = class03102.N(var2.T(), var4.y().u());

      for (class07684 class07684 : var0) {
         class01894 class01894 = class07684.N();
         class03102 class03102x = N((T)var2, var5, class01894, class03102x);
         N(var1, var4, commanddispatcher, (T)class01711, class07684, class01894, class03102x, true);
      }

      var4.N(class03144.N());
   }

   public static void N(CommandDispatcher<class07701> var0) {
      LiteralArgumentBuilder<class07701> literalargumentbuilder = class07686.y("with");

      for (class05622 class05622 : class05616.L) {
         class05622.N(
            literalargumentbuilder,
            var1x -> var1x.executes(new class09479(class05622)).then(class07686.N("path", class07759.N()).executes(new class09477(class05622)))
         );
      }

      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("function").requires(class07686.N(class07686.u)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N("name", class06808.N()).suggests(L).executes(new class09478()))
                     .then(class07686.N("arguments", class07667.N()).executes(new class09475())))
                  .then(literalargumentbuilder)
            )
      );
   }
}
