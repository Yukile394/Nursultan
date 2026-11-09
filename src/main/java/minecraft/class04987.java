package minecraft;

import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public record class04987(boolean worldClosed, String token, URI uploadEndpoint) {
   private static final Logger u = LogUtils.getLogger();
   private static final String i = "http://";
   private static final int R = 8080;
   private static final Pattern M = Pattern.compile("^[a-zA-Z][-a-zA-Z0-9+.]+:");

   public URI L() {
      return this.uploadEndpoint;
   }

   public class04987(boolean worldClosed, @Nullable String token, URI uploadEndpoint) {
      super();
      this.worldClosed = worldClosed;
      this.token = token;
      this.uploadEndpoint = uploadEndpoint;
   }

   @Nullable
   public String y() {
      return this.token;
   }

   public static String y(@Nullable String var0) {
      JsonObject jsonobject = new JsonObject();
      if (var0 != null) {
         jsonobject.addProperty("token", var0);
      }

      return jsonobject.toString();
   }

   @Nullable
   public static class04987 N(String var0) {
      try {
         JsonObject jsonobject = class08314.N(var0).getAsJsonObject();
         String s = class04719.N("uploadEndpoint", jsonobject, null);
         if (s != null) {
            int ix = class04719.N("port", jsonobject, -1);
            URI uri = N(s, ix);
            if (uri != null) {
               boolean flag = class04719.N("worldClosed", jsonobject, false);
               String s1 = class04719.N("token", jsonobject, null);
               return new class04987(flag, s1, uri);
            }
         }
      } catch (Exception exception) {
         u.error("Could not parse UploadInfo", exception);
      }

      return null;
   }

   private static int N(int var0, int var1) {
      if (var0 != -1) {
         return var0;
      } else {
         return var1 != -1 ? var1 : 8080;
      }
   }

   public boolean N() {
      return this.worldClosed;
   }

   private static String N(String var0, Matcher var1) {
      return var1.find() ? var0 : "http://" + var0;
   }

   @Nullable
   public static URI N(String var0, int var1) {
      Matcher matcher = M.matcher(var0);
      String s = N(var0, matcher);

      try {
         URI uri = new URI(s);
         int ix = N(var1, uri.getPort());
         return ix != uri.getPort() ? new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), ix, uri.getPath(), uri.getQuery(), uri.getFragment()) : uri;
      } catch (URISyntaxException urisyntaxexception) {
         u.warn("Failed to parse URI {}", s, urisyntaxexception);
         return null;
      }
   }
}
