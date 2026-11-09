package minecraft;

import java.util.Locale;

public record class05128(int httpCode, String payload) implements class05108 {
   @Override
   public String L() {
      return String.format(Locale.ROOT, "Realms service error (%d) with raw payload '%s'", this.httpCode, this.payload);
   }

   public class05128(int httpCode, String payload) {
      this.httpCode = httpCode;
      this.payload = payload;
   }

   public String i() {
      return this.payload;
   }

   public int u() {
      return this.httpCode;
   }

   @Override
   public class00392 y() {
      return class00392.y(this.payload);
   }

   @Override
   public int N() {
      return this.httpCode;
   }
}
