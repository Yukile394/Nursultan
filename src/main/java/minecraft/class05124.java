package minecraft;

import java.util.Locale;
import org.jspecify.annotations.Nullable;

public record class05124(int httpCode, class00392 payload) implements class05108 {
   public static final class05124 L = new class05124(429, class00392.L("mco.errorMessage.serviceBusy"));
   public static final class00392 u = class00392.L("mco.errorMessage.retry");
   public static final String i = "<body>";
   public static final String R = "</body>";

   @Override
   public String L() {
      return this.payload != null
         ? String.format(Locale.ROOT, "Realms service error (%d) with message '%s'", this.httpCode, this.payload.getString())
         : String.format(Locale.ROOT, "Realms service error (%d) with no payload", this.httpCode);
   }

   public class05124(int httpCode, @Nullable class00392 payload) {
      super();
      this.httpCode = httpCode;
      this.payload = payload;
   }

   public int i() {
      return this.httpCode;
   }

   public static class05124 u() {
      return new class05124(500, class00392.L("mco.errorMessage.realmsService.configurationError"));
   }

   @Override
   public class00392 y() {
      return this.payload != null ? this.payload : N;
   }

   public static class05124 y(int var0) {
      return new class05124(var0, null);
   }

   public static class05124 y(int var0, String var1) {
      int ix = var1.indexOf("<body>");
      int j = var1.indexOf("</body>");
      if (ix >= 0 && j > ix) {
         return new class05124(var0, class00392.y(var1.substring(ix + "<body>".length(), j).trim()));
      } else {
         y.error("Got an error with an unreadable html body {}", var1);
         return new class05124(var0, null);
      }
   }

   public static class05124 N(class05121 var0) {
      return new class05124(500, class00392.N("mco.errorMessage.realmsService.connectivity", var0.getMessage()));
   }

   public static class05124 N(int var0) {
      return new class05124(var0, u);
   }

   @Override
   public int N() {
      return this.httpCode;
   }

   public static class05124 N(String var0) {
      return new class05124(500, class00392.N("mco.errorMessage.realmsService.unknownCompatibility", var0));
   }

   @Nullable
   public class00392 R() {
      return this.payload;
   }
}
