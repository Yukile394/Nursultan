package minecraft;

import com.mojang.serialization.Lifecycle;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Optional;
import java.util.Map.Entry;

public record class02076<T>(class05946<? extends class00751<T>> key, Lifecycle lifecycle, class02039<T> bootstrap) {
   public class02039<T> L() {
      return this.bootstrap;
   }

   public class02076(class05946<? extends class00751<T>> key, Lifecycle lifecycle, class02039<T> bootstrap) {
      super();
      this.key = key;
      this.lifecycle = lifecycle;
      this.bootstrap = bootstrap;
   }

   public class02066<T> y(class02036 var1) {
      HashMap hashmap = new HashMap();
      Iterator<Entry<class05946<?>, class02082<?>>> iterator = var1.B().entrySet().iterator();

      while (iterator.hasNext()) {
         Entry entry = iterator.next();
         class05946<?> class05946 = (class05946<?>)entry.getKey();
         if (class05946.L(this.key)) {
            class02082<?> class02082 = (class02082<?>)entry.getValue();
            class03529<Object> class03529 = var1.R().N.remove(class05946);
            hashmap.put(class05946, new class04147<>(class02082, Optional.ofNullable(class03529)));
            iterator.remove();
         }
      }

      return new class02066<>(this.key, this.lifecycle, hashmap);
   }

   public Lifecycle y() {
      return this.lifecycle;
   }

   public class05946<? extends class00751<T>> N() {
      return this.key;
   }

   void N(class02036 var1) {
      this.bootstrap.run(var1.N());
   }
}
