package minecraft;

public class class01768 extends class06148 {
   private final double N;
   private final int y;

   class01768(class03448 var1, double var2, double var4, double var6, double var8, int var10, int var11) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.N = var8;
      this.field_3847 = var10;
      this.y = var11;
   }

   @Override
   public void method_3070() {
      if (this.field_3866 % (this.y + 1) == 0) {
         for (int i = 0; i < 3; i++) {
            double d0 = this.field_3874 + (this.field_3840.U() - this.field_3840.U()) * this.N;
            double d1 = this.field_3854 + (this.field_3840.U() - this.field_3840.U()) * this.N;
            double d2 = this.field_3871 + (this.field_3840.U() - this.field_3840.U()) * this.N;
            this.field_3851.method_8406(class07107.d, d0, d1, d2, (float)this.field_3866 / this.field_3847, 0.0, 0.0);
         }
      }

      if (this.field_3866++ == this.field_3847) {
         this.method_3085();
      }
   }
}
