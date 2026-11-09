package minecraft;

import com.mojang.logging.LogUtils;
import java.time.Duration;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;

public class class03377 {
   static final Logger N = LogUtils.getLogger();
   final Executor y;
   final TimeUnit L;
   final class03382 u;

   public class03377(Executor var1, TimeUnit var2, class03382 var3) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
   }

   public <T> class03416<T> N(String var1, Callable<T> var2, Duration var3, class03375 var4) {
      long i = this.L.convert(var3);
      if (i == 0L) {
         throw new IllegalArgumentException("Period of " + var3 + " too short for selected resolution of " + this.L);
      } else {
         return new class03416<>(this, var1, (long)var2, i, var4);
      }
   }

   public class03374 N() {
      return new class03374(this);
   }
}
