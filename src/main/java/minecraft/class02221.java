package minecraft;

public record class02221(float yOffset, float skullYOffset, float horizontalScale) {
   public static final class02221 N = new class02221(0.0F, 0.0F, 1.0F);

   public float L() {
      return this.horizontalScale;
   }

   public class02221(float yOffset, float skullYOffset, float horizontalScale) {
      this.yOffset = yOffset;
      this.skullYOffset = skullYOffset;
      this.horizontalScale = horizontalScale;
   }

   public float y() {
      return this.skullYOffset;
   }

   public float N() {
      return this.yOffset;
   }
}
