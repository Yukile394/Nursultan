package minecraft;

import com.google.common.cache.CacheLoader;
import com.mojang.serialization.DataResult;

class class02922 extends CacheLoader<class02908<?, ?>, DataResult<?>> {
   class02922(class02911 var1) {
      super();
   }

   public DataResult<?> load(class02908<?, ?> var1) {
      return var1.N();
   }
}
