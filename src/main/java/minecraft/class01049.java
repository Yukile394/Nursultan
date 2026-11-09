package minecraft;

import Nursultan.class09435;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.authlib.yggdrasil.ProfileNotFoundException;
import java.util.UUID;

class class01049 implements ProfileLookupCallback {
   class01049(class02796 var1, class05152 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public void onProfileLookupSucceeded(String var1, UUID var2) {
      class08774 class08774 = new class08774(var2, var1);
      this.N.Nf().R().N(class08774);
      this.y.N(new class05142(class08774));
   }

   public void onProfileLookupFailed(String var1, Exception var2) {
      class01067.N.warn("Could not lookup user whitelist entry for {}", var1, var2);
      if (!(var2 instanceof ProfileNotFoundException)) {
         throw new class09435("Could not request user " + var1 + " from backend systems", var2);
      }
   }
}
