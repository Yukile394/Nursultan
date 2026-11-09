package minecraft;

public class class04465 {
   private static final double N = 4096.0;
   private class06889 y = class06889.L;

   public long L(class06889 var1) {
      return N(var1.Z) - N(this.y.Z);
   }

   public class04465() {
      super();
   }

   public void i(class06889 var1) {
      this.y = var1;
   }

   public class06889 u(class06889 var1) {
      return var1.u(this.y);
   }

   public long y(class06889 var1) {
      return N(var1.B) - N(this.y.B);
   }

   public class06889 N() {
      return this.y;
   }

   static long N(double var0) {
      return Math.round(var0 * 4096.0);
   }

   static double N(long var0) {
      return var0 / 4096.0;
   }

   public class06889 N(long var1, long var3, long var5) {
      if (var1 == 0L && var3 == 0L && var5 == 0L) {
         return this.y;
      } else {
         double d0 = var1 == 0L ? this.y.M : N(N(this.y.M) + var1);
         double d1 = var3 == 0L ? this.y.B : N(N(this.y.B) + var3);
         double d2 = var5 == 0L ? this.y.Z : N(N(this.y.Z) + var5);
         return new class06889(d0, d1, d2);
      }
   }

   public long N(class06889 var1) {
      return N(var1.M) - N(this.y.M);
   }
}
