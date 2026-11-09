package minecraft;

import com.mojang.serialization.Codec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;

record class01709(Map<class01894, class08019> map) {
   public static final Codec<class01709> N = Codec.unboundedMap(class01894.N, class08019.N).xmap(class01709::new, class01709::N);

   class01709(Map<class01894, class08019> map) {
      super();
      this.map = map;
   }

   public Map<class01894, class08019> N() {
      return this.map;
   }

   public void N(BiConsumer<class01894, class08019> var1) {
      this.map.entrySet().stream().sorted(Entry.comparingByValue()).forEach(var1x -> var1.accept(var1x.getKey(), var1x.getValue()));
   }
}
