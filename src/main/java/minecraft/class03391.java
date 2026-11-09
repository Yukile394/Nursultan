package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.time.Instant;
import java.util.UUID;

public record class03391(class00392 message, Instant timeStamp) implements class03387 {
   public static final MapCodec<class03391> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class03748.N.fieldOf("message").forGetter(class03391::L), class06338.l.fieldOf("time_stamp").forGetter(class03391::u))
         .apply(var0, class03391::new)
   );

   public class00392 L() {
      return this.message;
   }

   public class03391(class00392 message, Instant timeStamp) {
      super();
      this.message = message;
      this.timeStamp = timeStamp;
   }

   @Override
   public class03075 i() {
      return class03075.field_40805;
   }

   public Instant u() {
      return this.timeStamp;
   }

   @Override
   public class00392 N() {
      return this.message;
   }

   @Override
   public boolean N(UUID var1) {
      return false;
   }
}
