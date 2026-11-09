package minecraft;

import java.time.Duration;
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public record class03228(Instant timestamp, Duration currentAverage) {
   public class03228(Instant timestamp, Duration currentAverage) {
      super();
      this.timestamp = timestamp;
      this.currentAverage = currentAverage;
   }

   public Duration y() {
      return this.currentAverage;
   }

   public Instant N() {
      return this.timestamp;
   }

   public static class03228 N(RecordedEvent var0) {
      return new class03228(var0.getStartTime(), var0.getDuration("averageTickDuration"));
   }
}
