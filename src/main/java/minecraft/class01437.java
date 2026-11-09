package minecraft;

public class class01437 {
   public class01437() {
      super();
   }

   public static class00734 N(class00734 var0, class07211 var1, double var2) {
      double d0 = var2 * var1.i().N();
      double d1 = Math.min(d0, 0.0);
      double d2 = Math.max(d0, 0.0);
      switch (var1) {
         case field_11039:
            return new class00734(var0.N + d1, var0.y, var0.L, var0.N + d2, var0.i, var0.R);
         case field_11034:
            return new class00734(var0.u + d1, var0.y, var0.L, var0.u + d2, var0.i, var0.R);
         case field_11033:
            return new class00734(var0.N, var0.y + d1, var0.L, var0.u, var0.y + d2, var0.R);
         case field_11036:
         default:
            return new class00734(var0.N, var0.i + d1, var0.L, var0.u, var0.i + d2, var0.R);
         case field_11043:
            return new class00734(var0.N, var0.y, var0.L + d1, var0.u, var0.i, var0.L + d2);
         case field_11035:
            return new class00734(var0.N, var0.y, var0.R + d1, var0.u, var0.i, var0.R + d2);
      }
   }
}
