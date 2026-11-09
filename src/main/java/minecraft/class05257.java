package minecraft;

import Nursultan.class10456;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class class05257 {
   private static final Logger y = LogUtils.getLogger();
   public static final class04551 N = N(UUID.randomUUID().toString().replaceAll("-", ""), "Development Version");

   public class05257() {
      super();
   }

   private static class04551 N(JsonObject var0) {
      JsonObject jsonobject = class05001.n(var0, "pack_version");
      return new class10456(
         class05001.Z(var0, "id"),
         class05001.Z(var0, "name"),
         new class01829(class05001.P(var0, "world_version"), class05001.N(var0, "series_id", "main")),
         class05001.P(var0, "protocol_version"),
         class08735.N(class05001.P(jsonobject, "resource_major"), class05001.P(jsonobject, "resource_minor")),
         class08735.N(class05001.P(jsonobject, "data_major"), class05001.P(jsonobject, "data_minor")),
         Date.from(ZonedDateTime.parse(class05001.Z(var0, "build_time")).toInstant()),
         class05001.U(var0, "stable")
      );
   }

   public static class04551 N() {
      try {
         class04551 class04551;
         try (InputStream inputstream = class05257.class.getResourceAsStream("/version.json")) {
            if (inputstream == null) {
               y.warn("Missing version information!");
               return N;
            }

            try (InputStreamReader inputstreamreader = new InputStreamReader(inputstream, StandardCharsets.UTF_8)) {
               class04551 = N(class05001.N(inputstreamreader));
            }
         }

         return class04551;
      } catch (JsonParseException | IOException ioexception) {
         throw new IllegalStateException("Game version information is corrupt", ioexception);
      }
   }

   public static class04551 N(String var0, String var1) {
      return N(var0, var1, true);
   }

   public static class04551 N(String var0, String var1, boolean var2) {
      return new class10456(var0, var1, new class01829(4671, "main"), class07529.L(), class08735.N(75, 0), class08735.N(94, 1), new Date(), var2);
   }
}
