package minecraft;

public class class08842 extends class06271<Float> {
   private final class01686 N;

   public class08842(class01686 var1) {
      super(var1, class06851::u);
      this.N = var1.y("flag");
   }

   public void method_2819(Float var1) {
      super.method_2819(var1);
      this.N.i = (-0.0125F + 0.01F * class04995.P((float) (Math.PI * 2) * var1)) * (float) Math.PI;
   }

   public static class04806 N(boolean var0) {
      class04792 class04792 = new class04792();
      class04792.N()
         .N("flag", class04822.L().N(0, 0).N(-10.0F, 0.0F, -2.0F, 20.0F, 40.0F, 1.0F), class04838.N(0.0F, var0 ? -44.0F : -20.5F, var0 ? 0.0F : 10.5F));
      return class04806.N(class04792, 64, 64);
   }
}
