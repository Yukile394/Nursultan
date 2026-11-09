package minecraft;

class class00112 extends class05801 {
   private final class09011 N;

   public float L() {
      return N(this.N, this.field_22753);
   }

   private static class00392 L(class09011 var0, double var1) {
      return var0.N(y(var0, var1));
   }

   class00112(class09011 var1, double var2) {
      super(0, 0, var1.y(), 20, L(var1, var2), var2);
      this.N = var1;
   }

   private static String y(class09011 var0, double var1) {
      return N(N(var0, var1));
   }

   public String y() {
      return y(this.N, this.field_22753);
   }

   private static String N(float var0) {
      int i = (int)var0;
      return i == var0 ? Integer.toString(i) : Float.toString(var0);
   }

   private static float N(class09011 var0, double var1) {
      return var0.i().N((float)var1);
   }

   @Override
   protected void method_25344() {
   }

   @Override
   protected void method_25346() {
      this.method_25355(L(this.N, this.field_22753));
   }
}
