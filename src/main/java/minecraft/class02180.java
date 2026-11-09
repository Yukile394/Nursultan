package minecraft;

public class class02180 extends class02840<class07162, class08473, class04390> {
   public static final class01894 N = class01894.y("textures/entity/slime/slime.png");

   public class02180(class04832 var1) {
      super(var1, new class04390(var1.N(class04802.us)), 0.25F);
      this.N(new class02407(this, var1.R()));
   }

   public class08473 method_55269() {
      return new class08473();
   }

   public class01894 N(class08473 var1) {
      return N;
   }

   protected void y(class08473 var1, class01421 var2) {
      float f = 0.999F;
      var2.y(0.999F, 0.999F, 0.999F);
      var2.N(0.0F, 0.001F, 0.0F);
      float f1 = var1.y;
      float f2 = var1.N / (f1 * 0.5F + 1.0F);
      float f3 = 1.0F / (f2 + 1.0F);
      var2.y(f3 * f1, 1.0F / f3 * f1, f3 * f1);
   }

   public void method_62354(class07162 var1, class08473 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = class04995.B(var3, var1.R, var1.i);
      var2.y = var1.t();
   }

   protected float u(class08473 var1) {
      return var1.y * 0.25F;
   }
}
