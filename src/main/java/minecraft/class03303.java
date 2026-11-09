package minecraft;

public class class03303 extends class05848 {
   private final class04651 y;
   protected boolean N;

   protected void L() {
   }

   public class03303(class03448 var1, double var2, double var4, double var6, class04651 var8, class08388 var9) {
      super(var1, var2, var4, var6, var9);
      this.method_3080(0.01F, 0.01F);
      this.field_3844 = 0.06F;
      this.y = var8;
   }

   protected void y() {
      if (this.field_3847-- <= 0) {
         this.method_3085();
      }
   }

   protected class04651 N() {
      return this.y;
   }

   @Override
   public class05846 method_74255() {
      return class05846.L;
   }

   @Override
   public int method_3068(float var1) {
      return this.N ? 240 : super.method_3068(var1);
   }

   @Override
   public void method_3070() {
      this.field_3858 = this.field_3874;
      this.field_3838 = this.field_3854;
      this.field_3856 = this.field_3871;
      this.y();
      if (!this.field_3843) {
         this.field_3869 = this.field_3869 - this.field_3844;
         this.method_3069(this.field_3852, this.field_3869, this.field_3850);
         this.L();
         if (!this.field_3843) {
            this.field_3852 *= 0.98F;
            this.field_3869 *= 0.98F;
            this.field_3850 *= 0.98F;
            if (this.y != class04684.N) {
               class07209 class07209 = class07209.method_49637(this.field_3874, this.field_3854, this.field_3871);
               class04688 class04688 = this.field_3851.method_8316(class07209);
               if (class04688.N() == this.y && this.field_3854 < class07209.method_10264() + class04688.N(this.field_3851, class07209)) {
                  this.method_3085();
               }
            }
         }
      }
   }
}
