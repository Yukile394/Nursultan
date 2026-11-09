package minecraft;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.ints.IntSets;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class class04354 implements class06262 {
   private final Int2ObjectMap<class05647> N;

   public class04354(Map<Integer, Float> var1) {
      super();
      this.N = new Int2ObjectOpenHashMap(var1.size());
      var1.forEach((var1x, var2) -> this.N.put(var1x, new class05647(var2)));
   }

   @Override
   public IntSet N() {
      return IntSets.unmodifiable(this.N.keySet());
   }

   @Nullable
   @Override
   public class00947 N(int var1) {
      return (class00947)this.N.get(var1);
   }
}
