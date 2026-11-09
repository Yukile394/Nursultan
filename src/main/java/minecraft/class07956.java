package minecraft;

import java.util.EnumSet;

public class class07956 extends class07473 {
   private final class07079 N;
   private double y;
   private double L;
   private int u;

   @Override
   public void L() {
      double d0 = (Math.PI * 2) * this.N.method_59922().U();
      this.y = Math.cos(d0);
      this.L = Math.sin(d0);
      this.u = 20 + this.N.method_59922().y(20);
   }

   public class07956(class07079 var1) {
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
      this.u--;
      this.N.p().N(this.N.method_23317() + this.y, this.N.method_23320(), this.N.method_23321() + this.L);
   }

   @Override
   public boolean y() {
      return this.u >= 0;
   }

   @Override
   public boolean N() {
      return this.N.method_59922().z() < 0.02F;
   }
}
