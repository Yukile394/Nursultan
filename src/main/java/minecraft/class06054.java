package minecraft;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import org.jspecify.annotations.Nullable;

public class class06054 implements AutoCloseable {
   private final class07284 N;
   private final Long2ObjectMap<class00554> y = new Long2ObjectOpenHashMap();
   @Nullable
   private class00554 L;
   private long u;

   public class06054(class07284 var1) {
      super();
      this.N = var1;
   }

   @Override
   public void close() {
      ObjectIterator<class00554> objectiterator = this.y.values().iterator();

      while (objectiterator.hasNext()) {
         ((class00554)objectiterator.next()).y();
      }
   }

   public class00500 y(class07209 var1) {
      class00554 class00554 = this.N(var1);
      if (class00554 == null) {
         return class00869.N.W();
      } else {
         int i = class01296.y(var1.method_10263());
         int j = class01296.y(var1.method_10264());
         int k = class01296.y(var1.method_10260());
         return class00554.N(i, j, k);
      }
   }

   @Nullable
   public class00554 N(class07209 var1) {
      int i = this.N.method_31602(var1.method_10264());
      if (i >= 0 && i < this.N.method_32890()) {
         long j = class01296.L(var1);
         if (this.L == null || this.u != j) {
            this.L = (class00554)this.y.computeIfAbsent(j, var3x -> {
               class00554 class00554 = this.N.method_8392(class01296.N(var1.method_10263()), class01296.N(var1.method_10260())).y(i);
               class00554.N();
               return class00554;
            });
            this.u = j;
         }

         return this.L;
      } else {
         return null;
      }
   }
}
