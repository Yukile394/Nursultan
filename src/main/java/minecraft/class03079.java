package minecraft;

import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;

public record class03079(String content, Instant timeStamp, long salt, class03048 lastSeen) {
   public static final MapCodec<class03079> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.STRING.fieldOf("content").forGetter(class03079::N),
            class06338.l.fieldOf("time_stamp").forGetter(class03079::y),
            Codec.LONG.fieldOf("salt").forGetter(class03079::L),
            class03048.N.optionalFieldOf("last_seen", class03048.y).forGetter(class03079::u)
         )
         .apply(var0, class03079::new)
   );

   public long L() {
      return this.salt;
   }

   public class03079(String content, Instant timeStamp, long salt, class03048 lastSeen) {
      super();
      this.content = content;
      this.timeStamp = timeStamp;
      this.salt = salt;
      this.lastSeen = lastSeen;
   }

   public class03048 u() {
      return this.lastSeen;
   }

   public Instant y() {
      return this.timeStamp;
   }

   public class03056 N(class03397 var1) {
      return new class03056(this.content, this.timeStamp, this.salt, this.lastSeen.N(var1));
   }

   public void N(class03934 var1) throws SignatureException {
      var1.update(Longs.toByteArray(this.salt));
      var1.update(Longs.toByteArray(this.timeStamp.getEpochSecond()));
      byte[] abyte = this.content.getBytes(StandardCharsets.UTF_8);
      var1.update(Ints.toByteArray(abyte.length));
      var1.update(abyte);
      this.lastSeen.N(var1);
   }

   public static class03079 N(String var0) {
      return new class03079(var0, Instant.now(), 0L, class03048.y);
   }

   public String N() {
      return this.content;
   }
}
