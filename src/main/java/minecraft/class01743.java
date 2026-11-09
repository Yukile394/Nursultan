package minecraft;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public interface class01743<T> extends class01729<T>, Command<T> {
   default int run(CommandContext<T> var1) throws CommandSyntaxException {
      throw new UnsupportedOperationException("This function should not run");
   }
}
