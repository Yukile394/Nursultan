package minecraft;

import java.util.Iterator;
import java.util.NoSuchElementException;

class class05897<T> implements Iterator<T> {
   private int y;
   private int L;

   class05897(class05905 var1) {
      super();
      this.N = var1;
      this.L = -1;
   }

   @Override
   public void remove() {
      if (this.L == -1) {
         throw new IllegalStateException();
      } else {
         this.N.y(this.L);
         this.y--;
         this.L = -1;
      }
   }

   @Override
   public boolean hasNext() {
      return this.y < this.N.y;
   }

   @Override
   public T next() {
      if (this.y >= this.N.y) {
         throw new NoSuchElementException();
      } else {
         this.L = this.y++;
         return this.N.N[this.L];
      }
   }
}
