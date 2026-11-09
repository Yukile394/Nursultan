package minecraft;

public class class01800 extends class05848 {
   private final class06143 N;

   protected class01800(class03448 var1, double var2, double var4, double var6, class06143 var8) {
      super(var1, var2, var4, var6, var8.method_74304());
      this.N = var8;
      this.method_74306(var8);
      this.field_3847 = 12 + this.field_3840.y(4);
      this.field_17867 = 1.0F;
      this.method_3080(1.0F, 1.0F);
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
      if (this.field_3866++ >= this.field_3847) {
         this.method_3085();
      } else {
         this.method_74306(this.N);
      }
   }
}
