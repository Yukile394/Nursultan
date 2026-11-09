package minecraft;

public class class03847 {
   private static final double N = 50.0;

   public class03847() {
      super();
   }

   private static double N(class04508 var0) {
      return Math.max(50.0, var0.method_45325(class05298.P));
   }

   public static boolean N(class04508 var0, class06889 var1) {
      class06889 class06889 = new class06889(var0.method_23317(), var0.method_23318(), var0.method_23321());
      return var1.R(class06889) > N(var0)
         ? false
         : var0.method_73183().N(new class05862(class06889, var1, class05849.field_17558, class05835.field_1348, var0)).N() == class07113.field_1333;
   }

   public static class06889 N(class07438 var0, class06069 var1) {
      byte b0 = 90;
      float f = var0.fields_4212a028292fd3c078969e3ee4c71d9e8_2 + 180.0F + (float)var1.E() * 90.0F / 2.0F;
      float f1 = class04995.B(var1.z(), 4.0F, 8.0F);
      class06889 class06889 = class06889.N(0.0F, f).L((double)f1);
      return var0.method_73189().i(class06889);
   }
}
