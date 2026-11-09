package minecraft;

import java.time.Duration;

public record class03214(Duration duration, Duration gcTotalDuration, int totalGCs, double allocationRateBytesPerSecond) {
   public Duration L() {
      return this.gcTotalDuration;
   }

   public class03214(Duration duration, Duration gcTotalDuration, int totalGCs, double allocationRateBytesPerSecond) {
      super();
      this.duration = duration;
      this.gcTotalDuration = gcTotalDuration;
      this.totalGCs = totalGCs;
      this.allocationRateBytesPerSecond = allocationRateBytesPerSecond;
   }

   public double i() {
      return this.allocationRateBytesPerSecond;
   }

   public int u() {
      return this.totalGCs;
   }

   public Duration y() {
      return this.duration;
   }

   public float N() {
      return (float)this.gcTotalDuration.toMillis() / (float)this.duration.toMillis();
   }
}
