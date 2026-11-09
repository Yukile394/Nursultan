package minecraft;

public class class05386 extends class00155 {
   private int m;
   private int P;

   @Override
   public void P() {
      if (this.P < 0) {
         this.y();
      }

      this.P = this.P + this.m;
      this.u = class04995.N(this.P / 40.0F, 0.0F, 1.0F);
   }

   public class05386(class04891 var1) {
      super(var1, class04911.field_15256, class00044.v());
      this.Z = true;
      this.z = 0;
      this.u = 1.0F;
      this.E = true;
   }

   public void b() {
      this.P = Math.min(this.P, 40);
      this.m = -1;
   }

   public void j() {
      this.P = Math.max(0, this.P);
      this.m = 1;
   }
}
