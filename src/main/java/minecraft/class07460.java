package minecraft;

public class class07460 extends class07458 {
   private final int N;
   private final boolean W;

   public class07460(class07079 var1, int var2, boolean var3) {
      super(var1);
      this.N = var2;
      this.W = var3;
   }

   @Override
   public void N() {
      if (this.E == class07435.field_6378) {
         this.E = class07435.field_6377;
         this.i.method_5875(true);
         double d0 = this.R - this.i.method_23317();
         double d1 = this.M - this.i.method_23318();
         double d2 = this.B - this.i.method_23321();
         if (d0 * d0 + d1 * d1 + d2 * d2 < 2.5000003E-7F) {
            this.i.y(0.0F);
            this.i.N(0.0F);
            return;
         }

         float f = (float)(class04995.u(d2, d0) * 180.0F / (float)Math.PI) - 90.0F;
         this.i.method_36456(this.y(this.i.method_36454(), f, 90.0F));
         float f1;
         if (this.i.method_24828()) {
            f1 = (float)(this.Z * this.i.method_45325(class05298.l));
         } else {
            f1 = (float)(this.Z * this.i.method_45325(class05298.m));
         }

         this.i.method_6125(f1);
         double d3 = Math.sqrt(d0 * d0 + d2 * d2);
         if (Math.abs(d1) > 1.0E-5F || Math.abs(d3) > 1.0E-5F) {
            float f2 = (float)(-(class04995.u(d1, d3) * 180.0F / (float)Math.PI));
            this.i.method_36457(this.y(this.i.method_36455(), f2, this.N));
            this.i.y(d1 > 0.0 ? f1 : -f1);
         }
      } else {
         if (!this.W) {
            this.i.method_5875(false);
         }

         this.i.y(0.0F);
         this.i.N(0.0F);
      }
   }
}
