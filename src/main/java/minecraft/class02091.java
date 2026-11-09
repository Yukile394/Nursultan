package minecraft;

public class class02091 extends class04230 {
   public static final int N = 4;
   private final int y;
   private final int L;
   private final boolean u;
   private final class02086 i;

   @Override
   protected int L() {
      return super.L() + this.y;
   }

   class02091(class00392 var1, class01590 var2, int var3, int var4, class02086 var5, boolean var6) {
      super(var1, var2);
      this.field_22763 = true;
      this.y = var3;
      this.L = var4;
      this.u = var6;
      this.i = var5;
      this.i();
      this.R();
      this.N(true);
   }

   public void i() {
      if (this.L != -1) {
         this.method_25358(this.L);
         this.N(this.L);
      } else {
         this.method_25358(this.Z().N(this.method_25369()) + this.y * 2);
      }
   }

   public int u() {
      return this.y;
   }

   @Override
   protected int y() {
      return this.method_46426() + this.y;
   }

   public static class02114 N(class00392 var0, class01590 var1) {
      return new class02114(var0, var1);
   }

   public static class02114 N(class00392 var0, class01590 var1, int var2) {
      return new class02114(var0, var1, var2);
   }

   @Override
   public class04230 N(int var1) {
      return super.N(var1 - this.y * 2);
   }

   public void R() {
      int ix = 9 * this.Z().L(this.method_25369(), super.method_25368()).size();
      this.method_53533(ix + this.y * 2);
   }

   @Override
   public int method_25364() {
      return this.field_22759;
   }

   @Override
   public int method_25368() {
      return this.field_22758;
   }

   @Override
   public void method_25355(class00392 var1) {
      this.field_22754 = var1;
      int ix;
      if (this.L != -1) {
         ix = this.L;
      } else {
         ix = this.Z().N(var1) + this.y * 2;
      }

      this.method_25358(ix);
      this.R();
   }

   @Override
   protected void method_47399(class03428 var1) {
      var1.N(class03457.field_33788, this.method_25369());
   }

   @Override
   public void method_25354(class09033 var1) {
   }

   @Override
   public void method_48579(class01054 var1, int var2, int var3, float var4) {
      int ix = this.u && !this.method_25370() ? class02566.N(this.field_22765, -6250336) : class02566.y(this.field_22765);
      switch (this.i) {
         case field_62117:
            var1.N(this.method_46426() + 1, this.method_46427(), this.method_55442(), this.method_55443(), class02566.L(this.field_22765));
            break;
         case field_62118:
            if (this.method_25370()) {
               var1.N(this.method_46426() + 1, this.method_46427(), this.method_55442(), this.method_55443(), class02566.L(this.field_22765));
            }
         case field_62119:
      }

      if (this.method_25370() || this.u) {
         var1.y(this.method_46426(), this.method_46427(), this.method_25368(), this.method_25364(), ix);
      }

      super.method_48579(var1, var2, var3, var4);
   }
}
