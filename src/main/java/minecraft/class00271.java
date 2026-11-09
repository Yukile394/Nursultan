package minecraft;

public abstract class class00271 extends class06078<class08790> {
   private final class01686 N;
   private final class01686 y;

   public class00271(class01686 var1) {
      super(var1);
      this.N = var1.y("left_paddle");
      this.y = var1.y("right_paddle");
   }

   private static void N(float var0, int var1, class01686 var2) {
      var2.i = class04995.y((class04995.m(-var0) + 1.0F) / 2.0F, (float) (-Math.PI / 3), (float) (-Math.PI / 12));
      var2.R = class04995.y((class04995.m(-var0 + 1.0F) + 1.0F) / 2.0F, (float) (-Math.PI / 4), (float) (Math.PI / 4));
      if (var1 == 1) {
         var2.R = (float) Math.PI - var2.R;
      }
   }

   public void method_2819(class08790 var1) {
      super.method_2819(var1);
      N(var1.M, 0, this.N);
      N(var1.B, 1, this.y);
   }
}
