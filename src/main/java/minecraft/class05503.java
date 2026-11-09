package minecraft;

public abstract class class05503 extends class00155 {
   private static final float P = 0.0F;
   private static final float s = 1.2F;
   private static final float T = 0.0F;
   protected final class04626 m;
   private boolean b;

   @Override
   public void P() {
      if (this.j() && !this.N()) {
         class06202.Nq().Nr().N((class00034)this.b());
         this.b = true;
      }

      if (!this.m.method_31481() && !this.b) {
         this.R = (float)this.m.method_23317();
         this.M = (float)this.m.method_23318();
         this.B = (float)this.m.method_23321();
         float f = (float)this.m.method_18798().Z();
         if (f >= 0.01F) {
            this.i = class04995.B(class04995.N(f, this.n(), this.t()), this.n(), this.t());
            this.u = class04995.B(class04995.N(f, 0.0F, 0.5F), 0.0F, 1.2F);
         } else {
            this.i = 0.0F;
            this.u = 0.0F;
         }
      } else {
         this.y();
      }
   }

   public class05503(class04626 var1, class04891 var2, class04911 var3) {
      super(var2, var3, class00044.v());
      this.m = var1;
      this.R = (float)var1.method_23317();
      this.M = (float)var1.method_23318();
      this.B = (float)var1.method_23321();
      this.Z = true;
      this.z = 0;
      this.u = 0.0F;
   }

   protected abstract class00155 b();

   @Override
   public boolean s() {
      return !this.m.method_5701();
   }

   private float n() {
      return this.m.method_6109() ? 1.1F : 0.7F;
   }

   private float t() {
      return this.m.method_6109() ? 1.5F : 1.1F;
   }

   protected abstract boolean j();

   @Override
   public boolean w_() {
      return true;
   }
}
