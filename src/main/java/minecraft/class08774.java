package minecraft;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.yggdrasil.response.NameAndId;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public record class08774(UUID id, String name) {
   public static final Codec<class08774> N = RecordCodecBuilder.create(
      var0 -> var0.group(class01487.u.fieldOf("id").forGetter(class08774::N), Codec.STRING.fieldOf("name").forGetter(class08774::y))
         .apply(var0, class08774::new)
   );

   public class08774(UUID id, String name) {
      super();
      this.id = id;
      this.name = name;
   }

   public class08774(NameAndId var1) {
      this(var1.id(), var1.name());
   }

   public class08774(GameProfile var1) {
      this(var1.id(), var1.name());
   }

   public String y() {
      return this.name;
   }

   public void y(JsonObject var1) {
      var1.addProperty("uuid", this.N().toString());
      var1.addProperty("name", this.y());
   }

   @Nullable
   public static class08774 N(JsonObject var0) {
      if (var0.has("uuid") && var0.has("name")) {
         String s = var0.get("uuid").getAsString();

         UUID uuid;
         try {
            uuid = UUID.fromString(s);
         } catch (Throwable throwable) {
            return null;
         }

         return new class08774(uuid, var0.get("name").getAsString());
      } else {
         return null;
      }
   }

   public UUID N() {
      return this.id;
   }

   public static class08774 N(String var0) {
      UUID uuid = class01487.N(var0);
      return new class08774(uuid, var0);
   }
}
