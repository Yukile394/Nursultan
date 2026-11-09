package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.apache.commons.io.FilenameUtils;

public class class00202<T> implements ArgumentType<Collection<class03529<T>>> {
   private static final Collection<String> L = List.of("minecraft:*", "*:asset", "*");
   public static final Dynamic2CommandExceptionType N = new Dynamic2CommandExceptionType(
      (var0, var1) -> class00392.y("argument.resource_selector.not_found", var0, var1)
   );
   public final class05946<? extends class00751<T>> y;
   private final class01905<T> u;

   public class00202(class04348 var1, class05946<? extends class00751<T>> var2) {
      super();
      this.y = var2;
      this.u = var1.y(var2);
   }

   private static String y(StringReader var0) {
      int i = var0.getCursor();

      while (var0.canRead() && N(var0.peek())) {
         var0.skip();
      }

      return var0.getString().substring(i, var0.getCursor());
   }

   public static <T> Collection<class03529<T>> N(CommandContext<class07701> var0, String var1) {
      return (Collection<class03529<T>>)var0.getArgument(var1, Collection.class);
   }

   public Collection<class03529<T>> parse(StringReader var1) throws CommandSyntaxException {
      String s = N(y(var1));
      List list = this.u.z().filter(var1x -> N(s, var1x.B().N())).toList();
      if (list.isEmpty()) {
         throw N.createWithContext(var1, s, this.y.N());
      } else {
         return list;
      }
   }

   public static <T> Collection<class03529<T>> N(StringReader var0, class01905<T> var1) {
      String s = N(y(var0));
      return var1.z().filter(var1x -> N(s, var1x.B().N())).toList();
   }

   private static boolean N(char var0) {
      return class01894.N(var0) || var0 == '*' || var0 == '?';
   }

   private static String N(String var0) {
      return !var0.contains(":") ? "minecraft:" + var0 : var0;
   }

   public static <T> class00202<T> N(class04348 var0, class05946<? extends class00751<T>> var1) {
      return new class00202<>(var0, var1);
   }

   private static boolean N(String var0, class01894 var1) {
      return FilenameUtils.wildcardMatch(var1.toString(), var0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return class07689.N(var1, var2, this.y, class07666.field_37263);
   }

   public Collection<String> getExamples() {
      return L;
   }
}
