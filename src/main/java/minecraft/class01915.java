package minecraft;

public class class01915 implements class04417<class07134> {
   private final class06143 N;

   public class01915(class06143 var1) {
      super();
      this.N = var1;
   }

   public class04406 method_3090(
      class07134 var1, class03448 var2, double var3, double var5, double var7, double var9, double var11, double var13, class06069 var15
   ) {
      double d0 = var15.z() * -1.9 * var15.z() * 0.1;
      class01902 class01902 = new class01902(var2, var3, var5, var7, 0.0, d0, 0.0, this.N.method_18139(var15));
      class01902.method_74305(0.1F, 0.1F, 0.3F);
      class01902.method_3080(0.001F, 0.001F);
      return class01902;
   }
}
