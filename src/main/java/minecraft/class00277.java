package minecraft;

public abstract class class00277<T extends class06923> extends class01463<T> implements class05043 {
   private final class05306<?> N;
   private boolean y;

   protected boolean L() {
      return true;
   }

   public class00277(T var1, class05306<?> var2, class08044 var3, class00392 var4) {
      super((T)var1, var3, var4);
      this.N = var2;
   }

   @Override
   public void i() {
      this.N.Z();
   }

   @Override
   public void u() {
      super.u();
      this.N.i();
   }

   protected void y() {
   }

   @Override
   protected boolean N(int var1, int var2, int var3, int var4, double var5, double var7) {
      return (!this.y || !this.N.u()) && super.N(var1, var2, var3, var4, var5, var7);
   }

   @Override
   protected boolean N(double var1, double var3, int var5, int var6) {
      boolean flag = var1 < var5 || var3 < var6 || var1 >= var5 + this.B || var3 >= var6 + this.Z;
      return this.N.N(var1, var3, this.T, this.b, this.B, this.Z) && flag;
   }

   @Override
   protected void N(class06937 var1, int var2, int var3, class07510 var4) {
      super.N(var1, var2, var3, var4);
      this.N.y(var1);
   }

   @Override
   public void N(class00265 var1) {
      this.N.N(var1);
   }

   protected abstract class03283 N();

   @Override
   protected void N(class01054 var1, int var2, int var3) {
      super.N(var1, var2, var3);
      this.N.N(var1, this.L());
   }

   @Override
   public void method_25426() {
      super.method_25426();
      this.y = this.field_22789 < 379;
      this.N.N(this.field_22789, this.field_22790, this.field_22787, this.y);
      this.T = this.N.N(this.field_22789, this.B);
      this.R();
   }

   @Override
   public boolean method_25404(class06601 var1) {
      return this.N.method_25404(var1) ? true : super.method_25404(var1);
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      if (this.N.u() && this.y) {
         this.method_25420(var1, var2, var3, var4);
      } else {
         super.N(var1, var2, var3, var4);
      }

      var1.L();
      this.N.method_25394(var1, var2, var3, var4);
      var1.L();
      this.L(var1, var2, var3);
      this.N(var1);
      this.a_(var1, var2, var3);
      this.N.N(var1, var2, var3, this.s);
   }

   @Override
   public boolean method_25403(class06613 var1, double var2, double var4) {
      return this.N.method_25403(var1, var2, var4) ? true : super.method_25403(var1, var2, var4);
   }

   @Override
   public boolean method_25400(class06626 var1) {
      return this.N.method_25400(var1) ? true : super.method_25400(var1);
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      if (this.N.method_25402(var1, var2)) {
         this.method_25395(this.N);
         return true;
      } else {
         return this.y && this.N.u() ? true : super.method_25402(var1, var2);
      }
   }

   private void R() {
      class03283 class03283 = this.N();
      this.method_37063(new class04897(class03283.N(), class03283.y(), 20, 18, class05306.N, var1x -> {
         this.N.L();
         this.T = this.N.N(this.field_22789, this.B);
         class03283 class03283x = this.N();
         var1x.y(class03283x.N(), class03283x.y());
         this.y();
      }));
      this.method_25429(this.N);
   }
}
