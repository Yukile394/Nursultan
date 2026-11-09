package minecraft;

public class class08678 extends class00155 {
   private final class08036 m;
   private final class07049 P;
   private final boolean s;
   private final float T;
   private final float b;
   private final float j;

   @Override
   public void P() {
      if (this.P.method_31481() || !this.m.method_5765() || this.m.method_5854() != this.P) {
         this.y();
      } else if (this.T()) {
         this.u = this.T;
      } else {
         float f = this.b();
         if (f >= 0.01F && this.j()) {
            this.u = this.j * class04995.y(f, this.T, this.b);
         } else {
            this.u = this.T;
         }
      }
   }

   protected boolean T() {
      return this.s != this.P.method_5869();
   }

   public class08678(class08036 var1, class07049 var2, boolean var3, class04891 var4, class04911 var5, float var6, float var7, float var8) {
      super(var4, var5, class00044.v());
      this.m = var1;
      this.P = var2;
      this.s = var3;
      this.T = var6;
      this.b = var7;
      this.j = var8;
      this.U = class00018.field_5478;
      this.Z = true;
      this.z = 0;
      this.u = var6;
   }

   protected float b() {
      return (float)this.P.method_18798().M();
   }

   @Override
   public boolean s() {
      return !this.P.method_5701();
   }

   protected boolean j() {
      return true;
   }

   @Override
   public boolean w_() {
      return true;
   }
}
