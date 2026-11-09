package minecraft;

import java.util.Locale;
import org.jspecify.annotations.Nullable;

public record class05136(int httpCode, int code, String reason, String message) implements class05108 {
   @Override
   public String L() {
      return String.format(Locale.ROOT, "Realms service error (%d/%d/%s) with message '%s'", this.httpCode, this.code, this.reason, this.message);
   }

   @Nullable
   public String M() {
      return this.message;
   }

   public class05136(int httpCode, int code, @Nullable String reason, @Nullable String message) {
      super();
      this.httpCode = httpCode;
      this.code = code;
      this.reason = reason;
      this.message = message;
   }

   public int i() {
      return this.code;
   }

   public int u() {
      return this.httpCode;
   }

   @Override
   public class00392 y() {
      String s = "mco.errorMessage." + this.code;
      if (class08392.N(s)) {
         return class00392.L(s);
      } else {
         if (this.reason != null) {
            String s1 = "mco.errorReason." + this.reason;
            if (class08392.N(s1)) {
               return class00392.L(s1);
            }
         }

         return (class00392)(this.message != null ? class00392.y(this.message) : N);
      }
   }

   @Override
   public int N() {
      return this.code;
   }

   @Nullable
   public String R() {
      return this.reason;
   }
}
