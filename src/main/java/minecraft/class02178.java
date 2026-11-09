package minecraft;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;

public record class02178<T, O>(class05946<T> key) implements class02172<T, O> {
   public class02178(class05946<T> key) {
      super();
      this.key = key;
   }

   @Override
   public class03556<T> N(ImmutableStringReader var1, class01929 var2, DynamicOps<O> var3, Codec<T> var4, class01921<T> var5) throws CommandSyntaxException {
      return var5.N(this.key).orElseThrow(() -> class02198.y.createWithContext(var1, this.key.N(), this.key.y()));
   }

   public class05946<T> N() {
      return this.key;
   }
}
