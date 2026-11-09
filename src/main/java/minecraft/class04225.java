package minecraft;

public class class04225 extends class01097 {
   private final class01686 N;
   private final class01686 y;
   private final class01686 L;

   public class04225(class01686 var1) {
      super(var1);
      this.N = var1.y("head");
      this.y = this.N.y("left_ear");
      this.L = this.N.y("right_ear");
   }

   public void method_2819(class01112 var1) {
      super.method_2819(var1);
      this.N.R = var1.y * (float) (Math.PI / 180.0);
      this.N.i = var1.L * (float) (Math.PI / 180.0);
      float f = 1.2F;
      this.y.M = (float)(-(Math.cos(var1.N * (float) Math.PI * 0.2F * 1.2F) + 2.5)) * 0.2F;
      this.L.M = (float)(Math.cos(var1.N * (float) Math.PI * 0.2F) + 2.5) * 0.2F;
   }

   public static class04792 N() {
      class04792 class04792 = new class04792();
      class01486.N(class04834.N, class04792);
      return class04792;
   }
}
