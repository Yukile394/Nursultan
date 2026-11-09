package minecraft;

import Nursultan.class10406;
import com.mojang.serialization.Codec;
import java.time.Duration;
import java.util.UUID;

public record class04470(class04454 data) {
   public static final class00392 N = class00392.L("multiplayer.disconnect.expired_public_key");
   private static final class00392 i = class00392.L("multiplayer.disconnect.invalid_public_key_signature");
   public static final Duration y = Duration.ofHours(8L);
   public static final Codec<class04470> L = class04454.y.xmap(class04470::new, class04470::y);

   public class04470(class04454 data) {
      this.data = data;
   }

   public class04454 y() {
      return this.data;
   }

   public static class04470 N(class03962 var0, UUID var1, class04454 var2) throws class10406 {
      if (!var2.N(var0, var1)) {
         throw new class10406(i);
      } else {
         return new class04470(var2);
      }
   }

   public class03962 N() {
      return class03962.N(this.data.key, "SHA256withRSA");
   }
}
