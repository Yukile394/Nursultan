package minecraft;

public class class07991 extends class07623 {
   @Override
   protected class06889 L() {
      return this.y.method_73189();
   }

   public class07991(class07079 var1, class07299 var2) {
      super(var1, var2);
   }

   @Override
   public boolean u() {
      return false;
   }

   @Override
   protected boolean y() {
      return this.s() && this.y.method_52535() || !this.y.method_5765();
   }

   @Override
   public boolean N(class07209 var1) {
      return this.L.method_8320(var1).y(this.L, var1, this.y);
   }

   @Override
   public void N() {
      this.R++;
      if (this.m) {
         this.B();
      }

      if (!this.U()) {
         if (this.y()) {
            this.z();
         } else if (this.u != null && !this.u.L()) {
            class06889 class06889x = this.u.N(this.y);
            if (this.y.method_31477() == class04995.N(class06889x.M)
               && this.y.method_31478() == class04995.N(class06889x.B)
               && this.y.method_31479() == class04995.N(class06889x.Z)) {
               this.u.N();
            }
         }

         if (!this.U()) {
            class06889 class06889 = this.u.N(this.y);
            this.y.F().N(class06889.M, class06889.B, class06889.Z, this.i);
         }
      }
   }

   @Override
   protected boolean N(class06889 var1, class06889 var2) {
      return N(this.y, var1, var2, true);
   }

   @Override
   public class00143 N(class07049 var1, int var2) {
      return this.N(var1.method_24515(), var2);
   }

   @Override
   protected class07068 N(int var1) {
      this.s = new class04525();
      return new class07068(this.s, var1);
   }
}
