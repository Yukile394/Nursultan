package minecraft;

public class class01844 extends class05848 {
   private final class06143 N;

   public class01844(class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12, class06143 var14) {
      super(var1, var2, var4, var6, var14.method_74304());
      this.N = var14;
      this.field_3847 = 4;
      this.field_3844 = 0.008F;
      this.field_3852 = var8;
      this.field_3869 = var10;
      this.field_3850 = var12;
      this.method_74306(var14);
   }

   @Override
   public class05846 method_74255() {
      return class05846.L;
   }

   @Override
   public void method_3070() {
      this.field_3858 = this.field_3874;
      this.field_3838 = this.field_3854;
      this.field_3856 = this.field_3871;
      if (this.field_3866++ >= this.field_3847) {
         this.method_3085();
      } else {
         this.field_3869 = this.field_3869 - this.field_3844;
         this.method_3069(this.field_3852, this.field_3869, this.field_3850);
         this.method_74306(this.N);
      }
   }
}
