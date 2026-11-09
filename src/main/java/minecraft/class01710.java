package minecraft;

public class class01710 extends class02795<class07618, class08798, class03114> {
   private static final class01894 N = class01894.y("textures/entity/dolphin.png");

   public class01710(class04832 var1) {
      super(var1, new class03114(var1.N(class04802.Ng)), new class03114(var1.N(class04802.NI)), 0.7F);
      this.N(new class02249(this));
   }

   public class08798 method_55269() {
      return new class08798();
   }

   public void method_62354(class07618 var1, class08798 var2, float var3) {
      super.method_62354(var1, var2, var3);
      class08837.N(var1, var2, this.L);
      var2.N = var1.method_18798().z() > 1.0E-7;
   }

   public class01894 N(class08798 var1) {
      return N;
   }
}
