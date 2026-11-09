package minecraft;

public abstract class class04404 extends class05848 {
   protected final class06143 N;
   private float y;
   private float L;
   private float u;
   private boolean i;

   protected class04404(class03448 var1, double var2, double var4, double var6, class06143 var8, float var9) {
      super(var1, var2, var4, var6, var8.method_74304());
      this.field_28786 = 0.91F;
      this.field_3844 = var9;
      this.N = var8;
   }

   public void y(int var1) {
      this.y = ((var1 & 0xFF0000) >> 16) / 255.0F;
      this.L = ((var1 & 0xFF00) >> 8) / 255.0F;
      this.u = ((var1 & 0xFF) >> 0) / 255.0F;
      this.i = true;
   }

   public void N(int var1) {
      float f = ((var1 & 0xFF0000) >> 16) / 255.0F;
      float f1 = ((var1 & 0xFF00) >> 8) / 255.0F;
      float f2 = ((var1 & 0xFF) >> 0) / 255.0F;
      float f3 = 1.0F;
      this.method_74305(f * 1.0F, f1 * 1.0F, f2 * 1.0F);
   }

   @Override
   public class05846 method_74255() {
      return class05846.u;
   }

   @Override
   public int method_3068(float var1) {
      return 15728880;
   }

   @Override
   public void method_3070() {
      super.method_3070();
      this.method_74306(this.N);
      if (this.field_3866 > this.field_3847 / 2) {
         this.method_74308(1.0F - ((float)this.field_3866 - this.field_3847 / 2) / this.field_3847);
         if (this.i) {
            this.field_62633 = this.field_62633 + (this.y - this.field_62633) * 0.2F;
            this.field_62634 = this.field_62634 + (this.L - this.field_62634) * 0.2F;
            this.field_62635 = this.field_62635 + (this.u - this.field_62635) * 0.2F;
         }
      }
   }
}
