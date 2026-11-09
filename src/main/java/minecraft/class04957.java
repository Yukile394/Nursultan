package minecraft;

import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public record class04957(String invitationId, String realmName, String realmOwnerName, UUID realmOwnerUuid, Instant date) {
   private static final Logger R = LogUtils.getLogger();

   public String L() {
      return this.realmOwnerName;
   }

   public class04957(String invitationId, String realmName, String realmOwnerName, UUID realmOwnerUuid, Instant date) {
      this.invitationId = invitationId;
      this.realmName = realmName;
      this.realmOwnerName = realmOwnerName;
      this.realmOwnerUuid = realmOwnerUuid;
      this.date = date;
   }

   public Instant i() {
      return this.date;
   }

   public UUID u() {
      return this.realmOwnerUuid;
   }

   public String y() {
      return this.realmName;
   }

   public String N() {
      return this.invitationId;
   }

   @Nullable
   public static class04957 N(JsonObject var0) {
      try {
         return new class04957(
            class04719.N("invitationId", var0, ""),
            class04719.N("worldName", var0, ""),
            class04719.N("worldOwnerName", var0, ""),
            class04719.N("worldOwnerUuid", var0, class07536.R),
            class04719.y("date", var0)
         );
      } catch (Exception exception) {
         R.error("Could not parse PendingInvite", exception);
         return null;
      }
   }
}
