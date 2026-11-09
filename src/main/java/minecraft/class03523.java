package minecraft;

public class class03523 extends class06148 {
   public class03523(class03448 var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.field_3847 = 8;
   }

   @Override
   public void method_3070() {
      for (int i = 0; i < 6; i++) {
         double d0 = this.field_3874 + (this.field_3840.U() - this.field_3840.U()) * 4.0;
         double d1 = this.field_3854 + (this.field_3840.U() - this.field_3840.U()) * 4.0;
         double d2 = this.field_3871 + (this.field_3840.U() - this.field_3840.U()) * 4.0;
         this.field_3851.method_8406(class07107.l, d0, d1, d2, (float)this.field_3866 / this.field_3847, 0.0, 0.0);
      }

      this.field_3866++;
      if (this.field_3866 == this.field_3847) {
         this.method_3085();
      }
   }
}
