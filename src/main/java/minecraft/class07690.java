package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class class07690 implements class04458<class07699> {
   private static final Collection<String> y = Arrays.asList("Hello world!", "foo", "@e", "Hello @p :)");
   static final Dynamic2CommandExceptionType N = new Dynamic2CommandExceptionType((var0, var1) -> class00392.y("argument.message.too_long", var0, var1));

   public class07690() {
      super();
   }

   private static void y(Consumer<class03926> var0, class07701 var1, class03926 var2) {
      class00392 class00392 = var1.W().yg().decorate(var1.z(), var2.u());
      var0.accept(var2.N(class00392));
   }

   public <S> class07699 parse(StringReader var1, @Nullable S var2) throws CommandSyntaxException {
      return class07699.N(var1, class06790.N(var2));
   }

   public class07699 parse(StringReader var1) throws CommandSyntaxException {
      return class07699.N(var1, true);
   }

   public static void N(CommandContext<class07701> var0, String var1, Consumer<class03926> var2) throws CommandSyntaxException {
      class07699 class07699 = (class07699)var0.getArgument(var1, class07699.class);
      class07701 class07701 = (class07701)var0.getSource();
      class00392 class00392 = class07699.N(class07701);
      class03926 class03926 = class07701.P().N(var1);
      if (class03926 != null) {
         N(var2, class07701, class03926.N(class00392));
      } else {
         y(var2, class07701, class03926.N(class07699.N()).N(class00392));
      }
   }

   public static class00392 N(CommandContext<class07701> var0, String var1) throws CommandSyntaxException {
      return ((class07699)var0.getArgument(var1, class07699.class)).N((class07701)var0.getSource());
   }

   private static CompletableFuture<class06068> N(class07701 var0, class03926 var1) {
      class04770 class04770 = var0.z();
      return class04770 != null && var1.N(class04770.method_5667())
         ? class04770.method_31273().N(var1.L())
         : CompletableFuture.completedFuture(class06068.N(var1.L()));
   }

   public static class07690 N() {
      return new class07690();
   }

   private static void N(Consumer<class03926> var0, class07701 var1, class03926 var2) {
      class02796 class02796 = var1.W();
      CompletableFuture<class06068> completablefuture = N(var1, var2);
      class00392 class00392 = class02796.yg().decorate(var1.z(), var2.u());
      var1.s().N(completablefuture, var3x -> {
         class03926 class03926 = var2.N(class00392).N(var3x.i());
         var0.accept(class03926);
      });
   }

   public Collection<String> getExamples() {
      return y;
   }
}
