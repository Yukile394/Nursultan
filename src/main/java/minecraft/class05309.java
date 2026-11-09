package minecraft;

public class class05309 extends class02795<class01377, class08253, class05296> {
   private static final class01894 N = class01894.y("textures/entity/strider/strider.png");
   private static final class01894 i = class01894.y("textures/entity/strider/strider_cold.png");
   private static final float R = 0.5F;

   protected boolean L(class08253 var1) {
      return super.L(var1) || var1.y;
   }

   public class05309(class04832 var1) {
      super(var1, new class05296(var1.N(class04802.uO)), new class05296(var1.N(class04802.uI)), 0.5F);
      this.N(
         new class00207<>(this, var1.B(), class08719.field_56124, var0 -> var0.N, new class05296(var1.N(class04802.ug)), new class05296(var1.N(class04802.uJ)))
      );
   }

   protected float method_55831(class08253 var1) {
      float f = super.method_55831(var1);
      return var1.NB ? f * 0.5F : f;
   }

   public class08253 method_55269() {
      return new class08253();
   }

   public void method_62354(class01377 var1, class08253 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = var1.method_6118(class07085.field_55946).t();
      var2.y = var1.B();
      var2.L = var1.method_5782();
   }

   public class01894 N(class08253 var1) {
      return var1.y ? i : N;
   }
}
