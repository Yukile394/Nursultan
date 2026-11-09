package minecraft;

import java.util.Iterator;
import org.jspecify.annotations.Nullable;

class class01204 implements Iterable<class00500> {
   public static final class00500 N = class00869.N.W();
   private final class00742<class00500> y = new class00742<>(16);
   private int L;

   class01204() {
      super();
   }

   @Override
   public Iterator<class00500> iterator() {
      return this.y.iterator();
   }

   @Nullable
   public class00500 N(int var1) {
      class00500 class00500 = this.y.N(var1);
      return class00500 == null ? N : class00500;
   }

   public void N(class00500 var1, int var2) {
      this.y.N(var1, var2);
   }

   public int N(class00500 var1) {
      int i = this.y.N(var1);
      if (i == -1) {
         i = this.L++;
         this.y.N(var1, i);
      }

      return i;
   }
}
