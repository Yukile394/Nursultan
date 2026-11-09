package minecraft;

import java.util.Locale;

public class class03143 extends class03106 {
   private long M = 0L;
   private long B = 0L;
   private long Z = 0L;
   private long z = 0L;
   private boolean U = false;
   private final class02796 E;

   public boolean L() {
      if (this.M > 0L) {
         this.s();
         return true;
      } else {
         return false;
      }
   }

   private void P() {
      this.E.Nm().N(class03124.N(this));
   }

   public class03143(class02796 var1) {
      super();
      this.E = var1;
   }

   public void i() {
      this.Z = this.Z + (System.nanoTime() - this.B);
   }

   private void s() {
      long i = this.z - this.M;
      double d0 = Math.max(1.0, (double)this.Z) / class01517.y;
      int j = (int)(class01517.L * i / d0);
      String s = String.format(Locale.ROOT, "%.2f", i == 0L ? this.M() : d0 / i);
      this.z = 0L;
      this.Z = 0L;
      this.E.yu().N(() -> class00392.N("commands.tick.sprint.report", j, s), true);
      this.M = 0L;
      this.N(this.U);
      this.E.Nd();
   }

   private void m() {
      this.E.Nm().N(class03132.N(this));
   }

   public boolean u() {
      if (!this.i) {
         return false;
      } else if (this.M > 0L) {
         this.B = System.nanoTime();
         this.M--;
         return true;
      } else {
         this.s();
         return false;
      }
   }

   public boolean y() {
      if (this.u > 0) {
         this.u = 0;
         this.P();
         return true;
      } else {
         return false;
      }
   }

   public boolean y(int var1) {
      boolean flag = this.M > 0L;
      this.Z = 0L;
      this.z = var1;
      this.M = var1;
      this.U = this.E();
      this.N(false);
      return flag;
   }

   public void N(class04770 var1) {
      var1.field_13987.method_14364(class03132.N(this));
      var1.field_13987.method_14364(class03124.N(this));
   }

   @Override
   public void N(float var1) {
      super.N(var1);
      this.E.Nd();
      this.m();
   }

   @Override
   public void N(boolean var1) {
      super.N(var1);
      this.m();
   }

   public boolean N() {
      return this.z > 0L;
   }

   public boolean N(int var1) {
      if (!this.E()) {
         return false;
      } else {
         this.u = var1;
         this.P();
         return true;
      }
   }
}
