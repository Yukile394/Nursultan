package minecraft;

import Nursultan.class09415;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;

public class class06615 {
   static final class05247 N = class05247.N(8.0F);
   final class07949 y;
   private final LoadingCache<class09415, class08985> L = CacheBuilder.newBuilder().expireAfterAccess(class07949.y).build(new class06634(this));

   public class06615(class07949 var1) {
      super();
      this.y = var1;
   }

   public class08985 N(class09415 var1) {
      return (class08985)this.L.getUnchecked(var1);
   }
}
