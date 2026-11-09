package minecraft;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.List;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class03325 {
   private static final class03325 N = new class03355("");
   private static final Logger y = LogUtils.getLogger();
   private static final Gson L = new GsonBuilder().create();
   private final Path u;
   @Nullable
   private class03342 i;

   class03325(String var1) {
      super();
      this.u = ((File)class06202.Nq().l_1).toPath().resolve(var1);
   }

   public void N(class06202 var1) {
      if ((class03443)var1.T_2 != null && this.i != null) {
         class07536.Z()
            .execute(
               () -> {
                  try {
                     Files.deleteIfExists(this.u);
                  } catch (IOException ioexception) {
                     y.error("Failed to delete quickplay log file {}", this.u, ioexception);
                  }

                  class03327 class03327 = new class03327(this.i, Instant.now(), ((class03443)var1.T_2).U());
                  Codec.list(class03327.N)
                     .encodeStart(JsonOps.INSTANCE, List.of(class03327))
                     .resultOrPartial(class07536.N("Quick Play: ", y::error))
                     .ifPresent(var1xx -> {
                        try {
                           Files.createDirectories(this.u.getParent());
                           Files.writeString(this.u, L.toJson(var1xx));
                        } catch (IOException ioexception1) {
                           y.error("Failed to write to quickplay log file {}", this.u, ioexception1);
                        }
                     });
               }
            );
      } else {
         y.error("Failed to log session for quickplay. Missing world data or gamemode");
      }
   }

   public void N(class03371 var1, String var2, String var3) {
      this.i = new class03342(var1, var2, var3);
   }

   public static class03325 N(@Nullable String var0) {
      return var0 == null ? N : new class03325(var0);
   }
}
