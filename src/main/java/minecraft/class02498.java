package minecraft;

public class class02498 extends class02840<class07871, class08466, class06078<class08800>> {
   private static final class01894 N = class01894.y("textures/entity/fish/pufferfish.png");
   private final class06078<class08800> i;
   private final class06078<class08800> R;
   private final class06078<class08800> M = this.L();

   public class02498(class04832 var1) {
      super(var1, new class02858(var1.N(class04802.LX)), 0.2F);
      this.R = new class02159(var1.N(class04802.La));
      this.i = new class02671(var1.N(class04802.Lp));
   }

   public class08466 method_55269() {
      return new class08466();
   }

   protected float u(class08466 var1) {
      return 0.1F + 0.1F * var1.N;
   }

   public void method_62354(class07871 var1, class08466 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = var1.v();
   }

   protected void y(class08466 var1, class01421 var2, float var3, float var4) {
      var2.N(0.0F, class04995.P(var1.P * 0.05F) * 0.08F, 0.0F);
      super.y(var1, var2, var3, var4);
   }

   public class01894 N(class08466 var1) {
      return N;
   }

   public void method_3936(class08466 var1, class01421 var2, class01237 var3, class06959 var4) {
      this.y = switch (var1.N) {
         case 0 -> this.i;
         case 1 -> this.R;
         default -> this.M;
      };
      super.method_3936(var1, var2, var3, var4);
   }
}
