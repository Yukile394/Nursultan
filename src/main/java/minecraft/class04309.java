package minecraft;

import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Comparator;

public record class04309<T>(T type, class07209 pos, long triggerTick, class00763 priority, long subTickOrder) {
   public static final Comparator<class04309<?>> N = (var0, var1) -> {
      int i = Long.compare(var0.triggerTick, var1.triggerTick);
      if (i != 0) {
         return i;
      } else {
         i = var0.priority.compareTo(var1.priority);
         return i != 0 ? i : Long.compare(var0.subTickOrder, var1.subTickOrder);
      }
   };
   public static final Comparator<class04309<?>> y = (var0, var1) -> {
      int i = var0.priority.compareTo(var1.priority);
      return i != 0 ? i : Long.compare(var0.subTickOrder, var1.subTickOrder);
   };
   public static final Strategy<class04309<?>> L = new class04317();

   public long L() {
      return this.triggerTick;
   }

   public class04309(T var1, class07209 var2, long var3, long var5) {
      this((T)var1, var2, var3, class00763.field_9314, var5);
   }

   public class04309(T type, class07209 pos, long triggerTick, class00763 priority, long subTickOrder) {
      super();
      pos = pos.method_10062();
      this.type = (T)type;
      this.pos = pos;
      this.triggerTick = triggerTick;
      this.priority = priority;
      this.subTickOrder = subTickOrder;
   }

   public long i() {
      return this.subTickOrder;
   }

   public class00763 u() {
      return this.priority;
   }

   public class07209 y() {
      return this.pos;
   }

   public T N() {
      return this.type;
   }

   public static <T> class04309<T> N(T var0, class07209 var1) {
      return new class04309<>((T)var0, var1, 0L, class00763.field_9314, 0L);
   }

   public class04306<T> N(long var1) {
      return new class04306<>(this.type, this.pos, (int)(this.triggerTick - var1), this.priority);
   }
}
