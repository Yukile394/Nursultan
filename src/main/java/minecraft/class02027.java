package minecraft;

import java.time.Duration;
import java.util.UUID;

public record class02027(UUID sessionId, class04470 profilePublicKey) {
   public UUID L() {
      return this.sessionId;
   }

   public class02027(UUID sessionId, class04470 profilePublicKey) {
      this.sessionId = sessionId;
      this.profilePublicKey = profilePublicKey;
   }

   public class04470 u() {
      return this.profilePublicKey;
   }

   public boolean y() {
      return this.profilePublicKey.y().N();
   }

   public class03073 N(UUID var1) {
      return new class03080(var1, this.sessionId).N(this.profilePublicKey);
   }

   public class02048 N() {
      return new class02048(this.sessionId, this.profilePublicKey.y());
   }

   public class03072 N(Duration var1) {
      return new class03061(this.profilePublicKey.N(), () -> this.profilePublicKey.y().N(var1));
   }
}
