package minecraft;

import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.List;

public record class03234(
   long totalBytes, double bytesPerSecond, long counts, double countsPerSecond, Duration timeSpentInIO, List<Pair<String, Long>> topTenContributorsByTotalBytes
) {
   public long L() {
      return this.counts;
   }

   public class03234(
      long totalBytes,
      double bytesPerSecond,
      long counts,
      double countsPerSecond,
      Duration timeSpentInIO,
      List<Pair<String, Long>> topTenContributorsByTotalBytes
   ) {
      super();
      this.totalBytes = totalBytes;
      this.bytesPerSecond = bytesPerSecond;
      this.counts = counts;
      this.countsPerSecond = countsPerSecond;
      this.timeSpentInIO = timeSpentInIO;
      this.topTenContributorsByTotalBytes = topTenContributorsByTotalBytes;
   }

   public Duration i() {
      return this.timeSpentInIO;
   }

   public double u() {
      return this.countsPerSecond;
   }

   public double y() {
      return this.bytesPerSecond;
   }

   public long N() {
      return this.totalBytes;
   }

   public List<Pair<String, Long>> R() {
      return this.topTenContributorsByTotalBytes;
   }
}
