package minecraft;

import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.time.Instant;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public record class04944(Instant startDate, int daysLeft, class04959 type) {
   private static final Logger u = LogUtils.getLogger();

   public class04959 L() {
      return this.type;
   }

   public class04944(Instant startDate, int daysLeft, class04959 type) {
      this.startDate = startDate;
      this.daysLeft = daysLeft;
      this.type = type;
   }

   public int y() {
      return this.daysLeft;
   }

   private static class04959 y(@Nullable String var0) {
      try {
         if (var0 != null) {
            return class04959.valueOf(var0);
         }
      } catch (Exception exception) {
      }

      return class04959.field_19443;
   }

   public static class04944 N(String var0) {
      try {
         JsonObject jsonobject = class08314.N(var0).getAsJsonObject();
         return new class04944(
            class04719.y("startDate", jsonobject), class04719.N("daysLeft", jsonobject, 0), y(class04719.N("subscriptionType", jsonobject, null))
         );
      } catch (Exception exception) {
         u.error("Could not parse Subscription", exception);
         return new class04944(Instant.EPOCH, 0, class04959.field_19443);
      }
   }

   public Instant N() {
      return this.startDate;
   }
}
