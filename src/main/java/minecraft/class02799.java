package minecraft;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public final class class02799 {
   private final AtomicLong N = new AtomicLong();
   private final AtomicInteger y = new AtomicInteger();
   private final AtomicLong L = new AtomicLong();
   private final AtomicInteger u = new AtomicInteger();
   private final class02779 i;

   public class02799(String var1) {
      super();
      this.i = new class02779(var1);
      this.i.begin();
   }

   public void y(int var1) {
      this.u.incrementAndGet();
      this.L.addAndGet(var1);
   }

   public void N(int var1) {
      this.y.incrementAndGet();
      this.N.addAndGet(var1);
   }

   public void N() {
      this.i.u = this.N.get();
      this.i.i = this.y.get();
      this.i.R = this.L.get();
      this.i.M = this.u.get();
      this.i.commit();
   }
}
