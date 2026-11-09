package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class class06808 implements ArgumentType<class06792> {
   private static final Collection<String> N = Arrays.asList("foo", "foo:bar", "#foo");
   private static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(var0 -> class00392.y("arguments.function.tag.unknown", var0));
   private static final DynamicCommandExceptionType L = new DynamicCommandExceptionType(var0 -> class00392.y("arguments.function.unknown", var0));

   public static Pair<class01894, Collection<class07684<class07701>>> L(CommandContext<class07701> var0, String var1) throws CommandSyntaxException {
      return ((class06792)var0.getArgument(var1, class06792.class)).L(var0);
   }

   public class06808() {
      super();
   }

   public static Pair<class01894, Either<class07684<class07701>, Collection<class07684<class07701>>>> y(CommandContext<class07701> var0, String var1) throws CommandSyntaxException {
      return ((class06792)var0.getArgument(var1, class06792.class)).y(var0);
   }

   static Collection<class07684<class07701>> y(CommandContext<class07701> var0, class01894 var1) throws CommandSyntaxException {
      List<class07684<class07701>> list = ((class07701)var0.getSource()).W().Nr().y(var1);
      if (list == null) {
         throw y.create(var1.toString());
      } else {
         return list;
      }
   }

   static class07684<class07701> N(CommandContext<class07701> var0, class01894 var1) throws CommandSyntaxException {
      return ((class07701)var0.getSource()).W().Nr().N(var1).orElseThrow(() -> L.create(var1.toString()));
   }

   public static Collection<class07684<class07701>> N(CommandContext<class07701> var0, String var1) throws CommandSyntaxException {
      return ((class06792)var0.getArgument(var1, class06792.class)).N(var0);
   }

   public static class06808 N() {
      return new class06808();
   }

   public class06792 parse(StringReader var1) throws CommandSyntaxException {
      if (var1.canRead() && var1.peek() == '#') {
         var1.skip();
         class01894 class01894 = class01894.N(var1);
         return new class06769(this, class01894);
      } else {
         class01894 class01894x = class01894.N(var1);
         return new class06804(this, class01894x);
      }
   }

   public Collection<String> getExamples() {
      return N;
   }
}
