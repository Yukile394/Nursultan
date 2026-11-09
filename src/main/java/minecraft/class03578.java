package minecraft;

public class class03578 extends class00155 {
   private static final float m = 1.0F;
   private static final float P = 1.0F;
   private final class01964 s;

   @Override
   public void P() {
      if (!this.s.method_31481() && this.s.T() == null && this.s.n()) {
         this.R = (float)this.s.method_23317();
         this.M = (float)this.s.method_23318();
         this.B = (float)this.s.method_23321();
         this.u = 1.0F;
         this.i = 1.0F;
      } else {
         this.y();
      }
   }

   public class03578(class01964 var1) {
      super(class04909.YH, class04911.field_15254, class00044.v());
      this.s = var1;
      this.U = class00018.field_5476;
      this.Z = false;
      this.z = 0;
   }

   @Override
   public boolean s() {
      return !this.s.method_5701();
   }
}
