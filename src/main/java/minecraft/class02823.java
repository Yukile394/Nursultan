package minecraft;

public class class02823 extends class02802<class02839, class08793> {
   private static final class01894 N = class01894.y("textures/entity/skeleton/bogged.png");
   private static final class01894 i = class01894.y("textures/entity/skeleton/bogged_overlay.png");

   public class02823(class04832 var1) {
      super(var1, class04802.g, new class02681(var1.N(class04802.O)));
      this.N(new class08451<>(this, var1.R(), class04802.I, i));
   }

   public class08793 method_55269() {
      return new class08793();
   }

   public void method_62354(class02839 var1, class08793 var2, float var3) {
      super.method_62354((class02839)var1, (class08793)var2, var3);
      var2.N = var1.t();
   }

   public class01894 N(class08793 var1) {
      return N;
   }
}
