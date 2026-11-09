package minecraft;

public record class01138(float animationPos, float pageFlip1, float pageFlip2, float open) {

   public float L() {
      return this.pageFlip2;
   }

   public class01138(float animationPos, float pageFlip1, float pageFlip2, float open) {
      this.animationPos = animationPos;
      this.pageFlip1 = pageFlip1;
      this.pageFlip2 = pageFlip2;
      this.open = open;
   }

   public float u() {
      return this.open;
   }

   public float y() {
      return this.pageFlip1;
   }

   public float N() {
      return this.animationPos;
   }
}
