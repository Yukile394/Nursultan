package minecraft;

import java.util.EnumSet;

public class class07983 extends class07473 {
   private final class07079 N;
   private class07438 y;
   private int L;

   public class07983(class07079 var1) {
      super();
      this.N = var1;
      this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
   }

   @Override
   public boolean B() {
      return true;
   }

   @Override
   public void i() {
      this.N.p().N(this.y, 30.0F, 30.0F);
      double d0 = this.N.method_17681() * 2.0F * (this.N.method_17681() * 2.0F);
      double d1 = this.N.method_5649(this.y.method_23317(), this.y.method_23318(), this.y.method_23321());
      double d2 = 0.8;
      if (d1 > d0 && d1 < 16.0) {
         d2 = 1.33;
      } else if (d1 < 225.0) {
         d2 = 0.6;
      }

      this.N.f().N(this.y, d2);
      this.L = Math.max(this.L - 1, 0);
      if (!(d1 > d0)) {
         if (this.L <= 0) {
            this.L = 20;
            this.N.method_6121(N(this.N), this.y);
         }
      }
   }

   @Override
   public void u() {
      this.y = null;
      this.N.f().W();
   }

   @Override
   public boolean y() {
      if (!this.y.method_5805()) {
         return false;
      } else {
         return this.N.method_5858(this.y) > 225.0 ? false : !this.N.f().U() || this.N();
      }
   }

   @Override
   public boolean N() {
      class07438 class07438 = this.N.T();
      if (class07438 == null) {
         return false;
      } else {
         this.y = class07438;
         return true;
      }
   }
}
