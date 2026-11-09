package minecraft;

import java.time.Instant;
import java.util.Date;
import java.util.Objects;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

record class07407(String ip, String reason, String source, Optional<Instant> expires) {
   @Nullable
   public String L() {
      return this.reason;
   }

   class07407(String ip, @Nullable String reason, String source, Optional<Instant> expires) {
      this.ip = ip;
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

   public String y() {
      return this.ip;
   }

   static class07407 N(class01072 var0) {
      return new class07407(Objects.requireNonNull(var0.B()), var0.u(), var0.y(), Optional.ofNullable(var0.L()).map(Date::toInstant));
   }

   class01072 N() {
      return new class01072(this.y(), null, this.u(), this.i().map(Date::from).orElse(null), this.L());
   }
}
