package minecraft;

public class class01327 extends class02795<class06165, class08460, class01316> {
   private static final class01894 N = class01894.y("textures/entity/fox/fox.png");
   private static final class01894 i = class01894.y("textures/entity/fox/fox_sleep.png");
   private static final class01894 R = class01894.y("textures/entity/fox/snow_fox.png");
   private static final class01894 M = class01894.y("textures/entity/fox/snow_fox_sleep.png");

   public class01327(class04832 var1) {
      super(var1, new class01316(var1.N(class04802.yL)), new class01316(var1.N(class04802.yu)), 0.4F);
      this.N(new class01320(this));
   }

   public class08460 method_55269() {
      return new class08460();
   }

   public class01894 N(class08460 var1) {
      if (var1.B == class01319.field_17996) {
         return var1.u ? i : N;
      } else {
         return var1.u ? M : R;
      }
   }

   public void method_62354(class06165 var1, class08460 var2, float var3) {
      super.method_62354(var1, var2, var3);
      class08837.N(var1, var2, this.L);
      var2.N = var1.u(var3);
      var2.L = var1.method_18276();
      var2.y = var1.i(var3);
      var2.u = var1.method_6113();
      var2.i = var1.v();
      var2.R = var1.n();
      var2.M = var1.G();
      var2.B = var1.W();
   }

   protected void y(class08460 var1, class01421 var2, float var3, float var4) {
      super.y(var1, var2, var3, var4);
      if (var1.M || var1.R) {
         var2.N(class02058.y.N(-var1.h));
      }
   }
}
