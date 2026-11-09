package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2DoubleArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2DoubleMaps;
import it.unimi.dsi.fastutil.objects.Reference2DoubleMap.Entry;
import java.util.Objects;

public class class00602 {
   private final Reference2DoubleArrayMap<class00587> N = new Reference2DoubleArrayMap();

   public class00602() {
      super();
   }

   public <Value> Value N(class00607<Value> var1, Value var2) {
      if (this.N.isEmpty()) {
         return (Value)var2;
      } else if (this.N.size() == 1) {
         class00587 class00587 = (class00587)this.N.keySet().iterator().next();
         return class00587.N(var1, (Value)var2);
      } else {
         class00610 class00610 = var1.N().R();
         Object object = null;
         double d0 = 0.0;
         ObjectIterator objectiterator = Reference2DoubleMaps.fastIterable(this.N).iterator();

         while (objectiterator.hasNext()) {
            Entry entry = (Entry)objectiterator.next();
            class00587 class00587x = (class00587)entry.getKey();
            double d1 = entry.getDoubleValue();
            Object object1 = class00587x.N(var1, var2);
            d0 += d1;
            if (object == null) {
               object = object1;
            } else {
               float f = (float)(d1 / d0);
               object = class00610.apply(f, object, object1);
            }
         }

         return Objects.requireNonNull((Value)object);
      }
   }

   public class00602 N(double var1, class00587 var3) {
      this.N.mergeDouble(var3, var1, Double::sum);
      return this;
   }

   public void N() {
      this.N.clear();
   }
}
