package minecraft;

public class class02838 extends class02795<class07617, class08796, class04660> {
   public class02838(class04832 var1) {
      super(var1, new class04660(var1.N(class04802.p)), new class04660(var1.N(class04802.F)), 0.4F);
      this.N(new class04667(this, var1.R()));
   }

   public class08796 method_55269() {
      return new class08796();
   }

   public class01894 N(class08796 var1) {
      return var1.N;
   }

   public void method_62354(class07617 var1, class08796 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = var1.B().N().y().y();
      var2.u = var1.method_18276();
      var2.i = var1.method_5624();
      var2.R = var1.Ng();
      var2.M = var1.u(var3);
      var2.B = var1.i(var3);
      var2.Z = var1.R(var3);
      var2.y = var1.G();
      var2.L = var1.NQ() ? var1.v() : null;
   }

   protected void y(class08796 var1, class01421 var2, float var3, float var4) {
      super.y(var1, var2, var3, var4);
      float f = var1.M;
      if (f > 0.0F) {
         var2.N(0.4F * f, 0.15F * f, 0.1F * f);
         var2.N(class02058.R.N(class04995.Z(f, 0.0F, 90.0F)));
         if (var1.y) {
            var2.N(0.15F * f, 0.0F, 0.0F);
         }
      }
   }
}
