package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectIterable;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2IntMaps;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2IntMap.Entry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class08034<T> {
   public final Reference2IntOpenHashMap<T> N = new Reference2IntOpenHashMap();

   void L(T var1, int var2) {
      this.N.addTo(var1, var2);
   }

   public class08034() {
      super();
   }

   public void u(T var1, int var2) {
      this.L((T)var1, var2);
   }

   public int y(List<? extends class08022<T>> var1, int var2, @Nullable class08012<T> var3) {
      return new class08014(this, var1).y(var2, var3);
   }

   void y(T var1, int var2) {
      int i = this.N.addTo(var1, -var2);
      if (i < var2) {
         throw new IllegalStateException("Took " + var2 + " items, but only had " + i);
      }
   }

   List<T> N(Iterable<? extends class08022<T>> var1) {
      ArrayList arraylist = new ArrayList();
      ObjectIterator objectiterator = Reference2IntMaps.fastIterable(this.N).iterator();

      while (objectiterator.hasNext()) {
         Entry entry = (Entry)objectiterator.next();
         if (entry.getIntValue() > 0 && N(var1, entry.getKey())) {
            arraylist.add(entry.getKey());
         }
      }

      return arraylist;
   }

   private static <T> boolean N(Iterable<? extends class08022<T>> var0, T var1) {
      Iterator iterator = var0.iterator();

      while (iterator.hasNext()) {
         if (((class08022)iterator.next()).acceptsItem(var1)) {
            return true;
         }
      }

      return false;
   }

   public int N(List<? extends class08022<T>> var1) {
      int i = Integer.MAX_VALUE;
      ObjectIterable objectiterable = Reference2IntMaps.fastIterable(this.N);

      label31:
      for (class08022 class08022 : var1) {
         int j = 0;
         ObjectIterator objectiterator = objectiterable.iterator();

         while (objectiterator.hasNext()) {
            Entry entry = (Entry)objectiterator.next();
            int k = entry.getIntValue();
            if (k > j) {
               if (class08022.acceptsItem(entry.getKey())) {
                  j = k;
               }

               if (j >= i) {
                  continue label31;
               }
            }
         }

         i = j;
         if (j == 0) {
            break;
         }
      }

      return i;
   }

   boolean N(T var1, int var2) {
      return this.N.getInt(var1) >= var2;
   }

   public void N() {
      this.N.clear();
   }

   public boolean N(List<? extends class08022<T>> var1, int var2, @Nullable class08012<T> var3) {
      return new class08014(this, var1).N(var2, var3);
   }
}
