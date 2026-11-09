package minecraft;

import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public final class class03516 {
   public static final class03516 N = new class03516(Map.of());
   final Map<class01894, IntList> y;

   class03516(Map<class01894, IntList> var1) {
      super();
      this.y = var1;
   }

   public int y() {
      return this.y.size();
   }

   public static class03516 y(class00667 var0) {
      return new class03516(var0.N_17(class00667::T, class00667::N));
   }

   public boolean N() {
      return this.y.isEmpty();
   }

   public <T> class01196<T> N(class00751<T> var1) {
      return class03525.N(var1, this);
   }

   public void N(class00667 var1) {
      var1.N(this.y, class00667::N, class00667::N);
   }
}
