package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.time.Instant;
import java.util.Optional;

public record class07385(String ip, Optional<String> reason, Optional<String> source, Optional<Instant> expires) {
   public static final MapCodec<class07385> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.STRING.fieldOf("ip").forGetter(class07385::N),
            Codec.STRING.optionalFieldOf("reason").forGetter(class07385::y),
            Codec.STRING.optionalFieldOf("source").forGetter(class07385::L),
            class06338.l.optionalFieldOf("expires").forGetter(class07385::u)
         )
         .apply(var0, class07385::new)
   );

   public Optional<String> L() {
      return this.source;
   }

   public class07385(String ip, Optional<String> reason, Optional<String> source, Optional<Instant> expires) {
      this.ip = ip;
      this.reason = reason;
      this.source = source;
      this.expires = expires;
   }

   public class07407 i() {
      return new class07407(this.N(), this.y().orElse(null), this.L().orElse("Management server"), this.u());
   }

   public Optional<Instant> u() {
      return this.expires;
   }

   public Optional<String> y() {
      return this.reason;
   }

   public String N() {
      return this.ip;
   }

   public static class07385 N(class01072 var0) {
      return N(class07407.N(var0));
   }

   public static class07385 N(class07407 var0) {
      return new class07385(var0.y(), Optional.ofNullable(var0.L()), Optional.of(var0.u()), var0.i());
   }
}
