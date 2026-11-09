package minecraft;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.primitives.UnsignedLong;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class class00754<T> {
   private static final Logger N = LogUtils.getLogger();
   private static final String y = "Callback";
   private static final String L = "Name";
   private static final String u = "TriggerTime";
   private final class07229<T> i;
   private final Queue<class00724<T>> R = new PriorityQueue<>(L());
   private UnsignedLong M = UnsignedLong.ZERO;
   private final Table<String, Long, class00724<T>> B = HashBasedTable.create();

   private static <T> Comparator<class00724<T>> L() {
      return Comparator.<class00724<T>>comparingLong(var0 -> var0.N).thenComparing(var0 -> var0.y);
   }

   public class00754(class07229<T> var1) {
      super();
      this.i = var1;
   }

   public class00754(class07229<T> var1, Stream<? extends Dynamic<?>> var2) {
      this(var1);
      this.R.clear();
      this.B.clear();
      this.M = UnsignedLong.ZERO;
      var2.forEach(var1x -> {
         class07709 class07709 = (class07709)var1x.convert(class07713.N).getValue();
         if (class07709 instanceof class07001 class07001) {
            this.N(class07001);
         } else {
            N.warn("Invalid format of events: {}", class07709);
         }
      });
   }

   public class07741 y() {
      class07741 class07741 = new class07741();
      this.R.stream().sorted(L()).map(this::N).forEach(class07741::add);
      return class07741;
   }

   public void N(T var1, long var2) {
      while (true) {
         class00724 class00724 = this.R.peek();
         if (class00724 == null || class00724.N > var2) {
            return;
         }

         this.R.remove();
         this.B.remove(class00724.L, var2);
         class00724.u.N((T)var1, this, var2);
      }
   }

   private void N(class07001 var1) {
      class07220 class07220 = var1.<class07220>N_15("Callback", this.i.N()).orElse(null);
      if (class07220 != null) {
         String s = var1.y("Name", "");
         long ix = var1.y("TriggerTime", 0L);
         this.N(s, ix, class07220);
      }
   }

   public Set<String> N() {
      return Collections.unmodifiableSet(this.B.rowKeySet());
   }

   public void N(String var1, long var2, class07220<T> var4) {
      if (!this.B.contains(var1, var2)) {
         this.M = this.M.plus(UnsignedLong.ONE);
         class00724 class00724 = new class00724(var2, this.M, var1, var4);
         this.B.put(var1, var2, class00724);
         this.R.add(class00724);
      }
   }

   private class07001 N(class00724<T> var1) {
      class07001 class07001 = new class07001();
      class07001.N_67("Name", var1.L);
      class07001.N("TriggerTime", var1.N);
      class07001.N("Callback", this.i.N(), var1.u);
      return class07001;
   }

   public int N(String var1) {
      Collection collection = this.B.row(var1).values();
      collection.forEach(this.R::remove);
      int ix = collection.size();
      collection.clear();
      return ix;
   }
}
