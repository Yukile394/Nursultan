package minecraft;

public class class04805 extends class06078<class08467> {
   public static final class02415 N = class02415.N(0.5F);
   private final class01686 y;
   private final class01686 L;

   public class04805(class01686 var1) {
      super(var1);
      this.L = var1.y("left_wing");
      this.y = var1.y("right_wing");
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      class04834 class04834 = new class04834(1.0F);
      class04839.N(
         "left_wing",
         class04822.L().N(22, 0).N(-10.0F, 0.0F, 0.0F, 10.0F, 20.0F, 2.0F, class04834),
         class04838.N(5.0F, 0.0F, 0.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12))
      );
      class04839.N(
         "right_wing",
         class04822.L().N(22, 0).N().N(0.0F, 0.0F, 0.0F, 10.0F, 20.0F, 2.0F, class04834),
         class04838.N(-5.0F, 0.0F, 0.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12))
      );
      return class04806.N(class04792, 64, 32);
   }

   public void method_2819(class08467 var1) {
      super.method_2819(var1);
      this.L.L = var1.Z ? 3.0F : 0.0F;
      this.L.i = var1.q;
      this.L.M = var1.V;
      this.L.R = var1.K;
      this.y.R = -this.L.R;
      this.y.L = this.L.L;
      this.y.i = this.L.i;
      this.y.M = -this.L.M;
   }
}
