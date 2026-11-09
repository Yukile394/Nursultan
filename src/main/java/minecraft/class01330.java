package minecraft;

import java.util.EnumSet;

class class01330 extends class06137 {
   private double L;
   private double u;
   private int i;
   private int R;

   @Override
   public void L() {
      this.U();
      this.R = 2 + this.y.method_59922().y(3);
      this.y.N(true);
      this.y.f().W();
   }

   public class01330(class06165 var1) {
      super(var1);
      this.y = var1;
      this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
   }

   @Override
   public void i() {
      this.i--;
      if (this.i <= 0) {
         this.R--;
         this.U();
      }

      this.y.p().N(this.y.method_23317() + this.L, this.y.method_23320(), this.y.method_23321() + this.u, this.y.NR(), this.y.Ni());
   }

   private void U() {
      double d0 = (Math.PI * 2) * this.y.method_59922().U();
      this.L = Math.cos(d0);
      this.u = Math.sin(d0);
      this.i = this.N(80 + this.y.method_59922().y(20));
   }

   @Override
   public void u() {
      this.y.N(false);
   }

   @Override
   public boolean y() {
      return this.R > 0;
   }

   @Override
   public boolean N() {
      return this.y.method_6065() == null
         && this.y.method_59922().z() < 0.02F
         && !this.y.method_6113()
         && this.y.T() == null
         && this.y.f().U()
         && !this.Z()
         && !this.y.G()
         && !this.y.method_18276();
   }
}
