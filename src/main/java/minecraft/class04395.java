package minecraft;

public record class04395(float startAlpha, float endAlpha, float startAtNormalizedAge, float endAtNormalizedAge) {
   public static final class04395 N = new class04395(1.0F, 1.0F, 0.0F, 1.0F);

   public float L() {
      return this.endAlpha;
   }

   public class04395(float startAlpha, float endAlpha, float startAtNormalizedAge, float endAtNormalizedAge) {
      super();
      this.startAlpha = startAlpha;
      this.endAlpha = endAlpha;
      this.startAtNormalizedAge = startAtNormalizedAge;
      this.endAtNormalizedAge = endAtNormalizedAge;
   }

   public float i() {
      return this.endAtNormalizedAge;
   }

   public float u() {
      return this.startAtNormalizedAge;
   }

   public float y() {
      return this.startAlpha;
   }

   public boolean N() {
      return this.startAlpha >= 1.0F && this.endAlpha >= 1.0F;
   }

   public float N(int var1, int var2, float var3) {
      return class04995.y(this.startAlpha, this.endAlpha)
         ? this.startAlpha
         : class04995.y(class04995.R((var1 + var3) / var2, this.startAtNormalizedAge, this.endAtNormalizedAge), this.startAlpha, this.endAlpha);
   }
}
