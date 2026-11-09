package minecraft;

import org.jspecify.annotations.Nullable;

public interface class00750<T> extends Iterable<T> {
   int N = -1;

   int L();

   default int L(T var1) {
      int i = this.N((T)var1);
      if (i == -1) {
         throw new IllegalArgumentException("Can't find id for '" + var1 + "' in map " + this);
      } else {
         return i;
      }
   }

   default T y(int var1) {
      Object object = this.N(var1);
      if (object == null) {
         throw new IllegalArgumentException("No value with id " + var1);
      } else {
         return (T)object;
      }
   }

   @Nullable
   T N(int var1);

   int N(T var1);
}
