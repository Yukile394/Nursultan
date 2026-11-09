package minecraft;

public record class03231(long temperature, long humidity, long continentalness, long erosion, long depth, long weirdness) {

   public long L() {
      return this.humidity;
   }

   public long M() {
      return this.weirdness;
   }

   public class03231(long temperature, long humidity, long continentalness, long erosion, long depth, long weirdness) {
      super();
      this.temperature = temperature;
      this.humidity = humidity;
      this.continentalness = continentalness;
      this.erosion = erosion;
      this.depth = depth;
      this.weirdness = weirdness;
   }

   public long i() {
      return this.erosion;
   }

   public long u() {
      return this.continentalness;
   }

   public long y() {
      return this.temperature;
   }

   protected long[] N() {
      return new long[]{this.temperature, this.humidity, this.continentalness, this.erosion, this.depth, this.weirdness, 0L};
   }

   public long R() {
      return this.depth;
   }
}
