package minecraft;

import com.mojang.authlib.GameProfile;
import java.time.Instant;
import java.util.UUID;

public interface class03387 extends class03047 {
   default class00392 y() {
      return this.N();
   }

   boolean N(UUID var1);

   class00392 N();

   static class03391 N(class00392 var0, Instant var1) {
      return new class03391(var0, var1);
   }

   static class03412 N(GameProfile var0, class03926 var1, class03086 var2) {
      return new class03412(var0, var1, var2);
   }
}
