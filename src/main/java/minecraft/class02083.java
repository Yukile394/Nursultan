package minecraft;

import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.security.SignatureException;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public record class02083(int index, UUID sender, UUID sessionId) {
   public static final Codec<class02083> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class06338.T.fieldOf("index").forGetter(class02083::y),
            class01487.N.fieldOf("sender").forGetter(class02083::L),
            class01487.N.fieldOf("session_id").forGetter(class02083::u)
         )
         .apply(var0, class02083::new)
   );

   public UUID L() {
      return this.sender;
   }

   public class02083(int index, UUID sender, UUID sessionId) {
      super();
      this.index = index;
      this.sender = sender;
      this.sessionId = sessionId;
   }

   public UUID u() {
      return this.sessionId;
   }

   public int y() {
      return this.index;
   }

   public static class02083 N(UUID var0) {
      return N(var0, class07536.R);
   }

   public void N(class03934 var1) throws SignatureException {
      var1.update(class01487.y(this.sender));
      var1.update(class01487.y(this.sessionId));
      var1.update(Ints.toByteArray(this.index));
   }

   public boolean N(class02083 var1) {
      return this.index > var1.y() && this.sender.equals(var1.L()) && this.sessionId.equals(var1.u());
   }

   public static class02083 N(UUID var0, UUID var1) {
      return new class02083(0, var0, var1);
   }

   @Nullable
   public class02083 N() {
      return this.index == Integer.MAX_VALUE ? null : new class02083(this.index + 1, this.sender, this.sessionId);
   }
}
