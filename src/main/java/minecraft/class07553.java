package minecraft;

import java.util.function.Supplier;

class class07553<T> implements Supplier<T> {
   class07553(Supplier var1, String var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public T get() {
      return (T)this.N.get();
   }

   @Override
   public String toString() {
      return this.y;
   }
}
