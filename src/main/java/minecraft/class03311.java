package minecraft;

public class class03311 extends class03303 {
   private final class07126 y;

   @Override
   protected void L() {
      this.field_3852 *= 0.02;
      this.field_3869 *= 0.02;
      this.field_3850 *= 0.02;
   }

   public class03311(class03448 var1, double var2, double var4, double var6, class04651 var8, class07126 var9, class08388 var10) {
      super(var1, var2, var4, var6, var8, var10);
      this.y = var9;
      this.field_3844 *= 0.02F;
      this.field_3847 = 40;
   }

   @Override
   protected void y() {
      if (this.field_3847-- <= 0) {
         this.method_3085();
         this.field_3851.method_8406(this.y, this.field_3874, this.field_3854, this.field_3871, this.field_3852, this.field_3869, this.field_3850);
      }
   }
}
