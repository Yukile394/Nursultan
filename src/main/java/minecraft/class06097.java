package minecraft;

import java.util.EnumSet;

public class class06097 extends class07969 {
   private final class07617 M;

   @Override
   public void L() {
      super.L();
      this.M.B(false);
   }

   public class06097(class07617 var1, double var2, int var4) {
      super(var1, var2, var4, 6);
      this.M = var1;
      this.R = -2;
      this.N_71(EnumSet.of(class07430.field_18407, class07430.field_18405));
   }

   @Override
   public void i() {
      super.i();
      this.M.B(false);
      if (!this.W()) {
         this.M.N(false);
      } else if (!this.M.W()) {
         this.M.N(true);
      }
   }

   @Override
   public void u() {
      super.u();
      this.M.N(false);
   }

   @Override
   protected boolean N(class05487 var1, class07209 var2) {
      return var1.R(var2.method_10084()) && var1.method_8320(var2).N(class01210.F);
   }

   @Override
   protected int N(class07475 var1) {
      return 40;
   }

   @Override
   public boolean N() {
      return this.M.NQ() && !this.M.NJ() && !this.M.W() && super.N();
   }
}
