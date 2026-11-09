package minecraft;

final class class00804 extends class00785 {
   class00804(String var1, int var2, String var3) {
      super(var3);
   }

   @Override
   public float N(class07209 var1, float var2) {
      double d0 = class00780.i.N(var1.method_10263() * 0.05, var1.method_10260() * 0.05, false) * 7.0;
      double d1 = class00780.R.N(var1.method_10263() * 0.2, var1.method_10260() * 0.2, false);
      return d0 + d1 < 0.3 && class00780.R.N(var1.method_10263() * 0.09, var1.method_10260() * 0.09, false) < 0.8 ? 0.2F : var2;
   }
}
