package minecraft;

public class class01142 {
   private boolean N;
   private float y;
   private float L;

   public class01142() {
      super();
   }

   public void N(boolean var1) {
      this.N = var1;
   }

   public float N(float var1) {
      return class04995.B(var1, this.L, this.y);
   }

   public void N() {
      this.L = this.y;
      float f = 0.1F;
      if (!this.N && this.y > 0.0F) {
         this.y = Math.max(this.y - 0.1F, 0.0F);
      } else if (this.N && this.y < 1.0F) {
         this.y = Math.min(this.y + 0.1F, 1.0F);
      }
   }
}
