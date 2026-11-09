package minecraft;

import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public record class04945(String downloadLink, String resourcePackUrl, String resourcePackHash) {
   private static final Logger u = LogUtils.getLogger();

   public String L() {
      return this.resourcePackHash;
   }

   public class04945(String downloadLink, String resourcePackUrl, String resourcePackHash) {
      this.downloadLink = downloadLink;
      this.resourcePackUrl = resourcePackUrl;
      this.resourcePackHash = resourcePackHash;
   }

   public String y() {
      return this.resourcePackUrl;
   }

   public static class04945 N(String var0) {
      JsonObject jsonobject = class08314.N(var0).getAsJsonObject();

      try {
         return new class04945(
            class04719.N("downloadLink", jsonobject, ""), class04719.N("resourcePackUrl", jsonobject, ""), class04719.N("resourcePackHash", jsonobject, "")
         );
      } catch (Exception exception) {
         u.error("Could not parse WorldDownload", exception);
         return new class04945("", "", "");
      }
   }

   public String N() {
      return this.downloadLink;
   }
}
