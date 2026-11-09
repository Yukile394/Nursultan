package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

record class07069(int amplifier, int duration, boolean ambient, boolean showParticles, boolean showIcon, Optional<class07069> hiddenEffect) {
   public static final MapCodec<class07069> N = MapCodec.recursive(
      "MobEffectInstance.Details",
      var0 -> RecordCodecBuilder.mapCodec(
         var1 -> var1.group(
               class06338.s.optionalFieldOf("amplifier", 0).forGetter(class07069::N),
               Codec.INT.optionalFieldOf("duration", 0).forGetter(class07069::y),
               Codec.BOOL.optionalFieldOf("ambient", false).forGetter(class07069::L),
               Codec.BOOL.optionalFieldOf("show_particles", true).forGetter(class07069::u),
               Codec.BOOL.optionalFieldOf("show_icon").forGetter(var0xx -> Optional.of(var0xx.i())),
               var0.optionalFieldOf("hidden_effect").forGetter(class07069::R)
            )
            .apply(var1, class07069::N)
      )
   );
   public static final class02362<ByteBuf, class07069> y = class02362.N_32(
      var0 -> class02362.N(
         class02389.B,
         class07069::N,
         class02389.B,
         class07069::y,
         class02389.y,
         class07069::L,
         class02389.y,
         class07069::u,
         class02389.y,
         class07069::i,
         var0.N_33(class02389::N),
         class07069::R,
         class07069::new
      )
   );

   public boolean L() {
      return this.ambient;
   }

   class07069(int amplifier, int duration, boolean ambient, boolean showParticles, boolean showIcon, Optional<class07069> hiddenEffect) {
      this.amplifier = amplifier;
      this.duration = duration;
      this.ambient = ambient;
      this.showParticles = showParticles;
      this.showIcon = showIcon;
      this.hiddenEffect = hiddenEffect;
   }

   public boolean i() {
      return this.showIcon;
   }

   public boolean u() {
      return this.showParticles;
   }

   public int y() {
      return this.duration;
   }

   private static class07069 N(int var0, int var1, boolean var2, boolean var3, Optional<Boolean> var4, Optional<class07069> var5) {
      return new class07069(var0, var1, var2, var3, var4.orElse(var3), var5);
   }

   public int N() {
      return this.amplifier;
   }

   public Optional<class07069> R() {
      return this.hiddenEffect;
   }
}
