package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import org.jspecify.annotations.Nullable;

@FunctionalInterface
interface class01555<T, R> {
   @Nullable
   R apply(T var1) throws CommandSyntaxException;
}
