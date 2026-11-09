package minecraft;

public class class07836 extends class06075 {
   private final class06069 u;
   private int i;

   @Override
   public class01818 L() {
      return this.u.L();
   }

   public void L(long var1, int var3, int var4) {
      this.N(var1);
      long ix = this.B();
      long j = this.B();
      long k = var3 * ix ^ var4 * j ^ var1;
      this.N(k);
   }

   public class07836(class06069 var1) {
      super(0L);
      this.u = var1;
   }

   public void y(long var1, int var3, int var4) {
      long ix = var1 + var3 + 10000 * var4;
      this.N(ix);
   }

   @Override
   public class06069 y() {
      return this.u.y();
   }

   public void N(long var1, int var3, int var4, int var5) {
      long ix = var3 * 341873128712L + var4 * 132897987541L + var1 + var5;
      this.N(ix);
   }

   public static class06069 N(int var0, int var1, long var2, long var4) {
      return class06069.y(var2 + var0 * var0 * 4987142 + var0 * 5947611 + var1 * var1 * 4392871L + var1 * 389711 ^ var4);
   }

   public int N() {
      return this.i;
   }

   @Override
   public int N(int var1) {
      this.i++;
      class06069 class06069 = this.u;
      return class06069 instanceof class06075 ? ((class06075)class06069).N(var1) : (int)(this.u.B() >>> 64 - var1);
   }

   @Override
   public synchronized void N(long var1) {
      if (this.u != null) {
         this.u.N(var1);
      }
   }

   public long N(long var1, int var3, int var4) {
      this.N(var1);
      long ix = this.B() | 1L;
      long j = this.B() | 1L;
      long k = var3 * ix + var4 * j ^ var1;
      this.N(k);
      return k;
   }
}
