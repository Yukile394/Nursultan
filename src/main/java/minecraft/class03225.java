package minecraft;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import jdk.jfr.consumer.RecordedEvent;

public record class03225(Instant timestamp, long heapUsed, class03210 timing) {
   public class03210 L() {
      return this.timing;
   }

   public class03225(Instant timestamp, long heapUsed, class03210 timing) {
      this.timestamp = timestamp;
      this.heapUsed = heapUsed;
      this.timing = timing;
   }

   public long y() {
      return this.heapUsed;
   }

   private static double N(List<class03225> var0) {
      long i = 0L;
      Map map = var0.stream().collect(Collectors.groupingBy(var0x -> var0x.timing));
      List list = (List)map.get(class03210.field_34443);
      List list1 = (List)map.get(class03210.field_34444);

      for (int j = 1; j < list.size(); j++) {
         class03225 class03225x = (class03225)list.get(j);
         class03225 class03225x = (class03225)list1.get(j - 1);
         i += class03225x.heapUsed - class03225x.heapUsed;
      }

      Duration duration = Duration.between(((class03225)var0.get(1)).timestamp, ((class03225)var0.get(var0.size() - 1)).timestamp);
      return (double)i / duration.getSeconds();
   }

   public static class03225 N(RecordedEvent var0) {
      return new class03225(
         var0.getStartTime(), var0.getLong("heapUsed"), var0.getString("when").equalsIgnoreCase("before gc") ? class03210.field_34443 : class03210.field_34444
      );
   }

   public Instant N() {
      return this.timestamp;
   }

   public static class03214 N(Duration var0, List<class03225> var1, Duration var2, int var3) {
      return new class03214(var0, var2, var3, N(var1));
   }
}
