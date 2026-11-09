package minecraft;

public class class00125 extends class06478 {
   private final class06202 N;
   private final int y;
   private final int L;
   private final class06584 u;
   private final boolean i;
   private final boolean R;

   public class00125(class06202 var1, int var2, int var3, int var4, int var5, class00392 var6, class06584 var7, boolean var8, boolean var9) {
      super(0, 0, var4, var5, var6);
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var7;
      this.i = var8;
      this.R = var9;
   }

   protected void N(class01054 var1, int var2, int var3) {
      var1.y((class01590)this.N.i_3, this.u, var2, var3);
   }

   @Override
   protected void method_47399(class03428 var1) {
      var1.N(class03457.field_33788, class00392.N("narration.item", this.u.d()));
   }

   @Override
   protected void method_48579(class01054 var1, int var2, int var3, float var4) {
      var1.N(this.u, this.method_46426() + this.y, this.method_46427() + this.L, 0);
      if (this.i) {
         var1.N((class01590)this.N.i_3, this.u, this.method_46426() + this.y, this.method_46427() + this.L, null);
      }

      if (this.method_25370()) {
         var1.y(this.method_46426(), this.method_46427(), this.method_25368(), this.method_25364(), -1);
      }

      if (this.R && this.method_25367()) {
         this.N(var1, var2, var3);
      }
   }
}
