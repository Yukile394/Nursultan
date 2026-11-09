package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class class06762 {
   static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(var0 -> class00392.y("argument.item.id.invalid", var0));
   static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(var0 -> class00392.y("arguments.item.component.unknown", var0));
   static final Dynamic2CommandExceptionType L = new Dynamic2CommandExceptionType(
      (var0, var1) -> class00392.y("arguments.item.component.malformed", var0, var1)
   );
   static final SimpleCommandExceptionType u = new SimpleCommandExceptionType(class00392.L("arguments.item.component.expected"));
   static final DynamicCommandExceptionType i = new DynamicCommandExceptionType(var0 -> class00392.y("arguments.item.component.repeated", var0));
   private static final DynamicCommandExceptionType P = new DynamicCommandExceptionType(var0 -> class00392.y("arguments.item.malformed", var0));
   public static final char R = '[';
   public static final char M = ']';
   public static final char B = ',';
   public static final char Z = '=';
   public static final char z = '!';
   static final Function<SuggestionsBuilder, CompletableFuture<Suggestions>> U = SuggestionsBuilder::buildFuture;
   final class01921<class06581> E;
   final class03519<class07709> W;
   final class07755<class07709> m;

   public class06762(class01929 var1) {
      super();
      this.E = var1.y(class04227.F);
      this.W = var1.N(class07713.N);
      this.m = class07755.N(this.W);
   }

   public class06796 N(StringReader var1) throws CommandSyntaxException {
      MutableObject mutableobject = new MutableObject();
      class02713 class02713 = class02678.N();
      this.N(var1, new class06780(this, mutableobject, class02713));
      class03556 class03556 = Objects.requireNonNull((class03556)mutableobject.get(), "Parser gave no item");
      class02678 class02678 = class02713.N();
      N(var1, class03556, class02678);
      return new class06796(class03556, class02678);
   }

   public CompletableFuture<Suggestions> N(SuggestionsBuilder var1) {
      StringReader stringreader = new StringReader(var1.getInput());
      stringreader.setCursor(var1.getStart());
      class06802 class06802 = new class06802();
      class06773 class06773 = new class06773(this, stringreader, class06802);

      try {
         class06773.N();
      } catch (CommandSyntaxException commandsyntaxexception) {
      }

      return class06802.N(var1, stringreader);
   }

   private static void N(StringReader var0, class03556<class06581> var1, class02678 var2) throws CommandSyntaxException {
      class06584.N(class02509.N(((class06581)var1.N()).R(), var2)).getOrThrow(var1x -> P.createWithContext(var0, var1x));
   }

   public void N(StringReader var1, class06777 var2) throws CommandSyntaxException {
      int ix = var1.getCursor();

      try {
         new class06773(this, var1, var2).N();
      } catch (CommandSyntaxException commandsyntaxexception) {
         var1.setCursor(ix);
         throw commandsyntaxexception;
      }
   }
}
