package minecraft;

public record class03027(double alpha, double blendingOffset) {
   public class03027(double alpha, double blendingOffset) {
      this.alpha = alpha;
      this.blendingOffset = blendingOffset;
   }

   public double y() {
      return this.blendingOffset;
   }

   public double N() {
      return this.alpha;
   }
}
