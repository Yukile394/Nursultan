package minecraft;

class class07647 extends class07989 {
   private final class07637 N;

   public class07647(class07637 var1, Class<?>... var2) {
      super(var1, var2);
      this.N = var1;
   }

   @Override
   public boolean y() {
      if (!this.N.L && !this.N.u) {
         return super.y();
      } else {
         this.N.y(null);
         return false;
      }
   }

   @Override
   protected void N(class07079 var1, class07438 var2) {
      if (var1 instanceof class07637 && var1.Nl()) {
         var1.y(var2);
      }
   }
}
