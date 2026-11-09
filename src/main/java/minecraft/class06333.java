package minecraft;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

public class class06333<I, V> {
   private final BiMap<I, V> N = HashBiMap.create();

   public class06333() {
      super();
   }

   public Set<V> N() {
      return Collections.unmodifiableSet(this.N.values());
   }

   public class06333<I, V> N(I var1, V var2) {
      Objects.requireNonNull(var2, () -> "Value for " + var1 + " is null");
      this.N.put(var1, var2);
      return this;
   }

   public Codec<V> N(Codec<I> var1) {
      BiMap bimap = this.N.inverse();
      return class06338.N(var1, this.N::get, bimap::get);
   }
}
