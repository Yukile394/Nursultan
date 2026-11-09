package minecraft;

import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.tree.ArgumentCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import org.jspecify.annotations.Nullable;

class class07704 implements class07273<class07701> {
   private final class07701 N = class07686.N(class08152.M);

   class07704() {
      super();
   }

   @Override
   public boolean y(CommandNode<class07701> var1) {
      return !var1.getRequirement().test(this.N);
   }

   @Nullable
   @Override
   public class01894 N(ArgumentCommandNode<class07701, ?> var1) {
      SuggestionProvider suggestionprovider = var1.getCustomSuggestions();
      return suggestionprovider != null ? class06791.y(suggestionprovider) : null;
   }

   @Override
   public boolean N(CommandNode<class07701> var1) {
      return var1.getCommand() != null;
   }
}
