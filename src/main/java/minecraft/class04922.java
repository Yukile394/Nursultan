package minecraft;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class class04922<T> implements Iterable<class04907<T>> {
   private final class00751<T> N;
   private final Map<T, class04907<T>> y = new IdentityHashMap<>();
   private final class00392 L;
   private final class02362<class04247, class04907<T>> u;

   public class00392 L() {
      return this.L;
   }

   public class04922(class00751<T> var1, class00392 var2) {
      super();
      this.N = var1;
      this.L = var2;
      this.u = class02389.<T>N(var1.i()).N_10(this::y, class04907::R);
   }

   @Override
   public Iterator<class04907<T>> iterator() {
      return this.y.values().iterator();
   }

   public class00751<T> y() {
      return this.N;
   }

   public class04907<T> y(T var1) {
      return this.N((T)var1, class04938.y);
   }

   public class02362<class04247, class04907<T>> N() {
      return this.u;
   }

   public boolean N(T var1) {
      return this.y.containsKey(var1);
   }

   public class04907<T> N(T var1, class04938 var2) {
      return this.y.computeIfAbsent((T)var1, var2x -> new class04907<>(this, (T)var2x, var2));
   }
}
