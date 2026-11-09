package minecraft;

import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Logger;

public record class04976(List<class04948> backups) {
   private static final Logger y = LogUtils.getLogger();

   public class04976(List<class04948> backups) {
      this.backups = backups;
   }

   public List<class04948> N() {
      return this.backups;
   }

   public static class04976 N(String var0) {
      ArrayList arraylist = new ArrayList();

      try {
         JsonElement jsonelement = class08314.N(var0).getAsJsonObject().get("backups");
         if (jsonelement.isJsonArray()) {
            Iterator<JsonElement> iterator = jsonelement.getAsJsonArray().iterator();

            while (iterator.hasNext()) {
               class04948 class04948 = class04948.N(iterator.next());
               if (class04948 != null) {
                  arraylist.add(class04948);
               }
            }
         }
      } catch (Exception exception) {
         y.error("Could not parse BackupList", exception);
      }

      return new class04976(arraylist);
   }
}
