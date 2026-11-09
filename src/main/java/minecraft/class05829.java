package minecraft;

class class05829 {
   private static final int N = 2048;
   private static final int y = 4;
   private final byte[] L;

   public class05829() {
      super();
      this.L = new byte[2048];
   }

   public class05829(byte[] var1) {
      super();
      this.L = var1;
      if (var1.length != 2048) {
         throw new IllegalArgumentException("ChunkNibbleArrays should be 2048 bytes not: " + var1.length);
      }
   }

   private int y(int var1) {
      return var1 >> 1;
   }

   private boolean N(int var1) {
      return (var1 & 1) == 0;
   }

   public int N(int var1, int var2, int var3) {
      int i = this.y(var2 << 8 | var3 << 4 | var1);
      return this.N(var2 << 8 | var3 << 4 | var1) ? this.L[i] & 15 : this.L[i] >> 4 & 15;
   }
}
