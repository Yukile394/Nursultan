package minecraft;

class class04699 extends class05801 {
   private final double y;
   private final double L;

   public class04699(class04723 var1, int var2, int var3, int var4, int var5, float var6, float var7) {
      super(var2, var3, var4, 20, class05220.N, 0.0);
      this.N = var1;
      this.y = var6;
      this.L = var7;
      this.field_22753 = (class04995.N((float)var5, var6, var7) - var6) / (var7 - var6);
      this.method_25346();
   }

   @Override
   public void method_25344() {
      if (this.N.R.field_22763) {
         this.N.i = (int)class04995.u(class04995.N(this.field_22753, 0.0, 1.0), this.y, this.L);
      }
   }

   @Override
   protected void method_25346() {
      this.method_25355(class05220.N(class04723.L, (class00392)(this.N.i == 0 ? class05220.L : class00392.y(String.valueOf(this.N.i)))));
   }
}
