package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Logger;

public record class04956(List<class04957> pendingInvites) {
   private static final Logger y = LogUtils.getLogger();

   public class04956(List<class04957> pendingInvites) {
      super();
      this.pendingInvites = pendingInvites;
   }

   public List<class04957> N() {
      return this.pendingInvites;
   }

   public static class04956 N(String var0) {
      ArrayList arraylist = new ArrayList();

      try {
         JsonObject jsonobject = class08314.N(var0).getAsJsonObject();
         if (jsonobject.get("invites").isJsonArray()) {
            Iterator<JsonElement> iterator = jsonobject.get("invites").getAsJsonArray().iterator();

            while (iterator.hasNext()) {
               class04957 class04957 = class04957.N(iterator.next().getAsJsonObject());
               if (class04957 != null) {
                  arraylist.add(class04957);
               }
            }
         }
      } catch (Exception exception) {
         y.error("Could not parse PendingInvitesList", exception);
      }

      return new class04956(arraylist);
   }
}
