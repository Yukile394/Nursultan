package minecraft;

public class class03998 extends class03986 {
   @Override
   public class03556<class07084> L() {
      return class07047.J;
   }

   public class03998() {
      super();
   }

   @Override
   public float N(class07438 var1, float var2, float var3) {
      class07055 class07055 = var1.method_6112(this.L());
      return class07055 != null ? Math.max(class07055.N(var1, var3), var2) : var2;
   }

   @Override
   public void N(class03970 var1, class05363 var2, class03448 var3, float var4, class02233 var5) {
      if (var2.B() instanceof class07438 class07438) {
         class07055 class07055 = class07438.method_6112(this.L());
         if (class07055 != null) {
            float f = class04995.B(class07055.N(class07438, var5.N(false)), var4, 15.0F);
            var1.N = f * 0.75F;
            var1.L = f;
            var1.i = f;
            var1.R = f;
         }
      }
   }
}
