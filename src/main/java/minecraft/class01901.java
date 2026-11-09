package minecraft;

public class class01901 extends class05848 {
   private final class06143 N;

   class01901(class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12, class06143 var14) {
      super(var1, var2, var4, var6, var8, var10, var12, var14.method_74304());
      this.field_28786 = 0.96F;
      this.N = var14;
      this.method_3087(1.0F);
      this.field_3862 = false;
      this.method_74306(var14);
   }

   @Override
   public class05846 method_74255() {
      return class05846.u;
   }

   @Override
   public int method_3068(float var1) {
      return 240;
   }

   @Override
   public void method_3070() {
      super.method_3070();
      this.method_74306(this.N);
   }
}
