package minecraft;

public final class class03911 {
   protected class03911() {
      super();
   }

   public static double y(double var0) {
      if (var0 < -0.5) {
         return 0.75;
      } else if (var0 < 0.0) {
         return 1.0;
      } else {
         return var0 < 0.5 ? 1.5 : 2.0;
      }
   }

   public static double N(double var0) {
      if (var0 < -0.75) {
         return 0.5;
      } else if (var0 < -0.5) {
         return 0.75;
      } else if (var0 < 0.5) {
         return 1.0;
      } else {
         return var0 < 0.75 ? 2.0 : 3.0;
      }
   }
}
