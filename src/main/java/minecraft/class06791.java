package minecraft;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.HashMap;
import java.util.Map;

public class class06791 {
   private static final Map<class01894, SuggestionProvider<class07689>> u = new HashMap<>();
   private static final class01894 i = class01894.y("ask_server");
   public static final SuggestionProvider<class07689> N = N(i, (var0, var1) -> ((class07689)var0.getSource()).N(var0));
   public static final SuggestionProvider<class07689> y = N(
      class01894.y("available_sounds"), (var0, var1) -> class07689.N(((class07689)var0.getSource()).v(), var1)
   );
   public static final SuggestionProvider<class07689> L = N(
      class01894.y("summonable_entities"),
      (var0, var1) -> class07689.N(
         class04206.M.j().filter(var1x -> var1x.N(((class07689)var0.getSource()).G()) && var1x.y()), var1, class07078::N, class07078::M
      )
   );

   public class06791() {
      super();
   }

   public static class01894 y(SuggestionProvider<?> var0) {
      return var0 instanceof class06801 ? ((class06801)var0).N() : i;
   }

   public static <S extends class07689> SuggestionProvider<S> N(class01894 var0, SuggestionProvider<class07689> var1) {
      if ((SuggestionProvider)u.putIfAbsent(var0, var1) != null) {
         throw new IllegalArgumentException("A command suggestion provider is already registered with the name '" + var0 + "'");
      } else {
         return new class06801(var0, var1);
      }
   }

   public static <S extends class07689> SuggestionProvider<S> N(SuggestionProvider<class07689> var0) {
      return var0;
   }

   public static <S extends class07689> SuggestionProvider<S> N(class01894 var0) {
      return N(u.getOrDefault(var0, N));
   }
}
