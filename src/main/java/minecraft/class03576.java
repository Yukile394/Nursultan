package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.slf4j.Logger;

public class class03576 {
   static final Logger N = LogUtils.getLogger();
   private static final String M = "notificationUuid";
   private static final String B = "dismissable";
   private static final String Z = "seen";
   private static final String z = "type";
   private static final String U = "visitUrl";
   private static final String E = "infoPopup";
   static final class00392 y = class00392.L("mco.notification.visitUrl.buttonText.default");
   final UUID L;
   final boolean u;
   final boolean i;
   final String R;

   public UUID L() {
      return this.L;
   }

   class03576(UUID var1, boolean var2, boolean var3, String var4) {
      super();
      this.L = var1;
      this.u = var2;
      this.i = var3;
      this.R = var4;
   }

   public boolean y() {
      return this.u;
   }

   public boolean N() {
      return this.i;
   }

   private static class03576 N(JsonObject var0) {
      UUID uuid = class04719.N("notificationUuid", var0, null);
      if (uuid == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean flag = class04719.N("dismissable", var0, true);
         boolean flag1 = class04719.N("seen", var0, false);
         String s = class04719.N("type", var0);
         class03576 class03576 = new class03576(uuid, flag, flag1, s);

         return (class03576)(switch (s) {
            case "visitUrl" -> class03605.N(class03576, var0);
            case "infoPopup" -> class03580.N(class03576, var0);
            default -> class03576;
         });
      }
   }

   public static List<class03576> N(String var0) {
      ArrayList arraylist = new ArrayList();

      try {
         for (JsonElement jsonelement : class08314.N(var0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            arraylist.add(N(jsonelement.getAsJsonObject()));
         }
      } catch (Exception exception) {
         N.error("Could not parse list of RealmsNotifications", exception);
      }

      return arraylist;
   }
}
