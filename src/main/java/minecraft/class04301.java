package minecraft;

import com.google.common.cache.CacheLoader;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import org.apache.commons.lang3.mutable.MutableInt;

class class04301 extends CacheLoader<class04782, class04313> {
   class04301() {
      super();
   }

   public class04313 load(class04782 var1) {
      return new class04313(Object2IntMaps.synchronize(new Object2IntOpenHashMap()), new MutableInt(0));
   }
}
