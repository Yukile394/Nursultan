package minecraft;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;

public sealed interface class02172<T, O> permits class02188, class02178 {
   class03556<T> N(ImmutableStringReader var1, class01929 var2, DynamicOps<O> var3, Codec<T> var4, class01921<T> var5) throws CommandSyntaxException;
}
