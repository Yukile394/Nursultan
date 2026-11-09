package minecraft;

import java.util.Comparator;

public record class08560<C, T>(T entry, int priority, class08584<C> condition) {
   public static final Comparator<class08560<?, ?>> L = Comparator.comparingInt(class08560::y).reversed();

   public class08584<C> L() {
      return this.condition;
   }

   public class08560(T entry, int priority, class08584<C> condition) {
      this.entry = (T)entry;
      this.priority = priority;
      this.condition = condition;
   }

   public int y() {
      return this.priority;
   }

   public T N() {
      return this.entry;
   }
}
