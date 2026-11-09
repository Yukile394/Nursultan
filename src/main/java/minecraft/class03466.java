package minecraft;

import com.mojang.logging.LogUtils;
import java.io.OutputStream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class03466 extends class01846 {
   private static final Logger y = LogUtils.getLogger();

   public class03466(String var1, OutputStream var2) {
      super(var1, var2);
   }

   @Override
   protected void N(@Nullable String var1) {
      StackTraceElement[] astacktraceelement = Thread.currentThread().getStackTrace();
      StackTraceElement stacktraceelement = astacktraceelement[Math.min(3, astacktraceelement.length)];
      y.info("[{}]@.({}:{}): {}", new Object[]{this.N, stacktraceelement.getFileName(), stacktraceelement.getLineNumber(), var1});
   }
}
