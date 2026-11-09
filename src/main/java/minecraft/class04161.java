package minecraft;

public class class04161 extends class08813 {
   private final class01590 N;
   private final class04230 y;

   public boolean L() {
      return super.method_44392();
   }

   public class04161(int var1, int var2, int var3, int var4, class00392 var5, class01590 var6) {
      super(var1, var2, var3, var4, var5);
      this.N = var6;
      this.y = new class04230(var5, var6).N(this.method_25368() - this.method_65512());
   }

   public void y() {
      if (!this.L()) {
         this.method_53533(this.method_44391() + this.method_65512());
      }
   }

   @Override
   public void method_25358(int var1) {
      super.method_25358(var1);
      this.y.N(this.method_25368() - this.method_65512());
   }

   @Override
   protected void method_44389(class01054 var1, int var2, int var3, float var4) {
      var1.i().pushMatrix();
      var1.i().translate(this.method_65513(), this.method_65514());
      this.y.method_25394(var1, var2, var3, var4);
      var1.i().popMatrix();
   }

   @Override
   protected void method_44386(class01054 var1) {
      super.method_44386(var1);
   }

   @Override
   protected int method_44391() {
      return this.y.method_25364();
   }

   @Override
   public void method_25355(class00392 var1) {
      super.method_25355(var1);
      this.y.method_25355(var1);
   }

   @Override
   protected void method_47399(class03428 var1) {
      var1.N(class03457.field_33788, this.method_25369());
   }

   @Override
   protected double method_44393() {
      return 9.0;
   }
}
