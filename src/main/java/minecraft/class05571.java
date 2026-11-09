package minecraft;

public class class05571 extends class05848 {
   private final class06143 N;

   class05571(class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12, class06143 var14) {
      super(var1, var2, var4, var6, var8, var10, var12, var14.method_74304());
      this.field_28786 = 0.96F;
      this.field_28787 = true;
      this.N = var14;
      this.field_17867 *= 0.75F;
      this.field_3862 = false;
      this.method_74306(var14);
   }

   @Override
   public class05846 method_74255() {
      return class05846.u;
   }

   @Override
   public int method_3068(float var1) {
      float f = (this.field_3866 + var1) / this.field_3847;
      f = class04995.N(f, 0.0F, 1.0F);
      int i = super.method_3068(var1);
      int j = i & 0xFF;
      int k = i >> 16 & 0xFF;
      j += (int)(f * 15.0F * 16.0F);
      if (j > 240) {
         j = 240;
      }

      return j | k << 16;
   }

   @Override
   public void method_3070() {
      super.method_3070();
      this.method_74306(this.N);
   }
}
