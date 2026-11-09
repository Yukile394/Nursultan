package minecraft;

import com.google.common.cache.CacheLoader;
import com.mojang.authlib.GameProfile;

class class07907 extends CacheLoader<class02689, class07923> {
   class07907(class07949 var1) {
      super();
      this.N = var1;
   }

   public class07923 load(class02689 var1) {
      GameProfile gameprofile = var1.y();
      return new class07923(this.N, gameprofile, class00189.N(gameprofile), var1.L());
   }
}
