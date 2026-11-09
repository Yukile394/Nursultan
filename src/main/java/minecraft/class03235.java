package minecraft;

import java.util.Arrays;
import java.util.List;
import org.jspecify.annotations.Nullable;

abstract class class03235<T> {
   protected final class03195[] y;

   protected class03235(List<class03195> var1) {
      super();
      this.y = var1.toArray(new class03195[0]);
   }

   @Override
   public String toString() {
      return Arrays.toString((Object[])this.y);
   }

   protected abstract class03211<T> N(long[] var1, @Nullable class03211<T> var2, class03200<T> var3);

   protected long N(long[] var1) {
      long i = 0L;

      for (int j = 0; j < 7; j++) {
         i += class04995.y(this.y[j].N(var1[j]));
      }

      return i;
   }
}
