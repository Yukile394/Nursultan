package minecraft;

import org.jspecify.annotations.Nullable;

public class class05125 extends class05096 implements class05030 {
   @Nullable
   private class00392 N;
   @Nullable
   private class00392 y;
   private int L;
   private boolean u;
   private final boolean i;

   @Override
   public void L(class00392 var1) {
      this.y = var1;
      this.N(0);
   }

   public class05125(boolean var1) {
      super(class05153.N);
      this.i = var1;
   }

   @Override
   public void y(class00392 var1) {
      this.N = var1;
      this.L(class00392.L("menu.working"));
   }

   @Override
   public void N() {
      this.u = true;
   }

   @Override
   public void N(int var1) {
      this.L = var1;
   }

   @Override
   public void N(class00392 var1) {
      this.y(var1);
   }

   @Override
   public boolean method_25422() {
      return false;
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      if (this.u) {
         if (this.i) {
            this.field_22787.N(null);
         }
      } else {
         super.method_25394(var1, var2, var3, var4);
         if (this.N != null) {
            var1.N(this.field_22793, this.N, this.field_22789 / 2, 70, -1);
         }

         if (this.y != null && this.L != 0) {
            var1.N(this.field_22793, class00392.i().y(this.y).i(" " + this.L + "%"), this.field_22789 / 2, 90, -1);
         }
      }
   }

   @Override
   protected boolean method_48262() {
      return false;
   }
}
