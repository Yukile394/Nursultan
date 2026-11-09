package minecraft;

import java.util.Locale;

public class class03716 extends class01669 {
   private static final int i = 500;

   public class03716(class01590 var1, class02276 var2) {
      super(var1, var2);
   }

   @Override
   protected void u(class01054 var1, int var2, int var3, int var4) {
      this.N(var1, "500 ms", var2 + 1, var4 - 60 + 1);
   }

   @Override
   protected int y(double var1) {
      return (int)Math.round(var1 * 60.0 / 500.0);
   }

   @Override
   protected int N(long var1) {
      return this.N(var1, 0.0, -16711936, 250.0, -256, 500.0, -65536);
   }

   @Override
   protected String N(double var1) {
      return String.format(Locale.ROOT, "%d ms", (int)Math.round(var1));
   }
}
