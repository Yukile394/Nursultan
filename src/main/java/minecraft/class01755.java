package minecraft;

public class class01755 extends class01533 {
   private static final int N = 12235202;

   public class01755(class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12, float var14, class06143 var15) {
      super(var1, var2, var4, var6, 0.7F, 0.6F, 0.7F, var8, var10 + 0.15F, var12, var14, var15, 0.5F, 7, 0.5F, false);
      float f = this.field_3840.z() * 0.2F;
      this.field_62633 = class02566.L(12235202) / 255.0F - f;
      this.field_62634 = class02566.u(12235202) / 255.0F - f;
      this.field_62635 = class02566.i(12235202) / 255.0F - f;
   }

   @Override
   public void method_3070() {
      this.field_3844 = 0.88F * this.field_3844;
      this.field_28786 = 0.92F * this.field_28786;
      super.method_3070();
   }
}
