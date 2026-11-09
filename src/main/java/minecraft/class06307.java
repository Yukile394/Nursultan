package minecraft;

import org.jspecify.annotations.Nullable;

public class class06307 extends class05096 {
   @Nullable
   private class02091 N;

   public class06307(class00392 var1) {
      super(var1);
   }

   @Override
   public void method_25426() {
      this.N = this.method_37063(class02091.N(this.field_22785, this.field_22793, 12).y(this.field_22793.N(this.field_22785)).N());
      this.method_48640();
   }

   @Override
   public boolean method_25422() {
      return false;
   }

   @Override
   public void method_48640() {
      if (this.N != null) {
         this.N.y(this.field_22789 / 2 - this.N.method_25368() / 2, this.field_22790 / 2 - 4);
      }
   }

   @Override
   public void method_25420(class01054 var1, int var2, int var3, float var4) {
      this.method_57728(var1, var4);
      this.method_57734(var1);
      this.method_57735(var1);
   }

   @Override
   protected boolean method_48262() {
      return false;
   }
}
