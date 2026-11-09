package minecraft;

public class class01718 extends class02840<class07550, class08786, class04816> {
   private static final class01894 N = class01894.y("textures/entity/creeper/creeper.png");

   public class01718(class04832 var1) {
      super(var1, new class04816(var1.N(class04802.Nl)), 0.5F);
      this.N(new class02543(this, var1.R()));
   }

   public class08786 method_55269() {
      return new class08786();
   }

   public class01894 N(class08786 var1) {
      return N;
   }

   public void method_62354(class07550 var1, class08786 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = var1.u(var3);
      var2.y = var1.B();
   }

   protected void y(class08786 var1, class01421 var2) {
      float f = var1.N;
      float f1 = 1.0F + class04995.m(f * 100.0F) * f * 0.01F;
      f = class04995.N(f, 0.0F, 1.0F);
      f *= f;
      f *= f;
      float f2 = (1.0F + f * 0.4F) * f1;
      float f3 = (1.0F + f * 0.1F) / f1;
      var2.y(f2, f3, f2);
   }

   protected float i(class08786 var1) {
      float f = var1.N;
      return (int)(f * 10.0F) % 2 == 0 ? 0.0F : class04995.N(f, 0.5F, 1.0F);
   }
}
