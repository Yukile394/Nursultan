package minecraft;

import java.util.EnumSet;

class class01290 extends class06137 {
   private static final int L = y(140);
   private int u;

   @Override
   public void L() {
      this.y.N(false);
      this.y.U(false);
      this.y.E(false);
      this.y.method_6100(false);
      this.y.Z(true);
      this.y.f().W();
      this.y.F().N(this.y.method_23317(), this.y.method_23318(), this.y.method_23321(), 0.0);
   }

   public class01290(class06165 var1) {
      super(var1);
      this.y = var1;
      this.u = class06165.y(var1).y(L);
      this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406, class07430.field_18407));
   }

   private boolean U() {
      if (this.u > 0) {
         this.u--;
         return false;
      } else {
         return this.y.method_73183().method_8530() && this.M() && !this.Z() && !this.y.field_27857;
      }
   }

   @Override
   public void u() {
      this.u = class06165.L(this.y).y(L);
      this.y.Y();
   }

   @Override
   public boolean y() {
      return this.U();
   }

   @Override
   public boolean N() {
      return this.y.fields_7212a028292fd3c078969e3ee4c71d9e8_0 == 0.0F
            && this.y.fields_7212a028292fd3c078969e3ee4c71d9e8_1 == 0.0F
            && this.y.fields_7212a028292fd3c078969e3ee4c71d9e8_2 == 0.0F
         ? this.U() || this.y.method_6113()
         : false;
   }
}
