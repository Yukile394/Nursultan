package minecraft;

class class07143 extends class07458 {
   private float N;
   private int W;
   private final class07162 m;
   private boolean P;

   public class07143(class07162 var1) {
      super(var1);
      this.m = var1;
      this.N = 180.0F * var1.method_36454() / (float) Math.PI;
   }

   @Override
   public void N() {
      this.i.method_36456(this.y(this.i.method_36454(), this.N, 90.0F));
      this.i.fields_4212a028292fd3c078969e3ee4c71d9e8_2 = this.i.method_36454();
      this.i.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = this.i.method_36454();
      if (this.E != class07435.field_6378) {
         this.i.N(0.0F);
      } else {
         this.E = class07435.field_6377;
         if (this.i.method_24828()) {
            this.i.method_6125((float)(this.Z * this.i.method_45325(class05298.l)));
            if (this.W-- <= 0) {
               this.W = this.m.Z();
               if (this.P) {
                  this.W /= 3;
               }

               this.m.A().y();
               if (this.m.l()) {
                  this.m.method_5783(this.m.n(), this.m.method_6107(), this.m.d());
               }
            } else {
               this.m.fields_7212a028292fd3c078969e3ee4c71d9e8_0 = 0.0F;
               this.m.fields_7212a028292fd3c078969e3ee4c71d9e8_2 = 0.0F;
               this.i.method_6125(0.0F);
            }
         } else {
            this.i.method_6125((float)(this.Z * this.i.method_45325(class05298.l)));
         }
      }
   }

   public void N(double var1) {
      this.Z = var1;
      this.E = class07435.field_6378;
   }

   public void N(float var1, boolean var2) {
      this.N = var1;
      this.P = var2;
   }
}
