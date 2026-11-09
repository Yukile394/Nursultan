package minecraft;

record class01945(double xd, double yd, double zd) {
   private static final double u = 1.0;
   private static final double i = 0.1;

   public double L() {
      return this.zd;
   }

   private class01945(double xd, double yd, double zd) {
      this.xd = xd;
      this.yd = yd;
      this.zd = zd;
   }

   public double y() {
      return this.yd;
   }

   public double N() {
      return this.xd;
   }

   public static class01945 N(class06889 var0, class07211 var1) {
      double d0 = 0.0;

      return switch (var1) {
         case field_11033, field_11036 -> new class01945(var0.L(), 0.0, -var0.N());
         case field_11043 -> new class01945(1.0, 0.0, -0.1);
         case field_11035 -> new class01945(-1.0, 0.0, 0.1);
         case field_11039 -> new class01945(-0.1, 0.0, -1.0);
         case field_11034 -> new class01945(0.1, 0.0, 1.0);
      };
   }
}
