package minecraft;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public class class06975 {
   private final long N;
   private final AtomicLong y = new AtomicLong();
   private final AtomicBoolean L = new AtomicBoolean(false);
   private final class06605 u;

   private void L() {
      long i = class07536.L();
      if (this.L.get() && i - this.y.get() >= this.N) {
         this.u.i();
         this.y.set(class07536.L());
      }

      this.L.set(false);
   }

   public class06975(class06605 var1, int var2) {
      super();
      this.u = var1;
      this.N = TimeUnit.SECONDS.toMillis(var2);
   }

   public void y() {
      this.L.set(true);
      this.L();
   }

   public void N() {
      this.L();
   }
}
