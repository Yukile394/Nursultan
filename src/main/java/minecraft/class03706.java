package minecraft;

import java.util.concurrent.atomic.AtomicInteger;

public class class03706 {
   private final AtomicInteger N = new AtomicInteger();
   private final class02270 y;

   public class03706(class02270 var1) {
      super();
      this.y = var1;
   }

   public void N(int var1) {
      this.N.getAndAdd(var1);
   }

   public void N() {
      this.y.N(this.N.getAndSet(0));
   }
}
