package minecraft;

public class class04570 extends class05848 {
   private final class06143 N;

   public class04570(class03448 var1, double var2, double var4, double var6, double var8, class06143 var10) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0, var10.method_74304());
      this.N = var10;
      this.field_3847 = 4;
      float f = this.field_3840.z() * 0.6F + 0.4F;
      this.field_62633 = f;
      this.field_62634 = f;
      this.field_62635 = f;
      this.field_17867 = 1.0F - (float)var8 * 0.5F;
      this.method_74306(var10);
   }

   @Override
   public class05846 method_74255() {
      return class05846.L;
   }

   @Override
   public int method_3068(float var1) {
      return 15728880;
   }

   @Override
   public void method_3070() {
      this.field_3858 = this.field_3874;
      this.field_3838 = this.field_3854;
      this.field_3856 = this.field_3871;
      if (this.field_3866++ >= this.field_3847) {
         this.method_3085();
      } else {
         this.method_74306(this.N);
      }
   }
}
