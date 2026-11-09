package minecraft;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class class04224 {
   private final class01894 N;
   private final class01079 y;
   private final AtomicReference<class08280> L = new AtomicReference<>();
   private final AtomicInteger u;

   public class04224(class01894 var1, class01079 var2, int var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.u = new AtomicInteger(var3);
   }

   public void y() {
      if (this.u.decrementAndGet() <= 0) {
         class08280 class08280 = this.L.getAndSet(null);
         if (class08280 != null) {
            class08280.close();
         }
      }
   }

   public class08280 N() throws IOException {
      class08280 class08280 = this.L.get();
      if (class08280 == null) {
         synchronized (this) {
            class08280 = this.L.get();
            if (class08280 == null) {
               try (InputStream inputstream = this.y.method_14482()) {
                  class08280 = class08280.N(inputstream);
                  this.L.set(class08280);
               } catch (IOException ioexception) {
                  throw new IOException("Failed to load image " + this.N, ioexception);
               }
            }
         }
      }

      return class08280;
   }
}
