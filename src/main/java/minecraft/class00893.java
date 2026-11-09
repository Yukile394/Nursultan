package minecraft;

public record class00893(int x, int z) {
   private static final long L = 32L;
   private static final long u = 4294967295L;

   public int L() {
      return this.x;
   }

   public class00893(int x, int z) {
      this.x = x;
      this.z = z;
   }

   @Override
   public String toString() {
      return "[" + this.x + ", " + this.z + "]";
   }

   @Override
   public int hashCode() {
      return class07321.i(this.x, this.z);
   }

   public int u() {
      return this.z;
   }

   public static int y(long var0) {
      return (int)(var0 >>> 32 & 4294967295L);
   }

   public long y() {
      return N(this.x, this.z);
   }

   public static int N(long var0) {
      return (int)(var0 & 4294967295L);
   }

   public class07321 N() {
      return new class07321(class01296.N(this.x), class01296.N(this.z));
   }

   public static long N(int var0, int var1) {
      return var0 & 4294967295L | (var1 & 4294967295L) << 32;
   }
}
