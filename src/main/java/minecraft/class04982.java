package minecraft;

import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public record class04982(
   String id, String name, String version, String author, String link, String image, String trailer, String recommendedPlayers, class05398 type
) {
   private static final Logger z = LogUtils.getLogger();

   public String L() {
      return this.version;
   }

   public String M() {
      return this.trailer;
   }

   public class04982(
      String id, String name, String version, String author, String link, @Nullable String image, String trailer, String recommendedPlayers, class05398 type
   ) {
      this.id = id;
      this.name = name;
      this.version = version;
      this.author = author;
      this.link = link;
      this.image = image;
      this.trailer = trailer;
      this.recommendedPlayers = recommendedPlayers;
      this.type = type;
   }

   public String B() {
      return this.recommendedPlayers;
   }

   public class05398 Z() {
      return this.type;
   }

   public String i() {
      return this.link;
   }

   public String u() {
      return this.author;
   }

   public String y() {
      return this.name;
   }

   public String N() {
      return this.id;
   }

   @Nullable
   public static class04982 N(JsonObject var0) {
      try {
         String s = class04719.N("type", var0, null);
         return new class04982(
            class04719.N("id", var0, ""),
            class04719.N("name", var0, ""),
            class04719.N("version", var0, ""),
            class04719.N("author", var0, ""),
            class04719.N("link", var0, ""),
            class04719.N("image", var0, null),
            class04719.N("trailer", var0, ""),
            class04719.N("recommendedPlayers", var0, ""),
            s == null ? class05398.field_19447 : class05398.valueOf(s)
         );
      } catch (Exception exception) {
         z.error("Could not parse WorldTemplate", exception);
         return null;
      }
   }

   @Nullable
   public String R() {
      return this.image;
   }
}
