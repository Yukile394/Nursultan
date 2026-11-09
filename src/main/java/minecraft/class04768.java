package minecraft;

import com.google.common.cache.CacheLoader;
import com.google.common.hash.HashCode;
import com.mojang.serialization.DynamicOps;

class class04768 extends CacheLoader<class02480<?>, Integer> {
   private final DynamicOps<HashCode> y;

   class04768(class04765 var1) {
      super();
      this.N = var1;
      this.y = this.N.N.method_56673().N(class00166.L);
   }

   public Integer load(class02480<?> var1) {
      return ((HashCode)var1.N(this.y).getOrThrow(var1x -> new IllegalArgumentException("Failed to hash " + var1 + ": " + var1x))).asInt();
   }
}
