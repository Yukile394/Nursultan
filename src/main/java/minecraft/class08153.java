package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import io.netty.buffer.ByteBuf;

public record class08153(boolean canSprint, boolean interactVibrations, float speedMultiplier) {
   public static final class08153 N = new class08153(false, true, 0.2F);
   public static final Codec<class08153> y = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.BOOL.optionalFieldOf("can_sprint", N.canSprint).forGetter(class08153::N),
            Codec.BOOL.optionalFieldOf("interact_vibrations", N.interactVibrations).forGetter(class08153::y),
            Codec.floatRange(0.0F, 1.0F).optionalFieldOf("speed_multiplier", N.speedMultiplier).forGetter(class08153::L)
         )
         .apply(var0, class08153::new)
   );
   public static final class02362<ByteBuf, class08153> L = class02362.N(
      class02389.y, class08153::N, class02389.y, class08153::y, class02389.E, class08153::L, class08153::new
   );

   public float L() {
      return this.speedMultiplier;
   }

   public class08153(boolean canSprint, boolean interactVibrations, float speedMultiplier) {
      super();
      this.canSprint = canSprint;
      this.interactVibrations = interactVibrations;
      this.speedMultiplier = speedMultiplier;
   }

   public boolean y() {
      return this.interactVibrations;
   }

   public boolean N() {
      return this.canSprint;
   }
}
