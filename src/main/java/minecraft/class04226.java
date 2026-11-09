package minecraft;

import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.concurrent.Executor;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class class04226 implements AutoCloseable {
   private static final Logger N = LogUtils.getLogger();
   private final class04220<class04199> y;
   private final class08214 L;

   public class04226(FileChannel var1, Executor var2) {
      super();
      this.y = new class04220<>(class04199.N, var1);
      this.L = new class08214(var2, "telemetry-event-log");
   }

   @Override
   public void close() {
      this.L.N(() -> IOUtils.closeQuietly(this.y));
      this.L.close();
   }

   public class04236 N() {
      return var1 -> this.L.N(() -> {
         try {
            this.y.N(var1);
         } catch (IOException ioexception) {
            N.error("Failed to write telemetry event to log", ioexception);
         }
      });
   }
}
