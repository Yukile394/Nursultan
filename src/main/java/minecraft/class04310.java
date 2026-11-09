package minecraft;

import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.longs.Long2ReferenceAVLTreeMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import net.caffeinemc.mods.lithium.common.world.scheduler.OrderedTickQueue;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class04310<T> implements class04325<T>, class04327<T> {
   private Queue<class04309<T>> N;
   @Nullable
   private List<class04306<T>> y;
   private Set<class04309<?>> L;
   @Nullable
   private BiConsumer<class04310<T>, class04309<T>> u;
   private static volatile Reference2IntOpenHashMap i = new Reference2IntOpenHashMap();
   private final Long2ReferenceAVLTreeMap R = new Long2ReferenceAVLTreeMap();
   private OrderedTickQueue M;
   private final IntOpenHashSet B = new IntOpenHashSet();

   public class04309 L() {
      class04309 class04309 = this.M.poll();
      if (class04309 != null) {
         if (this.M.isEmpty()) {
            this.N(true);
         }

         this.B.remove(y(class04309.y(), class04309.N()));
         return class04309;
      } else {
         return null;
      }
   }

   private void L(class04309 var1) {
      OrderedTickQueue orderedtickqueue = (OrderedTickQueue)this.R.computeIfAbsent(N(var1.L(), var1.u()), var0 -> new OrderedTickQueue());
      if (orderedtickqueue.isEmpty()) {
         this.N(false);
      }

      orderedtickqueue.offer(var1);
      if (this.u != null) {
         this.u.accept(this, var1);
      }
   }

   public class04310() {
      super();
      this.N = new PriorityQueue<>(class04309.N);
      this.L = new ObjectOpenCustomHashSet(class04309.L);
      this.N(null);
   }

   public class04310(List<class04306<T>> var1) {
      super();
      this.N = new PriorityQueue<>(class04309.N);
      this.L = new ObjectOpenCustomHashSet(class04309.L);
      this.y = var1;

      for (class04306 class04306 : var1) {
         this.L.add(class04309.N(class04306.N(), class04306.y()));
      }

      this.N(null);
   }

   static {
      i.defaultReturnValue(-1);
   }

   public Stream u() {
      return this.R.values().stream().flatMap(Collection::stream);
   }

   private static int y(class07209 var0, Object var1) {
      int ix = i.getInt(var1);
      if (ix == -1) {
         ix = N(var1);
      }

      int j = (var0.method_10263() & 15) << 16 | (var0.method_10264() & 4095) << 4 | var0.method_10260() & 15;
      return j | ix << 20;
   }

   private void y(class04309<T> var1) {
      this.N.add(var1);
      if (this.u != null) {
         this.u.accept(this, var1);
      }
   }

   public class04309 y() {
      return this.M == null ? null : this.M.peek();
   }

   public void y(long var1) {
      if (this.y != null) {
         int ix = -this.y.size();

         for (class04306 class04306 : this.y) {
            this.L(class04306.N(var1, ix++));
         }
      }

      this.y = null;
   }

   private static synchronized int N(Object var0) {
      int ix = i.getInt(var0);
      if (ix == -1) {
         Reference2IntOpenHashMap reference2intopenhashmap = i.clone();
         reference2intopenhashmap.put(var0, ix = reference2intopenhashmap.size());
         i = reference2intopenhashmap;
         if (ix >= 4096) {
            throw new IllegalStateException(
               "Lithium Tick Scheduler assumes at most 4096 different block types that receive scheduled ticks exist! Add mixin.world.tick_scheduler=false to the lithium properties/config to disable the optimization!"
            );
         }
      }

      return ix;
   }

   @Override
   public int N() {
      return this.B.size();
   }

   public void N(@Nullable BiConsumer<class04310<T>, class04309<T>> var1) {
      this.u = var1;
   }

   @Override
   public List N(long var1) {
      ArrayList arraylist = new ArrayList(this.N());
      if (this.y != null) {
         arraylist.addAll(this.y);
      }

      ObjectIterator objectiterator = this.R.values().iterator();

      while (objectiterator.hasNext()) {
         for (class04309 class04309 : (OrderedTickQueue)objectiterator.next()) {
            arraylist.add(class04309.N(var1));
         }
      }

      return arraylist;
   }

   @Override
   public void N(class04309 var1) {
      int ix = y(var1.y(), var1.N());
      if (this.B.add(ix)) {
         this.L(var1);
      }
   }

   private static long N(long var0, class00763 var2) {
      return var0 << 4 | var2.ordinal() & 15;
   }

   private void N(boolean var1) {
      if (var1 && this.M != null && this.M.isEmpty()) {
         OrderedTickQueue orderedtickqueue = (OrderedTickQueue)this.R.remove(this.R.firstLongKey());
         if (orderedtickqueue != this.M) {
            throw new IllegalStateException("Next tick queue doesn't have the lowest key!");
         }
      }

      if (this.R.isEmpty()) {
         this.M = null;
      } else {
         long ix = this.R.firstLongKey();
         this.M = (OrderedTickQueue)this.R.get(ix);
      }
   }

   private void N(CallbackInfo var1) {
      if (this.y != null) {
         for (class04306 class04306 : this.y) {
            this.B.add(y(class04306.y(), class04306.N()));
         }
      }

      this.L = null;
      this.N = null;
   }

   @Override
   public boolean N(class07209 var1, Object var2) {
      return this.B.contains(y(var1, var2));
   }

   public void N(Predicate var1) {
      ObjectIterator objectiterator = this.R.values().iterator();

      while (objectiterator.hasNext()) {
         OrderedTickQueue orderedtickqueue = (OrderedTickQueue)objectiterator.next();
         orderedtickqueue.sort();
         boolean flag = false;

         for (int ix = 0; ix < orderedtickqueue.size(); ix++) {
            class04309 class04309 = orderedtickqueue.getTickAtIndex(ix);
            if (var1.test(class04309)) {
               orderedtickqueue.setTickAtIndex(ix, null);
               this.B.remove(y(class04309.y(), class04309.N()));
               flag = true;
            }
         }

         if (flag) {
            orderedtickqueue.removeNullsAndConsumed();
         }

         if (orderedtickqueue.isEmpty()) {
            objectiterator.remove();
         }
      }

      this.N(false);
   }
}
