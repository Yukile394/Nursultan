package minecraft;

import java.util.BitSet;
import org.jspecify.annotations.Nullable;

class class02751<T> implements class02452<T> {
   final class02760<T> N;
   private final int i;
   final class02748 y;
   final BitSet L = new BitSet();
   @Nullable
   private class02751<T> R;

   class02751(class02760<T> var1, int var2, class02748 var3) {
      super();
      this.N = var1;
      this.i = var2;
      this.y = var3;
   }

   @Override
   public T get() {
      return this.N.N();
   }

   @Override
   public String toString() {
      return this.y != null ? this.N + "#" + this.i + " (from " + this.y + ")" : this.N + "#" + this.i;
   }

   class02751<T> N(class02748 var1) {
      if (this.N.L != this) {
         throw new IllegalStateException("Handle " + this + " is no longer valid, as its contents were moved into " + this.R);
      } else {
         class02751 class02751 = new class02751<>(this.N, this.i + 1, var1);
         this.N.L = class02751;
         this.R = class02751;
         return class02751;
      }
   }
}
