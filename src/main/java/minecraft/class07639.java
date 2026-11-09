package minecraft;

public class class07639 extends class07623 {
   private boolean N;

   @Override
   protected class06889 L() {
      return new class06889(this.y.method_23317(), this.y.method_23323(0.5), this.y.method_23321());
   }

   public class07639(class07079 var1, class07299 var2) {
      super(var1, var2);
   }

   @Override
   public boolean u() {
      return false;
   }

   @Override
   protected boolean y() {
      return this.N || this.y.method_52535();
   }

   @Override
   public boolean N(class07209 var1) {
      return !this.L.method_8320(var1).t();
   }

   @Override
   public void N(boolean var1) {
   }

   @Override
   protected double N(class06889 var1) {
      return var1.B;
   }

   @Override
   protected boolean N(class06889 var1, class06889 var2) {
      return N(this.y, var1, var2, false);
   }

   @Override
   protected class07068 N(int var1) {
      this.N = this.y.method_5864() == class07078.e;
      this.s = new class00461(this.N);
      this.s.N(false);
      return new class07068(this.s, var1);
   }
}
