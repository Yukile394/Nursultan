package minecraft;

import java.util.Locale;
import java.util.function.Supplier;

public class class03751 extends class01669 {
   private static final int i = -6745839;
   private static final int R = -4548257;
   private static final int M = -10547572;
   private final Supplier<Float> B;

   private static double L(double var0) {
      return var0 / 1000000.0;
   }

   @Override
   protected void L(class01054 var1, int var2, int var3, int var4) {
      long ix = this.u.N(var4, class02869.field_48719.ordinal());
      int j = this.y((double)ix);
      var1.N(var3, var2 - j, var3 + 1, var2, -6745839);
      long k = this.u.N(var4, class02869.field_48720.ordinal());
      int l = this.y((double)k);
      var1.N(var3, var2 - j - l, var3 + 1, var2 - j, -4548257);
      long i1 = this.u.N(var4) - this.u.N(var4, class02869.field_48721.ordinal()) - ix - k;
      int j1 = this.y((double)i1);
      var1.N(var3, var2 - j1 - l - j, var3 + 1, var2 - l - j, -10547572);
   }

   public class03751(class01590 var1, class02276 var2, Supplier<Float> var3) {
      super(var1, var2);
      this.B = var3;
   }

   @Override
   protected void u(class01054 var1, int var2, int var3, int var4) {
      float f = (float)class01517.L / this.B.get();
      this.N(var1, String.format(Locale.ROOT, "%.1f TPS", f), var2 + 1, var4 - 60 + 1);
   }

   @Override
   protected int y(double var1) {
      return (int)Math.round(L(var1) * 60.0 / this.B.get().floatValue());
   }

   @Override
   protected long y(int var1) {
      return this.u.N(var1) - this.u.N(var1, class02869.field_48721.ordinal());
   }

   @Override
   protected int N(long var1) {
      float f = this.B.get();
      return this.N(L(var1), f, -16711936, f * 1.125, -256, f * 1.25, -65536);
   }

   @Override
   protected String N(double var1) {
      return String.format(Locale.ROOT, "%d ms", (int)Math.round(L(var1)));
   }
}
