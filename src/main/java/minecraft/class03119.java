package minecraft;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Queues;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Deque;
import org.jspecify.annotations.Nullable;

public final class class03119<T> extends AbstractIterator<T> {
   private static final int N = Integer.MIN_VALUE;
   @Nullable
   private Deque<T> y = null;
   private int L = Integer.MIN_VALUE;
   private final Int2ObjectMap<Deque<T>> u = new Int2ObjectOpenHashMap();

   public class03119() {
      super();
   }

   private void N() {
      int i = Integer.MIN_VALUE;
      Deque deque = null;
      ObjectIterator objectiterator = Int2ObjectMaps.fastIterable(this.u).iterator();

      while (objectiterator.hasNext()) {
         Entry entry = (Entry)objectiterator.next();
         Deque deque1 = (Deque)entry.getValue();
         int j = entry.getIntKey();
         if (j > i && !deque1.isEmpty()) {
            i = j;
            deque = deque1;
            if (j == this.L - 1) {
               break;
            }
         }
      }

      this.L = i;
      this.y = deque;
   }

   public void N(T var1, int var2) {
      if (var2 == this.L && this.y != null) {
         this.y.addLast((T)var1);
      } else {
         Deque deque = (Deque)this.u.computeIfAbsent(var2, var0 -> Queues.newArrayDeque());
         deque.addLast(var1);
         if (var2 >= this.L) {
            this.y = deque;
            this.L = var2;
         }
      }
   }

   @Nullable
   protected T computeNext() {
      if (this.y == null) {
         return (T)this.endOfData();
      } else {
         Object object = this.y.removeFirst();
         if (object == null) {
            return (T)this.endOfData();
         } else {
            if (this.y.isEmpty()) {
               this.N();
            }

            return (T)object;
         }
      }
   }
}
