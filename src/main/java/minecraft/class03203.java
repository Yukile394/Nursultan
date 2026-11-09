package minecraft;

import com.google.common.base.MoreObjects;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;
import jdk.jfr.consumer.RecordedEvent;
import jdk.jfr.consumer.RecordedThread;

public record class03203(Instant timestamp, String threadName, long totalBytes) {
   private static final String u = "unknown";

   public long L() {
      return this.totalBytes;
   }

   public class03203(Instant timestamp, String threadName, long totalBytes) {
      super();
      this.timestamp = timestamp;
      this.threadName = threadName;
      this.totalBytes = totalBytes;
   }

   public String y() {
      return this.threadName;
   }

   public static class03203 N(RecordedEvent var0) {
      RecordedThread recordedthread = var0.getThread("thread");
      String s = recordedthread == null ? "unknown" : (String)MoreObjects.firstNonNull(recordedthread.getJavaName(), "unknown");
      return new class03203(var0.getStartTime(), s, var0.getLong("allocated"));
   }

   public static class03204 N(List<class03203> var0) {
      TreeMap treemap = new TreeMap();
      var0.stream().collect(Collectors.groupingBy(var0x -> var0x.threadName)).forEach((var1x, var2) -> {
         if (var2.size() >= 2) {
            class03203 class03203x = var2.get(0);
            class03203 class03203x = var2.get(var2.size() - 1);
            long i = Duration.between(class03203x.timestamp, class03203x.timestamp).getSeconds();
            long j = class03203x.totalBytes - class03203x.totalBytes;
            treemap.put(var1x, (double)j / i);
         }
      });
      return new class03204(treemap);
   }

   public Instant N() {
      return this.timestamp;
   }
}
