package minecraft;

import Nursultan.class09435;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.authlib.yggdrasil.ProfileNotFoundException;
import java.io.File;
import java.util.UUID;

class class01075 implements ProfileLookupCallback {
   class01075(class05623 var1, File var2, File var3, File var4, String[] var5) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
   }

   private void N(File var1, String var2, String var3) {
      File file1 = new File(this.u, var2 + ".dat");
      File file2 = new File(var1, var3 + ".dat");
      class01067.N(var1);
      if (!file1.renameTo(file2)) {
         throw new class09435("Could not convert file for " + var2);
      }
   }

   private String N(String var1) {
      String s = null;

      for (String s1 : this.i) {
         if (s1 != null && s1.equalsIgnoreCase(var1)) {
            s = s1;
            break;
         }
      }

      if (s == null) {
         throw new class09435("Could not find the filename for " + var1 + " anymore");
      } else {
         return s;
      }
   }

   public void onProfileLookupSucceeded(String var1, UUID var2) {
      class08774 class08774 = new class08774(var2, var1);
      this.N.Nf().R().N(class08774);
      this.N(this.y, this.N(var1), var2.toString());
   }

   public void onProfileLookupFailed(String var1, Exception var2) {
      class01067.N.warn("Could not lookup user uuid for {}", var1, var2);
      if (var2 instanceof ProfileNotFoundException) {
         String s = this.N(var1);
         this.N(this.L, s, s);
      } else {
         throw new class09435("Could not request user " + var1 + " from backend systems", var2);
      }
   }
}
