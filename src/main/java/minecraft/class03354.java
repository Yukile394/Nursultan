package minecraft;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class class03354 {
   protected final AtomicBoolean N;
   protected final AtomicBoolean y;
   protected final boolean L;

   public boolean L() {
      return this.L;
   }

   public class03354(class03345 var1, boolean var2) {
      super();
      this.u = var1;
      this.N = new AtomicBoolean(false);
      this.y = new AtomicBoolean(false);
      this.L = var2;
   }

   public class07209 u() {
      return this.u.i;
   }

   protected abstract String y();

   public abstract CompletableFuture<class03335> N(class03950 var1);

   public abstract void N();
}
