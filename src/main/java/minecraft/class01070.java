package minecraft;

import Nursultan.class09435;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.authlib.yggdrasil.ProfileNotFoundException;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

class class01070 implements ProfileLookupCallback {
   class01070(class02796 var1, Map var2, class05170 var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   public void onProfileLookupSucceeded(String var1, UUID var2) {
      class08774 class08774 = new class08774(var2, var1);
      this.N.Nf().R().N(class08774);
      String[] astring = (String[])this.y.get(class08774.y().toLowerCase(Locale.ROOT));
      if (astring == null) {
         class01067.N.warn("Could not convert user banlist entry for {}", class08774.y());
         throw new class09435("Profile not in the conversionlist");
      } else {
         Date date = astring.length > 1 ? class01067.N(astring[1], null) : null;
         String s = astring.length > 2 ? astring[2] : null;
         Date date1 = astring.length > 3 ? class01067.N(astring[3], null) : null;
         String s1 = astring.length > 4 ? astring[4] : null;
         this.L.N(new class05157(class08774, date, s, date1, s1));
      }
   }

   public void onProfileLookupFailed(String var1, Exception var2) {
      class01067.N.warn("Could not lookup user banlist entry for {}", var1, var2);
      if (!(var2 instanceof ProfileNotFoundException)) {
         throw new class09435("Could not request user " + var1 + " from backend systems", var2);
      }
   }
}
