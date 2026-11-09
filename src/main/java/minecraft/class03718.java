package minecraft;

import java.util.Locale;

public class class03718 extends class01669 {
   private static final int i = -16711681;
   private static final int R = -6250241;
   private static final int M = -65536;
   private static final int B = 1024;
   private static final int Z = 1048576;
   private static final int z = 1048576;

   private static String L(double var0) {
      if (var0 >= 1048576.0) {
         return String.format(Locale.ROOT, "%.1f MiB/s", var0 / 1048576.0);
      } else {
         return var0 >= 1024.0 ? String.format(Locale.ROOT, "%.1f KiB/s", var0 / 1024.0) : String.format(Locale.ROOT, "%d B/s", class04995.N(var0));
      }
   }

   public class03718(class01590 var1, class02276 var2) {
      super(var1, var2);
   }

   private static double i(double var0) {
      return var0 * 20.0;
   }

   @Override
   protected void u(class01054 var1, int var2, int var3, int var4) {
      this.N(var1, var2, var3, var4, 64);
      this.N(var1, var2, var3, var4, 1024);
      this.N(var1, var2, var3, var4, 16384);
      this.N(var1, L(1048576.0), var2 + 1, var4 - u(1048576.0) + 1);
   }

   private static int u(double var0) {
      return (int)Math.round(Math.log(var0 + 1.0) * 60.0 / Math.log(1048576.0));
   }

   @Override
   protected int y(double var1) {
      return u(i(var1));
   }

   private void N(class01054 var1, int var2, int var3, int var4, int var5) {
      this.N(var1, var2, var3, var4 - u(var5), L(var5));
   }

   @Override
   protected int N(long var1) {
      return this.N(i(var1), 0.0, -16711681, 8192.0, -6250241, 1.048576E7, -65536);
   }

   private void N(class01054 var1, int var2, int var3, int var4, String var5) {
      this.N(var1, var5, var2 + 1, var4 + 1);
      var1.N(var2, var2 + var3 - 1, var4, -1);
   }

   @Override
   protected String N(double var1) {
      return L(i(var1));
   }
}
