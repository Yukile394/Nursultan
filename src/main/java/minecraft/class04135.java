package minecraft;

import java.util.function.Supplier;

class class04135<E, A> implements class04140<E, A> {
   class04135(Object var1, Supplier var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public String toString() {
      return this.N();
   }

   @Override
   public A N(class04782 var1, E var2, long var3) {
      return (A)this.N;
   }

   @Override
   public String N() {
      return (String)this.y.get();
   }
}
