package minecraft;

import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class class02396<B extends ByteBuf, V, T> {
   private final List<class02365<B, V, T>> N = new ArrayList<>();
   private final Function<V, ? extends T> y;

   class02396(Function<V, ? extends T> var1) {
      super();
      this.y = var1;
   }

   public class02396<B, V, T> N(T var1, class02362<? super B, ? extends V> var2) {
      this.N.add(new class02365<>(var2, (T)var1));
      return this;
   }

   public class02381<B, V, T> N() {
      Object2IntOpenHashMap object2intopenhashmap = new Object2IntOpenHashMap();
      object2intopenhashmap.defaultReturnValue(-2);

      for (class02365 class02365 : this.N) {
         int i = object2intopenhashmap.size();
         if (object2intopenhashmap.putIfAbsent(class02365.y(), i) != -2) {
            throw new IllegalStateException("Duplicate registration for type " + class02365.y());
         }
      }

      return new class02381<>(this.y, List.copyOf(this.N), object2intopenhashmap);
   }
}
