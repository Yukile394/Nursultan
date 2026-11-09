package minecraft;

import com.google.gson.JsonObject;

record class03588(String url, class03596 urlText) {
   private static final String L = "url";
   private static final String u = "urlText";

   private class03588(String url, class03596 urlText) {
      this.url = url;
      this.urlText = urlText;
   }

   public class03596 y() {
      return this.urlText;
   }

   public String N() {
      return this.url;
   }

   public static class03588 N(JsonObject var0) {
      String s = class04719.N("url", var0);
      class03596 class03596 = class04719.N("urlText", var0, class03596::N);
      return new class03588(s, class03596);
   }
}
