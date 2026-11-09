package minecraft;

public record class04809(float u, float v) {
   public class04809(float u, float v) {
      this.u = u;
      this.v = v;
   }

   @Override
   public String toString() {
      return "(" + this.u + "," + this.v + ")";
   }

   public float y() {
      return this.v;
   }

   public static float y(long var0) {
      return Float.intBitsToFloat((int)var0);
   }

   public static long N(float var0, float var1) {
      long i = Float.floatToIntBits(var0) & 4294967295L;
      long j = Float.floatToIntBits(var1) & 4294967295L;
      return i << 32 | j;
   }

   public float N() {
      return this.u;
   }

   public static float N(long var0) {
      return Float.intBitsToFloat((int)(var0 >> 32));
   }
}
