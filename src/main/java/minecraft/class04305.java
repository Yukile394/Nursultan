package minecraft;

public class class04305 extends class05848 {
   class04305(class03448 var1, double var2, double var4, double var6, class08388 var8) {
      super(var1, var2, var4, var6, var8);
      this.field_3847 = 4;
   }

   @Override
   public class05846 method_74255() {
      return class05846.u;
   }

   @Override
   public void method_3074(class00965 var1, class05363 var2, float var3) {
      this.method_74308(0.6F - (this.field_3866 + var3 - 1.0F) * 0.25F * 0.5F);
      super.method_3074(var1, var2, var3);
   }

   @Override
   public float method_18132(float var1) {
      return 7.1F * class04995.m((this.field_3866 + var1 - 1.0F) * 0.25F * (float) Math.PI);
   }
}
