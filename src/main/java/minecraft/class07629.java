package minecraft;

import Nursultan.class10774;
import Nursultan.class10779;

public abstract class class07629 extends class07874 implements class05549 {
   private static final class02131<Boolean> N = class03289.N(class07629.class, class02154.U);
   private static final boolean y = false;

   public static class05300 M() {
      return class07079.H().N(class05298.n, 3.0);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(N, false);
   }

   @Override
   protected class04891 method_5737() {
      return class04909.UK;
   }

   @Override
   protected void method_5712(class07209 var1, class00500 var2) {
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("FromBucket", this.B());
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.N(var1.N("FromBucket", false));
   }

   public class07629(class07078<? extends class07629> var1, class07299 var2) {
      super(var1, var2);
      this.q = new class10774(this);
   }

   @Override
   public boolean B() {
      return this.field_6011.N(N);
   }

   protected abstract class04891 m();

   @Override
   public class04891 E() {
      return class04909.ul;
   }

   @Override
   public class07082 N(class08036 var1, class07050 var2) {
      return class05549.N(var1, var2, this).orElse(super.N(var1, var2));
   }

   @Override
   protected class07623 N(class07299 var1) {
      return new class07639(this, var1);
   }

   @Override
   public void N(class07001 var1) {
      class05549.N(this, var1);
   }

   @Override
   public boolean N(double var1) {
      return !this.B() && !this.method_16914();
   }

   @Override
   public void N(boolean var1) {
      this.field_6011.N(N, var1);
   }

   public boolean W() {
      return true;
   }

   @Override
   public boolean Nu() {
      return super.Nu() || this.B();
   }

   @Override
   protected void l_() {
      super.l_();
      this.e.N(0, new class07993(this, 1.25));
      this.e.N(2, new class07464<>(this, class08036.class, 8.0F, 1.6, 1.4, class07042.R));
      this.e.N(4, new class10779(this));
   }

   @Override
   public int n_() {
      return 8;
   }

   @Override
   public void e_(class06584 var1) {
      class05549.N(this, var1);
   }

   @Override
   public void method_6007() {
      if (!this.method_5799() && this.method_24828() && this.field_5992) {
         this.method_18799(this.method_18798().y((this.field_5974.z() * 2.0F - 1.0F) * 0.05F, 0.4F, (this.field_5974.z() * 2.0F - 1.0F) * 0.05F));
         this.method_24830(false);
         this.field_64356 = true;
         this.method_56078(this.m());
      }

      super.method_6007();
   }

   @Override
   public void method_76087(class06889 var1, double var2, boolean var4, double var5) {
      this.method_5724(0.01F, var1);
      this.method_5784(class07451.field_6308, this.method_18798());
      this.method_18799(this.method_18798().L(0.9));
      if (this.T() == null) {
         this.method_18799(this.method_18798().y(0.0, -0.005, 0.0));
      }
   }
}
