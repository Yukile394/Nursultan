package minecraft;

public class class02942 extends class02795<class07894, class08285, class03091> {
   public class02942(class04832 var1) {
      super(var1, new class03091(var1.N(class04802.iT)), new class03091(var1.N(class04802.ij)), 0.5F);
      this.N(new class04255(this, var1.R(), var1.B()));
      this.N(new class08445(this));
   }

   public class08285 method_55269() {
      return new class08285();
   }

   public class01894 N(class08285 var1) {
      return var1.M;
   }

   public void method_62354(class07894 var1, class08285 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = var1.P_();
      var2.y = var1.Ng();
      var2.L = var1.n();
      var2.u = var1.R(var3);
      var2.i = var1.i(var3);
      var2.M = var1.m();
      var2.R = var1.u(var3);
      var2.B = var1.NQ() ? var1.t() : null;
      var2.Z = var1.NZ().t();
   }

   protected int M(class08285 var1) {
      float f = var1.R;
      return f == 1.0F ? -1 : class02566.N(1.0F, f, f, f);
   }
}
