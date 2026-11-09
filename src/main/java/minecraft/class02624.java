package minecraft;

public class class02624 extends class02795<class08041, class08257, class03094> {
   private static final class01894 i = class01894.y("textures/entity/villager/villager.png");
   public static final class02221 N = new class02221(-0.1171875F, -0.07421875F, 1.0F);

   public class02624(class04832 var1) {
      super(var1, new class03094(var1.N(class04802.uS)), new class03094(var1.N(class04802.uD)), 0.5F);
      this.N(new class02245<>(this, var1.R(), var1.U(), N));
      this.N(new class06247<>(this, var1.i(), "villager", new class03094(var1.N(class04802.ux)), new class03094(var1.N(class04802.uh))));
      this.N(new class06174<>(this));
   }

   public class08257 method_55269() {
      return new class08257();
   }

   protected float u(class08257 var1) {
      float f = super.method_55831(var1);
      return var1.NB ? f * 0.5F : f;
   }

   public void method_62354(class08041 var1, class08257 var2, float var3) {
      super.method_62354(var1, var2, var3);
      class08837.N(var1, var2, this.L);
      var2.N = var1.I() > 0;
      var2.y = var1.t();
   }

   public class01894 N(class08257 var1) {
      return i;
   }
}
