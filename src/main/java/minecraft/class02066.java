package minecraft;

import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

record class02066<T>(class05946<? extends class00751<? extends T>> key, Lifecycle lifecycle, Map<class05946<T>, class04147<T>> values) {

   public Map<class05946<T>, class04147<T>> L() {
      return this.values;
   }

   class02066(class05946<? extends class00751<? extends T>> key, Lifecycle lifecycle, Map<class05946<T>, class04147<T>> values) {
      super();
      this.key = key;
      this.lifecycle = lifecycle;
      this.values = values;
   }

   public Lifecycle y() {
      return this.lifecycle;
   }

   public class05946<? extends class00751<? extends T>> N() {
      return this.key;
   }

   public class01921<T> N(class02038 var1) {
      Map map = this.values.entrySet().stream().collect(Collectors.toUnmodifiableMap(Entry::getKey, var1x -> {
         class04147 class04147 = (class04147)var1x.getValue();
         class03529 class03529 = class04147.y().orElseGet(() -> class03529.N_40(var1.N(), (class05946<T>)var1x.getKey()));
         class03529.y(class04147.N().N());
         return class03529;
      }));
      return class02061.N(this.key, this.lifecycle, var1.N(), map);
   }
}
