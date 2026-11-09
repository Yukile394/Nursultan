package minecraft;

public class class01749 extends class02840<class07644, class08476, class04814> {
   private static final class01894 N = class01894.y("textures/entity/fish/cod.png");

   public class01749(class04832 var1) {
      super(var1, new class04814(var1.N(class04802.Ny)), 0.3F);
   }

   @Override
   protected void y(class08476 var1, class01421 var2, float var3, float var4) {
      super.y(var1, var2, var3, var4);
      float f = 4.3F * class04995.m(0.6F * var1.P);
      var2.N(class02058.u.N(f));
      if (!var1.NZ) {
         var2.N(0.1F, 0.1F, -0.1F);
         var2.N(class02058.R.N(90.0F));
      }
   }

   public class08476 method_55269() {
      return new class08476();
   }

   @Override
   public class01894 N(class08476 var1) {
      return N;
   }
}
