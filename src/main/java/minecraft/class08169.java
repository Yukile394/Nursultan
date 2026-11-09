package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record class08169(int maxDurationTicks, float minSpeed, float minRelativeSpeed) {
   public static final Codec<class08169> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class06338.T.fieldOf("max_duration_ticks").forGetter(class08169::N),
            Codec.FLOAT.optionalFieldOf("min_speed", 0.0F).forGetter(class08169::y),
            Codec.FLOAT.optionalFieldOf("min_relative_speed", 0.0F).forGetter(class08169::L)
         )
         .apply(var0, class08169::new)
   );
   public static final class02362<ByteBuf, class08169> y = class02362.N(
      class02389.B, class08169::N, class02389.E, class08169::y, class02389.E, class08169::L, class08169::new
   );

   public float L() {
      return this.minRelativeSpeed;
   }

   public class08169(int maxDurationTicks, float minSpeed, float minRelativeSpeed) {
      super();
      this.maxDurationTicks = maxDurationTicks;
      this.minSpeed = minSpeed;
      this.minRelativeSpeed = minRelativeSpeed;
   }

   public float y() {
      return this.minSpeed;
   }

   public static Optional<class08169> y(int var0, float var1) {
      return Optional.of(new class08169(var0, 0.0F, var1));
   }

   public int N() {
      return this.maxDurationTicks;
   }

   public boolean N(int var1, double var2, double var4, double var6) {
      return var1 <= this.maxDurationTicks && var2 >= this.minSpeed * var6 && var4 >= this.minRelativeSpeed * var6;
   }

   public static Optional<class08169> N(int var0, float var1) {
      return Optional.of(new class08169(var0, var1, 0.0F));
   }
}
