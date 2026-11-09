package minecraft;

import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public record class03205<T extends class03230>(T fastest, T slowest, T secondSlowest, int count, Map<Integer, Double> percentilesNanos, Duration totalDuration) {
   @Nullable
   public T L() {
      return this.secondSlowest;
   }

   public class03205(T fastest, T slowest, @Nullable T secondSlowest, int count, Map<Integer, Double> percentilesNanos, Duration totalDuration) {
      super();
      this.fastest = (T)fastest;
      this.slowest = (T)slowest;
      this.secondSlowest = (T)secondSlowest;
      this.count = count;
      this.percentilesNanos = percentilesNanos;
      this.totalDuration = totalDuration;
   }

   public Map<Integer, Double> i() {
      return this.percentilesNanos;
   }

   public int u() {
      return this.count;
   }

   public T y() {
      return this.slowest;
   }

   public static <T extends class03230> Optional<class03205<T>> N(List<T> var0) {
      if (var0.isEmpty()) {
         return Optional.empty();
      } else {
         List list = var0.stream().sorted(Comparator.comparing(class03230::N)).toList();
         Duration duration = list.stream().map(class03230::N).reduce(Duration::plus).orElse(Duration.ZERO);
         class03230 class03230xx = (class03230)list.getFirst();
         class03230 class03230x = (class03230)list.getLast();
         class03230 class03230xx = list.size() > 1 ? (class03230)list.get(list.size() - 2) : null;
         int i = list.size();
         Map<Integer, Double> map = class03213.N(list.stream().mapToLong(var0x -> var0x.N().toNanos()).toArray());
         return Optional.of(new class03205<>((T)class03230xx, (T)class03230x, (T)class03230xx, i, map, duration));
      }
   }

   public T N() {
      return this.fastest;
   }

   public Duration R() {
      return this.totalDuration;
   }
}
