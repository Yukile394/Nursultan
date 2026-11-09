package minecraft;

import org.jspecify.annotations.Nullable;

public class class01860 extends class06478 {
   private final class01590 N;

   public class01860(class01590 var1, class00392 var2) {
      super(0, 0, var1.N(var2), 27, var2);
      this.N = var1;
   }

   @Nullable
   @Override
   public class02106 method_48205(class02089 var1) {
      return null;
   }

   @Override
   public boolean method_37303() {
      return false;
   }

   @Override
   protected void method_47399(class03428 var1) {
   }

   @Override
   public void method_25354(class09033 var1) {
   }

   @Override
   protected void method_48579(class01054 var1, int var2, int var3, float var4) {
      int i = this.method_46426() + this.method_25368() / 2;
      int j = this.method_46427() + this.method_25364() / 2;
      class00392 class00392 = this.method_25369();
      var1.y(this.N, class00392, i - this.N.N(class00392) / 2, j - 9, -1);
      String s = class04452.N(class07536.L());
      var1.y(this.N, s, i - this.N.y(s) / 2, j + 9, -8355712);
   }
}
