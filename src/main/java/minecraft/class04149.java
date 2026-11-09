package minecraft;

import com.mojang.logging.LogUtils;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;
import org.slf4j.Logger;

public class class04149 {
   private static final Logger N = LogUtils.getLogger();
   private final Path y;
   private final boolean L;

   private void L() {
      if (!class07529.ND) {
         try (OutputStream outputstream = Files.newOutputStream(this.y)) {
            Properties properties = new Properties();
            properties.setProperty("eula", "false");
            properties.store(outputstream, "By changing the setting below to TRUE you are indicating your agreement to our EULA (" + class03597.y + ").");
         } catch (Exception exception) {
            N.warn("Failed to save {}", this.y, exception);
         }
      }
   }

   public class04149(Path var1) {
      super();
      this.y = var1;
      this.L = class07529.ND || this.y();
   }

   private boolean y() {
      try {
         boolean flag;
         try (InputStream inputstream = Files.newInputStream(this.y)) {
            Properties properties = new Properties();
            properties.load(inputstream);
            flag = Boolean.parseBoolean(properties.getProperty("eula", "false"));
         }

         return flag;
      } catch (Exception exception) {
         N.warn("Failed to load {}", this.y);
         this.L();
         return false;
      }
   }

   public boolean N() {
      return this.L;
   }
}
