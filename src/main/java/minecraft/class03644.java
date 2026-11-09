package minecraft;

public class class03644 extends class05848 {
   private float N;

   public class03644(class03448 var1, double var2, double var4, double var6, class08388 var8) {
      super(var1, var2, var4, var6, var8);
      this.field_3847 = (int)(this.field_3840.z() * 60.0F) + 30;
      this.field_3862 = false;
      this.field_3852 = 0.0;
      this.field_3869 = -0.05;
      this.field_3850 = 0.0;
      this.method_3080(0.02F, 0.02F);
      this.field_17867 = this.field_17867 * (this.field_3840.z() * 0.6F + 0.2F);
      this.field_3844 = 0.002F;
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
         float f = 0.6F;
         this.field_3852 = this.field_3852 + 0.6F * class04995.P(this.N);
         this.field_3850 = this.field_3850 + 0.6F * class04995.m(this.N);
         this.field_3852 *= 0.07;
         this.field_3850 *= 0.07;
         this.method_3069(this.field_3852, this.field_3869, this.field_3850);
         if (!this.field_3851.method_8316(class07209.method_49637(this.field_3874, this.field_3854, this.field_3871)).N(class01231.N) || this.field_3845) {
            this.method_3085();
         }

         this.N += 0.08F;
      }
   }
}
