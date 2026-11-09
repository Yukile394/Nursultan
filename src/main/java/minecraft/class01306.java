package minecraft;

import java.util.EnumSet;

class class01306 extends class07473 {
   @Override
   public void L() {
      this.N.N(false);
      this.N.M(false);
   }

   public class01306(class06165 var1) {
      super();
      this.N = var1;
      this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
   }

   @Override
   public void i() {
      class07438 class07438 = this.N.T();
      if (class07438 != null) {
         this.N.p().N(class07438, this.N.NR(), this.N.Ni());
         if (this.N.method_5858(class07438) <= 36.0) {
            this.N.E(true);
            this.N.U(true);
            this.N.f().W();
         } else {
            this.N.f().N(class07438, 1.5);
         }
      }
   }

   @Override
   public void u() {
      class07438 class07438 = this.N.T();
      if (class07438 != null && class06165.N(this.N, class07438)) {
         this.N.E(true);
         this.N.U(true);
         this.N.f().W();
         this.N.p().N(class07438, this.N.NR(), this.N.Ni());
      } else {
         this.N.E(false);
         this.N.U(false);
      }
   }

   @Override
   public boolean N() {
      if (this.N.method_6113()) {
         return false;
      } else {
         class07438 class07438 = this.N.T();
         return class07438 != null
            && class07438.method_5805()
            && class06165.i.test(class07438)
            && this.N.method_5858(class07438) > 36.0
            && !this.N.method_18276()
            && !this.N.d()
            && !class06165.N(this.N);
      }
   }
}
