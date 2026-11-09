package minecraft;

import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public record class04979(String newsLink) {
   private static final Logger y = LogUtils.getLogger();

   public class04979(@Nullable String newsLink) {
      super();
      this.newsLink = newsLink;
   }

   @Nullable
   public String N() {
      return this.newsLink;
   }

   public static class04979 N(String var0) {
      String s = null;

      try {
         JsonObject jsonobject = class08314.N(var0).getAsJsonObject();
         s = class04719.N("newsLink", jsonobject, null);
      } catch (Exception exception) {
         y.error("Could not parse RealmsNews", exception);
      }

      return new class04979(s);
   }
}
