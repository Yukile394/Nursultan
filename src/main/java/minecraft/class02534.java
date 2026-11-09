package minecraft;

public class class02534 extends class04256<class08018, class08283, class03090<class08283>> {
   private static final class01894 N = class01894.y("textures/entity/zombie_villager/zombie_villager.png");

   public class02534(class04832 var1) {
      super(var1, new class03090<>(var1.N(class04802.iI)), new class03090<>(var1.N(class04802.io)), 0.5F, class02624.N);
      this.N(new class02562<>(this, class08118.N(class04802.iV, var1.R(), class03090::new), class08118.N(class04802.iK, var1.R(), class03090::new), var1.B()));
      this.N(new class06247<>(this, var1.i(), "zombie_villager", new class03090<>(var1.N(class04802.iJ)), new class03090<>(var1.N(class04802.iq))));
   }

   public class08283 method_55269() {
      return new class08283();
   }

   protected boolean L(class08283 var1) {
      return super.L(var1) || var1.y;
   }

   public class01894 N(class08283 var1) {
      return N;
   }

   public void method_62354(class08018 var1, class08283 var2, float var3) {
      super.method_62354((class08018)var1, (class08283)var2, var3);
      var2.y = var1.v();
      var2.a = var1.t();
      var2.N = var1.Nl();
   }
}
