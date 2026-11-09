package minecraft;

public record class02052(float minU, float minV, float maxU, float maxV) {
   public float L() {
      return this.maxU;
   }

   public class02052(float minU, float minV, float maxU, float maxV) {
      this.minU = minU;
      this.minV = minV;
      this.maxU = maxU;
      this.maxV = maxV;
   }

   public float u() {
      return this.maxV;
   }

   public float y(int var1) {
      return var1 != 0 && var1 != 3 ? this.maxV : this.minV;
   }

   public float y() {
      return this.minV;
   }

   public float N() {
      return this.minU;
   }

   public float N(int var1) {
      return var1 != 0 && var1 != 1 ? this.maxU : this.minU;
   }
}
