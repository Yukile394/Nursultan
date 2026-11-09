package minecraft;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;
import java.util.concurrent.TimeUnit;

class class01582 {
   private static final int N = 500;
   private static final List<GarbageCollectorMXBean> y = ManagementFactory.getGarbageCollectorMXBeans();
   private long L = 0L;
   private long u = -1L;
   private long i = -1L;
   private long R = 0L;

   class01582() {
      super();
   }

   long N(long var1) {
      long ix = System.currentTimeMillis();
      if (ix - this.L < 500L) {
         return this.R;
      } else {
         long j = N();
         if (this.L != 0L && j == this.i) {
            double d0 = (double)TimeUnit.SECONDS.toMillis(1L) / (ix - this.L);
            long k = var1 - this.u;
            this.R = Math.round(k * d0);
         }

         this.L = ix;
         this.u = var1;
         this.i = j;
         return this.R;
      }
   }

   private static long N() {
      long ix = 0L;

      for (GarbageCollectorMXBean garbagecollectormxbean : y) {
         ix += garbagecollectormxbean.getCollectionCount();
      }

      return ix;
   }
}
