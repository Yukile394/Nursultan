package minecraft;

import java.util.UUID;

public record class02018(UUID sessionId, class04450 keyPair) {
   public class04450 L() {
      return this.keyPair;
   }

   public class02018(UUID sessionId, class04450 keyPair) {
      super();
      this.sessionId = sessionId;
      this.keyPair = keyPair;
   }

   public UUID y() {
      return this.sessionId;
   }

   public class03065 N(UUID var1) {
      return new class03080(var1, this.sessionId).N(class03954.N(this.keyPair.y(), "SHA256withRSA"));
   }

   public static class02018 N(class04450 var0) {
      return new class02018(UUID.randomUUID(), var0);
   }

   public class02027 N() {
      return new class02027(this.sessionId, this.keyPair.L());
   }
}
