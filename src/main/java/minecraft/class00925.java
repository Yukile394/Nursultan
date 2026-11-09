package minecraft;

import com.google.common.cache.CacheLoader;
import com.mojang.authlib.GameProfile;
import java.util.Optional;

class class00925 extends CacheLoader<String, Optional<GameProfile>> {
   class00925(class00932 var1, class08957 var2) {
      super();
      this.y = var1;
      this.N = var2;
   }

   public Optional<GameProfile> load(String var1) {
      return this.N.N(var1).flatMap(var1x -> (Optional<? extends GameProfile>)this.y.N.getUnchecked(var1x.N()));
   }
}
