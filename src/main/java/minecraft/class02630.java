package minecraft;

public class class02630 extends class04507<class02626, class08810> {
   private static final float N = 40.0F;
   private static final int y = 50;
   private final class08943 L;
   private final class06069 u = class06069.u();

   protected class02630(class04832 var1) {
      super(var1);
      this.L = var1.y();
   }

   public void method_3936(class08810 var1, class01421 var2, class01237 var3, class06959 var4) {
      if (!var1.y.i()) {
         var2.N();
         if (var1.P <= 50.0F) {
            float f = Math.min(var1.P, 50.0F) / 50.0F;
            var2.y(f, f, f);
         }

         float f1 = class04995.R(var1.P * 40.0F);
         var2.N(class02058.u.N(f1));
         class02893.N(var2, var3, 15728880, var1, this.u);
         var2.y();
      }
   }

   public void method_62354(class02626 var1, class08810 var2, float var3) {
      super.method_62354(var1, var2, var3);
      class06584 class06584 = var1.y();
      var2.N(var1, class06584, this.L);
   }

   public class08810 method_55269() {
      return new class08810();
   }
}
