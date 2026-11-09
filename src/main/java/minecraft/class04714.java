package minecraft;

import com.mojang.logging.LogUtils;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import org.slf4j.Logger;

public class class04714 {
   private static final String N = "realms_persistence.json";
   private static final class04968 y = new class04968();
   private static final Logger L = LogUtils.getLogger();

   private static Path L() {
      return ((File)class06202.Nq().l_1).toPath().resolve("realms_persistence.json");
   }

   public class04714() {
      super();
   }

   public static class04717 y() {
      Path path = L();

      try {
         String s = Files.readString(path, StandardCharsets.UTF_8);
         class04717 class04717 = y.N(s, class04717.class);
         if (class04717 != null) {
            return class04717;
         }
      } catch (NoSuchFileException nosuchfileexception) {
      } catch (Exception exception) {
         L.warn("Failed to read Realms storage {}", path, exception);
      }

      return new class04717();
   }

   public static void y(class04717 var0) {
      Path path = L();

      try {
         Files.writeString(path, y.N(var0), StandardCharsets.UTF_8);
      } catch (Exception exception) {
      }
   }

   public void N(class04717 var1) {
      y(var1);
   }

   public class04717 N() {
      return y();
   }
}
