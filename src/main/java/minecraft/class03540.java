package minecraft;

import java.util.List;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicLong;

class class03540 extends TimerTask {
   private final class06202 N = class06202.Nq();
   private final List<class03547> y;
   private final long L;
   private final AtomicLong u;

   public class03540(List<class03547> var1, long var2, long var4) {
      super();
      this.y = var1;
      this.L = var4;
      this.u = new AtomicLong(var2);
   }

   @Override
   public void run() {
      long i = this.u.getAndAdd(this.L);
      long j = this.u.get();

      for (class03547 class03547 : this.y) {
         if (i >= class03547.N()) {
            long k = i / class03547.y();
            long l = j / class03547.y();
            if (k != l) {
               this.N.execute(() -> class06132.N(class06202.Nq().m(), class06095.M, class00392.N(class03547.L(), k), class00392.N(class03547.u(), k)));
               return;
            }
         }
      }
   }

   public class03540 N(List<class03547> var1, long var2) {
      this.cancel();
      return new class03540(var1, this.u.get(), var2);
   }
}
