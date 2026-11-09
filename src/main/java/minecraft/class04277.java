package minecraft;

public class class04277 extends class02840<class07625, class08479, class01174> {
   private static final class01894 N = class01894.y("textures/entity/iron_golem/iron_golem.png");

   public class04277(class04832 var1) {
      super(var1, new class01174(var1.N(class04802.yq)), 0.7F);
      this.N(new class05898(this));
      this.N(new class02737(this));
   }

   public class08479 method_55269() {
      return new class08479();
   }

   public void method_62354(class07625 var1, class08479 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = var1.v() > 0.0F ? var1.v() - var3 : 0.0F;
      var2.y = var1.n();
      var2.L = var1.m();
   }

   protected void y(class08479 var1, class01421 var2, float var3, float var4) {
      super.y(var1, var2, var3, var4);
      if (!(var1.Ny < 0.01)) {
         float f = 13.0F;
         float f1 = (Math.abs((var1.NN + 6.0F) % 13.0F - 6.5F) - 3.25F) / 3.25F;
         var2.N(class02058.R.N(6.5F * f1));
      }
   }

   public class01894 N(class08479 var1) {
      return N;
   }
}
