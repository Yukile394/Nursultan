package minecraft;

import java.util.Locale;

public class class03755 extends class01669 {
   private static final int i = 30;
   private static final double R = 33.333333333333336;

   private static double L(double var0) {
      return var0 / 1000000.0;
   }

   public class03755(class01590 var1, class02276 var2) {
      super(var1, var2);
   }

   @Override
   protected void u(class01054 var1, int var2, int var3, int var4) {
      this.N(var1, "30 FPS", var2 + 1, var4 - 60 + 1);
      this.N(var1, "60 FPS", var2 + 1, var4 - 30 + 1);
      var1.N(var2, var2 + var3 - 1, var4 - 30, -1);
      int ix = ((class05630)class06202.Nq().i_7).B().method_41753();
      if (ix > 0 && ix <= 250) {
         var1.N(var2, var2 + var3 - 1, var4 - this.y(1.0E9 / ix) - 1, -16711681);
      }
   }

   @Override
   protected int y(double var1) {
      return (int)Math.round(L(var1) * 60.0 / 33.333333333333336);
   }

   @Override
   protected String N(double var1) {
      return String.format(Locale.ROOT, "%d ms", (int)Math.round(L(var1)));
   }

   @Override
   protected int N(long var1) {
      return this.N(L(var1), 0.0, -16711936, 28.0, -256, 56.0, -65536);
   }
}
