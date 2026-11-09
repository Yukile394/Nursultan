package minecraft;

public class class01931 extends class06078<class08476> {
   private final class01686 N;

   public class01931(class01686 var1) {
      super(var1, class06851::M);
      this.N = var1.y("tail");
   }

   public void method_2819(class08476 var1) {
      super.method_2819(var1);
      float f = var1.NZ ? 1.0F : 1.5F;
      this.N.R = -f * 0.25F * class04995.m(0.3F * var1.P);
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      float f = 0.0F;
      float f1 = 22.0F;
      float f2 = -3.0F;
      class04839.N("body", class04822.L().N(0, 0).N(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 3.0F), class04838.N(0.0F, 22.0F, -3.0F));
      class04839.N("tail", class04822.L().N(0, 0).N(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 7.0F), class04838.N(0.0F, 22.0F, 0.0F));
      return class04806.N(class04792, 16, 16);
   }
}
