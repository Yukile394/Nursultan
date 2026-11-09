package minecraft;

class class03353 extends class06271<Float> {
   private final class01686 N;

   public class03353(class01686 var1) {
      super(var1, class06851::M);
      this.N = var1.y("lid");
   }

   public void method_2819(Float var1) {
      super.method_2819(var1);
      this.N.N(0.0F, 24.0F - var1 * 0.5F * 16.0F, 0.0F);
      this.N.R = 270.0F * var1 * (float) (Math.PI / 180.0);
   }
}
