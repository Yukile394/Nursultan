package minecraft;

import com.google.common.util.concurrent.RateLimiter;
import java.time.Duration;
import java.util.concurrent.atomic.AtomicReference;

public class class05423 {
   private final float N;
   private final AtomicReference<class05400> y = new AtomicReference<>();

   public class05423(Duration var1) {
      super();
      this.N = 1000.0F / (float)var1.toMillis();
   }

   public void N(class05153 var1, class00392 var2) {
      if (this.y.updateAndGet(var2x -> var2x != null && var2.equals(var2x.N) ? var2x : new class05400(var2, RateLimiter.create(this.N))).y.tryAcquire(1)) {
         var1.u(var2);
      }
   }
}
