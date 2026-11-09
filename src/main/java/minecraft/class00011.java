package minecraft;

public class class00011 extends class00155 {
   private static final float m = 0.0F;
   private static final float P = 0.7F;
   private static final float s = 0.0F;
   private static final float T = 1.0F;
   private static final float b = 0.0025F;
   private final class07504 j;
   private float v = 0.0F;

   @Override
   public void P() {
      if (this.j.method_31481()) {
         this.y();
      } else {
         this.R = (float)this.j.method_23317();
         this.M = (float)this.j.method_23318();
         this.B = (float)this.j.method_23321();
         float f = (float)this.j.method_18798().Z();
         boolean flag = !this.j.method_52172() && this.j.N() instanceof class02726;
         if (f >= 0.01F && this.j.method_73183().method_54719().Z() && !flag) {
            this.v = class04995.N(this.v + 0.0025F, 0.0F, 1.0F);
            this.u = class04995.B(class04995.N(f, 0.0F, 0.5F), 0.0F, 0.7F);
         } else {
            this.v = 0.0F;
            this.u = 0.0F;
         }
      }
   }

   public class00011(class07504 var1) {
      super(class04909.by, class04911.field_15254, class00044.v());
      this.j = var1;
      this.Z = true;
      this.z = 0;
      this.u = 0.0F;
      this.R = (float)var1.method_23317();
      this.M = (float)var1.method_23318();
      this.B = (float)var1.method_23321();
   }

   @Override
   public boolean s() {
      return !this.j.method_5701();
   }

   @Override
   public boolean w_() {
      return true;
   }
}
