package minecraft;

public class class05051 implements class04417<class07134> {
   private final class06143 N;

   public class05051(class06143 var1) {
      super();
      this.N = var1;
   }

   public class04406 method_3090(
      class07134 var1, class03448 var2, double var3, double var5, double var7, double var9, double var11, double var13, class06069 var15
   ) {
      double d0 = var15.z() * -1.9 * var15.z() * 0.1;
      double d1 = var15.z() * -0.5 * var15.z() * 0.1 * 5.0;
      double d2 = var15.z() * -1.9 * var15.z() * 0.1;
      return new class05327(var2, var3, var5, var7, d0, d1, d2, 1.0F, this.N);
   }
}
