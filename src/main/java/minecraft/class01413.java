package minecraft;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Locale;
import java.util.function.Function;

public class class01413 implements class05598 {
   static final SuggestionProvider<class07701> N = (var0, var1) -> class07689.N(N(var0).N(), var1);
   public static final Function<String, class05622> y = var0 -> new class01389(var0);
   private final class01418 L;
   private final class01894 u;

   class01413(class01418 var1, class01894 var2) {
      super();
      this.L = var1;
      this.u = var2;
   }

   @Override
   public class00392 y() {
      return class00392.N("commands.data.storage.modified", class00392.N(this.u));
   }

   @Override
   public class00392 N(class07793 var1, double var2, int var4) {
      return class00392.N("commands.data.storage.get", var1.N(), class00392.N(this.u), String.format(Locale.ROOT, "%.2f", var2), var4);
   }

   static class01418 N(CommandContext<class07701> var0) {
      return ((class07701)var0.getSource()).W().yZ();
   }

   @Override
   public class00392 N(class07709 var1) {
      return class00392.N("commands.data.storage.query", class00392.N(this.u), class07717.y(var1));
   }

   @Override
   public class07001 N() {
      return this.L.N(this.u);
   }

   @Override
   public void N(class07001 var1) {
      this.L.N(this.u, var1);
   }
}
