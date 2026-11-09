package minecraft;

public class class02186 extends class02795<class07881, class08442, class04535> {
   private static final class01894 N = class01894.y("textures/entity/sheep/sheep.png");

   public class02186(class04832 var1) {
      super(var1, new class04535(var1.N(class04802.LD)), new class04535(var1.N(class04802.Lh)), 0.7F);
      this.N(new class08528(this, var1.R()));
      this.N(new class02426(this, var1.R()));
   }

   public class08442 method_55269() {
      return new class08442();
   }

   public void method_62354(class07881 var1, class08442 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.y = var1.i(var3);
      var2.N = var1.u(var3);
      var2.L = var1.m();
      var2.u = var1.W();
      var2.i = N(var1, "jeb_");
   }

   public class01894 N(class08442 var1) {
      return N;
   }
}
