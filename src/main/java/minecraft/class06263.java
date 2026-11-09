package minecraft;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import java.util.List;
import java.util.stream.IntStream;
import org.jspecify.annotations.Nullable;

public class class06263 {
   public static final int N = class03469.y + 2;
   private final List<Long2ObjectLinkedOpenHashMap<List<Runnable>>> y = IntStream.range(0, N).mapToObj(var0 -> new Long2ObjectLinkedOpenHashMap()).toList();
   private volatile int L = N;
   private final String u;

   public class06263(String var1) {
      super();
      this.u = var1;
   }

   @Override
   public String toString() {
      return this.u + " " + this.L + "...";
   }

   public boolean y() {
      return this.L < N;
   }

   protected void N(Runnable var1, long var2, int var4) {
      ((List)this.y.get(var4).computeIfAbsent(var2, var0 -> Lists.newArrayList())).add(var1);
      this.L = Math.min(this.L, var4);
   }

   protected void N(long var1, boolean var3) {
      for (Long2ObjectLinkedOpenHashMap<List<Runnable>> long2objectlinkedopenhashmap : this.y) {
         List<Runnable> list = (List<Runnable>)long2objectlinkedopenhashmap.get(var1);
         if (list != null) {
            if (var3) {
               list.clear();
            }

            if (list.isEmpty()) {
               long2objectlinkedopenhashmap.remove(var1);
            }
         }
      }

      while (this.y() && this.y.get(this.L).isEmpty()) {
         this.L++;
      }
   }

   @Nullable
   public class06256 N() {
      if (!this.y()) {
         return null;
      } else {
         int i = this.L;
         Long2ObjectLinkedOpenHashMap<List<Runnable>> long2objectlinkedopenhashmap = this.y.get(i);
         long j = long2objectlinkedopenhashmap.firstLongKey();
         List<Runnable> list = (List<Runnable>)long2objectlinkedopenhashmap.removeFirst();

         while (this.y() && this.y.get(this.L).isEmpty()) {
            this.L++;
         }

         return new class06256(j, list);
      }
   }

   protected void N(int var1, class07321 var2, int var3) {
      if (var1 < N) {
         List<Runnable> list = (List<Runnable>)this.y.get(var1).remove(var2.y());
         if (var1 == this.L) {
            while (this.y() && this.y.get(this.L).isEmpty()) {
               this.L++;
            }
         }

         if (list != null && !list.isEmpty()) {
            ((List)this.y.get(var3).computeIfAbsent(var2.y(), var0 -> Lists.newArrayList())).addAll(list);
            this.L = Math.min(this.L, var3);
         }
      }
   }
}
