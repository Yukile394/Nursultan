package minecraft;

import org.joml.Quaternionf;

public class class04006 extends class05848 {
   private static final float N = 1.0472F;
   private int y;

   class04006(class03448 var1, double var2, double var4, double var6, int var8, class08388 var9) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0, var9);
      this.field_17867 = 0.85F;
      this.y = var8;
      this.field_3847 = 30;
      this.field_3844 = 0.0F;
      this.field_3852 = 0.0;
      this.field_3869 = 0.1;
      this.field_3850 = 0.0;
   }

   @Override
   public class05846 method_74255() {
      return class05846.u;
   }

   @Override
   public void method_3074(class00965 var1, class05363 var2, float var3) {
      if (this.y <= 0) {
         this.field_62636 = 1.0F - class04995.N((this.field_3866 + var3) / this.field_3847, 0.0F, 1.0F);
         Quaternionf quaternionf = new Quaternionf();
         quaternionf.rotationX(-1.0472F);
         this.method_60373(var1, var2, quaternionf, var3);
         quaternionf.rotationYXZ((float) -Math.PI, 1.0472F, 0.0F);
         this.method_60373(var1, var2, quaternionf, var3);
      }
   }

   @Override
   public int method_3068(float var1) {
      return 240;
   }

   @Override
   public void method_3070() {
      if (this.y > 0) {
         this.y--;
      } else {
         super.method_3070();
      }
   }

   @Override
   public float method_18132(float var1) {
      return this.field_17867 * class04995.N((this.field_3866 + var1) / this.field_3847 * 0.75F, 0.0F, 1.0F);
   }
}
