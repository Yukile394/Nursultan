package minecraft;

public class class05553 implements class04417<class07134> {
   private final class06143 N;

   public class05553(class06143 var1) {
      super();
      this.N = var1;
   }

   public class04406 method_3090(
      class07134 var1, class03448 var2, double var3, double var5, double var7, double var9, double var11, double var13, class06069 var15
   ) {
      class05571 class05571 = new class05571(var2, var3, var5, var7, 0.5 - var15.U(), var11, 0.5 - var15.U(), this.N);
      if (var15.Z()) {
         class05571.method_74305(0.6F, 1.0F, 0.8F);
      } else {
         class05571.method_74305(0.08F, 0.4F, 0.4F);
      }

      class05571.field_3869 *= 0.2F;
      if (var9 == 0.0 && var13 == 0.0) {
         class05571.field_3852 *= 0.1F;
         class05571.field_3850 *= 0.1F;
      }

      class05571.method_3077((int)(8.0 / (var15.U() * 0.8 + 0.2)));
      return class05571;
   }
}
