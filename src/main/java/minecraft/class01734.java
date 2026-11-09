package minecraft;

import com.mojang.brigadier.RedirectModifier;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;

public interface class01734<T> extends class01727<T>, RedirectModifier<T> {
   default Collection<T> apply(CommandContext<T> var1) throws CommandSyntaxException {
      throw new UnsupportedOperationException("This function should not run");
   }
}
