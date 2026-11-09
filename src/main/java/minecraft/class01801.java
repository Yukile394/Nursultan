package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.JavaOps;

public class class01801<T> {
   private final Codec<T> N;

   class01801(Codec<T> var1) {
      super();
      this.N = var1;
   }

   public T N(T var1, class01929 var2, class01929 var3) {
      class03519 class03519x = var2.N(JavaOps.INSTANCE);
      class03519 class03519x = var3.N(JavaOps.INSTANCE);
      Object object = this.N.encodeStart(class03519x, var1).getOrThrow(var0 -> new IllegalStateException("Failed to encode: " + var0));
      return (T)this.N.parse(class03519x, object).getOrThrow(var0 -> new IllegalStateException("Failed to decode: " + var0));
   }
}
