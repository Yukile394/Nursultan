package minecraft;

public class class03617 extends class05848 {
   public class03617(class03448 var1, double var2, double var4, double var6, class08388 var8) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0, var8);
      this.field_3852 *= 0.3F;
      this.field_3869 = this.field_3840.z() * 0.2F + 0.1F;
      this.field_3850 *= 0.3F;
      this.method_3080(0.01F, 0.01F);
      this.field_3844 = 0.06F;
      this.field_3847 = (int)(8.0 / (this.field_3840.z() * 0.8 + 0.2));
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
      if (this.field_3847-- <= 0) {
         this.method_3085();
      } else {
         this.field_3869 = this.field_3869 - this.field_3844;
         this.method_3069(this.field_3852, this.field_3869, this.field_3850);
         this.field_3852 *= 0.98F;
         this.field_3869 *= 0.98F;
         this.field_3850 *= 0.98F;
         if (this.field_3845) {
            if (this.field_3840.z() < 0.5F) {
               this.method_3085();
            }

            this.field_3852 *= 0.7F;
            this.field_3850 *= 0.7F;
         }

         class07209 class07209 = class07209.method_49637(this.field_3874, this.field_3854, this.field_3871);
         double d0 = Math.max(
            this.field_3851
               .method_8320(class07209)
               .M(this.field_3851, class07209)
               .method_1102(class07185.field_11052, this.field_3874 - class07209.method_10263(), this.field_3871 - class07209.method_10260()),
            (double)this.field_3851.method_8316(class07209).N(this.field_3851, class07209)
         );
         if (d0 > 0.0 && this.field_3854 < class07209.method_10264() + d0) {
            this.method_3085();
         }
      }
   }
}
