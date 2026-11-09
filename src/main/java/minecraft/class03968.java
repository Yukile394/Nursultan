package minecraft;

public class class03968 extends class03986 {
   @Override
   public class03556<class07084> L() {
      return class07047.P;
   }

   public class03968() {
      super();
   }

   @Override
   public float N(class07438 var1, float var2, float var3) {
      class07055 class07055 = var1.method_6112(this.L());
      if (class07055 != null) {
         if (class07055.N(19)) {
            var2 = Math.max(class07055.u() / 20.0F, var2);
         } else {
            var2 = 1.0F;
         }
      }

      return var2;
   }

   @Override
   public void N(class03970 var1, class05363 var2, class03448 var3, float var4, class02233 var5) {
      class07049 class07049 = var2.B();
      if (class07049 instanceof class07438) {
         class07055 class07055 = ((class07438)class07049).method_6112(this.L());
         if (class07055 != null) {
            float f = class07055.y() ? 5.0F : class04995.B(Math.min(1.0F, class07055.u() / 20.0F), var4, 5.0F);
            var1.N = f * 0.25F;
            var1.L = f;
            var1.i = f * 0.8F;
            var1.R = f * 0.8F;
         }
      }
   }
}
