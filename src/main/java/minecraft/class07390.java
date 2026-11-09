package minecraft;

import com.google.common.net.InetAddresses;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.time.Instant;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public record class07390(Optional<class07947> player, Optional<String> ip, Optional<String> reason, Optional<String> source, Optional<Instant> expires) {
   public static final MapCodec<class07390> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class07947.N.codec().optionalFieldOf("player").forGetter(class07390::y),
            Codec.STRING.optionalFieldOf("ip").forGetter(class07390::L),
            Codec.STRING.optionalFieldOf("reason").forGetter(class07390::u),
            Codec.STRING.optionalFieldOf("source").forGetter(class07390::i),
            class06338.l.optionalFieldOf("expires").forGetter(class07390::R)
         )
         .apply(var0, class07390::new)
   );

   public Optional<String> L() {
      return this.ip;
   }

   public class07390(Optional<class07947> player, Optional<String> ip, Optional<String> reason, Optional<String> source, Optional<Instant> expires) {
      this.player = player;
      this.ip = ip;
      this.reason = reason;
      this.source = source;
      this.expires = expires;
   }

   public Optional<String> i() {
      return this.source;
   }

   public Optional<String> u() {
      return this.reason;
   }

   public Optional<class07947> y() {
      return this.player;
   }

   class07407 N(class04770 var1) {
      return new class07407(var1.method_14209(), this.u().orElse(null), this.i().orElse("Management server"), this.R());
   }

   @Nullable
   class07407 N() {
      return !this.L().isEmpty() && InetAddresses.isInetAddress(this.L().get())
         ? new class07407(this.L().get(), this.u().orElse(null), this.i().orElse("Management server"), this.R())
         : null;
   }

   public Optional<Instant> R() {
      return this.expires;
   }
}
