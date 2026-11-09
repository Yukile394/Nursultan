package minecraft;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;

public record class02188<T, O>(O value) implements class02172<T, O> {
   public class02188(O value) {
      super();
      this.value = (O)value;
   }

   @Override
   public class03556<T> N(ImmutableStringReader var1, class01929 var2, DynamicOps<O> var3, Codec<T> var4, class01921<T> var5) throws CommandSyntaxException {
      return class03556.N((T)var4.parse(var2.N(var3), this.value).getOrThrow(var1x -> class02198.N.createWithContext(var1, var1x)));
   }

   public O N() {
      return this.value;
   }
}
