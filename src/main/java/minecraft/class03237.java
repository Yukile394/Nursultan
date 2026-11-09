package minecraft;

import com.mojang.logging.LogUtils;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.function.Supplier;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class03237 {
   private static final Logger N = LogUtils.getLogger();
   private final Runnable y;

   protected class03237(Runnable var1) {
      super();
      this.y = var1;
   }

   public void N(@Nullable Path var1) {
      if (var1 != null) {
         this.y.run();
         N(() -> "Dumped flight recorder profiling to " + var1);

         class03224 class03224;
         try {
            class03224 = class03232.N(var1);
         } catch (Throwable throwable1) {
            N(() -> "Failed to parse JFR recording", throwable1);
            return;
         }

         try {
            N(class03224::y);
            Path path = var1.resolveSibling("jfr-report-" + StringUtils.substringBefore(var1.getFileName().toString(), ".jfr") + ".json");
            Files.writeString(path, class03224.y(), StandardOpenOption.CREATE);
            N(() -> "Dumped recording summary to " + path);
         } catch (Throwable throwable) {
            N(() -> "Failed to output JFR report", throwable);
         }
      }
   }

   private static void N(Supplier<String> var0, Throwable var1) {
      if (LogUtils.isLoggerActive()) {
         N.warn((String)var0.get(), var1);
      } else {
         class03914.N((String)var0.get());
         var1.printStackTrace(class03914.N);
      }
   }

   private static void N(Supplier<String> var0) {
      if (LogUtils.isLoggerActive()) {
         N.info((String)var0.get());
      } else {
         class03914.N((String)var0.get());
      }
   }
}
