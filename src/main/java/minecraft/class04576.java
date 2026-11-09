package minecraft;

public class class04576 extends class05848 {
   private final float N;
   private final float y;
   private final class05846 L;

   class04576(class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12, class08388 var14) {
      this(var1, var2, var4, var6, var14);
      this.field_3852 *= 0.1F;
      this.field_3869 *= 0.1F;
      this.field_3850 *= 0.1F;
      this.field_3852 += var8;
      this.field_3869 += var10;
      this.field_3850 += var12;
   }

   public class04576(class03448 var1, double var2, double var4, double var6, class08388 var8) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0, var8);
      this.field_3844 = 1.0F;
      this.field_17867 /= 2.0F;
      this.N = this.field_3840.z() * 3.0F;
      this.y = this.field_3840.z() * 3.0F;
      this.L = var8.method_45852().equals(class08626.N) ? class05846.N : class05846.y;
   }

   @Override
   public class05846 method_74255() {
      return this.L;
   }

   @Override
   protected float method_18133() {
      return this.field_62632.method_4580((this.N + 1.0F) / 4.0F);
   }

   @Override
   protected float method_18134() {
      return this.field_62632.method_4580(this.N / 4.0F);
   }

   @Override
   protected float method_18136() {
      return this.field_62632.method_4570((this.y + 1.0F) / 4.0F);
   }

   @Override
   protected float method_18135() {
      return this.field_62632.method_4570(this.y / 4.0F);
   }
}
