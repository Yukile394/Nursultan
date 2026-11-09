package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.security.PrivateKey;
import java.time.Instant;

public record class04450(PrivateKey privateKey, class04470 publicKey, Instant refreshedAfter) {
   public static final Codec<class04450> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class01222.M.fieldOf("private_key").forGetter(class04450::y),
            class04470.L.fieldOf("public_key").forGetter(class04450::L),
            class06338.l.fieldOf("refreshed_after").forGetter(class04450::u)
         )
         .apply(var0, class04450::new)
   );

   public class04470 L() {
      return this.publicKey;
   }

   public class04450(PrivateKey privateKey, class04470 publicKey, Instant refreshedAfter) {
      this.privateKey = privateKey;
      this.publicKey = publicKey;
      this.refreshedAfter = refreshedAfter;
   }

   public Instant u() {
      return this.refreshedAfter;
   }

   public PrivateKey y() {
      return this.privateKey;
   }

   public boolean N() {
      return this.refreshedAfter.isBefore(Instant.now());
   }
}
