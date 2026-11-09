package minecraft;

record class03947(int featureIndex, int step, class04336 feature) {
   public class04336 L() {
      return this.feature;
   }

   class03947(int featureIndex, int step, class04336 feature) {
      this.featureIndex = featureIndex;
      this.step = step;
      this.feature = feature;
   }

   public int y() {
      return this.step;
   }

   public int N() {
      return this.featureIndex;
   }
}
