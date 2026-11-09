package minecraft;

public record class08192(long creationTime, long accumulatedElapsedTime) {
   public class08192(long var1) {
      this(var1, 0L);
   }

   public class08192(long creationTime, long accumulatedElapsedTime) {
      this.creationTime = creationTime;
      this.accumulatedElapsedTime = accumulatedElapsedTime;
   }

   public long y() {
      return this.accumulatedElapsedTime;
   }

   public double y(long var1) {
      return this.N(var1) / 1000.0;
   }

   public long N() {
      return this.creationTime;
   }

   public long N(long var1) {
      long i = var1 - this.creationTime;
      return this.accumulatedElapsedTime + i;
   }
}
