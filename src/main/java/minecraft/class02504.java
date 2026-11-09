package minecraft;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class class02504 {
   private final List<class02480<?>> N = new ArrayList<>();

   class02504() {
      super();
   }

   public class02471 N() {
      return new class02471(List.copyOf(this.N));
   }

   public <T> class02504 N(class02477<? super T> var1, T var2) {
      Iterator<class02480<?>> iterator = this.N.iterator();

      while (iterator.hasNext()) {
         if (iterator.next().N() == var1) {
            throw new IllegalArgumentException("Predicate already has component of type: '" + var1 + "'");
         }
      }

      this.N.add(new class02480<>(var1, var2));
      return this;
   }

   public <T> class02504 N(class02480<T> var1) {
      return this.N(var1.N(), var1.y());
   }
}
