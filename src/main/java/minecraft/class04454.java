package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.viaversion.viafabricplus.injection.access.networking.legacy_chat_signature.IProfilePublicKey_Data;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.PublicKey;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

public final class class04454 implements IProfilePublicKey_Data {
   private Instant expiresAt;
   PublicKey key;
   private byte[] keySignature;
   private static final int i = 4096;
   public static final Codec<class04454> y = RecordCodecBuilder.create(
      var0 -> var0.group(
            class06338.l.fieldOf("expires_at").forGetter(class04454::y),
            class01222.R.fieldOf("key").forGetter(class04454::L),
            class06338.d.fieldOf("signature_v2").forGetter(class04454::u)
         )
         .apply(var0, class04454::new)
   );
   private byte[] R;

   public PublicKey L() {
      return this.key;
   }

   public byte[] viafabricplus$getLegacyPublicKeySignature() {
      return this.R;
   }

   public class04454(Instant var1, PublicKey var2, byte[] var3) {
      super();
      this.expiresAt = var1;
      this.key = var2;
      this.keySignature = var3;
   }

   public class04454(class00667 var1) {
      this(var1.j(), var1.v(), var1.N(4096));
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof class04454 class04454)
         ? false
         : this.expiresAt.equals(class04454.expiresAt) && this.key.equals(class04454.key) && Arrays.equals(this.keySignature, class04454.keySignature);
   }

   @Override
   public final String toString() {
      return "class04454[expiresAt="
         + Objects.toString(this.expiresAt)
         + ", key="
         + Objects.toString(this.key)
         + ", keySignature="
         + Objects.toString(this.keySignature)
         + "]";
   }

   @Override
   public final int hashCode() {
      return ((0 * 31 + Objects.hashCode(this.expiresAt)) * 31 + Objects.hashCode(this.key)) * 31 + Objects.hashCode(this.keySignature);
   }

   public byte[] u() {
      return this.keySignature;
   }

   public Instant y() {
      return this.expiresAt;
   }

   public void N(class00667 var1) {
      var1.N(this.expiresAt);
      var1.N(this.key);
      var1.N(this.keySignature);
   }

   boolean N(class03962 var1, UUID var2) {
      return var1.N(this.N(var2), this.keySignature);
   }

   public boolean N() {
      return this.expiresAt.isBefore(Instant.now());
   }

   private byte[] N(UUID var1) {
      byte[] abyte = this.key.getEncoded();
      byte[] abyte1 = new byte[24 + abyte.length];
      ByteBuffer.wrap(abyte1)
         .order(ByteOrder.BIG_ENDIAN)
         .putLong(var1.getMostSignificantBits())
         .putLong(var1.getLeastSignificantBits())
         .putLong(this.expiresAt.toEpochMilli())
         .put(abyte);
      return abyte1;
   }

   public boolean N(Duration var1) {
      return this.expiresAt.plus(var1).isBefore(Instant.now());
   }

   public void viafabricplus$setLegacyPublicKeySignature(byte[] var1) {
      this.R = var1;
   }
}
