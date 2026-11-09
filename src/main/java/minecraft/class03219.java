package minecraft;

import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public record class03219(Duration duration, String path, long bytes) {
   public long L() {
      return this.bytes;
   }

   public class03219(Duration duration, @Nullable String path, long bytes) {
      this.duration = duration;
      this.path = path;
      this.bytes = bytes;
   }

   @Nullable
   public String y() {
      return this.path;
   }

   public Duration N() {
      return this.duration;
   }

   public static class03234 N(Duration var0, List<class03219> var1) {
      long i = var1.stream().mapToLong(var0x -> var0x.bytes).sum();
      return new class03234(
         i,
         (double)i / var0.getSeconds(),
         var1.size(),
         (double)var1.size() / var0.getSeconds(),
         var1.stream().map(class03219::N).reduce(Duration.ZERO, Duration::plus),
         var1.stream()
            .filter(var0x -> var0x.path != null)
            .collect(Collectors.groupingBy(var0x -> var0x.path, Collectors.summingLong(var0x -> var0x.bytes)))
            .entrySet()
            .stream()
            .sorted(Entry.<String, Long>comparingByValue().reversed())
            .map(var0x -> Pair.of(var0x.getKey(), var0x.getValue()))
            .limit(10L)
            .toList()
      );
   }
}
