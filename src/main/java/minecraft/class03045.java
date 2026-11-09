package minecraft;

import java.time.Instant;
import org.jspecify.annotations.Nullable;

class class03045 implements class03073 {
   @Override
   public class03926 unpack(@Nullable class04469 var1, class03079 var2) throws class03083 {
      if (var1 == null) {
         throw new class03083(class03083.N);
      } else if (this.N.y().N()) {
         throw new class03083(class03083.L);
      } else {
         class02083 class02083 = this.L.y;
         if (class02083 == null) {
            throw new class03083(class03083.y);
         } else if (var2.y().isBefore(this.L.L)) {
            this.N();
            throw new class03083(class03083.i);
         } else {
            this.L.L = var2.y();
            class03926 class03926 = new class03926(class02083, var1, var2, null, class03055.L);
            if (!class03926.N(this.y)) {
               this.N();
               throw new class03083(class03083.u);
            } else {
               if (class03926.N(Instant.now())) {
                  class03080.N.warn("Received expired chat: '{}'. Is the client/server system time unsynchronized?", var2.N());
               }

               this.L.y = class02083.N();
               return class03926;
            }
         }
      }
   }

   class03045(class03080 var1, class04470 var2, class03962 var3) {
      super();
      this.L = var1;
      this.N = var2;
      this.y = var3;
   }

   @Override
   public void N() {
      this.L.y = null;
   }
}
