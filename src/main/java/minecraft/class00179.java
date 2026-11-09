package minecraft;

public class class00179 extends class00155 {
   private static final float m = 0.0F;
   private static final float P = 1.0F;
   private static final float s = 0.7F;
   private static final float T = 0.5F;
   private final class07549 b;

   @Override
   public void P() {
      if (!this.b.method_31481() && this.b.T() == null) {
         this.R = (float)this.b.method_23317();
         this.M = (float)this.b.method_23318();
         this.B = (float)this.b.method_23321();
         float f = this.b.R(0.0F);
         this.u = 0.0F + 1.0F * f * f;
         this.i = 0.7F + 0.5F * f;
      } else {
         this.y();
      }
   }

   public class00179(class07549 var1) {
      super(class04909.mZ, class04911.field_15251, class00044.v());
      this.b = var1;
      this.U = class00018.field_5478;
      this.Z = true;
      this.z = 0;
   }

   @Override
   public boolean s() {
      return !this.b.method_5701();
   }
}
