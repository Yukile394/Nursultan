package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.Locale;

public final class class02209 {
   private final ImmutableList<class00549> N;
   private final int[] y;

   public int L() {
      return Math.max(0, this.N.size() - 1);
   }

   public class02209(ImmutableList<class00549> var1) {
      super();
      this.N = var1;
      int i = var1.isEmpty() ? 0 : ((class00549)var1.getFirst()).y() + 1;
      this.y = new int[i];

      for (int j = 0; j < var1.size(); j++) {
         int k = ((class00549)var1.get(j)).y();

         for (int l = 0; l <= k; l++) {
            this.y[l] = j;
         }
      }
   }

   @Override
   public String toString() {
      return this.N.toString();
   }

   public int y() {
      return this.N.size();
   }

   public int N(class00549 var1) {
      int i = var1.y();
      if (i >= this.y.length) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "Requesting a ChunkStatus(%s) outside of dependency range(%s)", var1, this.N));
      } else {
         return this.y[i];
      }
   }

   public class00549 N(int var1) {
      return (class00549)this.N.get(var1);
   }

   public ImmutableList<class00549> N() {
      return this.N;
   }
}
