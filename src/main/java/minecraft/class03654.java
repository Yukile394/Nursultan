package minecraft;

public class class03654 implements class04417<class07134> {
   private final class06143 N;

   public class03654(class06143 var1) {
      super();
      this.N = var1;
   }

   public class04406 method_3090(
      class07134 var1, class03448 var2, double var3, double var5, double var7, double var9, double var11, double var13, class06069 var15
   ) {
      class04008 class04008 = new class04008(var2, var3, var5, var7, var9, var11, var13, this.N.method_18139(var15));
      class04008.method_74305(0.3F, 0.5F, 1.0F);
      class04008.method_74308(1.0F - var15.z() * 0.7F);
      class04008.method_3077(class04008.method_3082() / 2);
      return class04008;
   }
}
