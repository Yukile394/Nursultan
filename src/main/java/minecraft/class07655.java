package minecraft;

public class class07655 extends class07623 {
   private boolean N;
   private boolean T;

   @Override
   protected class06889 L() {
      return new class06889(this.y.method_23317(), this.j(), this.y.method_23321());
   }

   public void L(boolean var1) {
      this.N = var1;
   }

   public class07655(class07079 var1, class07299 var2) {
      super(var1, var2);
   }

   public void i(boolean var1) {
      this.T = var1;
   }

   @Override
   protected void m() {
      super.m();
      if (this.N) {
         if (this.L.N_17(class07209.method_49637(this.y.method_23317(), this.y.method_23318() + 0.5, this.y.method_23321()))) {
            return;
         }

         for (int i = 0; i < this.u.i(); i++) {
            class01763 class01763 = this.u.N(i);
            if (this.L.N_17(new class07209(class01763.N, class01763.y, class01763.L))) {
               this.u.y(i);
               return;
            }
         }
      }
   }

   private int j() {
      if (this.y.method_5799() && this.s()) {
         int i = this.y.method_31478();
         class00500 class00500 = this.L.method_8320(class07209.method_49637(this.y.method_23317(), i, this.y.method_23321()));
         int j = 0;

         while (class00500.N(class00869.K)) {
            class00500 = this.L.method_8320(class07209.method_49637(this.y.method_23317(), ++i, this.y.method_23321()));
            if (++j > 16) {
               return this.y.method_31478();
            }
         }

         return i;
      } else {
         return class04995.N(this.y.method_23318() + 0.5);
      }
   }

   public void u(boolean var1) {
      this.s.u(var1);
   }

   @Override
   public boolean u() {
      return true;
   }

   protected boolean y(class04425 var1) {
      if (var1 == class04425.field_18) {
         return false;
      } else {
         return var1 == class04425.field_14 ? false : var1 != class04425.field_7;
      }
   }

   @Override
   protected boolean y() {
      return this.y.method_24828() || this.y.method_52535() || this.y.method_5765();
   }

   @Override
   public class00143 N(class07209 var1, int var2) {
      class00570 class00570 = this.L.method_8398().N(class01296.N(var1.method_10263()), class01296.N(var1.method_10260()));
      if (class00570 == null) {
         return null;
      } else {
         if (!this.T) {
            var1 = this.N(class00570, var1, var2);
         }

         return super.N(var1, var2);
      }
   }

   public final class07209 N(class00570 var1, class07209 var2, int var3) {
      if (var1.method_8320((class07209)var2).P()) {
         class07218 class07218x = ((class07209)var2).method_25503().N(class07211.field_11033);

         while (class07218x.method_10264() >= this.L.method_31607() && var1.method_8320(class07218x).P()) {
            class07218x.N(class07211.field_11033);
         }

         if (class07218x.method_10264() >= this.L.method_31607()) {
            return class07218x.method_10084();
         }

         class07218x.method_10099(((class07209)var2).method_10264() + 1);

         while (class07218x.method_10264() <= this.L.method_31600() && var1.method_8320(class07218x).P()) {
            class07218x.N(class07211.field_11036);
         }

         var2 = class07218x;
      }

      if (!var1.method_8320((class07209)var2).B()) {
         return (class07209)var2;
      } else {
         class07218 class07218 = ((class07209)var2).method_25503().N(class07211.field_11036);

         while (class07218.method_10264() <= this.L.method_31600() && var1.method_8320(class07218).B()) {
            class07218.N(class07211.field_11036);
         }

         return class07218.method_10062();
      }
   }

   @Override
   protected class07068 N(int var1) {
      this.s = new class07955();
      return new class07068(this.s, var1);
   }

   @Override
   public class00143 N(class07049 var1, int var2) {
      return this.N(var1.method_24515(), var2);
   }
}
