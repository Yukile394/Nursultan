package minecraft;

import java.util.function.Consumer;

class class03401<T> {
   private final class03416<T> N;
   private final Consumer<T> y;
   private long L = -1L;

   void L() {
      this.N.N();
      this.L = -1L;
   }

   class03401(class03416<T> var1, Consumer<T> var2, Consumer var3) {
      super();
      this.N = var2;
      this.y = var3;
   }

   void y() {
      class03390 class03390 = this.N.N;
      if (class03390 != null) {
         this.y.accept((T)class03390.N());
         this.L = class03390.y();
      }
   }

   void N(long var1) {
      this.N.N(var1);
      this.N();
   }

   void N() {
      class03390 class03390 = this.N.N;
      if (class03390 != null && this.L < class03390.y()) {
         this.y.accept((T)class03390.N());
         this.L = class03390.y();
      }
   }
}
