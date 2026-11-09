package minecraft;

import java.time.Instant;
import java.util.Date;
import java.util.Objects;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

record class07419(class08774 player, String reason, String source, Optional<Instant> expires) {
   @Nullable
   public String L() {
      return this.reason;
   }

   class07419(class08774 player, @Nullable String reason, String source, Optional<Instant> expires) {
      super();
      this.player = player;
      this.reason = reason;
      this.source = source;
      this.expires = expires;
   }

   public Optional<Instant> i() {
      return this.expires;
   }

   public String u() {
      return this.source;
   }

   public class08774 y() {
      return this.player;
   }

   static class07419 N(class05157 var0) {
      return new class07419(Objects.requireNonNull(var0.B()), var0.u(), var0.y(), Optional.ofNullable(var0.L()).map(Date::toInstant));
   }

   class05157 N() {
      return new class05157(new class08774(this.y().N(), this.y().y()), null, this.u(), this.i().map(Date::from).orElse(null), this.L());
   }
}
