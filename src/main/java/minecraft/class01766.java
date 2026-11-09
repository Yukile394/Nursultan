package minecraft;

import Nursultan.class09519;
import Nursultan.class09521;
import com.mojang.authlib.GameProfile;
import org.jspecify.annotations.Nullable;

public interface class01766 {
   String Nu = "*";
   class01766 Ni = new class01795();

   @Nullable
   default class00392 method_5476() {
      return null;
   }

   String method_5820();

   static class01766 N(String var0) {
      if (var0.equals("*")) {
         return Ni;
      } else {
         class05216 class05216 = class00392.y(var0);
         return new class09521(var0, class05216);
      }
   }

   static class01766 N(GameProfile var0) {
      String s = var0.name();
      return new class09519(s);
   }

   default class00392 yZ() {
      class00392 class00392 = this.method_5476();
      return class00392 != null ? class00392.L().N(var1x -> var1x.N(new class00401(class00392.y(this.method_5820())))) : class00392.y(this.method_5820());
   }
}
