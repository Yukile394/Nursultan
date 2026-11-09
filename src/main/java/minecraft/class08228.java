package minecraft;

final class class08228 implements class08222 {
   private final class03345 y;

   class08228(class08230 var1, class03345 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public class00734 y() {
      return this.y.L();
   }

   @Override
   public void N(class08239 var1, boolean var2, class01383 var3, int var4, int var5, boolean var6) {
      class00734 class00734 = this.y.L();
      if (var2 || var3.method_23093(this.N().L())) {
         var6 = var6 && this.N.N(class00734.N, class00734.y, class00734.L, class00734.u, class00734.i, class00734.R, var5);
         var1.visit(this, var2, var4, var6);
      }
   }

   @Override
   public class03345 N() {
      return this.y;
   }
}
