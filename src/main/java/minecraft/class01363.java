package minecraft;

class class01363 extends class07969 {
   private final class01377 M;

   class01363(class01377 var1, double var2) {
      super(var1, var2, 8, 2);
      this.M = var1;
   }

   @Override
   public class07209 U() {
      return this.i;
   }

   @Override
   public boolean y() {
      return !this.M.method_5771() && this.N(this.M.method_73183(), this.i);
   }

   @Override
   public boolean E() {
      return this.u % 20 == 0;
   }

   @Override
   protected boolean N(class05487 var1, class07209 var2) {
      return var1.method_8320(var2).N(class00869.V) && var1.method_8320(var2.method_10084()).N(class08791.field_50);
   }

   @Override
   public boolean N() {
      return !this.M.method_5771() && super.N();
   }
}
