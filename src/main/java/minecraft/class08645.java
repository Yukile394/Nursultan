package minecraft;

public class class08645 extends class02795<class00032, class08670, class08684> {
   private static final class01894 N = class01894.y("textures/entity/ghast/happy_ghast.png");
   private static final class01894 i = class01894.y("textures/entity/ghast/happy_ghast_baby.png");
   private static final class01894 R = class01894.y("textures/entity/ghast/happy_ghast_ropes.png");

   public class08645(class04832 var1) {
      super(var1, new class08684(var1.N(class04802.yP)), new class08684(var1.N(class04802.ys)), 2.0F);
      this.N(
         new class00207<>(this, var1.B(), class08719.field_59984, var0 -> var0.N, new class08644(var1.N(class04802.yT)), new class08644(var1.N(class04802.yb)))
      );
      this.N(new class00066<>(this, var1.R(), R));
   }

   public class08670 method_55269() {
      return new class08670();
   }

   protected class00734 y(class00032 var1) {
      class00734 class00734 = super.method_62358(var1);
      float f = var1.method_17682();
      return class00734.y(class00734.y - f / 2.0F);
   }

   public void method_62354(class00032 var1, class08670 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = var1.method_6118(class07085.field_48824).t();
      var2.y = var1.method_5782();
      var2.L = var1.W();
   }

   public class01894 N(class08670 var1) {
      return var1.NB ? i : N;
   }
}
