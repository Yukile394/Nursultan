package minecraft;

public class class07726 {
   public static final int N = 2097152;
   public static final int y = 104857600;
   private static final int L = 512;
   private final long u;
   private long i;
   private final int R;
   private int M;

   public static class07726 L() {
      return new class07726(Long.MAX_VALUE, 512);
   }

   public int M() {
      return this.M;
   }

   public class07726(long var1, int var3) {
      super();
      this.u = var1;
      this.R = var3;
   }

   public void i() {
      if (this.M <= 0) {
         throw new class03735("NBT-Accounter tried to pop stack-depth at top-level");
      } else {
         this.M--;
      }
   }

   public void u() {
      if (this.M >= this.R) {
         throw new class03735("Tried to read NBT tag with too high complexity, depth > " + this.R);
      } else {
         this.M++;
      }
   }

   public void y(long var1) {
      if (var1 < 0L) {
         throw new IllegalArgumentException("Tried to account NBT tag with negative size: " + var1);
      } else if (this.i + var1 > this.u) {
         throw new class03735("Tried to read NBT tag that was too big; tried to allocate: " + this.i + " + " + var1 + " bytes where max allowed: " + this.u);
      } else {
         this.i += var1;
      }
   }

   public static class07726 y() {
      return new class07726(104857600L, 512);
   }

   public void N(long var1, long var3) {
      this.y(var1 * var3);
   }

   public static class07726 N() {
      return new class07726(2097152L, 512);
   }

   public static class07726 N(long var0) {
      return new class07726(var0, 512);
   }

   public long R() {
      return this.i;
   }
}
