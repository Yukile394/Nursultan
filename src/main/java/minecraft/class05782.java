package minecraft;

public class class05782 implements class04142<class07438> {
   private final int N;
   private final int y;
   private class05748 L = class05748.field_18337;
   private long u;

   public class05782(int var1, int var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public String method_46910() {
      return this.getClass().getSimpleName();
   }

   @Override
   public final void method_18925(class04782 var1, class07438 var2, long var3) {
      this.L = class05748.field_18337;
   }

   @Override
   public final void method_18923(class04782 var1, class07438 var2, long var3) {
      if (var3 > this.u) {
         this.method_18925(var1, var2, var3);
      }
   }

   @Override
   public class05748 method_18921() {
      return this.L;
   }

   @Override
   public final boolean method_18922(class04782 var1, class07438 var2, long var3) {
      this.L = class05748.field_18338;
      int i = this.N + var1.method_8409().y(this.y + 1 - this.N);
      this.u = var3 + i;
      return true;
   }
}
