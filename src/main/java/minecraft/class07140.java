package minecraft;

public class class07140 extends class07162 {
   public static class05300 M() {
      return class07150.Y().N(class05298.l, 0.2F);
   }

   @Override
   public boolean method_5809() {
      return false;
   }

   @Override
   public float method_5718() {
      return 1.0F;
   }

   public class07140(class07078<? extends class07140> var1, class07299 var2) {
      super(var1, var2);
   }

   @Override
   protected class07126 B() {
      return class07107.J;
   }

   @Override
   protected int Z() {
      return super.Z() * 4;
   }

   @Override
   protected class04891 n() {
      return class04909.Tq;
   }

   @Override
   protected float m() {
      return super.m() + 2.0F;
   }

   @Override
   protected class04891 v() {
      return this.G() ? class04909.TV : class04909.TK;
   }

   @Override
   protected void E() {
      this.u *= 0.9F;
   }

   @Override
   public void N(int var1, boolean var2) {
      super.N(var1, var2);
      this.method_5996(class05298.y).N(var1 * 3);
   }

   public static boolean N(class07078<class07140> var0, class07284 var1, class06113 var2, class07209 var3, class06069 var4) {
      return var1.y() != class07086.field_5801;
   }

   @Override
   protected boolean W() {
      return this.method_6034();
   }

   @Override
   public class04891 method_6002() {
      return this.G() ? class04909.Tj : class04909.TI;
   }

   @Override
   public void method_6043() {
      class06889 class06889 = this.method_18798();
      float f = this.t() * 0.1F;
      this.method_18800(class06889.M, this.method_6106() + f, class06889.Z);
      this.field_64356 = true;
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return this.G() ? class04909.To : class04909.TJ;
   }

   @Override
   public void method_6010(class03530<class04651> var1) {
      if (var1 == class01231.y) {
         class06889 class06889 = this.method_18798();
         this.method_18800(class06889.M, 0.22F + this.t() * 0.05F, class06889.Z);
         this.field_64356 = true;
      } else {
         super.method_6010(var1);
      }
   }
}
