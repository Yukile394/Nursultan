package minecraft;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Stream;

class class05348 {
   final Object2IntMap<class05346> N = new Object2IntOpenHashMap();

   class05348() {
      super();
   }

   public boolean y() {
      return this.N.isEmpty();
   }

   public void y(class05346 var1) {
      this.N.removeInt(var1);
   }

   public int N(Predicate<class05346> var1) {
      return this.N
         .object2IntEntrySet()
         .stream()
         .filter(var1x -> var1.test((class05346)var1x.getKey()))
         .mapToInt(var0 -> var0.getIntValue() * ((class05346)var0.getKey()).field_18431)
         .sum();
   }

   public Stream<class05382> N(UUID var1) {
      return this.N.object2IntEntrySet().stream().map(var1x -> new class05382(var1, (class05346)var1x.getKey(), var1x.getIntValue()));
   }

   public void N() {
      ObjectIterator<Entry<class05346>> objectiterator = this.N.object2IntEntrySet().iterator();

      while (objectiterator.hasNext()) {
         Entry entry = (Entry)objectiterator.next();
         int i = entry.getIntValue() - ((class05346)entry.getKey()).field_19354;
         if (i < 2) {
            objectiterator.remove();
         } else {
            entry.setValue(i);
         }
      }
   }

   public void N(class05346 var1) {
      int i = this.N.getInt(var1);
      if (i > var1.field_18432) {
         this.N.put(var1, var1.field_18432);
      }

      if (i < 2) {
         this.y(var1);
      }
   }
}
