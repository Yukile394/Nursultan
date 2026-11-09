package minecraft;

import com.mojang.logging.LogUtils;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class01846 extends PrintStream {
   private static final Logger y = LogUtils.getLogger();
   protected final String N;

   public class01846(String var1, OutputStream var2) {
      super(var2, false, StandardCharsets.UTF_8);
      this.N = var1;
   }

   @Override
   public void println(@Nullable String var1) {
      this.N(var1);
   }

   @Override
   public void println(@Nullable Object var1) {
      this.N(String.valueOf(var1));
   }

   protected void N(@Nullable String var1) {
      y.info("[{}]: {}", this.N, var1);
   }
}
