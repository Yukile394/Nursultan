package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.time.Instant;
import java.util.Optional;

public record class07395(class07947 player, Optional<String> reason, Optional<String> source, Optional<Instant> expires) {
   public static final MapCodec<class07395> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class07947.N.codec().fieldOf("player").forGetter(class07395::N),
            Codec.STRING.optionalFieldOf("reason").forGetter(class07395::y),
            Codec.STRING.optionalFieldOf("source").forGetter(class07395::L),
            class06338.l.optionalFieldOf("expires").forGetter(class07395::u)
         )
         .apply(var0, class07395::new)
   );

   public Optional<String> L() {
      return this.source;
   }

   public class07395(class07947 player, Optional<String> reason, Optional<String> source, Optional<Instant> expires) {
      super();
      this.player = player;
      this.reason = reason;
      this.source = source;
      this.expires = expires;
   }

   public Optional<Instant> u() {
      return this.expires;
   }

   public Optional<String> y() {
      return this.reason;
   }

   public class07419 N(class08774 var1) {
      return new class07419(var1, this.y().orElse(null), this.L().orElse("Management server"), this.u());
   }

   public static class07395 N(class05157 var0) {
      return N(class07419.N(var0));
   }

   public static class07395 N(class07419 var0) {
      return new class07395(class07947.N(var0.y()), Optional.ofNullable(var0.L()), Optional.of(var0.u()), var0.i());
   }

   public class07947 N() {
      return this.player;
   }
}
