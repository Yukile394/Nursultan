package minecraft;

import Nursultan.class10406;
import com.mojang.authlib.GameProfile;
import java.util.UUID;

public record class02048(UUID sessionId, class04454 profilePublicKey) {
   public class02048(UUID sessionId, class04454 profilePublicKey) {
      super();
      this.sessionId = sessionId;
      this.profilePublicKey = profilePublicKey;
   }

   public class04454 y() {
      return this.profilePublicKey;
   }

   public class02027 N(GameProfile var1, class03962 var2) throws class10406 {
      return new class02027(this.sessionId, class04470.N(var2, var1.id(), this.profilePublicKey));
   }

   public UUID N() {
      return this.sessionId;
   }

   public static class02048 N(class00667 var0) {
      return new class02048(var0.m(), new class04454(var0));
   }

   public static void N(class00667 var0, class02048 var1) {
      var0.N(var1.sessionId);
      var1.profilePublicKey.N(var0);
   }
}
