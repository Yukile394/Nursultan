package minecraft;

import com.ibm.icu.util.TimeZone;
import java.util.Optional;

record class08340(String format, String localeId, Optional<TimeZone> timeZone) {

   public Optional<TimeZone> L() {
      return this.timeZone;
   }

   class08340(String format, String localeId, Optional<TimeZone> timeZone) {
      this.format = format;
      this.localeId = localeId;
      this.timeZone = timeZone;
   }

   public String y() {
      return this.localeId;
   }

   public String N() {
      return this.format;
   }
}
