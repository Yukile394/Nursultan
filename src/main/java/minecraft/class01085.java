package minecraft;

import Nursultan.class09435;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.authlib.yggdrasil.ProfileNotFoundException;
import java.util.UUID;

class class01085 implements ProfileLookupCallback {
   class01085(class02796 var1, class01077 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public void onProfileLookupSucceeded(String var1, UUID var2) {
      class08774 class08774 = new class08774(var2, var1);
      this.N.Nf().R().N(class08774);
      this.y.N(new class01087(class08774, this.N.T(), false));
   }

   public void onProfileLookupFailed(String var1, Exception var2) {
      class01067.N.warn("Could not lookup oplist entry for {}", var1, var2);
      if (!(var2 instanceof ProfileNotFoundException)) {
         throw new class09435("Could not request user " + var1 + " from backend systems", var2);
      }
   }
}
