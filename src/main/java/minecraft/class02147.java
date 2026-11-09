package minecraft;

public class class02147 extends class02149 {
   public static final float N = 8.0F;

   public class02147() {
      super();
   }

   @Override
   protected boolean u(class04782 var1, class07438 var2, class07438 var3) {
      return this.y(var2, var3) && var3.method_5799() && (this.y(var3) || this.N(var2, var3)) && class05355.y(var1, var2, var3);
   }

   private boolean y(class07438 var1, class07438 var2) {
      return var2.method_5858(var1) <= 64.0;
   }

   @Override
   protected class05378<class07438> y() {
      return class05378.Q;
   }

   private boolean y(class07438 var1) {
      return var1.method_5864().N(class01217.z);
   }

   private boolean N(class07438 var1, class07438 var2) {
      return !var1.method_18868().N(class05378.S) && var2.method_5864().N(class01217.U);
   }
}
