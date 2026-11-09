package minecraft;

import com.google.common.base.Stopwatch;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;

public class class07094 {
   private static final Logger field_11275 = LogUtils.getLogger();
   private final Path field_40595;
   public class01996 field_40596;
   final Set<String> field_40826 = new HashSet<>();
   final Map<String, class07135> field_38909 = new LinkedHashMap<>();
   private final class04551 field_38910;
   private final boolean field_38911;

   public void method_10315() throws IOException {
      class07104 class07104 = new class07104(this.field_40595, this.field_40826, this.field_38910);
      Stopwatch stopwatch = Stopwatch.createStarted();
      Stopwatch stopwatch1 = Stopwatch.createUnstarted();
      this.field_38909.forEach((var3x, var4) -> {
         if (!this.field_38911 && !class07104.N(var3x)) {
            field_11275.debug("Generator {} already run for version {}", var3x, this.field_38910.comp_4025());
         } else {
            field_11275.info("Starting provider: {}", var3x);
            stopwatch1.start();
            class07104.N(class07104.N(var3x, var4::method_10319).join());
            stopwatch1.stop();
            field_11275.info("{} finished after {} ms", var3x, stopwatch1.elapsed(TimeUnit.MILLISECONDS));
            stopwatch1.reset();
         }
      });
      field_11275.info("All providers took: {} ms", stopwatch.elapsed(TimeUnit.MILLISECONDS));
      class07104.N();
   }

   public class07094(Path var1, class04551 var2, boolean var3) {
      super();
      this.field_40595 = var1;
      this.field_40596 = new class01996(this.field_40595);
      this.field_38910 = var2;
      this.field_38911 = var3;
   }

   static {
      class03914.N();
   }

   public class07125 method_46564(boolean var1) {
      return new class07125(this, var1, "vanilla", this.field_40596);
   }

   public class07125 method_46565(boolean var1, String var2) {
      Path path = this.field_40596.method_45972(class02024.field_39367).resolve("minecraft").resolve("datapacks").resolve(var2);
      return new class07125(this, var1, var2, new class01996(path));
   }
}
