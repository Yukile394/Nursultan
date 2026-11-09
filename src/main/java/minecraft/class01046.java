package minecraft;

import com.mojang.authlib.ProfileLookupCallback;
import java.util.List;
import java.util.UUID;

class class01046 implements ProfileLookupCallback {
   class01046(class02796 var1, List var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public void onProfileLookupSucceeded(String var1, UUID var2) {
      class08774 class08774 = new class08774(var2, var1);
      this.N.Nf().R().N(class08774);
      this.y.add(class08774);
   }

   public void onProfileLookupFailed(String var1, Exception var2) {
      class01067.N.warn("Could not lookup user whitelist entry for {}", var1, var2);
   }
}
