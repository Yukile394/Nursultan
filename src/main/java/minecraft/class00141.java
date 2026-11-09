package minecraft;

public class class00141 extends class00155 {
   public static final int m = 20;
   private final class04453 P;
   private int s;

   @Override
   public void P() {
      this.s++;
      if (!this.P.method_31481() && (this.s <= 20 || this.P.method_6128())) {
         this.R = (float)this.P.method_23317();
         this.M = (float)this.P.method_23318();
         this.B = (float)this.P.method_23321();
         float f = (float)this.P.method_18798().B();
         if (f >= 1.0E-7) {
            this.u = class04995.N(f / 4.0F, 0.0F, 1.0F);
         } else {
            this.u = 0.0F;
         }

         if (this.s < 20) {
            this.u = 0.0F;
         } else if (this.s < 40) {
            this.u = this.u * ((this.s - 20) / 20.0F);
         }

         float f1 = 0.8F;
         if (this.u > 0.8F) {
            this.i = 1.0F + (this.u - 0.8F);
         } else {
            this.i = 1.0F;
         }
      } else {
         this.y();
      }
   }

   public class00141(class04453 var1) {
      super(class04909.zg, class04911.field_15248, class00044.v());
      this.P = var1;
      this.Z = true;
      this.z = 0;
      this.u = 0.1F;
   }
}
